
"""
Advanced data API examples.
"""

__author__ = 'Marcin Joachimiak <mjoachimiak@lbl.gov>'
__date__ = '11/06/15'

from doekbase.data_api.tests.examples.taxon_api import *
from doekbase.data_api.tests import shared
import doekbase.data_api.tests.examples.get_mRNAs_for_genes_to_GFF


def setup():
    shared.setup()

def test_examples():
    url = shared.services['workspace_service_url']
    get_mRNAs_for_genes_to_GFF.run(url)

