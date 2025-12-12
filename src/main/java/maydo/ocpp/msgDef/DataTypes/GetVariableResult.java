package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.Enumerations.AttributeEnum;
import maydo.ocpp.msgDef.Enumerations.GetVariableStatusEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * Class to hold results of GetVariables request.
 */
public class GetVariableResult implements JsonInterface {

    /**
     *
     */
    @Required
    private GetVariableStatusEnum attributeStatus;

    /**
     * Detailed attribute status information.
     */
    @Optional
    private StatusInfo attributeStatusInfo;

    /**
     *
     */
    @Optional
    private AttributeEnum attributeType = AttributeEnum.fromValue("Actual");

    /**
     * Value of requested attribute type of component- variable.
     * This field can only be empty when the given status is NOT accepted.
     * The Configuration Variable ReportingValueSize can be used to limit
     * GetVariableResult.attributeValue, VariableAttribute.value and EventData.actualValue.
     * The max size of these values will always remain equal.
     */
    @Optional
    private String attributeValue;

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


    public GetVariableResult() {
    }


    public GetVariableStatusEnum getAttributeStatus() {
        return attributeStatus;
    }


    public void setAttributeStatus(GetVariableStatusEnum attributeStatus) {
        this.attributeStatus = attributeStatus;
    }


    public StatusInfo getAttributeStatusInfo() {
        return attributeStatusInfo;
    }


    public void setAttributeStatusInfo(StatusInfo attributeStatusInfo) {
        this.attributeStatusInfo = attributeStatusInfo;
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
        json.addProperty("attributeStatus", attributeStatus.toString());
        json.add("attributeStatusInfo", attributeStatusInfo.toJsonObject());
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
        if (jsonObject.has("attributeStatus")) {
            this.attributeStatus = GetVariableStatusEnum.valueOf(jsonObject.get("attributeStatus").getAsString());
        }

        if (jsonObject.has("attributeStatusInfo")) {
            this.attributeStatusInfo = new StatusInfo();
            this.attributeStatusInfo.fromJsonObject(jsonObject.getAsJsonObject("attributeStatusInfo"));
        }

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
