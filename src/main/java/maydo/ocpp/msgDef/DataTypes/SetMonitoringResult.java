package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.Enumerations.MonitorEnum;
import maydo.ocpp.msgDef.Enumerations.SetMonitoringStatusEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * Class to hold result of SetVariableMonitoring request.
 */
public class SetMonitoringResult implements JsonInterface {

    /**
     * Id given to the VariableMonitor by the Charging Station. The Id is only returned when status is accepted.
     * Installed VariableMonitors should have unique id’s
     * but the id’s of removed Installed monitors should have unique id’s but the id’s of removed monitors MAY be reused.
     */
    @Optional
    private Integer id;

    /**
     * Status is OK if a value could be returned. Otherwise this will indicate the reason why a value could not be returned.
     */
    @Required
    private SetMonitoringStatusEnum status;

    /**
     * Detailed status information.
     */
    @Optional
    private StatusInfo statusInfo;

    /**
     * The type of this monitor, e.g. a threshold, delta or periodic monitor.
     */
    @Required
    private MonitorEnum type;

    /**
     * Component for which status is returned.
     */
    @Required
    private Component component;

    /**
     * Variable for which status is returned.
     */
    @Required
    private Variable variable;

    /**
     * The severity that will be assigned to an event that is triggered by this monitor.
     * The severity range is 0-9, with 0 as the highest and 9 as the lowest severity level.
     * The severity levels have the following meaning: </p>
     * <p> 0 - Danger Indicates lives are potentially in danger.
     * Urgent attention is needed and action should be taken immediately. </p>
     * <p> 1 - Hardware Failure Indicates that the Charging Station is unable to continue regular operations
     * due to Hardware issues. Action is required. </p>
     * <p> 2 - System Failure Indicates that the Charging Station is unable to continue regular operations
     * due to software or minor hardware issues. Action is required. </p>
     * <p> 3 - Critical Indicates a critical error. Action is required. </p>
     * <p> 4 - Error Indicates a non-urgent error. Action is required. </p>
     * <p> 5 - Alert Indicates an alert event. Default severity for any type of monitoring event. </p>
     * <p> 6 - Warning Indicates a warning event. Action may be required. </p>
     * <p> 7 - Notice Indicates an unusual event. No immediate action is required. </p>
     * <p> 8 - Informational Indicates a regular operational event.
     * May be used for reporting, measuring throughput, etc. No action is required. </p>
     * <p> 9 - Debug Indicates information useful to developers for debugging, not useful during operations. </p>
     */
    @Required
    private Integer severity;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public SetMonitoringResult() {
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public StatusInfo getStatusInfo() {
        return statusInfo;
    }


    public void setStatusInfo(StatusInfo statusInfo) {
        this.statusInfo = statusInfo;
    }


    public SetMonitoringStatusEnum getStatus() {
        return status;
    }


    public void setStatus(SetMonitoringStatusEnum status) {
        this.status = status;
    }


    public MonitorEnum getType() {
        return type;
    }


    public void setType(MonitorEnum type) {
        this.type = type;
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


    public Integer getSeverity() {
        return severity;
    }


    public void setSeverity(Integer severity) {
        this.severity = severity;
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

        if (getId() != null) {
            json.addProperty("id", getId());
        }
        json.addProperty("status", getStatus().toString());

        if (getStatusInfo() != null) {
            json.add("statusInfo", getStatusInfo().toJsonObject());
        }
        json.addProperty("type", getType().toString());

        json.add("component", getComponent().toJsonObject());

        json.add("variable", getVariable().toJsonObject());

        json.addProperty("severity", getSeverity());

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
        if (jsonObject.has("id")) {
            setId(jsonObject.get("id").getAsInt());
        }

        if (jsonObject.has("status")) {
            setStatus(SetMonitoringStatusEnum.valueOf(jsonObject.get("status").getAsString()));
        }

        if (jsonObject.has("statusInfo")) {
            setStatusInfo(new StatusInfo());
            getStatusInfo().fromJsonObject(jsonObject.getAsJsonObject("statusInfo"));
        }

        if (jsonObject.has("type")) {
            setType(MonitorEnum.valueOf(jsonObject.get("type").getAsString()));
        }

        if (jsonObject.has("component")) {
            setComponent(new Component());
            getComponent().fromJsonObject(jsonObject.getAsJsonObject("component"));
        }

        if (jsonObject.has("variable")) {
            setVariable(new Variable());
            getVariable().fromJsonObject(jsonObject.getAsJsonObject("variable"));
        }

        if (jsonObject.has("severity")) {
            setSeverity(jsonObject.get("severity").getAsInt());
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
        return Objects.hash(
                getId(),
                getStatus(),
                getStatusInfo(),
                getType(),
                getComponent(),
                getVariable(),
                getSeverity(),
                getCustomData()
        );
    }
}
