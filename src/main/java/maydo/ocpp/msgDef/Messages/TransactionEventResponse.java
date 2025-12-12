package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.IdTokenInfo;
import maydo.ocpp.msgDef.DataTypes.MessageContent;
import maydo.ocpp.msgDef.DataTypes.TransactionLimit;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;

import java.util.List;
import java.util.Objects;

/**
 * This contains the field definition of the TransactionEventResponse PDU sent by
 * the CSMS to the Charging Station in response to a TransactionEventRequest.
 */
public class TransactionEventResponse implements JsonInterface {

    /**
     * When eventType of TransactionEventRequest is Updated, then this value contains the running cost.
     * When eventType of TransactionEventRequest is Ended,
     * then this contains the final total cost of this transaction, including taxes, in the currency configured
     * with the Configuration Variable: Currency. Absence of this value does not imply that the transaction was free.
     * To indicate a free transaction, the CSMS SHALL send a value of 0.00.
     */
    @Optional
    private Float totalCost;

    /**
     * Priority from a business point of view.
     * Default priority is 0,
     * The range is from -9 to 9. Higher values indicate a higher priority.
     * The chargingPriority in TransactionEventResponse is temporarily, so it may not be set in the IdTokenInfoType afterwards.
     * Also the chargingPriority in TransactionEventResponse has a higher priority than the one in IdTokenInfoType.
     */
    @Optional
    private Integer chargingPriority;

    /**
     * This contains information about authorization status, expiry and group id.
     * Is required when the transactionEventRequest contained an idToken.
     */
    @Optional
    private IdTokenInfo idTokenInfo;

    /**
     * (2.1) Maximum cost/energy/time limit allowed for this transaction.
     */
    @Optional
    private TransactionLimit transactionLimit;

    /**
     * This can contain updated personal message that can be shown to the EV Driver.
     * This can be used to provide updated tariff information.
     */
    @Optional
    private MessageContent updatedPersonalMessage;

    /**
     * (2.1) Additional languages besides the default language in updatedPersonalMessage.
     */
    @Optional
    private List<MessageContent> updatedPersonalMessageExtra;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public TransactionEventResponse() {
    }


    public Float getTotalCost() {
        return totalCost;
    }


    public void setTotalCost(Float totalCost) {
        this.totalCost = totalCost;
    }


    public Integer getChargingPriority() {
        return chargingPriority;
    }


    public void setChargingPriority(Integer chargingPriority) {
        this.chargingPriority = chargingPriority;
    }


    public IdTokenInfo getIdTokenInfo() {
        return idTokenInfo;
    }


    public void setIdTokenInfo(IdTokenInfo idTokenInfo) {
        this.idTokenInfo = idTokenInfo;
    }


    public TransactionLimit getTransactionLimit() {
        return transactionLimit;
    }


    public void setTransactionLimit(TransactionLimit transactionLimit) {
        this.transactionLimit = transactionLimit;
    }


    public MessageContent getUpdatedPersonalMessage() {
        return updatedPersonalMessage;
    }


    public void setUpdatedPersonalMessage(MessageContent updatedPersonalMessage) {
        this.updatedPersonalMessage = updatedPersonalMessage;
    }

    public List<MessageContent> getUpdatedPersonalMessageExtra() {
        return updatedPersonalMessageExtra;
    }

    public void setUpdatedPersonalMessageExtra(List<MessageContent> updatedPersonalMessageExtra) {
        this.updatedPersonalMessageExtra = updatedPersonalMessageExtra;
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
        json.addProperty("totalCost", totalCost);
        json.addProperty("chargingPriority", chargingPriority);
        json.add("idTokenInfo", idTokenInfo.toJsonObject());
        json.add("transactionLimit", transactionLimit.toJsonObject());
        json.add("updatedPersonalMessage", updatedPersonalMessage.toJsonObject());
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
        if (jsonObject.has("totalCost")) {
            this.totalCost = jsonObject.get("totalCost").getAsFloat();
        }

        if (jsonObject.has("chargingPriority")) {
            this.chargingPriority = jsonObject.get("chargingPriority").getAsInt();
        }

        if (jsonObject.has("idTokenInfo")) {
            this.idTokenInfo = new IdTokenInfo();
            this.idTokenInfo.fromJsonObject(jsonObject.getAsJsonObject("idTokenInfo"));
        }

        if (jsonObject.has("transactionLimit")) {
            this.transactionLimit = new TransactionLimit();
            this.transactionLimit.fromJsonObject(jsonObject.getAsJsonObject("transactionLimit"));
        }

        if (jsonObject.has("updatedPersonalMessage")) {
            this.updatedPersonalMessage = new MessageContent();
            this.updatedPersonalMessage.fromJsonObject(jsonObject.getAsJsonObject("updatedPersonalMessage"));
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
        if (!(obj instanceof TransactionEventResponse))
            return false;
        TransactionEventResponse that = (TransactionEventResponse) obj;
        return Objects.equals(this.idTokenInfo, that.idTokenInfo)
                && Objects.equals(this.updatedPersonalMessageExtra, that.updatedPersonalMessageExtra)
                && Objects.equals(this.updatedPersonalMessage, that.updatedPersonalMessage)
                && Objects.equals(this.chargingPriority, that.chargingPriority)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.transactionLimit, that.transactionLimit)
                && Objects.equals(this.totalCost, that.totalCost);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.idTokenInfo != null ? this.idTokenInfo.hashCode() : 0);
        result = 31 * result + (this.updatedPersonalMessageExtra != null ? this.updatedPersonalMessageExtra.hashCode() : 0);
        result = 31 * result + (this.updatedPersonalMessage != null ? this.updatedPersonalMessage.hashCode() : 0);
        result = 31 * result + (this.chargingPriority != null ? this.chargingPriority.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.transactionLimit != null ? this.transactionLimit.hashCode() : 0);
        result = 31 * result + (this.totalCost != null ? this.totalCost.hashCode() : 0);
        return result;
    }
}
