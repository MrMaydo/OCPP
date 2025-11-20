package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.List;
import java.util.Objects;

public class CostDetails implements JsonInterface {

    private List<ChargingPeriod> chargingPeriods;
    /**
     * This contains the cost calculated during a transaction. It is used both for running cost and final cost of the transaction.
     * <p>
     * (Required)
     */
    @Required
    private TotalCost totalCost;
    /**
     * This contains the calculated usage of energy, charging time and idle time during a transaction.
     * <p>
     * (Required)
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
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public CostDetails() {
    }

    /**
     * @param failureToCalculate If set to true, then Charging Station has failed to calculate the cost.
     *                           <p>
     *                           .
     * @param failureReason      Optional human-readable reason text in case of failure to calculate.
     *                           <p>
     *                           .
     */
    public CostDetails(List<ChargingPeriod> chargingPeriods, TotalCost totalCost, TotalUsage totalUsage, Boolean failureToCalculate, String failureReason, CustomData customData) {
        super();
        this.chargingPeriods = chargingPeriods;
        this.totalCost = totalCost;
        this.totalUsage = totalUsage;
        this.failureToCalculate = failureToCalculate;
        this.failureReason = failureReason;
        this.customData = customData;
    }

    public List<ChargingPeriod> getChargingPeriods() {
        return chargingPeriods;
    }

    public void setChargingPeriods(List<ChargingPeriod> chargingPeriods) {
        this.chargingPeriods = chargingPeriods;
    }

    /**
     * This contains the cost calculated during a transaction. It is used both for running cost and final cost of the transaction.
     * <p>
     * (Required)
     */
    public TotalCost getTotalCost() {
        return totalCost;
    }

    /**
     * This contains the cost calculated during a transaction. It is used both for running cost and final cost of the transaction.
     * <p>
     * (Required)
     */
    public void setTotalCost(TotalCost totalCost) {
        this.totalCost = totalCost;
    }

    /**
     * This contains the calculated usage of energy, charging time and idle time during a transaction.
     * <p>
     * (Required)
     */
    public TotalUsage getTotalUsage() {
        return totalUsage;
    }

    /**
     * This contains the calculated usage of energy, charging time and idle time during a transaction.
     * <p>
     * (Required)
     */
    public void setTotalUsage(TotalUsage totalUsage) {
        this.totalUsage = totalUsage;
    }

    /**
     * If set to true, then Charging Station has failed to calculate the cost.
     */
    public Boolean getFailureToCalculate() {
        return failureToCalculate;
    }

    /**
     * If set to true, then Charging Station has failed to calculate the cost.
     */
    public void setFailureToCalculate(Boolean failureToCalculate) {
        this.failureToCalculate = failureToCalculate;
    }

    /**
     * Optional human-readable reason text in case of failure to calculate.
     */
    public String getFailureReason() {
        return failureReason;
    }

    /**
     * Optional human-readable reason text in case of failure to calculate.
     */
    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
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
        json.add("totalCost", totalCost.toJsonObject());
        json.add("totalUsage", totalUsage.toJsonObject());
        json.addProperty("failureToCalculate", failureToCalculate);
        json.addProperty("failureReason", failureReason);
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
