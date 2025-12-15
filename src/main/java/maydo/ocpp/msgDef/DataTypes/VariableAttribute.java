package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.Enumerations.AttributeEnum;
import maydo.ocpp.msgDef.Enumerations.MutabilityEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;

import java.util.Objects;

/**
 * Attribute data of a variable.
 */
public class VariableAttribute implements JsonInterface {

    /**
     * Attribute: Actual, MinSet, MaxSet, etc. Defaults to Actual if absent.
     */
    @Optional
    private AttributeEnum type = AttributeEnum.fromValue("Actual");

    /**
     * Value of the attribute. May only be omitted when mutability is set to 'WriteOnly'.
     * The Configuration Variable ReportingValueSize can be used to limit GetVariableResult.attributeValue,
     * VariableAttribute.value and EventData.actualValue.
     * The max size of these values will always remain equal.
     */
    @Optional
    private String value;

    /**
     * Defines the mutability of this attribute. Default is ReadWrite when omitted.
     */
    @Optional
    private MutabilityEnum mutability = MutabilityEnum.fromValue("ReadWrite");

    /**
     * If true, value will be persistent across system reboots or power down. Default when omitted is false.
     */
    @Optional
    private Boolean persistent = false;

    /**
     * If true, value that will never be changed by the Charging Station at runtime. Default when omitted is false.
     */
    @Optional
    private Boolean constant = false;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public VariableAttribute() {
    }


    public AttributeEnum getType() {
        return type;
    }


    public void setType(AttributeEnum type) {
        this.type = type;
    }


    public String getValue() {
        return value;
    }


    public void setValue(String value) {
        this.value = value;
    }


    public MutabilityEnum getMutability() {
        return mutability;
    }


    public void setMutability(MutabilityEnum mutability) {
        this.mutability = mutability;
    }


    public Boolean getPersistent() {
        return persistent;
    }


    public void setPersistent(Boolean persistent) {
        this.persistent = persistent;
    }


    public Boolean getConstant() {
        return constant;
    }


    public void setConstant(Boolean constant) {
        this.constant = constant;
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

        if (getValue() != null) {
            json.addProperty("value", getValue());
        }
        if (getCustomData() != null) {
            json.add("customData", getCustomData().toJsonObject());
        }

        return json;
    }

    @Override
    public void fromString(String jsonString) {
        JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
        fromJsonObject(jsonObject);
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        if (jsonObject.has("value")) {
            setValue(jsonObject.get("value").getAsString());
        }

        if (jsonObject.has("customData")) {
            setCustomData(new CustomData());
            getCustomData().fromJsonObject(jsonObject.getAsJsonObject("customData"));
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof VariableAttribute))
            return false;
        VariableAttribute that = (VariableAttribute) obj;
        return Objects.equals(this.constant, that.constant)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.mutability, that.mutability)
                && Objects.equals(this.type, that.type)
                && Objects.equals(this.persistent, that.persistent)
                && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.constant != null ? this.constant.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.mutability != null ? this.mutability.hashCode() : 0);
        result = 31 * result + (this.type != null ? this.type.hashCode() : 0);
        result = 31 * result + (this.persistent != null ? this.persistent.hashCode() : 0);
        result = 31 * result + (this.value != null ? this.value.hashCode() : 0);
        return result;
    }
}
