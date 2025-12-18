package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.ArrayList;
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


    public RelativeTimeInterval getRelativeTimeInterval() {
        return relativeTimeInterval;
    }


    public void setRelativeTimeInterval(RelativeTimeInterval relativeTimeInterval) {
        this.relativeTimeInterval = relativeTimeInterval;
    }


    public Integer getEPriceLevel() {
        return ePriceLevel;
    }


    public void setEPriceLevel(Integer ePriceLevel) {
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

        json.add("relativeTimeInterval", getRelativeTimeInterval().toJsonObject());

        if (getEPriceLevel() != null) {
            json.addProperty("ePriceLevel", getEPriceLevel());
        }
        if (getConsumptionCost() != null) {
            JsonArray consumptionCostArray = new JsonArray();
            for (ConsumptionCost item : getConsumptionCost()) {
                consumptionCostArray.add(item.toJsonObject());
            }
            json.add("consumptionCost", consumptionCostArray);
        }
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
        if (jsonObject.has("relativeTimeInterval")) {
            setRelativeTimeInterval(new RelativeTimeInterval());
            getRelativeTimeInterval().fromJsonObject(jsonObject.getAsJsonObject("relativeTimeInterval"));
        }

        if (jsonObject.has("ePriceLevel")) {
            setEPriceLevel(jsonObject.get("ePriceLevel").getAsInt());
        }

        if (jsonObject.has("consumptionCost")) {
            setConsumptionCost(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("consumptionCost");
            for (JsonElement el : arr) {
                ConsumptionCost item = new ConsumptionCost();
                item.fromJsonObject(el.getAsJsonObject());
                getConsumptionCost().add(item);
            }
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
        return Objects.hash(
                getRelativeTimeInterval(),
                getEPriceLevel(),
                getConsumptionCost(),
                getCustomData()
        );
    }
}
