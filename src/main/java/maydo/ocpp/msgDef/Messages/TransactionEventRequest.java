
package maydo.ocpp.msgDef.Messages;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.*;
import maydo.ocpp.msgDef.Enumerations.TransactionEventEnum;
import maydo.ocpp.msgDef.Enumerations.TriggerReasonEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.utils.JsonTools;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.annotation.Generated;

import static maydo.ocpp.config.Configuration.DATE_FORMAT;

@Generated("jsonschema2pojo")
public class TransactionEventRequest implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * This contains the type of this event.
     * The first TransactionEvent of a transaction SHALL contain: "Started" The last TransactionEvent of a transaction SHALL contain: "Ended" All others SHALL contain: "Updated"
     * 
     * (Required)
     * 
     */
    private TransactionEventEnum eventType;
    private List<MeterValue> meterValue = null;
    /**
     * The date and time at which this transaction event occurred.
     * 
     * (Required)
     * 
     */
    private Date timestamp;
    /**
     * Reason the Charging Station sends this message to the CSMS
     * 
     * (Required)
     * 
     */
    private TriggerReasonEnum triggerReason;
    /**
     * Incremental sequence number, helps with determining if all messages of a transaction have been received.
     * 
     * (Required)
     * 
     */
    private Integer seqNo;
    /**
     * Indication that this transaction event happened when the Charging Station was offline. Default = false, meaning: the event occurred when the Charging Station was online.
     * 
     * 
     */
    private Boolean offline = false;
    /**
     * If the Charging Station is able to report the number of phases used, then it SHALL provide it. When omitted the CSMS may be able to determine the number of phases used via device management.
     * 
     * 
     */
    private Integer numberOfPhasesUsed;
    /**
     * The maximum current of the connected cable in Ampere (A).
     * 
     * 
     */
    private Integer cableMaxCurrent;
    /**
     * This contains the Id of the reservation that terminates as a result of this transaction.
     * 
     * 
     */
    private Integer reservationId;
    /**
     * Transaction
     * urn:x-oca:ocpp:uid:2:233318
     * 
     * (Required)
     * 
     */
    private Transaction transactionInfo;
    /**
     * EVSE
     * urn:x-oca:ocpp:uid:2:233123
     * Electric Vehicle Supply Equipment
     * 
     * 
     */
    private EVSE evse;
    /**
     * Contains a case insensitive identifier to use for the authorization and the type of authorization to support multiple forms of identifiers.
     * 
     * 
     */
    private IdToken idToken;

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    public CustomData getCustomData() {
        return customData;
    }

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    public void setCustomData(CustomData customData) {
        this.customData = customData;
    }

    /**
     * This contains the type of this event.
     * The first TransactionEvent of a transaction SHALL contain: "Started" The last TransactionEvent of a transaction SHALL contain: "Ended" All others SHALL contain: "Updated"
     * 
     * (Required)
     * 
     */
    public TransactionEventEnum getEventType() {
        return eventType;
    }

    /**
     * This contains the type of this event.
     * The first TransactionEvent of a transaction SHALL contain: "Started" The last TransactionEvent of a transaction SHALL contain: "Ended" All others SHALL contain: "Updated"
     * 
     * (Required)
     * 
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
     * 
     * (Required)
     * 
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
     * The date and time at which this transaction event occurred.
     * 
     * (Required)
     * 
     */
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Reason the Charging Station sends this message to the CSMS
     * 
     * (Required)
     * 
     */
    public TriggerReasonEnum getTriggerReason() {
        return triggerReason;
    }

    /**
     * Reason the Charging Station sends this message to the CSMS
     * 
     * (Required)
     * 
     */
    public void setTriggerReason(TriggerReasonEnum triggerReason) {
        this.triggerReason = triggerReason;
    }

    /**
     * Incremental sequence number, helps with determining if all messages of a transaction have been received.
     * 
     * (Required)
     * 
     */
    public Integer getSeqNo() {
        return seqNo;
    }

    /**
     * Incremental sequence number, helps with determining if all messages of a transaction have been received.
     * 
     * (Required)
     * 
     */
    public void setSeqNo(Integer seqNo) {
        this.seqNo = seqNo;
    }

    /**
     * Indication that this transaction event happened when the Charging Station was offline. Default = false, meaning: the event occurred when the Charging Station was online.
     * 
     * 
     */
    public Boolean getOffline() {
        return offline;
    }

    /**
     * Indication that this transaction event happened when the Charging Station was offline. Default = false, meaning: the event occurred when the Charging Station was online.
     * 
     * 
     */
    public void setOffline(Boolean offline) {
        this.offline = offline;
    }

    /**
     * If the Charging Station is able to report the number of phases used, then it SHALL provide it. When omitted the CSMS may be able to determine the number of phases used via device management.
     * 
     * 
     */
    public Integer getNumberOfPhasesUsed() {
        return numberOfPhasesUsed;
    }

    /**
     * If the Charging Station is able to report the number of phases used, then it SHALL provide it. When omitted the CSMS may be able to determine the number of phases used via device management.
     * 
     * 
     */
    public void setNumberOfPhasesUsed(Integer numberOfPhasesUsed) {
        this.numberOfPhasesUsed = numberOfPhasesUsed;
    }

    /**
     * The maximum current of the connected cable in Ampere (A).
     * 
     * 
     */
    public Integer getCableMaxCurrent() {
        return cableMaxCurrent;
    }

    /**
     * The maximum current of the connected cable in Ampere (A).
     * 
     * 
     */
    public void setCableMaxCurrent(Integer cableMaxCurrent) {
        this.cableMaxCurrent = cableMaxCurrent;
    }

    /**
     * This contains the Id of the reservation that terminates as a result of this transaction.
     * 
     * 
     */
    public Integer getReservationId() {
        return reservationId;
    }

    /**
     * This contains the Id of the reservation that terminates as a result of this transaction.
     * 
     * 
     */
    public void setReservationId(Integer reservationId) {
        this.reservationId = reservationId;
    }

    /**
     * Transaction
     * urn:x-oca:ocpp:uid:2:233318
     * 
     * (Required)
     * 
     */
    public Transaction getTransactionInfo() {
        return transactionInfo;
    }

    /**
     * Transaction
     * urn:x-oca:ocpp:uid:2:233318
     * 
     * (Required)
     * 
     */
    public void setTransactionInfo(Transaction transactionInfo) {
        this.transactionInfo = transactionInfo;
    }

    /**
     * EVSE
     * urn:x-oca:ocpp:uid:2:233123
     * Electric Vehicle Supply Equipment
     * 
     * 
     */
    public EVSE getEvse() {
        return evse;
    }

    /**
     * EVSE
     * urn:x-oca:ocpp:uid:2:233123
     * Electric Vehicle Supply Equipment
     * 
     * 
     */
    public void setEvse(EVSE evse) {
        this.evse = evse;
    }

    /**
     * Contains a case insensitive identifier to use for the authorization and the type of authorization to support multiple forms of identifiers.
     * 
     * 
     */
    public IdToken getIdToken() {
        return idToken;
    }

    /**
     * Contains a case insensitive identifier to use for the authorization and the type of authorization to support multiple forms of identifiers.
     * 
     * 
     */
    public void setIdToken(IdToken idToken) {
        this.idToken = idToken;
    }

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject(){
        return JsonTools.toJsonObject(this);
    }
}
