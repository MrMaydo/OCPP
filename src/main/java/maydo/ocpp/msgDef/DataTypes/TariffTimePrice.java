package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;


/**
 * Tariff with optional conditions for a time duration price.
 */
public class TariffTimePrice implements JsonInterface {

    /**
     * Price per minute (excl. tax) for this element.
     */
    @Required
    private Float priceMinute;

    /**
     * Conditions when this tariff element price is applicable. When absent always applicable,
     */
    @Optional
    private TariffConditions conditions;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public TariffTimePrice() {
    }


    public Float getPriceMinute() {
        return priceMinute;
    }


    public void setPriceMinute(Float priceMinute) {
        this.priceMinute = priceMinute;
    }


    public TariffConditions getConditions() {
        return conditions;
    }


    public void setConditions(TariffConditions conditions) {
        this.conditions = conditions;
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
        json.addProperty("priceMinute", priceMinute);
        json.add("conditions", conditions.toJsonObject());
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
        if (jsonObject.has("priceMinute")) {
            setPriceMinute(jsonObject.get("priceMinute").getAsFloat());
        }

        if (jsonObject.has("conditions")) {
            setConditions(new TariffConditions());
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
        if (!(obj instanceof TariffTimePrice))
            return false;
        TariffTimePrice that = (TariffTimePrice) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.priceMinute, that.priceMinute)
                && Objects.equals(this.conditions, that.conditions);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.priceMinute != null ? this.priceMinute.hashCode() : 0);
        result = 31 * result + (this.conditions != null ? this.conditions.hashCode() : 0);
        return result;
    }
}
