package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.Enumerations.CostDimensionEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class CostDimension implements JsonInterface {

    /**
     * Type of cost dimension: energy, power, time, etc.
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private CostDimensionEnum type;
    /**
     * Volume of the dimension consumed, measured according to the dimension type.
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private Float volume;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public CostDimension() {
    }

    /**
     * @param volume Volume of the dimension consumed, measured according to the dimension type.
     *               <p>
     *               .
     */
    public CostDimension(CostDimensionEnum type, Float volume, CustomData customData) {
        super();
        this.type = type;
        this.volume = volume;
        this.customData = customData;
    }

    /**
     * Type of cost dimension: energy, power, time, etc.
     * <p>
     * <p>
     * (Required)
     */
    public CostDimensionEnum getType() {
        return type;
    }

    /**
     * Type of cost dimension: energy, power, time, etc.
     * <p>
     * <p>
     * (Required)
     */
    public void setType(CostDimensionEnum type) {
        this.type = type;
    }

    /**
     * Volume of the dimension consumed, measured according to the dimension type.
     * <p>
     * <p>
     * (Required)
     */
    public Float getVolume() {
        return volume;
    }

    /**
     * Volume of the dimension consumed, measured according to the dimension type.
     * <p>
     * <p>
     * (Required)
     */
    public void setVolume(Float volume) {
        this.volume = volume;
    }

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    public CustomData getCustomData() {
        return customData;
    }

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    public void setCustomData(CustomData customData) {
        this.customData = customData;
    }

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject() {
        return null;
    }

    @Override
    public void fromString(String jsonString) {
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
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
