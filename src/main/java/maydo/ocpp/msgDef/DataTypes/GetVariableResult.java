package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.Enumerations.AttributeEnum;
import maydo.ocpp.msgDef.Enumerations.GetVariableStatusEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class GetVariableResult implements JsonInterface {

    /**
     * 
     * (Required)
     */
    @Required
    private GetVariableStatusEnum attributeStatus;
    /**
     * Element providing more information about the status.
     */
    @Optional
    private StatusInfo attributeStatusInfo;
    @Optional
    private AttributeEnum attributeType = AttributeEnum.fromValue("Actual");
    /**
     * Value of requested attribute type of component-variable. This field can only be empty when the given status is NOT accepted.
     * 
     * The Configuration Variable &lt;&lt;configkey-reporting-value-size,ReportingValueSize&gt;&gt; can be used to limit GetVariableResult.attributeValue, VariableAttribute.value and EventData.actualValue. The max size of these values will always remain equal. 
     * 
     */
    @Optional
    private String attributeValue;
    /**
     * A physical or logical component
     * 
     * (Required)
     */
    @Required
    private Component component;
    /**
     * Reference key to a component-variable.
     * 
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
    public GetVariableResult() {
    }

    /**
     * 
     * @param attributeValue
     *     Value of requested attribute type of component-variable. This field can only be empty when the given status is NOT accepted.
     *     
     *     The Configuration Variable &lt;&lt;configkey-reporting-value-size,ReportingValueSize&gt;&gt; can be used to limit GetVariableResult.attributeValue, VariableAttribute.value and EventData.actualValue. The max size of these values will always remain equal. 
     *     
     *     .
     */
    public GetVariableResult(GetVariableStatusEnum attributeStatus, StatusInfo attributeStatusInfo, AttributeEnum attributeType, String attributeValue, Component component, Variable variable, CustomData customData) {
        super();
        this.attributeStatus = attributeStatus;
        this.attributeStatusInfo = attributeStatusInfo;
        this.attributeType = attributeType;
        this.attributeValue = attributeValue;
        this.component = component;
        this.variable = variable;
        this.customData = customData;
    }

    /**
     * 
     * (Required)
     */
    public GetVariableStatusEnum getAttributeStatus() {
        return attributeStatus;
    }

    /**
     * 
     * (Required)
     */
    public void setAttributeStatus(GetVariableStatusEnum attributeStatus) {
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

    public AttributeEnum getAttributeType() {
        return attributeType;
    }

    public void setAttributeType(AttributeEnum attributeType) {
        this.attributeType = attributeType;
    }

    /**
     * Value of requested attribute type of component-variable. This field can only be empty when the given status is NOT accepted.
     * 
     * The Configuration Variable &lt;&lt;configkey-reporting-value-size,ReportingValueSize&gt;&gt; can be used to limit GetVariableResult.attributeValue, VariableAttribute.value and EventData.actualValue. The max size of these values will always remain equal. 
     * 
     */
    public String getAttributeValue() {
        return attributeValue;
    }

    /**
     * Value of requested attribute type of component-variable. This field can only be empty when the given status is NOT accepted.
     * 
     * The Configuration Variable &lt;&lt;configkey-reporting-value-size,ReportingValueSize&gt;&gt; can be used to limit GetVariableResult.attributeValue, VariableAttribute.value and EventData.actualValue. The max size of these values will always remain equal. 
     * 
     */
    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

    /**
     * A physical or logical component
     * 
     * (Required)
     */
    public Component getComponent() {
        return component;
    }

    /**
     * A physical or logical component
     * 
     * (Required)
     */
    public void setComponent(Component component) {
        this.component = component;
    }

    /**
     * Reference key to a component-variable.
     * 
     * (Required)
     */
    public Variable getVariable() {
        return variable;
    }

    /**
     * Reference key to a component-variable.
     * 
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
        return null;
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
        if (!(obj instanceof GetVariableResult))
            return false;
        GetVariableResult that = (GetVariableResult) obj;
        return Objects.equals(this.attributeStatus, that.attributeStatus)
                && Objects.equals(this.attributeStatusInfo, that.attributeStatusInfo) 
                && Objects.equals(this.component, that.component) 
                && Objects.equals(this.attributeValue, that.attributeValue) 
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
        result = 31 * result + (this.attributeValue != null ? this.attributeValue.hashCode() : 0);
        result = 31 * result + (this.attributeType != null ? this.attributeType.hashCode() : 0);
        result = 31 * result + (this.variable != null ? this.variable.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        return result;
    }
}
