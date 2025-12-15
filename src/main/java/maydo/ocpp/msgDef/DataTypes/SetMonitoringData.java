package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.Enumerations.MonitorEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * Class to hold parameters of SetVariableMonitoring request.
 */
public class SetMonitoringData implements JsonInterface {

    /**
     * An id SHALL only be given to replace an existing monitor.
     * The Charging Station handles the generation of id’s for new monitors.
     */
    @Optional
    private Integer id;

    /**
     * (2.1) When present, events from a monitor will be sent via a periodic event stream.
     * Used for monitors of type  Periodic ,  PeriodicClockAligned or  Delta.
     */
    @Optional
    private PeriodicEventStreamParams periodicEventStream;

    /**
     * Monitor only active when a transaction is ongoing on a component relevant to this transaction.
     * Default = false.
     */
    @Optional
    private Boolean transaction = false;

    /**
     * Value for threshold or delta monitoring. For Periodic or PeriodicClockAligned this is the interval in seconds.
     */
    @Required
    private Float value;

    /**
     * The type of this monitor, e.g. a threshold, delta or periodic monitor.
     */
    @Required
    private MonitorEnum type;

    /**
     * The severity that will be assigned to an event that is triggered by this monitor.
     * The severity range is 0-9, with 0 as the highest and 9 as the lowest severity level.
     * The severity levels have the following meaning:
     * <p> 0 - Danger Indicates lives are potentially in danger. Urgent attention is needed
     * and action should be taken immediately. </p>
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
     * Component for which monitor is set.
     */
    @Required
    private Component component;

    /**
     * Variable for which monitor is set.
     */
    @Required
    private Variable variable;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public SetMonitoringData() {
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public PeriodicEventStreamParams getPeriodicEventStream() {
        return periodicEventStream;
    }

    public void setPeriodicEventStream(PeriodicEventStreamParams periodicEventStream) {
        this.periodicEventStream = periodicEventStream;
    }


    public Boolean getTransaction() {
        return transaction;
    }


    public void setTransaction(Boolean transaction) {
        this.transaction = transaction;
    }


    public Float getValue() {
        return value;
    }


    public void setValue(Float value) {
        this.value = value;
    }


    public MonitorEnum getType() {
        return type;
    }


    public void setType(MonitorEnum type) {
        this.type = type;
    }


    public Integer getSeverity() {
        return severity;
    }


    public void setSeverity(Integer severity) {
        this.severity = severity;
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

        if (getId() != null) {
            json.addProperty("id", getId());
        }
        if (getPeriodicEventStream() != null) {
            json.add("periodicEventStream", getPeriodicEventStream().toJsonObject());
        }
        json.addProperty("value", getValue());

        json.addProperty("type", getType().toString());

        json.addProperty("severity", getSeverity());

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
        if (jsonObject.has("id")) {
            setId(jsonObject.get("id").getAsInt());
        }

        if (jsonObject.has("periodicEventStream")) {
            setPeriodicEventStream(new PeriodicEventStreamParams());
            getPeriodicEventStream().fromJsonObject(jsonObject.getAsJsonObject("periodicEventStream"));
        }

        if (jsonObject.has("value")) {
            setValue(jsonObject.get("value").getAsFloat());
        }

        if (jsonObject.has("type")) {
            setType(MonitorEnum.valueOf(jsonObject.get("type").getAsString()));
        }

        if (jsonObject.has("severity")) {
            setSeverity(jsonObject.get("severity").getAsInt());
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
        if (!(obj instanceof SetMonitoringData))
            return false;
        SetMonitoringData that = (SetMonitoringData) obj;
        return Objects.equals(this.severity, that.severity)
                && Objects.equals(this.component, that.component)
                && Objects.equals(this.variable, that.variable)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.id, that.id)
                && Objects.equals(this.periodicEventStream, that.periodicEventStream)
                && Objects.equals(this.type, that.type)
                && Objects.equals(this.value, that.value)
                && Objects.equals(this.transaction, that.transaction);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.severity != null ? this.severity.hashCode() : 0);
        result = 31 * result + (this.component != null ? this.component.hashCode() : 0);
        result = 31 * result + (this.variable != null ? this.variable.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
        result = 31 * result + (this.periodicEventStream != null ? this.periodicEventStream.hashCode() : 0);
        result = 31 * result + (this.type != null ? this.type.hashCode() : 0);
        result = 31 * result + (this.value != null ? this.value.hashCode() : 0);
        result = 31 * result + (this.transaction != null ? this.transaction.hashCode() : 0);
        return result;
    }
}
