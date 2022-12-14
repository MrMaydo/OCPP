package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.*;
import maydo.ocpp.msgDef.Enumerations.TransactionEventEnum;
import maydo.ocpp.msgDef.Enumerations.TriggerReasonEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class TransactionEventRequest implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
    /**
     * This contains the type of this event.
     * The first TransactionEvent of a transaction SHALL contain: "Started" The last TransactionEvent of a transaction SHALL contain: "Ended" All others SHALL contain: "Updated"
     * <p>
     * (Required)
     */
    @Required
    private TransactionEventEnum eventType;

    @Optional
    private List<MeterValue> meterValue = null;
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
     * If the Charging Station is able to report the number of phases used, then it SHALL provide it. When omitted the CSMS may be able to determine the number of phases used via device management.
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
     * Transaction
     * urn:x-oca:ocpp:uid:2:233318
     * <p>
     * (Required)
     */
    @Required
    private Transaction transactionInfo;
    /**
     * EVSE
     * urn:x-oca:ocpp:uid:2:233123
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
     * If the Charging Station is able to report the number of phases used, then it SHALL provide it. When omitted the CSMS may be able to determine the number of phases used via device management.
     */
    public Integer getNumberOfPhasesUsed() {
        return numberOfPhasesUsed;
    }

    /**
     * If the Charging Station is able to report the number of phases used, then it SHALL provide it. When omitted the CSMS may be able to determine the number of phases used via device management.
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
     * Transaction
     * urn:x-oca:ocpp:uid:2:233318
     * <p>
     * (Required)
     */
    public Transaction getTransactionInfo() {
        return transactionInfo;
    }

    /**
     * Transaction
     * urn:x-oca:ocpp:uid:2:233318
     * <p>
     * (Required)
     */
    public void setTransactionInfo(Transaction transactionInfo) {
        this.transactionInfo = transactionInfo;
    }

    /**
     * EVSE
     * urn:x-oca:ocpp:uid:2:233123
     * Electric Vehicle Supply Equipment
     */
    public EVSE getEvse() {
        return evse;
    }

    /**
     * EVSE
     * urn:x-oca:ocpp:uid:2:233123
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

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject() {
        return JsonTools.toJsonObject(this);
    }

    @Override
    public void fromString(String jsonString) {
        JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
        fromJsonObject(jsonObject);
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        JsonTools.fromJsonObject(this, jsonObject);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof TransactionEventRequest))
            return false;
        TransactionEventRequest that = (TransactionEventRequest) obj;
        return Objects.equals(customData, that.customData)
                && eventType == that.eventType
                && Objects.equals(meterValue, that.meterValue)
                && Objects.equals(timestamp, that.timestamp)
                && triggerReason == that.triggerReason
                && Objects.equals(seqNo, that.seqNo)
                && Objects.equals(offline, that.offline)
                && Objects.equals(numberOfPhasesUsed, that.numberOfPhasesUsed)
                && Objects.equals(cableMaxCurrent, that.cableMaxCurrent)
                && Objects.equals(reservationId, that.reservationId)
                && Objects.equals(transactionInfo, that.transactionInfo)
                && Objects.equals(evse, that.evse)
                && Objects.equals(idToken, that.idToken);
    }

    @Override
    public int hashCode() {
        int result = (eventType != null ? eventType.hashCode() : 0);
        result = 31 * result + (meterValue != null ? meterValue.hashCode() : 0);
        result = 31 * result + (timestamp != null ? timestamp.hashCode() : 0);
        result = 31 * result + (triggerReason != null ? triggerReason.hashCode() : 0);
        result = 31 * result + (seqNo != null ? seqNo.hashCode() : 0);
        result = 31 * result + (offline != null ? offline.hashCode() : 0);
        result = 31 * result + (numberOfPhasesUsed != null ? numberOfPhasesUsed.hashCode() : 0);
        result = 31 * result + (cableMaxCurrent != null ? cableMaxCurrent.hashCode() : 0);
        result = 31 * result + (reservationId != null ? reservationId.hashCode() : 0);
        result = 31 * result + (transactionInfo != null ? transactionInfo.hashCode() : 0);
        result = 31 * result + (evse != null ? evse.hashCode() : 0);
        result = 31 * result + (idToken != null ? idToken.hashCode() : 0);
        result = 31 * result + (customData != null ? customData.hashCode() : 0);
        return result;
    }
}
