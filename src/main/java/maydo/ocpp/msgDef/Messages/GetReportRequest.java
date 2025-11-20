package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.ComponentVariable;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.ComponentCriterionEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.List;
import java.util.Objects;

public class GetReportRequest implements JsonInterface {

    private List<ComponentVariable> componentVariable;
    /**
     * The Id of the request.
     * <p>
     * (Required)
     */
    @Required
    private Integer requestId;
    /**
     * This field contains criteria for components for which a report is requested
     */
    @Optional
    private List<ComponentCriterionEnum> componentCriteria;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public GetReportRequest() {
    }

    /**
     * @param componentCriteria This field contains criteria for components for which a report is requested
     *                          .
     * @param requestId         The Id of the request.
     *                          .
     */
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
     * This field contains criteria for components for which a report is requested
     */
    public List<ComponentCriterionEnum> getComponentCriteria() {
        return componentCriteria;
    }

    /**
     * This field contains criteria for components for which a report is requested
     */
    public void setComponentCriteria(List<ComponentCriterionEnum> componentCriteria) {
        this.componentCriteria = componentCriteria;
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
