package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.ComponentVariable;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.ComponentCriterionEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.List;
import java.util.Objects;

public class GetReportRequest implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    @Optional
    private List<ComponentVariable> componentVariable = null;
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
    private List<ComponentCriterionEnum> componentCriteria = null;

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

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject() {
        return JsonTools.toJsonObject(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof GetReportRequest))
            return false;
        GetReportRequest that = (GetReportRequest) obj;
        return Objects.equals(customData, that.customData)
                && Objects.equals(componentVariable, that.componentVariable)
                && Objects.equals(requestId, that.requestId)
                && Objects.equals(componentCriteria, that.componentCriteria);
    }

    @Override
    public int hashCode() {
        int result = (componentVariable != null ? componentVariable.hashCode() : 0);
        result = 31 * result + (requestId != null ? requestId.hashCode() : 0);
        result = 31 * result + (componentCriteria != null ? componentCriteria.hashCode() : 0);
        result = 31 * result + (customData != null ? customData.hashCode() : 0);
        return result;
    }
}
