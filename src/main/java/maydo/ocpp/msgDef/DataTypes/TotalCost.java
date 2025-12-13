package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.Enumerations.TariffCostEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * This contains the cost calculated during a transaction. It is used both for running cost and final cost of the transaction.
 */
public class TotalCost implements JsonInterface {

    /**
     * Currency of the costs in ISO 4217 Code.
     */
    @Required
    private String currency;

    /**
     * Type of cost: normal or the minimum or maximum cost.
     */
    @Required
    private TariffCostEnum typeOfCost;

    /**
     * Total sum of all flat fees in the specified currency,
     * except for TariffFixedPriceTypes with conditions.isReservation = true (counted in reservation).
     */
    @Optional
    private Price fixed;

    /**
     * Total sum of all the cost of all the energy used, in the specified currency.
     */
    @Optional
    private Price energy;

    /**
     * Total sum of all the cost related to duration of charging during this transaction, in the specified currency.
     */
    @Optional
    private Price chargingTime;

    /**
     * Total sum of all the cost related to idle time of this transaction,
     * including fixed price components, in the specified currency.
     */
    @Optional
    private Price idleTime;

    /**
     * Sum of all time-based cost related to reservation, i.e. TariffType.reservationTime, in the specified currency.
     */
    @Optional
    private Price reservationTime;

    /**
     * Sum of fixed cost related to reservation, i.e. TariffType.reservationFixed, in the specified currency.
     */
    @Optional
    private Price reservationFixed;

    /**
     * Total of associated cost elements for fixed, energy, chargingTime, idleTime and reservation.
     */
    @Required
    private TotalPrice total;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public TotalCost() {
    }


    public String getCurrency() {
        return currency;
    }


    public void setCurrency(String currency) {
        this.currency = currency;
    }


    public TariffCostEnum getTypeOfCost() {
        return typeOfCost;
    }


    public void setTypeOfCost(TariffCostEnum typeOfCost) {
        this.typeOfCost = typeOfCost;
    }


    public Price getFixed() {
        return fixed;
    }


    public void setFixed(Price fixed) {
        this.fixed = fixed;
    }


    public Price getEnergy() {
        return energy;
    }


    public void setEnergy(Price energy) {
        this.energy = energy;
    }


    public Price getChargingTime() {
        return chargingTime;
    }


    public void setChargingTime(Price chargingTime) {
        this.chargingTime = chargingTime;
    }


    public Price getIdleTime() {
        return idleTime;
    }


    public void setIdleTime(Price idleTime) {
        this.idleTime = idleTime;
    }


    public Price getReservationTime() {
        return reservationTime;
    }


    public void setReservationTime(Price reservationTime) {
        this.reservationTime = reservationTime;
    }


    public Price getReservationFixed() {
        return reservationFixed;
    }


    public void setReservationFixed(Price reservationFixed) {
        this.reservationFixed = reservationFixed;
    }


    public TotalPrice getTotal() {
        return total;
    }


    public void setTotal(TotalPrice total) {
        this.total = total;
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
        json.addProperty("currency", currency);
        json.addProperty("typeOfCost", typeOfCost.toString());
        json.add("fixed", fixed.toJsonObject());
        json.add("energy", energy.toJsonObject());
        json.add("chargingTime", chargingTime.toJsonObject());
        json.add("idleTime", idleTime.toJsonObject());
        json.add("reservationTime", reservationTime.toJsonObject());
        json.add("reservationFixed", reservationFixed.toJsonObject());
        json.add("total", total.toJsonObject());
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
        if (jsonObject.has("currency")) {
            setCurrency(jsonObject.get("currency").getAsString());
        }

        if (jsonObject.has("typeOfCost")) {
            setTypeOfCost(TariffCostEnum.valueOf(jsonObject.get("typeOfCost").getAsString()));
        }

        if (jsonObject.has("fixed")) {
            setFixed(new Price());
            getFixed().fromJsonObject(jsonObject.getAsJsonObject("fixed"));
        }

        if (jsonObject.has("energy")) {
            setEnergy(new Price());
            getEnergy().fromJsonObject(jsonObject.getAsJsonObject("energy"));
        }

        if (jsonObject.has("chargingTime")) {
            setChargingTime(new Price());
            getChargingTime().fromJsonObject(jsonObject.getAsJsonObject("chargingTime"));
        }

        if (jsonObject.has("idleTime")) {
            setIdleTime(new Price());
            getIdleTime().fromJsonObject(jsonObject.getAsJsonObject("idleTime"));
        }

        if (jsonObject.has("reservationTime")) {
            setReservationTime(new Price());
            getReservationTime().fromJsonObject(jsonObject.getAsJsonObject("reservationTime"));
        }

        if (jsonObject.has("reservationFixed")) {
            setReservationFixed(new Price());
            getReservationFixed().fromJsonObject(jsonObject.getAsJsonObject("reservationFixed"));
        }

        if (jsonObject.has("total")) {
            setTotal(new TotalPrice());
            getTotal().fromJsonObject(jsonObject.getAsJsonObject("total"));
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
