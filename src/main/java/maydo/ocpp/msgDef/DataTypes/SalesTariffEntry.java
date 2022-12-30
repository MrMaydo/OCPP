package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.List;
import java.util.Objects;


/**
 * Sales_ Tariff_ Entry
 * urn:x-oca:ocpp:uid:2:233271
 */
public class SalesTariffEntry implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
    /**
     * Relative_ Timer_ Interval
     * urn:x-oca:ocpp:uid:2:233270
     * <p>
     * (Required)
     */
    @Required
    private RelativeTimeInterval relativeTimeInterval;
    /**
     * Sales_ Tariff_ Entry. E_ Price_ Level. Unsigned_ Integer
     * urn:x-oca:ocpp:uid:1:569281
     * Defines the price level of this SalesTariffEntry (referring to NumEPriceLevels). Small values for the EPriceLevel represent a cheaper TariffEntry. Large values for the EPriceLevel represent a more expensive TariffEntry.
     */
    @Optional
    private Integer ePriceLevel;
    @Optional
    private List<ConsumptionCost> consumptionCost = null;

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

    /**
     * Relative_ Timer_ Interval
     * urn:x-oca:ocpp:uid:2:233270
     * <p>
     * (Required)
     */
    public RelativeTimeInterval getRelativeTimeInterval() {
        return relativeTimeInterval;
    }

    /**
     * Relative_ Timer_ Interval
     * urn:x-oca:ocpp:uid:2:233270
     * <p>
     * (Required)
     */
    public void setRelativeTimeInterval(RelativeTimeInterval relativeTimeInterval) {
        this.relativeTimeInterval = relativeTimeInterval;
    }

    /**
     * Sales_ Tariff_ Entry. E_ Price_ Level. Unsigned_ Integer
     * urn:x-oca:ocpp:uid:1:569281
     * Defines the price level of this SalesTariffEntry (referring to NumEPriceLevels). Small values for the EPriceLevel represent a cheaper TariffEntry. Large values for the EPriceLevel represent a more expensive TariffEntry.
     */
    public Integer getePriceLevel() {
        return ePriceLevel;
    }

    /**
     * Sales_ Tariff_ Entry. E_ Price_ Level. Unsigned_ Integer
     * urn:x-oca:ocpp:uid:1:569281
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

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject() {
        return JsonTools.toJsonObject(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof SalesTariffEntry))
            return false;
        SalesTariffEntry that = (SalesTariffEntry) obj;
        return Objects.equals(customData, that.customData)
                && Objects.equals(relativeTimeInterval, that.relativeTimeInterval)
                && Objects.equals(ePriceLevel, that.ePriceLevel)
                && Objects.equals(consumptionCost, that.consumptionCost);
    }

    @Override
    public int hashCode() {
        int result = (relativeTimeInterval != null ? relativeTimeInterval.hashCode() : 0);
        result = 31 * result + (ePriceLevel != null ? ePriceLevel.hashCode() : 0);
        result = 31 * result + (consumptionCost != null ? consumptionCost.hashCode() : 0);
        result = 31 * result + (customData != null ? customData.hashCode() : 0);
        return result;
    }
}
