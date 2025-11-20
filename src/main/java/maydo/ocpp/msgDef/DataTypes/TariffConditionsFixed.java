package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.Enumerations.DayOfWeekEnum;
import maydo.ocpp.msgDef.Enumerations.EvseKindEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;

import java.util.List;
import java.util.Objects;

public class TariffConditionsFixed implements JsonInterface {

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
     * If end time &lt; start time then the period wraps around to the next day. +
     * To stop at end of the day use: 00:00.
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
     * <p>
     * Regex: ([12][0-9]{3})-(0[1-9]\|1[0-2])-(0[1-9]\|[12][0-9]\|3[01])
     */
    @Optional
    private String validFromDate;
    /**
     * End date in local time, for example: 2015-12-27.
     * Valid until this day (exclusive). Same syntax as _validFromDate_.
     */
    @Optional
    private String validToDate;
    /**
     * Type of EVSE (AC, DC) this tariff applies to.
     */
    @Optional
    private EvseKindEnum evseKind;
    /**
     * For which payment brand this (adhoc) tariff applies. Can be used to add a surcharge for certain payment brands.
     * Based on value of _additionalIdToken_ from _idToken.additionalInfo.type_ = "PaymentBrand".
     */
    @Optional
    private String paymentBrand;
    /**
     * Type of adhoc payment, e.g. CC, Debit.
     * Based on value of _additionalIdToken_ from _idToken.additionalInfo.type_ = "PaymentRecognition".
     */
    @Optional
    private String paymentRecognition;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public TariffConditionsFixed() {
    }

    /**
     * @param paymentRecognition Type of adhoc payment, e.g. CC, Debit.
     *                           Based on value of _additionalIdToken_ from _idToken.additionalInfo.type_ = "PaymentRecognition".
     *                           .
     * @param dayOfWeek          Day(s) of the week this is tariff applies.
     *                           .
     * @param paymentBrand       For which payment brand this (adhoc) tariff applies. Can be used to add a surcharge for certain payment brands.
     *                           Based on value of _additionalIdToken_ from _idToken.additionalInfo.type_ = "PaymentBrand".
     *                           .
     * @param endTimeOfDay       End time of day in local time. Same syntax as _startTimeOfDay_. +
     *                           If end time &lt; start time then the period wraps around to the next day. +
     *                           To stop at end of the day use: 00:00.
     *                           .
     * @param validFromDate      Start date in local time, for example: 2015-12-24.
     *                           Valid from this day (inclusive). +
     *                           Format as per RFC 3339: full-date  +
     *                           <p>
     *                           Regex: ([12][0-9]{3})-(0[1-9]\|1[0-2])-(0[1-9]\|[12][0-9]\|3[01])
     *                           .
     * @param startTimeOfDay     Start time of day in local time. +
     *                           Format as per RFC 3339: time-hour ":" time-minute  +
     *                           Must be in 24h format with leading zeros. Hour/Minute separator: ":"
     *                           Regex: ([0-1][0-9]\|2[0-3]):[0-5][0-9]
     *                           .
     * @param validToDate        End date in local time, for example: 2015-12-27.
     *                           Valid until this day (exclusive). Same syntax as _validFromDate_.
     *                           .
     */
    public TariffConditionsFixed(String startTimeOfDay, String endTimeOfDay, List<DayOfWeekEnum> dayOfWeek, String validFromDate, String validToDate, EvseKindEnum evseKind, String paymentBrand, String paymentRecognition, CustomData customData) {
        super();
        this.startTimeOfDay = startTimeOfDay;
        this.endTimeOfDay = endTimeOfDay;
        this.dayOfWeek = dayOfWeek;
        this.validFromDate = validFromDate;
        this.validToDate = validToDate;
        this.evseKind = evseKind;
        this.paymentBrand = paymentBrand;
        this.paymentRecognition = paymentRecognition;
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
     * If end time &lt; start time then the period wraps around to the next day. +
     * To stop at end of the day use: 00:00.
     */
    public String getEndTimeOfDay() {
        return endTimeOfDay;
    }

    /**
     * End time of day in local time. Same syntax as _startTimeOfDay_. +
     * If end time &lt; start time then the period wraps around to the next day. +
     * To stop at end of the day use: 00:00.
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
     * <p>
     * Regex: ([12][0-9]{3})-(0[1-9]\|1[0-2])-(0[1-9]\|[12][0-9]\|3[01])
     */
    public String getValidFromDate() {
        return validFromDate;
    }

    /**
     * Start date in local time, for example: 2015-12-24.
     * Valid from this day (inclusive). +
     * Format as per RFC 3339: full-date  +
     * <p>
     * Regex: ([12][0-9]{3})-(0[1-9]\|1[0-2])-(0[1-9]\|[12][0-9]\|3[01])
     */
    public void setValidFromDate(String validFromDate) {
        this.validFromDate = validFromDate;
    }

    /**
     * End date in local time, for example: 2015-12-27.
     * Valid until this day (exclusive). Same syntax as _validFromDate_.
     */
    public String getValidToDate() {
        return validToDate;
    }

    /**
     * End date in local time, for example: 2015-12-27.
     * Valid until this day (exclusive). Same syntax as _validFromDate_.
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
     * For which payment brand this (adhoc) tariff applies. Can be used to add a surcharge for certain payment brands.
     * Based on value of _additionalIdToken_ from _idToken.additionalInfo.type_ = "PaymentBrand".
     */
    public String getPaymentBrand() {
        return paymentBrand;
    }

    /**
     * For which payment brand this (adhoc) tariff applies. Can be used to add a surcharge for certain payment brands.
     * Based on value of _additionalIdToken_ from _idToken.additionalInfo.type_ = "PaymentBrand".
     */
    public void setPaymentBrand(String paymentBrand) {
        this.paymentBrand = paymentBrand;
    }

    /**
     * Type of adhoc payment, e.g. CC, Debit.
     * Based on value of _additionalIdToken_ from _idToken.additionalInfo.type_ = "PaymentRecognition".
     */
    public String getPaymentRecognition() {
        return paymentRecognition;
    }

    /**
     * Type of adhoc payment, e.g. CC, Debit.
     * Based on value of _additionalIdToken_ from _idToken.additionalInfo.type_ = "PaymentRecognition".
     */
    public void setPaymentRecognition(String paymentRecognition) {
        this.paymentRecognition = paymentRecognition;
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
        json.addProperty("startTimeOfDay", startTimeOfDay);
        json.addProperty("endTimeOfDay", endTimeOfDay);
        json.addProperty("validFromDate", validFromDate);
        json.addProperty("validToDate", validToDate);
        json.addProperty("evseKind", evseKind.toString());
        json.addProperty("paymentBrand", paymentBrand);
        json.addProperty("paymentRecognition", paymentRecognition);
        json.add("customData", customData.toJsonObject());
        return json;
    }

    @Override
    public void fromString(String jsonString) {
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

        if (jsonObject.has("paymentBrand")) {
            this.paymentBrand = jsonObject.get("paymentBrand").getAsString();
        }

        if (jsonObject.has("paymentRecognition")) {
            this.paymentRecognition = jsonObject.get("paymentRecognition").getAsString();
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
        if (!(obj instanceof TariffConditionsFixed))
            return false;
        TariffConditionsFixed that = (TariffConditionsFixed) obj;
        return Objects.equals(this.evseKind, that.evseKind)
                && Objects.equals(this.paymentRecognition, that.paymentRecognition)
                && Objects.equals(this.dayOfWeek, that.dayOfWeek)
                && Objects.equals(this.paymentBrand, that.paymentBrand)
                && Objects.equals(this.endTimeOfDay, that.endTimeOfDay)
                && Objects.equals(this.validFromDate, that.validFromDate)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.startTimeOfDay, that.startTimeOfDay)
                && Objects.equals(this.validToDate, that.validToDate);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.evseKind != null ? this.evseKind.hashCode() : 0);
        result = 31 * result + (this.paymentRecognition != null ? this.paymentRecognition.hashCode() : 0);
        result = 31 * result + (this.dayOfWeek != null ? this.dayOfWeek.hashCode() : 0);
        result = 31 * result + (this.paymentBrand != null ? this.paymentBrand.hashCode() : 0);
        result = 31 * result + (this.endTimeOfDay != null ? this.endTimeOfDay.hashCode() : 0);
        result = 31 * result + (this.validFromDate != null ? this.validFromDate.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.startTimeOfDay != null ? this.startTimeOfDay.hashCode() : 0);
        result = 31 * result + (this.validToDate != null ? this.validToDate.hashCode() : 0);
        return result;
    }
}
