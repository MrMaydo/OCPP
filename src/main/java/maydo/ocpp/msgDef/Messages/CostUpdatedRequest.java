package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class CostUpdatedRequest implements JsonInterface {

    /**
     * Current total cost, based on the information known by the CSMS, of the transaction including taxes. In the currency configured with the configuration Variable: [&lt;&lt;configkey-currency, Currency&gt;&gt;]
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private Float totalCost;
    /**
     * Transaction Id of the transaction the current cost are asked for.
     * <p>
     * <p>
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
    public CostUpdatedRequest() {
    }

    /**
     * @param totalCost     Current total cost, based on the information known by the CSMS, of the transaction including taxes. In the currency configured with the configuration Variable: [&lt;&lt;configkey-currency, Currency&gt;&gt;]
     *                      <p>
     *                      .
     * @param transactionId Transaction Id of the transaction the current cost are asked for.
     *                      <p>
     *                      .
     */
    public CostUpdatedRequest(Float totalCost, String transactionId, CustomData customData) {
        super();
        this.totalCost = totalCost;
        this.transactionId = transactionId;
        this.customData = customData;
    }

    /**
     * Current total cost, based on the information known by the CSMS, of the transaction including taxes. In the currency configured with the configuration Variable: [&lt;&lt;configkey-currency, Currency&gt;&gt;]
     * <p>
     * <p>
     * (Required)
     */
    public Float getTotalCost() {
        return totalCost;
    }

    /**
     * Current total cost, based on the information known by the CSMS, of the transaction including taxes. In the currency configured with the configuration Variable: [&lt;&lt;configkey-currency, Currency&gt;&gt;]
     * <p>
     * <p>
     * (Required)
     */
    public void setTotalCost(Float totalCost) {
        this.totalCost = totalCost;
    }

    /**
     * Transaction Id of the transaction the current cost are asked for.
     * <p>
     * <p>
     * (Required)
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Transaction Id of the transaction the current cost are asked for.
     * <p>
     * <p>
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
        JsonObject json = new JsonObject();
        json.addProperty("totalCost", totalCost);
        json.addProperty("transactionId", transactionId);
        json.add("customData", customData.toJsonObject());
        return json;
    }

    @Override
    public void fromString(String jsonString) {
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        if (jsonObject.has("totalCost")) {
            this.totalCost = jsonObject.get("totalCost").getAsFloat();
        }

        if (jsonObject.has("transactionId")) {
            this.transactionId = jsonObject.get("transactionId").getAsString();
        }

        if (jsonObject.has("customData")) {
            this.customData = new CustomData();
            this.customData.fromJsonObject(jsonObject.getAsJsonObject("customData"));
        }

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof CostUpdatedRequest))
            return false;
        CostUpdatedRequest that = (CostUpdatedRequest) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.totalCost, that.totalCost)
                && Objects.equals(this.transactionId, that.transactionId);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.totalCost != null ? this.totalCost.hashCode() : 0);
        result = 31 * result + (this.transactionId != null ? this.transactionId.hashCode() : 0);
        return result;
    }
}
