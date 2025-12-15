package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;

import java.util.Objects;


/**
 * Total cost with and without tax.
 * Contains the total of energy, charging time, idle time, fixed and reservation costs including
 * and/or excluding tax.
 */
public class TotalPrice implements JsonInterface {

    /**
     * Price/cost excluding tax. Can be absent if inclTax is present.
     */
    @Optional
    private Float exclTax;

    /**
     * Price/cost including tax. Can be absent if exclTax is present.
     */
    @Optional
    private Float inclTax;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public TotalPrice() {
    }


    public Float getExclTax() {
        return exclTax;
    }


    public void setExclTax(Float exclTax) {
        this.exclTax = exclTax;
    }


    public Float getInclTax() {
        return inclTax;
    }


    public void setInclTax(Float inclTax) {
        this.inclTax = inclTax;
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

        if (getExclTax() != null) {
            json.addProperty("exclTax", getExclTax());
        }
        if (getInclTax() != null) {
            json.addProperty("inclTax", getInclTax());
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
        if (jsonObject.has("exclTax")) {
            setExclTax(jsonObject.get("exclTax").getAsFloat());
        }

        if (jsonObject.has("inclTax")) {
            setInclTax(jsonObject.get("inclTax").getAsFloat());
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
        if (!(obj instanceof TotalPrice))
            return false;
        TotalPrice that = (TotalPrice) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.inclTax, that.inclTax)
                && Objects.equals(this.exclTax, that.exclTax);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.inclTax != null ? this.inclTax.hashCode() : 0);
        result = 31 * result + (this.exclTax != null ? this.exclTax.hashCode() : 0);
        return result;
    }
}
