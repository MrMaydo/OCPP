package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.*;
import maydo.ocpp.msgDef.Enumerations.PreconditioningStatusEnum;
import maydo.ocpp.msgDef.Enumerations.TransactionEventEnum;
import maydo.ocpp.msgDef.Enumerations.TriggerReasonEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class TransactionEventRequest implements JsonInterface {

    /**
     * CostDetailsType contains the cost as calculated by Charging Station based on provided TariffType.
     * <p>
     * NOTE: Reservation is not shown as a _chargingPeriod_, because it took place outside of the transaction.
     */
    @Optional
    private CostDetails costDetails;
    /**
     * This contains the type of this event.
     * The first TransactionEvent of a transaction SHALL contain: "Started" The last TransactionEvent of a transaction SHALL contain: "Ended" All others SHALL contain: "Updated"
     * <p>
     * (Required)
     */
    @Required
    private TransactionEventEnum eventType;
    @Optional
    private List<MeterValue> meterValue;
    /**
     * The date and time at which this transaction event occurred.
     * <p>
     * (Required)
     */
    @Required
    private Date timestamp;
    /**
     * Reason the Charging Station sends this message to the CSMS
     * <p>
     * (Required)
     */
    @Required
    private TriggerReasonEnum triggerReason;
    /**
     * Incremental sequence number, helps with determining if all messages of a transaction have been received.
     * <p>
     * (Required)
     */
    @Required
    private Integer seqNo;
    /**
     * Indication that this transaction event happened when the Charging Station was offline. Default = false, meaning: the event occurred when the Charging Station was online.
     */
    @Optional
    private Boolean offline = false;
    /**
     * If the Charging Station is able to report the number of phases used, then it SHALL provide it.
     * When omitted the CSMS may be able to determine the number of phases used as follows: +
     * 1: The numberPhases in the currently used ChargingSchedule. +
     * 2: The number of phases provided via device management.
     */
    @Optional
    private Integer numberOfPhasesUsed;
    /**
     * The maximum current of the connected cable in Ampere (A).
     */
    @Optional
    private Integer cableMaxCurrent;
    /**
     * This contains the Id of the reservation that terminates as a result of this transaction.
     */
    @Optional
    private Integer reservationId;
    /**
     * *(2.1)* The current preconditioning status of the BMS in the EV. Default value is Unknown.
     */
    @Optional
    private PreconditioningStatusEnum preconditioningStatus;
    /**
     * *(2.1)* True when EVSE electronics are in sleep mode for this transaction. Default value (when absent) is false.
     */
    @Optional
    private Boolean evseSleep;
    /**
     * (Required)
     */
    @Required
    private Transaction transactionInfo;
    /**
     * Electric Vehicle Supply Equipment
     */
    @Optional
    private EVSE evse;
    /**
     * Contains a case insensitive identifier to use for the authorization and the type of authorization to support multiple forms of identifiers.
     */
    @Optional
    private IdToken idToken;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public TransactionEventRequest() {
    }

    /**
     * @param evseSleep          *(2.1)* True when EVSE electronics are in sleep mode for this transaction. Default value (when absent) is false.
     *                           <p>
     *                           .
     * @param offline            Indication that this transaction event happened when the Charging Station was offline. Default = false, meaning: the event occurred when the Charging Station was online.
     *                           .
     * @param seqNo              Incremental sequence number, helps with determining if all messages of a transaction have been received.
     *                           .
     * @param reservationId      This contains the Id of the reservation that terminates as a result of this transaction.
     *                           .
     * @param cableMaxCurrent    The maximum current of the connected cable in Ampere (A).
     *                           .
     * @param numberOfPhasesUsed If the Charging Station is able to report the number of phases used, then it SHALL provide it.
     *                           When omitted the CSMS may be able to determine the number of phases used as follows: +
     *                           1: The numberPhases in the currently used ChargingSchedule. +
     *                           2: The number of phases provided via device management.
     *                           .
     * @param timestamp          The date and time at which this transaction event occurred.
     *                           .
     */
    public TransactionEventRequest(CostDetails costDetails, TransactionEventEnum eventType, List<MeterValue> meterValue, Date timestamp, TriggerReasonEnum triggerReason, Integer seqNo, Boolean offline, Integer numberOfPhasesUsed, Integer cableMaxCurrent, Integer reservationId, PreconditioningStatusEnum preconditioningStatus, Boolean evseSleep, Transaction transactionInfo, EVSE evse, IdToken idToken, CustomData customData) {
        super();
        this.costDetails = costDetails;
        this.eventType = eventType;
        this.meterValue = meterValue;
        this.timestamp = timestamp;
        this.triggerReason = triggerReason;
        this.seqNo = seqNo;
        this.offline = offline;
        this.numberOfPhasesUsed = numberOfPhasesUsed;
        this.cableMaxCurrent = cableMaxCurrent;
        this.reservationId = reservationId;
        this.preconditioningStatus = preconditioningStatus;
        this.evseSleep = evseSleep;
        this.transactionInfo = transactionInfo;
        this.evse = evse;
        this.idToken = idToken;
        this.customData = customData;
    }

    /**
     * CostDetailsType contains the cost as calculated by Charging Station based on provided TariffType.
     * <p>
     * NOTE: Reservation is not shown as a _chargingPeriod_, because it took place outside of the transaction.
     */
    public CostDetails getCostDetails() {
        return costDetails;
    }

    /**
     * CostDetailsType contains the cost as calculated by Charging Station based on provided TariffType.
     * <p>
     * NOTE: Reservation is not shown as a _chargingPeriod_, because it took place outside of the transaction.
     */
    public void setCostDetails(CostDetails costDetails) {
        this.costDetails = costDetails;
    }

    /**
     * This contains the type of this event.
     * The first TransactionEvent of a transaction SHALL contain: "Started" The last TransactionEvent of a transaction SHALL contain: "Ended" All others SHALL contain: "Updated"
     * <p>
     * (Required)
     */
    public TransactionEventEnum getEventType() {
        return eventType;
    }

    /**
     * This contains the type of this event.
     * The first TransactionEvent of a transaction SHALL contain: "Started" The last TransactionEvent of a transaction SHALL contain: "Ended" All others SHALL contain: "Updated"
     * <p>
     * (Required)
     */
    public void setEventType(TransactionEventEnum eventType) {
        this.eventType = eventType;
    }

    public List<MeterValue> getMeterValue() {
        return meterValue;
    }

    public void setMeterValue(List<MeterValue> meterValue) {
        this.meterValue = meterValue;
    }

    /**
     * The date and time at which this transaction event occurred.
     * <p>
     * (Required)
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
     * The date and time at which this transaction event occurred.
     * <p>
     * (Required)
     */
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Reason the Charging Station sends this message to the CSMS
     * <p>
     * (Required)
     */
    public TriggerReasonEnum getTriggerReason() {
        return triggerReason;
    }

    /**
     * Reason the Charging Station sends this message to the CSMS
     * <p>
     * (Required)
     */
    public void setTriggerReason(TriggerReasonEnum triggerReason) {
        this.triggerReason = triggerReason;
    }

    /**
     * Incremental sequence number, helps with determining if all messages of a transaction have been received.
     * <p>
     * (Required)
     */
    public Integer getSeqNo() {
        return seqNo;
    }

    /**
     * Incremental sequence number, helps with determining if all messages of a transaction have been received.
     * <p>
     * (Required)
     */
    public void setSeqNo(Integer seqNo) {
        this.seqNo = seqNo;
    }

    /**
     * Indication that this transaction event happened when the Charging Station was offline. Default = false, meaning: the event occurred when the Charging Station was online.
     */
    public Boolean getOffline() {
        return offline;
    }

    /**
     * Indication that this transaction event happened when the Charging Station was offline. Default = false, meaning: the event occurred when the Charging Station was online.
     */
    public void setOffline(Boolean offline) {
        this.offline = offline;
    }

    /**
     * If the Charging Station is able to report the number of phases used, then it SHALL provide it.
     * When omitted the CSMS may be able to determine the number of phases used as follows: +
     * 1: The numberPhases in the currently used ChargingSchedule. +
     * 2: The number of phases provided via device management.
     */
    public Integer getNumberOfPhasesUsed() {
        return numberOfPhasesUsed;
    }

    /**
     * If the Charging Station is able to report the number of phases used, then it SHALL provide it.
     * When omitted the CSMS may be able to determine the number of phases used as follows: +
     * 1: The numberPhases in the currently used ChargingSchedule. +
     * 2: The number of phases provided via device management.
     */
    public void setNumberOfPhasesUsed(Integer numberOfPhasesUsed) {
        this.numberOfPhasesUsed = numberOfPhasesUsed;
    }

    /**
     * The maximum current of the connected cable in Ampere (A).
     */
    public Integer getCableMaxCurrent() {
        return cableMaxCurrent;
    }

    /**
     * The maximum current of the connected cable in Ampere (A).
     */
    public void setCableMaxCurrent(Integer cableMaxCurrent) {
        this.cableMaxCurrent = cableMaxCurrent;
    }

    /**
     * This contains the Id of the reservation that terminates as a result of this transaction.
     */
    public Integer getReservationId() {
        return reservationId;
    }

    /**
     * This contains the Id of the reservation that terminates as a result of this transaction.
     */
    public void setReservationId(Integer reservationId) {
        this.reservationId = reservationId;
    }

    /**
     * *(2.1)* The current preconditioning status of the BMS in the EV. Default value is Unknown.
     */
    public PreconditioningStatusEnum getPreconditioningStatus() {
        return preconditioningStatus;
    }

    /**
     * *(2.1)* The current preconditioning status of the BMS in the EV. Default value is Unknown.
     */
    public void setPreconditioningStatus(PreconditioningStatusEnum preconditioningStatus) {
        this.preconditioningStatus = preconditioningStatus;
    }

    /**
     * *(2.1)* True when EVSE electronics are in sleep mode for this transaction. Default value (when absent) is false.
     */
    public Boolean getEvseSleep() {
        return evseSleep;
    }

    /**
     * *(2.1)* True when EVSE electronics are in sleep mode for this transaction. Default value (when absent) is false.
     */
    public void setEvseSleep(Boolean evseSleep) {
        this.evseSleep = evseSleep;
    }

    /**
     * (Required)
     */
    public Transaction getTransactionInfo() {
        return transactionInfo;
    }

    /**
     * (Required)
     */
    public void setTransactionInfo(Transaction transactionInfo) {
        this.transactionInfo = transactionInfo;
    }

    /**
     * Electric Vehicle Supply Equipment
     */
    public EVSE getEvse() {
        return evse;
    }

    /**
     * Electric Vehicle Supply Equipment
     */
    public void setEvse(EVSE evse) {
        this.evse = evse;
    }

    /**
     * Contains a case insensitive identifier to use for the authorization and the type of authorization to support multiple forms of identifiers.
     */
    public IdToken getIdToken() {
        return idToken;
    }

    /**
     * Contains a case insensitive identifier to use for the authorization and the type of authorization to support multiple forms of identifiers.
     */
    public void setIdToken(IdToken idToken) {
        this.idToken = idToken;
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
        if (!(obj instanceof TransactionEventRequest))
            return false;
        TransactionEventRequest that = (TransactionEventRequest) obj;
        return Objects.equals(this.preconditioningStatus, that.preconditioningStatus)
                && Objects.equals(this.evseSleep, that.evseSleep)
                && Objects.equals(this.seqNo, that.seqNo)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.eventType, that.eventType)
                && Objects.equals(this.evse, that.evse)
                && Objects.equals(this.transactionInfo, that.transactionInfo)
                && Objects.equals(this.offline, that.offline)
                && Objects.equals(this.reservationId, that.reservationId)
                && Objects.equals(this.costDetails, that.costDetails)
                && Objects.equals(this.triggerReason, that.triggerReason)
                && Objects.equals(this.idToken, that.idToken)
                && Objects.equals(this.meterValue, that.meterValue)
                && Objects.equals(this.cableMaxCurrent, that.cableMaxCurrent)
                && Objects.equals(this.numberOfPhasesUsed, that.numberOfPhasesUsed)
                && Objects.equals(this.timestamp, that.timestamp);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.preconditioningStatus != null ? this.preconditioningStatus.hashCode() : 0);
        result = 31 * result + (this.evseSleep != null ? this.evseSleep.hashCode() : 0);
        result = 31 * result + (this.seqNo != null ? this.seqNo.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.eventType != null ? this.eventType.hashCode() : 0);
        result = 31 * result + (this.evse != null ? this.evse.hashCode() : 0);
        result = 31 * result + (this.transactionInfo != null ? this.transactionInfo.hashCode() : 0);
        result = 31 * result + (this.offline != null ? this.offline.hashCode() : 0);
        result = 31 * result + (this.reservationId != null ? this.reservationId.hashCode() : 0);
        result = 31 * result + (this.costDetails != null ? this.costDetails.hashCode() : 0);
        result = 31 * result + (this.triggerReason != null ? this.triggerReason.hashCode() : 0);
        result = 31 * result + (this.idToken != null ? this.idToken.hashCode() : 0);
        result = 31 * result + (this.meterValue != null ? this.meterValue.hashCode() : 0);
        result = 31 * result + (this.cableMaxCurrent != null ? this.cableMaxCurrent.hashCode() : 0);
        result = 31 * result + (this.numberOfPhasesUsed != null ? this.numberOfPhasesUsed.hashCode() : 0);
        result = 31 * result + (this.timestamp != null ? this.timestamp.hashCode() : 0);
        return result;
    }
}
