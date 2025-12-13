package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import static maydo.ocpp.config.Configuration.DATE_FORMAT;

/**
 * A tariff is described by fields with prices for:
 * energy, charging time, idle time, fixed fee, reservation time, reservation fixed fee.
 * Each of these fields may have (optional) conditions that specify when a price is applicable.
 * The description contains a human-readable explanation of the tariff to be shown to the user.
 * The other fields are parameters that define the tariff. These are used by the charging station to calculate the price.
 */
public class Tariff implements JsonInterface {

    /**
     * Unique id of tariff
     */
    @Required
    private String tariffId;

    /**
     * List of multi-language tariff information texts to be shown to the user.
     */
    @Optional
    private List<MessageContent> description;

    /**
     * Currency code according to ISO 4217
     */
    @Required
    private String currency;

    /**
     * Energy tariff
     */
    @Optional
    private TariffEnergy energy;

    /**
     * Time when this tariff becomes active. When absent, it is immediately active.
     */
    @Optional
    private Date validFrom;

    /**
     * Charging time tariff
     */
    @Optional
    private TariffTime chargingTime;

    /**
     * Idle time tariff
     */
    @Optional
    private TariffTime idleTime;

    /**
     * Fixed fee tariff
     */
    @Optional
    private TariffFixed fixedFee;

    /**
     * Reservation time tariff
     */
    @Optional
    private TariffTime reservationTime;

    /**
     * Fixed fee for a reservation
     */
    @Optional
    private TariffFixed reservationFixed;

    /**
     * The minimal cost for a transaction with this tariff including and excluding taxes.
     * Minimum can be including tax or excluding tax, or both.
     */
    @Optional
    private Price minCost;

    /**
     * The maximum cost for a transaction with this tariff.
     * Maximum can be including tax or excluding tax, or both.
     */
    @Optional
    private Price maxCost;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public Tariff() {
    }


    public String getTariffId() {
        return tariffId;
    }


    public void setTariffId(String tariffId) {
        this.tariffId = tariffId;
    }

    public List<MessageContent> getDescription() {
        return description;
    }

    public void setDescription(List<MessageContent> description) {
        this.description = description;
    }


    public String getCurrency() {
        return currency;
    }


    public void setCurrency(String currency) {
        this.currency = currency;
    }


    public TariffEnergy getEnergy() {
        return energy;
    }


    public void setEnergy(TariffEnergy energy) {
        this.energy = energy;
    }


    public Date getValidFrom() {
        return validFrom;
    }


    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }


    public TariffTime getChargingTime() {
        return chargingTime;
    }


    public void setChargingTime(TariffTime chargingTime) {
        this.chargingTime = chargingTime;
    }


    public TariffTime getIdleTime() {
        return idleTime;
    }


    public void setIdleTime(TariffTime idleTime) {
        this.idleTime = idleTime;
    }

    public TariffFixed getFixedFee() {
        return fixedFee;
    }

    public void setFixedFee(TariffFixed fixedFee) {
        this.fixedFee = fixedFee;
    }


    public TariffTime getReservationTime() {
        return reservationTime;
    }


    public void setReservationTime(TariffTime reservationTime) {
        this.reservationTime = reservationTime;
    }

    public TariffFixed getReservationFixed() {
        return reservationFixed;
    }

    public void setReservationFixed(TariffFixed reservationFixed) {
        this.reservationFixed = reservationFixed;
    }


    public Price getMinCost() {
        return minCost;
    }


    public void setMinCost(Price minCost) {
        this.minCost = minCost;
    }


    public Price getMaxCost() {
        return maxCost;
    }


    public void setMaxCost(Price maxCost) {
        this.maxCost = maxCost;
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
            setTariffId(jsonObject.get("tariffId").getAsString());
        }

        if (jsonObject.has("description")) {
            setDescription(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("description");
            for (JsonElement el : arr) {
                MessageContent item = new MessageContent();
                item.fromJsonObject(el.getAsJsonObject());
                getDescription().add(item);
            }
        }

        if (jsonObject.has("currency")) {
            setCurrency(jsonObject.get("currency").getAsString());
        }

        if (jsonObject.has("energy")) {
            setEnergy(new TariffEnergy());
            getEnergy().fromJsonObject(jsonObject.getAsJsonObject("energy"));
        }

        if (jsonObject.has("validFrom")) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                setValidFrom(dateFormat.parse(jsonObject.get("validFrom").getAsString()));
            } catch (ParseException e) {
                System.out.println("Invalid date format for validFrom" + e);
            }
        }

        if (jsonObject.has("chargingTime")) {
            setChargingTime(new TariffTime());
            getChargingTime().fromJsonObject(jsonObject.getAsJsonObject("chargingTime"));
        }

        if (jsonObject.has("idleTime")) {
            setIdleTime(new TariffTime());
            getIdleTime().fromJsonObject(jsonObject.getAsJsonObject("idleTime"));
        }

        if (jsonObject.has("fixedFee")) {
            setFixedFee(new TariffFixed());
            getFixedFee().fromJsonObject(jsonObject.getAsJsonObject("fixedFee"));
        }

        if (jsonObject.has("reservationTime")) {
            setReservationTime(new TariffTime());
            getReservationTime().fromJsonObject(jsonObject.getAsJsonObject("reservationTime"));
        }

        if (jsonObject.has("reservationFixed")) {
            setReservationFixed(new TariffFixed());
            getReservationFixed().fromJsonObject(jsonObject.getAsJsonObject("reservationFixed"));
        }

        if (jsonObject.has("minCost")) {
            setMinCost(new Price());
            getMinCost().fromJsonObject(jsonObject.getAsJsonObject("minCost"));
        }

        if (jsonObject.has("maxCost")) {
            setMaxCost(new Price());
            getMaxCost().fromJsonObject(jsonObject.getAsJsonObject("maxCost"));
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
