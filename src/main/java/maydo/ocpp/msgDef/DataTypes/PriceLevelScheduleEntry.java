package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;


/**
 * Part of ISO 15118-20 price schedule.
 */
public class PriceLevelScheduleEntry implements JsonInterface {

    /**
     * The amount of seconds that define the duration of this given PriceLevelScheduleEntry.
     */
    @Required
    private Integer duration;

    /**
     * Defines the price level of this PriceLevelScheduleEntry (referring to NumberOfPriceLevels).
     * Small values for the PriceLevel represent a cheaper PriceLevelScheduleEntry.
     * Large values for the PriceLevel represent a more expensive PriceLevelScheduleEntry.
     */
    @Required
    private Integer priceLevel;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public PriceLevelScheduleEntry() {
    }


    public PriceLevelScheduleEntry(Integer duration, Integer priceLevel, CustomData customData) {
        super();
        this.duration = duration;
        this.priceLevel = priceLevel;
        this.customData = customData;
    }


    public Integer getDuration() {
        return duration;
    }


    public void setDuration(Integer duration) {
        this.duration = duration;
    }


    public Integer getPriceLevel() {
        return priceLevel;
    }


    public void setPriceLevel(Integer priceLevel) {
        this.priceLevel = priceLevel;
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
        json.addProperty("duration", duration);
        json.addProperty("priceLevel", priceLevel);
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
        if (jsonObject.has("duration")) {
            this.duration = jsonObject.get("duration").getAsInt();
        }

        if (jsonObject.has("priceLevel")) {
            this.priceLevel = jsonObject.get("priceLevel").getAsInt();
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
        if (!(obj instanceof PriceLevelScheduleEntry))
            return false;
        PriceLevelScheduleEntry that = (PriceLevelScheduleEntry) obj;
        return Objects.equals(this.duration, that.duration)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.priceLevel, that.priceLevel);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.duration != null ? this.duration.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.priceLevel != null ? this.priceLevel.hashCode() : 0);
        return result;
    }
}
