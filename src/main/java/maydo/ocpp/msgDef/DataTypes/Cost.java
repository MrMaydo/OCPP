package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.Enumerations.CostKindEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 *
 */
public class Cost implements JsonInterface {

    /**
     * The kind of cost referred to in the message element amount
     */
    @Required
    private CostKindEnum costKind;

    /**
     * The estimated or actual cost per kWh
     */
    @Required
    private Integer amount;

    /**
     * Values: -3..3, The amountMultiplier defines the exponent to base 10 (dec).
     * The final value is determined by: amount * 10 ^ amountMultiplier
     */
    @Optional
    private Integer amountMultiplier;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public Cost() {
    }


    public CostKindEnum getCostKind() {
        return costKind;
    }


    public void setCostKind(CostKindEnum costKind) {
        this.costKind = costKind;
    }


    public Integer getAmount() {
        return amount;
    }


    public void setAmount(Integer amount) {
        this.amount = amount;
    }


    public Integer getAmountMultiplier() {
        return amountMultiplier;
    }


    public void setAmountMultiplier(Integer amountMultiplier) {
        this.amountMultiplier = amountMultiplier;
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

        json.addProperty("costKind", getCostKind().toString());

        json.addProperty("amount", getAmount());

        if (getAmountMultiplier() != null) {
            json.addProperty("amountMultiplier", getAmountMultiplier());
        }
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
        if (jsonObject.has("costKind")) {
            setCostKind(CostKindEnum.valueOf(jsonObject.get("costKind").getAsString()));
        }

        if (jsonObject.has("amount")) {
            setAmount(jsonObject.get("amount").getAsInt());
        }

        if (jsonObject.has("amountMultiplier")) {
            setAmountMultiplier(jsonObject.get("amountMultiplier").getAsInt());
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
        if (!(obj instanceof Cost))
            return false;
        Cost that = (Cost) obj;
        return Objects.equals(getCostKind(), that.getCostKind())
                && Objects.equals(getAmount(), that.getAmount())
                && Objects.equals(getAmountMultiplier(), that.getAmountMultiplier())
                && Objects.equals(getCustomData(), that.getCustomData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getCostKind(),
                getAmount(),
                getAmountMultiplier(),
                getCustomData()
        );
    }
}
