package maydo.ocpp.msgDef.DataTypes;

import maydo.ocpp.msgDef.annotations.Optional;

import java.util.Objects;

/**
 * Cost, energy, time or SoC limit for a transaction.
 * 
 * 
 */
public class TransactionLimit {

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
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public TransactionLimit() {
    }

    /**
     * 
     * @param maxEnergy
     *     Maximum allowed energy in Wh to charge in transaction.
     *     .
     * @param maxTime
     *     Maximum duration of transaction in seconds from start to end.
     *     .
     * @param maxCost
     *     Maximum allowed cost of transaction in currency of tariff.
     *     .
     * @param maxSoC
     *     Maximum State of Charge of EV in percentage.
     *     .
     */
    public TransactionLimit(Float maxCost, Float maxEnergy, Integer maxTime, Integer maxSoC, CustomData customData) {
        super();
        this.maxCost = maxCost;
        this.maxEnergy = maxEnergy;
        this.maxTime = maxTime;
        this.maxSoC = maxSoC;
        this.customData = customData;
    }

    /**
     * Maximum allowed cost of transaction in currency of tariff.
     */
    public Float getMaxCost() {
        return maxCost;
    }

    /**
     * Maximum allowed cost of transaction in currency of tariff.
     */
    public void setMaxCost(Float maxCost) {
        this.maxCost = maxCost;
    }

    /**
     * Maximum allowed energy in Wh to charge in transaction.
     */
    public Float getMaxEnergy() {
        return maxEnergy;
    }

    /**
     * Maximum allowed energy in Wh to charge in transaction.
     */
    public void setMaxEnergy(Float maxEnergy) {
        this.maxEnergy = maxEnergy;
    }

    /**
     * Maximum duration of transaction in seconds from start to end.
     */
    public Integer getMaxTime() {
        return maxTime;
    }

    /**
     * Maximum duration of transaction in seconds from start to end.
     */
    public void setMaxTime(Integer maxTime) {
        this.maxTime = maxTime;
    }

    /**
     * Maximum State of Charge of EV in percentage.
     */
    public Integer getMaxSoC() {
        return maxSoC;
    }

    /**
     * Maximum State of Charge of EV in percentage.
     */
    public void setMaxSoC(Integer maxSoC) {
        this.maxSoC = maxSoC;
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
