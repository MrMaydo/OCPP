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


    public CostDimension(CostDimensionEnum type, Float volume, CustomData customData) {
        super();
        this.type = type;
        this.volume = volume;
        this.customData = customData;
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
        json.addProperty("type", type.toString());
        json.addProperty("volume", volume);
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
        if (jsonObject.has("type")) {
            this.type = CostDimensionEnum.valueOf(jsonObject.get("type").getAsString());
        }

        if (jsonObject.has("volume")) {
            this.volume = jsonObject.get("volume").getAsFloat();
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
        if (!(obj instanceof CostDimension))
            return false;
        CostDimension that = (CostDimension) obj;
        return Objects.equals(this.volume, that.volume)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.volume != null ? this.volume.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.type != null ? this.type.hashCode() : 0);
        return result;
    }
}
