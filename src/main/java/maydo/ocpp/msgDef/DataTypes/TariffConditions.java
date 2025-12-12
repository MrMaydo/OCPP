package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.Enumerations.DayOfWeekEnum;
import maydo.ocpp.msgDef.Enumerations.EvseKindEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;

import java.util.List;
import java.util.Objects;

/**
 * These conditions describe if and when a TariffEnergyType or TariffTimeType applies during a transaction.
 * When more than one restriction is set, they are to be treated as a logical AND.
 * All need to be valid before this price is active.
 * For reverse energy flow (discharging) negative values of energy, power and current are used.
 */
public class TariffConditions implements JsonInterface {

    /**
     * Start time of day in local time.
     * Format as per RFC 3339: time-hour ":" time-minute Must be in 24h format with leading zeros.
     * Hour/Minute separator: ":" Regex: ([0-1][0-9]|2[0-3]):[0-5][0-9]
     */
    @Optional
    private String startTimeOfDay;

    /**
     * End time of day in local time.
     * If end time < start time then the period wraps around to the next day.
     * To stop at end of the day use: 00:00.
     * <p> Format as per RFC 3339: time-hour ":" time-minute Must be in 24h format with leading zeros. </p>
     * <p> Hour/Minute separator: ":"  </p>
     * <p> Regex: ([0-1][0-9]|2[0-3]):[0-5][0-9] </p>
     */
    @Optional
    private String endTimeOfDay;

    /**
     * Day(s) of the week this is tariff applies.
     */
    @Optional
    private List<DayOfWeekEnum> dayOfWeek;

    /**
     * Start date in local time, for example: 2015-12- 24. Valid from this day (inclusive).
     * <p> Format as per RFC 3339: full-date </p>
     * <p> Regex: ([12][0-9]{3})-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01]) </p>
     */
    @Optional
    private String validFromDate;

    /**
     * End date in local time, for example: 2015-12-27. Valid until this day (exclusive).
     * <p> Format as per RFC 3339: full-date </p>
     * <p> Regex: ([12][0-9]{3})-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01]) </p>
     */
    @Optional
    private String validToDate;

    /**
     * Type of EVSE (AC, DC) this tariff applies to.
     */
    @Optional
    private EvseKindEnum evseKind;

    /**
     * Minimum consumed energy in Wh, for example 20000 Wh. Valid from this amount of energy (inclusive) being used.
     */
    @Optional
    private Float minEnergy;

    /**
     * Maximum consumed energy in Wh, for example 50000 Wh. Valid until this amount of energy (exclusive) being used.
     */
    @Optional
    private Float maxEnergy;

    /**
     * Sum of the minimum current (in Amperes) over all phases, for example 5 A.
     * When the EV is charging with more than, or equal to, the defined amount of current, this price is/becomes active.
     * If the charging current is or becomes lower, this price is not or no longer valid and becomes inactive.
     * This is NOT about the minimum current over the entire transaction.
     */
    @Optional
    private Float minCurrent;

    /**
     * Sum of the maximum current (in Amperes) over all phases, for example 20 A.
     * When the EV is charging with less than the defined amount of current, this price becomes/is active.
     * If the charging current is or becomes higher, this price is not or no longer valid and becomes inactive.
     * This is NOT about the maximum current over the entire transaction.
     */
    @Optional
    private Float maxCurrent;

    /**
     * Minimum power in W, for example 5000 W. When the EV is charging with more than,
     * or equal to, the defined amount of power, this price is/becomes active.
     * If the charging power is or becomes lower, this price is not or no longer valid and becomes inactive.
     * This is NOT about the minimum power over the entire transaction.
     */
    @Optional
    private Float minPower;

    /**
     * Maximum power in W, for example 20000 W. When the EV is charging with less than the defined amount of power,
     * this price becomes/is active. If the charging power is or becomes higher,
     * this price is not or no longer valid and becomes inactive.
     * This is NOT about the maximum power over the entire transaction.
     */
    @Optional
    private Float maxPower;

    /**
     * Minimum duration in seconds the transaction (charging & idle) MUST last (inclusive).
     * When the duration of a transaction is longer than the defined value, this price is or becomes active.
     * Before that moment, this price is not yet active
     */
    @Optional
    private Integer minTime;

    /**
     * Maximum duration in seconds the transaction (charging & idle) MUST last (exclusive).
     * When the duration of a transaction is shorter than the defined value, this price is or becomes active.
     * After that moment, this price is no longer active.
     */
    @Optional
    private Integer maxTime;

    /**
     * Minimum duration in seconds the charging MUST last (inclusive).
     * When the duration of a charging is longer than the defined value, this price is or becomes active.
     * Before that moment, this price is not yet active.
     */
    @Optional
    private Integer minChargingTime;

    /**
     * Maximum duration in seconds the charging MUST last (exclusive).
     * When the duration of a charging is shorter than the defined value, this price is or becomes active.
     * After that moment, this price is no longer active.
     */
    @Optional
    private Integer maxChargingTime;

    /**
     * Minimum duration in seconds the idle period (i.e. not charging) MUST last (inclusive).
     * When the duration of the idle time is longer than the defined value, this price is or becomes active.
     * Before that moment, this price is not yet active.
     */
    @Optional
    private Integer minIdleTime;

    /**
     * Maximum duration in seconds the idle period (i.e. not charging) MUST last (exclusive).
     * When the duration of idle time is shorter than the defined value, this price is or becomes active.
     * After that moment, this price is no longer active.
     */
    @Optional
    private Integer maxIdleTime;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public TariffConditions() {
    }


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


    public String getStartTimeOfDay() {
        return startTimeOfDay;
    }


    public void setStartTimeOfDay(String startTimeOfDay) {
        this.startTimeOfDay = startTimeOfDay;
    }


    public String getEndTimeOfDay() {
        return endTimeOfDay;
    }


    public void setEndTimeOfDay(String endTimeOfDay) {
        this.endTimeOfDay = endTimeOfDay;
    }


    public List<DayOfWeekEnum> getDayOfWeek() {
        return dayOfWeek;
    }


    public void setDayOfWeek(List<DayOfWeekEnum> dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }


    public String getValidFromDate() {
        return validFromDate;
    }


    public void setValidFromDate(String validFromDate) {
        this.validFromDate = validFromDate;
    }


    public String getValidToDate() {
        return validToDate;
    }


    public void setValidToDate(String validToDate) {
        this.validToDate = validToDate;
    }


    public EvseKindEnum getEvseKind() {
        return evseKind;
    }


    public void setEvseKind(EvseKindEnum evseKind) {
        this.evseKind = evseKind;
    }


    public Float getMinEnergy() {
        return minEnergy;
    }


    public void setMinEnergy(Float minEnergy) {
        this.minEnergy = minEnergy;
    }


    public Float getMaxEnergy() {
        return maxEnergy;
    }


    public void setMaxEnergy(Float maxEnergy) {
        this.maxEnergy = maxEnergy;
    }


    public Float getMinCurrent() {
        return minCurrent;
    }


    public void setMinCurrent(Float minCurrent) {
        this.minCurrent = minCurrent;
    }


    public Float getMaxCurrent() {
        return maxCurrent;
    }


    public void setMaxCurrent(Float maxCurrent) {
        this.maxCurrent = maxCurrent;
    }


    public Float getMinPower() {
        return minPower;
    }


    public void setMinPower(Float minPower) {
        this.minPower = minPower;
    }


    public Float getMaxPower() {
        return maxPower;
    }


    public void setMaxPower(Float maxPower) {
        this.maxPower = maxPower;
    }


    public Integer getMinTime() {
        return minTime;
    }


    public void setMinTime(Integer minTime) {
        this.minTime = minTime;
    }


    public Integer getMaxTime() {
        return maxTime;
    }


    public void setMaxTime(Integer maxTime) {
        this.maxTime = maxTime;
    }


    public Integer getMinChargingTime() {
        return minChargingTime;
    }


    public void setMinChargingTime(Integer minChargingTime) {
        this.minChargingTime = minChargingTime;
    }


    public Integer getMaxChargingTime() {
        return maxChargingTime;
    }


    public void setMaxChargingTime(Integer maxChargingTime) {
        this.maxChargingTime = maxChargingTime;
    }


    public Integer getMinIdleTime() {
        return minIdleTime;
    }


    public void setMinIdleTime(Integer minIdleTime) {
        this.minIdleTime = minIdleTime;
    }


    public Integer getMaxIdleTime() {
        return maxIdleTime;
    }


    public void setMaxIdleTime(Integer maxIdleTime) {
        this.maxIdleTime = maxIdleTime;
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
        json.addProperty("startTimeOfDay", startTimeOfDay);
        json.addProperty("endTimeOfDay", endTimeOfDay);
        json.addProperty("validFromDate", validFromDate);
        json.addProperty("validToDate", validToDate);
        json.addProperty("evseKind", evseKind.toString());
        json.addProperty("minEnergy", minEnergy);
        json.addProperty("maxEnergy", maxEnergy);
        json.addProperty("minCurrent", minCurrent);
        json.addProperty("maxCurrent", maxCurrent);
        json.addProperty("minPower", minPower);
        json.addProperty("maxPower", maxPower);
        json.addProperty("minTime", minTime);
        json.addProperty("maxTime", maxTime);
        json.addProperty("minChargingTime", minChargingTime);
        json.addProperty("maxChargingTime", maxChargingTime);
        json.addProperty("minIdleTime", minIdleTime);
        json.addProperty("maxIdleTime", maxIdleTime);
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
        if (jsonObject.has("startTimeOfDay")) {
            this.startTimeOfDay = jsonObject.get("startTimeOfDay").getAsString();
        }

        if (jsonObject.has("endTimeOfDay")) {
            this.endTimeOfDay = jsonObject.get("endTimeOfDay").getAsString();
        }

        if (jsonObject.has("validFromDate")) {
            this.validFromDate = jsonObject.get("validFromDate").getAsString();
        }

        if (jsonObject.has("validToDate")) {
            this.validToDate = jsonObject.get("validToDate").getAsString();
        }

        if (jsonObject.has("evseKind")) {
            this.evseKind = EvseKindEnum.valueOf(jsonObject.get("evseKind").getAsString());
        }

        if (jsonObject.has("minEnergy")) {
            this.minEnergy = jsonObject.get("minEnergy").getAsFloat();
        }

        if (jsonObject.has("maxEnergy")) {
            this.maxEnergy = jsonObject.get("maxEnergy").getAsFloat();
        }

        if (jsonObject.has("minCurrent")) {
            this.minCurrent = jsonObject.get("minCurrent").getAsFloat();
        }

        if (jsonObject.has("maxCurrent")) {
            this.maxCurrent = jsonObject.get("maxCurrent").getAsFloat();
        }

        if (jsonObject.has("minPower")) {
            this.minPower = jsonObject.get("minPower").getAsFloat();
        }

        if (jsonObject.has("maxPower")) {
            this.maxPower = jsonObject.get("maxPower").getAsFloat();
        }

        if (jsonObject.has("minTime")) {
            this.minTime = jsonObject.get("minTime").getAsInt();
        }

        if (jsonObject.has("maxTime")) {
            this.maxTime = jsonObject.get("maxTime").getAsInt();
        }

        if (jsonObject.has("minChargingTime")) {
            this.minChargingTime = jsonObject.get("minChargingTime").getAsInt();
        }

        if (jsonObject.has("maxChargingTime")) {
            this.maxChargingTime = jsonObject.get("maxChargingTime").getAsInt();
        }

        if (jsonObject.has("minIdleTime")) {
            this.minIdleTime = jsonObject.get("minIdleTime").getAsInt();
        }

        if (jsonObject.has("maxIdleTime")) {
            this.maxIdleTime = jsonObject.get("maxIdleTime").getAsInt();
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
