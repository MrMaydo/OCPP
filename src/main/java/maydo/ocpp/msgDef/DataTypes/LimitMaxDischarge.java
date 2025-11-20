package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

import static maydo.ocpp.config.Configuration.DATE_FORMAT;

public class LimitMaxDischarge implements JsonInterface {

    /**
     * Priority of setting (0=highest)
     * <p>
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private Integer priority;
    /**
     * Only for PowerMonitoring. +
     * The value specifies a percentage (0 to 100) of the rated maximum discharge power of EV.
     * The PowerMonitoring curve becomes active when power exceeds this percentage.
     */
    @Optional
    private Float pctMaxDischargePower;
    @Optional
    private DERCurve powerMonitoringMustTrip;
    /**
     * Time when this setting becomes active
     */
    @Optional
    private Date startTime;
    /**
     * Duration in seconds that this setting is active
     */
    @Optional
    private Float duration;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public LimitMaxDischarge() {
    }

    /**
     * @param duration             Duration in seconds that this setting is active
     *                             <p>
     *                             <p>
     *                             .
     * @param startTime            Time when this setting becomes active
     *                             <p>
     *                             <p>
     *                             .
     * @param priority             Priority of setting (0=highest)
     *                             <p>
     *                             <p>
     *                             .
     * @param pctMaxDischargePower Only for PowerMonitoring. +
     *                             The value specifies a percentage (0 to 100) of the rated maximum discharge power of EV.
     *                             The PowerMonitoring curve becomes active when power exceeds this percentage.
     *                             <p>
     *                             <p>
     *                             .
     */
    public LimitMaxDischarge(Integer priority, Float pctMaxDischargePower, DERCurve powerMonitoringMustTrip, Date startTime, Float duration, CustomData customData) {
        super();
        this.priority = priority;
        this.pctMaxDischargePower = pctMaxDischargePower;
        this.powerMonitoringMustTrip = powerMonitoringMustTrip;
        this.startTime = startTime;
        this.duration = duration;
        this.customData = customData;
    }

    /**
     * Priority of setting (0=highest)
     * <p>
     * <p>
     * <p>
     * (Required)
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * Priority of setting (0=highest)
     * <p>
     * <p>
     * <p>
     * (Required)
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * Only for PowerMonitoring. +
     * The value specifies a percentage (0 to 100) of the rated maximum discharge power of EV.
     * The PowerMonitoring curve becomes active when power exceeds this percentage.
     */
    public Float getPctMaxDischargePower() {
        return pctMaxDischargePower;
    }

    /**
     * Only for PowerMonitoring. +
     * The value specifies a percentage (0 to 100) of the rated maximum discharge power of EV.
     * The PowerMonitoring curve becomes active when power exceeds this percentage.
     */
    public void setPctMaxDischargePower(Float pctMaxDischargePower) {
        this.pctMaxDischargePower = pctMaxDischargePower;
    }

    public DERCurve getPowerMonitoringMustTrip() {
        return powerMonitoringMustTrip;
    }

    public void setPowerMonitoringMustTrip(DERCurve powerMonitoringMustTrip) {
        this.powerMonitoringMustTrip = powerMonitoringMustTrip;
    }

    /**
     * Time when this setting becomes active
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * Time when this setting becomes active
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * Duration in seconds that this setting is active
     */
    public Float getDuration() {
        return duration;
    }

    /**
     * Duration in seconds that this setting is active
     */
    public void setDuration(Float duration) {
        this.duration = duration;
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
        json.addProperty("priority", priority);
        json.addProperty("pctMaxDischargePower", pctMaxDischargePower);
        json.add("powerMonitoringMustTrip", powerMonitoringMustTrip.toJsonObject());
        json.addProperty("startTime", new SimpleDateFormat(DATE_FORMAT).format(startTime));
        json.addProperty("duration", duration);
        json.add("customData", customData.toJsonObject());
        return json;
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
        if (!(obj instanceof LimitMaxDischarge))
            return false;
        LimitMaxDischarge that = (LimitMaxDischarge) obj;
        return Objects.equals(this.duration, that.duration)
                && Objects.equals(this.powerMonitoringMustTrip, that.powerMonitoringMustTrip)
                && Objects.equals(this.startTime, that.startTime)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.priority, that.priority)
                && Objects.equals(this.pctMaxDischargePower, that.pctMaxDischargePower);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.duration != null ? this.duration.hashCode() : 0);
        result = 31 * result + (this.powerMonitoringMustTrip != null ? this.powerMonitoringMustTrip.hashCode() : 0);
        result = 31 * result + (this.startTime != null ? this.startTime.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.priority != null ? this.priority.hashCode() : 0);
        result = 31 * result + (this.pctMaxDischargePower != null ? this.pctMaxDischargePower.hashCode() : 0);
        return result;
    }
}
