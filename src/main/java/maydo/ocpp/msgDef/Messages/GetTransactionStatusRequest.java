package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;

import java.util.Objects;

/**
 * With this message, the CSMS can ask the Charging Station whether it has transaction-related messages waiting to be delivered to
 * the CSMS. When a transactionId is provided, only messages for a specific transaction are asked for.
 */
public class GetTransactionStatusRequest implements JsonInterface {

    /**
     * The Id of the transaction for which the status is requested.
     */
    @Optional
    private String transactionId;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public GetTransactionStatusRequest() {
    }


    public String getTransactionId() {
        return transactionId;
    }


    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
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
            setTransactionId(jsonObject.get("transactionId").getAsString());
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
        if (!(obj instanceof GetTransactionStatusRequest))
            return false;
        GetTransactionStatusRequest that = (GetTransactionStatusRequest) obj;
        return Objects.equals(this.transactionId, that.transactionId)
                && Objects.equals(this.customData, that.customData);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.transactionId != null ? this.transactionId.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        return result;
    }
}
