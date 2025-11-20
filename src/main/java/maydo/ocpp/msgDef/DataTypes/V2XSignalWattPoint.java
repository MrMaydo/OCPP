package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * *(2.1)* A point of a signal-watt curve.
 */
public class V2XSignalWattPoint implements JsonInterface {

    /**
     * Signal value from an AFRRSignalRequest.
     * <p>
     * (Required)
     */
    @Required
    private Integer signal;
    /**
     * Power in W to charge (positive) or discharge (negative) at specified frequency.
     * <p>
     * (Required)
     */
    @Required
    private Float power;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public V2XSignalWattPoint() {
    }

    /**
     * @param power  Power in W to charge (positive) or discharge (negative) at specified frequency.
     *               .
     * @param signal Signal value from an AFRRSignalRequest.
     *               .
     */
    public V2XSignalWattPoint(Integer signal, Float power, CustomData customData) {
        super();
        this.signal = signal;
        this.power = power;
        this.customData = customData;
    }

    /**
     * Signal value from an AFRRSignalRequest.
     * <p>
     * (Required)
     */
    public Integer getSignal() {
        return signal;
    }

    /**
     * Signal value from an AFRRSignalRequest.
     * <p>
     * (Required)
     */
    public void setSignal(Integer signal) {
        this.signal = signal;
    }

    /**
     * Power in W to charge (positive) or discharge (negative) at specified frequency.
     * <p>
     * (Required)
     */
    public Float getPower() {
        return power;
    }

    /**
     * Power in W to charge (positive) or discharge (negative) at specified frequency.
     * <p>
     * (Required)
     */
    public void setPower(Float power) {
        this.power = power;
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
        json.addProperty("signal", signal);
        json.addProperty("power", power);
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
