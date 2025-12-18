package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.Enumerations.CostDimensionEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * Volume consumed of cost dimension.
 */
public class CostDimension implements JsonInterface {

    /**
     * Type of cost dimension: energy, power, time, etc.
     */
    @Required
    private CostDimensionEnum type;

    /**
     * Volume of the dimension consumed, measured according to the dimension type.
     */
    @Required
    private Float volume;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public CostDimension() {
    }


    public CostDimensionEnum getType() {
        return type;
    }


    public void setType(CostDimensionEnum type) {
        this.type = type;
    }


    public Float getVolume() {
        return volume;
    }


    public void setVolume(Float volume) {
        this.volume = volume;
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

        json.addProperty("type", getType().toString());

        json.addProperty("volume", getVolume());

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
        if (jsonObject.has("type")) {
            setType(CostDimensionEnum.valueOf(jsonObject.get("type").getAsString()));
        }

        if (jsonObject.has("volume")) {
            setVolume(jsonObject.get("volume").getAsFloat());
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
        if (!(obj instanceof CostDimension))
            return false;
        CostDimension that = (CostDimension) obj;
        return Objects.equals(getType(), that.getType())
                && Objects.equals(getVolume(), that.getVolume())
                && Objects.equals(getCustomData(), that.getCustomData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getType(),
                getVolume(),
                getCustomData()
        );
    }
}
