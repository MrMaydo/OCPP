
package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.Enumerations.ChargingStateEnum;
import maydo.ocpp.msgDef.Enumerations.ReasonEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.utils.JsonTools;

import javax.annotation.Generated;


/**
 * Transaction
 * urn:x-oca:ocpp:uid:2:233318
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class Transaction implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * This contains the Id of the transaction.
     * 
     * (Required)
     * 
     */
    private String transactionId;
    /**
     * Transaction. State. Transaction_ State_ Code
     * urn:x-oca:ocpp:uid:1:569419
     * Current charging state, is required when state
     * has changed.
     * 
     * 
     */
    private ChargingStateEnum chargingState;
    /**
     * Transaction. Time_ Spent_ Charging. Elapsed_ Time
     * urn:x-oca:ocpp:uid:1:569415
     * Contains the total time that energy flowed from EVSE to EV during the transaction (in seconds). Note that timeSpentCharging is smaller or equal to the duration of the transaction.
     * 
     * 
     */
    private Integer timeSpentCharging;
    /**
     * Transaction. Stopped_ Reason. EOT_ Reason_ Code
     * urn:x-oca:ocpp:uid:1:569413
     * This contains the reason why the transaction was stopped. MAY only be omitted when Reason is "Local".
     * 
     * 
     */
    private ReasonEnum stoppedReason;
    /**
     * The ID given to remote start request (&lt;&lt;requeststarttransactionrequest, RequestStartTransactionRequest&gt;&gt;. This enables to CSMS to match the started transaction to the given start request.
     * 
     * 
     */
    private Integer remoteStartId;

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
     * This contains the Id of the transaction.
     * 
     * (Required)
     * 
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * This contains the Id of the transaction.
     * 
     * (Required)
     * 
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * Transaction. State. Transaction_ State_ Code
     * urn:x-oca:ocpp:uid:1:569419
     * Current charging state, is required when state
     * has changed.
     * 
     * 
     */
    public ChargingStateEnum getChargingState() {
        return chargingState;
    }

    /**
     * Transaction. State. Transaction_ State_ Code
     * urn:x-oca:ocpp:uid:1:569419
     * Current charging state, is required when state
     * has changed.
     * 
     * 
     */
    public void setChargingState(ChargingStateEnum chargingState) {
        this.chargingState = chargingState;
    }

    /**
     * Transaction. Time_ Spent_ Charging. Elapsed_ Time
     * urn:x-oca:ocpp:uid:1:569415
     * Contains the total time that energy flowed from EVSE to EV during the transaction (in seconds). Note that timeSpentCharging is smaller or equal to the duration of the transaction.
     * 
     * 
     */
    public Integer getTimeSpentCharging() {
        return timeSpentCharging;
    }

    /**
     * Transaction. Time_ Spent_ Charging. Elapsed_ Time
     * urn:x-oca:ocpp:uid:1:569415
     * Contains the total time that energy flowed from EVSE to EV during the transaction (in seconds). Note that timeSpentCharging is smaller or equal to the duration of the transaction.
     * 
     * 
     */
    public void setTimeSpentCharging(Integer timeSpentCharging) {
        this.timeSpentCharging = timeSpentCharging;
    }

    /**
     * Transaction. Stopped_ Reason. EOT_ Reason_ Code
     * urn:x-oca:ocpp:uid:1:569413
     * This contains the reason why the transaction was stopped. MAY only be omitted when Reason is "Local".
     * 
     * 
     */
    public ReasonEnum getStoppedReason() {
        return stoppedReason;
    }

    /**
     * Transaction. Stopped_ Reason. EOT_ Reason_ Code
     * urn:x-oca:ocpp:uid:1:569413
     * This contains the reason why the transaction was stopped. MAY only be omitted when Reason is "Local".
     * 
     * 
     */
    public void setStoppedReason(ReasonEnum stoppedReason) {
        this.stoppedReason = stoppedReason;
    }

    /**
     * The ID given to remote start request (&lt;&lt;requeststarttransactionrequest, RequestStartTransactionRequest&gt;&gt;. This enables to CSMS to match the started transaction to the given start request.
     * 
     * 
     */
    public Integer getRemoteStartId() {
        return remoteStartId;
    }

    /**
     * The ID given to remote start request (&lt;&lt;requeststarttransactionrequest, RequestStartTransactionRequest&gt;&gt;. This enables to CSMS to match the started transaction to the given start request.
     * 
     * 
     */
    public void setRemoteStartId(Integer remoteStartId) {
        this.remoteStartId = remoteStartId;
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
