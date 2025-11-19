package maydo.ocpp.msgDef.DataTypes;

import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class PriceLevelSchedule implements JsonInterface {

    /**
     * 
     * (Required)
     */
    @Required
    private List<PriceLevelScheduleEntry> priceLevelScheduleEntries;
    /**
     * Starting point of this price schedule.
     * 
     * (Required)
     */
    @Required
    private Date timeAnchor;
    /**
     * Unique ID of this price schedule.
     * 
     * (Required)
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
     * 
     * (Required)
     */
    @Required
    private Integer numberOfPriceLevels;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public PriceLevelSchedule() {
    }

    /**
     * 
     * @param priceScheduleId
     *     Unique ID of this price schedule.
     *     .
     * @param timeAnchor
     *     Starting point of this price schedule.
     *     .
     * @param priceScheduleDescription
     *     Description of the price schedule.
     *     .
     * @param numberOfPriceLevels
     *     Defines the overall number of distinct price level elements used across all PriceLevelSchedules.
     *     .
     */
    public PriceLevelSchedule(List<PriceLevelScheduleEntry> priceLevelScheduleEntries, Date timeAnchor, Integer priceScheduleId, String priceScheduleDescription, Integer numberOfPriceLevels, CustomData customData) {
        super();
        this.priceLevelScheduleEntries = priceLevelScheduleEntries;
        this.timeAnchor = timeAnchor;
        this.priceScheduleId = priceScheduleId;
        this.priceScheduleDescription = priceScheduleDescription;
        this.numberOfPriceLevels = numberOfPriceLevels;
        this.customData = customData;
    }

    /**
     * 
     * (Required)
     */
    public List<PriceLevelScheduleEntry> getPriceLevelScheduleEntries() {
        return priceLevelScheduleEntries;
    }

    /**
     * 
     * (Required)
     */
    public void setPriceLevelScheduleEntries(List<PriceLevelScheduleEntry> priceLevelScheduleEntries) {
        this.priceLevelScheduleEntries = priceLevelScheduleEntries;
    }

    /**
     * Starting point of this price schedule.
     * 
     * (Required)
     */
    public Date getTimeAnchor() {
        return timeAnchor;
    }

    /**
     * Starting point of this price schedule.
     * 
     * (Required)
     */
    public void setTimeAnchor(Date timeAnchor) {
        this.timeAnchor = timeAnchor;
    }

    /**
     * Unique ID of this price schedule.
     * 
     * (Required)
     */
    public Integer getPriceScheduleId() {
        return priceScheduleId;
    }

    /**
     * Unique ID of this price schedule.
     * 
     * (Required)
     */
    public void setPriceScheduleId(Integer priceScheduleId) {
        this.priceScheduleId = priceScheduleId;
    }

    /**
     * Description of the price schedule.
     */
    public String getPriceScheduleDescription() {
        return priceScheduleDescription;
    }

    /**
     * Description of the price schedule.
     */
    public void setPriceScheduleDescription(String priceScheduleDescription) {
        this.priceScheduleDescription = priceScheduleDescription;
    }

    /**
     * Defines the overall number of distinct price level elements used across all PriceLevelSchedules.
     * 
     * (Required)
     */
    public Integer getNumberOfPriceLevels() {
        return numberOfPriceLevels;
    }

    /**
     * Defines the overall number of distinct price level elements used across all PriceLevelSchedules.
     * 
     * (Required)
     */
    public void setNumberOfPriceLevels(Integer numberOfPriceLevels) {
        this.numberOfPriceLevels = numberOfPriceLevels;
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
