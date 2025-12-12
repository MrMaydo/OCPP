package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;


/**
 * (2.1) A point of a signal-watt curve.
 */
public class V2XSignalWattPoint implements JsonInterface {

    /**
     * Signal value from an AFRRSignalRequest.
     */
    @Required
    private Integer signal;

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


    public V2XSignalWattPoint() {
    }


    public V2XSignalWattPoint(Integer signal, Float power, CustomData customData) {
        super();
        this.signal = signal;
        this.power = power;
        this.customData = customData;
    }


    public Integer getSignal() {
        return signal;
    }


    public void setSignal(Integer signal) {
        this.signal = signal;
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
        json.addProperty("signal", signal);
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
        if (jsonObject.has("signal")) {
            this.signal = jsonObject.get("signal").getAsInt();
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
        if (!(obj instanceof V2XSignalWattPoint))
            return false;
        V2XSignalWattPoint that = (V2XSignalWattPoint) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.power, that.power)
                && Objects.equals(this.signal, that.signal);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.power != null ? this.power.hashCode() : 0);
        result = 31 * result + (this.signal != null ? this.signal.hashCode() : 0);
        return result;
    }
}
