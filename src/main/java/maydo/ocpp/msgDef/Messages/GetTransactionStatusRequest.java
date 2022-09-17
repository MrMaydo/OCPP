
package maydo.ocpp.msgDef.Messages;

import maydo.ocpp.msgDef.DataTypes.CustomData;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class GetTransactionStatusRequest {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * The Id of the transaction for which the status is requested.
     * 
     * 
     */
    private String transactionId;

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
     * The Id of the transaction for which the status is requested.
     * 
     * 
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * The Id of the transaction for which the status is requested.
     * 
     * 
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

}