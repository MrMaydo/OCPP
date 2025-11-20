package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.ComponentVariable;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.MonitoringCriterionEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.List;
import java.util.Objects;

public class GetMonitoringReportRequest implements JsonInterface {

    private List<ComponentVariable> componentVariable;
    /**
     * The Id of the request.
     * <p>
     * (Required)
     */
    @Required
    private Integer requestId;
    /**
     * This field contains criteria for components for which a monitoring report is requested
     */
    @Optional
    private List<MonitoringCriterionEnum> monitoringCriteria;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public GetMonitoringReportRequest() {
    }

    /**
     * @param monitoringCriteria This field contains criteria for components for which a monitoring report is requested
     *                           .
     * @param requestId          The Id of the request.
     *                           .
     */
    public GetMonitoringReportRequest(List<ComponentVariable> componentVariable, Integer requestId, List<MonitoringCriterionEnum> monitoringCriteria, CustomData customData) {
        super();
        this.componentVariable = componentVariable;
        this.requestId = requestId;
        this.monitoringCriteria = monitoringCriteria;
        this.customData = customData;
    }

    public List<ComponentVariable> getComponentVariable() {
        return componentVariable;
    }

    public void setComponentVariable(List<ComponentVariable> componentVariable) {
        this.componentVariable = componentVariable;
    }

    /**
     * The Id of the request.
     * <p>
     * (Required)
     */
    public Integer getRequestId() {
        return requestId;
    }

    /**
     * The Id of the request.
     * <p>
     * (Required)
     */
    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    /**
     * This field contains criteria for components for which a monitoring report is requested
     */
    public List<MonitoringCriterionEnum> getMonitoringCriteria() {
        return monitoringCriteria;
    }

    /**
     * This field contains criteria for components for which a monitoring report is requested
     */
    public void setMonitoringCriteria(List<MonitoringCriterionEnum> monitoringCriteria) {
        this.monitoringCriteria = monitoringCriteria;
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
        json.addProperty("requestId", requestId);
        json.add("customData", customData.toJsonObject());
        return json;
    }

    @Override
    public void fromString(String jsonString) {
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
        if (!(obj instanceof GetMonitoringReportRequest))
            return false;
        GetMonitoringReportRequest that = (GetMonitoringReportRequest) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.monitoringCriteria, that.monitoringCriteria)
                && Objects.equals(this.componentVariable, that.componentVariable)
                && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.monitoringCriteria != null ? this.monitoringCriteria.hashCode() : 0);
        result = 31 * result + (this.componentVariable != null ? this.componentVariable.hashCode() : 0);
        result = 31 * result + (this.requestId != null ? this.requestId.hashCode() : 0);
        return result;
    }
}
