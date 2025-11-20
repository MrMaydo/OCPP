package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.Enumerations.AttributeEnum;
import maydo.ocpp.msgDef.Enumerations.SetVariableStatusEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class SetVariableResult implements JsonInterface {

    /**
     * Type of attribute: Actual, Target, MinSet, MaxSet. Default is Actual when omitted.
     */
    @Optional
    private AttributeEnum attributeType = AttributeEnum.fromValue("Actual");
    /**
     * Result status of setting the variable.
     * <p>
     * (Required)
     */
    @Required
    private SetVariableStatusEnum attributeStatus;
    /**
     * Element providing more information about the status.
     */
    @Optional
    private StatusInfo attributeStatusInfo;
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
    public SetVariableResult() {
    }

    public SetVariableResult(AttributeEnum attributeType, SetVariableStatusEnum attributeStatus, StatusInfo attributeStatusInfo, Component component, Variable variable, CustomData customData) {
        super();
        this.attributeType = attributeType;
        this.attributeStatus = attributeStatus;
        this.attributeStatusInfo = attributeStatusInfo;
        this.component = component;
        this.variable = variable;
        this.customData = customData;
    }

    /**
     * Type of attribute: Actual, Target, MinSet, MaxSet. Default is Actual when omitted.
     */
    public AttributeEnum getAttributeType() {
        return attributeType;
    }

    /**
     * Type of attribute: Actual, Target, MinSet, MaxSet. Default is Actual when omitted.
     */
    public void setAttributeType(AttributeEnum attributeType) {
        this.attributeType = attributeType;
    }

    /**
     * Result status of setting the variable.
     * <p>
     * (Required)
     */
    public SetVariableStatusEnum getAttributeStatus() {
        return attributeStatus;
    }

    /**
     * Result status of setting the variable.
     * <p>
     * (Required)
     */
    public void setAttributeStatus(SetVariableStatusEnum attributeStatus) {
        this.attributeStatus = attributeStatus;
    }

    /**
     * Element providing more information about the status.
     */
    public StatusInfo getAttributeStatusInfo() {
        return attributeStatusInfo;
    }

    /**
     * Element providing more information about the status.
     */
    public void setAttributeStatusInfo(StatusInfo attributeStatusInfo) {
        this.attributeStatusInfo = attributeStatusInfo;
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
        json.addProperty("attributeStatus", attributeStatus.toString());
        json.add("attributeStatusInfo", attributeStatusInfo.toJsonObject());
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
        if (!(obj instanceof SetVariableResult))
            return false;
        SetVariableResult that = (SetVariableResult) obj;
        return Objects.equals(this.attributeStatus, that.attributeStatus)
                && Objects.equals(this.attributeStatusInfo, that.attributeStatusInfo)
                && Objects.equals(this.component, that.component)
                && Objects.equals(this.attributeType, that.attributeType)
                && Objects.equals(this.variable, that.variable)
                && Objects.equals(this.customData, that.customData);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.attributeStatus != null ? this.attributeStatus.hashCode() : 0);
        result = 31 * result + (this.attributeStatusInfo != null ? this.attributeStatusInfo.hashCode() : 0);
        result = 31 * result + (this.component != null ? this.component.hashCode() : 0);
        result = 31 * result + (this.attributeType != null ? this.attributeType.hashCode() : 0);
        result = 31 * result + (this.variable != null ? this.variable.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        return result;
    }
}
