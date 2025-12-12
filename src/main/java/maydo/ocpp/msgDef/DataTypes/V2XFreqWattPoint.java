package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;


/**
 * (2.1) A point of a frequency-watt curve.
 */
public class V2XFreqWattPoint implements JsonInterface {

    /**
     * Net frequency in Hz.
     */
    @Required
    private Float frequency;

    /**
     * Power in W to charge (positive) or discharge (negative) at specified frequency.
     */
    @Required
    private Float power;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public V2XFreqWattPoint() {
    }


    public Float getFrequency() {
        return frequency;
    }


    public void setFrequency(Float frequency) {
        this.frequency = frequency;
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
        json.addProperty("frequency", frequency);
        json.addProperty("power", power);
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
        if (jsonObject.has("frequency")) {
            this.frequency = jsonObject.get("frequency").getAsFloat();
        }

        if (jsonObject.has("power")) {
            this.power = jsonObject.get("power").getAsFloat();
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
        if (!(obj instanceof V2XFreqWattPoint))
            return false;
        V2XFreqWattPoint that = (V2XFreqWattPoint) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.power, that.power)
                && Objects.equals(this.frequency, that.frequency);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.power != null ? this.power.hashCode() : 0);
        result = 31 * result + (this.frequency != null ? this.frequency.hashCode() : 0);
        return result;
    }
}
