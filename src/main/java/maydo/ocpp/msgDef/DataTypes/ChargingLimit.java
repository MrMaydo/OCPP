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
public class ChargingLimit implements JsonInterface {

    /**
     * Represents the source of the charging limit. Values defined in appendix as ChargingLimitSourceEnumStringType.
     */
    @Required
    private String chargingLimitSource;

    /**
     * (2.1) True when the reported limit concerns local generation that is providing extra capacity, instead of a limitation.
     */
    @Optional
    private Boolean isLocalGeneration;

    /**
     * Indicates whether the charging limit is critical for the grid.
     */
    @Optional
    private Boolean isGridCritical;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public ChargingLimit() {
    }


    public String getChargingLimitSource() {
        return chargingLimitSource;
    }


    public void setChargingLimitSource(String chargingLimitSource) {
        this.chargingLimitSource = chargingLimitSource;
    }


    public Boolean getIsLocalGeneration() {
        return isLocalGeneration;
    }


    public void setIsLocalGeneration(Boolean isLocalGeneration) {
        this.isLocalGeneration = isLocalGeneration;
    }


    public Boolean getIsGridCritical() {
        return isGridCritical;
    }


    public void setIsGridCritical(Boolean isGridCritical) {
        this.isGridCritical = isGridCritical;
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
        json.addProperty("chargingLimitSource", chargingLimitSource);
        json.addProperty("isLocalGeneration", isLocalGeneration);
        json.addProperty("isGridCritical", isGridCritical);
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
        if (jsonObject.has("chargingLimitSource")) {
            this.chargingLimitSource = jsonObject.get("chargingLimitSource").getAsString();
        }

        if (jsonObject.has("isLocalGeneration")) {
            this.isLocalGeneration = jsonObject.get("isLocalGeneration").getAsBoolean();
        }

        if (jsonObject.has("isGridCritical")) {
            this.isGridCritical = jsonObject.get("isGridCritical").getAsBoolean();
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
