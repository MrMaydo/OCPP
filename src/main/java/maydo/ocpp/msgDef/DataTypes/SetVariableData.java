package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.Enumerations.AttributeEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 *
 */
public class SetVariableData implements JsonInterface {

    /**
     * Type of attribute: Actual, Target, MinSet, MaxSet. Default is Actual when omitted.
     */
    @Optional
    private AttributeEnum attributeType = AttributeEnum.fromValue("Actual");

    /**
     * Value to be assigned to attribute of variable. This value is allowed to be an empty string ("").
     * The Configuration Variable ConfigurationValueSize can be used to limit
     * SetVariableData.attributeValue and VariableCharacteristics.valuesList.
     * The max size of these values will always remain equal.
     */
    @Required
    private String attributeValue;

    /**
     *
     */
    @Required
    private Component component;

    /**
     *
     */
    @Required
    private Variable variable;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public SetVariableData() {
    }


    public AttributeEnum getAttributeType() {
        return attributeType;
    }


    public void setAttributeType(AttributeEnum attributeType) {
        this.attributeType = attributeType;
    }


    public String getAttributeValue() {
        return attributeValue;
    }


    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }


    public Component getComponent() {
        return component;
    }


    public void setComponent(Component component) {
        this.component = component;
    }


    public Variable getVariable() {
        return variable;
    }


    public void setVariable(Variable variable) {
        this.variable = variable;
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
        json.addProperty("attributeValue", attributeValue);
        json.add("component", component.toJsonObject());
        json.add("variable", variable.toJsonObject());
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
        if (jsonObject.has("attributeValue")) {
            this.attributeValue = jsonObject.get("attributeValue").getAsString();
        }

        if (jsonObject.has("component")) {
            this.component = new Component();
            this.component.fromJsonObject(jsonObject.getAsJsonObject("component"));
        }

        if (jsonObject.has("variable")) {
            this.variable = new Variable();
            this.variable.fromJsonObject(jsonObject.getAsJsonObject("variable"));
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
        if (!(obj instanceof SetVariableData))
            return false;
        SetVariableData that = (SetVariableData) obj;
        return Objects.equals(this.variable, that.variable)
                && Objects.equals(this.component, that.component)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.attributeValue, that.attributeValue)
                && Objects.equals(this.attributeType, that.attributeType);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.variable != null ? this.variable.hashCode() : 0);
        result = 31 * result + (this.component != null ? this.component.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.attributeValue != null ? this.attributeValue.hashCode() : 0);
        result = 31 * result + (this.attributeType != null ? this.attributeType.hashCode() : 0);
        return result;
    }
}
