package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

public class GetTransactionStatusResponse implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
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

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject() {
        return JsonTools.toJsonObject(this);
    }
}
