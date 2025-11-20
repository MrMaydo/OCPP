package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

import static maydo.ocpp.config.Configuration.DATE_FORMAT;

public class FixedPF implements JsonInterface {

    /**
     * Priority of setting (0=highest)
     * <p>
     * (Required)
     */
    @Required
    private Integer priority;
    /**
     * Power factor, cos(phi), as value between 0..1.
     * <p>
     * (Required)
     */
    @Required
    private Float displacement;
    /**
     * True when absorbing reactive power (under-excited), false when injecting reactive power (over-excited).
     * <p>
     * (Required)
     */
    @Required
    private Boolean excitation;
    /**
     * Time when this setting becomes active
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
    public FixedPF() {
    }

    /**
     * @param duration     Duration in seconds that this setting is active.
     *                     .
     * @param excitation   True when absorbing reactive power (under-excited), false when injecting reactive power (over-excited).
     *                     .
     * @param displacement Power factor, cos(phi), as value between 0..1.
     *                     .
     * @param startTime    Time when this setting becomes active
     *                     .
     * @param priority     Priority of setting (0=highest)
     *                     .
     */
    public FixedPF(Integer priority, Float displacement, Boolean excitation, Date startTime, Float duration, CustomData customData) {
        super();
        this.priority = priority;
        this.displacement = displacement;
        this.excitation = excitation;
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
     * Power factor, cos(phi), as value between 0..1.
     * <p>
     * (Required)
     */
    public Float getDisplacement() {
        return displacement;
    }

    /**
     * Power factor, cos(phi), as value between 0..1.
     * <p>
     * (Required)
     */
    public void setDisplacement(Float displacement) {
        this.displacement = displacement;
    }

    /**
     * True when absorbing reactive power (under-excited), false when injecting reactive power (over-excited).
     * <p>
     * (Required)
     */
    public Boolean getExcitation() {
        return excitation;
    }

    /**
     * True when absorbing reactive power (under-excited), false when injecting reactive power (over-excited).
     * <p>
     * (Required)
     */
    public void setExcitation(Boolean excitation) {
        this.excitation = excitation;
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
        json.addProperty("displacement", displacement);
        json.addProperty("excitation", excitation);
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
        if (!(obj instanceof FixedPF))
            return false;
        FixedPF that = (FixedPF) obj;
        return Objects.equals(this.duration, that.duration)
                && Objects.equals(this.excitation, that.excitation)
                && Objects.equals(this.displacement, that.displacement)
                && Objects.equals(this.startTime, that.startTime)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.priority, that.priority);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.duration != null ? this.duration.hashCode() : 0);
        result = 31 * result + (this.excitation != null ? this.excitation.hashCode() : 0);
        result = 31 * result + (this.displacement != null ? this.displacement.hashCode() : 0);
        result = 31 * result + (this.startTime != null ? this.startTime.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.priority != null ? this.priority.hashCode() : 0);
        return result;
    }
}
