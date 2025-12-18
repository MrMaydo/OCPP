package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.Enumerations.AttributeEnum;
import maydo.ocpp.msgDef.Enumerations.SetVariableStatusEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 *
 */
public class SetVariableResult implements JsonInterface {

    /**
     * Type of attribute: Actual, Target, MinSet, MaxSet. Default is Actual when omitted.
     */
    @Optional
    private AttributeEnum attributeType = AttributeEnum.fromValue("Actual");

    /**
     * Result status of setting the variable.
     */
    @Required
    private SetVariableStatusEnum attributeStatus;

    /**
     * Detailed attribute status information.
     */
    @Optional
    private StatusInfo attributeStatusInfo;

    /**
     * The component for which result is returned.
     */
    @Required
    private Component component;

    /**
     * The variable for which the result is returned.
     */
    @Required
    private Variable variable;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public SetVariableResult() {
    }


    public AttributeEnum getAttributeType() {
        return attributeType;
    }


    public void setAttributeType(AttributeEnum attributeType) {
        this.attributeType = attributeType;
    }


    public SetVariableStatusEnum getAttributeStatus() {
        return attributeStatus;
    }


    public void setAttributeStatus(SetVariableStatusEnum attributeStatus) {
        this.attributeStatus = attributeStatus;
    }


    public StatusInfo getAttributeStatusInfo() {
        return attributeStatusInfo;
    }


    public void setAttributeStatusInfo(StatusInfo attributeStatusInfo) {
        this.attributeStatusInfo = attributeStatusInfo;
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

        json.addProperty("attributeStatus", getAttributeStatus().toString());

        if (getAttributeStatusInfo() != null) {
            json.add("attributeStatusInfo", getAttributeStatusInfo().toJsonObject());
        }
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
        if (jsonObject.has("attributeStatus")) {
            setAttributeStatus(SetVariableStatusEnum.valueOf(jsonObject.get("attributeStatus").getAsString()));
        }

        if (jsonObject.has("attributeStatusInfo")) {
            setAttributeStatusInfo(new StatusInfo());
            getAttributeStatusInfo().fromJsonObject(jsonObject.getAsJsonObject("attributeStatusInfo"));
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
        if (!(obj instanceof SetVariableResult))
            return false;
        SetVariableResult that = (SetVariableResult) obj;
        return Objects.equals(getAttributeStatus(), that.getAttributeStatus())
                && Objects.equals(getAttributeStatusInfo(), that.getAttributeStatusInfo())
                && Objects.equals(getComponent(), that.getComponent())
                && Objects.equals(getVariable(), that.getVariable())
                && Objects.equals(getCustomData(), that.getCustomData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getAttributeStatus(),
                getAttributeStatusInfo(),
                getComponent(),
                getVariable(),
                getCustomData()
        );
    }
}
