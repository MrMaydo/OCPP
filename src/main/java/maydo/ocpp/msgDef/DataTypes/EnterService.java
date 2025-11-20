package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class EnterService implements JsonInterface {

    /**
     * Priority of setting (0=highest)
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private Integer priority;
    /**
     * Enter service voltage high
     * <p>
     * (Required)
     */
    @Required
    private Float highVoltage;
    /**
     * Enter service voltage low
     * <p>
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private Float lowVoltage;
    /**
     * Enter service frequency high
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private Float highFreq;
    /**
     * Enter service frequency low
     * <p>
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private Float lowFreq;
    /**
     * Enter service delay
     */
    @Optional
    private Float delay;
    /**
     * Enter service randomized delay
     */
    @Optional
    private Float randomDelay;
    /**
     * Enter service ramp rate in seconds
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
     * @param rampRate    Enter service ramp rate in seconds
     *                    <p>
     *                    <p>
     *                    .
     * @param delay       Enter service delay
     *                    <p>
     *                    <p>
     *                    .
     * @param lowFreq     Enter service frequency low
     *                    <p>
     *                    <p>
     *                    .
     * @param lowVoltage  Enter service voltage low
     *                    <p>
     *                    <p>
     *                    .
     * @param highVoltage Enter service voltage high
     *                    .
     * @param randomDelay Enter service randomized delay
     *                    <p>
     *                    <p>
     *                    .
     * @param priority    Priority of setting (0=highest)
     *                    <p>
     *                    .
     * @param highFreq    Enter service frequency high
     *                    <p>
     *                    .
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
     * <p>
     * <p>
     * (Required)
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * Priority of setting (0=highest)
     * <p>
     * <p>
     * (Required)
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * Enter service voltage high
     * <p>
     * (Required)
     */
    public Float getHighVoltage() {
        return highVoltage;
    }

    /**
     * Enter service voltage high
     * <p>
     * (Required)
     */
    public void setHighVoltage(Float highVoltage) {
        this.highVoltage = highVoltage;
    }

    /**
     * Enter service voltage low
     * <p>
     * <p>
     * <p>
     * (Required)
     */
    public Float getLowVoltage() {
        return lowVoltage;
    }

    /**
     * Enter service voltage low
     * <p>
     * <p>
     * <p>
     * (Required)
     */
    public void setLowVoltage(Float lowVoltage) {
        this.lowVoltage = lowVoltage;
    }

    /**
     * Enter service frequency high
     * <p>
     * <p>
     * (Required)
     */
    public Float getHighFreq() {
        return highFreq;
    }

    /**
     * Enter service frequency high
     * <p>
     * <p>
     * (Required)
     */
    public void setHighFreq(Float highFreq) {
        this.highFreq = highFreq;
    }

    /**
     * Enter service frequency low
     * <p>
     * <p>
     * <p>
     * (Required)
     */
    public Float getLowFreq() {
        return lowFreq;
    }

    /**
     * Enter service frequency low
     * <p>
     * <p>
     * <p>
     * (Required)
     */
    public void setLowFreq(Float lowFreq) {
        this.lowFreq = lowFreq;
    }

    /**
     * Enter service delay
     */
    public Float getDelay() {
        return delay;
    }

    /**
     * Enter service delay
     */
    public void setDelay(Float delay) {
        this.delay = delay;
    }

    /**
     * Enter service randomized delay
     */
    public Float getRandomDelay() {
        return randomDelay;
    }

    /**
     * Enter service randomized delay
     */
    public void setRandomDelay(Float randomDelay) {
        this.randomDelay = randomDelay;
    }

    /**
     * Enter service ramp rate in seconds
     */
    public Float getRampRate() {
        return rampRate;
    }

    /**
     * Enter service ramp rate in seconds
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
        JsonObject json = new JsonObject();
        json.addProperty("priority", priority);
        json.addProperty("highVoltage", highVoltage);
        json.addProperty("lowVoltage", lowVoltage);
        json.addProperty("highFreq", highFreq);
        json.addProperty("lowFreq", lowFreq);
        json.addProperty("delay", delay);
        json.addProperty("randomDelay", randomDelay);
        json.addProperty("rampRate", rampRate);
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
        if (jsonObject.has("priority")) {
            this.priority = jsonObject.get("priority").getAsInt();
        }

        if (jsonObject.has("highVoltage")) {
            this.highVoltage = jsonObject.get("highVoltage").getAsFloat();
        }

        if (jsonObject.has("lowVoltage")) {
            this.lowVoltage = jsonObject.get("lowVoltage").getAsFloat();
        }

        if (jsonObject.has("highFreq")) {
            this.highFreq = jsonObject.get("highFreq").getAsFloat();
        }

        if (jsonObject.has("lowFreq")) {
            this.lowFreq = jsonObject.get("lowFreq").getAsFloat();
        }

        if (jsonObject.has("delay")) {
            this.delay = jsonObject.get("delay").getAsFloat();
        }

        if (jsonObject.has("randomDelay")) {
            this.randomDelay = jsonObject.get("randomDelay").getAsFloat();
        }

        if (jsonObject.has("rampRate")) {
            this.rampRate = jsonObject.get("rampRate").getAsFloat();
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
