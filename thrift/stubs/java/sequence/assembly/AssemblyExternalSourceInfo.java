/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.TreeSet;
import java.util.TreeMap;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
/**
 * Metadata about the external source of this Assembly.
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-7-8")
public class AssemblyExternalSourceInfo implements org.apache.thrift.TBase<AssemblyExternalSourceInfo, AssemblyExternalSourceInfo._Fields>, java.io.Serializable, Cloneable, Comparable<AssemblyExternalSourceInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AssemblyExternalSourceInfo");

  private static final org.apache.thrift.protocol.TField EXTERNAL_SOURCE_FIELD_DESC = new org.apache.thrift.protocol.TField("external_source", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField EXTERNAL_SOURCE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("external_source_id", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField EXTERNAL_SOURCE_ORIGINATION_DATE_FIELD_DESC = new org.apache.thrift.protocol.TField("external_source_origination_date", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AssemblyExternalSourceInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AssemblyExternalSourceInfoTupleSchemeFactory());
  }

  /**
   * Name of the external source
   */
  public String external_source; // required
  /**
   * Identifier of external source
   */
  public String external_source_id; // required
  /**
   * Origination date of external source
   */
  public String external_source_origination_date; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * Name of the external source
     */
    EXTERNAL_SOURCE((short)1, "external_source"),
    /**
     * Identifier of external source
     */
    EXTERNAL_SOURCE_ID((short)2, "external_source_id"),
    /**
     * Origination date of external source
     */
    EXTERNAL_SOURCE_ORIGINATION_DATE((short)3, "external_source_origination_date");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // EXTERNAL_SOURCE
          return EXTERNAL_SOURCE;
        case 2: // EXTERNAL_SOURCE_ID
          return EXTERNAL_SOURCE_ID;
        case 3: // EXTERNAL_SOURCE_ORIGINATION_DATE
          return EXTERNAL_SOURCE_ORIGINATION_DATE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.EXTERNAL_SOURCE, new org.apache.thrift.meta_data.FieldMetaData("external_source", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EXTERNAL_SOURCE_ID, new org.apache.thrift.meta_data.FieldMetaData("external_source_id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EXTERNAL_SOURCE_ORIGINATION_DATE, new org.apache.thrift.meta_data.FieldMetaData("external_source_origination_date", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AssemblyExternalSourceInfo.class, metaDataMap);
  }

  public AssemblyExternalSourceInfo() {
  }

  public AssemblyExternalSourceInfo(
    String external_source,
    String external_source_id,
    String external_source_origination_date)
  {
    this();
    this.external_source = external_source;
    this.external_source_id = external_source_id;
    this.external_source_origination_date = external_source_origination_date;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AssemblyExternalSourceInfo(AssemblyExternalSourceInfo other) {
    if (other.isSetExternal_source()) {
      this.external_source = other.external_source;
    }
    if (other.isSetExternal_source_id()) {
      this.external_source_id = other.external_source_id;
    }
    if (other.isSetExternal_source_origination_date()) {
      this.external_source_origination_date = other.external_source_origination_date;
    }
  }

  public AssemblyExternalSourceInfo deepCopy() {
    return new AssemblyExternalSourceInfo(this);
  }

  @Override
  public void clear() {
    this.external_source = null;
    this.external_source_id = null;
    this.external_source_origination_date = null;
  }

  /**
   * Name of the external source
   */
  public String getExternal_source() {
    return this.external_source;
  }

  /**
   * Name of the external source
   */
  public AssemblyExternalSourceInfo setExternal_source(String external_source) {
    this.external_source = external_source;
    return this;
  }

  public void unsetExternal_source() {
    this.external_source = null;
  }

  /** Returns true if field external_source is set (has been assigned a value) and false otherwise */
  public boolean isSetExternal_source() {
    return this.external_source != null;
  }

  public void setExternal_sourceIsSet(boolean value) {
    if (!value) {
      this.external_source = null;
    }
  }

  /**
   * Identifier of external source
   */
  public String getExternal_source_id() {
    return this.external_source_id;
  }

  /**
   * Identifier of external source
   */
  public AssemblyExternalSourceInfo setExternal_source_id(String external_source_id) {
    this.external_source_id = external_source_id;
    return this;
  }

  public void unsetExternal_source_id() {
    this.external_source_id = null;
  }

  /** Returns true if field external_source_id is set (has been assigned a value) and false otherwise */
  public boolean isSetExternal_source_id() {
    return this.external_source_id != null;
  }

  public void setExternal_source_idIsSet(boolean value) {
    if (!value) {
      this.external_source_id = null;
    }
  }

  /**
   * Origination date of external source
   */
  public String getExternal_source_origination_date() {
    return this.external_source_origination_date;
  }

  /**
   * Origination date of external source
   */
  public AssemblyExternalSourceInfo setExternal_source_origination_date(String external_source_origination_date) {
    this.external_source_origination_date = external_source_origination_date;
    return this;
  }

  public void unsetExternal_source_origination_date() {
    this.external_source_origination_date = null;
  }

  /** Returns true if field external_source_origination_date is set (has been assigned a value) and false otherwise */
  public boolean isSetExternal_source_origination_date() {
    return this.external_source_origination_date != null;
  }

  public void setExternal_source_origination_dateIsSet(boolean value) {
    if (!value) {
      this.external_source_origination_date = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case EXTERNAL_SOURCE:
      if (value == null) {
        unsetExternal_source();
      } else {
        setExternal_source((String)value);
      }
      break;

    case EXTERNAL_SOURCE_ID:
      if (value == null) {
        unsetExternal_source_id();
      } else {
        setExternal_source_id((String)value);
      }
      break;

    case EXTERNAL_SOURCE_ORIGINATION_DATE:
      if (value == null) {
        unsetExternal_source_origination_date();
      } else {
        setExternal_source_origination_date((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case EXTERNAL_SOURCE:
      return getExternal_source();

    case EXTERNAL_SOURCE_ID:
      return getExternal_source_id();

    case EXTERNAL_SOURCE_ORIGINATION_DATE:
      return getExternal_source_origination_date();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case EXTERNAL_SOURCE:
      return isSetExternal_source();
    case EXTERNAL_SOURCE_ID:
      return isSetExternal_source_id();
    case EXTERNAL_SOURCE_ORIGINATION_DATE:
      return isSetExternal_source_origination_date();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AssemblyExternalSourceInfo)
      return this.equals((AssemblyExternalSourceInfo)that);
    return false;
  }

  public boolean equals(AssemblyExternalSourceInfo that) {
    if (that == null)
      return false;

    boolean this_present_external_source = true && this.isSetExternal_source();
    boolean that_present_external_source = true && that.isSetExternal_source();
    if (this_present_external_source || that_present_external_source) {
      if (!(this_present_external_source && that_present_external_source))
        return false;
      if (!this.external_source.equals(that.external_source))
        return false;
    }

    boolean this_present_external_source_id = true && this.isSetExternal_source_id();
    boolean that_present_external_source_id = true && that.isSetExternal_source_id();
    if (this_present_external_source_id || that_present_external_source_id) {
      if (!(this_present_external_source_id && that_present_external_source_id))
        return false;
      if (!this.external_source_id.equals(that.external_source_id))
        return false;
    }

    boolean this_present_external_source_origination_date = true && this.isSetExternal_source_origination_date();
    boolean that_present_external_source_origination_date = true && that.isSetExternal_source_origination_date();
    if (this_present_external_source_origination_date || that_present_external_source_origination_date) {
      if (!(this_present_external_source_origination_date && that_present_external_source_origination_date))
        return false;
      if (!this.external_source_origination_date.equals(that.external_source_origination_date))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_external_source = true && (isSetExternal_source());
    list.add(present_external_source);
    if (present_external_source)
      list.add(external_source);

    boolean present_external_source_id = true && (isSetExternal_source_id());
    list.add(present_external_source_id);
    if (present_external_source_id)
      list.add(external_source_id);

    boolean present_external_source_origination_date = true && (isSetExternal_source_origination_date());
    list.add(present_external_source_origination_date);
    if (present_external_source_origination_date)
      list.add(external_source_origination_date);

    return list.hashCode();
  }

  @Override
  public int compareTo(AssemblyExternalSourceInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetExternal_source()).compareTo(other.isSetExternal_source());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExternal_source()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.external_source, other.external_source);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExternal_source_id()).compareTo(other.isSetExternal_source_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExternal_source_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.external_source_id, other.external_source_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExternal_source_origination_date()).compareTo(other.isSetExternal_source_origination_date());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExternal_source_origination_date()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.external_source_origination_date, other.external_source_origination_date);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("AssemblyExternalSourceInfo(");
    boolean first = true;

    sb.append("external_source:");
    if (this.external_source == null) {
      sb.append("null");
    } else {
      sb.append(this.external_source);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("external_source_id:");
    if (this.external_source_id == null) {
      sb.append("null");
    } else {
      sb.append(this.external_source_id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("external_source_origination_date:");
    if (this.external_source_origination_date == null) {
      sb.append("null");
    } else {
      sb.append(this.external_source_origination_date);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class AssemblyExternalSourceInfoStandardSchemeFactory implements SchemeFactory {
    public AssemblyExternalSourceInfoStandardScheme getScheme() {
      return new AssemblyExternalSourceInfoStandardScheme();
    }
  }

  private static class AssemblyExternalSourceInfoStandardScheme extends StandardScheme<AssemblyExternalSourceInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AssemblyExternalSourceInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // EXTERNAL_SOURCE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.external_source = iprot.readString();
              struct.setExternal_sourceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // EXTERNAL_SOURCE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.external_source_id = iprot.readString();
              struct.setExternal_source_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // EXTERNAL_SOURCE_ORIGINATION_DATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.external_source_origination_date = iprot.readString();
              struct.setExternal_source_origination_dateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, AssemblyExternalSourceInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.external_source != null) {
        oprot.writeFieldBegin(EXTERNAL_SOURCE_FIELD_DESC);
        oprot.writeString(struct.external_source);
        oprot.writeFieldEnd();
      }
      if (struct.external_source_id != null) {
        oprot.writeFieldBegin(EXTERNAL_SOURCE_ID_FIELD_DESC);
        oprot.writeString(struct.external_source_id);
        oprot.writeFieldEnd();
      }
      if (struct.external_source_origination_date != null) {
        oprot.writeFieldBegin(EXTERNAL_SOURCE_ORIGINATION_DATE_FIELD_DESC);
        oprot.writeString(struct.external_source_origination_date);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AssemblyExternalSourceInfoTupleSchemeFactory implements SchemeFactory {
    public AssemblyExternalSourceInfoTupleScheme getScheme() {
      return new AssemblyExternalSourceInfoTupleScheme();
    }
  }

  private static class AssemblyExternalSourceInfoTupleScheme extends TupleScheme<AssemblyExternalSourceInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AssemblyExternalSourceInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetExternal_source()) {
        optionals.set(0);
      }
      if (struct.isSetExternal_source_id()) {
        optionals.set(1);
      }
      if (struct.isSetExternal_source_origination_date()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetExternal_source()) {
        oprot.writeString(struct.external_source);
      }
      if (struct.isSetExternal_source_id()) {
        oprot.writeString(struct.external_source_id);
      }
      if (struct.isSetExternal_source_origination_date()) {
        oprot.writeString(struct.external_source_origination_date);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AssemblyExternalSourceInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.external_source = iprot.readString();
        struct.setExternal_sourceIsSet(true);
      }
      if (incoming.get(1)) {
        struct.external_source_id = iprot.readString();
        struct.setExternal_source_idIsSet(true);
      }
      if (incoming.get(2)) {
        struct.external_source_origination_date = iprot.readString();
        struct.setExternal_source_origination_dateIsSet(true);
      }
    }
  }

}

