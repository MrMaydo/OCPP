package maydo.ocpp.msgDef.DataTypes;

import maydo.ocpp.msgDef.Enumerations.ChargingProfileKindEnum;
import maydo.ocpp.msgDef.Enumerations.ChargingProfilePurposeEnum;
import maydo.ocpp.msgDef.Enumerations.RecurrencyKindEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class ChargingProfile implements JsonInterface {

    /**
     * Id of ChargingProfile. Unique within charging station. Id can have a negative value. This is useful to distinguish charging profiles from an external actor (external constraints) from charging profiles received from CSMS.
     * 
     * (Required)
     */
    @Required
    private Integer id;
    /**
     * Value determining level in hierarchy stack of profiles. Higher values have precedence over lower values. Lowest level is 0.
     * 
     * (Required)
     */
    @Required
    private Integer stackLevel;
    /**
     * Defines the purpose of the schedule transferred by this profile
     * 
     * (Required)
     */
    @Required
    private ChargingProfilePurposeEnum chargingProfilePurpose;
    /**
     * Indicates the kind of schedule.
     * 
     * (Required)
     */
    @Required
    private ChargingProfileKindEnum chargingProfileKind;
    /**
     * Indicates the start point of a recurrence.
     */
    @Optional
    private RecurrencyKindEnum recurrencyKind;
    /**
     * Point in time at which the profile starts to be valid. If absent, the profile is valid as soon as it is received by the Charging Station.
     */
    @Optional
    private Date validFrom;
    /**
     * Point in time at which the profile stops to be valid. If absent, the profile is valid until it is replaced by another profile.
     */
    @Optional
    private Date validTo;
    /**
     * SHALL only be included if ChargingProfilePurpose is set to TxProfile in a SetChargingProfileRequest. The transactionId is used to match the profile to a specific transaction.
     */
    @Optional
    private String transactionId;
    /**
     * *(2.1)* Period in seconds that this charging profile remains valid after the Charging Station has gone offline. After this period the charging profile becomes invalid for as long as it is offline and the Charging Station reverts back to a valid profile with a lower stack level. 
     * If _invalidAfterOfflineDuration_ is true, then this charging profile will become permanently invalid.
     * A value of 0 means that the charging profile is immediately invalid while offline. When the field is absent, then  no timeout applies and the charging profile remains valid when offline.
     */
    @Optional
    private Integer maxOfflineDuration;
    /**
     * 
     * (Required)
     */
    @Required
    private List<ChargingSchedule> chargingSchedule;
    /**
     * *(2.1)* When set to true this charging profile will not be valid anymore after being offline for more than _maxOfflineDuration_. +
     *     When absent defaults to false.
     */
    @Optional
    private Boolean invalidAfterOfflineDuration;
    /**
     * *(2.1)*  Interval in seconds after receipt of last update, when to request a profile update by sending a PullDynamicScheduleUpdateRequest message.
     *     A value of 0 or no value means that no update interval applies. +
     *     Only relevant in a dynamic charging profile.
     * 
     */
    @Optional
    private Integer dynUpdateInterval;
    /**
     * *(2.1)* Time at which limits or setpoints in this charging profile were last updated by a PullDynamicScheduleUpdateRequest or UpdateDynamicScheduleRequest or by an external actor. +
     *     Only relevant in a dynamic charging profile.
     * 
     */
    @Optional
    private Date dynUpdateTime;
    /**
     * *(2.1)* ISO 15118-20 signature for all price schedules in _chargingSchedules_. +
     * Note: for 256-bit elliptic curves (like secp256k1) the ECDSA signature is 512 bits (64 bytes) and for 521-bit curves (like secp521r1) the signature is 1042 bits. This equals 131 bytes, which can be encoded as base64 in 176 bytes.
     */
    @Optional
    private String priceScheduleSignature;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public ChargingProfile() {
    }

    /**
     * 
     * @param invalidAfterOfflineDuration
     *     *(2.1)* When set to true this charging profile will not be valid anymore after being offline for more than _maxOfflineDuration_. +
     *         When absent defaults to false.
     *     .
     * @param dynUpdateTime
     *     *(2.1)* Time at which limits or setpoints in this charging profile were last updated by a PullDynamicScheduleUpdateRequest or UpdateDynamicScheduleRequest or by an external actor. +
     *         Only relevant in a dynamic charging profile.
     *     
     *     .
     * @param id
     *     Id of ChargingProfile. Unique within charging station. Id can have a negative value. This is useful to distinguish charging profiles from an external actor (external constraints) from charging profiles received from CSMS.
     *     .
     * @param validFrom
     *     Point in time at which the profile starts to be valid. If absent, the profile is valid as soon as it is received by the Charging Station.
     *     .
     * @param stackLevel
     *     Value determining level in hierarchy stack of profiles. Higher values have precedence over lower values. Lowest level is 0.
     *     .
     * @param maxOfflineDuration
     *     *(2.1)* Period in seconds that this charging profile remains valid after the Charging Station has gone offline. After this period the charging profile becomes invalid for as long as it is offline and the Charging Station reverts back to a valid profile with a lower stack level. 
     *     If _invalidAfterOfflineDuration_ is true, then this charging profile will become permanently invalid.
     *     A value of 0 means that the charging profile is immediately invalid while offline. When the field is absent, then  no timeout applies and the charging profile remains valid when offline.
     *     .
     * @param priceScheduleSignature
     *     *(2.1)* ISO 15118-20 signature for all price schedules in _chargingSchedules_. +
     *     Note: for 256-bit elliptic curves (like secp256k1) the ECDSA signature is 512 bits (64 bytes) and for 521-bit curves (like secp521r1) the signature is 1042 bits. This equals 131 bytes, which can be encoded as base64 in 176 bytes.
     *     .
     * @param transactionId
     *     SHALL only be included if ChargingProfilePurpose is set to TxProfile in a SetChargingProfileRequest. The transactionId is used to match the profile to a specific transaction.
     *     .
     * @param validTo
     *     Point in time at which the profile stops to be valid. If absent, the profile is valid until it is replaced by another profile.
     *     .
     * @param dynUpdateInterval
     *     *(2.1)*  Interval in seconds after receipt of last update, when to request a profile update by sending a PullDynamicScheduleUpdateRequest message.
     *         A value of 0 or no value means that no update interval applies. +
     *         Only relevant in a dynamic charging profile.
     *     
     *     .
     */
    public ChargingProfile(Integer id, Integer stackLevel, ChargingProfilePurposeEnum chargingProfilePurpose, ChargingProfileKindEnum chargingProfileKind, RecurrencyKindEnum recurrencyKind, Date validFrom, Date validTo, String transactionId, Integer maxOfflineDuration, List<ChargingSchedule> chargingSchedule, Boolean invalidAfterOfflineDuration, Integer dynUpdateInterval, Date dynUpdateTime, String priceScheduleSignature, CustomData customData) {
        super();
        this.id = id;
        this.stackLevel = stackLevel;
        this.chargingProfilePurpose = chargingProfilePurpose;
        this.chargingProfileKind = chargingProfileKind;
        this.recurrencyKind = recurrencyKind;
        this.validFrom = validFrom;
        this.validTo = validTo;
        this.transactionId = transactionId;
        this.maxOfflineDuration = maxOfflineDuration;
        this.chargingSchedule = chargingSchedule;
        this.invalidAfterOfflineDuration = invalidAfterOfflineDuration;
        this.dynUpdateInterval = dynUpdateInterval;
        this.dynUpdateTime = dynUpdateTime;
        this.priceScheduleSignature = priceScheduleSignature;
        this.customData = customData;
    }

    /**
     * Id of ChargingProfile. Unique within charging station. Id can have a negative value. This is useful to distinguish charging profiles from an external actor (external constraints) from charging profiles received from CSMS.
     * 
     * (Required)
     */
    public Integer getId() {
        return id;
    }

    /**
     * Id of ChargingProfile. Unique within charging station. Id can have a negative value. This is useful to distinguish charging profiles from an external actor (external constraints) from charging profiles received from CSMS.
     * 
     * (Required)
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Value determining level in hierarchy stack of profiles. Higher values have precedence over lower values. Lowest level is 0.
     * 
     * (Required)
     */
    public Integer getStackLevel() {
        return stackLevel;
    }

    /**
     * Value determining level in hierarchy stack of profiles. Higher values have precedence over lower values. Lowest level is 0.
     * 
     * (Required)
     */
    public void setStackLevel(Integer stackLevel) {
        this.stackLevel = stackLevel;
    }

    /**
     * Defines the purpose of the schedule transferred by this profile
     * 
     * (Required)
     */
    public ChargingProfilePurposeEnum getChargingProfilePurpose() {
        return chargingProfilePurpose;
    }

    /**
     * Defines the purpose of the schedule transferred by this profile
     * 
     * (Required)
     */
    public void setChargingProfilePurpose(ChargingProfilePurposeEnum chargingProfilePurpose) {
        this.chargingProfilePurpose = chargingProfilePurpose;
    }

    /**
     * Indicates the kind of schedule.
     * 
     * (Required)
     */
    public ChargingProfileKindEnum getChargingProfileKind() {
        return chargingProfileKind;
    }

    /**
     * Indicates the kind of schedule.
     * 
     * (Required)
     */
    public void setChargingProfileKind(ChargingProfileKindEnum chargingProfileKind) {
        this.chargingProfileKind = chargingProfileKind;
    }

    /**
     * Indicates the start point of a recurrence.
     */
    public RecurrencyKindEnum getRecurrencyKind() {
        return recurrencyKind;
    }

    /**
     * Indicates the start point of a recurrence.
     */
    public void setRecurrencyKind(RecurrencyKindEnum recurrencyKind) {
        this.recurrencyKind = recurrencyKind;
    }

    /**
     * Point in time at which the profile starts to be valid. If absent, the profile is valid as soon as it is received by the Charging Station.
     */
    public Date getValidFrom() {
        return validFrom;
    }

    /**
     * Point in time at which the profile starts to be valid. If absent, the profile is valid as soon as it is received by the Charging Station.
     */
    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }

    /**
     * Point in time at which the profile stops to be valid. If absent, the profile is valid until it is replaced by another profile.
     */
    public Date getValidTo() {
        return validTo;
    }

    /**
     * Point in time at which the profile stops to be valid. If absent, the profile is valid until it is replaced by another profile.
     */
    public void setValidTo(Date validTo) {
        this.validTo = validTo;
    }

    /**
     * SHALL only be included if ChargingProfilePurpose is set to TxProfile in a SetChargingProfileRequest. The transactionId is used to match the profile to a specific transaction.
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * SHALL only be included if ChargingProfilePurpose is set to TxProfile in a SetChargingProfileRequest. The transactionId is used to match the profile to a specific transaction.
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * *(2.1)* Period in seconds that this charging profile remains valid after the Charging Station has gone offline. After this period the charging profile becomes invalid for as long as it is offline and the Charging Station reverts back to a valid profile with a lower stack level. 
     * If _invalidAfterOfflineDuration_ is true, then this charging profile will become permanently invalid.
     * A value of 0 means that the charging profile is immediately invalid while offline. When the field is absent, then  no timeout applies and the charging profile remains valid when offline.
     */
    public Integer getMaxOfflineDuration() {
        return maxOfflineDuration;
    }

    /**
     * *(2.1)* Period in seconds that this charging profile remains valid after the Charging Station has gone offline. After this period the charging profile becomes invalid for as long as it is offline and the Charging Station reverts back to a valid profile with a lower stack level. 
     * If _invalidAfterOfflineDuration_ is true, then this charging profile will become permanently invalid.
     * A value of 0 means that the charging profile is immediately invalid while offline. When the field is absent, then  no timeout applies and the charging profile remains valid when offline.
     */
    public void setMaxOfflineDuration(Integer maxOfflineDuration) {
        this.maxOfflineDuration = maxOfflineDuration;
    }

    /**
     * 
     * (Required)
     */
    public List<ChargingSchedule> getChargingSchedule() {
        return chargingSchedule;
    }

    /**
     * 
     * (Required)
     */
    public void setChargingSchedule(List<ChargingSchedule> chargingSchedule) {
        this.chargingSchedule = chargingSchedule;
    }

    /**
     * *(2.1)* When set to true this charging profile will not be valid anymore after being offline for more than _maxOfflineDuration_. +
     *     When absent defaults to false.
     */
    public Boolean getInvalidAfterOfflineDuration() {
        return invalidAfterOfflineDuration;
    }

    /**
     * *(2.1)* When set to true this charging profile will not be valid anymore after being offline for more than _maxOfflineDuration_. +
     *     When absent defaults to false.
     */
    public void setInvalidAfterOfflineDuration(Boolean invalidAfterOfflineDuration) {
        this.invalidAfterOfflineDuration = invalidAfterOfflineDuration;
    }

    /**
     * *(2.1)*  Interval in seconds after receipt of last update, when to request a profile update by sending a PullDynamicScheduleUpdateRequest message.
     *     A value of 0 or no value means that no update interval applies. +
     *     Only relevant in a dynamic charging profile.
     * 
     */
    public Integer getDynUpdateInterval() {
        return dynUpdateInterval;
    }

    /**
     * *(2.1)*  Interval in seconds after receipt of last update, when to request a profile update by sending a PullDynamicScheduleUpdateRequest message.
     *     A value of 0 or no value means that no update interval applies. +
     *     Only relevant in a dynamic charging profile.
     * 
     */
    public void setDynUpdateInterval(Integer dynUpdateInterval) {
        this.dynUpdateInterval = dynUpdateInterval;
    }

    /**
     * *(2.1)* Time at which limits or setpoints in this charging profile were last updated by a PullDynamicScheduleUpdateRequest or UpdateDynamicScheduleRequest or by an external actor. +
     *     Only relevant in a dynamic charging profile.
     * 
     */
    public Date getDynUpdateTime() {
        return dynUpdateTime;
    }

    /**
     * *(2.1)* Time at which limits or setpoints in this charging profile were last updated by a PullDynamicScheduleUpdateRequest or UpdateDynamicScheduleRequest or by an external actor. +
     *     Only relevant in a dynamic charging profile.
     * 
     */
    public void setDynUpdateTime(Date dynUpdateTime) {
        this.dynUpdateTime = dynUpdateTime;
    }

    /**
     * *(2.1)* ISO 15118-20 signature for all price schedules in _chargingSchedules_. +
     * Note: for 256-bit elliptic curves (like secp256k1) the ECDSA signature is 512 bits (64 bytes) and for 521-bit curves (like secp521r1) the signature is 1042 bits. This equals 131 bytes, which can be encoded as base64 in 176 bytes.
     */
    public String getPriceScheduleSignature() {
        return priceScheduleSignature;
    }

    /**
     * *(2.1)* ISO 15118-20 signature for all price schedules in _chargingSchedules_. +
     * Note: for 256-bit elliptic curves (like secp256k1) the ECDSA signature is 512 bits (64 bytes) and for 521-bit curves (like secp521r1) the signature is 1042 bits. This equals 131 bytes, which can be encoded as base64 in 176 bytes.
     */
    public void setPriceScheduleSignature(String priceScheduleSignature) {
        this.priceScheduleSignature = priceScheduleSignature;
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
