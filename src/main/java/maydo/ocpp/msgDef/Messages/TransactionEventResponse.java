package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.IdTokenInfo;
import maydo.ocpp.msgDef.DataTypes.MessageContent;
import maydo.ocpp.msgDef.DataTypes.TransactionLimit;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;

import java.util.List;
import java.util.Objects;

public class TransactionEventResponse implements JsonInterface {

    /**
     * When _eventType_ of TransactionEventRequest is Updated, then this value contains the running cost. When _eventType_ of TransactionEventRequest is Ended, then this contains the final total cost of this transaction, including taxes, in the currency configured with the Configuration Variable: Currency. Absence of this value does not imply that the transaction was free. To indicate a free transaction, the CSMS SHALL send a value of 0.00.
     */
    @Optional
    private Float totalCost;
    /**
     * Priority from a business point of view. Default priority is 0, The range is from -9 to 9. Higher values indicate a higher priority. The chargingPriority in &lt;&lt;transactioneventresponse,TransactionEventResponse&gt;&gt; is temporarily, so it may not be set in the &lt;&lt;cmn_idtokeninfotype,IdTokenInfoType&gt;&gt; afterwards. Also the chargingPriority in &lt;&lt;transactioneventresponse,TransactionEventResponse&gt;&gt; has a higher priority than the one in &lt;&lt;cmn_idtokeninfotype,IdTokenInfoType&gt;&gt;.  
     */
    @Optional
    private Integer chargingPriority;
    /**
     * Contains status information about an identifier.
     * It is advised to not stop charging for a token that expires during charging, as ExpiryDate is only used for caching purposes. If ExpiryDate is not given, the status has no end date.
     */
    @Optional
    private IdTokenInfo idTokenInfo;
    /**
     * Cost, energy, time or SoC limit for a transaction.
     */
    @Optional
    private TransactionLimit transactionLimit;
    /**
     * Contains message details, for a message to be displayed on a Charging Station.
     * 
     */
    @Optional
    private MessageContent updatedPersonalMessage;
    @Optional
    private List<MessageContent> updatedPersonalMessageExtra;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public TransactionEventResponse() {
    }

    /**
     * 
     * @param chargingPriority
     *     Priority from a business point of view. Default priority is 0, The range is from -9 to 9. Higher values indicate a higher priority. The chargingPriority in &lt;&lt;transactioneventresponse,TransactionEventResponse&gt;&gt; is temporarily, so it may not be set in the &lt;&lt;cmn_idtokeninfotype,IdTokenInfoType&gt;&gt; afterwards. Also the chargingPriority in &lt;&lt;transactioneventresponse,TransactionEventResponse&gt;&gt; has a higher priority than the one in &lt;&lt;cmn_idtokeninfotype,IdTokenInfoType&gt;&gt;.  
     *     .
     * @param totalCost
     *     When _eventType_ of TransactionEventRequest is Updated, then this value contains the running cost. When _eventType_ of TransactionEventRequest is Ended, then this contains the final total cost of this transaction, including taxes, in the currency configured with the Configuration Variable: Currency. Absence of this value does not imply that the transaction was free. To indicate a free transaction, the CSMS SHALL send a value of 0.00.
     *     .
     */
    public TransactionEventResponse(Float totalCost, Integer chargingPriority, IdTokenInfo idTokenInfo, TransactionLimit transactionLimit, MessageContent updatedPersonalMessage, List<MessageContent> updatedPersonalMessageExtra, CustomData customData) {
        super();
        this.totalCost = totalCost;
        this.chargingPriority = chargingPriority;
        this.idTokenInfo = idTokenInfo;
        this.transactionLimit = transactionLimit;
        this.updatedPersonalMessage = updatedPersonalMessage;
        this.updatedPersonalMessageExtra = updatedPersonalMessageExtra;
        this.customData = customData;
    }

    /**
     * When _eventType_ of TransactionEventRequest is Updated, then this value contains the running cost. When _eventType_ of TransactionEventRequest is Ended, then this contains the final total cost of this transaction, including taxes, in the currency configured with the Configuration Variable: Currency. Absence of this value does not imply that the transaction was free. To indicate a free transaction, the CSMS SHALL send a value of 0.00.
     */
    public Float getTotalCost() {
        return totalCost;
    }

    /**
     * When _eventType_ of TransactionEventRequest is Updated, then this value contains the running cost. When _eventType_ of TransactionEventRequest is Ended, then this contains the final total cost of this transaction, including taxes, in the currency configured with the Configuration Variable: Currency. Absence of this value does not imply that the transaction was free. To indicate a free transaction, the CSMS SHALL send a value of 0.00.
     */
    public void setTotalCost(Float totalCost) {
        this.totalCost = totalCost;
    }

    /**
     * Priority from a business point of view. Default priority is 0, The range is from -9 to 9. Higher values indicate a higher priority. The chargingPriority in &lt;&lt;transactioneventresponse,TransactionEventResponse&gt;&gt; is temporarily, so it may not be set in the &lt;&lt;cmn_idtokeninfotype,IdTokenInfoType&gt;&gt; afterwards. Also the chargingPriority in &lt;&lt;transactioneventresponse,TransactionEventResponse&gt;&gt; has a higher priority than the one in &lt;&lt;cmn_idtokeninfotype,IdTokenInfoType&gt;&gt;.  
     */
    public Integer getChargingPriority() {
        return chargingPriority;
    }

    /**
     * Priority from a business point of view. Default priority is 0, The range is from -9 to 9. Higher values indicate a higher priority. The chargingPriority in &lt;&lt;transactioneventresponse,TransactionEventResponse&gt;&gt; is temporarily, so it may not be set in the &lt;&lt;cmn_idtokeninfotype,IdTokenInfoType&gt;&gt; afterwards. Also the chargingPriority in &lt;&lt;transactioneventresponse,TransactionEventResponse&gt;&gt; has a higher priority than the one in &lt;&lt;cmn_idtokeninfotype,IdTokenInfoType&gt;&gt;.  
     */
    public void setChargingPriority(Integer chargingPriority) {
        this.chargingPriority = chargingPriority;
    }

    /**
     * Contains status information about an identifier.
     * It is advised to not stop charging for a token that expires during charging, as ExpiryDate is only used for caching purposes. If ExpiryDate is not given, the status has no end date.
     */
    public IdTokenInfo getIdTokenInfo() {
        return idTokenInfo;
    }

    /**
     * Contains status information about an identifier.
     * It is advised to not stop charging for a token that expires during charging, as ExpiryDate is only used for caching purposes. If ExpiryDate is not given, the status has no end date.
     */
    public void setIdTokenInfo(IdTokenInfo idTokenInfo) {
        this.idTokenInfo = idTokenInfo;
    }

    /**
     * Cost, energy, time or SoC limit for a transaction.
     */
    public TransactionLimit getTransactionLimit() {
        return transactionLimit;
    }

    /**
     * Cost, energy, time or SoC limit for a transaction.
     */
    public void setTransactionLimit(TransactionLimit transactionLimit) {
        this.transactionLimit = transactionLimit;
    }

    /**
     * Contains message details, for a message to be displayed on a Charging Station.
     * 
     */
    public MessageContent getUpdatedPersonalMessage() {
        return updatedPersonalMessage;
    }

    /**
     * Contains message details, for a message to be displayed on a Charging Station.
     * 
     */
    public void setUpdatedPersonalMessage(MessageContent updatedPersonalMessage) {
        this.updatedPersonalMessage = updatedPersonalMessage;
    }

    public List<MessageContent> getUpdatedPersonalMessageExtra() {
        return updatedPersonalMessageExtra;
    }

    public void setUpdatedPersonalMessageExtra(List<MessageContent> updatedPersonalMessageExtra) {
        this.updatedPersonalMessageExtra = updatedPersonalMessageExtra;
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
        if (!(obj instanceof TransactionEventResponse))
            return false;
        TransactionEventResponse that = (TransactionEventResponse) obj;
        return Objects.equals(this.idTokenInfo, that.idTokenInfo)
                && Objects.equals(this.updatedPersonalMessageExtra, that.updatedPersonalMessageExtra) 
                && Objects.equals(this.updatedPersonalMessage, that.updatedPersonalMessage) 
                && Objects.equals(this.chargingPriority, that.chargingPriority) 
                && Objects.equals(this.customData, that.customData) 
                && Objects.equals(this.transactionLimit, that.transactionLimit) 
                && Objects.equals(this.totalCost, that.totalCost);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.idTokenInfo != null ? this.idTokenInfo.hashCode() : 0);
        result = 31 * result + (this.updatedPersonalMessageExtra != null ? this.updatedPersonalMessageExtra.hashCode() : 0);
        result = 31 * result + (this.updatedPersonalMessage != null ? this.updatedPersonalMessage.hashCode() : 0);
        result = 31 * result + (this.chargingPriority != null ? this.chargingPriority.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.transactionLimit != null ? this.transactionLimit.hashCode() : 0);
        result = 31 * result + (this.totalCost != null ? this.totalCost.hashCode() : 0);
        return result;
    }
}
