package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.List;
import java.util.Objects;

/**
 *
 */
public class SalesTariffEntry implements JsonInterface {

    /**
     * Defines the time interval the SalesTariffEntry is valid for, based upon relative times.
     */
    @Required
    private RelativeTimeInterval relativeTimeInterval;

    /**
     * Defines the price level of this SalesTariffEntry (referring to NumEPriceLevels).
     * Small values for the EPriceLevel represent a cheaper TariffEntry.
     * Large values for the EPriceLevel represent a more expensive TariffEntry.
     */
    @Optional
    private Integer ePriceLevel;

    /**
     * Defines additional means for further relative price information and/or alternative costs.
     */
    @Optional
    private List<ConsumptionCost> consumptionCost;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public SalesTariffEntry() {
    }


    public SalesTariffEntry(RelativeTimeInterval relativeTimeInterval, Integer ePriceLevel, List<ConsumptionCost> consumptionCost, CustomData customData) {
        super();
        this.relativeTimeInterval = relativeTimeInterval;
        this.ePriceLevel = ePriceLevel;
        this.consumptionCost = consumptionCost;
        this.customData = customData;
    }


    public RelativeTimeInterval getRelativeTimeInterval() {
        return relativeTimeInterval;
    }


    public void setRelativeTimeInterval(RelativeTimeInterval relativeTimeInterval) {
        this.relativeTimeInterval = relativeTimeInterval;
    }


    public Integer getePriceLevel() {
        return ePriceLevel;
    }


    public void setePriceLevel(Integer ePriceLevel) {
        this.ePriceLevel = ePriceLevel;
    }

    public List<ConsumptionCost> getConsumptionCost() {
        return consumptionCost;
    }

    public void setConsumptionCost(List<ConsumptionCost> consumptionCost) {
        this.consumptionCost = consumptionCost;
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
        json.add("relativeTimeInterval", relativeTimeInterval.toJsonObject());
        json.addProperty("ePriceLevel", ePriceLevel);
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
        if (jsonObject.has("relativeTimeInterval")) {
            this.relativeTimeInterval = new RelativeTimeInterval();
            this.relativeTimeInterval.fromJsonObject(jsonObject.getAsJsonObject("relativeTimeInterval"));
        }

        if (jsonObject.has("ePriceLevel")) {
            this.ePriceLevel = jsonObject.get("ePriceLevel").getAsInt();
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
        if (!(obj instanceof SalesTariffEntry))
            return false;
        SalesTariffEntry that = (SalesTariffEntry) obj;
        return Objects.equals(this.consumptionCost, that.consumptionCost)
                && Objects.equals(this.relativeTimeInterval, that.relativeTimeInterval)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.ePriceLevel, that.ePriceLevel);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.consumptionCost != null ? this.consumptionCost.hashCode() : 0);
        result = 31 * result + (this.relativeTimeInterval != null ? this.relativeTimeInterval.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.ePriceLevel != null ? this.ePriceLevel.hashCode() : 0);
        return result;
    }
}
