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
public class EnterService implements JsonInterface {

    /**
     * Priority of setting (0=highest)
     */
    @Required
    private Integer priority;

    /**
     * Enter service voltage high
     */
    @Required
    private Float highVoltage;

    /**
     * Enter service voltage low
     */
    @Required
    private Float lowVoltage;

    /**
     * Enter service frequency high
     */
    @Required
    private Float highFreq;

    /**
     * Enter service frequency low
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
     *
     */
    @Optional
    private CustomData customData;


    public EnterService() {
    }


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


    public Integer getPriority() {
        return priority;
    }


    public void setPriority(Integer priority) {
        this.priority = priority;
    }


    public Float getHighVoltage() {
        return highVoltage;
    }


    public void setHighVoltage(Float highVoltage) {
        this.highVoltage = highVoltage;
    }


    public Float getLowVoltage() {
        return lowVoltage;
    }


    public void setLowVoltage(Float lowVoltage) {
        this.lowVoltage = lowVoltage;
    }


    public Float getHighFreq() {
        return highFreq;
    }


    public void setHighFreq(Float highFreq) {
        this.highFreq = highFreq;
    }


    public Float getLowFreq() {
        return lowFreq;
    }


    public void setLowFreq(Float lowFreq) {
        this.lowFreq = lowFreq;
    }


    public Float getDelay() {
        return delay;
    }


    public void setDelay(Float delay) {
        this.delay = delay;
    }


    public Float getRandomDelay() {
        return randomDelay;
    }


    public void setRandomDelay(Float randomDelay) {
        this.randomDelay = randomDelay;
    }


    public Float getRampRate() {
        return rampRate;
    }


    public void setRampRate(Float rampRate) {
        this.rampRate = rampRate;
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
