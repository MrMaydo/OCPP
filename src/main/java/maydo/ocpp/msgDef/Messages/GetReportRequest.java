package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.ComponentVariable;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.ComponentCriterionEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.List;
import java.util.Objects;

/**
 * This contains the field definition of the GetReportRequest PDU sent by the CSMS to the Charging Station.
 */
public class GetReportRequest implements JsonInterface {

    /**
     * This field specifies the components and variables for which a report is requested.
     */
    @Optional
    private List<ComponentVariable> componentVariable;

    /**
     * The Id of the request.
     */
    @Required
    private Integer requestId;

    /**
     * This field contains criteria for components for which a report is requested
     */
    @Optional
    private List<ComponentCriterionEnum> componentCriteria;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public GetReportRequest() {
    }


    public GetReportRequest(List<ComponentVariable> componentVariable, Integer requestId, List<ComponentCriterionEnum> componentCriteria, CustomData customData) {
        super();
        this.componentVariable = componentVariable;
        this.requestId = requestId;
        this.componentCriteria = componentCriteria;
        this.customData = customData;
    }

    public List<ComponentVariable> getComponentVariable() {
        return componentVariable;
    }

    public void setComponentVariable(List<ComponentVariable> componentVariable) {
        this.componentVariable = componentVariable;
    }


    public Integer getRequestId() {
        return requestId;
    }


    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }


    public List<ComponentCriterionEnum> getComponentCriteria() {
        return componentCriteria;
    }


    public void setComponentCriteria(List<ComponentCriterionEnum> componentCriteria) {
        this.componentCriteria = componentCriteria;
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
        json.addProperty("requestId", requestId);
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
        if (jsonObject.has("requestId")) {
            this.requestId = jsonObject.get("requestId").getAsInt();
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
        if (!(obj instanceof GetReportRequest))
            return false;
        GetReportRequest that = (GetReportRequest) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.componentVariable, that.componentVariable)
                && Objects.equals(this.componentCriteria, that.componentCriteria)
                && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.componentVariable != null ? this.componentVariable.hashCode() : 0);
        result = 31 * result + (this.componentCriteria != null ? this.componentCriteria.hashCode() : 0);
        result = 31 * result + (this.requestId != null ? this.requestId.hashCode() : 0);
        return result;
    }
}
