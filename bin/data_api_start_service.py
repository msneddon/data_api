#!/usr/bin/env python

# stdlib
import argparse
import ConfigParser
import logging
import logging.config
import os
import sys
import time

# 3rd party
import lockfile
from lockfile import pidlockfile
import yaml

# local
from doekbase.data_api import cache
from doekbase.data_api.util import log_event, log_start, log_end
import doekbase.data_api.util

# Constants
SERVICE_NAMES = ["object", "taxon", "assembly", "genome_annotation"]
KBASE_TARGETS = ["prod", "next", "ci", "localhost", "dir_cache", "dir_nocache"]

# Global variables
pidfile = None
doekbase.data_api.util.include_timestamp = False
_log = None

# Functions and classes

def acquire_pidfile(pidfilename):
    pf = pidlockfile.PIDLockFile(pidfilename, timeout=-1)
    try:
        pf.acquire()
    except lockfile.Error as err:
        _log.error('Unable to acquire PID file "{}": {}'
                   .format(pidfilename, err))
        raise
    return pf

def release_pidfile(pf):
    try:
        pf.release()
    except lockfile.Error as err:
        _log.warn('Unable to release PID file "{}": {}'
                  .format(pf.path, err))

def configure_logging(main_config, logging_config):
    """Configure logging from a file.

    Args:
        main_config: Main configuration file
        logging_config: Optional logging configuration file

    Returns:
        Filename of the file used

    Raises:
        IOError: if file is not found, or bad format, or has bad contents
    """
    assert len(main_config)
    _op = os.path  # shortened alias
    cfgfile, cfgtype = None, None
    if logging_config is None:
        main_dir = _op.dirname(_op.realpath(main_config))
        f = _op.join(main_dir, 'logging.conf')
        if _op.exists(f):
            cfgfile = f
    else:
        if _op.exists(logging_config):
            cfgfile = logging_config
        else:
            raise IOError(
                    'Cannot open configuration file "{}"'.format(
                            logging_config))
    # do a basic config, and return if no config file found
    if cfgfile is None:
        logging.basicConfig()
        root = logging.getLogger()
        root.setLevel(logging.INFO)
        root.warn('Cannot find configuration file. Doing a basic config.')
        return '<basic>'
    # configure from YAML or ConfigParser file
    try:
        is_yaml = False
        try:
            cfgdict = yaml.load(open(cfgfile, 'r'))
            is_yaml = True
            logging.config.dictConfig(cfgdict)
        except yaml.error.YAMLError:
            pass
        if not is_yaml:
            try:
                logging.config.fileConfig(cfgfile)
            except ConfigParser.Error:
                raise IOError('Cannot parse configuration file "{}" '
                              'as either YAML or ConfigParse format'.format(
                        cfgfile))
    except Exception as err:
        raise IOError('Error configuring from file "{}": {}'.format(
                cfgfile, err))
    return cfgfile

def main():
    global pidfile, _log
    parser = argparse.ArgumentParser()
    parser.add_argument("--config", help="path to configuration file",
                        required=True)
    parser.add_argument("--log-config", default=None, dest='log_config',
                        help="path to logging configuration file (default"
                             "='logging.conf' in same directory as main "
                             "configuration file)")
    parser.add_argument("--service",
                        help="service name to start, one of {}".format(
                                SERVICE_NAMES),
                        required=True)
    parser.add_argument("--port", help="port to listen on", type=int)
    parser.add_argument("--kbase_url",
                        help="prod, next, ci, localhost, dir_cache, dir_nocache",
                        default="dir_nocache")
    parser.add_argument("--pidfile", help="path to pidfile to use")
    parser.add_argument('--verbose', '-v', dest='vb', action="count", default=1,
                        help="Print more verbose messages to standard error. "
                             "Repeatable. (default=INFO)")

    args = parser.parse_args()

    config = ConfigParser.ConfigParser()
    if args.config:
        config.read(args.config)

    try:
        logcfg = configure_logging(args.config, args.log_config)
    except IOError as err:
        parser.error('Logging configuration: {}'.format(err))
    # Init logging within this program
    _log = doekbase.data_api.util.get_logger('data_api_start_service')
    verbosity = (logging.ERROR, logging.INFO, logging.DEBUG)[min(args.vb, 2)]
    _log.setLevel(verbosity)
    # from logging_tree import printout
    # printout()
    log_event(_log, 'configured logging', kvp=dict(file=logcfg))

    if args.kbase_url not in KBASE_TARGETS:
        parser.error('unrecognized KBase url: {}'.format(args.kbase_url))

    if args.service not in SERVICE_NAMES:
        parser.error('unrecognized service name: {}'.format(args.service))

    service_name = args.service
    global_stanza_name = 'data_api' + ".kbase." + args.kbase_url
    service_stanza_name = service_name + '_api'

    # set defaults if nothing is set anywhere
    services = None
    pidfilename = service_name + "API.pid"
    service_port = None
    redis_host = None
    redis_port = None

    # Read and process main configuration
    cfg_t0 = log_start(_log, 'configure', kvp=dict(file=args.config))
    if config.has_section(global_stanza_name):
        log_event(_log, 'read global stanza', kvp=dict(file=args.config,
                                                       stanza=global_stanza_name))
        services = {
            'workspace_service_url': config.get(global_stanza_name,
                                                'workspace_service_url'),
            'shock_service_url'    : config.get(global_stanza_name,
                                                'shock_service_url'),
            'handle_service_url'   : config.get(global_stanza_name,
                                                'handle_service_url')
        }

        try:
            redis_host = config.get(global_stanza_name, 'redis_host')
            redis_port = config.get(global_stanza_name, 'redis_port')
        except ConfigParser.Error, e:
            redis_host = None
            redis_port = None
    if config.has_section(service_stanza_name):
        _log.info("Reading service:'{}', config:'{}', stanza:'{}'".format(
                service_name, args.config, service_stanza_name))
        if config.has_option(service_stanza_name, 'service-port'):
            service_port = config.getint(service_stanza_name, 'service-port')
        if config.has_option(service_stanza_name, 'pidfile'):
            pidfilename = config.get(service_stanza_name, 'pidfile')
    # let command line override config file
    if args.pidfile:
        pidfilename = args.pidfile
    if args.port:
        service_port = args.port
    # check configured values
    if service_port is None:
        _log.error("Service port not defined!")
        return 1
    log_end(_log, cfg_t0, 'configure', kvp=dict(file=args.config))

    # Redis
    if redis_host is not None and redis_port is not None:
        log_event(_log, 'activating REDIS',
                  kvp=dict(host=redis_host, port=redis_port))
        cache.ObjectCache.cache_class = cache.RedisCache
        cache.ObjectCache.cache_params = {'redis_host': redis_host,
                                          'redis_port': redis_port}

    # PID file
    try:
        pidfile = acquire_pidfile(pidfilename)
    except lockfile.Error:
        return 1

    # Start services
    t0, service_info = time.time(), {'port': service_port, 'pid': os.getpid()}
    log_start(_log, service_name, kvp=service_info)
    try:
        if service_name == "taxon":
            from doekbase.data_api.taxonomy.taxon.service import driver
        elif service_name == "assembly":
            from doekbase.data_api.sequence.assembly.service import driver
        elif service_name == "genome_annotation":
            from doekbase.data_api.annotation.genome_annotation.service import \
                driver
        else:
            raise Exception("Service not activated: {}".format(service_name))

        driver.start_service(services=services, port=service_port, host='')
    finally:
        release_pidfile(pidfile)
        log_end(_log, t0, service_name, kvp=service_info)

if __name__ == "__main__":
    sys.exit(main())
