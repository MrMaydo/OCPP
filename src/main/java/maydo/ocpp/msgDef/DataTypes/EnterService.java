package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class EnterService implements JsonInterface {

    /**
     * Priority of setting (0=highest)
     * 
     * 
     * (Required)
     */
    @Required
    private Integer priority;
    /**
     * Enter service voltage high
     * 
     * (Required)
     */
    @Required
    private Float highVoltage;
    /**
     * Enter service voltage low
     * 
     * 
     * 
     * (Required)
     */
    @Required
    private Float lowVoltage;
    /**
     * Enter service frequency high
     * 
     * 
     * (Required)
     */
    @Required
    private Float highFreq;
    /**
     * Enter service frequency low
     * 
     * 
     * 
     * (Required)
     */
    @Required
    private Float lowFreq;
    /**
     * Enter service delay
     * 
     * 
     */
    @Optional
    private Float delay;
    /**
     * Enter service randomized delay
     * 
     * 
     */
    @Optional
    private Float randomDelay;
    /**
     * Enter service ramp rate in seconds
     * 
     * 
     */
    @Optional
    private Float rampRate;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public EnterService() {
    }

    /**
     * 
     * @param rampRate
     *     Enter service ramp rate in seconds
     *     
     *     
     *     .
     * @param delay
     *     Enter service delay
     *     
     *     
     *     .
     * @param lowFreq
     *     Enter service frequency low
     *     
     *     
     *     .
     * @param lowVoltage
     *     Enter service voltage low
     *     
     *     
     *     .
     * @param highVoltage
     *     Enter service voltage high
     *     .
     * @param randomDelay
     *     Enter service randomized delay
     *     
     *     
     *     .
     * @param priority
     *     Priority of setting (0=highest)
     *     
     *     .
     * @param highFreq
     *     Enter service frequency high
     *     
     *     .
     */
    public EnterService(Integer priority, Float highVoltage, Float lowVoltage, Float highFreq, Float lowFreq, Float delay, Float randomDelay, Float rampRate, CustomData customData) {
        super();
        this.priority = priority;
        this.highVoltage = highVoltage;
        this.lowVoltage = lowVoltage;
        this.highFreq = highFreq;
        this.lowFreq = lowFreq;
        this.delay = delay;
        this.randomDelay = randomDelay;
        this.rampRate = rampRate;
        this.customData = customData;
    }

    /**
     * Priority of setting (0=highest)
     * 
     * 
     * (Required)
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * Priority of setting (0=highest)
     * 
     * 
     * (Required)
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * Enter service voltage high
     * 
     * (Required)
     */
    public Float getHighVoltage() {
        return highVoltage;
    }

    /**
     * Enter service voltage high
     * 
     * (Required)
     */
    public void setHighVoltage(Float highVoltage) {
        this.highVoltage = highVoltage;
    }

    /**
     * Enter service voltage low
     * 
     * 
     * 
     * (Required)
     */
    public Float getLowVoltage() {
        return lowVoltage;
    }

    /**
     * Enter service voltage low
     * 
     * 
     * 
     * (Required)
     */
    public void setLowVoltage(Float lowVoltage) {
        this.lowVoltage = lowVoltage;
    }

    /**
     * Enter service frequency high
     * 
     * 
     * (Required)
     */
    public Float getHighFreq() {
        return highFreq;
    }

    /**
     * Enter service frequency high
     * 
     * 
     * (Required)
     */
    public void setHighFreq(Float highFreq) {
        this.highFreq = highFreq;
    }

    /**
     * Enter service frequency low
     * 
     * 
     * 
     * (Required)
     */
    public Float getLowFreq() {
        return lowFreq;
    }

    /**
     * Enter service frequency low
     * 
     * 
     * 
     * (Required)
     */
    public void setLowFreq(Float lowFreq) {
        this.lowFreq = lowFreq;
    }

    /**
     * Enter service delay
     * 
     * 
     */
    public Float getDelay() {
        return delay;
    }

    /**
     * Enter service delay
     * 
     * 
     */
    public void setDelay(Float delay) {
        this.delay = delay;
    }

    /**
     * Enter service randomized delay
     * 
     * 
     */
    public Float getRandomDelay() {
        return randomDelay;
    }

    /**
     * Enter service randomized delay
     * 
     * 
     */
    public void setRandomDelay(Float randomDelay) {
        this.randomDelay = randomDelay;
    }

    /**
     * Enter service ramp rate in seconds
     * 
     * 
     */
    public Float getRampRate() {
        return rampRate;
    }

    /**
     * Enter service ramp rate in seconds
     * 
     * 
     */
    public void setRampRate(Float rampRate) {
        this.rampRate = rampRate;
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
        if (!(obj instanceof EnterService))
            return false;
        EnterService that = (EnterService) obj;
        return Objects.equals(this.rampRate, that.rampRate)
                && Objects.equals(this.delay, that.delay) 
                && Objects.equals(this.lowFreq, that.lowFreq) 
                && Objects.equals(this.lowVoltage, that.lowVoltage) 
                && Objects.equals(this.highVoltage, that.highVoltage) 
                && Objects.equals(this.randomDelay, that.randomDelay) 
                && Objects.equals(this.customData, that.customData) 
                && Objects.equals(this.priority, that.priority) 
                && Objects.equals(this.highFreq, that.highFreq);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.rampRate != null ? this.rampRate.hashCode() : 0);
        result = 31 * result + (this.delay != null ? this.delay.hashCode() : 0);
        result = 31 * result + (this.lowFreq != null ? this.lowFreq.hashCode() : 0);
        result = 31 * result + (this.lowVoltage != null ? this.lowVoltage.hashCode() : 0);
        result = 31 * result + (this.highVoltage != null ? this.highVoltage.hashCode() : 0);
        result = 31 * result + (this.randomDelay != null ? this.randomDelay.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.priority != null ? this.priority.hashCode() : 0);
        result = 31 * result + (this.highFreq != null ? this.highFreq.hashCode() : 0);
        return result;
    }
}
