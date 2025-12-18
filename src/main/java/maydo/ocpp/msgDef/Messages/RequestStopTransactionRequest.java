package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * This contains the field definitions of the RequestStopTransactionRequest PDU sent to Charging Station by CSMS.
 */
public class RequestStopTransactionRequest implements JsonInterface {

    /**
     * The identifier of the transaction which the Charging Station is requested to stop.
     */
    @Required
    private String transactionId;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public RequestStopTransactionRequest() {
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

        json.addProperty("transactionId", getTransactionId());

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
        if (!(obj instanceof RequestStopTransactionRequest))
            return false;
        RequestStopTransactionRequest that = (RequestStopTransactionRequest) obj;
        return Objects.equals(getTransactionId(), that.getTransactionId())
                && Objects.equals(getCustomData(), that.getCustomData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getTransactionId(),
                getCustomData()
        );
    }
}
