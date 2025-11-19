package maydo.ocpp.msgDef.Messages;

import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.annotations.Optional;

import java.util.Objects;

public class GetTransactionStatusRequest {

    /**
     * The Id of the transaction for which the status is requested.
     */
    @Optional
    private String transactionId;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public GetTransactionStatusRequest() {
    }

    /**
     * 
     * @param transactionId
     *     The Id of the transaction for which the status is requested.
     *     .
     */
    public GetTransactionStatusRequest(String transactionId, CustomData customData) {
        super();
        this.transactionId = transactionId;
        this.customData = customData;
    }

    /**
     * The Id of the transaction for which the status is requested.
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * The Id of the transaction for which the status is requested.
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
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
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof GetTransactionStatusRequest))
            return false;
        GetTransactionStatusRequest that = (GetTransactionStatusRequest) obj;
        return Objects.equals(this.transactionId, that.transactionId)
                && Objects.equals(this.customData, that.customData);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.transactionId != null ? this.transactionId.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        return result;
    }
}
