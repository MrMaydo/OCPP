package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.Enumerations.EventNotificationEnum;
import maydo.ocpp.msgDef.Enumerations.EventTriggerEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

import static maydo.ocpp.config.Configuration.DATE_FORMAT;

/**
 * Class to report an event notification for a component-variable.
 */
public class EventData implements JsonInterface {

    /**
     * Identifies the event. This field can be referred to as a cause by other events.
     */
    @Required
    private Integer eventId;

    /**
     * Timestamp of the moment the report was generated.
     */
    @Required
    private Date timestamp;

    /**
     * Type of trigger for this event, e.g. exceeding a threshold value.
     */
    @Required
    private EventTriggerEnum trigger;

    /**
     * Refers to the Id of an event that is considered to be the cause for this event.
     */
    @Optional
    private Integer cause;

    /**
     * Actual value (attributeType Actual) of the variable.
     * The Configuration Variable ReportingValueSize can be used to limit GetVariableResult.attributeValue,
     * VariableAttribute.value and EventData.actualValue.
     * The max size of these values will always remain equal.
     */
    @Required
    private String actualValue;

    /**
     * Technical (error) code as reported by component.
     */
    @Optional
    private String techCode;

    /**
     * Technical detail information as reported by component.
     */
    @Optional
    private String techInfo;

    /**
     * Cleared is set to true to report the clearing of a monitored situation, i.e. a 'return to normal'.
     */
    @Optional
    private Boolean cleared;

    /**
     * If an event notification is linked to a specific transaction, this field can be used to specify its transactionId.
     */
    @Optional
    private String transactionId;

    /**
     * Component for which event is notified.
     */
    @Required
    private Component component;

    /**
     * Identifies the VariableMonitoring which triggered the event.
     */
    @Optional
    private Integer variableMonitoringId;

    /**
     * Specifies the event notification type of the message.
     */
    @Required
    private EventNotificationEnum eventNotificationType;

    /**
     * Variable for which event is notified.
     */
    @Required
    private Variable variable;

    /**
     * (2.1) Severity associated with the monitor in variableMonitoringId or with the hardwired notification.
     */
    @Optional
    private Integer severity;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public EventData() {
    }


    public Integer getEventId() {
        return eventId;
    }


    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }


    public Date getTimestamp() {
        return timestamp;
    }


    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }


    public EventTriggerEnum getTrigger() {
        return trigger;
    }


    public void setTrigger(EventTriggerEnum trigger) {
        this.trigger = trigger;
    }


    public Integer getCause() {
        return cause;
    }


    public void setCause(Integer cause) {
        this.cause = cause;
    }


    public String getActualValue() {
        return actualValue;
    }


    public void setActualValue(String actualValue) {
        this.actualValue = actualValue;
    }


    public String getTechCode() {
        return techCode;
    }


    public void setTechCode(String techCode) {
        this.techCode = techCode;
    }


    public String getTechInfo() {
        return techInfo;
    }


    public void setTechInfo(String techInfo) {
        this.techInfo = techInfo;
    }


    public Boolean getCleared() {
        return cleared;
    }


    public void setCleared(Boolean cleared) {
        this.cleared = cleared;
    }


    public String getTransactionId() {
        return transactionId;
    }


    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }


    public Component getComponent() {
        return component;
    }


    public void setComponent(Component component) {
        this.component = component;
    }


    public Integer getVariableMonitoringId() {
        return variableMonitoringId;
    }


    public void setVariableMonitoringId(Integer variableMonitoringId) {
        this.variableMonitoringId = variableMonitoringId;
    }


    public EventNotificationEnum getEventNotificationType() {
        return eventNotificationType;
    }


    public void setEventNotificationType(EventNotificationEnum eventNotificationType) {
        this.eventNotificationType = eventNotificationType;
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

        json.addProperty("eventId", getEventId());

        json.addProperty("timestamp", new SimpleDateFormat(DATE_FORMAT).format(getTimestamp()));

        json.addProperty("trigger", getTrigger().toString());

        if (getCause() != null) {
            json.addProperty("cause", getCause());
        }
        json.addProperty("actualValue", getActualValue());

        if (getTechCode() != null) {
            json.addProperty("techCode", getTechCode());
        }
        if (getTechInfo() != null) {
            json.addProperty("techInfo", getTechInfo());
        }
        if (getCleared() != null) {
            json.addProperty("cleared", getCleared());
        }
        if (getTransactionId() != null) {
            json.addProperty("transactionId", getTransactionId());
        }
        json.add("component", getComponent().toJsonObject());

        if (getVariableMonitoringId() != null) {
            json.addProperty("variableMonitoringId", getVariableMonitoringId());
        }
        json.addProperty("eventNotificationType", getEventNotificationType().toString());

        json.add("variable", getVariable().toJsonObject());

        if (getSeverity() != null) {
            json.addProperty("severity", getSeverity());
        }
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
        if (jsonObject.has("eventId")) {
            setEventId(jsonObject.get("eventId").getAsInt());
        }

        if (jsonObject.has("timestamp")) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                setTimestamp(dateFormat.parse(jsonObject.get("timestamp").getAsString()));
            } catch (ParseException e) {
                System.out.println("Invalid date format for timestamp" + e);
            }
        }

        if (jsonObject.has("trigger")) {
            setTrigger(EventTriggerEnum.valueOf(jsonObject.get("trigger").getAsString()));
        }

        if (jsonObject.has("cause")) {
            setCause(jsonObject.get("cause").getAsInt());
        }

        if (jsonObject.has("actualValue")) {
            setActualValue(jsonObject.get("actualValue").getAsString());
        }

        if (jsonObject.has("techCode")) {
            setTechCode(jsonObject.get("techCode").getAsString());
        }

        if (jsonObject.has("techInfo")) {
            setTechInfo(jsonObject.get("techInfo").getAsString());
        }

        if (jsonObject.has("cleared")) {
            setCleared(jsonObject.get("cleared").getAsBoolean());
        }

        if (jsonObject.has("transactionId")) {
            setTransactionId(jsonObject.get("transactionId").getAsString());
        }

        if (jsonObject.has("component")) {
            setComponent(new Component());
            getComponent().fromJsonObject(jsonObject.getAsJsonObject("component"));
        }

        if (jsonObject.has("variableMonitoringId")) {
            setVariableMonitoringId(jsonObject.get("variableMonitoringId").getAsInt());
        }

        if (jsonObject.has("eventNotificationType")) {
            setEventNotificationType(EventNotificationEnum.valueOf(jsonObject.get("eventNotificationType").getAsString()));
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
        if (!(obj instanceof EventData))
            return false;
        EventData that = (EventData) obj;
        return Objects.equals(getEventId(), that.getEventId())
                && Objects.equals(getTimestamp(), that.getTimestamp())
                && Objects.equals(getTrigger(), that.getTrigger())
                && Objects.equals(getCause(), that.getCause())
                && Objects.equals(getActualValue(), that.getActualValue())
                && Objects.equals(getTechCode(), that.getTechCode())
                && Objects.equals(getTechInfo(), that.getTechInfo())
                && Objects.equals(getCleared(), that.getCleared())
                && Objects.equals(getTransactionId(), that.getTransactionId())
                && Objects.equals(getComponent(), that.getComponent())
                && Objects.equals(getVariableMonitoringId(), that.getVariableMonitoringId())
                && Objects.equals(getEventNotificationType(), that.getEventNotificationType())
                && Objects.equals(getVariable(), that.getVariable())
                && Objects.equals(getSeverity(), that.getSeverity())
                && Objects.equals(getCustomData(), that.getCustomData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getEventId(),
                getTimestamp(),
                getTrigger(),
                getCause(),
                getActualValue(),
                getTechCode(),
                getTechInfo(),
                getCleared(),
                getTransactionId(),
                getComponent(),
                getVariableMonitoringId(),
                getEventNotificationType(),
                getVariable(),
                getSeverity(),
                getCustomData()
        );
    }
}
