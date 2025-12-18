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

        json.addProperty("priority", getPriority());

        json.addProperty("highVoltage", getHighVoltage());

        json.addProperty("lowVoltage", getLowVoltage());

        json.addProperty("highFreq", getHighFreq());

        json.addProperty("lowFreq", getLowFreq());

        if (getDelay() != null) {
            json.addProperty("delay", getDelay());
        }
        if (getRandomDelay() != null) {
            json.addProperty("randomDelay", getRandomDelay());
        }
        if (getRampRate() != null) {
            json.addProperty("rampRate", getRampRate());
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
        if (jsonObject.has("priority")) {
            setPriority(jsonObject.get("priority").getAsInt());
        }

        if (jsonObject.has("highVoltage")) {
            setHighVoltage(jsonObject.get("highVoltage").getAsFloat());
        }

        if (jsonObject.has("lowVoltage")) {
            setLowVoltage(jsonObject.get("lowVoltage").getAsFloat());
        }

        if (jsonObject.has("highFreq")) {
            setHighFreq(jsonObject.get("highFreq").getAsFloat());
        }

        if (jsonObject.has("lowFreq")) {
            setLowFreq(jsonObject.get("lowFreq").getAsFloat());
        }

        if (jsonObject.has("delay")) {
            setDelay(jsonObject.get("delay").getAsFloat());
        }

        if (jsonObject.has("randomDelay")) {
            setRandomDelay(jsonObject.get("randomDelay").getAsFloat());
        }

        if (jsonObject.has("rampRate")) {
            setRampRate(jsonObject.get("rampRate").getAsFloat());
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
        return Objects.hash(
                getPriority(),
                getHighVoltage(),
                getLowVoltage(),
                getHighFreq(),
                getLowFreq(),
                getDelay(),
                getRandomDelay(),
                getRampRate(),
                getCustomData()
        );
    }
}
