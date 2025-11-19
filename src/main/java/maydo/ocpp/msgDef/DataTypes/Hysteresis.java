package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;

import java.util.Objects;

public class Hysteresis implements JsonInterface {

    /**
     * High value for return to normal operation after a grid event, in absolute value. This value adopts the same unit as defined by yUnit
     */
    @Optional
    private Float hysteresisHigh;
    /**
     * Low value for return to normal operation after a grid event, in absolute value. This value adopts the same unit as defined by yUnit
     */
    @Optional
    private Float hysteresisLow;
    /**
     * Delay in seconds, once grid parameter within HysteresisLow and HysteresisHigh, for the EV to return to normal operation after a grid event.
     */
    @Optional
    private Float hysteresisDelay;
    /**
     * Set default rate of change (ramp rate %/s) for the EV to return to normal operation after a grid event
     */
    @Optional
    private Float hysteresisGradient;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public Hysteresis() {
    }

    /**
     * @param hysteresisLow      Low value for return to normal operation after a grid event, in absolute value. This value adopts the same unit as defined by yUnit
     *                           <p>
     *                           <p>
     *                           .
     * @param hysteresisHigh     High value for return to normal operation after a grid event, in absolute value. This value adopts the same unit as defined by yUnit
     *                           <p>
     *                           <p>
     *                           .
     * @param hysteresisGradient Set default rate of change (ramp rate %/s) for the EV to return to normal operation after a grid event
     *                           <p>
     *                           <p>
     *                           .
     * @param hysteresisDelay    Delay in seconds, once grid parameter within HysteresisLow and HysteresisHigh, for the EV to return to normal operation after a grid event.
     *                           <p>
     *                           <p>
     *                           .
     */
    public Hysteresis(Float hysteresisHigh, Float hysteresisLow, Float hysteresisDelay, Float hysteresisGradient, CustomData customData) {
        super();
        this.hysteresisHigh = hysteresisHigh;
        this.hysteresisLow = hysteresisLow;
        this.hysteresisDelay = hysteresisDelay;
        this.hysteresisGradient = hysteresisGradient;
        this.customData = customData;
    }

    /**
     * High value for return to normal operation after a grid event, in absolute value. This value adopts the same unit as defined by yUnit
     */
    public Float getHysteresisHigh() {
        return hysteresisHigh;
    }

    /**
     * High value for return to normal operation after a grid event, in absolute value. This value adopts the same unit as defined by yUnit
     */
    public void setHysteresisHigh(Float hysteresisHigh) {
        this.hysteresisHigh = hysteresisHigh;
    }

    /**
     * Low value for return to normal operation after a grid event, in absolute value. This value adopts the same unit as defined by yUnit
     */
    public Float getHysteresisLow() {
        return hysteresisLow;
    }

    /**
     * Low value for return to normal operation after a grid event, in absolute value. This value adopts the same unit as defined by yUnit
     */
    public void setHysteresisLow(Float hysteresisLow) {
        this.hysteresisLow = hysteresisLow;
    }

    /**
     * Delay in seconds, once grid parameter within HysteresisLow and HysteresisHigh, for the EV to return to normal operation after a grid event.
     */
    public Float getHysteresisDelay() {
        return hysteresisDelay;
    }

    /**
     * Delay in seconds, once grid parameter within HysteresisLow and HysteresisHigh, for the EV to return to normal operation after a grid event.
     */
    public void setHysteresisDelay(Float hysteresisDelay) {
        this.hysteresisDelay = hysteresisDelay;
    }

    /**
     * Set default rate of change (ramp rate %/s) for the EV to return to normal operation after a grid event
     */
    public Float getHysteresisGradient() {
        return hysteresisGradient;
    }

    /**
     * Set default rate of change (ramp rate %/s) for the EV to return to normal operation after a grid event
     */
    public void setHysteresisGradient(Float hysteresisGradient) {
        this.hysteresisGradient = hysteresisGradient;
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
        int result = 1;
        result = 31 * result + (this.hysteresisHigh != null ? this.hysteresisHigh.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.hysteresisGradient != null ? this.hysteresisGradient.hashCode() : 0);
        result = 31 * result + (this.hysteresisDelay != null ? this.hysteresisDelay.hashCode() : 0);
        result = 31 * result + (this.hysteresisLow != null ? this.hysteresisLow.hashCode() : 0);
        return result;
    }
}
