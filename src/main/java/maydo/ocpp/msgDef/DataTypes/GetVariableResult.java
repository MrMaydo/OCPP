
package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.Enumerations.AttributeEnum;
import maydo.ocpp.msgDef.Enumerations.GetVariableStatusEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.utils.JsonTools;

import javax.annotation.Generated;


/**
 * Class to hold results of GetVariables request.
 * 
 * 
 */
public class GetVariableResult implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * Element providing more information about the status.
     * 
     * 
     */
    private StatusInfo attributeStatusInfo;
    /**
     * Result status of getting the variable.
     * 
     * 
     * (Required)
     * 
     */
    private GetVariableStatusEnum attributeStatus;
    /**
     * Attribute type for which value is requested. When absent, default Actual is assumed.
     * 
     * 
     */
    private AttributeEnum attributeType = AttributeEnum.fromValue("Actual");
    /**
     * Value of requested attribute type of component-variable. This field can only be empty when the given status is NOT accepted.
     * 
     * The Configuration Variable &lt;&lt;configkey-reporting-value-size,ReportingValueSize&gt;&gt; can be used to limit GetVariableResult.attributeValue, VariableAttribute.value and EventData.actualValue. The max size of these values will always remain equal. 
     * 
     * 
     * 
     */
    private String attributeValue;
    /**
     * A physical or logical component
     * 
     * (Required)
     * 
     */
    private Component component;
    /**
     * Reference key to a component-variable.
     * 
     * (Required)
     * 
     */
    private Variable variable;

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    public CustomData getCustomData() {
        return customData;
    }

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    public void setCustomData(CustomData customData) {
        this.customData = customData;
    }

    /**
     * Element providing more information about the status.
     * 
     * 
     */
    public StatusInfo getAttributeStatusInfo() {
        return attributeStatusInfo;
    }

    /**
     * Element providing more information about the status.
     * 
     * 
     */
    public void setAttributeStatusInfo(StatusInfo attributeStatusInfo) {
        this.attributeStatusInfo = attributeStatusInfo;
    }

    /**
     * Result status of getting the variable.
     * 
     * 
     * (Required)
     * 
     */
    public GetVariableStatusEnum getAttributeStatus() {
        return attributeStatus;
    }

    /**
     * Result status of getting the variable.
     * 
     * 
     * (Required)
     * 
     */
    public void setAttributeStatus(GetVariableStatusEnum attributeStatus) {
        this.attributeStatus = attributeStatus;
    }

    /**
     * Attribute type for which value is requested. When absent, default Actual is assumed.
     * 
     * 
     */
    public AttributeEnum getAttributeType() {
        return attributeType;
    }

    /**
     * Attribute type for which value is requested. When absent, default Actual is assumed.
     * 
     * 
     */
    public void setAttributeType(AttributeEnum attributeType) {
        this.attributeType = attributeType;
    }

    /**
     * Value of requested attribute type of component-variable. This field can only be empty when the given status is NOT accepted.
     * 
     * The Configuration Variable &lt;&lt;configkey-reporting-value-size,ReportingValueSize&gt;&gt; can be used to limit GetVariableResult.attributeValue, VariableAttribute.value and EventData.actualValue. The max size of these values will always remain equal. 
     * 
     * 
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
     * 
     * 
     */
    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

    /**
     * A physical or logical component
     * 
     * (Required)
     * 
     */
    public Component getComponent() {
        return component;
    }

    /**
     * A physical or logical component
     * 
     * (Required)
     * 
     */
    public void setComponent(Component component) {
        this.component = component;
    }

    /**
     * Reference key to a component-variable.
     * 
     * (Required)
     * 
     */
    public Variable getVariable() {
        return variable;
    }

    /**
     * Reference key to a component-variable.
     * 
     * (Required)
     * 
     */
    public void setVariable(Variable variable) {
        this.variable = variable;
    }

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject(){
        return JsonTools.toJsonObject(this);
    }
}
