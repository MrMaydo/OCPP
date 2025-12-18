package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 *
 */
public class RelativeTimeInterval implements JsonInterface {

    /**
     * Start of the interval, in seconds from NOW.
     */
    @Required
    private Integer start;

    /**
     * Duration of the interval, in seconds.
     */
    @Optional
    private Integer duration;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public RelativeTimeInterval() {
    }


    public Integer getStart() {
        return start;
    }


    public void setStart(Integer start) {
        this.start = start;
    }


    public Integer getDuration() {
        return duration;
    }


    public void setDuration(Integer duration) {
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

        json.addProperty("start", getStart());

        if (getDuration() != null) {
            json.addProperty("duration", getDuration());
        }
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
        if (jsonObject.has("start")) {
            setStart(jsonObject.get("start").getAsInt());
        }

        if (jsonObject.has("duration")) {
            setDuration(jsonObject.get("duration").getAsInt());
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
        if (!(obj instanceof RelativeTimeInterval))
            return false;
        RelativeTimeInterval that = (RelativeTimeInterval) obj;
        return Objects.equals(getStart(), that.getStart())
                && Objects.equals(getDuration(), that.getDuration())
                && Objects.equals(getCustomData(), that.getCustomData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getStart(),
                getDuration(),
                getCustomData()
        );
    }
}
