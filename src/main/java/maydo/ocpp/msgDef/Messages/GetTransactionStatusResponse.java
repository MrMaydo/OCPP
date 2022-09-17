
package maydo.ocpp.msgDef.Messages;

import maydo.ocpp.msgDef.DataTypes.CustomData;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class GetTransactionStatusResponse {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * Whether the transaction is still ongoing.
     * 
     * 
     */
    private Boolean ongoingIndicator;
    /**
     * Whether there are still message to be delivered.
     * 
     * (Required)
     * 
     */
    private Boolean messagesInQueue;

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
     * Whether the transaction is still ongoing.
     * 
     * 
     */
    public Boolean getOngoingIndicator() {
        return ongoingIndicator;
    }

    /**
     * Whether the transaction is still ongoing.
     * 
     * 
     */
    public void setOngoingIndicator(Boolean ongoingIndicator) {
        this.ongoingIndicator = ongoingIndicator;
    }

    /**
     * Whether there are still message to be delivered.
     * 
     * (Required)
     * 
     */
    public Boolean getMessagesInQueue() {
        return messagesInQueue;
    }

    /**
     * Whether there are still message to be delivered.
     * 
     * (Required)
     * 
     */
    public void setMessagesInQueue(Boolean messagesInQueue) {
        this.messagesInQueue = messagesInQueue;
    }

}