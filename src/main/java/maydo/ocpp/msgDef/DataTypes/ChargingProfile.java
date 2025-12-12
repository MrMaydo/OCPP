package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.Enumerations.ChargingProfileKindEnum;
import maydo.ocpp.msgDef.Enumerations.ChargingProfilePurposeEnum;
import maydo.ocpp.msgDef.Enumerations.RecurrencyKindEnum;
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
 * A ChargingProfile consists of 1 to 3 ChargingSchedules with a list of ChargingSchedulePeriods,
 * describing the amount of power or current that can be delivered per time interval.
 */
public class ChargingProfile implements JsonInterface {

    /**
     * Id of ChargingProfile. Unique within charging station. Id can have a negative value.
     * This is useful to distinguish charging profiles from an external actor (external constraints)
     * from charging profiles received from CSMS.
     */
    @Required
    private Integer id;

    /**
     * Value determining level in hierarchy stack of profiles. Higher values have precedence over lower values.
     * Lowest level is 0.
     */
    @Required
    private Integer stackLevel;

    /**
     * Defines the purpose of the schedule transferred by this profile
     */
    @Required
    private ChargingProfilePurposeEnum chargingProfilePurpose;

    /**
     * Indicates the kind of schedule.
     */
    @Required
    private ChargingProfileKindEnum chargingProfileKind;

    /**
     * Indicates the start point of a recurrence.
     */
    @Optional
    private RecurrencyKindEnum recurrencyKind;

    /**
     * Point in time at which the profile starts to be valid.
     * If absent, the profile is valid as soon as it is received by the Charging Station.
     */
    @Optional
    private Date validFrom;

    /**
     * Point in time at which the profile stops to be valid.
     * If absent, the profile is valid until it is replaced by another profile.
     */
    @Optional
    private Date validTo;

    /**
     * SHALL only be included if ChargingProfilePurpose is set to TxProfile in a SetChargingProfileRequest.
     * The transactionId is used to match the profile to a specific transaction.
     */
    @Optional
    private String transactionId;

    /**
     * (2.1) Period in seconds that this charging profile remains valid after the Charging Station has gone offline.
     * After this period the charging profile becomes invalid for as long as it is offline
     * and the Charging Station reverts back to a valid profile with a lower stack level.
     * If invalidAfterOfflineDuration is true, then this charging profile will become permanently invalid.
     * A value of 0 means that the charging profile is immediately invalid while offline.
     * When the field is absent, then no timeout applies and the charging profile remains valid when offline.
     */
    @Optional
    private Integer maxOfflineDuration;

    /**
     * Schedule that contains limits for the available power or current over time.
     * In order to support ISO 15118 schedule negotiation, it supports at most three schedules with associated tariff to choose from.
     * Having multiple chargingSchedules is only allowed for charging profiles of purpose TxProfile
     * in the context of an ISO 15118 charging session.
     * For ISO 15118 Dynamic Control Mode only one chargingSchedule shall be provided.
     */
    @Required
    private List<ChargingSchedule> chargingSchedule;

    /**
     * (2.1) When set to true this charging profile will not be valid anymore after being offline for more than maxOfflineDuration.
     * When absent defaults to false.
     */
    @Optional
    private Boolean invalidAfterOfflineDuration;

    /**
     * (2.1) Interval in seconds after receipt of last update, when to request a profile update by sending
     * a PullDynamicScheduleUpdateRequest message. A value of 0 or no value means that no update interval applies.
     * Only relevant in a dynamic charging profile.
     */
    @Optional
    private Integer dynUpdateInterval;

    /**
     * (2.1) Time at which limits or setpoints in this charging profile were last updated
     * by a PullDynamicScheduleUpdateRequest or UpdateDynamicScheduleRequest or by an external actor.
     * Only relevant in a dynamic charging profile.
     */
    @Optional
    private Date dynUpdateTime;

    /**
     * (2.1) ISO 15118-20 signature for all price schedules in chargingSchedules.
     * Note: for 256-bit elliptic curves (like secp256k1) the ECDSA signature is 512 bits (64 bytes)
     * and for 521-bit curves (like secp521r1) the signature is 1042 bits.
     * This equals 131 bytes, which can be encoded as base64 in 176 bytes
     */
    @Optional
    private String priceScheduleSignature;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public ChargingProfile() {
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getStackLevel() {
        return stackLevel;
    }


    public void setStackLevel(Integer stackLevel) {
        this.stackLevel = stackLevel;
    }


    public ChargingProfilePurposeEnum getChargingProfilePurpose() {
        return chargingProfilePurpose;
    }


    public void setChargingProfilePurpose(ChargingProfilePurposeEnum chargingProfilePurpose) {
        this.chargingProfilePurpose = chargingProfilePurpose;
    }


    public ChargingProfileKindEnum getChargingProfileKind() {
        return chargingProfileKind;
    }


    public void setChargingProfileKind(ChargingProfileKindEnum chargingProfileKind) {
        this.chargingProfileKind = chargingProfileKind;
    }


    public RecurrencyKindEnum getRecurrencyKind() {
        return recurrencyKind;
    }


    public void setRecurrencyKind(RecurrencyKindEnum recurrencyKind) {
        this.recurrencyKind = recurrencyKind;
    }


    public Date getValidFrom() {
        return validFrom;
    }


    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }


    public Date getValidTo() {
        return validTo;
    }


    public void setValidTo(Date validTo) {
        this.validTo = validTo;
    }


    public String getTransactionId() {
        return transactionId;
    }


    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }


    public Integer getMaxOfflineDuration() {
        return maxOfflineDuration;
    }


    public void setMaxOfflineDuration(Integer maxOfflineDuration) {
        this.maxOfflineDuration = maxOfflineDuration;
    }


    public List<ChargingSchedule> getChargingSchedule() {
        return chargingSchedule;
    }


    public void setChargingSchedule(List<ChargingSchedule> chargingSchedule) {
        this.chargingSchedule = chargingSchedule;
    }


    public Boolean getInvalidAfterOfflineDuration() {
        return invalidAfterOfflineDuration;
    }


    public void setInvalidAfterOfflineDuration(Boolean invalidAfterOfflineDuration) {
        this.invalidAfterOfflineDuration = invalidAfterOfflineDuration;
    }


    public Integer getDynUpdateInterval() {
        return dynUpdateInterval;
    }


    public void setDynUpdateInterval(Integer dynUpdateInterval) {
        this.dynUpdateInterval = dynUpdateInterval;
    }


    public Date getDynUpdateTime() {
        return dynUpdateTime;
    }


    public void setDynUpdateTime(Date dynUpdateTime) {
        this.dynUpdateTime = dynUpdateTime;
    }


    public String getPriceScheduleSignature() {
        return priceScheduleSignature;
    }


    public void setPriceScheduleSignature(String priceScheduleSignature) {
        this.priceScheduleSignature = priceScheduleSignature;
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
        json.addProperty("stackLevel", stackLevel);
        json.addProperty("chargingProfilePurpose", chargingProfilePurpose.toString());
        json.addProperty("chargingProfileKind", chargingProfileKind.toString());
        json.addProperty("recurrencyKind", recurrencyKind.toString());
        json.addProperty("validFrom", new SimpleDateFormat(DATE_FORMAT).format(validFrom));
        json.addProperty("validTo", new SimpleDateFormat(DATE_FORMAT).format(validTo));
        json.addProperty("transactionId", transactionId);
        json.addProperty("maxOfflineDuration", maxOfflineDuration);
        json.addProperty("invalidAfterOfflineDuration", invalidAfterOfflineDuration);
        json.addProperty("dynUpdateInterval", dynUpdateInterval);
        json.addProperty("dynUpdateTime", new SimpleDateFormat(DATE_FORMAT).format(dynUpdateTime));
        json.addProperty("priceScheduleSignature", priceScheduleSignature);
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

        if (jsonObject.has("stackLevel")) {
            this.stackLevel = jsonObject.get("stackLevel").getAsInt();
        }

        if (jsonObject.has("chargingProfilePurpose")) {
            this.chargingProfilePurpose = ChargingProfilePurposeEnum.valueOf(jsonObject.get("chargingProfilePurpose").getAsString());
        }

        if (jsonObject.has("chargingProfileKind")) {
            this.chargingProfileKind = ChargingProfileKindEnum.valueOf(jsonObject.get("chargingProfileKind").getAsString());
        }

        if (jsonObject.has("recurrencyKind")) {
            this.recurrencyKind = RecurrencyKindEnum.valueOf(jsonObject.get("recurrencyKind").getAsString());
        }

        if (jsonObject.has("validFrom")) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                this.validFrom = dateFormat.parse(jsonObject.get("validFrom").getAsString());
            } catch (ParseException e) {
                System.out.println("Invalid date format for validFrom" + e);
            }
        }

        if (jsonObject.has("validTo")) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                this.validTo = dateFormat.parse(jsonObject.get("validTo").getAsString());
            } catch (ParseException e) {
                System.out.println("Invalid date format for validTo" + e);
            }
        }

        if (jsonObject.has("transactionId")) {
            this.transactionId = jsonObject.get("transactionId").getAsString();
        }

        if (jsonObject.has("maxOfflineDuration")) {
            this.maxOfflineDuration = jsonObject.get("maxOfflineDuration").getAsInt();
        }

        if (jsonObject.has("invalidAfterOfflineDuration")) {
            this.invalidAfterOfflineDuration = jsonObject.get("invalidAfterOfflineDuration").getAsBoolean();
        }

        if (jsonObject.has("dynUpdateInterval")) {
            this.dynUpdateInterval = jsonObject.get("dynUpdateInterval").getAsInt();
        }

        if (jsonObject.has("dynUpdateTime")) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                this.dynUpdateTime = dateFormat.parse(jsonObject.get("dynUpdateTime").getAsString());
            } catch (ParseException e) {
                System.out.println("Invalid date format for dynUpdateTime" + e);
            }
        }

        if (jsonObject.has("priceScheduleSignature")) {
            this.priceScheduleSignature = jsonObject.get("priceScheduleSignature").getAsString();
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
        if (!(obj instanceof ChargingProfile))
            return false;
        ChargingProfile that = (ChargingProfile) obj;
        return Objects.equals(this.recurrencyKind, that.recurrencyKind)
                && Objects.equals(this.chargingSchedule, that.chargingSchedule)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.validFrom, that.validFrom)
                && Objects.equals(this.stackLevel, that.stackLevel)
                && Objects.equals(this.priceScheduleSignature, that.priceScheduleSignature)
                && Objects.equals(this.transactionId, that.transactionId)
                && Objects.equals(this.chargingProfileKind, that.chargingProfileKind)
                && Objects.equals(this.chargingProfilePurpose, that.chargingProfilePurpose)
                && Objects.equals(this.invalidAfterOfflineDuration, that.invalidAfterOfflineDuration)
                && Objects.equals(this.dynUpdateTime, that.dynUpdateTime)
                && Objects.equals(this.id, that.id)
                && Objects.equals(this.maxOfflineDuration, that.maxOfflineDuration)
                && Objects.equals(this.validTo, that.validTo)
                && Objects.equals(this.dynUpdateInterval, that.dynUpdateInterval);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.recurrencyKind != null ? this.recurrencyKind.hashCode() : 0);
        result = 31 * result + (this.chargingSchedule != null ? this.chargingSchedule.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.validFrom != null ? this.validFrom.hashCode() : 0);
        result = 31 * result + (this.stackLevel != null ? this.stackLevel.hashCode() : 0);
        result = 31 * result + (this.priceScheduleSignature != null ? this.priceScheduleSignature.hashCode() : 0);
        result = 31 * result + (this.transactionId != null ? this.transactionId.hashCode() : 0);
        result = 31 * result + (this.chargingProfileKind != null ? this.chargingProfileKind.hashCode() : 0);
        result = 31 * result + (this.chargingProfilePurpose != null ? this.chargingProfilePurpose.hashCode() : 0);
        result = 31 * result + (this.invalidAfterOfflineDuration != null ? this.invalidAfterOfflineDuration.hashCode() : 0);
        result = 31 * result + (this.dynUpdateTime != null ? this.dynUpdateTime.hashCode() : 0);
        result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
        result = 31 * result + (this.maxOfflineDuration != null ? this.maxOfflineDuration.hashCode() : 0);
        result = 31 * result + (this.validTo != null ? this.validTo.hashCode() : 0);
        result = 31 * result + (this.dynUpdateInterval != null ? this.dynUpdateInterval.hashCode() : 0);
        return result;
    }
}
