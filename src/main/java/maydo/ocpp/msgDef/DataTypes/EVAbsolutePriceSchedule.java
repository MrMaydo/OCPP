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

/**
 * (2.1) Price schedule of EV energy offer.
 */
public class EVAbsolutePriceSchedule implements JsonInterface {

    /**
     * Starting point in time of the EVEnergyOffer.
     */
    @Required
    private Date timeAnchor;

    /**
     * Currency code according to ISO 4217.
     */
    @Required
    private String currency;

    /**
     * Schedule of prices for which EV is willing to discharge.
     */
    @Required
    private List<EVAbsolutePriceScheduleEntry> evAbsolutePriceScheduleEntries;

    /**
     * <p> ISO 15118-20 URN of price algorithm: Power, PeakPower, StackedEnergy.
     */
    @Required
    private String priceAlgorithm;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public EVAbsolutePriceSchedule() {
    }


    public EVAbsolutePriceSchedule(Date timeAnchor, String currency, List<EVAbsolutePriceScheduleEntry> evAbsolutePriceScheduleEntries, String priceAlgorithm, CustomData customData) {
        super();
        this.timeAnchor = timeAnchor;
        this.currency = currency;
        this.evAbsolutePriceScheduleEntries = evAbsolutePriceScheduleEntries;
        this.priceAlgorithm = priceAlgorithm;
        this.customData = customData;
    }


    public Date getTimeAnchor() {
        return timeAnchor;
    }


    public void setTimeAnchor(Date timeAnchor) {
        this.timeAnchor = timeAnchor;
    }


    public String getCurrency() {
        return currency;
    }


    public void setCurrency(String currency) {
        this.currency = currency;
    }


    public List<EVAbsolutePriceScheduleEntry> getEvAbsolutePriceScheduleEntries() {
        return evAbsolutePriceScheduleEntries;
    }


    public void setEvAbsolutePriceScheduleEntries(List<EVAbsolutePriceScheduleEntry> evAbsolutePriceScheduleEntries) {
        this.evAbsolutePriceScheduleEntries = evAbsolutePriceScheduleEntries;
    }


    public String getPriceAlgorithm() {
        return priceAlgorithm;
    }


    public void setPriceAlgorithm(String priceAlgorithm) {
        this.priceAlgorithm = priceAlgorithm;
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
        json.addProperty("timeAnchor", new SimpleDateFormat(DATE_FORMAT).format(timeAnchor));
        json.addProperty("currency", currency);
        json.addProperty("priceAlgorithm", priceAlgorithm);
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
        if (jsonObject.has("timeAnchor")) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                this.timeAnchor = dateFormat.parse(jsonObject.get("timeAnchor").getAsString());
            } catch (ParseException e) {
                System.out.println("Invalid date format for timeAnchor" + e);
            }
        }

        if (jsonObject.has("currency")) {
            this.currency = jsonObject.get("currency").getAsString();
        }

        if (jsonObject.has("priceAlgorithm")) {
            this.priceAlgorithm = jsonObject.get("priceAlgorithm").getAsString();
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
        if (!(obj instanceof EVAbsolutePriceSchedule))
            return false;
        EVAbsolutePriceSchedule that = (EVAbsolutePriceSchedule) obj;
        return Objects.equals(this.currency, that.currency)
                && Objects.equals(this.evAbsolutePriceScheduleEntries, that.evAbsolutePriceScheduleEntries)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.priceAlgorithm, that.priceAlgorithm)
                && Objects.equals(this.timeAnchor, that.timeAnchor);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.currency != null ? this.currency.hashCode() : 0);
        result = 31 * result + (this.evAbsolutePriceScheduleEntries != null ? this.evAbsolutePriceScheduleEntries.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.priceAlgorithm != null ? this.priceAlgorithm.hashCode() : 0);
        result = 31 * result + (this.timeAnchor != null ? this.timeAnchor.hashCode() : 0);
        return result;
    }
}
