package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.Enumerations.ChargingRateUnitEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import static maydo.ocpp.config.Configuration.DATE_FORMAT;

/**
 * Charging schedule structure defines a list of charging periods, as used in:
 * NotifyEVChargingScheduleRequest and ChargingProfileType.
 * When used in a NotifyEVChargingScheduleRequest only duration and chargingSchedulePeriod are relevant and chargingRateUnit must be 'W'.
 * An ISO 15118-20 session may provide either an absolutePriceSchedule or a priceLevelSchedule.
 * An ISO 15118-2 session can only provide a_salesTariff_ element.
 * The field digestValue is used when price schedule or sales tariff are signed.
 */
public class ChargingSchedule implements JsonInterface {

    /**
     * When present and SoC of EV is greater than or equal to soc, then charging limit or setpoint will be capped to the value of limit.
     */
    @Required
    private Integer id;

    /**
     *
     */
    @Optional
    private LimitAtSoC limitAtSoC;

    /**
     * Starting point of an absolute schedule or recurring schedule.
     */
    @Optional
    private Date startSchedule;

    /**
     * Duration of the charging schedule in seconds.
     * If the duration is left empty, the last period will continue indefinitely
     * or until end of the transaction in case startSchedule is absent.
     */
    @Optional
    private Integer duration;

    /**
     * The unit of measure in which limits and setpoints are expressed.
     */
    @Required
    private ChargingRateUnitEnum chargingRateUnit;

    /**
     * Minimum charging rate supported by the EV. The unit of measure is defined by the chargingRateUnit.
     * This parameter is intended to be used by a local smart charging algorithm
     * to optimize the power allocation for in the case a charging process is inefficient at lower charging rates.
     */
    @Optional
    private Float minChargingRate;

    /**
     * Power tolerance when following EVPowerProfile.
     */
    @Optional
    private Float powerTolerance;

    /**
     * Id of this element for referencing in a signature.
     */
    @Optional
    private Integer signatureId;

    /**
     * Base64 encoded hash (SHA256 for ISO 15118-2, SHA512 for ISO 15118-20) of the EXI price schedule element.
     * Used in signature
     */
    @Optional
    private String digestValue;

    /**
     * Defaults to false. When true, disregard time zone offset in dateTime fields of ChargingScheduleType
     * and use unqualified local time at Charging Station instead.
     * This allows the same Absolute  or  Recurring  charging profile to be used in both summer and winter time.
     */
    @Optional
    private Boolean useLocalTime;

    /**
     * List of ChargingSchedulePeriod elements defining maximum power or current usage over time.
     * The maximum number of periods, that is supported by the Charging Station,
     * if less than 1024, is set by device model variable SmartChargingCtrlr.PeriodsPerSchedule.
     */
    @Required
    private List<ChargingSchedulePeriod> chargingSchedulePeriod;

    /**
     * Defaults to 0. When randomizedDelay not equals zero,
     * then the start of each ChargingSchedulePeriodType is delayed by a randomly chosen number of seconds between 0 and randomizedDelay.
     * Only allowed for TxProfile and TxDefaultProfile.
     */
    @Optional
    private Integer randomizedDelay;

    /**
     * Sales tariff for charging associated with this schedule.
     */
    @Optional
    private SalesTariff salesTariff;

    /**
     * The ISO 15118-20 absolute price schedule.
     */
    @Optional
    private AbsolutePriceSchedule absolutePriceSchedule;

    /**
     * The ISO 15118-20 price level schedule
     */
    @Optional
    private PriceLevelSchedule priceLevelSchedule;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public ChargingSchedule() {
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public LimitAtSoC getLimitAtSoC() {
        return limitAtSoC;
    }

    public void setLimitAtSoC(LimitAtSoC limitAtSoC) {
        this.limitAtSoC = limitAtSoC;
    }


    public Date getStartSchedule() {
        return startSchedule;
    }


    public void setStartSchedule(Date startSchedule) {
        this.startSchedule = startSchedule;
    }


    public Integer getDuration() {
        return duration;
    }


    public void setDuration(Integer duration) {
        this.duration = duration;
    }


    public ChargingRateUnitEnum getChargingRateUnit() {
        return chargingRateUnit;
    }


    public void setChargingRateUnit(ChargingRateUnitEnum chargingRateUnit) {
        this.chargingRateUnit = chargingRateUnit;
    }


    public Float getMinChargingRate() {
        return minChargingRate;
    }


    public void setMinChargingRate(Float minChargingRate) {
        this.minChargingRate = minChargingRate;
    }


    public Float getPowerTolerance() {
        return powerTolerance;
    }


    public void setPowerTolerance(Float powerTolerance) {
        this.powerTolerance = powerTolerance;
    }


    public Integer getSignatureId() {
        return signatureId;
    }


    public void setSignatureId(Integer signatureId) {
        this.signatureId = signatureId;
    }


    public String getDigestValue() {
        return digestValue;
    }


    public void setDigestValue(String digestValue) {
        this.digestValue = digestValue;
    }


    public Boolean getUseLocalTime() {
        return useLocalTime;
    }


    public void setUseLocalTime(Boolean useLocalTime) {
        this.useLocalTime = useLocalTime;
    }


    public List<ChargingSchedulePeriod> getChargingSchedulePeriod() {
        return chargingSchedulePeriod;
    }


    public void setChargingSchedulePeriod(List<ChargingSchedulePeriod> chargingSchedulePeriod) {
        this.chargingSchedulePeriod = chargingSchedulePeriod;
    }


    public Integer getRandomizedDelay() {
        return randomizedDelay;
    }


    public void setRandomizedDelay(Integer randomizedDelay) {
        this.randomizedDelay = randomizedDelay;
    }


    public SalesTariff getSalesTariff() {
        return salesTariff;
    }


    public void setSalesTariff(SalesTariff salesTariff) {
        this.salesTariff = salesTariff;
    }


    public AbsolutePriceSchedule getAbsolutePriceSchedule() {
        return absolutePriceSchedule;
    }


    public void setAbsolutePriceSchedule(AbsolutePriceSchedule absolutePriceSchedule) {
        this.absolutePriceSchedule = absolutePriceSchedule;
    }


    public PriceLevelSchedule getPriceLevelSchedule() {
        return priceLevelSchedule;
    }


    public void setPriceLevelSchedule(PriceLevelSchedule priceLevelSchedule) {
        this.priceLevelSchedule = priceLevelSchedule;
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
        json.addProperty("id", id);
        json.add("limitAtSoC", limitAtSoC.toJsonObject());
        json.addProperty("startSchedule", new SimpleDateFormat(DATE_FORMAT).format(startSchedule));
        json.addProperty("duration", duration);
        json.addProperty("chargingRateUnit", chargingRateUnit.toString());
        json.addProperty("minChargingRate", minChargingRate);
        json.addProperty("powerTolerance", powerTolerance);
        json.addProperty("signatureId", signatureId);
        json.addProperty("digestValue", digestValue);
        json.addProperty("useLocalTime", useLocalTime);
        json.addProperty("randomizedDelay", randomizedDelay);
        json.add("salesTariff", salesTariff.toJsonObject());
        json.add("absolutePriceSchedule", absolutePriceSchedule.toJsonObject());
        json.add("priceLevelSchedule", priceLevelSchedule.toJsonObject());
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
        if (jsonObject.has("id")) {
            this.id = jsonObject.get("id").getAsInt();
        }

        if (jsonObject.has("limitAtSoC")) {
            this.limitAtSoC = new LimitAtSoC();
            this.limitAtSoC.fromJsonObject(jsonObject.getAsJsonObject("limitAtSoC"));
        }

        if (jsonObject.has("startSchedule")) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                this.startSchedule = dateFormat.parse(jsonObject.get("startSchedule").getAsString());
            } catch (ParseException e) {
                System.out.println("Invalid date format for startSchedule" + e);
            }
        }

        if (jsonObject.has("duration")) {
            this.duration = jsonObject.get("duration").getAsInt();
        }

        if (jsonObject.has("chargingRateUnit")) {
            this.chargingRateUnit = ChargingRateUnitEnum.valueOf(jsonObject.get("chargingRateUnit").getAsString());
        }

        if (jsonObject.has("minChargingRate")) {
            this.minChargingRate = jsonObject.get("minChargingRate").getAsFloat();
        }

        if (jsonObject.has("powerTolerance")) {
            this.powerTolerance = jsonObject.get("powerTolerance").getAsFloat();
        }

        if (jsonObject.has("signatureId")) {
            this.signatureId = jsonObject.get("signatureId").getAsInt();
        }

        if (jsonObject.has("digestValue")) {
            this.digestValue = jsonObject.get("digestValue").getAsString();
        }

        if (jsonObject.has("useLocalTime")) {
            this.useLocalTime = jsonObject.get("useLocalTime").getAsBoolean();
        }

        if (jsonObject.has("randomizedDelay")) {
            this.randomizedDelay = jsonObject.get("randomizedDelay").getAsInt();
        }

        if (jsonObject.has("salesTariff")) {
            this.salesTariff = new SalesTariff();
            this.salesTariff.fromJsonObject(jsonObject.getAsJsonObject("salesTariff"));
        }

        if (jsonObject.has("absolutePriceSchedule")) {
            this.absolutePriceSchedule = new AbsolutePriceSchedule();
            this.absolutePriceSchedule.fromJsonObject(jsonObject.getAsJsonObject("absolutePriceSchedule"));
        }

        if (jsonObject.has("priceLevelSchedule")) {
            this.priceLevelSchedule = new PriceLevelSchedule();
            this.priceLevelSchedule.fromJsonObject(jsonObject.getAsJsonObject("priceLevelSchedule"));
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
        if (!(obj instanceof ChargingSchedule))
            return false;
        ChargingSchedule that = (ChargingSchedule) obj;
        return Objects.equals(this.startSchedule, that.startSchedule)
                && Objects.equals(this.chargingSchedulePeriod, that.chargingSchedulePeriod)
                && Objects.equals(this.salesTariff, that.salesTariff)
                && Objects.equals(this.chargingRateUnit, that.chargingRateUnit)
                && Objects.equals(this.powerTolerance, that.powerTolerance)
                && Objects.equals(this.signatureId, that.signatureId)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.limitAtSoC, that.limitAtSoC)
                && Objects.equals(this.duration, that.duration)
                && Objects.equals(this.minChargingRate, that.minChargingRate)
                && Objects.equals(this.digestValue, that.digestValue)
                && Objects.equals(this.useLocalTime, that.useLocalTime)
                && Objects.equals(this.priceLevelSchedule, that.priceLevelSchedule)
                && Objects.equals(this.randomizedDelay, that.randomizedDelay)
                && Objects.equals(this.id, that.id)
                && Objects.equals(this.absolutePriceSchedule, that.absolutePriceSchedule);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.startSchedule != null ? this.startSchedule.hashCode() : 0);
        result = 31 * result + (this.chargingSchedulePeriod != null ? this.chargingSchedulePeriod.hashCode() : 0);
        result = 31 * result + (this.salesTariff != null ? this.salesTariff.hashCode() : 0);
        result = 31 * result + (this.chargingRateUnit != null ? this.chargingRateUnit.hashCode() : 0);
        result = 31 * result + (this.powerTolerance != null ? this.powerTolerance.hashCode() : 0);
        result = 31 * result + (this.signatureId != null ? this.signatureId.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.limitAtSoC != null ? this.limitAtSoC.hashCode() : 0);
        result = 31 * result + (this.duration != null ? this.duration.hashCode() : 0);
        result = 31 * result + (this.minChargingRate != null ? this.minChargingRate.hashCode() : 0);
        result = 31 * result + (this.digestValue != null ? this.digestValue.hashCode() : 0);
        result = 31 * result + (this.useLocalTime != null ? this.useLocalTime.hashCode() : 0);
        result = 31 * result + (this.priceLevelSchedule != null ? this.priceLevelSchedule.hashCode() : 0);
        result = 31 * result + (this.randomizedDelay != null ? this.randomizedDelay.hashCode() : 0);
        result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
        result = 31 * result + (this.absolutePriceSchedule != null ? this.absolutePriceSchedule.hashCode() : 0);
        return result;
    }
}
