package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class RelativeTimeInterval implements JsonInterface {

    /**
     * Start of the interval, in seconds from NOW.
     * <p>
     * (Required)
     */
    @Required
    private Integer start;
    /**
     * Duration of the interval, in seconds.
     */
    @Optional
    private Integer duration;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public RelativeTimeInterval() {
    }

    /**
     * @param duration Duration of the interval, in seconds.
     *                 .
     * @param start    Start of the interval, in seconds from NOW.
     *                 .
     */
    public RelativeTimeInterval(Integer start, Integer duration, CustomData customData) {
        super();
        this.start = start;
        this.duration = duration;
        this.customData = customData;
    }

    /**
     * Start of the interval, in seconds from NOW.
     * <p>
     * (Required)
     */
    public Integer getStart() {
        return start;
    }

    /**
     * Start of the interval, in seconds from NOW.
     * <p>
     * (Required)
     */
    public void setStart(Integer start) {
        this.start = start;
    }

    /**
     * Duration of the interval, in seconds.
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * Duration of the interval, in seconds.
     */
    public void setDuration(Integer duration) {
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
        json.addProperty("start", start);
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
        if (!(obj instanceof RelativeTimeInterval))
            return false;
        RelativeTimeInterval that = (RelativeTimeInterval) obj;
        return Objects.equals(this.start, that.start)
                && Objects.equals(this.duration, that.duration)
                && Objects.equals(this.customData, that.customData);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.start != null ? this.start.hashCode() : 0);
        result = 31 * result + (this.duration != null ? this.duration.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        return result;
    }
}
