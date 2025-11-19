package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.ChargingSchedule;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Date;
import java.util.Objects;

public class NotifyEVChargingScheduleRequest implements JsonInterface {

    /**
     * Periods contained in the charging profile are relative to this point in time.
     * 
     * (Required)
     */
    @Required
    private Date timeBase;
    /**
     * Charging schedule structure defines a list of charging periods, as used in: NotifyEVChargingScheduleRequest and ChargingProfileType. When used in a NotifyEVChargingScheduleRequest only _duration_ and _chargingSchedulePeriod_ are relevant and _chargingRateUnit_ must be 'W'. +
     * An ISO 15118-20 session may provide either an _absolutePriceSchedule_ or a _priceLevelSchedule_. An ISO 15118-2 session can only provide a_salesTariff_ element. The field _digestValue_ is used when price schedule or sales tariff are signed.
     * 
     * image::images/ChargingSchedule-Simple.png[]
     * 
     * 
     * 
     * (Required)
     */
    @Required
    private ChargingSchedule chargingSchedule;
    /**
     * The charging schedule contained in this notification applies to an EVSE. EvseId must be &gt; 0.
     * 
     * (Required)
     */
    @Required
    private Integer evseId;
    /**
     * *(2.1)* Id  of the _chargingSchedule_ that EV selected from the provided ChargingProfile.
     */
    @Optional
    private Integer selectedChargingScheduleId;
    /**
     * *(2.1)* True when power tolerance is accepted by EV.
     * This value is taken from EVPowerProfile.PowerToleranceAcceptance in the ISO 15118-20 PowerDeliverReq message..
     */
    @Optional
    private Boolean powerToleranceAcceptance;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public NotifyEVChargingScheduleRequest() {
    }

    /**
     * 
     * @param evseId
     *     The charging schedule contained in this notification applies to an EVSE. EvseId must be &gt; 0.
     *     .
     * @param timeBase
     *     Periods contained in the charging profile are relative to this point in time.
     *     .
     * @param selectedChargingScheduleId
     *     *(2.1)* Id  of the _chargingSchedule_ that EV selected from the provided ChargingProfile.
     *     .
     * @param powerToleranceAcceptance
     *     *(2.1)* True when power tolerance is accepted by EV.
     *     This value is taken from EVPowerProfile.PowerToleranceAcceptance in the ISO 15118-20 PowerDeliverReq message..
     *     .
     */
    public NotifyEVChargingScheduleRequest(Date timeBase, ChargingSchedule chargingSchedule, Integer evseId, Integer selectedChargingScheduleId, Boolean powerToleranceAcceptance, CustomData customData) {
        super();
        this.timeBase = timeBase;
        this.chargingSchedule = chargingSchedule;
        this.evseId = evseId;
        this.selectedChargingScheduleId = selectedChargingScheduleId;
        this.powerToleranceAcceptance = powerToleranceAcceptance;
        this.customData = customData;
    }

    /**
     * Periods contained in the charging profile are relative to this point in time.
     * 
     * (Required)
     */
    public Date getTimeBase() {
        return timeBase;
    }

    /**
     * Periods contained in the charging profile are relative to this point in time.
     * 
     * (Required)
     */
    public void setTimeBase(Date timeBase) {
        this.timeBase = timeBase;
    }

    /**
     * Charging schedule structure defines a list of charging periods, as used in: NotifyEVChargingScheduleRequest and ChargingProfileType. When used in a NotifyEVChargingScheduleRequest only _duration_ and _chargingSchedulePeriod_ are relevant and _chargingRateUnit_ must be 'W'. +
     * An ISO 15118-20 session may provide either an _absolutePriceSchedule_ or a _priceLevelSchedule_. An ISO 15118-2 session can only provide a_salesTariff_ element. The field _digestValue_ is used when price schedule or sales tariff are signed.
     * 
     * image::images/ChargingSchedule-Simple.png[]
     * 
     * 
     * 
     * (Required)
     */
    public ChargingSchedule getChargingSchedule() {
        return chargingSchedule;
    }

    /**
     * Charging schedule structure defines a list of charging periods, as used in: NotifyEVChargingScheduleRequest and ChargingProfileType. When used in a NotifyEVChargingScheduleRequest only _duration_ and _chargingSchedulePeriod_ are relevant and _chargingRateUnit_ must be 'W'. +
     * An ISO 15118-20 session may provide either an _absolutePriceSchedule_ or a _priceLevelSchedule_. An ISO 15118-2 session can only provide a_salesTariff_ element. The field _digestValue_ is used when price schedule or sales tariff are signed.
     * 
     * image::images/ChargingSchedule-Simple.png[]
     * 
     * 
     * 
     * (Required)
     */
    public void setChargingSchedule(ChargingSchedule chargingSchedule) {
        this.chargingSchedule = chargingSchedule;
    }

    /**
     * The charging schedule contained in this notification applies to an EVSE. EvseId must be &gt; 0.
     * 
     * (Required)
     */
    public Integer getEvseId() {
        return evseId;
    }

    /**
     * The charging schedule contained in this notification applies to an EVSE. EvseId must be &gt; 0.
     * 
     * (Required)
     */
    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
    }

    /**
     * *(2.1)* Id  of the _chargingSchedule_ that EV selected from the provided ChargingProfile.
     */
    public Integer getSelectedChargingScheduleId() {
        return selectedChargingScheduleId;
    }

    /**
     * *(2.1)* Id  of the _chargingSchedule_ that EV selected from the provided ChargingProfile.
     */
    public void setSelectedChargingScheduleId(Integer selectedChargingScheduleId) {
        this.selectedChargingScheduleId = selectedChargingScheduleId;
    }

    /**
     * *(2.1)* True when power tolerance is accepted by EV.
     * This value is taken from EVPowerProfile.PowerToleranceAcceptance in the ISO 15118-20 PowerDeliverReq message..
     */
    public Boolean getPowerToleranceAcceptance() {
        return powerToleranceAcceptance;
    }

    /**
     * *(2.1)* True when power tolerance is accepted by EV.
     * This value is taken from EVPowerProfile.PowerToleranceAcceptance in the ISO 15118-20 PowerDeliverReq message..
     */
    public void setPowerToleranceAcceptance(Boolean powerToleranceAcceptance) {
        this.powerToleranceAcceptance = powerToleranceAcceptance;
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
        if (!(obj instanceof NotifyEVChargingScheduleRequest))
            return false;
        NotifyEVChargingScheduleRequest that = (NotifyEVChargingScheduleRequest) obj;
        return Objects.equals(this.evseId, that.evseId)
                && Objects.equals(this.chargingSchedule, that.chargingSchedule) 
                && Objects.equals(this.customData, that.customData) 
                && Objects.equals(this.timeBase, that.timeBase) 
                && Objects.equals(this.selectedChargingScheduleId, that.selectedChargingScheduleId) 
                && Objects.equals(this.powerToleranceAcceptance, that.powerToleranceAcceptance);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.evseId != null ? this.evseId.hashCode() : 0);
        result = 31 * result + (this.chargingSchedule != null ? this.chargingSchedule.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.timeBase != null ? this.timeBase.hashCode() : 0);
        result = 31 * result + (this.selectedChargingScheduleId != null ? this.selectedChargingScheduleId.hashCode() : 0);
        result = 31 * result + (this.powerToleranceAcceptance != null ? this.powerToleranceAcceptance.hashCode() : 0);
        return result;
    }
}
