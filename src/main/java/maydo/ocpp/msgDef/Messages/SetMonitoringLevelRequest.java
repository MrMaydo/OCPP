package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * This contains the field definition of the SetMonitoringLevelRequest PDU sent by the CSMS to the Charging Station.
 */
public class SetMonitoringLevelRequest implements JsonInterface {

    /**
     * The Charging Station SHALL only report events with a severity number lower than or equal to this severity.
     * The severity range is 0-9, with 0 as the highest and 9 as the lowest severity level.
     * The severity levels have the following meaning:
     * <p> 0 - Danger Indicates lives are potentially in danger. Urgent attention is needed and action should be taken immediately. </p>
     * <p> 1 - Hardware Failure Indicates that the Charging Station is unable to continue regular operations due to Hardware issues. Action is required. </p>
     * <p> 2 - System Failure Indicates that the Charging Station is unable to continue regular operations due to software or minor hardware issues. Action is required. </p>
     * <p> 3 - Critical Indicates a critical error. Action is required. </p>
     * <p> 4 - Error Indicates a non-urgent error. Action is required. </p>
     * <p> 5 - Alert Indicates an alert event. Default severity for any type of monitoring event. </p>
     * <p> 6 - Warning Indicates a warning event. Action may be required. </p>
     * <p> 7 - Notice Indicates an unusual event. No immediate action is required. </p>
     * <p> 8 - Informational Indicates a regular operational event. May be used for reporting, measuring throughput, etc. No action is required. </p>
     * <p> 9 - Debug Indicates information useful to developers for debugging, not useful during operations. </p>
     */
    @Required
    private Integer severity;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public SetMonitoringLevelRequest() {
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
        if (!(obj instanceof SetMonitoringLevelRequest))
            return false;
        SetMonitoringLevelRequest that = (SetMonitoringLevelRequest) obj;
        return Objects.equals(this.severity, that.severity)
                && Objects.equals(this.customData, that.customData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getSeverity(),
                getCustomData()
        );
    }
}
