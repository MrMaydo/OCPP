package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.Enumerations.ChargingStateEnum;
import maydo.ocpp.msgDef.Enumerations.OperationModeEnum;
import maydo.ocpp.msgDef.Enumerations.ReasonEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 *
 */
public class Transaction implements JsonInterface {

    /**
     * This contains the Id of the transaction.
     */
    @Required
    private String transactionId;

    /**
     * Current charging state, is required when state has changed.
     * Omitted when there is no communication between EVSE and EV, because no cable is plugged in.
     */
    @Optional
    private ChargingStateEnum chargingState;

    /**
     * Contains the total time that energy flowed from EVSE to EV during the transaction (in seconds).
     * Note that timeSpentCharging is smaller or equal to the duration of the transaction.
     */
    @Optional
    private Integer timeSpentCharging;

    /**
     * The stoppedReason is the reason/event that initiated the process of stopping the transaction.
     * It will normally be the user stopping authorization via card (Local or MasterPass) or app (Remote),
     * but it can also be CSMS revoking authorization (DeAuthorized),
     * or disconnecting the EV when TxStopPoint = EVConnected (EVDisconnected).
     * Most other reasons are related to technical faults or energy limitations.
     * MAY only be omitted when stoppedReason is "Local"
     */
    @Optional
    private ReasonEnum stoppedReason;

    /**
     * The ID given to remote start request (RequestStartTransactionRequest.
     * This enables to CSMS to match the started transaction to the given start request.
     */
    @Optional
    private Integer remoteStartId;

    /**
     * (2.1) The operationMode that is currently in effect for the transaction.
     */
    @Optional
    private OperationModeEnum operationMode;

    /**
     * (2.1) Id of tariff in use for transaction
     */
    @Optional
    private String tariffId;

    /**
     * (2.1) Maximum cost/energy/time allowed for this transaction.
     */
    @Optional
    private TransactionLimit transactionLimit;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public Transaction() {
    }


    public String getTransactionId() {
        return transactionId;
    }


    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }


    public ChargingStateEnum getChargingState() {
        return chargingState;
    }


    public void setChargingState(ChargingStateEnum chargingState) {
        this.chargingState = chargingState;
    }


    public Integer getTimeSpentCharging() {
        return timeSpentCharging;
    }


    public void setTimeSpentCharging(Integer timeSpentCharging) {
        this.timeSpentCharging = timeSpentCharging;
    }


    public ReasonEnum getStoppedReason() {
        return stoppedReason;
    }


    public void setStoppedReason(ReasonEnum stoppedReason) {
        this.stoppedReason = stoppedReason;
    }


    public Integer getRemoteStartId() {
        return remoteStartId;
    }


    public void setRemoteStartId(Integer remoteStartId) {
        this.remoteStartId = remoteStartId;
    }


    public OperationModeEnum getOperationMode() {
        return operationMode;
    }


    public void setOperationMode(OperationModeEnum operationMode) {
        this.operationMode = operationMode;
    }


    public String getTariffId() {
        return tariffId;
    }


    public void setTariffId(String tariffId) {
        this.tariffId = tariffId;
    }


    public TransactionLimit getTransactionLimit() {
        return transactionLimit;
    }


    public void setTransactionLimit(TransactionLimit transactionLimit) {
        this.transactionLimit = transactionLimit;
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
        json.addProperty("transactionId", transactionId);
        json.addProperty("chargingState", chargingState.toString());
        json.addProperty("timeSpentCharging", timeSpentCharging);
        json.addProperty("stoppedReason", stoppedReason.toString());
        json.addProperty("remoteStartId", remoteStartId);
        json.addProperty("operationMode", operationMode.toString());
        json.addProperty("tariffId", tariffId);
        json.add("transactionLimit", transactionLimit.toJsonObject());
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
        if (jsonObject.has("transactionId")) {
            this.transactionId = jsonObject.get("transactionId").getAsString();
        }

        if (jsonObject.has("chargingState")) {
            this.chargingState = ChargingStateEnum.valueOf(jsonObject.get("chargingState").getAsString());
        }

        if (jsonObject.has("timeSpentCharging")) {
            this.timeSpentCharging = jsonObject.get("timeSpentCharging").getAsInt();
        }

        if (jsonObject.has("stoppedReason")) {
            this.stoppedReason = ReasonEnum.valueOf(jsonObject.get("stoppedReason").getAsString());
        }

        if (jsonObject.has("remoteStartId")) {
            this.remoteStartId = jsonObject.get("remoteStartId").getAsInt();
        }

        if (jsonObject.has("operationMode")) {
            this.operationMode = OperationModeEnum.valueOf(jsonObject.get("operationMode").getAsString());
        }

        if (jsonObject.has("tariffId")) {
            this.tariffId = jsonObject.get("tariffId").getAsString();
        }

        if (jsonObject.has("transactionLimit")) {
            this.transactionLimit = new TransactionLimit();
            this.transactionLimit.fromJsonObject(jsonObject.getAsJsonObject("transactionLimit"));
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
        if (!(obj instanceof Transaction))
            return false;
        Transaction that = (Transaction) obj;
        return Objects.equals(this.operationMode, that.operationMode)
                && Objects.equals(this.remoteStartId, that.remoteStartId)
                && Objects.equals(this.stoppedReason, that.stoppedReason)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.tariffId, that.tariffId)
                && Objects.equals(this.transactionLimit, that.transactionLimit)
                && Objects.equals(this.transactionId, that.transactionId)
                && Objects.equals(this.timeSpentCharging, that.timeSpentCharging)
                && Objects.equals(this.chargingState, that.chargingState);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.operationMode != null ? this.operationMode.hashCode() : 0);
        result = 31 * result + (this.remoteStartId != null ? this.remoteStartId.hashCode() : 0);
        result = 31 * result + (this.stoppedReason != null ? this.stoppedReason.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.tariffId != null ? this.tariffId.hashCode() : 0);
        result = 31 * result + (this.transactionLimit != null ? this.transactionLimit.hashCode() : 0);
        result = 31 * result + (this.transactionId != null ? this.transactionId.hashCode() : 0);
        result = 31 * result + (this.timeSpentCharging != null ? this.timeSpentCharging.hashCode() : 0);
        result = 31 * result + (this.chargingState != null ? this.chargingState.hashCode() : 0);
        return result;
    }
}
