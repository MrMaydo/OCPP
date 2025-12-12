package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * This contains the field definition of the CostUpdatedRequest PDU sent by
 * the CSMS to the Charging Station. With this request the CSMS can send the current cost of a transaction to a Charging Station.
 */
public class CostUpdatedRequest implements JsonInterface {

    /**
     * Current total cost, based on the information known by the CSMS, of the transaction including taxes.
     * In the currency configured with the configuration Variable: [Currency]
     */
    @Required
    private Float totalCost;

    /**
     * Transaction Id of the transaction the current cost are asked for.
     */
    @Required
    private String transactionId;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public CostUpdatedRequest() {
    }


    public CostUpdatedRequest(Float totalCost, String transactionId, CustomData customData) {
        super();
        this.totalCost = totalCost;
        this.transactionId = transactionId;
        this.customData = customData;
    }


    public Float getTotalCost() {
        return totalCost;
    }


    public void setTotalCost(Float totalCost) {
        this.totalCost = totalCost;
    }


    public String getTransactionId() {
        return transactionId;
    }


    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }


    public CustomData getCustomData() {
        return customData;
    }


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
        JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
        fromJsonObject(jsonObject);
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
