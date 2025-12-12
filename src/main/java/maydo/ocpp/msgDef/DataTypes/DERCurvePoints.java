package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 *
 */
public class DERCurvePoints implements JsonInterface {

    /**
     * The data value of the X-axis (independent) variable, depending on the curve type.
     */
    @Required
    private Float x;

    /**
     * The data value of the Y-axis (dependent) variable, depending on the DERUnitEnumType of the curve.
     * If y is power factor, then a positive value means DER is absorbing reactive power (under-excited),
     * a negative value when DER is injecting reactive power (over-excited).
     */
    @Required
    private Float y;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public DERCurvePoints() {
    }


    public Float getX() {
        return x;
    }


    public void setX(Float x) {
        this.x = x;
    }


    public Float getY() {
        return y;
    }


    public void setY(Float y) {
        this.y = y;
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
        json.addProperty("x", x);
        json.addProperty("y", y);
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
        if (jsonObject.has("x")) {
            this.x = jsonObject.get("x").getAsFloat();
        }

        if (jsonObject.has("y")) {
            this.y = jsonObject.get("y").getAsFloat();
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
        if (!(obj instanceof DERCurvePoints))
            return false;
        DERCurvePoints that = (DERCurvePoints) obj;
        return Objects.equals(this.x, that.x)
                && Objects.equals(this.y, that.y)
                && Objects.equals(this.customData, that.customData);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.x != null ? this.x.hashCode() : 0);
        result = 31 * result + (this.y != null ? this.y.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        return result;
    }
}
