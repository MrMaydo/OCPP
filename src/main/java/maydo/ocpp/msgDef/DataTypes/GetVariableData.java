package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.Enumerations.AttributeEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class GetVariableData implements JsonInterface {

    /**
     * Attribute type for which value is requested. When absent, default Actual is assumed.
     */
    @Optional
    private AttributeEnum attributeType = AttributeEnum.fromValue("Actual");
    /**
     * A physical or logical component
     * <p>
     * (Required)
     */
    @Required
    private Component component;
    /**
     * Reference key to a component-variable.
     * <p>
     * (Required)
     */
    @Required
    private Variable variable;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public GetVariableData() {
    }

    public GetVariableData(AttributeEnum attributeType, Component component, Variable variable, CustomData customData) {
        super();
        this.attributeType = attributeType;
        this.component = component;
        this.variable = variable;
        this.customData = customData;
    }

    /**
     * Attribute type for which value is requested. When absent, default Actual is assumed.
     */
    public AttributeEnum getAttributeType() {
        return attributeType;
    }

    /**
     * Attribute type for which value is requested. When absent, default Actual is assumed.
     */
    public void setAttributeType(AttributeEnum attributeType) {
        this.attributeType = attributeType;
    }

    /**
     * A physical or logical component
     * <p>
     * (Required)
     */
    public Component getComponent() {
        return component;
    }

    /**
     * A physical or logical component
     * <p>
     * (Required)
     */
    public void setComponent(Component component) {
        this.component = component;
    }

    /**
     * Reference key to a component-variable.
     * <p>
     * (Required)
     */
    public Variable getVariable() {
        return variable;
    }

    /**
     * Reference key to a component-variable.
     * <p>
     * (Required)
     */
    public void setVariable(Variable variable) {
        this.variable = variable;
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
        json.add("component", component.toJsonObject());
        json.add("variable", variable.toJsonObject());
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
