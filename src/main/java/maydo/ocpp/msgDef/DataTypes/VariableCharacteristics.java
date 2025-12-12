package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.Enumerations.DataEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * Fixed read-only parameters of a variable.
 */
public class VariableCharacteristics implements JsonInterface {

    /**
     * Unit of the variable. When the transmitted value has a unit, this field SHALL be included.
     */
    @Optional
    private String unit;

    /**
     * Data type of this variable.
     */
    @Required
    private DataEnum dataType;

    /**
     * Minimum possible value of this variable.
     */
    @Optional
    private Float minLimit;

    /**
     * Maximum possible value of this variable.
     * When the datatype of this Variable is String, OptionList, SequenceList or MemberList,
     * this field defines the maximum length of the (CSV) string.
     */
    @Optional
    private Float maxLimit;

    /**
     * (2.1) Maximum number of elements from valuesList that are supported as attributeValue.
     */
    @Optional
    private Integer maxElements;

    /**
     * Mandatory when dataType = OptionList, MemberList or SequenceList.
     * In that case valuesList specifies the allowed values for the type.
     * The length of this field can be limited by DeviceDataCtrlr.ConfigurationValueSize.
     * <p> OptionList: The (Actual) Variable value must be a single value from the reported (CSV) enumeration list. </p>
     * <p> MemberList: The (Actual) Variable value may be an (unordered) (sub-)set of the reported (CSV) valid values list. </p>
     * <p> SequenceList: The (Actual) Variable value may be an ordered (priority, etc) (sub-)set of the reported (CSV) valid values. </p>
     * <p> This is a comma separated list. </p>
     * The Configuration Variable ConfigurationValueSize can be used to limit
     * SetVariableData.attributeValue and VariableCharacteristics.valuesList.
     * The max size of these values will always remain equal.
     */
    @Optional
    private String valuesList;

    /**
     * Flag indicating if this variable supports monitoring.
     */
    @Required
    private Boolean supportsMonitoring;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public VariableCharacteristics() {
    }


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


    public String getUnit() {
        return unit;
    }


    public void setUnit(String unit) {
        this.unit = unit;
    }


    public DataEnum getDataType() {
        return dataType;
    }


    public void setDataType(DataEnum dataType) {
        this.dataType = dataType;
    }


    public Float getMinLimit() {
        return minLimit;
    }


    public void setMinLimit(Float minLimit) {
        this.minLimit = minLimit;
    }


    public Float getMaxLimit() {
        return maxLimit;
    }


    public void setMaxLimit(Float maxLimit) {
        this.maxLimit = maxLimit;
    }


    public Integer getMaxElements() {
        return maxElements;
    }


    public void setMaxElements(Integer maxElements) {
        this.maxElements = maxElements;
    }


    public String getValuesList() {
        return valuesList;
    }


    public void setValuesList(String valuesList) {
        this.valuesList = valuesList;
    }


    public Boolean getSupportsMonitoring() {
        return supportsMonitoring;
    }


    public void setSupportsMonitoring(Boolean supportsMonitoring) {
        this.supportsMonitoring = supportsMonitoring;
    }


    public CustomData getCustomData() {
        return customData;
    }


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
        JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
        fromJsonObject(jsonObject);
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        if (jsonObject.has("unit")) {
            this.unit = jsonObject.get("unit").getAsString();
        }

        if (jsonObject.has("dataType")) {
            this.dataType = DataEnum.valueOf(jsonObject.get("dataType").getAsString());
        }

        if (jsonObject.has("minLimit")) {
            this.minLimit = jsonObject.get("minLimit").getAsFloat();
        }

        if (jsonObject.has("maxLimit")) {
            this.maxLimit = jsonObject.get("maxLimit").getAsFloat();
        }

        if (jsonObject.has("maxElements")) {
            this.maxElements = jsonObject.get("maxElements").getAsInt();
        }

        if (jsonObject.has("valuesList")) {
            this.valuesList = jsonObject.get("valuesList").getAsString();
        }

        if (jsonObject.has("supportsMonitoring")) {
            this.supportsMonitoring = jsonObject.get("supportsMonitoring").getAsBoolean();
        }

        if (jsonObject.has("customData")) {
            this.customData = new CustomData();
            this.customData.fromJsonObject(jsonObject.getAsJsonObject("customData"));
        }

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
