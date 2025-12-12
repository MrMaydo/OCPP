package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * The response to a GetTransactionStatusRequest, sent by the Charging Station to the CSMS.
 */
public class GetTransactionStatusResponse implements JsonInterface {

    /**
     * Whether the transaction is still ongoing.
     */
    @Optional
    private Boolean ongoingIndicator;

    /**
     * Whether there are still message to be delivered.
     */
    @Required
    private Boolean messagesInQueue;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public GetTransactionStatusResponse() {
    }


    public GetTransactionStatusResponse(Boolean ongoingIndicator, Boolean messagesInQueue, CustomData customData) {
        super();
        this.ongoingIndicator = ongoingIndicator;
        this.messagesInQueue = messagesInQueue;
        this.customData = customData;
    }


    public Boolean getOngoingIndicator() {
        return ongoingIndicator;
    }


    public void setOngoingIndicator(Boolean ongoingIndicator) {
        this.ongoingIndicator = ongoingIndicator;
    }


    public Boolean getMessagesInQueue() {
        return messagesInQueue;
    }


    public void setMessagesInQueue(Boolean messagesInQueue) {
        this.messagesInQueue = messagesInQueue;
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
        json.addProperty("ongoingIndicator", ongoingIndicator);
        json.addProperty("messagesInQueue", messagesInQueue);
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
        if (jsonObject.has("ongoingIndicator")) {
            this.ongoingIndicator = jsonObject.get("ongoingIndicator").getAsBoolean();
        }

        if (jsonObject.has("messagesInQueue")) {
            this.messagesInQueue = jsonObject.get("messagesInQueue").getAsBoolean();
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
        if (!(obj instanceof GetTransactionStatusResponse))
            return false;
        GetTransactionStatusResponse that = (GetTransactionStatusResponse) obj;
        return Objects.equals(this.messagesInQueue, that.messagesInQueue)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.ongoingIndicator, that.ongoingIndicator);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.messagesInQueue != null ? this.messagesInQueue.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.ongoingIndicator != null ? this.ongoingIndicator.hashCode() : 0);
        return result;
    }
}
