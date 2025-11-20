package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.Enumerations.CostKindEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class Cost implements JsonInterface {

    /**
     * The kind of cost referred to in the message element amount
     * <p>
     * (Required)
     */
    @Required
    private CostKindEnum costKind;
    /**
     * The estimated or actual cost per kWh
     * <p>
     * (Required)
     */
    @Required
    private Integer amount;
    /**
     * Values: -3..3, The amountMultiplier defines the exponent to base 10 (dec). The final value is determined by: amount * 10 ^ amountMultiplier
     */
    @Optional
    private Integer amountMultiplier;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public Cost() {
    }

    /**
     * @param amount           The estimated or actual cost per kWh
     *                         .
     * @param amountMultiplier Values: -3..3, The amountMultiplier defines the exponent to base 10 (dec). The final value is determined by: amount * 10 ^ amountMultiplier
     *                         .
     */
    public Cost(CostKindEnum costKind, Integer amount, Integer amountMultiplier, CustomData customData) {
        super();
        this.costKind = costKind;
        this.amount = amount;
        this.amountMultiplier = amountMultiplier;
        this.customData = customData;
    }

    /**
     * The kind of cost referred to in the message element amount
     * <p>
     * (Required)
     */
    public CostKindEnum getCostKind() {
        return costKind;
    }

    /**
     * The kind of cost referred to in the message element amount
     * <p>
     * (Required)
     */
    public void setCostKind(CostKindEnum costKind) {
        this.costKind = costKind;
    }

    /**
     * The estimated or actual cost per kWh
     * <p>
     * (Required)
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * The estimated or actual cost per kWh
     * <p>
     * (Required)
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * Values: -3..3, The amountMultiplier defines the exponent to base 10 (dec). The final value is determined by: amount * 10 ^ amountMultiplier
     */
    public Integer getAmountMultiplier() {
        return amountMultiplier;
    }

    /**
     * Values: -3..3, The amountMultiplier defines the exponent to base 10 (dec). The final value is determined by: amount * 10 ^ amountMultiplier
     */
    public void setAmountMultiplier(Integer amountMultiplier) {
        this.amountMultiplier = amountMultiplier;
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
        json.addProperty("costKind", costKind.toString());
        json.addProperty("amount", amount);
        json.addProperty("amountMultiplier", amountMultiplier);
        json.add("customData", customData.toJsonObject());
        return json;
    }

    @Override
    public void fromString(String jsonString) {
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        if (jsonObject.has("costKind")) {
            this.costKind = CostKindEnum.valueOf(jsonObject.get("costKind").getAsString());
        }

        if (jsonObject.has("amount")) {
            this.amount = jsonObject.get("amount").getAsInt();
        }

        if (jsonObject.has("amountMultiplier")) {
            this.amountMultiplier = jsonObject.get("amountMultiplier").getAsInt();
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
        if (!(obj instanceof Cost))
            return false;
        Cost that = (Cost) obj;
        return Objects.equals(this.costKind, that.costKind)
                && Objects.equals(this.amount, that.amount)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.amountMultiplier, that.amountMultiplier);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.costKind != null ? this.costKind.hashCode() : 0);
        result = 31 * result + (this.amount != null ? this.amount.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.amountMultiplier != null ? this.amountMultiplier.hashCode() : 0);
        return result;
    }
}
