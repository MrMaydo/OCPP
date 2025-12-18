package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;


/**
 * Part of ISO 15118-20 price schedule.
 */
public class RationalNumber implements JsonInterface {

    /**
     * The exponent to base 10 (dec)
     */
    @Required
    private Integer exponent;

    /**
     * Value which shall be multiplied.
     */
    @Required
    private Integer value;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public RationalNumber() {
    }


    public Integer getExponent() {
        return exponent;
    }


    public void setExponent(Integer exponent) {
        this.exponent = exponent;
    }


    public Integer getValue() {
        return value;
    }


    public void setValue(Integer value) {
        this.value = value;
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

        json.addProperty("exponent", getExponent());

        json.addProperty("value", getValue());

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
        if (jsonObject.has("exponent")) {
            setExponent(jsonObject.get("exponent").getAsInt());
        }

        if (jsonObject.has("value")) {
            setValue(jsonObject.get("value").getAsInt());
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
        if (!(obj instanceof RationalNumber))
            return false;
        RationalNumber that = (RationalNumber) obj;
        return Objects.equals(getExponent(), that.getExponent())
                && Objects.equals(getValue(), that.getValue())
                && Objects.equals(getCustomData(), that.getCustomData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getExponent(),
                getValue(),
                getCustomData()
        );
    }
}
