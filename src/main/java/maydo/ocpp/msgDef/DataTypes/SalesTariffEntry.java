package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.List;
import java.util.Objects;

public class SalesTariffEntry implements JsonInterface {

    /**
     * (Required)
     */
    @Required
    private RelativeTimeInterval relativeTimeInterval;
    /**
     * Defines the price level of this SalesTariffEntry (referring to NumEPriceLevels). Small values for the EPriceLevel represent a cheaper TariffEntry. Large values for the EPriceLevel represent a more expensive TariffEntry.
     */
    @Optional
    private Integer ePriceLevel;
    @Optional
    private List<ConsumptionCost> consumptionCost;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public SalesTariffEntry() {
    }

    /**
     * @param ePriceLevel Defines the price level of this SalesTariffEntry (referring to NumEPriceLevels). Small values for the EPriceLevel represent a cheaper TariffEntry. Large values for the EPriceLevel represent a more expensive TariffEntry.
     *                    .
     */
    public SalesTariffEntry(RelativeTimeInterval relativeTimeInterval, Integer ePriceLevel, List<ConsumptionCost> consumptionCost, CustomData customData) {
        super();
        this.relativeTimeInterval = relativeTimeInterval;
        this.ePriceLevel = ePriceLevel;
        this.consumptionCost = consumptionCost;
        this.customData = customData;
    }

    /**
     * (Required)
     */
    public RelativeTimeInterval getRelativeTimeInterval() {
        return relativeTimeInterval;
    }

    /**
     * (Required)
     */
    public void setRelativeTimeInterval(RelativeTimeInterval relativeTimeInterval) {
        this.relativeTimeInterval = relativeTimeInterval;
    }

    /**
     * Defines the price level of this SalesTariffEntry (referring to NumEPriceLevels). Small values for the EPriceLevel represent a cheaper TariffEntry. Large values for the EPriceLevel represent a more expensive TariffEntry.
     */
    public Integer getePriceLevel() {
        return ePriceLevel;
    }

    /**
     * Defines the price level of this SalesTariffEntry (referring to NumEPriceLevels). Small values for the EPriceLevel represent a cheaper TariffEntry. Large values for the EPriceLevel represent a more expensive TariffEntry.
     */
    public void setePriceLevel(Integer ePriceLevel) {
        this.ePriceLevel = ePriceLevel;
    }

    public List<ConsumptionCost> getConsumptionCost() {
        return consumptionCost;
    }

    public void setConsumptionCost(List<ConsumptionCost> consumptionCost) {
        this.consumptionCost = consumptionCost;
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
