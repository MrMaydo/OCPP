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

        json.addProperty("totalCost", getTotalCost());

        json.addProperty("transactionId", getTransactionId());

        if (getCustomData() != null) {
            json.add("customData", getCustomData().toJsonObject());
        }

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
            setTotalCost(jsonObject.get("totalCost").getAsFloat());
        }

        if (jsonObject.has("transactionId")) {
            setTransactionId(jsonObject.get("transactionId").getAsString());
        }

        if (jsonObject.has("customData")) {
            setCustomData(new CustomData());
            getCustomData().fromJsonObject(jsonObject.getAsJsonObject("customData"));
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof CostUpdatedRequest))
            return false;
        CostUpdatedRequest that = (CostUpdatedRequest) obj;
        return Objects.equals(getTotalCost(), that.getTotalCost())
                && Objects.equals(getTransactionId(), that.getTransactionId())
                && Objects.equals(getCustomData(), that.getCustomData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getTotalCost(),
                getTransactionId(),
                getCustomData()
        );
    }
}
