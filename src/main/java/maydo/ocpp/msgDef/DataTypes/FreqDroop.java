package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

import static maydo.ocpp.config.Configuration.DATE_FORMAT;

/**
 *
 */
public class FreqDroop implements JsonInterface {

    /**
     * Priority of setting (0=highest)
     */
    @Required
    private Integer priority;

    /**
     * Over-frequency start of droop
     */
    @Required
    private Float overFreq;

    /**
     * Under-frequency start of droop
     */
    @Required
    private Float underFreq;

    /**
     * Over-frequency droop per unit, oFDroop
     */
    @Required
    private Float overDroop;

    /**
     * Under-frequency droop per unit, uFDroop
     */
    @Required
    private Float underDroop;

    /**
     * Open loop response time in seconds
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
     *
     */
    @Optional
    private CustomData customData;


    public FreqDroop() {
    }


    public Integer getPriority() {
        return priority;
    }


    public void setPriority(Integer priority) {
        this.priority = priority;
    }


    public Float getOverFreq() {
        return overFreq;
    }


    public void setOverFreq(Float overFreq) {
        this.overFreq = overFreq;
    }


    public Float getUnderFreq() {
        return underFreq;
    }


    public void setUnderFreq(Float underFreq) {
        this.underFreq = underFreq;
    }


    public Float getOverDroop() {
        return overDroop;
    }


    public void setOverDroop(Float overDroop) {
        this.overDroop = overDroop;
    }


    public Float getUnderDroop() {
        return underDroop;
    }


    public void setUnderDroop(Float underDroop) {
        this.underDroop = underDroop;
    }


    public Float getResponseTime() {
        return responseTime;
    }


    public void setResponseTime(Float responseTime) {
        this.responseTime = responseTime;
    }


    public Date getStartTime() {
        return startTime;
    }


    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }


    public Float getDuration() {
        return duration;
    }


    public void setDuration(Float duration) {
        this.duration = duration;
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
        JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
        fromJsonObject(jsonObject);
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        if (jsonObject.has("priority")) {
            setPriority(jsonObject.get("priority").getAsInt());
        }

        if (jsonObject.has("overFreq")) {
            setOverFreq(jsonObject.get("overFreq").getAsFloat());
        }

        if (jsonObject.has("underFreq")) {
            setUnderFreq(jsonObject.get("underFreq").getAsFloat());
        }

        if (jsonObject.has("overDroop")) {
            setOverDroop(jsonObject.get("overDroop").getAsFloat());
        }

        if (jsonObject.has("underDroop")) {
            setUnderDroop(jsonObject.get("underDroop").getAsFloat());
        }

        if (jsonObject.has("responseTime")) {
            setResponseTime(jsonObject.get("responseTime").getAsFloat());
        }

        if (jsonObject.has("startTime")) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                setStartTime(dateFormat.parse(jsonObject.get("startTime").getAsString()));
            } catch (ParseException e) {
                System.out.println("Invalid date format for startTime" + e);
            }
        }

        if (jsonObject.has("duration")) {
            setDuration(jsonObject.get("duration").getAsFloat());
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
