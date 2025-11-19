package maydo.ocpp.msgDef.DataTypes;

import maydo.ocpp.msgDef.Enumerations.MonitorEnum;
import maydo.ocpp.msgDef.Enumerations.SetMonitoringStatusEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class SetMonitoringResult implements JsonInterface {

    /**
     * Id given to the VariableMonitor by the Charging Station. The Id is only returned when status is accepted. Installed VariableMonitors should have unique id's but the id's of removed Installed monitors should have unique id's but the id's of removed monitors MAY be reused.
     */
    @Optional
    private Integer id;
    /**
     * Element providing more information about the status.
     */
    @Optional
    private StatusInfo statusInfo;
    /**
     * Status is OK if a value could be returned. Otherwise this will indicate the reason why a value could not be returned.
     * 
     * (Required)
     */
    @Required
    private SetMonitoringStatusEnum status;
    /**
     * The type of this monitor, e.g. a threshold, delta or periodic monitor. 
     * 
     * 
     * (Required)
     */
    @Required
    private MonitorEnum type;
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
     * The severity that will be assigned to an event that is triggered by this monitor. The severity range is 0-9, with 0 as the highest and 9 as the lowest severity level.
     * 
     * The severity levels have the following meaning: +
     * *0-Danger* +
     * Indicates lives are potentially in danger. Urgent attention is needed and action should be taken immediately. +
     * *1-Hardware Failure* +
     * Indicates that the Charging Station is unable to continue regular operations due to Hardware issues. Action is required. +
     * *2-System Failure* +
     * Indicates that the Charging Station is unable to continue regular operations due to software or minor hardware issues. Action is required. +
     * *3-Critical* +
     * Indicates a critical error. Action is required. +
     * *4-Error* +
     * Indicates a non-urgent error. Action is required. +
     * *5-Alert* +
     * Indicates an alert event. Default severity for any type of monitoring event.  +
     * *6-Warning* +
     * Indicates a warning event. Action may be required. +
     * *7-Notice* +
     * Indicates an unusual event. No immediate action is required. +
     * *8-Informational* +
     * Indicates a regular operational event. May be used for reporting, measuring throughput, etc. No action is required. +
     * *9-Debug* +
     * Indicates information useful to developers for debugging, not useful during operations.
     * 
     * 
     * (Required)
     */
    @Required
    private Integer severity;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public SetMonitoringResult() {
    }

    /**
     * 
     * @param severity
     *     The severity that will be assigned to an event that is triggered by this monitor. The severity range is 0-9, with 0 as the highest and 9 as the lowest severity level.
     *     
     *     The severity levels have the following meaning: +
     *     *0-Danger* +
     *     Indicates lives are potentially in danger. Urgent attention is needed and action should be taken immediately. +
     *     *1-Hardware Failure* +
     *     Indicates that the Charging Station is unable to continue regular operations due to Hardware issues. Action is required. +
     *     *2-System Failure* +
     *     Indicates that the Charging Station is unable to continue regular operations due to software or minor hardware issues. Action is required. +
     *     *3-Critical* +
     *     Indicates a critical error. Action is required. +
     *     *4-Error* +
     *     Indicates a non-urgent error. Action is required. +
     *     *5-Alert* +
     *     Indicates an alert event. Default severity for any type of monitoring event.  +
     *     *6-Warning* +
     *     Indicates a warning event. Action may be required. +
     *     *7-Notice* +
     *     Indicates an unusual event. No immediate action is required. +
     *     *8-Informational* +
     *     Indicates a regular operational event. May be used for reporting, measuring throughput, etc. No action is required. +
     *     *9-Debug* +
     *     Indicates information useful to developers for debugging, not useful during operations.
     *     
     *     .
     * @param id
     *     Id given to the VariableMonitor by the Charging Station. The Id is only returned when status is accepted. Installed VariableMonitors should have unique id's but the id's of removed Installed monitors should have unique id's but the id's of removed monitors MAY be reused.
     *     .
     */
    public SetMonitoringResult(Integer id, StatusInfo statusInfo, SetMonitoringStatusEnum status, MonitorEnum type, Component component, Variable variable, Integer severity, CustomData customData) {
        super();
        this.id = id;
        this.statusInfo = statusInfo;
        this.status = status;
        this.type = type;
        this.component = component;
        this.variable = variable;
        this.severity = severity;
        this.customData = customData;
    }

    /**
     * Id given to the VariableMonitor by the Charging Station. The Id is only returned when status is accepted. Installed VariableMonitors should have unique id's but the id's of removed Installed monitors should have unique id's but the id's of removed monitors MAY be reused.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Id given to the VariableMonitor by the Charging Station. The Id is only returned when status is accepted. Installed VariableMonitors should have unique id's but the id's of removed Installed monitors should have unique id's but the id's of removed monitors MAY be reused.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Element providing more information about the status.
     */
    public StatusInfo getStatusInfo() {
        return statusInfo;
    }

    /**
     * Element providing more information about the status.
     */
    public void setStatusInfo(StatusInfo statusInfo) {
        this.statusInfo = statusInfo;
    }

    /**
     * Status is OK if a value could be returned. Otherwise this will indicate the reason why a value could not be returned.
     * 
     * (Required)
     */
    public SetMonitoringStatusEnum getStatus() {
        return status;
    }

    /**
     * Status is OK if a value could be returned. Otherwise this will indicate the reason why a value could not be returned.
     * 
     * (Required)
     */
    public void setStatus(SetMonitoringStatusEnum status) {
        this.status = status;
    }

    /**
     * The type of this monitor, e.g. a threshold, delta or periodic monitor. 
     * 
     * 
     * (Required)
     */
    public MonitorEnum getType() {
        return type;
    }

    /**
     * The type of this monitor, e.g. a threshold, delta or periodic monitor. 
     * 
     * 
     * (Required)
     */
    public void setType(MonitorEnum type) {
        this.type = type;
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
     * The severity that will be assigned to an event that is triggered by this monitor. The severity range is 0-9, with 0 as the highest and 9 as the lowest severity level.
     * 
     * The severity levels have the following meaning: +
     * *0-Danger* +
     * Indicates lives are potentially in danger. Urgent attention is needed and action should be taken immediately. +
     * *1-Hardware Failure* +
     * Indicates that the Charging Station is unable to continue regular operations due to Hardware issues. Action is required. +
     * *2-System Failure* +
     * Indicates that the Charging Station is unable to continue regular operations due to software or minor hardware issues. Action is required. +
     * *3-Critical* +
     * Indicates a critical error. Action is required. +
     * *4-Error* +
     * Indicates a non-urgent error. Action is required. +
     * *5-Alert* +
     * Indicates an alert event. Default severity for any type of monitoring event.  +
     * *6-Warning* +
     * Indicates a warning event. Action may be required. +
     * *7-Notice* +
     * Indicates an unusual event. No immediate action is required. +
     * *8-Informational* +
     * Indicates a regular operational event. May be used for reporting, measuring throughput, etc. No action is required. +
     * *9-Debug* +
     * Indicates information useful to developers for debugging, not useful during operations.
     * 
     * 
     * (Required)
     */
    public Integer getSeverity() {
        return severity;
    }

    /**
     * The severity that will be assigned to an event that is triggered by this monitor. The severity range is 0-9, with 0 as the highest and 9 as the lowest severity level.
     * 
     * The severity levels have the following meaning: +
     * *0-Danger* +
     * Indicates lives are potentially in danger. Urgent attention is needed and action should be taken immediately. +
     * *1-Hardware Failure* +
     * Indicates that the Charging Station is unable to continue regular operations due to Hardware issues. Action is required. +
     * *2-System Failure* +
     * Indicates that the Charging Station is unable to continue regular operations due to software or minor hardware issues. Action is required. +
     * *3-Critical* +
     * Indicates a critical error. Action is required. +
     * *4-Error* +
     * Indicates a non-urgent error. Action is required. +
     * *5-Alert* +
     * Indicates an alert event. Default severity for any type of monitoring event.  +
     * *6-Warning* +
     * Indicates a warning event. Action may be required. +
     * *7-Notice* +
     * Indicates an unusual event. No immediate action is required. +
     * *8-Informational* +
     * Indicates a regular operational event. May be used for reporting, measuring throughput, etc. No action is required. +
     * *9-Debug* +
     * Indicates information useful to developers for debugging, not useful during operations.
     * 
     * 
     * (Required)
     */
    public void setSeverity(Integer severity) {
        this.severity = severity;
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
        if (!(obj instanceof SetMonitoringResult))
            return false;
        SetMonitoringResult that = (SetMonitoringResult) obj;
        return Objects.equals(this.severity, that.severity)
                && Objects.equals(this.component, that.component) 
                && Objects.equals(this.statusInfo, that.statusInfo) 
                && Objects.equals(this.variable, that.variable) 
                && Objects.equals(this.customData, that.customData) 
                && Objects.equals(this.id, that.id) 
                && Objects.equals(this.type, that.type) 
                && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.severity != null ? this.severity.hashCode() : 0);
        result = 31 * result + (this.component != null ? this.component.hashCode() : 0);
        result = 31 * result + (this.statusInfo != null ? this.statusInfo.hashCode() : 0);
        result = 31 * result + (this.variable != null ? this.variable.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
        result = 31 * result + (this.type != null ? this.type.hashCode() : 0);
        result = 31 * result + (this.status != null ? this.status.hashCode() : 0);
        return result;
    }
}
