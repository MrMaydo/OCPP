package maydo.ocpp.msgDef.Messages;

import maydo.ocpp.msgDef.DataTypes.ChargingNeeds;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Date;
import java.util.Objects;

public class NotifyEVChargingNeedsRequest implements JsonInterface {

    /**
     * Defines the EVSE and connector to which the EV is connected. EvseId may not be 0.
     * 
     * (Required)
     */
    @Required
    private Integer evseId;
    /**
     * Contains the maximum elements the EV supports for: +
     * - ISO 15118-2: schedule tuples in SASchedule (both Pmax and Tariff). +
     * - ISO 15118-20: PowerScheduleEntry, PriceRule and PriceLevelScheduleEntries.
     */
    @Optional
    private Integer maxScheduleTuples;
    /**
     * 
     * (Required)
     */
    @Required
    private ChargingNeeds chargingNeeds;
    /**
     * *(2.1)* Time when EV charging needs were received. +
     * Field can be added when charging station was offline when charging needs were received.
     * 
     */
    @Optional
    private Date timestamp;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public NotifyEVChargingNeedsRequest() {
    }

    /**
     * 
     * @param evseId
     *     Defines the EVSE and connector to which the EV is connected. EvseId may not be 0.
     *     .
     * @param maxScheduleTuples
     *     Contains the maximum elements the EV supports for: +
     *     - ISO 15118-2: schedule tuples in SASchedule (both Pmax and Tariff). +
     *     - ISO 15118-20: PowerScheduleEntry, PriceRule and PriceLevelScheduleEntries.
     *     .
     * @param timestamp
     *     *(2.1)* Time when EV charging needs were received. +
     *     Field can be added when charging station was offline when charging needs were received.
     *     
     *     .
     */
    public NotifyEVChargingNeedsRequest(Integer evseId, Integer maxScheduleTuples, ChargingNeeds chargingNeeds, Date timestamp, CustomData customData) {
        super();
        this.evseId = evseId;
        this.maxScheduleTuples = maxScheduleTuples;
        this.chargingNeeds = chargingNeeds;
        this.timestamp = timestamp;
        this.customData = customData;
    }

    /**
     * Defines the EVSE and connector to which the EV is connected. EvseId may not be 0.
     * 
     * (Required)
     */
    public Integer getEvseId() {
        return evseId;
    }

    /**
     * Defines the EVSE and connector to which the EV is connected. EvseId may not be 0.
     * 
     * (Required)
     */
    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
    }

    /**
     * Contains the maximum elements the EV supports for: +
     * - ISO 15118-2: schedule tuples in SASchedule (both Pmax and Tariff). +
     * - ISO 15118-20: PowerScheduleEntry, PriceRule and PriceLevelScheduleEntries.
     */
    public Integer getMaxScheduleTuples() {
        return maxScheduleTuples;
    }

    /**
     * Contains the maximum elements the EV supports for: +
     * - ISO 15118-2: schedule tuples in SASchedule (both Pmax and Tariff). +
     * - ISO 15118-20: PowerScheduleEntry, PriceRule and PriceLevelScheduleEntries.
     */
    public void setMaxScheduleTuples(Integer maxScheduleTuples) {
        this.maxScheduleTuples = maxScheduleTuples;
    }

    /**
     * 
     * (Required)
     */
    public ChargingNeeds getChargingNeeds() {
        return chargingNeeds;
    }

    /**
     * 
     * (Required)
     */
    public void setChargingNeeds(ChargingNeeds chargingNeeds) {
        this.chargingNeeds = chargingNeeds;
    }

    /**
     * *(2.1)* Time when EV charging needs were received. +
     * Field can be added when charging station was offline when charging needs were received.
     * 
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
     * *(2.1)* Time when EV charging needs were received. +
     * Field can be added when charging station was offline when charging needs were received.
     * 
     */
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
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
        if (!(obj instanceof NotifyEVChargingNeedsRequest))
            return false;
        NotifyEVChargingNeedsRequest that = (NotifyEVChargingNeedsRequest) obj;
        return Objects.equals(this.evseId, that.evseId)
                && Objects.equals(this.customData, that.customData) 
                && Objects.equals(this.maxScheduleTuples, that.maxScheduleTuples) 
                && Objects.equals(this.chargingNeeds, that.chargingNeeds) 
                && Objects.equals(this.timestamp, that.timestamp);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.evseId != null ? this.evseId.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.maxScheduleTuples != null ? this.maxScheduleTuples.hashCode() : 0);
        result = 31 * result + (this.chargingNeeds != null ? this.chargingNeeds.hashCode() : 0);
        result = 31 * result + (this.timestamp != null ? this.timestamp.hashCode() : 0);
        return result;
    }
}
