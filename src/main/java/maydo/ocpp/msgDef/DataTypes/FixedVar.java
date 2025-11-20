package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.Enumerations.DERUnitEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

import static maydo.ocpp.config.Configuration.DATE_FORMAT;

public class FixedVar implements JsonInterface {

    /**
     * Priority of setting (0=highest)
     * <p>
     * (Required)
     */
    @Required
    private Integer priority;
    /**
     * The value specifies a target var output interpreted as a signed percentage (-100 to 100).
     * A negative value refers to charging, whereas a positive one refers to discharging.
     * The value type is determined by the unit field.
     * <p>
     * (Required)
     */
    @Required
    private Float setpoint;
    /**
     * Unit of the Y-axis of DER curve
     * <p>
     * (Required)
     */
    @Required
    private DERUnitEnum unit;
    /**
     * Time when this setting becomes active.
     */
    @Optional
    private Date startTime;
    /**
     * Duration in seconds that this setting is active.
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
    public FixedVar() {
    }

    /**
     * @param duration  Duration in seconds that this setting is active.
     *                  .
     * @param setpoint  The value specifies a target var output interpreted as a signed percentage (-100 to 100).
     *                  A negative value refers to charging, whereas a positive one refers to discharging.
     *                  The value type is determined by the unit field.
     *                  .
     * @param startTime Time when this setting becomes active.
     *                  .
     * @param priority  Priority of setting (0=highest)
     *                  .
     */
    public FixedVar(Integer priority, Float setpoint, DERUnitEnum unit, Date startTime, Float duration, CustomData customData) {
        super();
        this.priority = priority;
        this.setpoint = setpoint;
        this.unit = unit;
        this.startTime = startTime;
        this.duration = duration;
        this.customData = customData;
    }

    /**
     * Priority of setting (0=highest)
     * <p>
     * (Required)
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * Priority of setting (0=highest)
     * <p>
     * (Required)
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * The value specifies a target var output interpreted as a signed percentage (-100 to 100).
     * A negative value refers to charging, whereas a positive one refers to discharging.
     * The value type is determined by the unit field.
     * <p>
     * (Required)
     */
    public Float getSetpoint() {
        return setpoint;
    }

    /**
     * The value specifies a target var output interpreted as a signed percentage (-100 to 100).
     * A negative value refers to charging, whereas a positive one refers to discharging.
     * The value type is determined by the unit field.
     * <p>
     * (Required)
     */
    public void setSetpoint(Float setpoint) {
        this.setpoint = setpoint;
    }

    /**
     * Unit of the Y-axis of DER curve
     * <p>
     * (Required)
     */
    public DERUnitEnum getUnit() {
        return unit;
    }

    /**
     * Unit of the Y-axis of DER curve
     * <p>
     * (Required)
     */
    public void setUnit(DERUnitEnum unit) {
        this.unit = unit;
    }

    /**
     * Time when this setting becomes active.
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * Time when this setting becomes active.
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * Duration in seconds that this setting is active.
     */
    public Float getDuration() {
        return duration;
    }

    /**
     * Duration in seconds that this setting is active.
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
        json.addProperty("setpoint", setpoint);
        json.addProperty("unit", unit.toString());
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
        if (!(obj instanceof FixedVar))
            return false;
        FixedVar that = (FixedVar) obj;
        return Objects.equals(this.duration, that.duration)
                && Objects.equals(this.unit, that.unit)
                && Objects.equals(this.setpoint, that.setpoint)
                && Objects.equals(this.startTime, that.startTime)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.priority, that.priority);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.duration != null ? this.duration.hashCode() : 0);
        result = 31 * result + (this.unit != null ? this.unit.hashCode() : 0);
        result = 31 * result + (this.setpoint != null ? this.setpoint.hashCode() : 0);
        result = 31 * result + (this.startTime != null ? this.startTime.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.priority != null ? this.priority.hashCode() : 0);
        return result;
    }
}
