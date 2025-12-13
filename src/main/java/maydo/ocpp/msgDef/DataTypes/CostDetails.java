package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * CostDetailsType contains the cost as calculated by Charging Station based on provided TariffType.
 */
public class CostDetails implements JsonInterface {

    /**
     * List of Charging Periods that make up this charging session.
     * A finished session has of 1 or more periods, where each period has a different list of dimensions that determined the price.
     * When sent as a running cost update during a transaction chargingPeriods are omitted.
     */
    @Optional
    private List<ChargingPeriod> chargingPeriods;

    /**
     * Total sum of all the costs of this transaction in the specified currency.
     */
    @Required
    private TotalCost totalCost;

    /**
     * Total usage of energy and time
     */
    @Required
    private TotalUsage totalUsage;

    /**
     * If set to true, then Charging Station has failed to calculate the cost.
     */
    @Optional
    private Boolean failureToCalculate;

    /**
     * Optional human-readable reason text in case of failure to calculate.
     */
    @Optional
    private String failureReason;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public CostDetails() {
    }


    public List<ChargingPeriod> getChargingPeriods() {
        return chargingPeriods;
    }

    public void setChargingPeriods(List<ChargingPeriod> chargingPeriods) {
        this.chargingPeriods = chargingPeriods;
    }


    public TotalCost getTotalCost() {
        return totalCost;
    }


    public void setTotalCost(TotalCost totalCost) {
        this.totalCost = totalCost;
    }


    public TotalUsage getTotalUsage() {
        return totalUsage;
    }


    public void setTotalUsage(TotalUsage totalUsage) {
        this.totalUsage = totalUsage;
    }


    public Boolean getFailureToCalculate() {
        return failureToCalculate;
    }


    public void setFailureToCalculate(Boolean failureToCalculate) {
        this.failureToCalculate = failureToCalculate;
    }


    public String getFailureReason() {
        return failureReason;
    }


    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
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
        json.add("totalCost", totalCost.toJsonObject());
        json.add("totalUsage", totalUsage.toJsonObject());
        json.addProperty("failureToCalculate", failureToCalculate);
        json.addProperty("failureReason", failureReason);
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
        if (jsonObject.has("chargingPeriods")) {
            setChargingPeriods(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("chargingPeriods");
            for (JsonElement el : arr) {
                ChargingPeriod item = new ChargingPeriod();
                item.fromJsonObject(el.getAsJsonObject());
                getChargingPeriods().add(item);
            }
        }

        if (jsonObject.has("totalCost")) {
            setTotalCost(new TotalCost());
            getTotalCost().fromJsonObject(jsonObject.getAsJsonObject("totalCost"));
        }

        if (jsonObject.has("totalUsage")) {
            setTotalUsage(new TotalUsage());
            getTotalUsage().fromJsonObject(jsonObject.getAsJsonObject("totalUsage"));
        }

        if (jsonObject.has("failureToCalculate")) {
            setFailureToCalculate(jsonObject.get("failureToCalculate").getAsBoolean());
        }

        if (jsonObject.has("failureReason")) {
            setFailureReason(jsonObject.get("failureReason").getAsString());
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
        if (!(obj instanceof CostDetails))
            return false;
        CostDetails that = (CostDetails) obj;
        return Objects.equals(this.failureToCalculate, that.failureToCalculate)
                && Objects.equals(this.failureReason, that.failureReason)
                && Objects.equals(this.totalUsage, that.totalUsage)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.chargingPeriods, that.chargingPeriods)
                && Objects.equals(this.totalCost, that.totalCost);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.failureToCalculate != null ? this.failureToCalculate.hashCode() : 0);
        result = 31 * result + (this.failureReason != null ? this.failureReason.hashCode() : 0);
        result = 31 * result + (this.totalUsage != null ? this.totalUsage.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.chargingPeriods != null ? this.chargingPeriods.hashCode() : 0);
        result = 31 * result + (this.totalCost != null ? this.totalCost.hashCode() : 0);
        return result;
    }
}
