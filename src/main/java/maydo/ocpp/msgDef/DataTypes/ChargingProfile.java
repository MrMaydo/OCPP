package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.Enumerations.ChargingProfileKindEnum;
import maydo.ocpp.msgDef.Enumerations.ChargingProfilePurposeEnum;
import maydo.ocpp.msgDef.Enumerations.RecurrencyKindEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.Date;
import java.util.List;
import java.util.Objects;


/**
 * Charging_ Profile
 * urn:x-oca:ocpp:uid:2:233255
 * A ChargingProfile consists of ChargingSchedule, describing the amount of power or current that can be delivered per time interval.
 */
public class ChargingProfile implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
    /**
     * Identified_ Object. MRID. Numeric_ Identifier
     * urn:x-enexis:ecdm:uid:1:569198
     * Id of ChargingProfile.
     * <p>
     * (Required)
     */
    @Required
    private Integer id;
    /**
     * Charging_ Profile. Stack_ Level. Counter
     * urn:x-oca:ocpp:uid:1:569230
     * Value determining level in hierarchy stack of profiles. Higher values have precedence over lower values. Lowest level is 0.
     * <p>
     * (Required)
     */
    @Required
    private Integer stackLevel;
    /**
     * Charging_ Profile. Charging_ Profile_ Purpose. Charging_ Profile_ Purpose_ Code
     * urn:x-oca:ocpp:uid:1:569231
     * Defines the purpose of the schedule transferred by this profile
     * <p>
     * (Required)
     */
    @Required
    private ChargingProfilePurposeEnum chargingProfilePurpose;
    /**
     * Charging_ Profile. Charging_ Profile_ Kind. Charging_ Profile_ Kind_ Code
     * urn:x-oca:ocpp:uid:1:569232
     * Indicates the kind of schedule.
     * <p>
     * (Required)
     */
    @Required
    private ChargingProfileKindEnum chargingProfileKind;
    /**
     * Charging_ Profile. Recurrency_ Kind. Recurrency_ Kind_ Code
     * urn:x-oca:ocpp:uid:1:569233
     * Indicates the start point of a recurrence.
     */
    @Optional
    private RecurrencyKindEnum recurrencyKind;
    /**
     * Charging_ Profile. Valid_ From. Date_ Time
     * urn:x-oca:ocpp:uid:1:569234
     * Point in time at which the profile starts to be valid. If absent, the profile is valid as soon as it is received by the Charging Station.
     */
    @Optional
    private Date validFrom;
    /**
     * Charging_ Profile. Valid_ To. Date_ Time
     * urn:x-oca:ocpp:uid:1:569235
     * Point in time at which the profile stops to be valid. If absent, the profile is valid until it is replaced by another profile.
     */
    @Optional
    private Date validTo;
    /**
     * (Required)
     */
    @Required
    private List<ChargingSchedule> chargingSchedule = null;
    /**
     * SHALL only be included if ChargingProfilePurpose is set to TxProfile. The transactionId is used to match the profile to a specific transaction.
     */
    private String transactionId;

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

    /**
     * Identified_ Object. MRID. Numeric_ Identifier
     * urn:x-enexis:ecdm:uid:1:569198
     * Id of ChargingProfile.
     * <p>
     * (Required)
     */
    public Integer getId() {
        return id;
    }

    /**
     * Identified_ Object. MRID. Numeric_ Identifier
     * urn:x-enexis:ecdm:uid:1:569198
     * Id of ChargingProfile.
     * <p>
     * (Required)
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Charging_ Profile. Stack_ Level. Counter
     * urn:x-oca:ocpp:uid:1:569230
     * Value determining level in hierarchy stack of profiles. Higher values have precedence over lower values. Lowest level is 0.
     * <p>
     * (Required)
     */
    public Integer getStackLevel() {
        return stackLevel;
    }

    /**
     * Charging_ Profile. Stack_ Level. Counter
     * urn:x-oca:ocpp:uid:1:569230
     * Value determining level in hierarchy stack of profiles. Higher values have precedence over lower values. Lowest level is 0.
     * <p>
     * (Required)
     */
    public void setStackLevel(Integer stackLevel) {
        this.stackLevel = stackLevel;
    }

    /**
     * Charging_ Profile. Charging_ Profile_ Purpose. Charging_ Profile_ Purpose_ Code
     * urn:x-oca:ocpp:uid:1:569231
     * Defines the purpose of the schedule transferred by this profile
     * <p>
     * (Required)
     */
    public ChargingProfilePurposeEnum getChargingProfilePurpose() {
        return chargingProfilePurpose;
    }

    /**
     * Charging_ Profile. Charging_ Profile_ Purpose. Charging_ Profile_ Purpose_ Code
     * urn:x-oca:ocpp:uid:1:569231
     * Defines the purpose of the schedule transferred by this profile
     * <p>
     * (Required)
     */
    public void setChargingProfilePurpose(ChargingProfilePurposeEnum chargingProfilePurpose) {
        this.chargingProfilePurpose = chargingProfilePurpose;
    }

    /**
     * Charging_ Profile. Charging_ Profile_ Kind. Charging_ Profile_ Kind_ Code
     * urn:x-oca:ocpp:uid:1:569232
     * Indicates the kind of schedule.
     * <p>
     * (Required)
     */
    public ChargingProfileKindEnum getChargingProfileKind() {
        return chargingProfileKind;
    }

    /**
     * Charging_ Profile. Charging_ Profile_ Kind. Charging_ Profile_ Kind_ Code
     * urn:x-oca:ocpp:uid:1:569232
     * Indicates the kind of schedule.
     * <p>
     * (Required)
     */
    public void setChargingProfileKind(ChargingProfileKindEnum chargingProfileKind) {
        this.chargingProfileKind = chargingProfileKind;
    }

    /**
     * Charging_ Profile. Recurrency_ Kind. Recurrency_ Kind_ Code
     * urn:x-oca:ocpp:uid:1:569233
     * Indicates the start point of a recurrence.
     */
    public RecurrencyKindEnum getRecurrencyKind() {
        return recurrencyKind;
    }

    /**
     * Charging_ Profile. Recurrency_ Kind. Recurrency_ Kind_ Code
     * urn:x-oca:ocpp:uid:1:569233
     * Indicates the start point of a recurrence.
     */
    public void setRecurrencyKind(RecurrencyKindEnum recurrencyKind) {
        this.recurrencyKind = recurrencyKind;
    }

    /**
     * Charging_ Profile. Valid_ From. Date_ Time
     * urn:x-oca:ocpp:uid:1:569234
     * Point in time at which the profile starts to be valid. If absent, the profile is valid as soon as it is received by the Charging Station.
     */
    public Date getValidFrom() {
        return validFrom;
    }

    /**
     * Charging_ Profile. Valid_ From. Date_ Time
     * urn:x-oca:ocpp:uid:1:569234
     * Point in time at which the profile starts to be valid. If absent, the profile is valid as soon as it is received by the Charging Station.
     */
    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }

    /**
     * Charging_ Profile. Valid_ To. Date_ Time
     * urn:x-oca:ocpp:uid:1:569235
     * Point in time at which the profile stops to be valid. If absent, the profile is valid until it is replaced by another profile.
     */
    public Date getValidTo() {
        return validTo;
    }

    /**
     * Charging_ Profile. Valid_ To. Date_ Time
     * urn:x-oca:ocpp:uid:1:569235
     * Point in time at which the profile stops to be valid. If absent, the profile is valid until it is replaced by another profile.
     */
    public void setValidTo(Date validTo) {
        this.validTo = validTo;
    }

    /**
     * (Required)
     */
    public List<ChargingSchedule> getChargingSchedule() {
        return chargingSchedule;
    }

    /**
     * (Required)
     */
    public void setChargingSchedule(List<ChargingSchedule> chargingSchedule) {
        this.chargingSchedule = chargingSchedule;
    }

    /**
     * SHALL only be included if ChargingProfilePurpose is set to TxProfile. The transactionId is used to match the profile to a specific transaction.
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * SHALL only be included if ChargingProfilePurpose is set to TxProfile. The transactionId is used to match the profile to a specific transaction.
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject() {
        return JsonTools.toJsonObject(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof ChargingProfile))
            return false;
        ChargingProfile that = (ChargingProfile) obj;
        return Objects.equals(customData, that.customData)
                && Objects.equals(id, that.id)
                && Objects.equals(stackLevel, that.stackLevel)
                && chargingProfilePurpose == that.chargingProfilePurpose
                && chargingProfileKind == that.chargingProfileKind
                && recurrencyKind == that.recurrencyKind
                && Objects.equals(validFrom, that.validFrom)
                && Objects.equals(validTo, that.validTo)
                && Objects.equals(chargingSchedule, that.chargingSchedule)
                && Objects.equals(transactionId, that.transactionId);
    }

    @Override
    public int hashCode() {
        int result = (id != null ? id.hashCode() : 0);
        result = 31 * result + (stackLevel != null ? stackLevel.hashCode() : 0);
        result = 31 * result + (chargingProfilePurpose != null ? chargingProfilePurpose.hashCode() : 0);
        result = 31 * result + (chargingProfileKind != null ? chargingProfileKind.hashCode() : 0);
        result = 31 * result + (recurrencyKind != null ? recurrencyKind.hashCode() : 0);
        result = 31 * result + (validFrom != null ? validFrom.hashCode() : 0);
        result = 31 * result + (validTo != null ? validTo.hashCode() : 0);
        result = 31 * result + (chargingSchedule != null ? chargingSchedule.hashCode() : 0);
        result = 31 * result + (transactionId != null ? transactionId.hashCode() : 0);
        result = 31 * result + (customData != null ? customData.hashCode() : 0);
        return result;
    }
}
