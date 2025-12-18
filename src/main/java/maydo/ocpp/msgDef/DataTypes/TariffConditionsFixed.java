package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.Enumerations.DayOfWeekEnum;
import maydo.ocpp.msgDef.Enumerations.EvseKindEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * These conditions describe if a FixedPrice applies at start of the transaction.
 * When more than one restriction is set, they are to be treated as a logical AND. All need to be valid before this price is active.
 */
public class TariffConditionsFixed implements JsonInterface {

    /**
     * Start time of day in local time.
     * <p> Format as per RFC 3339: time-hour ":" time-minute Must be in 24h format with leading zeros. </p>
     * <p> Hour/Minute separator: ":" </p>
     * <p> Regex: ([0-1][0-9]|2[0-3]):[0-5][0-9] </p>
     */
    @Optional
    private String startTimeOfDay;

    /**
     * Optional. End time of day in local time.
     * If end time < start time then the period wraps around to the next day.
     * To stop at end of the day use: 00:00.
     * <p> Format as per RFC 3339: time-hour ":" time-minute Must be in 24h format with leading zeros. </p>
     * <p> Hour/Minute separator: ":" </p>
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
     * <p> Regex: ([12][0-9]{3})-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01]) </p>.
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
     * Based on value of additionalIdToken from idToken.additionalInfo.type = "PaymentBrand".
     */
    @Optional
    private String paymentBrand;

    /**
     * Type of adhoc payment, e.g. CC, Debit.
     * Based on value of additionalIdToken from idToken.additionalInfo.type = "PaymentRecognition".
     */
    @Optional
    private String paymentRecognition;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public TariffConditionsFixed() {
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


    public String getPaymentBrand() {
        return paymentBrand;
    }


    public void setPaymentBrand(String paymentBrand) {
        this.paymentBrand = paymentBrand;
    }


    public String getPaymentRecognition() {
        return paymentRecognition;
    }


    public void setPaymentRecognition(String paymentRecognition) {
        this.paymentRecognition = paymentRecognition;
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

        if (getStartTimeOfDay() != null) {
            json.addProperty("startTimeOfDay", getStartTimeOfDay());
        }
        if (getEndTimeOfDay() != null) {
            json.addProperty("endTimeOfDay", getEndTimeOfDay());
        }
        if (getDayOfWeek() != null) {
            JsonArray dayOfWeekArray = new JsonArray();
            for (DayOfWeekEnum item : getDayOfWeek()) {
                dayOfWeekArray.add(item.toString());
            }
            json.add("dayOfWeek", dayOfWeekArray);
        }
        if (getValidFromDate() != null) {
            json.addProperty("validFromDate", getValidFromDate());
        }
        if (getValidToDate() != null) {
            json.addProperty("validToDate", getValidToDate());
        }
        if (getEvseKind() != null) {
            json.addProperty("evseKind", getEvseKind().toString());
        }
        if (getPaymentBrand() != null) {
            json.addProperty("paymentBrand", getPaymentBrand());
        }
        if (getPaymentRecognition() != null) {
            json.addProperty("paymentRecognition", getPaymentRecognition());
        }
        if (getCustomData() != null) {
            json.add("customData", getCustomData().toJsonObject());
        }

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
            setStartTimeOfDay(jsonObject.get("startTimeOfDay").getAsString());
        }

        if (jsonObject.has("endTimeOfDay")) {
            setEndTimeOfDay(jsonObject.get("endTimeOfDay").getAsString());
        }

        if (jsonObject.has("dayOfWeek")) {
            setDayOfWeek(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("dayOfWeek");
            for (JsonElement el : arr) {
                getDayOfWeek().add(DayOfWeekEnum.valueOf(el.getAsString()));
            }
        }

        if (jsonObject.has("validFromDate")) {
            setValidFromDate(jsonObject.get("validFromDate").getAsString());
        }

        if (jsonObject.has("validToDate")) {
            setValidToDate(jsonObject.get("validToDate").getAsString());
        }

        if (jsonObject.has("evseKind")) {
            setEvseKind(EvseKindEnum.valueOf(jsonObject.get("evseKind").getAsString()));
        }

        if (jsonObject.has("paymentBrand")) {
            setPaymentBrand(jsonObject.get("paymentBrand").getAsString());
        }

        if (jsonObject.has("paymentRecognition")) {
            setPaymentRecognition(jsonObject.get("paymentRecognition").getAsString());
        }

        if (jsonObject.has("customData")) {
            setCustomData(new CustomData());
            getCustomData().fromJsonObject(jsonObject.getAsJsonObject("customData"));
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
        return Objects.hash(
                getStartTimeOfDay(),
                getEndTimeOfDay(),
                getDayOfWeek(),
                getValidFromDate(),
                getValidToDate(),
                getEvseKind(),
                getPaymentBrand(),
                getPaymentRecognition(),
                getCustomData()
        );
    }
}
