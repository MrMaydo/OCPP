package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.Enumerations.DataEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.Objects;


/**
 * Fixed read-only parameters of a variable.
 */
public class VariableCharacteristics implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
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
     * Allowed values when variable is Option/Member/SequenceList.
     * <p>
     * * OptionList: The (Actual) Variable value must be a single value from the reported (CSV) enumeration list.
     * <p>
     * * MemberList: The (Actual) Variable value  may be an (unordered) (sub-)set of the reported (CSV) valid values list.
     * <p>
     * * SequenceList: The (Actual) Variable value  may be an ordered (priority, etc)  (sub-)set of the reported (CSV) valid values.
     * <p>
     * This is a comma separated list.
     * <p>
     * The Configuration Variable &lt;&lt;configkey-configuration-value-size,ConfigurationValueSize&gt;&gt; can be used to limit SetVariableData.attributeValue and VariableCharacteristics.valueList. The max size of these values will always remain equal.
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
    public CustomData getCustomData() {
        return customData;
    }

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    public void setCustomData(CustomData customData) {
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
     * Allowed values when variable is Option/Member/SequenceList.
     * <p>
     * * OptionList: The (Actual) Variable value must be a single value from the reported (CSV) enumeration list.
     * <p>
     * * MemberList: The (Actual) Variable value  may be an (unordered) (sub-)set of the reported (CSV) valid values list.
     * <p>
     * * SequenceList: The (Actual) Variable value  may be an ordered (priority, etc)  (sub-)set of the reported (CSV) valid values.
     * <p>
     * This is a comma separated list.
     * <p>
     * The Configuration Variable &lt;&lt;configkey-configuration-value-size,ConfigurationValueSize&gt;&gt; can be used to limit SetVariableData.attributeValue and VariableCharacteristics.valueList. The max size of these values will always remain equal.
     */
    public String getValuesList() {
        return valuesList;
    }

    /**
     * Allowed values when variable is Option/Member/SequenceList.
     * <p>
     * * OptionList: The (Actual) Variable value must be a single value from the reported (CSV) enumeration list.
     * <p>
     * * MemberList: The (Actual) Variable value  may be an (unordered) (sub-)set of the reported (CSV) valid values list.
     * <p>
     * * SequenceList: The (Actual) Variable value  may be an ordered (priority, etc)  (sub-)set of the reported (CSV) valid values.
     * <p>
     * This is a comma separated list.
     * <p>
     * The Configuration Variable &lt;&lt;configkey-configuration-value-size,ConfigurationValueSize&gt;&gt; can be used to limit SetVariableData.attributeValue and VariableCharacteristics.valueList. The max size of these values will always remain equal.
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

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject() {
        return JsonTools.toJsonObject(this);
    }

    @Override
    public void fromString(String jsonString) {
        JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
        fromJsonObject(jsonObject);
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        JsonTools.fromJsonObject(this, jsonObject);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof VariableCharacteristics))
            return false;
        VariableCharacteristics that = (VariableCharacteristics) obj;
        return Objects.equals(customData, that.customData)
                && Objects.equals(unit, that.unit)
                && dataType == that.dataType
                && Objects.equals(minLimit, that.minLimit)
                && Objects.equals(maxLimit, that.maxLimit)
                && Objects.equals(valuesList, that.valuesList)
                && Objects.equals(supportsMonitoring, that.supportsMonitoring);
    }

    @Override
    public int hashCode() {
        int result = (unit != null ? unit.hashCode() : 0);
        result = 31 * result + (dataType != null ? dataType.hashCode() : 0);
        result = 31 * result + (minLimit != null ? minLimit.hashCode() : 0);
        result = 31 * result + (maxLimit != null ? maxLimit.hashCode() : 0);
        result = 31 * result + (valuesList != null ? valuesList.hashCode() : 0);
        result = 31 * result + (supportsMonitoring != null ? supportsMonitoring.hashCode() : 0);
        result = 31 * result + (customData != null ? customData.hashCode() : 0);
        return result;
    }
}
