package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.Enumerations.EventNotificationEnum;
import maydo.ocpp.msgDef.Enumerations.EventTriggerEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.Date;
import java.util.Objects;


/**
 * Class to report an event notification for a component-variable.
 */
public class EventData implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
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
     * Type of monitor that triggered this event, e.g. exceeding a threshold value.
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
     * Type of monitor that triggered this event, e.g. exceeding a threshold value.
     * <p>
     * <p>
     * (Required)
     */
    public EventTriggerEnum getTrigger() {
        return trigger;
    }

    /**
     * Type of monitor that triggered this event, e.g. exceeding a threshold value.
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

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject() {
        return JsonTools.toJsonObject(this);
    }

    @Override
    public void fromString(String jsonString) {
        JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
        fromJsonObject(jsonObject);
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        JsonTools.fromJsonObject(this, jsonObject);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof EventData))
            return false;
        EventData that = (EventData) obj;
        return Objects.equals(customData, that.customData)
                && Objects.equals(eventId, that.eventId)
                && Objects.equals(timestamp, that.timestamp)
                && trigger == that.trigger
                && Objects.equals(cause, that.cause)
                && Objects.equals(actualValue, that.actualValue)
                && Objects.equals(techCode, that.techCode)
                && Objects.equals(techInfo, that.techInfo)
                && Objects.equals(cleared, that.cleared)
                && Objects.equals(transactionId, that.transactionId)
                && Objects.equals(component, that.component)
                && Objects.equals(variableMonitoringId, that.variableMonitoringId)
                && eventNotificationType == that.eventNotificationType
                && Objects.equals(variable, that.variable);
    }

    @Override
    public int hashCode() {
        int result = (eventId != null ? eventId.hashCode() : 0);
        result = 31 * result + (timestamp != null ? timestamp.hashCode() : 0);
        result = 31 * result + (trigger != null ? trigger.hashCode() : 0);
        result = 31 * result + (cause != null ? cause.hashCode() : 0);
        result = 31 * result + (actualValue != null ? actualValue.hashCode() : 0);
        result = 31 * result + (techCode != null ? techCode.hashCode() : 0);
        result = 31 * result + (techInfo != null ? techInfo.hashCode() : 0);
        result = 31 * result + (cleared != null ? cleared.hashCode() : 0);
        result = 31 * result + (transactionId != null ? transactionId.hashCode() : 0);
        result = 31 * result + (component != null ? component.hashCode() : 0);
        result = 31 * result + (variableMonitoringId != null ? variableMonitoringId.hashCode() : 0);
        result = 31 * result + (eventNotificationType != null ? eventNotificationType.hashCode() : 0);
        result = 31 * result + (variable != null ? variable.hashCode() : 0);
        result = 31 * result + (customData != null ? customData.hashCode() : 0);
        return result;
    }
}
