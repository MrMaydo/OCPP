
package maydo.ocpp.msgDef.Messages;

import maydo.ocpp.msgDef.DataTypes.CustomData;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class CostUpdatedRequest {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * Current total cost, based on the information known by the CSMS, of the transaction including taxes. In the currency configured with the configuration Variable: [&lt;&lt;configkey-currency, Currency&gt;&gt;]
     * 
     * 
     * (Required)
     * 
     */
    private Float totalCost;
    /**
     * Transaction Id of the transaction the current cost are asked for.
     * 
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
     * Current total cost, based on the information known by the CSMS, of the transaction including taxes. In the currency configured with the configuration Variable: [&lt;&lt;configkey-currency, Currency&gt;&gt;]
     * 
     * 
     * (Required)
     * 
     */
    public Float getTotalCost() {
        return totalCost;
    }

    /**
     * Current total cost, based on the information known by the CSMS, of the transaction including taxes. In the currency configured with the configuration Variable: [&lt;&lt;configkey-currency, Currency&gt;&gt;]
     * 
     * 
     * (Required)
     * 
     */
    public void setTotalCost(Float totalCost) {
        this.totalCost = totalCost;
    }

    /**
     * Transaction Id of the transaction the current cost are asked for.
     * 
     * 
     * (Required)
     * 
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Transaction Id of the transaction the current cost are asked for.
     * 
     * 
     * (Required)
     * 
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

}
