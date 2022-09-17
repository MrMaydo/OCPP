
package maydo.ocpp.msgDef.Messages;

import maydo.ocpp.msgDef.DataTypes.ComponentVariable;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.MonitoringCriterionEnum;

import java.util.List;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class GetMonitoringReportRequest {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    private List<ComponentVariable> componentVariable = null;
    /**
     * The Id of the request.
     * 
     * (Required)
     * 
     */
    private Integer requestId;
    /**
     * This field contains criteria for components for which a monitoring report is requested
     * 
     * 
     */
    private List<MonitoringCriterionEnum> monitoringCriteria = null;

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

    public List<ComponentVariable> getComponentVariable() {
        return componentVariable;
    }

    public void setComponentVariable(List<ComponentVariable> componentVariable) {
        this.componentVariable = componentVariable;
    }

    /**
     * The Id of the request.
     * 
     * (Required)
     * 
     */
    public Integer getRequestId() {
        return requestId;
    }

    /**
     * The Id of the request.
     * 
     * (Required)
     * 
     */
    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    /**
     * This field contains criteria for components for which a monitoring report is requested
     * 
     * 
     */
    public List<MonitoringCriterionEnum> getMonitoringCriteria() {
        return monitoringCriteria;
    }

    /**
     * This field contains criteria for components for which a monitoring report is requested
     * 
     * 
     */
    public void setMonitoringCriteria(List<MonitoringCriterionEnum> monitoringCriteria) {
        this.monitoringCriteria = monitoringCriteria;
    }

}
