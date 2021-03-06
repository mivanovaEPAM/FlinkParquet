/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package yigitbasi.nezih.model;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Inspection extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Inspection\",\"namespace\":\"yigitbasi.nezih.model\",\"fields\":[{\"name\":\"businessId\",\"type\":\"int\"},{\"name\":\"score\",\"type\":\"int\"},{\"name\":\"date\",\"type\":\"string\"},{\"name\":\"type\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public int businessId;
  @Deprecated public int score;
  @Deprecated public java.lang.CharSequence date;
  @Deprecated public java.lang.CharSequence type;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Inspection() {}

  /**
   * All-args constructor.
   */
  public Inspection(java.lang.Integer businessId, java.lang.Integer score, java.lang.CharSequence date, java.lang.CharSequence type) {
    this.businessId = businessId;
    this.score = score;
    this.date = date;
    this.type = type;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return businessId;
    case 1: return score;
    case 2: return date;
    case 3: return type;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: businessId = (java.lang.Integer)value$; break;
    case 1: score = (java.lang.Integer)value$; break;
    case 2: date = (java.lang.CharSequence)value$; break;
    case 3: type = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'businessId' field.
   */
  public java.lang.Integer getBusinessId() {
    return businessId;
  }

  /**
   * Sets the value of the 'businessId' field.
   * @param value the value to set.
   */
  public void setBusinessId(java.lang.Integer value) {
    this.businessId = value;
  }

  /**
   * Gets the value of the 'score' field.
   */
  public java.lang.Integer getScore() {
    return score;
  }

  /**
   * Sets the value of the 'score' field.
   * @param value the value to set.
   */
  public void setScore(java.lang.Integer value) {
    this.score = value;
  }

  /**
   * Gets the value of the 'date' field.
   */
  public java.lang.CharSequence getDate() {
    return date;
  }

  /**
   * Sets the value of the 'date' field.
   * @param value the value to set.
   */
  public void setDate(java.lang.CharSequence value) {
    this.date = value;
  }

  /**
   * Gets the value of the 'type' field.
   */
  public java.lang.CharSequence getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * @param value the value to set.
   */
  public void setType(java.lang.CharSequence value) {
    this.type = value;
  }

  /** Creates a new Inspection RecordBuilder */
  public static yigitbasi.nezih.model.Inspection.Builder newBuilder() {
    return new yigitbasi.nezih.model.Inspection.Builder();
  }
  
  /** Creates a new Inspection RecordBuilder by copying an existing Builder */
  public static yigitbasi.nezih.model.Inspection.Builder newBuilder(yigitbasi.nezih.model.Inspection.Builder other) {
    return new yigitbasi.nezih.model.Inspection.Builder(other);
  }
  
  /** Creates a new Inspection RecordBuilder by copying an existing Inspection instance */
  public static yigitbasi.nezih.model.Inspection.Builder newBuilder(yigitbasi.nezih.model.Inspection other) {
    return new yigitbasi.nezih.model.Inspection.Builder(other);
  }
  
  /**
   * RecordBuilder for Inspection instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Inspection>
    implements org.apache.avro.data.RecordBuilder<Inspection> {

    private int businessId;
    private int score;
    private java.lang.CharSequence date;
    private java.lang.CharSequence type;

    /** Creates a new Builder */
    private Builder() {
      super(yigitbasi.nezih.model.Inspection.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(yigitbasi.nezih.model.Inspection.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.businessId)) {
        this.businessId = data().deepCopy(fields()[0].schema(), other.businessId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.score)) {
        this.score = data().deepCopy(fields()[1].schema(), other.score);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.date)) {
        this.date = data().deepCopy(fields()[2].schema(), other.date);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.type)) {
        this.type = data().deepCopy(fields()[3].schema(), other.type);
        fieldSetFlags()[3] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Inspection instance */
    private Builder(yigitbasi.nezih.model.Inspection other) {
            super(yigitbasi.nezih.model.Inspection.SCHEMA$);
      if (isValidValue(fields()[0], other.businessId)) {
        this.businessId = data().deepCopy(fields()[0].schema(), other.businessId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.score)) {
        this.score = data().deepCopy(fields()[1].schema(), other.score);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.date)) {
        this.date = data().deepCopy(fields()[2].schema(), other.date);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.type)) {
        this.type = data().deepCopy(fields()[3].schema(), other.type);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'businessId' field */
    public java.lang.Integer getBusinessId() {
      return businessId;
    }
    
    /** Sets the value of the 'businessId' field */
    public yigitbasi.nezih.model.Inspection.Builder setBusinessId(int value) {
      validate(fields()[0], value);
      this.businessId = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'businessId' field has been set */
    public boolean hasBusinessId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'businessId' field */
    public yigitbasi.nezih.model.Inspection.Builder clearBusinessId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'score' field */
    public java.lang.Integer getScore() {
      return score;
    }
    
    /** Sets the value of the 'score' field */
    public yigitbasi.nezih.model.Inspection.Builder setScore(int value) {
      validate(fields()[1], value);
      this.score = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'score' field has been set */
    public boolean hasScore() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'score' field */
    public yigitbasi.nezih.model.Inspection.Builder clearScore() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'date' field */
    public java.lang.CharSequence getDate() {
      return date;
    }
    
    /** Sets the value of the 'date' field */
    public yigitbasi.nezih.model.Inspection.Builder setDate(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.date = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'date' field has been set */
    public boolean hasDate() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'date' field */
    public yigitbasi.nezih.model.Inspection.Builder clearDate() {
      date = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'type' field */
    public java.lang.CharSequence getType() {
      return type;
    }
    
    /** Sets the value of the 'type' field */
    public yigitbasi.nezih.model.Inspection.Builder setType(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.type = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'type' field has been set */
    public boolean hasType() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'type' field */
    public yigitbasi.nezih.model.Inspection.Builder clearType() {
      type = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public Inspection build() {
      try {
        Inspection record = new Inspection();
        record.businessId = fieldSetFlags()[0] ? this.businessId : (java.lang.Integer) defaultValue(fields()[0]);
        record.score = fieldSetFlags()[1] ? this.score : (java.lang.Integer) defaultValue(fields()[1]);
        record.date = fieldSetFlags()[2] ? this.date : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.type = fieldSetFlags()[3] ? this.type : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
