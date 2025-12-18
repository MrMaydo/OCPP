package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.IdTokenInfo;
import maydo.ocpp.msgDef.DataTypes.MessageContent;
import maydo.ocpp.msgDef.DataTypes.TransactionLimit;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;

import java.util.ArrayList;
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

        if (getTotalCost() != null) {
            json.addProperty("totalCost", getTotalCost());
        }
        if (getChargingPriority() != null) {
            json.addProperty("chargingPriority", getChargingPriority());
        }
        if (getIdTokenInfo() != null) {
            json.add("idTokenInfo", getIdTokenInfo().toJsonObject());
        }
        if (getTransactionLimit() != null) {
            json.add("transactionLimit", getTransactionLimit().toJsonObject());
        }
        if (getUpdatedPersonalMessage() != null) {
            json.add("updatedPersonalMessage", getUpdatedPersonalMessage().toJsonObject());
        }
        if (getUpdatedPersonalMessageExtra() != null) {
            JsonArray updatedPersonalMessageExtraArray = new JsonArray();
            for (MessageContent item : getUpdatedPersonalMessageExtra()) {
                updatedPersonalMessageExtraArray.add(item.toJsonObject());
            }
            json.add("updatedPersonalMessageExtra", updatedPersonalMessageExtraArray);
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
        if (jsonObject.has("totalCost")) {
            setTotalCost(jsonObject.get("totalCost").getAsFloat());
        }

        if (jsonObject.has("chargingPriority")) {
            setChargingPriority(jsonObject.get("chargingPriority").getAsInt());
        }

        if (jsonObject.has("idTokenInfo")) {
            setIdTokenInfo(new IdTokenInfo());
            getIdTokenInfo().fromJsonObject(jsonObject.getAsJsonObject("idTokenInfo"));
        }

        if (jsonObject.has("transactionLimit")) {
            setTransactionLimit(new TransactionLimit());
            getTransactionLimit().fromJsonObject(jsonObject.getAsJsonObject("transactionLimit"));
        }

        if (jsonObject.has("updatedPersonalMessage")) {
            setUpdatedPersonalMessage(new MessageContent());
            getUpdatedPersonalMessage().fromJsonObject(jsonObject.getAsJsonObject("updatedPersonalMessage"));
        }

        if (jsonObject.has("updatedPersonalMessageExtra")) {
            setUpdatedPersonalMessageExtra(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("updatedPersonalMessageExtra");
            for (JsonElement el : arr) {
                MessageContent item = new MessageContent();
                item.fromJsonObject(el.getAsJsonObject());
                getUpdatedPersonalMessageExtra().add(item);
            }
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
        if (!(obj instanceof TransactionEventResponse))
            return false;
        TransactionEventResponse that = (TransactionEventResponse) obj;
        return Objects.equals(getTotalCost(), that.getTotalCost())
                && Objects.equals(getChargingPriority(), that.getChargingPriority())
                && Objects.equals(getIdTokenInfo(), that.getIdTokenInfo())
                && Objects.equals(getTransactionLimit(), that.getTransactionLimit())
                && Objects.equals(getUpdatedPersonalMessage(), that.getUpdatedPersonalMessage())
                && Objects.equals(getUpdatedPersonalMessageExtra(), that.getUpdatedPersonalMessageExtra())
                && Objects.equals(getCustomData(), that.getCustomData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getTotalCost(),
                getChargingPriority(),
                getIdTokenInfo(),
                getTransactionLimit(),
                getUpdatedPersonalMessage(),
                getUpdatedPersonalMessageExtra(),
                getCustomData()
        );
    }
}
