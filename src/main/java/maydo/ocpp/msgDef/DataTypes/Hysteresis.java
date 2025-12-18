package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;

import java.util.Objects;

/**
 *
 */
public class Hysteresis implements JsonInterface {

    /**
     * High value for return to normal operation after a grid event, in absolute value.
     * This value adopts the same unit as defined by yUnit
     */
    @Optional
    private Float hysteresisHigh;

    /**
     * Low value for return to normal operation after a grid event, in absolute value.
     * This value adopts the same unit as defined by yUnit
     */
    @Optional
    private Float hysteresisLow;

    /**
     * Delay in seconds, once grid parameter within HysteresisLow and HysteresisHigh,
     * for the EV to return to normal operation after a grid event.
     */
    @Optional
    private Float hysteresisDelay;

    /**
     * Set default rate of change (ramp rate %/s) for the EV to return to normal operation after a grid event
     */
    @Optional
    private Float hysteresisGradient;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public Hysteresis() {
    }


    public Float getHysteresisHigh() {
        return hysteresisHigh;
    }


    public void setHysteresisHigh(Float hysteresisHigh) {
        this.hysteresisHigh = hysteresisHigh;
    }


    public Float getHysteresisLow() {
        return hysteresisLow;
    }


    public void setHysteresisLow(Float hysteresisLow) {
        this.hysteresisLow = hysteresisLow;
    }


    public Float getHysteresisDelay() {
        return hysteresisDelay;
    }


    public void setHysteresisDelay(Float hysteresisDelay) {
        this.hysteresisDelay = hysteresisDelay;
    }


    public Float getHysteresisGradient() {
        return hysteresisGradient;
    }


    public void setHysteresisGradient(Float hysteresisGradient) {
        this.hysteresisGradient = hysteresisGradient;
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

        if (getHysteresisHigh() != null) {
            json.addProperty("hysteresisHigh", getHysteresisHigh());
        }
        if (getHysteresisLow() != null) {
            json.addProperty("hysteresisLow", getHysteresisLow());
        }
        if (getHysteresisDelay() != null) {
            json.addProperty("hysteresisDelay", getHysteresisDelay());
        }
        if (getHysteresisGradient() != null) {
            json.addProperty("hysteresisGradient", getHysteresisGradient());
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
        if (jsonObject.has("hysteresisHigh")) {
            setHysteresisHigh(jsonObject.get("hysteresisHigh").getAsFloat());
        }

        if (jsonObject.has("hysteresisLow")) {
            setHysteresisLow(jsonObject.get("hysteresisLow").getAsFloat());
        }

        if (jsonObject.has("hysteresisDelay")) {
            setHysteresisDelay(jsonObject.get("hysteresisDelay").getAsFloat());
        }

        if (jsonObject.has("hysteresisGradient")) {
            setHysteresisGradient(jsonObject.get("hysteresisGradient").getAsFloat());
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
        if (!(obj instanceof Hysteresis))
            return false;
        Hysteresis that = (Hysteresis) obj;
        return Objects.equals(this.hysteresisHigh, that.hysteresisHigh)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.hysteresisGradient, that.hysteresisGradient)
                && Objects.equals(this.hysteresisDelay, that.hysteresisDelay)
                && Objects.equals(this.hysteresisLow, that.hysteresisLow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getHysteresisHigh(),
                getHysteresisLow(),
                getHysteresisDelay(),
                getHysteresisGradient(),
                getCustomData()
        );
    }
}
