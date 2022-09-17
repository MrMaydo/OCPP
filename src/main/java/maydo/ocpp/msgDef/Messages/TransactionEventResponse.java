
package maydo.ocpp.msgDef.Messages;


import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.IdTokenInfo;
import maydo.ocpp.msgDef.DataTypes.MessageContent;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class TransactionEventResponse {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * SHALL only be sent when charging has ended. Final total cost of this transaction, including taxes. In the currency configured with the Configuration Variable: &lt;&lt;configkey-currency,`Currency`&gt;&gt;. When omitted, the transaction was NOT free. To indicate a free transaction, the CSMS SHALL send 0.00.
     * 
     * 
     * 
     */
    private Float totalCost;
    /**
     * Priority from a business point of view. Default priority is 0, The range is from -9 to 9. Higher values indicate a higher priority. The chargingPriority in &lt;&lt;transactioneventresponse,TransactionEventResponse&gt;&gt; is temporarily, so it may not be set in the &lt;&lt;cmn_idtokeninfotype,IdTokenInfoType&gt;&gt; afterwards. Also the chargingPriority in &lt;&lt;transactioneventresponse,TransactionEventResponse&gt;&gt; overrules the one in &lt;&lt;cmn_idtokeninfotype,IdTokenInfoType&gt;&gt;.  
     * 
     * 
     */
    private Integer chargingPriority;
    /**
     * ID_ Token
     * urn:x-oca:ocpp:uid:2:233247
     * Contains status information about an identifier.
     * It is advised to not stop charging for a token that expires during charging, as ExpiryDate is only used for caching purposes. If ExpiryDate is not given, the status has no end date.
     * 
     * 
     */
    private IdTokenInfo idTokenInfo;
    /**
     * Message_ Content
     * urn:x-enexis:ecdm:uid:2:234490
     * Contains message details, for a message to be displayed on a Charging Station.
     * 
     * 
     * 
     */
    private MessageContent updatedPersonalMessage;

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
     * SHALL only be sent when charging has ended. Final total cost of this transaction, including taxes. In the currency configured with the Configuration Variable: &lt;&lt;configkey-currency,`Currency`&gt;&gt;. When omitted, the transaction was NOT free. To indicate a free transaction, the CSMS SHALL send 0.00.
     * 
     * 
     * 
     */
    public Float getTotalCost() {
        return totalCost;
    }

    /**
     * SHALL only be sent when charging has ended. Final total cost of this transaction, including taxes. In the currency configured with the Configuration Variable: &lt;&lt;configkey-currency,`Currency`&gt;&gt;. When omitted, the transaction was NOT free. To indicate a free transaction, the CSMS SHALL send 0.00.
     * 
     * 
     * 
     */
    public void setTotalCost(Float totalCost) {
        this.totalCost = totalCost;
    }

    /**
     * Priority from a business point of view. Default priority is 0, The range is from -9 to 9. Higher values indicate a higher priority. The chargingPriority in &lt;&lt;transactioneventresponse,TransactionEventResponse&gt;&gt; is temporarily, so it may not be set in the &lt;&lt;cmn_idtokeninfotype,IdTokenInfoType&gt;&gt; afterwards. Also the chargingPriority in &lt;&lt;transactioneventresponse,TransactionEventResponse&gt;&gt; overrules the one in &lt;&lt;cmn_idtokeninfotype,IdTokenInfoType&gt;&gt;.  
     * 
     * 
     */
    public Integer getChargingPriority() {
        return chargingPriority;
    }

    /**
     * Priority from a business point of view. Default priority is 0, The range is from -9 to 9. Higher values indicate a higher priority. The chargingPriority in &lt;&lt;transactioneventresponse,TransactionEventResponse&gt;&gt; is temporarily, so it may not be set in the &lt;&lt;cmn_idtokeninfotype,IdTokenInfoType&gt;&gt; afterwards. Also the chargingPriority in &lt;&lt;transactioneventresponse,TransactionEventResponse&gt;&gt; overrules the one in &lt;&lt;cmn_idtokeninfotype,IdTokenInfoType&gt;&gt;.  
     * 
     * 
     */
    public void setChargingPriority(Integer chargingPriority) {
        this.chargingPriority = chargingPriority;
    }

    /**
     * ID_ Token
     * urn:x-oca:ocpp:uid:2:233247
     * Contains status information about an identifier.
     * It is advised to not stop charging for a token that expires during charging, as ExpiryDate is only used for caching purposes. If ExpiryDate is not given, the status has no end date.
     * 
     * 
     */
    public IdTokenInfo getIdTokenInfo() {
        return idTokenInfo;
    }

    /**
     * ID_ Token
     * urn:x-oca:ocpp:uid:2:233247
     * Contains status information about an identifier.
     * It is advised to not stop charging for a token that expires during charging, as ExpiryDate is only used for caching purposes. If ExpiryDate is not given, the status has no end date.
     * 
     * 
     */
    public void setIdTokenInfo(IdTokenInfo idTokenInfo) {
        this.idTokenInfo = idTokenInfo;
    }

    /**
     * Message_ Content
     * urn:x-enexis:ecdm:uid:2:234490
     * Contains message details, for a message to be displayed on a Charging Station.
     * 
     * 
     * 
     */
    public MessageContent getUpdatedPersonalMessage() {
        return updatedPersonalMessage;
    }

    /**
     * Message_ Content
     * urn:x-enexis:ecdm:uid:2:234490
     * Contains message details, for a message to be displayed on a Charging Station.
     * 
     * 
     * 
     */
    public void setUpdatedPersonalMessage(MessageContent updatedPersonalMessage) {
        this.updatedPersonalMessage = updatedPersonalMessage;
    }

}
