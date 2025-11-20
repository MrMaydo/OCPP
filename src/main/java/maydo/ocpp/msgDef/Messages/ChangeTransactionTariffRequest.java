package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.Tariff;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class ChangeTransactionTariffRequest implements JsonInterface {

    /**
     * A tariff is described by fields with prices for:
     * energy,
     * charging time,
     * idle time,
     * fixed fee,
     * reservation time,
     * reservation fixed fee. +
     * Each of these fields may have (optional) conditions that specify when a price is applicable. +
     * The _description_ contains a human-readable explanation of the tariff to be shown to the user. +
     * The other fields are parameters that define the tariff. These are used by the charging station to calculate the price.
     * <p>
     * (Required)
     */
    @Required
    private Tariff tariff;
    /**
     * Transaction id for new tariff.
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
    public ChangeTransactionTariffRequest() {
    }

    /**
     * @param transactionId Transaction id for new tariff.
     *                      .
     */
    public ChangeTransactionTariffRequest(Tariff tariff, String transactionId, CustomData customData) {
        super();
        this.tariff = tariff;
        this.transactionId = transactionId;
        this.customData = customData;
    }

    /**
     * A tariff is described by fields with prices for:
     * energy,
     * charging time,
     * idle time,
     * fixed fee,
     * reservation time,
     * reservation fixed fee. +
     * Each of these fields may have (optional) conditions that specify when a price is applicable. +
     * The _description_ contains a human-readable explanation of the tariff to be shown to the user. +
     * The other fields are parameters that define the tariff. These are used by the charging station to calculate the price.
     * <p>
     * (Required)
     */
    public Tariff getTariff() {
        return tariff;
    }

    /**
     * A tariff is described by fields with prices for:
     * energy,
     * charging time,
     * idle time,
     * fixed fee,
     * reservation time,
     * reservation fixed fee. +
     * Each of these fields may have (optional) conditions that specify when a price is applicable. +
     * The _description_ contains a human-readable explanation of the tariff to be shown to the user. +
     * The other fields are parameters that define the tariff. These are used by the charging station to calculate the price.
     * <p>
     * (Required)
     */
    public void setTariff(Tariff tariff) {
        this.tariff = tariff;
    }

    /**
     * Transaction id for new tariff.
     * <p>
     * (Required)
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Transaction id for new tariff.
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
        json.add("tariff", tariff.toJsonObject());
        json.addProperty("transactionId", transactionId);
        json.add("customData", customData.toJsonObject());
        return json;
    }

    @Override
    public void fromString(String jsonString) {
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        if (jsonObject.has("tariff")) {
            this.tariff = new Tariff();
            this.tariff.fromJsonObject(jsonObject.getAsJsonObject("tariff"));
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
