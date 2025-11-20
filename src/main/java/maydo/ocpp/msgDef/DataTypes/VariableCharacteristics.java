package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.Enumerations.DataEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class VariableCharacteristics implements JsonInterface {

    /**
     * Unit of the variable. When the transmitted value has a unit, this field SHALL be included.
     */
    @Optional
    private String unit;
    /**
     * Data type of this variable.
     * <p>
     * (Required)
     */
    @Required
    private DataEnum dataType;
    /**
     * Minimum possible value of this variable.
     */
    @Optional
    private Float minLimit;
    /**
     * Maximum possible value of this variable. When the datatype of this Variable is String, OptionList, SequenceList or MemberList, this field defines the maximum length of the (CSV) string.
     */
    @Optional
    private Float maxLimit;
    /**
     * *(2.1)* Maximum number of elements from _valuesList_ that are supported as _attributeValue_.
     */
    @Optional
    private Integer maxElements;
    /**
     * Mandatory when _dataType_ = OptionList, MemberList or SequenceList. In that case _valuesList_ specifies the allowed values for the type.
     * <p>
     * The length of this field can be limited by DeviceDataCtrlr.ConfigurationValueSize.
     * <p>
     * * OptionList: The (Actual) Variable value must be a single value from the reported (CSV) enumeration list.
     * <p>
     * * MemberList: The (Actual) Variable value  may be an (unordered) (sub-)set of the reported (CSV) valid values list.
     * <p>
     * * SequenceList: The (Actual) Variable value  may be an ordered (priority, etc)  (sub-)set of the reported (CSV) valid values.
     * <p>
     * This is a comma separated list.
     * <p>
     * The Configuration Variable &lt;&lt;configkey-configuration-value-size,ConfigurationValueSize&gt;&gt; can be used to limit SetVariableData.attributeValue and VariableCharacteristics.valuesList. The max size of these values will always remain equal.
     */
    @Optional
    private String valuesList;
    /**
     * Flag indicating if this variable supports monitoring.
     * <p>
     * (Required)
     */
    @Required
    private Boolean supportsMonitoring;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public VariableCharacteristics() {
    }

    /**
     * @param unit               Unit of the variable. When the transmitted value has a unit, this field SHALL be included.
     *                           .
     * @param valuesList         Mandatory when _dataType_ = OptionList, MemberList or SequenceList. In that case _valuesList_ specifies the allowed values for the type.
     *                           <p>
     *                           The length of this field can be limited by DeviceDataCtrlr.ConfigurationValueSize.
     *                           <p>
     *                           * OptionList: The (Actual) Variable value must be a single value from the reported (CSV) enumeration list.
     *                           <p>
     *                           * MemberList: The (Actual) Variable value  may be an (unordered) (sub-)set of the reported (CSV) valid values list.
     *                           <p>
     *                           * SequenceList: The (Actual) Variable value  may be an ordered (priority, etc)  (sub-)set of the reported (CSV) valid values.
     *                           <p>
     *                           This is a comma separated list.
     *                           <p>
     *                           The Configuration Variable &lt;&lt;configkey-configuration-value-size,ConfigurationValueSize&gt;&gt; can be used to limit SetVariableData.attributeValue and VariableCharacteristics.valuesList. The max size of these values will always remain equal.
     *                           <p>
     *                           <p>
     *                           .
     * @param supportsMonitoring Flag indicating if this variable supports monitoring.
     *                           .
     * @param maxLimit           Maximum possible value of this variable. When the datatype of this Variable is String, OptionList, SequenceList or MemberList, this field defines the maximum length of the (CSV) string.
     *                           .
     * @param maxElements        *(2.1)* Maximum number of elements from _valuesList_ that are supported as _attributeValue_.
     *                           .
     * @param minLimit           Minimum possible value of this variable.
     *                           .
     */
    public VariableCharacteristics(String unit, DataEnum dataType, Float minLimit, Float maxLimit, Integer maxElements, String valuesList, Boolean supportsMonitoring, CustomData customData) {
        super();
        this.unit = unit;
        this.dataType = dataType;
        this.minLimit = minLimit;
        this.maxLimit = maxLimit;
        this.maxElements = maxElements;
        this.valuesList = valuesList;
        this.supportsMonitoring = supportsMonitoring;
        this.customData = customData;
    }

    /**
     * Unit of the variable. When the transmitted value has a unit, this field SHALL be included.
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Unit of the variable. When the transmitted value has a unit, this field SHALL be included.
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * Data type of this variable.
     * <p>
     * (Required)
     */
    public DataEnum getDataType() {
        return dataType;
    }

    /**
     * Data type of this variable.
     * <p>
     * (Required)
     */
    public void setDataType(DataEnum dataType) {
        this.dataType = dataType;
    }

    /**
     * Minimum possible value of this variable.
     */
    public Float getMinLimit() {
        return minLimit;
    }

    /**
     * Minimum possible value of this variable.
     */
    public void setMinLimit(Float minLimit) {
        this.minLimit = minLimit;
    }

    /**
     * Maximum possible value of this variable. When the datatype of this Variable is String, OptionList, SequenceList or MemberList, this field defines the maximum length of the (CSV) string.
     */
    public Float getMaxLimit() {
        return maxLimit;
    }

    /**
     * Maximum possible value of this variable. When the datatype of this Variable is String, OptionList, SequenceList or MemberList, this field defines the maximum length of the (CSV) string.
     */
    public void setMaxLimit(Float maxLimit) {
        this.maxLimit = maxLimit;
    }

    /**
     * *(2.1)* Maximum number of elements from _valuesList_ that are supported as _attributeValue_.
     */
    public Integer getMaxElements() {
        return maxElements;
    }

    /**
     * *(2.1)* Maximum number of elements from _valuesList_ that are supported as _attributeValue_.
     */
    public void setMaxElements(Integer maxElements) {
        this.maxElements = maxElements;
    }

    /**
     * Mandatory when _dataType_ = OptionList, MemberList or SequenceList. In that case _valuesList_ specifies the allowed values for the type.
     * <p>
     * The length of this field can be limited by DeviceDataCtrlr.ConfigurationValueSize.
     * <p>
     * * OptionList: The (Actual) Variable value must be a single value from the reported (CSV) enumeration list.
     * <p>
     * * MemberList: The (Actual) Variable value  may be an (unordered) (sub-)set of the reported (CSV) valid values list.
     * <p>
     * * SequenceList: The (Actual) Variable value  may be an ordered (priority, etc)  (sub-)set of the reported (CSV) valid values.
     * <p>
     * This is a comma separated list.
     * <p>
     * The Configuration Variable &lt;&lt;configkey-configuration-value-size,ConfigurationValueSize&gt;&gt; can be used to limit SetVariableData.attributeValue and VariableCharacteristics.valuesList. The max size of these values will always remain equal.
     */
    public String getValuesList() {
        return valuesList;
    }

    /**
     * Mandatory when _dataType_ = OptionList, MemberList or SequenceList. In that case _valuesList_ specifies the allowed values for the type.
     * <p>
     * The length of this field can be limited by DeviceDataCtrlr.ConfigurationValueSize.
     * <p>
     * * OptionList: The (Actual) Variable value must be a single value from the reported (CSV) enumeration list.
     * <p>
     * * MemberList: The (Actual) Variable value  may be an (unordered) (sub-)set of the reported (CSV) valid values list.
     * <p>
     * * SequenceList: The (Actual) Variable value  may be an ordered (priority, etc)  (sub-)set of the reported (CSV) valid values.
     * <p>
     * This is a comma separated list.
     * <p>
     * The Configuration Variable &lt;&lt;configkey-configuration-value-size,ConfigurationValueSize&gt;&gt; can be used to limit SetVariableData.attributeValue and VariableCharacteristics.valuesList. The max size of these values will always remain equal.
     */
    public void setValuesList(String valuesList) {
        this.valuesList = valuesList;
    }

    /**
     * Flag indicating if this variable supports monitoring.
     * <p>
     * (Required)
     */
    public Boolean getSupportsMonitoring() {
        return supportsMonitoring;
    }

    /**
     * Flag indicating if this variable supports monitoring.
     * <p>
     * (Required)
     */
    public void setSupportsMonitoring(Boolean supportsMonitoring) {
        this.supportsMonitoring = supportsMonitoring;
    }

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    public CustomData getCustomData() {
        return customData;
    }

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    public void setCustomData(CustomData customData) {
        this.customData = customData;
    }

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject() {
        JsonObject json = new JsonObject();
        json.addProperty("unit", unit);
        json.addProperty("dataType", dataType.toString());
        json.addProperty("minLimit", minLimit);
        json.addProperty("maxLimit", maxLimit);
        json.addProperty("maxElements", maxElements);
        json.addProperty("valuesList", valuesList);
        json.addProperty("supportsMonitoring", supportsMonitoring);
        json.add("customData", customData.toJsonObject());
        return json;
    }

    @Override
    public void fromString(String jsonString) {
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof VariableCharacteristics))
            return false;
        VariableCharacteristics that = (VariableCharacteristics) obj;
        return Objects.equals(this.unit, that.unit)
                && Objects.equals(this.valuesList, that.valuesList)
                && Objects.equals(this.supportsMonitoring, that.supportsMonitoring)
                && Objects.equals(this.maxLimit, that.maxLimit)
                && Objects.equals(this.dataType, that.dataType)
                && Objects.equals(this.maxElements, that.maxElements)
                && Objects.equals(this.minLimit, that.minLimit)
                && Objects.equals(this.customData, that.customData);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.unit != null ? this.unit.hashCode() : 0);
        result = 31 * result + (this.valuesList != null ? this.valuesList.hashCode() : 0);
        result = 31 * result + (this.supportsMonitoring != null ? this.supportsMonitoring.hashCode() : 0);
        result = 31 * result + (this.maxLimit != null ? this.maxLimit.hashCode() : 0);
        result = 31 * result + (this.dataType != null ? this.dataType.hashCode() : 0);
        result = 31 * result + (this.maxElements != null ? this.maxElements.hashCode() : 0);
        result = 31 * result + (this.minLimit != null ? this.minLimit.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        return result;
    }
}
