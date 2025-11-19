package maydo.ocpp.msgDef.DataTypes;

import maydo.ocpp.msgDef.Enumerations.DayOfWeekEnum;
import maydo.ocpp.msgDef.Enumerations.EvseKindEnum;
import maydo.ocpp.msgDef.annotations.Optional;

import java.util.List;
import java.util.Objects;

public class TariffConditions {

    /**
     * Start time of day in local time. +
     * Format as per RFC 3339: time-hour ":" time-minute  +
     * Must be in 24h format with leading zeros. Hour/Minute separator: ":"
     * Regex: ([0-1][0-9]\|2[0-3]):[0-5][0-9]
     */
    @Optional
    private String startTimeOfDay;
    /**
     * End time of day in local time. Same syntax as _startTimeOfDay_. +
     *     If end time &lt; start time then the period wraps around to the next day. +
     *     To stop at end of the day use: 00:00.
     */
    @Optional
    private String endTimeOfDay;
    /**
     * Day(s) of the week this is tariff applies.
     */
    @Optional
    private List<DayOfWeekEnum> dayOfWeek;
    /**
     * Start date in local time, for example: 2015-12-24.
     * Valid from this day (inclusive). +
     * Format as per RFC 3339: full-date  + 
     * 
     * Regex: ([12][0-9]{3})-(0[1-9]\|1[0-2])-(0[1-9]\|[12][0-9]\|3[01])
     */
    @Optional
    private String validFromDate;
    /**
     * End date in local time, for example: 2015-12-27.
     *     Valid until this day (exclusive). Same syntax as _validFromDate_.
     */
    @Optional
    private String validToDate;
    /**
     * Type of EVSE (AC, DC) this tariff applies to.
     */
    @Optional
    private EvseKindEnum evseKind;
    /**
     * Minimum consumed energy in Wh, for example 20000 Wh.
     *     Valid from this amount of energy (inclusive) being used.
     */
    @Optional
    private Float minEnergy;
    /**
     * Maximum consumed energy in Wh, for example 50000 Wh.
     *     Valid until this amount of energy (exclusive) being used.
     */
    @Optional
    private Float maxEnergy;
    /**
     * Sum of the minimum current (in Amperes) over all phases, for example 5 A.
     *     When the EV is charging with more than, or equal to, the defined amount of current, this price is/becomes active. If the charging current is or becomes lower, this price is not or no longer valid and becomes inactive. +
     *     This is NOT about the minimum current over the entire transaction.
     */
    @Optional
    private Float minCurrent;
    /**
     * Sum of the maximum current (in Amperes) over all phases, for example 20 A.
     *       When the EV is charging with less than the defined amount of current, this price becomes/is active. If the charging current is or becomes higher, this price is not or no longer valid and becomes inactive.
     *       This is NOT about the maximum current over the entire transaction.
     */
    @Optional
    private Float maxCurrent;
    /**
     * Minimum power in W, for example 5000 W.
     *       When the EV is charging with more than, or equal to, the defined amount of power, this price is/becomes active.
     *       If the charging power is or becomes lower, this price is not or no longer valid and becomes inactive.
     *       This is NOT about the minimum power over the entire transaction.
     */
    @Optional
    private Float minPower;
    /**
     * Maximum power in W, for example 20000 W.
     *       When the EV is charging with less than the defined amount of power, this price becomes/is active.
     *       If the charging power is or becomes higher, this price is not or no longer valid and becomes inactive.
     *       This is NOT about the maximum power over the entire transaction.
     */
    @Optional
    private Float maxPower;
    /**
     * Minimum duration in seconds the transaction (charging &amp; idle) MUST last (inclusive).
     *       When the duration of a transaction is longer than the defined value, this price is or becomes active.
     *       Before that moment, this price is not yet active.
     */
    @Optional
    private Integer minTime;
    /**
     * Maximum duration in seconds the transaction (charging &amp; idle) MUST last (exclusive).
     *       When the duration of a transaction is shorter than the defined value, this price is or becomes active.
     *       After that moment, this price is no longer active.
     */
    @Optional
    private Integer maxTime;
    /**
     * Minimum duration in seconds the charging MUST last (inclusive).
     *       When the duration of a charging is longer than the defined value, this price is or becomes active.
     *       Before that moment, this price is not yet active.
     */
    @Optional
    private Integer minChargingTime;
    /**
     * Maximum duration in seconds the charging MUST last (exclusive).
     *       When the duration of a charging is shorter than the defined value, this price is or becomes active.
     *       After that moment, this price is no longer active.
     */
    @Optional
    private Integer maxChargingTime;
    /**
     * Minimum duration in seconds the idle period (i.e. not charging) MUST last (inclusive).
     *       When the duration of the idle time is longer than the defined value, this price is or becomes active.
     *       Before that moment, this price is not yet active.
     */
    @Optional
    private Integer minIdleTime;
    /**
     * Maximum duration in seconds the idle period (i.e. not charging) MUST last (exclusive).
     *       When the duration of idle time is shorter than the defined value, this price is or becomes active.
     *       After that moment, this price is no longer active.
     */
    @Optional
    private Integer maxIdleTime;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public TariffConditions() {
    }

    /**
     * 
     * @param maxTime
     *     Maximum duration in seconds the transaction (charging &amp; idle) MUST last (exclusive).
     *           When the duration of a transaction is shorter than the defined value, this price is or becomes active.
     *           After that moment, this price is no longer active.
     *     .
     * @param minChargingTime
     *     Minimum duration in seconds the charging MUST last (inclusive).
     *           When the duration of a charging is longer than the defined value, this price is or becomes active.
     *           Before that moment, this price is not yet active.
     *     .
     * @param maxChargingTime
     *     Maximum duration in seconds the charging MUST last (exclusive).
     *           When the duration of a charging is shorter than the defined value, this price is or becomes active.
     *           After that moment, this price is no longer active.
     *     .
     * @param maxIdleTime
     *     Maximum duration in seconds the idle period (i.e. not charging) MUST last (exclusive).
     *           When the duration of idle time is shorter than the defined value, this price is or becomes active.
     *           After that moment, this price is no longer active.
     *     .
     * @param minPower
     *     Minimum power in W, for example 5000 W.
     *           When the EV is charging with more than, or equal to, the defined amount of power, this price is/becomes active.
     *           If the charging power is or becomes lower, this price is not or no longer valid and becomes inactive.
     *           This is NOT about the minimum power over the entire transaction.
     *     .
     * @param maxEnergy
     *     Maximum consumed energy in Wh, for example 50000 Wh.
     *         Valid until this amount of energy (exclusive) being used.
     *     .
     * @param maxCurrent
     *     Sum of the maximum current (in Amperes) over all phases, for example 20 A.
     *           When the EV is charging with less than the defined amount of current, this price becomes/is active. If the charging current is or becomes higher, this price is not or no longer valid and becomes inactive.
     *           This is NOT about the maximum current over the entire transaction.
     *     .
     * @param minEnergy
     *     Minimum consumed energy in Wh, for example 20000 Wh.
     *         Valid from this amount of energy (inclusive) being used.
     *     .
     * @param dayOfWeek
     *     Day(s) of the week this is tariff applies.
     *     .
     * @param minTime
     *     Minimum duration in seconds the transaction (charging &amp; idle) MUST last (inclusive).
     *           When the duration of a transaction is longer than the defined value, this price is or becomes active.
     *           Before that moment, this price is not yet active.
     *     .
     * @param endTimeOfDay
     *     End time of day in local time. Same syntax as _startTimeOfDay_. +
     *         If end time &lt; start time then the period wraps around to the next day. +
     *         To stop at end of the day use: 00:00.
     *     .
     * @param validFromDate
     *     Start date in local time, for example: 2015-12-24.
     *     Valid from this day (inclusive). +
     *     Format as per RFC 3339: full-date  + 
     *     
     *     Regex: ([12][0-9]{3})-(0[1-9]\|1[0-2])-(0[1-9]\|[12][0-9]\|3[01])
     *     .
     * @param minCurrent
     *     Sum of the minimum current (in Amperes) over all phases, for example 5 A.
     *         When the EV is charging with more than, or equal to, the defined amount of current, this price is/becomes active. If the charging current is or becomes lower, this price is not or no longer valid and becomes inactive. +
     *         This is NOT about the minimum current over the entire transaction.
     *     .
     * @param maxPower
     *     Maximum power in W, for example 20000 W.
     *           When the EV is charging with less than the defined amount of power, this price becomes/is active.
     *           If the charging power is or becomes higher, this price is not or no longer valid and becomes inactive.
     *           This is NOT about the maximum power over the entire transaction.
     *     .
     * @param minIdleTime
     *     Minimum duration in seconds the idle period (i.e. not charging) MUST last (inclusive).
     *           When the duration of the idle time is longer than the defined value, this price is or becomes active.
     *           Before that moment, this price is not yet active.
     *     .
     * @param startTimeOfDay
     *     Start time of day in local time. +
     *     Format as per RFC 3339: time-hour ":" time-minute  +
     *     Must be in 24h format with leading zeros. Hour/Minute separator: ":"
     *     Regex: ([0-1][0-9]\|2[0-3]):[0-5][0-9]
     *     .
     * @param validToDate
     *     End date in local time, for example: 2015-12-27.
     *         Valid until this day (exclusive). Same syntax as _validFromDate_.
     *     .
     */
    public TariffConditions(String startTimeOfDay, String endTimeOfDay, List<DayOfWeekEnum> dayOfWeek, String validFromDate, String validToDate, EvseKindEnum evseKind, Float minEnergy, Float maxEnergy, Float minCurrent, Float maxCurrent, Float minPower, Float maxPower, Integer minTime, Integer maxTime, Integer minChargingTime, Integer maxChargingTime, Integer minIdleTime, Integer maxIdleTime, CustomData customData) {
        super();
        this.startTimeOfDay = startTimeOfDay;
        this.endTimeOfDay = endTimeOfDay;
        this.dayOfWeek = dayOfWeek;
        this.validFromDate = validFromDate;
        this.validToDate = validToDate;
        this.evseKind = evseKind;
        this.minEnergy = minEnergy;
        this.maxEnergy = maxEnergy;
        this.minCurrent = minCurrent;
        this.maxCurrent = maxCurrent;
        this.minPower = minPower;
        this.maxPower = maxPower;
        this.minTime = minTime;
        this.maxTime = maxTime;
        this.minChargingTime = minChargingTime;
        this.maxChargingTime = maxChargingTime;
        this.minIdleTime = minIdleTime;
        this.maxIdleTime = maxIdleTime;
        this.customData = customData;
    }

    /**
     * Start time of day in local time. +
     * Format as per RFC 3339: time-hour ":" time-minute  +
     * Must be in 24h format with leading zeros. Hour/Minute separator: ":"
     * Regex: ([0-1][0-9]\|2[0-3]):[0-5][0-9]
     */
    public String getStartTimeOfDay() {
        return startTimeOfDay;
    }

    /**
     * Start time of day in local time. +
     * Format as per RFC 3339: time-hour ":" time-minute  +
     * Must be in 24h format with leading zeros. Hour/Minute separator: ":"
     * Regex: ([0-1][0-9]\|2[0-3]):[0-5][0-9]
     */
    public void setStartTimeOfDay(String startTimeOfDay) {
        this.startTimeOfDay = startTimeOfDay;
    }

    /**
     * End time of day in local time. Same syntax as _startTimeOfDay_. +
     *     If end time &lt; start time then the period wraps around to the next day. +
     *     To stop at end of the day use: 00:00.
     */
    public String getEndTimeOfDay() {
        return endTimeOfDay;
    }

    /**
     * End time of day in local time. Same syntax as _startTimeOfDay_. +
     *     If end time &lt; start time then the period wraps around to the next day. +
     *     To stop at end of the day use: 00:00.
     */
    public void setEndTimeOfDay(String endTimeOfDay) {
        this.endTimeOfDay = endTimeOfDay;
    }

    /**
     * Day(s) of the week this is tariff applies.
     */
    public List<DayOfWeekEnum> getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * Day(s) of the week this is tariff applies.
     */
    public void setDayOfWeek(List<DayOfWeekEnum> dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    /**
     * Start date in local time, for example: 2015-12-24.
     * Valid from this day (inclusive). +
     * Format as per RFC 3339: full-date  + 
     * 
     * Regex: ([12][0-9]{3})-(0[1-9]\|1[0-2])-(0[1-9]\|[12][0-9]\|3[01])
     */
    public String getValidFromDate() {
        return validFromDate;
    }

    /**
     * Start date in local time, for example: 2015-12-24.
     * Valid from this day (inclusive). +
     * Format as per RFC 3339: full-date  + 
     * 
     * Regex: ([12][0-9]{3})-(0[1-9]\|1[0-2])-(0[1-9]\|[12][0-9]\|3[01])
     */
    public void setValidFromDate(String validFromDate) {
        this.validFromDate = validFromDate;
    }

    /**
     * End date in local time, for example: 2015-12-27.
     *     Valid until this day (exclusive). Same syntax as _validFromDate_.
     */
    public String getValidToDate() {
        return validToDate;
    }

    /**
     * End date in local time, for example: 2015-12-27.
     *     Valid until this day (exclusive). Same syntax as _validFromDate_.
     */
    public void setValidToDate(String validToDate) {
        this.validToDate = validToDate;
    }

    /**
     * Type of EVSE (AC, DC) this tariff applies to.
     */
    public EvseKindEnum getEvseKind() {
        return evseKind;
    }

    /**
     * Type of EVSE (AC, DC) this tariff applies to.
     */
    public void setEvseKind(EvseKindEnum evseKind) {
        this.evseKind = evseKind;
    }

    /**
     * Minimum consumed energy in Wh, for example 20000 Wh.
     *     Valid from this amount of energy (inclusive) being used.
     */
    public Float getMinEnergy() {
        return minEnergy;
    }

    /**
     * Minimum consumed energy in Wh, for example 20000 Wh.
     *     Valid from this amount of energy (inclusive) being used.
     */
    public void setMinEnergy(Float minEnergy) {
        this.minEnergy = minEnergy;
    }

    /**
     * Maximum consumed energy in Wh, for example 50000 Wh.
     *     Valid until this amount of energy (exclusive) being used.
     */
    public Float getMaxEnergy() {
        return maxEnergy;
    }

    /**
     * Maximum consumed energy in Wh, for example 50000 Wh.
     *     Valid until this amount of energy (exclusive) being used.
     */
    public void setMaxEnergy(Float maxEnergy) {
        this.maxEnergy = maxEnergy;
    }

    /**
     * Sum of the minimum current (in Amperes) over all phases, for example 5 A.
     *     When the EV is charging with more than, or equal to, the defined amount of current, this price is/becomes active. If the charging current is or becomes lower, this price is not or no longer valid and becomes inactive. +
     *     This is NOT about the minimum current over the entire transaction.
     */
    public Float getMinCurrent() {
        return minCurrent;
    }

    /**
     * Sum of the minimum current (in Amperes) over all phases, for example 5 A.
     *     When the EV is charging with more than, or equal to, the defined amount of current, this price is/becomes active. If the charging current is or becomes lower, this price is not or no longer valid and becomes inactive. +
     *     This is NOT about the minimum current over the entire transaction.
     */
    public void setMinCurrent(Float minCurrent) {
        this.minCurrent = minCurrent;
    }

    /**
     * Sum of the maximum current (in Amperes) over all phases, for example 20 A.
     *       When the EV is charging with less than the defined amount of current, this price becomes/is active. If the charging current is or becomes higher, this price is not or no longer valid and becomes inactive.
     *       This is NOT about the maximum current over the entire transaction.
     */
    public Float getMaxCurrent() {
        return maxCurrent;
    }

    /**
     * Sum of the maximum current (in Amperes) over all phases, for example 20 A.
     *       When the EV is charging with less than the defined amount of current, this price becomes/is active. If the charging current is or becomes higher, this price is not or no longer valid and becomes inactive.
     *       This is NOT about the maximum current over the entire transaction.
     */
    public void setMaxCurrent(Float maxCurrent) {
        this.maxCurrent = maxCurrent;
    }

    /**
     * Minimum power in W, for example 5000 W.
     *       When the EV is charging with more than, or equal to, the defined amount of power, this price is/becomes active.
     *       If the charging power is or becomes lower, this price is not or no longer valid and becomes inactive.
     *       This is NOT about the minimum power over the entire transaction.
     */
    public Float getMinPower() {
        return minPower;
    }

    /**
     * Minimum power in W, for example 5000 W.
     *       When the EV is charging with more than, or equal to, the defined amount of power, this price is/becomes active.
     *       If the charging power is or becomes lower, this price is not or no longer valid and becomes inactive.
     *       This is NOT about the minimum power over the entire transaction.
     */
    public void setMinPower(Float minPower) {
        this.minPower = minPower;
    }

    /**
     * Maximum power in W, for example 20000 W.
     *       When the EV is charging with less than the defined amount of power, this price becomes/is active.
     *       If the charging power is or becomes higher, this price is not or no longer valid and becomes inactive.
     *       This is NOT about the maximum power over the entire transaction.
     */
    public Float getMaxPower() {
        return maxPower;
    }

    /**
     * Maximum power in W, for example 20000 W.
     *       When the EV is charging with less than the defined amount of power, this price becomes/is active.
     *       If the charging power is or becomes higher, this price is not or no longer valid and becomes inactive.
     *       This is NOT about the maximum power over the entire transaction.
     */
    public void setMaxPower(Float maxPower) {
        this.maxPower = maxPower;
    }

    /**
     * Minimum duration in seconds the transaction (charging &amp; idle) MUST last (inclusive).
     *       When the duration of a transaction is longer than the defined value, this price is or becomes active.
     *       Before that moment, this price is not yet active.
     */
    public Integer getMinTime() {
        return minTime;
    }

    /**
     * Minimum duration in seconds the transaction (charging &amp; idle) MUST last (inclusive).
     *       When the duration of a transaction is longer than the defined value, this price is or becomes active.
     *       Before that moment, this price is not yet active.
     */
    public void setMinTime(Integer minTime) {
        this.minTime = minTime;
    }

    /**
     * Maximum duration in seconds the transaction (charging &amp; idle) MUST last (exclusive).
     *       When the duration of a transaction is shorter than the defined value, this price is or becomes active.
     *       After that moment, this price is no longer active.
     */
    public Integer getMaxTime() {
        return maxTime;
    }

    /**
     * Maximum duration in seconds the transaction (charging &amp; idle) MUST last (exclusive).
     *       When the duration of a transaction is shorter than the defined value, this price is or becomes active.
     *       After that moment, this price is no longer active.
     */
    public void setMaxTime(Integer maxTime) {
        this.maxTime = maxTime;
    }

    /**
     * Minimum duration in seconds the charging MUST last (inclusive).
     *       When the duration of a charging is longer than the defined value, this price is or becomes active.
     *       Before that moment, this price is not yet active.
     */
    public Integer getMinChargingTime() {
        return minChargingTime;
    }

    /**
     * Minimum duration in seconds the charging MUST last (inclusive).
     *       When the duration of a charging is longer than the defined value, this price is or becomes active.
     *       Before that moment, this price is not yet active.
     */
    public void setMinChargingTime(Integer minChargingTime) {
        this.minChargingTime = minChargingTime;
    }

    /**
     * Maximum duration in seconds the charging MUST last (exclusive).
     *       When the duration of a charging is shorter than the defined value, this price is or becomes active.
     *       After that moment, this price is no longer active.
     */
    public Integer getMaxChargingTime() {
        return maxChargingTime;
    }

    /**
     * Maximum duration in seconds the charging MUST last (exclusive).
     *       When the duration of a charging is shorter than the defined value, this price is or becomes active.
     *       After that moment, this price is no longer active.
     */
    public void setMaxChargingTime(Integer maxChargingTime) {
        this.maxChargingTime = maxChargingTime;
    }

    /**
     * Minimum duration in seconds the idle period (i.e. not charging) MUST last (inclusive).
     *       When the duration of the idle time is longer than the defined value, this price is or becomes active.
     *       Before that moment, this price is not yet active.
     */
    public Integer getMinIdleTime() {
        return minIdleTime;
    }

    /**
     * Minimum duration in seconds the idle period (i.e. not charging) MUST last (inclusive).
     *       When the duration of the idle time is longer than the defined value, this price is or becomes active.
     *       Before that moment, this price is not yet active.
     */
    public void setMinIdleTime(Integer minIdleTime) {
        this.minIdleTime = minIdleTime;
    }

    /**
     * Maximum duration in seconds the idle period (i.e. not charging) MUST last (exclusive).
     *       When the duration of idle time is shorter than the defined value, this price is or becomes active.
     *       After that moment, this price is no longer active.
     */
    public Integer getMaxIdleTime() {
        return maxIdleTime;
    }

    /**
     * Maximum duration in seconds the idle period (i.e. not charging) MUST last (exclusive).
     *       When the duration of idle time is shorter than the defined value, this price is or becomes active.
     *       After that moment, this price is no longer active.
     */
    public void setMaxIdleTime(Integer maxIdleTime) {
        this.maxIdleTime = maxIdleTime;
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
        if (!(obj instanceof TariffConditions))
            return false;
        TariffConditions that = (TariffConditions) obj;
        return Objects.equals(this.maxTime, that.maxTime)
                && Objects.equals(this.minChargingTime, that.minChargingTime) 
                && Objects.equals(this.maxChargingTime, that.maxChargingTime) 
                && Objects.equals(this.maxIdleTime, that.maxIdleTime) 
                && Objects.equals(this.customData, that.customData) 
                && Objects.equals(this.minPower, that.minPower) 
                && Objects.equals(this.evseKind, that.evseKind) 
                && Objects.equals(this.maxEnergy, that.maxEnergy) 
                && Objects.equals(this.maxCurrent, that.maxCurrent) 
                && Objects.equals(this.minEnergy, that.minEnergy) 
                && Objects.equals(this.dayOfWeek, that.dayOfWeek) 
                && Objects.equals(this.minTime, that.minTime) 
                && Objects.equals(this.endTimeOfDay, that.endTimeOfDay) 
                && Objects.equals(this.validFromDate, that.validFromDate) 
                && Objects.equals(this.minCurrent, that.minCurrent) 
                && Objects.equals(this.maxPower, that.maxPower) 
                && Objects.equals(this.minIdleTime, that.minIdleTime) 
                && Objects.equals(this.startTimeOfDay, that.startTimeOfDay) 
                && Objects.equals(this.validToDate, that.validToDate);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.maxTime != null ? this.maxTime.hashCode() : 0);
        result = 31 * result + (this.minChargingTime != null ? this.minChargingTime.hashCode() : 0);
        result = 31 * result + (this.maxChargingTime != null ? this.maxChargingTime.hashCode() : 0);
        result = 31 * result + (this.maxIdleTime != null ? this.maxIdleTime.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.minPower != null ? this.minPower.hashCode() : 0);
        result = 31 * result + (this.evseKind != null ? this.evseKind.hashCode() : 0);
        result = 31 * result + (this.maxEnergy != null ? this.maxEnergy.hashCode() : 0);
        result = 31 * result + (this.maxCurrent != null ? this.maxCurrent.hashCode() : 0);
        result = 31 * result + (this.minEnergy != null ? this.minEnergy.hashCode() : 0);
        result = 31 * result + (this.dayOfWeek != null ? this.dayOfWeek.hashCode() : 0);
        result = 31 * result + (this.minTime != null ? this.minTime.hashCode() : 0);
        result = 31 * result + (this.endTimeOfDay != null ? this.endTimeOfDay.hashCode() : 0);
        result = 31 * result + (this.validFromDate != null ? this.validFromDate.hashCode() : 0);
        result = 31 * result + (this.minCurrent != null ? this.minCurrent.hashCode() : 0);
        result = 31 * result + (this.maxPower != null ? this.maxPower.hashCode() : 0);
        result = 31 * result + (this.minIdleTime != null ? this.minIdleTime.hashCode() : 0);
        result = 31 * result + (this.startTimeOfDay != null ? this.startTimeOfDay.hashCode() : 0);
        result = 31 * result + (this.validToDate != null ? this.validToDate.hashCode() : 0);
        return result;
    }
}
