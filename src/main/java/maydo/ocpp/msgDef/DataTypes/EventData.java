
package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.Enumerations.EventNotificationEnum;
import maydo.ocpp.msgDef.Enumerations.EventTriggerEnum;
import maydo.ocpp.msgDef.JsonInterface;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.annotation.Generated;

import static maydo.ocpp.config.Configuration.DATE_FORMAT;


/**
 * Class to report an event notification for a component-variable.
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class EventData implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * Identifies the event. This field can be referred to as a cause by other events.
     * 
     * 
     * (Required)
     * 
     */
    private Integer eventId;
    /**
     * Timestamp of the moment the report was generated.
     * 
     * (Required)
     * 
     */
    private Date timestamp;
    /**
     * Type of monitor that triggered this event, e.g. exceeding a threshold value.
     * 
     * 
     * (Required)
     * 
     */
    private EventTriggerEnum trigger;
    /**
     * Refers to the Id of an event that is considered to be the cause for this event.
     * 
     * 
     * 
     */
    private Integer cause;
    /**
     * Actual value (_attributeType_ Actual) of the variable.
     * 
     * The Configuration Variable &lt;&lt;configkey-reporting-value-size,ReportingValueSize&gt;&gt; can be used to limit GetVariableResult.attributeValue, VariableAttribute.value and EventData.actualValue. The max size of these values will always remain equal. 
     * 
     * 
     * (Required)
     * 
     */
    private String actualValue;
    /**
     * Technical (error) code as reported by component.
     * 
     * 
     */
    private String techCode;
    /**
     * Technical detail information as reported by component.
     * 
     * 
     */
    private String techInfo;
    /**
     * _Cleared_ is set to true to report the clearing of a monitored situation, i.e. a 'return to normal'. 
     * 
     * 
     * 
     */
    private Boolean cleared;
    /**
     * If an event notification is linked to a specific transaction, this field can be used to specify its transactionId.
     * 
     * 
     */
    private String transactionId;
    /**
     * A physical or logical component
     * 
     * (Required)
     * 
     */
    private Component component;
    /**
     * Identifies the VariableMonitoring which triggered the event.
     * 
     * 
     */
    private Integer variableMonitoringId;
    /**
     * Specifies the event notification type of the message.
     * 
     * 
     * (Required)
     * 
     */
    private EventNotificationEnum eventNotificationType;
    /**
     * Reference key to a component-variable.
     * 
     * (Required)
     * 
     */
    private Variable variable;

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

    /**
     * Identifies the event. This field can be referred to as a cause by other events.
     * 
     * 
     * (Required)
     * 
     */
    public Integer getEventId() {
        return eventId;
    }

    /**
     * Identifies the event. This field can be referred to as a cause by other events.
     * 
     * 
     * (Required)
     * 
     */
    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    /**
     * Timestamp of the moment the report was generated.
     * 
     * (Required)
     * 
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
     * Timestamp of the moment the report was generated.
     * 
     * (Required)
     * 
     */
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Type of monitor that triggered this event, e.g. exceeding a threshold value.
     * 
     * 
     * (Required)
     * 
     */
    public EventTriggerEnum getTrigger() {
        return trigger;
    }

    /**
     * Type of monitor that triggered this event, e.g. exceeding a threshold value.
     * 
     * 
     * (Required)
     * 
     */
    public void setTrigger(EventTriggerEnum trigger) {
        this.trigger = trigger;
    }

    /**
     * Refers to the Id of an event that is considered to be the cause for this event.
     * 
     * 
     * 
     */
    public Integer getCause() {
        return cause;
    }

    /**
     * Refers to the Id of an event that is considered to be the cause for this event.
     * 
     * 
     * 
     */
    public void setCause(Integer cause) {
        this.cause = cause;
    }

    /**
     * Actual value (_attributeType_ Actual) of the variable.
     * 
     * The Configuration Variable &lt;&lt;configkey-reporting-value-size,ReportingValueSize&gt;&gt; can be used to limit GetVariableResult.attributeValue, VariableAttribute.value and EventData.actualValue. The max size of these values will always remain equal. 
     * 
     * 
     * (Required)
     * 
     */
    public String getActualValue() {
        return actualValue;
    }

    /**
     * Actual value (_attributeType_ Actual) of the variable.
     * 
     * The Configuration Variable &lt;&lt;configkey-reporting-value-size,ReportingValueSize&gt;&gt; can be used to limit GetVariableResult.attributeValue, VariableAttribute.value and EventData.actualValue. The max size of these values will always remain equal. 
     * 
     * 
     * (Required)
     * 
     */
    public void setActualValue(String actualValue) {
        this.actualValue = actualValue;
    }

    /**
     * Technical (error) code as reported by component.
     * 
     * 
     */
    public String getTechCode() {
        return techCode;
    }

    /**
     * Technical (error) code as reported by component.
     * 
     * 
     */
    public void setTechCode(String techCode) {
        this.techCode = techCode;
    }

    /**
     * Technical detail information as reported by component.
     * 
     * 
     */
    public String getTechInfo() {
        return techInfo;
    }

    /**
     * Technical detail information as reported by component.
     * 
     * 
     */
    public void setTechInfo(String techInfo) {
        this.techInfo = techInfo;
    }

    /**
     * _Cleared_ is set to true to report the clearing of a monitored situation, i.e. a 'return to normal'. 
     * 
     * 
     * 
     */
    public Boolean getCleared() {
        return cleared;
    }

    /**
     * _Cleared_ is set to true to report the clearing of a monitored situation, i.e. a 'return to normal'. 
     * 
     * 
     * 
     */
    public void setCleared(Boolean cleared) {
        this.cleared = cleared;
    }

    /**
     * If an event notification is linked to a specific transaction, this field can be used to specify its transactionId.
     * 
     * 
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * If an event notification is linked to a specific transaction, this field can be used to specify its transactionId.
     * 
     * 
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * A physical or logical component
     * 
     * (Required)
     * 
     */
    public Component getComponent() {
        return component;
    }

    /**
     * A physical or logical component
     * 
     * (Required)
     * 
     */
    public void setComponent(Component component) {
        this.component = component;
    }

    /**
     * Identifies the VariableMonitoring which triggered the event.
     * 
     * 
     */
    public Integer getVariableMonitoringId() {
        return variableMonitoringId;
    }

    /**
     * Identifies the VariableMonitoring which triggered the event.
     * 
     * 
     */
    public void setVariableMonitoringId(Integer variableMonitoringId) {
        this.variableMonitoringId = variableMonitoringId;
    }

    /**
     * Specifies the event notification type of the message.
     * 
     * 
     * (Required)
     * 
     */
    public EventNotificationEnum getEventNotificationType() {
        return eventNotificationType;
    }

    /**
     * Specifies the event notification type of the message.
     * 
     * 
     * (Required)
     * 
     */
    public void setEventNotificationType(EventNotificationEnum eventNotificationType) {
        this.eventNotificationType = eventNotificationType;
    }

    /**
     * Reference key to a component-variable.
     * 
     * (Required)
     * 
     */
    public Variable getVariable() {
        return variable;
    }

    /**
     * Reference key to a component-variable.
     * 
     * (Required)
     * 
     */
    public void setVariable(Variable variable) {
        this.variable = variable;
    }

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonElement toJsonObject(){
        JsonElement jsonObject= new Gson().toJsonTree(this);
        return jsonObject;
    }
}
