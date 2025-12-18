package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;


/**
 * Tariff with optional conditions for a fixed price.
 */
public class TariffFixedPrice implements JsonInterface {

    /**
     * Fixed price for this element e.g. a start fee.
     */
    @Required
    private Float priceFixed;

    /**
     * Conditions when this tariff element price is applicable. When absent always applicable,
     */
    @Optional
    private TariffConditionsFixed conditions;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public TariffFixedPrice() {
    }


    public TariffConditionsFixed getConditions() {
        return conditions;
    }


    public void setConditions(TariffConditionsFixed conditions) {
        this.conditions = conditions;
    }


    public Float getPriceFixed() {
        return priceFixed;
    }


    public void setPriceFixed(Float priceFixed) {
        this.priceFixed = priceFixed;
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

        json.addProperty("priceFixed", getPriceFixed());

        if (getConditions() != null) {
            json.add("conditions", getConditions().toJsonObject());
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
        if (jsonObject.has("priceFixed")) {
            setPriceFixed(jsonObject.get("priceFixed").getAsFloat());
        }

        if (jsonObject.has("conditions")) {
            setConditions(new TariffConditionsFixed());
            getConditions().fromJsonObject(jsonObject.getAsJsonObject("conditions"));
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
        if (!(obj instanceof TariffFixedPrice))
            return false;
        TariffFixedPrice that = (TariffFixedPrice) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.conditions, that.conditions)
                && Objects.equals(this.priceFixed, that.priceFixed);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.conditions != null ? this.conditions.hashCode() : 0);
        result = 31 * result + (this.priceFixed != null ? this.priceFixed.hashCode() : 0);
        return result;
    }
}
