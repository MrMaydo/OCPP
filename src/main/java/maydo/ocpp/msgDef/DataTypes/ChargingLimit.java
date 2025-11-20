package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class ChargingLimit implements JsonInterface {

    /**
     * Represents the source of the charging limit. Values defined in appendix as ChargingLimitSourceEnumStringType.
     * <p>
     * (Required)
     */
    @Required
    private String chargingLimitSource;
    /**
     * *(2.1)* True when the reported limit concerns local generation that is providing extra capacity, instead of a limitation.
     */
    @Optional
    private Boolean isLocalGeneration;
    /**
     * Indicates whether the charging limit is critical for the grid.
     */
    @Optional
    private Boolean isGridCritical;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public ChargingLimit() {
    }

    /**
     * @param isLocalGeneration   *(2.1)* True when the reported limit concerns local generation that is providing extra capacity, instead of a limitation.
     *                            .
     * @param chargingLimitSource Represents the source of the charging limit. Values defined in appendix as ChargingLimitSourceEnumStringType.
     *                            .
     * @param isGridCritical      Indicates whether the charging limit is critical for the grid.
     *                            .
     */
    public ChargingLimit(String chargingLimitSource, Boolean isLocalGeneration, Boolean isGridCritical, CustomData customData) {
        super();
        this.chargingLimitSource = chargingLimitSource;
        this.isLocalGeneration = isLocalGeneration;
        this.isGridCritical = isGridCritical;
        this.customData = customData;
    }

    /**
     * Represents the source of the charging limit. Values defined in appendix as ChargingLimitSourceEnumStringType.
     * <p>
     * (Required)
     */
    public String getChargingLimitSource() {
        return chargingLimitSource;
    }

    /**
     * Represents the source of the charging limit. Values defined in appendix as ChargingLimitSourceEnumStringType.
     * <p>
     * (Required)
     */
    public void setChargingLimitSource(String chargingLimitSource) {
        this.chargingLimitSource = chargingLimitSource;
    }

    /**
     * *(2.1)* True when the reported limit concerns local generation that is providing extra capacity, instead of a limitation.
     */
    public Boolean getIsLocalGeneration() {
        return isLocalGeneration;
    }

    /**
     * *(2.1)* True when the reported limit concerns local generation that is providing extra capacity, instead of a limitation.
     */
    public void setIsLocalGeneration(Boolean isLocalGeneration) {
        this.isLocalGeneration = isLocalGeneration;
    }

    /**
     * Indicates whether the charging limit is critical for the grid.
     */
    public Boolean getIsGridCritical() {
        return isGridCritical;
    }

    /**
     * Indicates whether the charging limit is critical for the grid.
     */
    public void setIsGridCritical(Boolean isGridCritical) {
        this.isGridCritical = isGridCritical;
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
        JsonObject json = new JsonObject();
        json.addProperty("chargingLimitSource", chargingLimitSource);
        json.addProperty("isLocalGeneration", isLocalGeneration);
        json.addProperty("isGridCritical", isGridCritical);
        json.add("customData", customData.toJsonObject());
        return json;
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
        if (!(obj instanceof ChargingLimit))
            return false;
        ChargingLimit that = (ChargingLimit) obj;
        return Objects.equals(this.isLocalGeneration, that.isLocalGeneration)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.chargingLimitSource, that.chargingLimitSource)
                && Objects.equals(this.isGridCritical, that.isGridCritical);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.isLocalGeneration != null ? this.isLocalGeneration.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.chargingLimitSource != null ? this.chargingLimitSource.hashCode() : 0);
        result = 31 * result + (this.isGridCritical != null ? this.isGridCritical.hashCode() : 0);
        return result;
    }
}
