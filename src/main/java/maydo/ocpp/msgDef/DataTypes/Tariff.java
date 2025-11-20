package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import static maydo.ocpp.config.Configuration.DATE_FORMAT;

public class Tariff implements JsonInterface {

    /**
     * Unique id of tariff
     * <p>
     * (Required)
     */
    @Required
    private String tariffId;
    @Optional
    private List<MessageContent> description;
    /**
     * Currency code according to ISO 4217
     * <p>
     * (Required)
     */
    @Required
    private String currency;
    /**
     * Price elements and tax for energy
     */
    @Optional
    private TariffEnergy energy;
    /**
     * Time when this tariff becomes active. When absent, it is immediately active.
     */
    @Optional
    private Date validFrom;
    /**
     * Price elements and tax for time
     */
    @Optional
    private TariffTime chargingTime;
    /**
     * Price elements and tax for time
     */
    @Optional
    private TariffTime idleTime;
    @Optional
    private TariffFixed fixedFee;
    /**
     * Price elements and tax for time
     */
    @Optional
    private TariffTime reservationTime;
    @Optional
    private TariffFixed reservationFixed;
    /**
     * Price with and without tax. At least one of _exclTax_, _inclTax_ must be present.
     */
    @Optional
    private Price minCost;
    /**
     * Price with and without tax. At least one of _exclTax_, _inclTax_ must be present.
     */
    @Optional
    private Price maxCost;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public Tariff() {
    }

    /**
     * @param currency  Currency code according to ISO 4217
     *                  .
     * @param tariffId  Unique id of tariff
     *                  .
     * @param validFrom Time when this tariff becomes active. When absent, it is immediately active.
     *                  .
     */
    public Tariff(String tariffId, List<MessageContent> description, String currency, TariffEnergy energy, Date validFrom, TariffTime chargingTime, TariffTime idleTime, TariffFixed fixedFee, TariffTime reservationTime, TariffFixed reservationFixed, Price minCost, Price maxCost, CustomData customData) {
        super();
        this.tariffId = tariffId;
        this.description = description;
        this.currency = currency;
        this.energy = energy;
        this.validFrom = validFrom;
        this.chargingTime = chargingTime;
        this.idleTime = idleTime;
        this.fixedFee = fixedFee;
        this.reservationTime = reservationTime;
        this.reservationFixed = reservationFixed;
        this.minCost = minCost;
        this.maxCost = maxCost;
        this.customData = customData;
    }

    /**
     * Unique id of tariff
     * <p>
     * (Required)
     */
    public String getTariffId() {
        return tariffId;
    }

    /**
     * Unique id of tariff
     * <p>
     * (Required)
     */
    public void setTariffId(String tariffId) {
        this.tariffId = tariffId;
    }

    public List<MessageContent> getDescription() {
        return description;
    }

    public void setDescription(List<MessageContent> description) {
        this.description = description;
    }

    /**
     * Currency code according to ISO 4217
     * <p>
     * (Required)
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Currency code according to ISO 4217
     * <p>
     * (Required)
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Price elements and tax for energy
     */
    public TariffEnergy getEnergy() {
        return energy;
    }

    /**
     * Price elements and tax for energy
     */
    public void setEnergy(TariffEnergy energy) {
        this.energy = energy;
    }

    /**
     * Time when this tariff becomes active. When absent, it is immediately active.
     */
    public Date getValidFrom() {
        return validFrom;
    }

    /**
     * Time when this tariff becomes active. When absent, it is immediately active.
     */
    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }

    /**
     * Price elements and tax for time
     */
    public TariffTime getChargingTime() {
        return chargingTime;
    }

    /**
     * Price elements and tax for time
     */
    public void setChargingTime(TariffTime chargingTime) {
        this.chargingTime = chargingTime;
    }

    /**
     * Price elements and tax for time
     */
    public TariffTime getIdleTime() {
        return idleTime;
    }

    /**
     * Price elements and tax for time
     */
    public void setIdleTime(TariffTime idleTime) {
        this.idleTime = idleTime;
    }

    public TariffFixed getFixedFee() {
        return fixedFee;
    }

    public void setFixedFee(TariffFixed fixedFee) {
        this.fixedFee = fixedFee;
    }

    /**
     * Price elements and tax for time
     */
    public TariffTime getReservationTime() {
        return reservationTime;
    }

    /**
     * Price elements and tax for time
     */
    public void setReservationTime(TariffTime reservationTime) {
        this.reservationTime = reservationTime;
    }

    public TariffFixed getReservationFixed() {
        return reservationFixed;
    }

    public void setReservationFixed(TariffFixed reservationFixed) {
        this.reservationFixed = reservationFixed;
    }

    /**
     * Price with and without tax. At least one of _exclTax_, _inclTax_ must be present.
     */
    public Price getMinCost() {
        return minCost;
    }

    /**
     * Price with and without tax. At least one of _exclTax_, _inclTax_ must be present.
     */
    public void setMinCost(Price minCost) {
        this.minCost = minCost;
    }

    /**
     * Price with and without tax. At least one of _exclTax_, _inclTax_ must be present.
     */
    public Price getMaxCost() {
        return maxCost;
    }

    /**
     * Price with and without tax. At least one of _exclTax_, _inclTax_ must be present.
     */
    public void setMaxCost(Price maxCost) {
        this.maxCost = maxCost;
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
        json.addProperty("tariffId", tariffId);
        json.addProperty("currency", currency);
        json.add("energy", energy.toJsonObject());
        json.addProperty("validFrom", new SimpleDateFormat(DATE_FORMAT).format(validFrom));
        json.add("chargingTime", chargingTime.toJsonObject());
        json.add("idleTime", idleTime.toJsonObject());
        json.add("fixedFee", fixedFee.toJsonObject());
        json.add("reservationTime", reservationTime.toJsonObject());
        json.add("reservationFixed", reservationFixed.toJsonObject());
        json.add("minCost", minCost.toJsonObject());
        json.add("maxCost", maxCost.toJsonObject());
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
        if (jsonObject.has("tariffId")) {
            this.tariffId = jsonObject.get("tariffId").getAsString();
        }

        if (jsonObject.has("currency")) {
            this.currency = jsonObject.get("currency").getAsString();
        }

        if (jsonObject.has("energy")) {
            this.energy = new TariffEnergy();
            this.energy.fromJsonObject(jsonObject.getAsJsonObject("energy"));
        }

        if (jsonObject.has("validFrom")) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                this.validFrom = dateFormat.parse(jsonObject.get("validFrom").getAsString());
            } catch (ParseException e) {
                System.out.println("Invalid date format for validFrom" + e);
            }
        }

        if (jsonObject.has("chargingTime")) {
            this.chargingTime = new TariffTime();
            this.chargingTime.fromJsonObject(jsonObject.getAsJsonObject("chargingTime"));
        }

        if (jsonObject.has("idleTime")) {
            this.idleTime = new TariffTime();
            this.idleTime.fromJsonObject(jsonObject.getAsJsonObject("idleTime"));
        }

        if (jsonObject.has("fixedFee")) {
            this.fixedFee = new TariffFixed();
            this.fixedFee.fromJsonObject(jsonObject.getAsJsonObject("fixedFee"));
        }

        if (jsonObject.has("reservationTime")) {
            this.reservationTime = new TariffTime();
            this.reservationTime.fromJsonObject(jsonObject.getAsJsonObject("reservationTime"));
        }

        if (jsonObject.has("reservationFixed")) {
            this.reservationFixed = new TariffFixed();
            this.reservationFixed.fromJsonObject(jsonObject.getAsJsonObject("reservationFixed"));
        }

        if (jsonObject.has("minCost")) {
            this.minCost = new Price();
            this.minCost.fromJsonObject(jsonObject.getAsJsonObject("minCost"));
        }

        if (jsonObject.has("maxCost")) {
            this.maxCost = new Price();
            this.maxCost.fromJsonObject(jsonObject.getAsJsonObject("maxCost"));
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
        if (!(obj instanceof Tariff))
            return false;
        Tariff that = (Tariff) obj;
        return Objects.equals(this.chargingTime, that.chargingTime)
                && Objects.equals(this.reservationTime, that.reservationTime)
                && Objects.equals(this.description, that.description)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.validFrom, that.validFrom)
                && Objects.equals(this.idleTime, that.idleTime)
                && Objects.equals(this.reservationFixed, that.reservationFixed)
                && Objects.equals(this.maxCost, that.maxCost)
                && Objects.equals(this.currency, that.currency)
                && Objects.equals(this.tariffId, that.tariffId)
                && Objects.equals(this.fixedFee, that.fixedFee)
                && Objects.equals(this.minCost, that.minCost)
                && Objects.equals(this.energy, that.energy);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.chargingTime != null ? this.chargingTime.hashCode() : 0);
        result = 31 * result + (this.reservationTime != null ? this.reservationTime.hashCode() : 0);
        result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.validFrom != null ? this.validFrom.hashCode() : 0);
        result = 31 * result + (this.idleTime != null ? this.idleTime.hashCode() : 0);
        result = 31 * result + (this.reservationFixed != null ? this.reservationFixed.hashCode() : 0);
        result = 31 * result + (this.maxCost != null ? this.maxCost.hashCode() : 0);
        result = 31 * result + (this.currency != null ? this.currency.hashCode() : 0);
        result = 31 * result + (this.tariffId != null ? this.tariffId.hashCode() : 0);
        result = 31 * result + (this.fixedFee != null ? this.fixedFee.hashCode() : 0);
        result = 31 * result + (this.minCost != null ? this.minCost.hashCode() : 0);
        result = 31 * result + (this.energy != null ? this.energy.hashCode() : 0);
        return result;
    }
}
