package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;


/**
 * Tariff with optional conditions for an energy price.
 */
public class TariffEnergyPrice implements JsonInterface {

    /**
     * Price per kWh (excl. tax) for this element.
     */
    @Required
    private Float priceKwh;

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


    public TariffEnergyPrice() {
    }


    public Float getPriceKwh() {
        return priceKwh;
    }


    public void setPriceKwh(Float priceKwh) {
        this.priceKwh = priceKwh;
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

        json.addProperty("priceKwh", getPriceKwh());

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
        if (jsonObject.has("priceKwh")) {
            setPriceKwh(jsonObject.get("priceKwh").getAsFloat());
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
        if (!(obj instanceof TariffEnergyPrice))
            return false;
        TariffEnergyPrice that = (TariffEnergyPrice) obj;
        return Objects.equals(this.priceKwh, that.priceKwh)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.conditions, that.conditions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getPriceKwh(),
                getConditions(),
                getCustomData()
        );
    }
}
