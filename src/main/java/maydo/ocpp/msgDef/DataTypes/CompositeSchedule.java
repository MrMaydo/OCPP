package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.Enumerations.ChargingRateUnitEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import static maydo.ocpp.config.Configuration.DATE_FORMAT;

public class CompositeSchedule implements JsonInterface {

    /**
     * (Required)
     */
    @Required
    private Integer evseId;
    /**
     * (Required)
     */
    @Required
    private Integer duration;
    /**
     * (Required)
     */
    @Required
    private Date scheduleStart;
    /**
     * (Required)
     */
    @Required
    private ChargingRateUnitEnum chargingRateUnit;
    /**
     * (Required)
     */
    @Required
    private List<ChargingSchedulePeriod> chargingSchedulePeriod;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public CompositeSchedule() {
    }

    public CompositeSchedule(Integer evseId, Integer duration, Date scheduleStart, ChargingRateUnitEnum chargingRateUnit, List<ChargingSchedulePeriod> chargingSchedulePeriod, CustomData customData) {
        super();
        this.evseId = evseId;
        this.duration = duration;
        this.scheduleStart = scheduleStart;
        this.chargingRateUnit = chargingRateUnit;
        this.chargingSchedulePeriod = chargingSchedulePeriod;
        this.customData = customData;
    }

    /**
     * (Required)
     */
    public Integer getEvseId() {
        return evseId;
    }

    /**
     * (Required)
     */
    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
    }

    /**
     * (Required)
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * (Required)
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * (Required)
     */
    public Date getScheduleStart() {
        return scheduleStart;
    }

    /**
     * (Required)
     */
    public void setScheduleStart(Date scheduleStart) {
        this.scheduleStart = scheduleStart;
    }

    /**
     * (Required)
     */
    public ChargingRateUnitEnum getChargingRateUnit() {
        return chargingRateUnit;
    }

    /**
     * (Required)
     */
    public void setChargingRateUnit(ChargingRateUnitEnum chargingRateUnit) {
        this.chargingRateUnit = chargingRateUnit;
    }

    /**
     * (Required)
     */
    public List<ChargingSchedulePeriod> getChargingSchedulePeriod() {
        return chargingSchedulePeriod;
    }

    /**
     * (Required)
     */
    public void setChargingSchedulePeriod(List<ChargingSchedulePeriod> chargingSchedulePeriod) {
        this.chargingSchedulePeriod = chargingSchedulePeriod;
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
        JsonObject json = new JsonObject();
        json.addProperty("evseId", evseId);
        json.addProperty("duration", duration);
        json.addProperty("scheduleStart", new SimpleDateFormat(DATE_FORMAT).format(scheduleStart));
        json.addProperty("chargingRateUnit", chargingRateUnit.toString());
        json.add("customData", customData.toJsonObject());
        return json;
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
        if (!(obj instanceof CompositeSchedule))
            return false;
        CompositeSchedule that = (CompositeSchedule) obj;
        return Objects.equals(this.evseId, that.evseId)
                && Objects.equals(this.duration, that.duration)
                && Objects.equals(this.scheduleStart, that.scheduleStart)
                && Objects.equals(this.chargingSchedulePeriod, that.chargingSchedulePeriod)
                && Objects.equals(this.chargingRateUnit, that.chargingRateUnit)
                && Objects.equals(this.customData, that.customData);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.evseId != null ? this.evseId.hashCode() : 0);
        result = 31 * result + (this.duration != null ? this.duration.hashCode() : 0);
        result = 31 * result + (this.scheduleStart != null ? this.scheduleStart.hashCode() : 0);
        result = 31 * result + (this.chargingSchedulePeriod != null ? this.chargingSchedulePeriod.hashCode() : 0);
        result = 31 * result + (this.chargingRateUnit != null ? this.chargingRateUnit.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        return result;
    }
}
