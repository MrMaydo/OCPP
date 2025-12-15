package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.Tariff;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 *
 */
public class ChangeTransactionTariffRequest implements JsonInterface {

    /**
     * New tariff to use for transaction.
     */
    @Required
    private Tariff tariff;

    /**
     * Transaction id for new tariff.
     */
    @Required
    private String transactionId;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public ChangeTransactionTariffRequest() {
    }


    public Tariff getTariff() {
        return tariff;
    }


    public void setTariff(Tariff tariff) {
        this.tariff = tariff;
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

        json.add("tariff", getTariff().toJsonObject());

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
        if (jsonObject.has("tariff")) {
            setTariff(new Tariff());
            getTariff().fromJsonObject(jsonObject.getAsJsonObject("tariff"));
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
        if (!(obj instanceof ChangeTransactionTariffRequest))
            return false;
        ChangeTransactionTariffRequest that = (ChangeTransactionTariffRequest) obj;
        return Objects.equals(this.tariff, that.tariff)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.transactionId, that.transactionId);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.tariff != null ? this.tariff.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.transactionId != null ? this.transactionId.hashCode() : 0);
        return result;
    }
}
