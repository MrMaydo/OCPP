
package maydo.ocpp.msgDef.Messages;

import maydo.ocpp.msgDef.DataTypes.CustomData;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class RequestStopTransactionRequest {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * The identifier of the transaction which the Charging Station is requested to stop.
     * 
     * (Required)
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
     * The identifier of the transaction which the Charging Station is requested to stop.
     * 
     * (Required)
     * 
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * The identifier of the transaction which the Charging Station is requested to stop.
     * 
     * (Required)
     * 
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

}
