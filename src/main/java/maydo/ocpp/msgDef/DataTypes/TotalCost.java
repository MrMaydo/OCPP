package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.Enumerations.TariffCostEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class TotalCost implements JsonInterface {

    /**
     * Currency of the costs in ISO 4217 Code.
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private String currency;
    /**
     * Type of cost: normal or the minimum or maximum cost.
     * <p>
     * (Required)
     */
    @Required
    private TariffCostEnum typeOfCost;
    /**
     * Price with and without tax. At least one of _exclTax_, _inclTax_ must be present.
     */
    @Optional
    private Price fixed;
    /**
     * Price with and without tax. At least one of _exclTax_, _inclTax_ must be present.
     */
    @Optional
    private Price energy;
    /**
     * Price with and without tax. At least one of _exclTax_, _inclTax_ must be present.
     */
    @Optional
    private Price chargingTime;
    /**
     * Price with and without tax. At least one of _exclTax_, _inclTax_ must be present.
     */
    @Optional
    private Price idleTime;
    /**
     * Price with and without tax. At least one of _exclTax_, _inclTax_ must be present.
     */
    @Optional
    private Price reservationTime;
    /**
     * Price with and without tax. At least one of _exclTax_, _inclTax_ must be present.
     */
    @Optional
    private Price reservationFixed;
    /**
     * Total cost with and without tax. Contains the total of energy, charging time, idle time, fixed and reservation costs including and/or excluding tax.
     * <p>
     * (Required)
     */
    @Required
    private TotalPrice total;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public TotalCost() {
    }

    /**
     * @param currency Currency of the costs in ISO 4217 Code.
     *                 <p>
     *                 .
     */
    public TotalCost(String currency, TariffCostEnum typeOfCost, Price fixed, Price energy, Price chargingTime, Price idleTime, Price reservationTime, Price reservationFixed, TotalPrice total, CustomData customData) {
        super();
        this.currency = currency;
        this.typeOfCost = typeOfCost;
        this.fixed = fixed;
        this.energy = energy;
        this.chargingTime = chargingTime;
        this.idleTime = idleTime;
        this.reservationTime = reservationTime;
        this.reservationFixed = reservationFixed;
        this.total = total;
        this.customData = customData;
    }

    /**
     * Currency of the costs in ISO 4217 Code.
     * <p>
     * <p>
     * (Required)
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Currency of the costs in ISO 4217 Code.
     * <p>
     * <p>
     * (Required)
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Type of cost: normal or the minimum or maximum cost.
     * <p>
     * (Required)
     */
    public TariffCostEnum getTypeOfCost() {
        return typeOfCost;
    }

    /**
     * Type of cost: normal or the minimum or maximum cost.
     * <p>
     * (Required)
     */
    public void setTypeOfCost(TariffCostEnum typeOfCost) {
        this.typeOfCost = typeOfCost;
    }

    /**
     * Price with and without tax. At least one of _exclTax_, _inclTax_ must be present.
     */
    public Price getFixed() {
        return fixed;
    }

    /**
     * Price with and without tax. At least one of _exclTax_, _inclTax_ must be present.
     */
    public void setFixed(Price fixed) {
        this.fixed = fixed;
    }

    /**
     * Price with and without tax. At least one of _exclTax_, _inclTax_ must be present.
     */
    public Price getEnergy() {
        return energy;
    }

    /**
     * Price with and without tax. At least one of _exclTax_, _inclTax_ must be present.
     */
    public void setEnergy(Price energy) {
        this.energy = energy;
    }

    /**
     * Price with and without tax. At least one of _exclTax_, _inclTax_ must be present.
     */
    public Price getChargingTime() {
        return chargingTime;
    }

    /**
     * Price with and without tax. At least one of _exclTax_, _inclTax_ must be present.
     */
    public void setChargingTime(Price chargingTime) {
        this.chargingTime = chargingTime;
    }

    /**
     * Price with and without tax. At least one of _exclTax_, _inclTax_ must be present.
     */
    public Price getIdleTime() {
        return idleTime;
    }

    /**
     * Price with and without tax. At least one of _exclTax_, _inclTax_ must be present.
     */
    public void setIdleTime(Price idleTime) {
        this.idleTime = idleTime;
    }

    /**
     * Price with and without tax. At least one of _exclTax_, _inclTax_ must be present.
     */
    public Price getReservationTime() {
        return reservationTime;
    }

    /**
     * Price with and without tax. At least one of _exclTax_, _inclTax_ must be present.
     */
    public void setReservationTime(Price reservationTime) {
        this.reservationTime = reservationTime;
    }

    /**
     * Price with and without tax. At least one of _exclTax_, _inclTax_ must be present.
     */
    public Price getReservationFixed() {
        return reservationFixed;
    }

    /**
     * Price with and without tax. At least one of _exclTax_, _inclTax_ must be present.
     */
    public void setReservationFixed(Price reservationFixed) {
        this.reservationFixed = reservationFixed;
    }

    /**
     * Total cost with and without tax. Contains the total of energy, charging time, idle time, fixed and reservation costs including and/or excluding tax.
     * <p>
     * (Required)
     */
    public TotalPrice getTotal() {
        return total;
    }

    /**
     * Total cost with and without tax. Contains the total of energy, charging time, idle time, fixed and reservation costs including and/or excluding tax.
     * <p>
     * (Required)
     */
    public void setTotal(TotalPrice total) {
        this.total = total;
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
        if (!(obj instanceof TotalCost))
            return false;
        TotalCost that = (TotalCost) obj;
        return Objects.equals(this.total, that.total)
                && Objects.equals(this.chargingTime, that.chargingTime)
                && Objects.equals(this.reservationTime, that.reservationTime)
                && Objects.equals(this.currency, that.currency)
                && Objects.equals(this.fixed, that.fixed)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.typeOfCost, that.typeOfCost)
                && Objects.equals(this.idleTime, that.idleTime)
                && Objects.equals(this.reservationFixed, that.reservationFixed)
                && Objects.equals(this.energy, that.energy);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.total != null ? this.total.hashCode() : 0);
        result = 31 * result + (this.chargingTime != null ? this.chargingTime.hashCode() : 0);
        result = 31 * result + (this.reservationTime != null ? this.reservationTime.hashCode() : 0);
        result = 31 * result + (this.currency != null ? this.currency.hashCode() : 0);
        result = 31 * result + (this.fixed != null ? this.fixed.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.typeOfCost != null ? this.typeOfCost.hashCode() : 0);
        result = 31 * result + (this.idleTime != null ? this.idleTime.hashCode() : 0);
        result = 31 * result + (this.reservationFixed != null ? this.reservationFixed.hashCode() : 0);
        result = 31 * result + (this.energy != null ? this.energy.hashCode() : 0);
        return result;
    }
}
