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

        json.addProperty("x", getX());

        json.addProperty("y", getY());

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
        if (jsonObject.has("x")) {
            setX(jsonObject.get("x").getAsFloat());
        }

        if (jsonObject.has("y")) {
            setY(jsonObject.get("y").getAsFloat());
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
        if (!(obj instanceof DERCurvePoints))
            return false;
        DERCurvePoints that = (DERCurvePoints) obj;
        return Objects.equals(getX(), that.getX())
                && Objects.equals(getY(), that.getY())
                && Objects.equals(getCustomData(), that.getCustomData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getX(),
                getY(),
                getCustomData()
        );
    }
}
