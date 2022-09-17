
package maydo.ocpp.msgDef.DataTypes;

import maydo.ocpp.msgDef.Enumerations.DataEnum;

import javax.annotation.Generated;


/**
 * Fixed read-only parameters of a variable.
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class VariableCharacteristics {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * Unit of the variable. When the transmitted value has a unit, this field SHALL be included.
     * 
     * 
     */
    private String unit;
    /**
     * Data type of this variable.
     * 
     * (Required)
     * 
     */
    private DataEnum dataType;
    /**
     * Minimum possible value of this variable.
     * 
     * 
     */
    private Float minLimit;
    /**
     * Maximum possible value of this variable. When the datatype of this Variable is String, OptionList, SequenceList or MemberList, this field defines the maximum length of the (CSV) string.
     * 
     * 
     */
    private Float maxLimit;
    /**
     * Allowed values when variable is Option/Member/SequenceList. 
     * 
     * * OptionList: The (Actual) Variable value must be a single value from the reported (CSV) enumeration list.
     * 
     * * MemberList: The (Actual) Variable value  may be an (unordered) (sub-)set of the reported (CSV) valid values list.
     * 
     * * SequenceList: The (Actual) Variable value  may be an ordered (priority, etc)  (sub-)set of the reported (CSV) valid values.
     * 
     * This is a comma separated list.
     * 
     * The Configuration Variable &lt;&lt;configkey-configuration-value-size,ConfigurationValueSize&gt;&gt; can be used to limit SetVariableData.attributeValue and VariableCharacteristics.valueList. The max size of these values will always remain equal. 
     * 
     * 
     * 
     */
    private String valuesList;
    /**
     * Flag indicating if this variable supports monitoring. 
     * 
     * (Required)
     * 
     */
    private Boolean supportsMonitoring;

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    public CustomData getCustomData() {
        return customData;
    }

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    public void setCustomData(CustomData customData) {
        this.customData = customData;
    }

    /**
     * Unit of the variable. When the transmitted value has a unit, this field SHALL be included.
     * 
     * 
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Unit of the variable. When the transmitted value has a unit, this field SHALL be included.
     * 
     * 
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * Data type of this variable.
     * 
     * (Required)
     * 
     */
    public DataEnum getDataType() {
        return dataType;
    }

    /**
     * Data type of this variable.
     * 
     * (Required)
     * 
     */
    public void setDataType(DataEnum dataType) {
        this.dataType = dataType;
    }

    /**
     * Minimum possible value of this variable.
     * 
     * 
     */
    public Float getMinLimit() {
        return minLimit;
    }

    /**
     * Minimum possible value of this variable.
     * 
     * 
     */
    public void setMinLimit(Float minLimit) {
        this.minLimit = minLimit;
    }

    /**
     * Maximum possible value of this variable. When the datatype of this Variable is String, OptionList, SequenceList or MemberList, this field defines the maximum length of the (CSV) string.
     * 
     * 
     */
    public Float getMaxLimit() {
        return maxLimit;
    }

    /**
     * Maximum possible value of this variable. When the datatype of this Variable is String, OptionList, SequenceList or MemberList, this field defines the maximum length of the (CSV) string.
     * 
     * 
     */
    public void setMaxLimit(Float maxLimit) {
        this.maxLimit = maxLimit;
    }

    /**
     * Allowed values when variable is Option/Member/SequenceList. 
     * 
     * * OptionList: The (Actual) Variable value must be a single value from the reported (CSV) enumeration list.
     * 
     * * MemberList: The (Actual) Variable value  may be an (unordered) (sub-)set of the reported (CSV) valid values list.
     * 
     * * SequenceList: The (Actual) Variable value  may be an ordered (priority, etc)  (sub-)set of the reported (CSV) valid values.
     * 
     * This is a comma separated list.
     * 
     * The Configuration Variable &lt;&lt;configkey-configuration-value-size,ConfigurationValueSize&gt;&gt; can be used to limit SetVariableData.attributeValue and VariableCharacteristics.valueList. The max size of these values will always remain equal. 
     * 
     * 
     * 
     */
    public String getValuesList() {
        return valuesList;
    }

    /**
     * Allowed values when variable is Option/Member/SequenceList. 
     * 
     * * OptionList: The (Actual) Variable value must be a single value from the reported (CSV) enumeration list.
     * 
     * * MemberList: The (Actual) Variable value  may be an (unordered) (sub-)set of the reported (CSV) valid values list.
     * 
     * * SequenceList: The (Actual) Variable value  may be an ordered (priority, etc)  (sub-)set of the reported (CSV) valid values.
     * 
     * This is a comma separated list.
     * 
     * The Configuration Variable &lt;&lt;configkey-configuration-value-size,ConfigurationValueSize&gt;&gt; can be used to limit SetVariableData.attributeValue and VariableCharacteristics.valueList. The max size of these values will always remain equal. 
     * 
     * 
     * 
     */
    public void setValuesList(String valuesList) {
        this.valuesList = valuesList;
    }

    /**
     * Flag indicating if this variable supports monitoring. 
     * 
     * (Required)
     * 
     */
    public Boolean getSupportsMonitoring() {
        return supportsMonitoring;
    }

    /**
     * Flag indicating if this variable supports monitoring. 
     * 
     * (Required)
     * 
     */
    public void setSupportsMonitoring(Boolean supportsMonitoring) {
        this.supportsMonitoring = supportsMonitoring;
    }

}
