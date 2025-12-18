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

        json.addProperty("attributeValue", getAttributeValue());

        json.add("component", getComponent().toJsonObject());

        json.add("variable", getVariable().toJsonObject());

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
        if (jsonObject.has("attributeValue")) {
            setAttributeValue(jsonObject.get("attributeValue").getAsString());
        }

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
        if (!(obj instanceof SetVariableData))
            return false;
        SetVariableData that = (SetVariableData) obj;
        return Objects.equals(getAttributeValue(), that.getAttributeValue())
                && Objects.equals(getComponent(), that.getComponent())
                && Objects.equals(getVariable(), that.getVariable())
                && Objects.equals(getCustomData(), that.getCustomData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getAttributeValue(),
                getComponent(),
                getVariable(),
                getCustomData()
        );
    }
}
