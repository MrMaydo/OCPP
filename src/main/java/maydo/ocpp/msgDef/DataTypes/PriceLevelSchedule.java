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
 * The PriceLevelScheduleType is modeled after the same type that is defined in ISO 15118-20,
 * such that if it is supplied by an EMSP as a signed EXI message, the conversion from EXI to JSON (in OCPP)
 * and back to EXI (for ISO 15118-20) does not change the digest and therefore does not invalidate the signature.
 */
public class PriceLevelSchedule implements JsonInterface {

    /**
     * List of entries of the schedule.
     */
    @Required
    private List<PriceLevelScheduleEntry> priceLevelScheduleEntries;

    /**
     * Starting point of this price schedule.
     */
    @Required
    private Date timeAnchor;

    /**
     * Unique ID of this price schedule.
     */
    @Required
    private Integer priceScheduleId;

    /**
     * Description of the price schedule.
     */
    @Optional
    private String priceScheduleDescription;

    /**
     * Defines the overall number of distinct price level elements used across all PriceLevelSchedules.
     */
    @Required
    private Integer numberOfPriceLevels;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public PriceLevelSchedule() {
    }


    public List<PriceLevelScheduleEntry> getPriceLevelScheduleEntries() {
        return priceLevelScheduleEntries;
    }


    public void setPriceLevelScheduleEntries(List<PriceLevelScheduleEntry> priceLevelScheduleEntries) {
        this.priceLevelScheduleEntries = priceLevelScheduleEntries;
    }


    public Date getTimeAnchor() {
        return timeAnchor;
    }


    public void setTimeAnchor(Date timeAnchor) {
        this.timeAnchor = timeAnchor;
    }


    public Integer getPriceScheduleId() {
        return priceScheduleId;
    }


    public void setPriceScheduleId(Integer priceScheduleId) {
        this.priceScheduleId = priceScheduleId;
    }


    public String getPriceScheduleDescription() {
        return priceScheduleDescription;
    }


    public void setPriceScheduleDescription(String priceScheduleDescription) {
        this.priceScheduleDescription = priceScheduleDescription;
    }


    public Integer getNumberOfPriceLevels() {
        return numberOfPriceLevels;
    }


    public void setNumberOfPriceLevels(Integer numberOfPriceLevels) {
        this.numberOfPriceLevels = numberOfPriceLevels;
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
        json.addProperty("priceScheduleId", priceScheduleId);
        json.addProperty("priceScheduleDescription", priceScheduleDescription);
        json.addProperty("numberOfPriceLevels", numberOfPriceLevels);
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
        if (jsonObject.has("priceLevelScheduleEntries")) {
            setPriceLevelScheduleEntries(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("priceLevelScheduleEntries");
            for (JsonElement el : arr) {
                PriceLevelScheduleEntry item = new PriceLevelScheduleEntry();
                item.fromJsonObject(el.getAsJsonObject());
                getPriceLevelScheduleEntries().add(item);
            }
        }

        if (jsonObject.has("timeAnchor")) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                setTimeAnchor(dateFormat.parse(jsonObject.get("timeAnchor").getAsString()));
            } catch (ParseException e) {
                System.out.println("Invalid date format for timeAnchor" + e);
            }
        }

        if (jsonObject.has("priceScheduleId")) {
            setPriceScheduleId(jsonObject.get("priceScheduleId").getAsInt());
        }

        if (jsonObject.has("priceScheduleDescription")) {
            setPriceScheduleDescription(jsonObject.get("priceScheduleDescription").getAsString());
        }

        if (jsonObject.has("numberOfPriceLevels")) {
            setNumberOfPriceLevels(jsonObject.get("numberOfPriceLevels").getAsInt());
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
        if (!(obj instanceof PriceLevelSchedule))
            return false;
        PriceLevelSchedule that = (PriceLevelSchedule) obj;
        return Objects.equals(this.priceScheduleId, that.priceScheduleId)
                && Objects.equals(this.priceLevelScheduleEntries, that.priceLevelScheduleEntries)
                && Objects.equals(this.timeAnchor, that.timeAnchor)
                && Objects.equals(this.priceScheduleDescription, that.priceScheduleDescription)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.numberOfPriceLevels, that.numberOfPriceLevels);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.priceScheduleId != null ? this.priceScheduleId.hashCode() : 0);
        result = 31 * result + (this.priceLevelScheduleEntries != null ? this.priceLevelScheduleEntries.hashCode() : 0);
        result = 31 * result + (this.timeAnchor != null ? this.timeAnchor.hashCode() : 0);
        result = 31 * result + (this.priceScheduleDescription != null ? this.priceScheduleDescription.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.numberOfPriceLevels != null ? this.numberOfPriceLevels.hashCode() : 0);
        return result;
    }
}
