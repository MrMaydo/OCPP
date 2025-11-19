package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class GetTransactionStatusResponse implements JsonInterface {

    /**
     * Whether the transaction is still ongoing.
     */
    @Optional
    private Boolean ongoingIndicator;
    /**
     * Whether there are still message to be delivered.
     * <p>
     * (Required)
     */
    @Required
    private Boolean messagesInQueue;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public GetTransactionStatusResponse() {
    }

    /**
     * @param ongoingIndicator Whether the transaction is still ongoing.
     *                         .
     * @param messagesInQueue  Whether there are still message to be delivered.
     *                         .
     */
    public GetTransactionStatusResponse(Boolean ongoingIndicator, Boolean messagesInQueue, CustomData customData) {
        super();
        this.ongoingIndicator = ongoingIndicator;
        this.messagesInQueue = messagesInQueue;
        this.customData = customData;
    }

    /**
     * Whether the transaction is still ongoing.
     */
    public Boolean getOngoingIndicator() {
        return ongoingIndicator;
    }

    /**
     * Whether the transaction is still ongoing.
     */
    public void setOngoingIndicator(Boolean ongoingIndicator) {
        this.ongoingIndicator = ongoingIndicator;
    }

    /**
     * Whether there are still message to be delivered.
     * <p>
     * (Required)
     */
    public Boolean getMessagesInQueue() {
        return messagesInQueue;
    }

    /**
     * Whether there are still message to be delivered.
     * <p>
     * (Required)
     */
    public void setMessagesInQueue(Boolean messagesInQueue) {
        this.messagesInQueue = messagesInQueue;
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
