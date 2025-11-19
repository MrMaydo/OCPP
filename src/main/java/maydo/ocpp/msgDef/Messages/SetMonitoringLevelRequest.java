package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class SetMonitoringLevelRequest implements JsonInterface {

    /**
     * The Charging Station SHALL only report events with a severity number lower than or equal to this severity.
     * The severity range is 0-9, with 0 as the highest and 9 as the lowest severity level.
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
     * <p>
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
    public SetMonitoringLevelRequest() {
    }

    /**
     * @param severity The Charging Station SHALL only report events with a severity number lower than or equal to this severity.
     *                 The severity range is 0-9, with 0 as the highest and 9 as the lowest severity level.
     *                 <p>
     *                 The severity levels have the following meaning: +
     *                 *0-Danger* +
     *                 Indicates lives are potentially in danger. Urgent attention is needed and action should be taken immediately. +
     *                 *1-Hardware Failure* +
     *                 Indicates that the Charging Station is unable to continue regular operations due to Hardware issues. Action is required. +
     *                 *2-System Failure* +
     *                 Indicates that the Charging Station is unable to continue regular operations due to software or minor hardware issues. Action is required. +
     *                 *3-Critical* +
     *                 Indicates a critical error. Action is required. +
     *                 *4-Error* +
     *                 Indicates a non-urgent error. Action is required. +
     *                 *5-Alert* +
     *                 Indicates an alert event. Default severity for any type of monitoring event.  +
     *                 *6-Warning* +
     *                 Indicates a warning event. Action may be required. +
     *                 *7-Notice* +
     *                 Indicates an unusual event. No immediate action is required. +
     *                 *8-Informational* +
     *                 Indicates a regular operational event. May be used for reporting, measuring throughput, etc. No action is required. +
     *                 *9-Debug* +
     *                 Indicates information useful to developers for debugging, not useful during operations.
     *                 <p>
     *                 <p>
     *                 .
     */
    public SetMonitoringLevelRequest(Integer severity, CustomData customData) {
        super();
        this.severity = severity;
        this.customData = customData;
    }

    /**
     * The Charging Station SHALL only report events with a severity number lower than or equal to this severity.
     * The severity range is 0-9, with 0 as the highest and 9 as the lowest severity level.
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
     * <p>
     * (Required)
     */
    public Integer getSeverity() {
        return severity;
    }

    /**
     * The Charging Station SHALL only report events with a severity number lower than or equal to this severity.
     * The severity range is 0-9, with 0 as the highest and 9 as the lowest severity level.
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
     * <p>
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
        if (!(obj instanceof SetMonitoringLevelRequest))
            return false;
        SetMonitoringLevelRequest that = (SetMonitoringLevelRequest) obj;
        return Objects.equals(this.severity, that.severity)
                && Objects.equals(this.customData, that.customData);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.severity != null ? this.severity.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        return result;
    }
}
