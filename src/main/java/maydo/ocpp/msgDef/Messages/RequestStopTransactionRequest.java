package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class RequestStopTransactionRequest implements JsonInterface {

    /**
     * The identifier of the transaction which the Charging Station is requested to stop.
     * 
     * (Required)
     */
    @Required
    private String transactionId;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public RequestStopTransactionRequest() {
    }

    /**
     * 
     * @param transactionId
     *     The identifier of the transaction which the Charging Station is requested to stop.
     *     .
     */
    public RequestStopTransactionRequest(String transactionId, CustomData customData) {
        super();
        this.transactionId = transactionId;
        this.customData = customData;
    }

    /**
     * The identifier of the transaction which the Charging Station is requested to stop.
     * 
     * (Required)
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * The identifier of the transaction which the Charging Station is requested to stop.
     * 
     * (Required)
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
        if (!(obj instanceof RequestStopTransactionRequest))
            return false;
        RequestStopTransactionRequest that = (RequestStopTransactionRequest) obj;
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
