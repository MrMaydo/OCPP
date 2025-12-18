package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;


/**
 * (2.1) An entry in schedule of the energy amount over time that EV is willing to discharge.
 * A negative value indicates the willingness to discharge under specific conditions,
 * a positive value indicates that the EV currently is not able to offer energy to discharge.
 */
public class EVPowerScheduleEntry implements JsonInterface {

    /**
     * The duration of this entry.
     */
    @Required
    private Integer duration;

    /**
     * Defines maximum amount of power for the duration of this EVPowerScheduleEntry to be discharged
     * from the EV battery through EVSE power outlet.
     * Negative values are used for discharging.
     */
    @Required
    private Float power;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public EVPowerScheduleEntry() {
    }


    public Integer getDuration() {
        return duration;
    }


    public void setDuration(Integer duration) {
        this.duration = duration;
    }


    public Float getPower() {
        return power;
    }


    public void setPower(Float power) {
        this.power = power;
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

        json.addProperty("duration", getDuration());

        json.addProperty("power", getPower());

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
        if (jsonObject.has("duration")) {
            setDuration(jsonObject.get("duration").getAsInt());
        }

        if (jsonObject.has("power")) {
            setPower(jsonObject.get("power").getAsFloat());
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
        if (!(obj instanceof EVPowerScheduleEntry))
            return false;
        EVPowerScheduleEntry that = (EVPowerScheduleEntry) obj;
        return Objects.equals(this.duration, that.duration)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.power, that.power);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getDuration(),
                getPower(),
                getCustomData()
        );
    }
}
