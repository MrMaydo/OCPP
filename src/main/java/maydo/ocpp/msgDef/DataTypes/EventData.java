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

public class EventData implements JsonInterface {

    /**
     * Identifies the event. This field can be referred to as a cause by other events.
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private Integer eventId;
    /**
     * Timestamp of the moment the report was generated.
     * <p>
     * (Required)
     */
    @Required
    private Date timestamp;
    /**
     * Type of trigger for this event, e.g. exceeding a threshold value.
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private EventTriggerEnum trigger;
    /**
     * Refers to the Id of an event that is considered to be the cause for this event.
     */
    @Optional
    private Integer cause;
    /**
     * Actual value (_attributeType_ Actual) of the variable.
     * <p>
     * The Configuration Variable &lt;&lt;configkey-reporting-value-size,ReportingValueSize&gt;&gt; can be used to limit GetVariableResult.attributeValue, VariableAttribute.value and EventData.actualValue. The max size of these values will always remain equal.
     * <p>
     * <p>
     * (Required)
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
     * _Cleared_ is set to true to report the clearing of a monitored situation, i.e. a 'return to normal'.
     */
    @Optional
    private Boolean cleared;
    /**
     * If an event notification is linked to a specific transaction, this field can be used to specify its transactionId.
     */
    @Optional
    private String transactionId;
    /**
     * A physical or logical component
     * <p>
     * (Required)
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
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private EventNotificationEnum eventNotificationType;
    /**
     * Reference key to a component-variable.
     * <p>
     * (Required)
     */
    @Required
    private Variable variable;
    /**
     * *(2.1)* Severity associated with the monitor in _variableMonitoringId_ or with the hardwired notification.
     */
    @Optional
    private Integer severity;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public EventData() {
    }

    /**
     * @param severity             *(2.1)* Severity associated with the monitor in _variableMonitoringId_ or with the hardwired notification.
     *                             .
     * @param eventId              Identifies the event. This field can be referred to as a cause by other events.
     *                             <p>
     *                             .
     * @param techCode             Technical (error) code as reported by component.
     *                             .
     * @param variableMonitoringId Identifies the VariableMonitoring which triggered the event.
     *                             .
     * @param actualValue          Actual value (_attributeType_ Actual) of the variable.
     *                             <p>
     *                             The Configuration Variable &lt;&lt;configkey-reporting-value-size,ReportingValueSize&gt;&gt; can be used to limit GetVariableResult.attributeValue, VariableAttribute.value and EventData.actualValue. The max size of these values will always remain equal.
     *                             <p>
     *                             .
     * @param cause                Refers to the Id of an event that is considered to be the cause for this event.
     *                             <p>
     *                             .
     * @param techInfo             Technical detail information as reported by component.
     *                             .
     * @param cleared              _Cleared_ is set to true to report the clearing of a monitored situation, i.e. a 'return to normal'.
     *                             <p>
     *                             .
     * @param transactionId        If an event notification is linked to a specific transaction, this field can be used to specify its transactionId.
     *                             .
     * @param timestamp            Timestamp of the moment the report was generated.
     *                             .
     */
    public EventData(Integer eventId, Date timestamp, EventTriggerEnum trigger, Integer cause, String actualValue, String techCode, String techInfo, Boolean cleared, String transactionId, Component component, Integer variableMonitoringId, EventNotificationEnum eventNotificationType, Variable variable, Integer severity, CustomData customData) {
        super();
        this.eventId = eventId;
        this.timestamp = timestamp;
        this.trigger = trigger;
        this.cause = cause;
        this.actualValue = actualValue;
        this.techCode = techCode;
        this.techInfo = techInfo;
        this.cleared = cleared;
        this.transactionId = transactionId;
        this.component = component;
        this.variableMonitoringId = variableMonitoringId;
        this.eventNotificationType = eventNotificationType;
        this.variable = variable;
        this.severity = severity;
        this.customData = customData;
    }

    /**
     * Identifies the event. This field can be referred to as a cause by other events.
     * <p>
     * <p>
     * (Required)
     */
    public Integer getEventId() {
        return eventId;
    }

    /**
     * Identifies the event. This field can be referred to as a cause by other events.
     * <p>
     * <p>
     * (Required)
     */
    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    /**
     * Timestamp of the moment the report was generated.
     * <p>
     * (Required)
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
     * Timestamp of the moment the report was generated.
     * <p>
     * (Required)
     */
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Type of trigger for this event, e.g. exceeding a threshold value.
     * <p>
     * <p>
     * (Required)
     */
    public EventTriggerEnum getTrigger() {
        return trigger;
    }

    /**
     * Type of trigger for this event, e.g. exceeding a threshold value.
     * <p>
     * <p>
     * (Required)
     */
    public void setTrigger(EventTriggerEnum trigger) {
        this.trigger = trigger;
    }

    /**
     * Refers to the Id of an event that is considered to be the cause for this event.
     */
    public Integer getCause() {
        return cause;
    }

    /**
     * Refers to the Id of an event that is considered to be the cause for this event.
     */
    public void setCause(Integer cause) {
        this.cause = cause;
    }

    /**
     * Actual value (_attributeType_ Actual) of the variable.
     * <p>
     * The Configuration Variable &lt;&lt;configkey-reporting-value-size,ReportingValueSize&gt;&gt; can be used to limit GetVariableResult.attributeValue, VariableAttribute.value and EventData.actualValue. The max size of these values will always remain equal.
     * <p>
     * <p>
     * (Required)
     */
    public String getActualValue() {
        return actualValue;
    }

    /**
     * Actual value (_attributeType_ Actual) of the variable.
     * <p>
     * The Configuration Variable &lt;&lt;configkey-reporting-value-size,ReportingValueSize&gt;&gt; can be used to limit GetVariableResult.attributeValue, VariableAttribute.value and EventData.actualValue. The max size of these values will always remain equal.
     * <p>
     * <p>
     * (Required)
     */
    public void setActualValue(String actualValue) {
        this.actualValue = actualValue;
    }

    /**
     * Technical (error) code as reported by component.
     */
    public String getTechCode() {
        return techCode;
    }

    /**
     * Technical (error) code as reported by component.
     */
    public void setTechCode(String techCode) {
        this.techCode = techCode;
    }

    /**
     * Technical detail information as reported by component.
     */
    public String getTechInfo() {
        return techInfo;
    }

    /**
     * Technical detail information as reported by component.
     */
    public void setTechInfo(String techInfo) {
        this.techInfo = techInfo;
    }

    /**
     * _Cleared_ is set to true to report the clearing of a monitored situation, i.e. a 'return to normal'.
     */
    public Boolean getCleared() {
        return cleared;
    }

    /**
     * _Cleared_ is set to true to report the clearing of a monitored situation, i.e. a 'return to normal'.
     */
    public void setCleared(Boolean cleared) {
        this.cleared = cleared;
    }

    /**
     * If an event notification is linked to a specific transaction, this field can be used to specify its transactionId.
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * If an event notification is linked to a specific transaction, this field can be used to specify its transactionId.
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * A physical or logical component
     * <p>
     * (Required)
     */
    public Component getComponent() {
        return component;
    }

    /**
     * A physical or logical component
     * <p>
     * (Required)
     */
    public void setComponent(Component component) {
        this.component = component;
    }

    /**
     * Identifies the VariableMonitoring which triggered the event.
     */
    public Integer getVariableMonitoringId() {
        return variableMonitoringId;
    }

    /**
     * Identifies the VariableMonitoring which triggered the event.
     */
    public void setVariableMonitoringId(Integer variableMonitoringId) {
        this.variableMonitoringId = variableMonitoringId;
    }

    /**
     * Specifies the event notification type of the message.
     * <p>
     * <p>
     * (Required)
     */
    public EventNotificationEnum getEventNotificationType() {
        return eventNotificationType;
    }

    /**
     * Specifies the event notification type of the message.
     * <p>
     * <p>
     * (Required)
     */
    public void setEventNotificationType(EventNotificationEnum eventNotificationType) {
        this.eventNotificationType = eventNotificationType;
    }

    /**
     * Reference key to a component-variable.
     * <p>
     * (Required)
     */
    public Variable getVariable() {
        return variable;
    }

    /**
     * Reference key to a component-variable.
     * <p>
     * (Required)
     */
    public void setVariable(Variable variable) {
        this.variable = variable;
    }

    /**
     * *(2.1)* Severity associated with the monitor in _variableMonitoringId_ or with the hardwired notification.
     */
    public Integer getSeverity() {
        return severity;
    }

    /**
     * *(2.1)* Severity associated with the monitor in _variableMonitoringId_ or with the hardwired notification.
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
        JsonObject json = new JsonObject();
        json.addProperty("eventId", eventId);
        json.addProperty("timestamp", new SimpleDateFormat(DATE_FORMAT).format(timestamp));
        json.addProperty("trigger", trigger.toString());
        json.addProperty("cause", cause);
        json.addProperty("actualValue", actualValue);
        json.addProperty("techCode", techCode);
        json.addProperty("techInfo", techInfo);
        json.addProperty("cleared", cleared);
        json.addProperty("transactionId", transactionId);
        json.add("component", component.toJsonObject());
        json.addProperty("variableMonitoringId", variableMonitoringId);
        json.addProperty("eventNotificationType", eventNotificationType.toString());
        json.add("variable", variable.toJsonObject());
        json.addProperty("severity", severity);
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
        if (jsonObject.has("eventId")) {
            this.eventId = jsonObject.get("eventId").getAsInt();
        }

        if (jsonObject.has("timestamp")) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                this.timestamp = dateFormat.parse(jsonObject.get("timestamp").getAsString());
            } catch (ParseException e) {
                System.out.println("Invalid date format for timestamp" + e);
            }
        }

        if (jsonObject.has("trigger")) {
            this.trigger = EventTriggerEnum.valueOf(jsonObject.get("trigger").getAsString());
        }

        if (jsonObject.has("cause")) {
            this.cause = jsonObject.get("cause").getAsInt();
        }

        if (jsonObject.has("actualValue")) {
            this.actualValue = jsonObject.get("actualValue").getAsString();
        }

        if (jsonObject.has("techCode")) {
            this.techCode = jsonObject.get("techCode").getAsString();
        }

        if (jsonObject.has("techInfo")) {
            this.techInfo = jsonObject.get("techInfo").getAsString();
        }

        if (jsonObject.has("cleared")) {
            this.cleared = jsonObject.get("cleared").getAsBoolean();
        }

        if (jsonObject.has("transactionId")) {
            this.transactionId = jsonObject.get("transactionId").getAsString();
        }

        if (jsonObject.has("component")) {
            this.component = new Component();
            this.component.fromJsonObject(jsonObject.getAsJsonObject("component"));
        }

        if (jsonObject.has("variableMonitoringId")) {
            this.variableMonitoringId = jsonObject.get("variableMonitoringId").getAsInt();
        }

        if (jsonObject.has("eventNotificationType")) {
            this.eventNotificationType = EventNotificationEnum.valueOf(jsonObject.get("eventNotificationType").getAsString());
        }

        if (jsonObject.has("variable")) {
            this.variable = new Variable();
            this.variable.fromJsonObject(jsonObject.getAsJsonObject("variable"));
        }

        if (jsonObject.has("severity")) {
            this.severity = jsonObject.get("severity").getAsInt();
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
        if (!(obj instanceof EventData))
            return false;
        EventData that = (EventData) obj;
        return Objects.equals(this.severity, that.severity)
                && Objects.equals(this.eventId, that.eventId)
                && Objects.equals(this.techCode, that.techCode)
                && Objects.equals(this.actualValue, that.actualValue)
                && Objects.equals(this.cause, that.cause)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.trigger, that.trigger)
                && Objects.equals(this.techInfo, that.techInfo)
                && Objects.equals(this.transactionId, that.transactionId)
                && Objects.equals(this.component, that.component)
                && Objects.equals(this.variableMonitoringId, that.variableMonitoringId)
                && Objects.equals(this.variable, that.variable)
                && Objects.equals(this.eventNotificationType, that.eventNotificationType)
                && Objects.equals(this.cleared, that.cleared)
                && Objects.equals(this.timestamp, that.timestamp);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.severity != null ? this.severity.hashCode() : 0);
        result = 31 * result + (this.eventId != null ? this.eventId.hashCode() : 0);
        result = 31 * result + (this.techCode != null ? this.techCode.hashCode() : 0);
        result = 31 * result + (this.actualValue != null ? this.actualValue.hashCode() : 0);
        result = 31 * result + (this.cause != null ? this.cause.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.trigger != null ? this.trigger.hashCode() : 0);
        result = 31 * result + (this.techInfo != null ? this.techInfo.hashCode() : 0);
        result = 31 * result + (this.transactionId != null ? this.transactionId.hashCode() : 0);
        result = 31 * result + (this.component != null ? this.component.hashCode() : 0);
        result = 31 * result + (this.variableMonitoringId != null ? this.variableMonitoringId.hashCode() : 0);
        result = 31 * result + (this.variable != null ? this.variable.hashCode() : 0);
        result = 31 * result + (this.eventNotificationType != null ? this.eventNotificationType.hashCode() : 0);
        result = 31 * result + (this.cleared != null ? this.cleared.hashCode() : 0);
        result = 31 * result + (this.timestamp != null ? this.timestamp.hashCode() : 0);
        return result;
    }
}
