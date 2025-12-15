package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.Enumerations.EventNotificationEnum;
import maydo.ocpp.msgDef.Enumerations.MonitorEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * A monitoring setting for a variable.
 */
public class VariableMonitoring implements JsonInterface {

    /**
     * Identifies the monitor.
     */
    @Required
    private Integer id;

    /**
     * Monitor only active when a transaction is ongoing on a component relevant to this transaction.
     */
    @Required
    private Boolean transaction;

    /**
     * Value for threshold or delta monitoring. For Periodic or PeriodicClockAligned this is the interval in seconds
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
     * <p> 0 - Danger Indicates lives are potentially in danger. Urgent attention is needed and action should be taken immediately. </p>
     * <p> 1 - Hardware Failure Indicates that the Charging Station is unable to continue regular operations
     * due to Hardware issues. Action is required. </p>
     * <p> 2 - System Failure Indicates that the Charging Station is unable to continue regular operations
     * due to software or minor hardware issues. Action is required. </p>
     * <p> 3 - Critical Indicates a critical error. Action is required. </p>
     * <p> 4 - Error Indicates a non-urgent error. Action is required. </p>
     * <p> 5 - Alert Indicates an alert event. Default severity for any type of monitoring event. </p>
     * <p> 6 - Warning Indicates a warning event. Action may be required. </p>
     * <p> 7 - Notice Indicates an unusual event. No immediate action is required. </p>
     * <p> 8 - Informational Indicates a regular operational event. May be used for reporting, measuring throughput, etc.
     * No action is required. </p>
     * <p> 9 - Debug Indicates information useful to developers for debugging, not useful during operations. </p>
     */
    @Required
    private Integer severity;

    /**
     * (2.1) Type of monitor.
     */
    @Required
    private EventNotificationEnum eventNotificationType;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public VariableMonitoring() {
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
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


    public EventNotificationEnum getEventNotificationType() {
        return eventNotificationType;
    }


    public void setEventNotificationType(EventNotificationEnum eventNotificationType) {
        this.eventNotificationType = eventNotificationType;
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

        json.addProperty("id", getId());

        json.addProperty("transaction", getTransaction());

        json.addProperty("value", getValue());

        json.addProperty("type", getType().toString());

        json.addProperty("severity", getSeverity());

        json.addProperty("eventNotificationType", getEventNotificationType().toString());

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

        if (jsonObject.has("transaction")) {
            setTransaction(jsonObject.get("transaction").getAsBoolean());
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

        if (jsonObject.has("eventNotificationType")) {
            setEventNotificationType(EventNotificationEnum.valueOf(jsonObject.get("eventNotificationType").getAsString()));
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
        if (!(obj instanceof VariableMonitoring))
            return false;
        VariableMonitoring that = (VariableMonitoring) obj;
        return Objects.equals(this.severity, that.severity)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.id, that.id)
                && Objects.equals(this.eventNotificationType, that.eventNotificationType)
                && Objects.equals(this.type, that.type)
                && Objects.equals(this.value, that.value)
                && Objects.equals(this.transaction, that.transaction);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.severity != null ? this.severity.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
        result = 31 * result + (this.eventNotificationType != null ? this.eventNotificationType.hashCode() : 0);
        result = 31 * result + (this.type != null ? this.type.hashCode() : 0);
        result = 31 * result + (this.value != null ? this.value.hashCode() : 0);
        result = 31 * result + (this.transaction != null ? this.transaction.hashCode() : 0);
        return result;
    }
}
