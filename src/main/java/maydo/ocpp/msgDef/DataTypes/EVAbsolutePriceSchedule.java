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

        json.addProperty("timeAnchor", new SimpleDateFormat(DATE_FORMAT).format(getTimeAnchor()));

        json.addProperty("currency", getCurrency());

        JsonArray evAbsolutePriceScheduleEntriesArray = new JsonArray();
        for (EVAbsolutePriceScheduleEntry item : getEvAbsolutePriceScheduleEntries()) {
            evAbsolutePriceScheduleEntriesArray.add(item.toJsonObject());
        }
        json.add("evAbsolutePriceScheduleEntries", evAbsolutePriceScheduleEntriesArray);

        json.addProperty("priceAlgorithm", getPriceAlgorithm());

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
        if (jsonObject.has("timeAnchor")) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                setTimeAnchor(dateFormat.parse(jsonObject.get("timeAnchor").getAsString()));
            } catch (ParseException e) {
                System.out.println("Invalid date format for timeAnchor" + e);
            }
        }

        if (jsonObject.has("currency")) {
            setCurrency(jsonObject.get("currency").getAsString());
        }

        if (jsonObject.has("evAbsolutePriceScheduleEntries")) {
            setEvAbsolutePriceScheduleEntries(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("evAbsolutePriceScheduleEntries");
            for (JsonElement el : arr) {
                EVAbsolutePriceScheduleEntry item = new EVAbsolutePriceScheduleEntry();
                item.fromJsonObject(el.getAsJsonObject());
                getEvAbsolutePriceScheduleEntries().add(item);
            }
        }

        if (jsonObject.has("priceAlgorithm")) {
            setPriceAlgorithm(jsonObject.get("priceAlgorithm").getAsString());
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
        if (!(obj instanceof EVAbsolutePriceSchedule))
            return false;
        EVAbsolutePriceSchedule that = (EVAbsolutePriceSchedule) obj;
        return Objects.equals(getTimeAnchor(), that.getTimeAnchor())
                && Objects.equals(getCurrency(), that.getCurrency())
                && Objects.equals(getEvAbsolutePriceScheduleEntries(), that.getEvAbsolutePriceScheduleEntries())
                && Objects.equals(getPriceAlgorithm(), that.getPriceAlgorithm())
                && Objects.equals(getCustomData(), that.getCustomData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getTimeAnchor(),
                getCurrency(),
                getEvAbsolutePriceScheduleEntries(),
                getPriceAlgorithm(),
                getCustomData()
        );
    }
}
