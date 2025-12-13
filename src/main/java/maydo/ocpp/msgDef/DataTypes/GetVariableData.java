package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.Enumerations.AttributeEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * Class to hold parameters for GetVariables request
 */
public class GetVariableData implements JsonInterface {

    /**
     * Attribute type for which value is requested. When absent, default Actual is assumed.
     */
    @Optional
    private AttributeEnum attributeType = AttributeEnum.fromValue("Actual");

    /**
     * Component for which the Variable is requested.
     */
    @Required
    private Component component;

    /**
     * Variable for which the attribute value is requested.
     */
    @Required
    private Variable variable;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public GetVariableData() {
    }


    public AttributeEnum getAttributeType() {
        return attributeType;
    }


    public void setAttributeType(AttributeEnum attributeType) {
        this.attributeType = attributeType;
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
        if (jsonObject.has("component")) {
            setComponent(new Component());
            getComponent().fromJsonObject(jsonObject.getAsJsonObject("component"));
        }

        if (jsonObject.has("variable")) {
            setVariable(new Variable());
            getVariable().fromJsonObject(jsonObject.getAsJsonObject("variable"));
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
        if (!(obj instanceof GetVariableData))
            return false;
        GetVariableData that = (GetVariableData) obj;
        return Objects.equals(this.variable, that.variable)
                && Objects.equals(this.component, that.component)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.attributeType, that.attributeType);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.variable != null ? this.variable.hashCode() : 0);
        result = 31 * result + (this.component != null ? this.component.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.attributeType != null ? this.attributeType.hashCode() : 0);
        return result;
    }
}
