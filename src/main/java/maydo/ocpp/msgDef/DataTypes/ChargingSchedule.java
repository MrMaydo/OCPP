package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.Enumerations.ChargingRateUnitEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class ChargingSchedule implements JsonInterface {

    /**
     * 
     * (Required)
     */
    @Required
    private Integer id;
    @Optional
    private LimitAtSoC limitAtSoC;
    /**
     * Starting point of an absolute schedule or recurring schedule.
     */
    @Optional
    private Date startSchedule;
    /**
     * Duration of the charging schedule in seconds. If the duration is left empty, the last period will continue indefinitely or until end of the transaction in case startSchedule is absent.
     */
    @Optional
    private Integer duration;
    /**
     * The unit of measure in which limits and setpoints are expressed.
     * 
     * (Required)
     */
    @Required
    private ChargingRateUnitEnum chargingRateUnit;
    /**
     * Minimum charging rate supported by the EV. The unit of measure is defined by the chargingRateUnit. This parameter is intended to be used by a local smart charging algorithm to optimize the power allocation for in the case a charging process is inefficient at lower charging rates. 
     */
    @Optional
    private Float minChargingRate;
    /**
     * *(2.1)* Power tolerance when following EVPowerProfile.
     * 
     */
    @Optional
    private Float powerTolerance;
    /**
     * *(2.1)* Id of this element for referencing in a signature.
     */
    @Optional
    private Integer signatureId;
    /**
     * *(2.1)* Base64 encoded hash (SHA256 for ISO 15118-2, SHA512 for ISO 15118-20) of the EXI price schedule element. Used in signature.
     */
    @Optional
    private String digestValue;
    /**
     * *(2.1)* Defaults to false. When true, disregard time zone offset in dateTime fields of  _ChargingScheduleType_ and use unqualified local time at Charging Station instead.
     *  This allows the same `Absolute` or `Recurring` charging profile to be used in both summer and winter time.
     * 
     */
    @Optional
    private Boolean useLocalTime;
    /**
     * 
     * (Required)
     */
    @Required
    private List<ChargingSchedulePeriod> chargingSchedulePeriod;
    /**
     * *(2.1)* Defaults to 0. When _randomizedDelay_ not equals zero, then the start of each &lt;&lt;cmn_chargingscheduleperiodtype,ChargingSchedulePeriodType&gt;&gt; is delayed by a randomly chosen number of seconds between 0 and _randomizedDelay_.  Only allowed for TxProfile and TxDefaultProfile.
     * 
     */
    @Optional
    private Integer randomizedDelay;
    /**
     * A SalesTariff provided by a Mobility Operator (EMSP) .
     * NOTE: This dataType is based on dataTypes from &lt;&lt;ref-ISOIEC15118-2,ISO 15118-2&gt;&gt;.
     */
    @Optional
    private SalesTariff salesTariff;
    /**
     * The AbsolutePriceScheduleType is modeled after the same type that is defined in ISO 15118-20, such that if it is supplied by an EMSP as a signed EXI message, the conversion from EXI to JSON (in OCPP) and back to EXI (for ISO 15118-20) does not change the digest and therefore does not invalidate the signature.
     * 
     * image::images/AbsolutePriceSchedule-Simple.png[]
     * 
     */
    @Optional
    private AbsolutePriceSchedule absolutePriceSchedule;
    /**
     * The PriceLevelScheduleType is modeled after the same type that is defined in ISO 15118-20, such that if it is supplied by an EMSP as a signed EXI message, the conversion from EXI to JSON (in OCPP) and back to EXI (for ISO 15118-20) does not change the digest and therefore does not invalidate the signature.
     */
    @Optional
    private PriceLevelSchedule priceLevelSchedule;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public ChargingSchedule() {
    }

    /**
     * 
     * @param duration
     *     Duration of the charging schedule in seconds. If the duration is left empty, the last period will continue indefinitely or until end of the transaction in case startSchedule is absent.
     *     .
     * @param minChargingRate
     *     Minimum charging rate supported by the EV. The unit of measure is defined by the chargingRateUnit. This parameter is intended to be used by a local smart charging algorithm to optimize the power allocation for in the case a charging process is inefficient at lower charging rates. 
     *     .
     * @param digestValue
     *     *(2.1)* Base64 encoded hash (SHA256 for ISO 15118-2, SHA512 for ISO 15118-20) of the EXI price schedule element. Used in signature.
     *     .
     * @param startSchedule
     *     Starting point of an absolute schedule or recurring schedule.
     *     .
     * @param useLocalTime
     *     *(2.1)* Defaults to false. When true, disregard time zone offset in dateTime fields of  _ChargingScheduleType_ and use unqualified local time at Charging Station instead.
     *      This allows the same `Absolute` or `Recurring` charging profile to be used in both summer and winter time.
     *     
     *     .
     * @param randomizedDelay
     *     *(2.1)* Defaults to 0. When _randomizedDelay_ not equals zero, then the start of each &lt;&lt;cmn_chargingscheduleperiodtype,ChargingSchedulePeriodType&gt;&gt; is delayed by a randomly chosen number of seconds between 0 and _randomizedDelay_.  Only allowed for TxProfile and TxDefaultProfile.
     *     
     *     .
     * @param powerTolerance
     *     *(2.1)* Power tolerance when following EVPowerProfile.
     *     
     *     .
     * @param signatureId
     *     *(2.1)* Id of this element for referencing in a signature.
     *     .
     */
    public ChargingSchedule(Integer id, LimitAtSoC limitAtSoC, Date startSchedule, Integer duration, ChargingRateUnitEnum chargingRateUnit, Float minChargingRate, Float powerTolerance, Integer signatureId, String digestValue, Boolean useLocalTime, List<ChargingSchedulePeriod> chargingSchedulePeriod, Integer randomizedDelay, SalesTariff salesTariff, AbsolutePriceSchedule absolutePriceSchedule, PriceLevelSchedule priceLevelSchedule, CustomData customData) {
        super();
        this.id = id;
        this.limitAtSoC = limitAtSoC;
        this.startSchedule = startSchedule;
        this.duration = duration;
        this.chargingRateUnit = chargingRateUnit;
        this.minChargingRate = minChargingRate;
        this.powerTolerance = powerTolerance;
        this.signatureId = signatureId;
        this.digestValue = digestValue;
        this.useLocalTime = useLocalTime;
        this.chargingSchedulePeriod = chargingSchedulePeriod;
        this.randomizedDelay = randomizedDelay;
        this.salesTariff = salesTariff;
        this.absolutePriceSchedule = absolutePriceSchedule;
        this.priceLevelSchedule = priceLevelSchedule;
        this.customData = customData;
    }

    /**
     * 
     * (Required)
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * (Required)
     */
    public void setId(Integer id) {
        this.id = id;
    }

    public LimitAtSoC getLimitAtSoC() {
        return limitAtSoC;
    }

    public void setLimitAtSoC(LimitAtSoC limitAtSoC) {
        this.limitAtSoC = limitAtSoC;
    }

    /**
     * Starting point of an absolute schedule or recurring schedule.
     */
    public Date getStartSchedule() {
        return startSchedule;
    }

    /**
     * Starting point of an absolute schedule or recurring schedule.
     */
    public void setStartSchedule(Date startSchedule) {
        this.startSchedule = startSchedule;
    }

    /**
     * Duration of the charging schedule in seconds. If the duration is left empty, the last period will continue indefinitely or until end of the transaction in case startSchedule is absent.
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * Duration of the charging schedule in seconds. If the duration is left empty, the last period will continue indefinitely or until end of the transaction in case startSchedule is absent.
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * The unit of measure in which limits and setpoints are expressed.
     * 
     * (Required)
     */
    public ChargingRateUnitEnum getChargingRateUnit() {
        return chargingRateUnit;
    }

    /**
     * The unit of measure in which limits and setpoints are expressed.
     * 
     * (Required)
     */
    public void setChargingRateUnit(ChargingRateUnitEnum chargingRateUnit) {
        this.chargingRateUnit = chargingRateUnit;
    }

    /**
     * Minimum charging rate supported by the EV. The unit of measure is defined by the chargingRateUnit. This parameter is intended to be used by a local smart charging algorithm to optimize the power allocation for in the case a charging process is inefficient at lower charging rates. 
     */
    public Float getMinChargingRate() {
        return minChargingRate;
    }

    /**
     * Minimum charging rate supported by the EV. The unit of measure is defined by the chargingRateUnit. This parameter is intended to be used by a local smart charging algorithm to optimize the power allocation for in the case a charging process is inefficient at lower charging rates. 
     */
    public void setMinChargingRate(Float minChargingRate) {
        this.minChargingRate = minChargingRate;
    }

    /**
     * *(2.1)* Power tolerance when following EVPowerProfile.
     * 
     */
    public Float getPowerTolerance() {
        return powerTolerance;
    }

    /**
     * *(2.1)* Power tolerance when following EVPowerProfile.
     * 
     */
    public void setPowerTolerance(Float powerTolerance) {
        this.powerTolerance = powerTolerance;
    }

    /**
     * *(2.1)* Id of this element for referencing in a signature.
     */
    public Integer getSignatureId() {
        return signatureId;
    }

    /**
     * *(2.1)* Id of this element for referencing in a signature.
     */
    public void setSignatureId(Integer signatureId) {
        this.signatureId = signatureId;
    }

    /**
     * *(2.1)* Base64 encoded hash (SHA256 for ISO 15118-2, SHA512 for ISO 15118-20) of the EXI price schedule element. Used in signature.
     */
    public String getDigestValue() {
        return digestValue;
    }

    /**
     * *(2.1)* Base64 encoded hash (SHA256 for ISO 15118-2, SHA512 for ISO 15118-20) of the EXI price schedule element. Used in signature.
     */
    public void setDigestValue(String digestValue) {
        this.digestValue = digestValue;
    }

    /**
     * *(2.1)* Defaults to false. When true, disregard time zone offset in dateTime fields of  _ChargingScheduleType_ and use unqualified local time at Charging Station instead.
     *  This allows the same `Absolute` or `Recurring` charging profile to be used in both summer and winter time.
     * 
     */
    public Boolean getUseLocalTime() {
        return useLocalTime;
    }

    /**
     * *(2.1)* Defaults to false. When true, disregard time zone offset in dateTime fields of  _ChargingScheduleType_ and use unqualified local time at Charging Station instead.
     *  This allows the same `Absolute` or `Recurring` charging profile to be used in both summer and winter time.
     * 
     */
    public void setUseLocalTime(Boolean useLocalTime) {
        this.useLocalTime = useLocalTime;
    }

    /**
     * 
     * (Required)
     */
    public List<ChargingSchedulePeriod> getChargingSchedulePeriod() {
        return chargingSchedulePeriod;
    }

    /**
     * 
     * (Required)
     */
    public void setChargingSchedulePeriod(List<ChargingSchedulePeriod> chargingSchedulePeriod) {
        this.chargingSchedulePeriod = chargingSchedulePeriod;
    }

    /**
     * *(2.1)* Defaults to 0. When _randomizedDelay_ not equals zero, then the start of each &lt;&lt;cmn_chargingscheduleperiodtype,ChargingSchedulePeriodType&gt;&gt; is delayed by a randomly chosen number of seconds between 0 and _randomizedDelay_.  Only allowed for TxProfile and TxDefaultProfile.
     * 
     */
    public Integer getRandomizedDelay() {
        return randomizedDelay;
    }

    /**
     * *(2.1)* Defaults to 0. When _randomizedDelay_ not equals zero, then the start of each &lt;&lt;cmn_chargingscheduleperiodtype,ChargingSchedulePeriodType&gt;&gt; is delayed by a randomly chosen number of seconds between 0 and _randomizedDelay_.  Only allowed for TxProfile and TxDefaultProfile.
     * 
     */
    public void setRandomizedDelay(Integer randomizedDelay) {
        this.randomizedDelay = randomizedDelay;
    }

    /**
     * A SalesTariff provided by a Mobility Operator (EMSP) .
     * NOTE: This dataType is based on dataTypes from &lt;&lt;ref-ISOIEC15118-2,ISO 15118-2&gt;&gt;.
     */
    public SalesTariff getSalesTariff() {
        return salesTariff;
    }

    /**
     * A SalesTariff provided by a Mobility Operator (EMSP) .
     * NOTE: This dataType is based on dataTypes from &lt;&lt;ref-ISOIEC15118-2,ISO 15118-2&gt;&gt;.
     */
    public void setSalesTariff(SalesTariff salesTariff) {
        this.salesTariff = salesTariff;
    }

    /**
     * The AbsolutePriceScheduleType is modeled after the same type that is defined in ISO 15118-20, such that if it is supplied by an EMSP as a signed EXI message, the conversion from EXI to JSON (in OCPP) and back to EXI (for ISO 15118-20) does not change the digest and therefore does not invalidate the signature.
     * 
     * image::images/AbsolutePriceSchedule-Simple.png[]
     * 
     */
    public AbsolutePriceSchedule getAbsolutePriceSchedule() {
        return absolutePriceSchedule;
    }

    /**
     * The AbsolutePriceScheduleType is modeled after the same type that is defined in ISO 15118-20, such that if it is supplied by an EMSP as a signed EXI message, the conversion from EXI to JSON (in OCPP) and back to EXI (for ISO 15118-20) does not change the digest and therefore does not invalidate the signature.
     * 
     * image::images/AbsolutePriceSchedule-Simple.png[]
     * 
     */
    public void setAbsolutePriceSchedule(AbsolutePriceSchedule absolutePriceSchedule) {
        this.absolutePriceSchedule = absolutePriceSchedule;
    }

    /**
     * The PriceLevelScheduleType is modeled after the same type that is defined in ISO 15118-20, such that if it is supplied by an EMSP as a signed EXI message, the conversion from EXI to JSON (in OCPP) and back to EXI (for ISO 15118-20) does not change the digest and therefore does not invalidate the signature.
     */
    public PriceLevelSchedule getPriceLevelSchedule() {
        return priceLevelSchedule;
    }

    /**
     * The PriceLevelScheduleType is modeled after the same type that is defined in ISO 15118-20, such that if it is supplied by an EMSP as a signed EXI message, the conversion from EXI to JSON (in OCPP) and back to EXI (for ISO 15118-20) does not change the digest and therefore does not invalidate the signature.
     */
    public void setPriceLevelSchedule(PriceLevelSchedule priceLevelSchedule) {
        this.priceLevelSchedule = priceLevelSchedule;
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
