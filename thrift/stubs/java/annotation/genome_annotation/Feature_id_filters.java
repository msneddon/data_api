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
 * Filters passed to :meth:`get_feature_ids`
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-7-31")
public class Feature_id_filters implements org.apache.thrift.TBase<Feature_id_filters, Feature_id_filters._Fields>, java.io.Serializable, Cloneable, Comparable<Feature_id_filters> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Feature_id_filters");

  private static final org.apache.thrift.protocol.TField TYPE_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("type_list", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField REGION_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("region_list", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField FUNCTION_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("function_list", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField ALIAS_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("alias_list", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new Feature_id_filtersStandardSchemeFactory());
    schemes.put(TupleScheme.class, new Feature_id_filtersTupleSchemeFactory());
  }

  /**
   * List of Feature type strings.
   */
  public List<String> type_list; // required
  /**
   * List of region specs.
   * For example::
   *     [{"contig_id": str, "strand": "+"|"-",
   *       "start": int, "length": int},...]
   * 
   * The Feature sequence begin and end are calculated as follows:
   *   - [start, start) for "+" strand
   *   - (start - length, start] for "-" strand
   */
  public List<Region> region_list; // required
  /**
   * List of function strings.
   */
  public List<String> function_list; // required
  /**
   * List of alias strings.
   */
  public List<String> alias_list; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * List of Feature type strings.
     */
    TYPE_LIST((short)1, "type_list"),
    /**
     * List of region specs.
     * For example::
     *     [{"contig_id": str, "strand": "+"|"-",
     *       "start": int, "length": int},...]
     * 
     * The Feature sequence begin and end are calculated as follows:
     *   - [start, start) for "+" strand
     *   - (start - length, start] for "-" strand
     */
    REGION_LIST((short)2, "region_list"),
    /**
     * List of function strings.
     */
    FUNCTION_LIST((short)3, "function_list"),
    /**
     * List of alias strings.
     */
    ALIAS_LIST((short)4, "alias_list");

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
        case 1: // TYPE_LIST
          return TYPE_LIST;
        case 2: // REGION_LIST
          return REGION_LIST;
        case 3: // FUNCTION_LIST
          return FUNCTION_LIST;
        case 4: // ALIAS_LIST
          return ALIAS_LIST;
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
    tmpMap.put(_Fields.TYPE_LIST, new org.apache.thrift.meta_data.FieldMetaData("type_list", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.REGION_LIST, new org.apache.thrift.meta_data.FieldMetaData("region_list", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Region.class))));
    tmpMap.put(_Fields.FUNCTION_LIST, new org.apache.thrift.meta_data.FieldMetaData("function_list", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.ALIAS_LIST, new org.apache.thrift.meta_data.FieldMetaData("alias_list", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Feature_id_filters.class, metaDataMap);
  }

  public Feature_id_filters() {
    this.type_list = new ArrayList<String>();

    this.region_list = new ArrayList<Region>();

    this.function_list = new ArrayList<String>();

    this.alias_list = new ArrayList<String>();

  }

  public Feature_id_filters(
    List<String> type_list,
    List<Region> region_list,
    List<String> function_list,
    List<String> alias_list)
  {
    this();
    this.type_list = type_list;
    this.region_list = region_list;
    this.function_list = function_list;
    this.alias_list = alias_list;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Feature_id_filters(Feature_id_filters other) {
    if (other.isSetType_list()) {
      List<String> __this__type_list = new ArrayList<String>(other.type_list);
      this.type_list = __this__type_list;
    }
    if (other.isSetRegion_list()) {
      List<Region> __this__region_list = new ArrayList<Region>(other.region_list.size());
      for (Region other_element : other.region_list) {
        __this__region_list.add(new Region(other_element));
      }
      this.region_list = __this__region_list;
    }
    if (other.isSetFunction_list()) {
      List<String> __this__function_list = new ArrayList<String>(other.function_list);
      this.function_list = __this__function_list;
    }
    if (other.isSetAlias_list()) {
      List<String> __this__alias_list = new ArrayList<String>(other.alias_list);
      this.alias_list = __this__alias_list;
    }
  }

  public Feature_id_filters deepCopy() {
    return new Feature_id_filters(this);
  }

  @Override
  public void clear() {
    this.type_list = new ArrayList<String>();

    this.region_list = new ArrayList<Region>();

    this.function_list = new ArrayList<String>();

    this.alias_list = new ArrayList<String>();

  }

  public int getType_listSize() {
    return (this.type_list == null) ? 0 : this.type_list.size();
  }

  public java.util.Iterator<String> getType_listIterator() {
    return (this.type_list == null) ? null : this.type_list.iterator();
  }

  public void addToType_list(String elem) {
    if (this.type_list == null) {
      this.type_list = new ArrayList<String>();
    }
    this.type_list.add(elem);
  }

  /**
   * List of Feature type strings.
   */
  public List<String> getType_list() {
    return this.type_list;
  }

  /**
   * List of Feature type strings.
   */
  public Feature_id_filters setType_list(List<String> type_list) {
    this.type_list = type_list;
    return this;
  }

  public void unsetType_list() {
    this.type_list = null;
  }

  /** Returns true if field type_list is set (has been assigned a value) and false otherwise */
  public boolean isSetType_list() {
    return this.type_list != null;
  }

  public void setType_listIsSet(boolean value) {
    if (!value) {
      this.type_list = null;
    }
  }

  public int getRegion_listSize() {
    return (this.region_list == null) ? 0 : this.region_list.size();
  }

  public java.util.Iterator<Region> getRegion_listIterator() {
    return (this.region_list == null) ? null : this.region_list.iterator();
  }

  public void addToRegion_list(Region elem) {
    if (this.region_list == null) {
      this.region_list = new ArrayList<Region>();
    }
    this.region_list.add(elem);
  }

  /**
   * List of region specs.
   * For example::
   *     [{"contig_id": str, "strand": "+"|"-",
   *       "start": int, "length": int},...]
   * 
   * The Feature sequence begin and end are calculated as follows:
   *   - [start, start) for "+" strand
   *   - (start - length, start] for "-" strand
   */
  public List<Region> getRegion_list() {
    return this.region_list;
  }

  /**
   * List of region specs.
   * For example::
   *     [{"contig_id": str, "strand": "+"|"-",
   *       "start": int, "length": int},...]
   * 
   * The Feature sequence begin and end are calculated as follows:
   *   - [start, start) for "+" strand
   *   - (start - length, start] for "-" strand
   */
  public Feature_id_filters setRegion_list(List<Region> region_list) {
    this.region_list = region_list;
    return this;
  }

  public void unsetRegion_list() {
    this.region_list = null;
  }

  /** Returns true if field region_list is set (has been assigned a value) and false otherwise */
  public boolean isSetRegion_list() {
    return this.region_list != null;
  }

  public void setRegion_listIsSet(boolean value) {
    if (!value) {
      this.region_list = null;
    }
  }

  public int getFunction_listSize() {
    return (this.function_list == null) ? 0 : this.function_list.size();
  }

  public java.util.Iterator<String> getFunction_listIterator() {
    return (this.function_list == null) ? null : this.function_list.iterator();
  }

  public void addToFunction_list(String elem) {
    if (this.function_list == null) {
      this.function_list = new ArrayList<String>();
    }
    this.function_list.add(elem);
  }

  /**
   * List of function strings.
   */
  public List<String> getFunction_list() {
    return this.function_list;
  }

  /**
   * List of function strings.
   */
  public Feature_id_filters setFunction_list(List<String> function_list) {
    this.function_list = function_list;
    return this;
  }

  public void unsetFunction_list() {
    this.function_list = null;
  }

  /** Returns true if field function_list is set (has been assigned a value) and false otherwise */
  public boolean isSetFunction_list() {
    return this.function_list != null;
  }

  public void setFunction_listIsSet(boolean value) {
    if (!value) {
      this.function_list = null;
    }
  }

  public int getAlias_listSize() {
    return (this.alias_list == null) ? 0 : this.alias_list.size();
  }

  public java.util.Iterator<String> getAlias_listIterator() {
    return (this.alias_list == null) ? null : this.alias_list.iterator();
  }

  public void addToAlias_list(String elem) {
    if (this.alias_list == null) {
      this.alias_list = new ArrayList<String>();
    }
    this.alias_list.add(elem);
  }

  /**
   * List of alias strings.
   */
  public List<String> getAlias_list() {
    return this.alias_list;
  }

  /**
   * List of alias strings.
   */
  public Feature_id_filters setAlias_list(List<String> alias_list) {
    this.alias_list = alias_list;
    return this;
  }

  public void unsetAlias_list() {
    this.alias_list = null;
  }

  /** Returns true if field alias_list is set (has been assigned a value) and false otherwise */
  public boolean isSetAlias_list() {
    return this.alias_list != null;
  }

  public void setAlias_listIsSet(boolean value) {
    if (!value) {
      this.alias_list = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TYPE_LIST:
      if (value == null) {
        unsetType_list();
      } else {
        setType_list((List<String>)value);
      }
      break;

    case REGION_LIST:
      if (value == null) {
        unsetRegion_list();
      } else {
        setRegion_list((List<Region>)value);
      }
      break;

    case FUNCTION_LIST:
      if (value == null) {
        unsetFunction_list();
      } else {
        setFunction_list((List<String>)value);
      }
      break;

    case ALIAS_LIST:
      if (value == null) {
        unsetAlias_list();
      } else {
        setAlias_list((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TYPE_LIST:
      return getType_list();

    case REGION_LIST:
      return getRegion_list();

    case FUNCTION_LIST:
      return getFunction_list();

    case ALIAS_LIST:
      return getAlias_list();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TYPE_LIST:
      return isSetType_list();
    case REGION_LIST:
      return isSetRegion_list();
    case FUNCTION_LIST:
      return isSetFunction_list();
    case ALIAS_LIST:
      return isSetAlias_list();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Feature_id_filters)
      return this.equals((Feature_id_filters)that);
    return false;
  }

  public boolean equals(Feature_id_filters that) {
    if (that == null)
      return false;

    boolean this_present_type_list = true && this.isSetType_list();
    boolean that_present_type_list = true && that.isSetType_list();
    if (this_present_type_list || that_present_type_list) {
      if (!(this_present_type_list && that_present_type_list))
        return false;
      if (!this.type_list.equals(that.type_list))
        return false;
    }

    boolean this_present_region_list = true && this.isSetRegion_list();
    boolean that_present_region_list = true && that.isSetRegion_list();
    if (this_present_region_list || that_present_region_list) {
      if (!(this_present_region_list && that_present_region_list))
        return false;
      if (!this.region_list.equals(that.region_list))
        return false;
    }

    boolean this_present_function_list = true && this.isSetFunction_list();
    boolean that_present_function_list = true && that.isSetFunction_list();
    if (this_present_function_list || that_present_function_list) {
      if (!(this_present_function_list && that_present_function_list))
        return false;
      if (!this.function_list.equals(that.function_list))
        return false;
    }

    boolean this_present_alias_list = true && this.isSetAlias_list();
    boolean that_present_alias_list = true && that.isSetAlias_list();
    if (this_present_alias_list || that_present_alias_list) {
      if (!(this_present_alias_list && that_present_alias_list))
        return false;
      if (!this.alias_list.equals(that.alias_list))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_type_list = true && (isSetType_list());
    list.add(present_type_list);
    if (present_type_list)
      list.add(type_list);

    boolean present_region_list = true && (isSetRegion_list());
    list.add(present_region_list);
    if (present_region_list)
      list.add(region_list);

    boolean present_function_list = true && (isSetFunction_list());
    list.add(present_function_list);
    if (present_function_list)
      list.add(function_list);

    boolean present_alias_list = true && (isSetAlias_list());
    list.add(present_alias_list);
    if (present_alias_list)
      list.add(alias_list);

    return list.hashCode();
  }

  @Override
  public int compareTo(Feature_id_filters other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetType_list()).compareTo(other.isSetType_list());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType_list()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type_list, other.type_list);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRegion_list()).compareTo(other.isSetRegion_list());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRegion_list()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.region_list, other.region_list);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFunction_list()).compareTo(other.isSetFunction_list());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFunction_list()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.function_list, other.function_list);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAlias_list()).compareTo(other.isSetAlias_list());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAlias_list()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.alias_list, other.alias_list);
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
    StringBuilder sb = new StringBuilder("Feature_id_filters(");
    boolean first = true;

    sb.append("type_list:");
    if (this.type_list == null) {
      sb.append("null");
    } else {
      sb.append(this.type_list);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("region_list:");
    if (this.region_list == null) {
      sb.append("null");
    } else {
      sb.append(this.region_list);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("function_list:");
    if (this.function_list == null) {
      sb.append("null");
    } else {
      sb.append(this.function_list);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("alias_list:");
    if (this.alias_list == null) {
      sb.append("null");
    } else {
      sb.append(this.alias_list);
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

  private static class Feature_id_filtersStandardSchemeFactory implements SchemeFactory {
    public Feature_id_filtersStandardScheme getScheme() {
      return new Feature_id_filtersStandardScheme();
    }
  }

  private static class Feature_id_filtersStandardScheme extends StandardScheme<Feature_id_filters> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Feature_id_filters struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TYPE_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list18 = iprot.readListBegin();
                struct.type_list = new ArrayList<String>(_list18.size);
                String _elem19;
                for (int _i20 = 0; _i20 < _list18.size; ++_i20)
                {
                  _elem19 = iprot.readString();
                  struct.type_list.add(_elem19);
                }
                iprot.readListEnd();
              }
              struct.setType_listIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // REGION_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list21 = iprot.readListBegin();
                struct.region_list = new ArrayList<Region>(_list21.size);
                Region _elem22;
                for (int _i23 = 0; _i23 < _list21.size; ++_i23)
                {
                  _elem22 = new Region();
                  _elem22.read(iprot);
                  struct.region_list.add(_elem22);
                }
                iprot.readListEnd();
              }
              struct.setRegion_listIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // FUNCTION_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list24 = iprot.readListBegin();
                struct.function_list = new ArrayList<String>(_list24.size);
                String _elem25;
                for (int _i26 = 0; _i26 < _list24.size; ++_i26)
                {
                  _elem25 = iprot.readString();
                  struct.function_list.add(_elem25);
                }
                iprot.readListEnd();
              }
              struct.setFunction_listIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ALIAS_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list27 = iprot.readListBegin();
                struct.alias_list = new ArrayList<String>(_list27.size);
                String _elem28;
                for (int _i29 = 0; _i29 < _list27.size; ++_i29)
                {
                  _elem28 = iprot.readString();
                  struct.alias_list.add(_elem28);
                }
                iprot.readListEnd();
              }
              struct.setAlias_listIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Feature_id_filters struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.type_list != null) {
        oprot.writeFieldBegin(TYPE_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.type_list.size()));
          for (String _iter30 : struct.type_list)
          {
            oprot.writeString(_iter30);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.region_list != null) {
        oprot.writeFieldBegin(REGION_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.region_list.size()));
          for (Region _iter31 : struct.region_list)
          {
            _iter31.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.function_list != null) {
        oprot.writeFieldBegin(FUNCTION_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.function_list.size()));
          for (String _iter32 : struct.function_list)
          {
            oprot.writeString(_iter32);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.alias_list != null) {
        oprot.writeFieldBegin(ALIAS_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.alias_list.size()));
          for (String _iter33 : struct.alias_list)
          {
            oprot.writeString(_iter33);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class Feature_id_filtersTupleSchemeFactory implements SchemeFactory {
    public Feature_id_filtersTupleScheme getScheme() {
      return new Feature_id_filtersTupleScheme();
    }
  }

  private static class Feature_id_filtersTupleScheme extends TupleScheme<Feature_id_filters> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Feature_id_filters struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetType_list()) {
        optionals.set(0);
      }
      if (struct.isSetRegion_list()) {
        optionals.set(1);
      }
      if (struct.isSetFunction_list()) {
        optionals.set(2);
      }
      if (struct.isSetAlias_list()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetType_list()) {
        {
          oprot.writeI32(struct.type_list.size());
          for (String _iter34 : struct.type_list)
          {
            oprot.writeString(_iter34);
          }
        }
      }
      if (struct.isSetRegion_list()) {
        {
          oprot.writeI32(struct.region_list.size());
          for (Region _iter35 : struct.region_list)
          {
            _iter35.write(oprot);
          }
        }
      }
      if (struct.isSetFunction_list()) {
        {
          oprot.writeI32(struct.function_list.size());
          for (String _iter36 : struct.function_list)
          {
            oprot.writeString(_iter36);
          }
        }
      }
      if (struct.isSetAlias_list()) {
        {
          oprot.writeI32(struct.alias_list.size());
          for (String _iter37 : struct.alias_list)
          {
            oprot.writeString(_iter37);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Feature_id_filters struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list38 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.type_list = new ArrayList<String>(_list38.size);
          String _elem39;
          for (int _i40 = 0; _i40 < _list38.size; ++_i40)
          {
            _elem39 = iprot.readString();
            struct.type_list.add(_elem39);
          }
        }
        struct.setType_listIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list41 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.region_list = new ArrayList<Region>(_list41.size);
          Region _elem42;
          for (int _i43 = 0; _i43 < _list41.size; ++_i43)
          {
            _elem42 = new Region();
            _elem42.read(iprot);
            struct.region_list.add(_elem42);
          }
        }
        struct.setRegion_listIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list44 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.function_list = new ArrayList<String>(_list44.size);
          String _elem45;
          for (int _i46 = 0; _i46 < _list44.size; ++_i46)
          {
            _elem45 = iprot.readString();
            struct.function_list.add(_elem45);
          }
        }
        struct.setFunction_listIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list47 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.alias_list = new ArrayList<String>(_list47.size);
          String _elem48;
          for (int _i49 = 0; _i49 < _list47.size; ++_i49)
          {
            _elem48 = iprot.readString();
            struct.alias_list.add(_elem48);
          }
        }
        struct.setAlias_listIsSet(true);
      }
    }
  }

}

