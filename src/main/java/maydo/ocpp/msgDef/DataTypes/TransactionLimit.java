package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;

import java.util.Objects;


/**
 * Cost, energy, time or SoC limit for a transaction.
 */
public class TransactionLimit implements JsonInterface {

    /**
     * Maximum allowed cost of transaction in currency of tariff.
     */
    @Optional
    private Float maxCost;

    /**
     * Maximum allowed energy in Wh to charge in transaction.
     */
    @Optional
    private Float maxEnergy;

    /**
     * Maximum duration of transaction in seconds from start to end.
     */
    @Optional
    private Integer maxTime;

    /**
     * Maximum State of Charge of EV in percentage.
     */
    @Optional
    private Integer maxSoC;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public TransactionLimit() {
    }


    public Float getMaxCost() {
        return maxCost;
    }


    public void setMaxCost(Float maxCost) {
        this.maxCost = maxCost;
    }


    public Float getMaxEnergy() {
        return maxEnergy;
    }


    public void setMaxEnergy(Float maxEnergy) {
        this.maxEnergy = maxEnergy;
    }


    public Integer getMaxTime() {
        return maxTime;
    }


    public void setMaxTime(Integer maxTime) {
        this.maxTime = maxTime;
    }


    public Integer getMaxSoC() {
        return maxSoC;
    }


    public void setMaxSoC(Integer maxSoC) {
        this.maxSoC = maxSoC;
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
        json.addProperty("maxCost", maxCost);
        json.addProperty("maxEnergy", maxEnergy);
        json.addProperty("maxTime", maxTime);
        json.addProperty("maxSoC", maxSoC);
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
        if (jsonObject.has("maxCost")) {
            setMaxCost(jsonObject.get("maxCost").getAsFloat());
        }

        if (jsonObject.has("maxEnergy")) {
            setMaxEnergy(jsonObject.get("maxEnergy").getAsFloat());
        }

        if (jsonObject.has("maxTime")) {
            setMaxTime(jsonObject.get("maxTime").getAsInt());
        }

        if (jsonObject.has("maxSoC")) {
            setMaxSoC(jsonObject.get("maxSoC").getAsInt());
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
        if (!(obj instanceof TransactionLimit))
            return false;
        TransactionLimit that = (TransactionLimit) obj;
        return Objects.equals(this.maxCost, that.maxCost)
                && Objects.equals(this.maxEnergy, that.maxEnergy)
                && Objects.equals(this.maxTime, that.maxTime)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.maxSoC, that.maxSoC);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.maxCost != null ? this.maxCost.hashCode() : 0);
        result = 31 * result + (this.maxEnergy != null ? this.maxEnergy.hashCode() : 0);
        result = 31 * result + (this.maxTime != null ? this.maxTime.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.maxSoC != null ? this.maxSoC.hashCode() : 0);
        return result;
    }
}
