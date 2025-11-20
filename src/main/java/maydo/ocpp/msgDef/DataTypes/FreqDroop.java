package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

import static maydo.ocpp.config.Configuration.DATE_FORMAT;

public class FreqDroop implements JsonInterface {

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
     * Over-frequency start of droop
     * <p>
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private Float overFreq;
    /**
     * Under-frequency start of droop
     * <p>
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private Float underFreq;
    /**
     * Over-frequency droop per unit, oFDroop
     * <p>
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private Float overDroop;
    /**
     * Under-frequency droop per unit, uFDroop
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private Float underDroop;
    /**
     * Open loop response time in seconds
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private Float responseTime;
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
    public FreqDroop() {
    }

    /**
     * @param duration     Duration in seconds that this setting is active
     *                     <p>
     *                     <p>
     *                     .
     * @param underDroop   Under-frequency droop per unit, uFDroop
     *                     <p>
     *                     .
     * @param overDroop    Over-frequency droop per unit, oFDroop
     *                     <p>
     *                     <p>
     *                     .
     * @param responseTime Open loop response time in seconds
     *                     <p>
     *                     .
     * @param underFreq    Under-frequency start of droop
     *                     <p>
     *                     <p>
     *                     .
     * @param startTime    Time when this setting becomes active
     *                     <p>
     *                     <p>
     *                     .
     * @param priority     Priority of setting (0=highest)
     *                     <p>
     *                     <p>
     *                     .
     * @param overFreq     Over-frequency start of droop
     *                     <p>
     *                     <p>
     *                     .
     */
    public FreqDroop(Integer priority, Float overFreq, Float underFreq, Float overDroop, Float underDroop, Float responseTime, Date startTime, Float duration, CustomData customData) {
        super();
        this.priority = priority;
        this.overFreq = overFreq;
        this.underFreq = underFreq;
        this.overDroop = overDroop;
        this.underDroop = underDroop;
        this.responseTime = responseTime;
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
     * Over-frequency start of droop
     * <p>
     * <p>
     * <p>
     * (Required)
     */
    public Float getOverFreq() {
        return overFreq;
    }

    /**
     * Over-frequency start of droop
     * <p>
     * <p>
     * <p>
     * (Required)
     */
    public void setOverFreq(Float overFreq) {
        this.overFreq = overFreq;
    }

    /**
     * Under-frequency start of droop
     * <p>
     * <p>
     * <p>
     * (Required)
     */
    public Float getUnderFreq() {
        return underFreq;
    }

    /**
     * Under-frequency start of droop
     * <p>
     * <p>
     * <p>
     * (Required)
     */
    public void setUnderFreq(Float underFreq) {
        this.underFreq = underFreq;
    }

    /**
     * Over-frequency droop per unit, oFDroop
     * <p>
     * <p>
     * <p>
     * (Required)
     */
    public Float getOverDroop() {
        return overDroop;
    }

    /**
     * Over-frequency droop per unit, oFDroop
     * <p>
     * <p>
     * <p>
     * (Required)
     */
    public void setOverDroop(Float overDroop) {
        this.overDroop = overDroop;
    }

    /**
     * Under-frequency droop per unit, uFDroop
     * <p>
     * <p>
     * (Required)
     */
    public Float getUnderDroop() {
        return underDroop;
    }

    /**
     * Under-frequency droop per unit, uFDroop
     * <p>
     * <p>
     * (Required)
     */
    public void setUnderDroop(Float underDroop) {
        this.underDroop = underDroop;
    }

    /**
     * Open loop response time in seconds
     * <p>
     * <p>
     * (Required)
     */
    public Float getResponseTime() {
        return responseTime;
    }

    /**
     * Open loop response time in seconds
     * <p>
     * <p>
     * (Required)
     */
    public void setResponseTime(Float responseTime) {
        this.responseTime = responseTime;
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
        json.addProperty("overFreq", overFreq);
        json.addProperty("underFreq", underFreq);
        json.addProperty("overDroop", overDroop);
        json.addProperty("underDroop", underDroop);
        json.addProperty("responseTime", responseTime);
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
        if (jsonObject.has("priority")) {
            this.priority = jsonObject.get("priority").getAsInt();
        }

        if (jsonObject.has("overFreq")) {
            this.overFreq = jsonObject.get("overFreq").getAsFloat();
        }

        if (jsonObject.has("underFreq")) {
            this.underFreq = jsonObject.get("underFreq").getAsFloat();
        }

        if (jsonObject.has("overDroop")) {
            this.overDroop = jsonObject.get("overDroop").getAsFloat();
        }

        if (jsonObject.has("underDroop")) {
            this.underDroop = jsonObject.get("underDroop").getAsFloat();
        }

        if (jsonObject.has("responseTime")) {
            this.responseTime = jsonObject.get("responseTime").getAsFloat();
        }

        if (jsonObject.has("startTime")) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                this.startTime = dateFormat.parse(jsonObject.get("startTime").getAsString());
            } catch (ParseException e) {
                System.out.println("Invalid date format for startTime" + e);
            }
        }

        if (jsonObject.has("duration")) {
            this.duration = jsonObject.get("duration").getAsFloat();
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
        if (!(obj instanceof FreqDroop))
            return false;
        FreqDroop that = (FreqDroop) obj;
        return Objects.equals(this.duration, that.duration)
                && Objects.equals(this.underDroop, that.underDroop)
                && Objects.equals(this.overDroop, that.overDroop)
                && Objects.equals(this.responseTime, that.responseTime)
                && Objects.equals(this.underFreq, that.underFreq)
                && Objects.equals(this.startTime, that.startTime)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.priority, that.priority)
                && Objects.equals(this.overFreq, that.overFreq);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.duration != null ? this.duration.hashCode() : 0);
        result = 31 * result + (this.underDroop != null ? this.underDroop.hashCode() : 0);
        result = 31 * result + (this.overDroop != null ? this.overDroop.hashCode() : 0);
        result = 31 * result + (this.responseTime != null ? this.responseTime.hashCode() : 0);
        result = 31 * result + (this.underFreq != null ? this.underFreq.hashCode() : 0);
        result = 31 * result + (this.startTime != null ? this.startTime.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.priority != null ? this.priority.hashCode() : 0);
        result = 31 * result + (this.overFreq != null ? this.overFreq.hashCode() : 0);
        return result;
    }
}
