package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.Enumerations.MonitorEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.Objects;


/**
 * Class to hold parameters of SetVariableMonitoring request.
 */
public class SetMonitoringData implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
    /**
     * An id SHALL only be given to replace an existing monitor. The Charging Station handles the generation of id's for new monitors.
     */
    @Optional
    private Integer id;
    /**
     * Monitor only active when a transaction is ongoing on a component relevant to this transaction. Default = false.
     */
    @Optional
    private Boolean transaction = false;
    /**
     * Value for threshold or delta monitoring.
     * For Periodic or PeriodicClockAligned this is the interval in seconds.
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private Float value;
    /**
     * The type of this monitor, e.g. a threshold, delta or periodic monitor.
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private MonitorEnum type;
    /**
     * The severity that will be assigned to an event that is triggered by this monitor. The severity range is 0-9, with 0 as the highest and 9 as the lowest severity level.
     * <p>
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
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private Integer severity;
    /**
     * A physical or logical component
     * <p>
     * (Required)
     */
    @Required
    private Component component;
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
     * An id SHALL only be given to replace an existing monitor. The Charging Station handles the generation of id's for new monitors.
     */
    public Integer getId() {
        return id;
    }

    /**
     * An id SHALL only be given to replace an existing monitor. The Charging Station handles the generation of id's for new monitors.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Monitor only active when a transaction is ongoing on a component relevant to this transaction. Default = false.
     */
    public Boolean getTransaction() {
        return transaction;
    }

    /**
     * Monitor only active when a transaction is ongoing on a component relevant to this transaction. Default = false.
     */
    public void setTransaction(Boolean transaction) {
        this.transaction = transaction;
    }

    /**
     * Value for threshold or delta monitoring.
     * For Periodic or PeriodicClockAligned this is the interval in seconds.
     * <p>
     * <p>
     * (Required)
     */
    public Float getValue() {
        return value;
    }

    /**
     * Value for threshold or delta monitoring.
     * For Periodic or PeriodicClockAligned this is the interval in seconds.
     * <p>
     * <p>
     * (Required)
     */
    public void setValue(Float value) {
        this.value = value;
    }

    /**
     * The type of this monitor, e.g. a threshold, delta or periodic monitor.
     * <p>
     * <p>
     * (Required)
     */
    public MonitorEnum getType() {
        return type;
    }

    /**
     * The type of this monitor, e.g. a threshold, delta or periodic monitor.
     * <p>
     * <p>
     * (Required)
     */
    public void setType(MonitorEnum type) {
        this.type = type;
    }

    /**
     * The severity that will be assigned to an event that is triggered by this monitor. The severity range is 0-9, with 0 as the highest and 9 as the lowest severity level.
     * <p>
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
     * <p>
     * <p>
     * (Required)
     */
    public Integer getSeverity() {
        return severity;
    }

    /**
     * The severity that will be assigned to an event that is triggered by this monitor. The severity range is 0-9, with 0 as the highest and 9 as the lowest severity level.
     * <p>
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
     * <p>
     * <p>
     * (Required)
     */
    public void setSeverity(Integer severity) {
        this.severity = severity;
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
        if (!(obj instanceof SetMonitoringData))
            return false;
        SetMonitoringData that = (SetMonitoringData) obj;
        return Objects.equals(customData, that.customData)
                && Objects.equals(id, that.id)
                && Objects.equals(transaction, that.transaction)
                && Objects.equals(value, that.value)
                && type == that.type
                && Objects.equals(severity, that.severity)
                && Objects.equals(component, that.component)
                && Objects.equals(variable, that.variable);
    }

    @Override
    public int hashCode() {
        int result = (id != null ? id.hashCode() : 0);
        result = 31 * result + (transaction != null ? transaction.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (severity != null ? severity.hashCode() : 0);
        result = 31 * result + (component != null ? component.hashCode() : 0);
        result = 31 * result + (variable != null ? variable.hashCode() : 0);
        result = 31 * result + (customData != null ? customData.hashCode() : 0);
        return result;
    }
}
