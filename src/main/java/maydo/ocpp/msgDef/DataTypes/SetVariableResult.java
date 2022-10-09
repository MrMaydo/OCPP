
package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.Enumerations.AttributeEnum;
import maydo.ocpp.msgDef.Enumerations.SetVariableStatusEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.utils.JsonTools;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class SetVariableResult implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * Type of attribute: Actual, Target, MinSet, MaxSet. Default is Actual when omitted.
     * 
     * 
     */
    private AttributeEnum attributeType = AttributeEnum.fromValue("Actual");
    /**
     * Result status of setting the variable.
     * 
     * (Required)
     * 
     */
    private SetVariableStatusEnum attributeStatus;
    /**
     * Element providing more information about the status.
     * 
     * 
     */
    private StatusInfo attributeStatusInfo;
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
     * Type of attribute: Actual, Target, MinSet, MaxSet. Default is Actual when omitted.
     * 
     * 
     */
    public AttributeEnum getAttributeType() {
        return attributeType;
    }

    /**
     * Type of attribute: Actual, Target, MinSet, MaxSet. Default is Actual when omitted.
     * 
     * 
     */
    public void setAttributeType(AttributeEnum attributeType) {
        this.attributeType = attributeType;
    }

    /**
     * Result status of setting the variable.
     * 
     * (Required)
     * 
     */
    public SetVariableStatusEnum getAttributeStatus() {
        return attributeStatus;
    }

    /**
     * Result status of setting the variable.
     * 
     * (Required)
     * 
     */
    public void setAttributeStatus(SetVariableStatusEnum attributeStatus) {
        this.attributeStatus = attributeStatus;
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
