package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * *(2.1)* A point of a frequency-watt curve.
 */
public class V2XFreqWattPoint implements JsonInterface {

    /**
     * Net frequency in Hz.
     * <p>
     * (Required)
     */
    @Required
    private Float frequency;
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
    public V2XFreqWattPoint() {
    }

    /**
     * @param power     Power in W to charge (positive) or discharge (negative) at specified frequency.
     *                  .
     * @param frequency Net frequency in Hz.
     *                  .
     */
    public V2XFreqWattPoint(Float frequency, Float power, CustomData customData) {
        super();
        this.frequency = frequency;
        this.power = power;
        this.customData = customData;
    }

    /**
     * Net frequency in Hz.
     * <p>
     * (Required)
     */
    public Float getFrequency() {
        return frequency;
    }

    /**
     * Net frequency in Hz.
     * <p>
     * (Required)
     */
    public void setFrequency(Float frequency) {
        this.frequency = frequency;
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
        return null;
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
