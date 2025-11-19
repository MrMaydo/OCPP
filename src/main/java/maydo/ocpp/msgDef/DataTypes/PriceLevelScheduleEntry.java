package maydo.ocpp.msgDef.DataTypes;

import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * Part of ISO 15118-20 price schedule.
 * 
 * 
 */
public class PriceLevelScheduleEntry {

    /**
     * The amount of seconds that define the duration of this given PriceLevelScheduleEntry.
     * 
     * (Required)
     */
    @Required
    private Integer duration;
    /**
     * Defines the price level of this PriceLevelScheduleEntry (referring to NumberOfPriceLevels). Small values for the PriceLevel represent a cheaper PriceLevelScheduleEntry. Large values for the PriceLevel represent a more expensive PriceLevelScheduleEntry.
     * 
     * (Required)
     */
    @Required
    private Integer priceLevel;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public PriceLevelScheduleEntry() {
    }

    /**
     * 
     * @param duration
     *     The amount of seconds that define the duration of this given PriceLevelScheduleEntry.
     *     .
     * @param priceLevel
     *     Defines the price level of this PriceLevelScheduleEntry (referring to NumberOfPriceLevels). Small values for the PriceLevel represent a cheaper PriceLevelScheduleEntry. Large values for the PriceLevel represent a more expensive PriceLevelScheduleEntry.
     *     .
     */
    public PriceLevelScheduleEntry(Integer duration, Integer priceLevel, CustomData customData) {
        super();
        this.duration = duration;
        this.priceLevel = priceLevel;
        this.customData = customData;
    }

    /**
     * The amount of seconds that define the duration of this given PriceLevelScheduleEntry.
     * 
     * (Required)
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * The amount of seconds that define the duration of this given PriceLevelScheduleEntry.
     * 
     * (Required)
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * Defines the price level of this PriceLevelScheduleEntry (referring to NumberOfPriceLevels). Small values for the PriceLevel represent a cheaper PriceLevelScheduleEntry. Large values for the PriceLevel represent a more expensive PriceLevelScheduleEntry.
     * 
     * (Required)
     */
    public Integer getPriceLevel() {
        return priceLevel;
    }

    /**
     * Defines the price level of this PriceLevelScheduleEntry (referring to NumberOfPriceLevels). Small values for the PriceLevel represent a cheaper PriceLevelScheduleEntry. Large values for the PriceLevel represent a more expensive PriceLevelScheduleEntry.
     * 
     * (Required)
     */
    public void setPriceLevel(Integer priceLevel) {
        this.priceLevel = priceLevel;
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
