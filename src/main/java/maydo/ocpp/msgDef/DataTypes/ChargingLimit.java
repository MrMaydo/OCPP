package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.Enumerations.ChargingLimitSourceEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.Objects;


/**
 * Charging_ Limit
 * urn:x-enexis:ecdm:uid:2:234489
 */
public class ChargingLimit implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
    /**
     * Charging_ Limit. Charging_ Limit_ Source. Charging_ Limit_ Source_ Code
     * urn:x-enexis:ecdm:uid:1:570845
     * Represents the source of the charging limit.
     * <p>
     * (Required)
     */
    @Required
    private ChargingLimitSourceEnum chargingLimitSource;
    /**
     * Charging_ Limit. Is_ Grid_ Critical. Indicator
     * urn:x-enexis:ecdm:uid:1:570847
     * Indicates whether the charging limit is critical for the grid.
     */
    @Optional
    private Boolean isGridCritical;

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

    /**
     * Charging_ Limit. Charging_ Limit_ Source. Charging_ Limit_ Source_ Code
     * urn:x-enexis:ecdm:uid:1:570845
     * Represents the source of the charging limit.
     * <p>
     * (Required)
     */
    public ChargingLimitSourceEnum getChargingLimitSource() {
        return chargingLimitSource;
    }

    /**
     * Charging_ Limit. Charging_ Limit_ Source. Charging_ Limit_ Source_ Code
     * urn:x-enexis:ecdm:uid:1:570845
     * Represents the source of the charging limit.
     * <p>
     * (Required)
     */
    public void setChargingLimitSource(ChargingLimitSourceEnum chargingLimitSource) {
        this.chargingLimitSource = chargingLimitSource;
    }

    /**
     * Charging_ Limit. Is_ Grid_ Critical. Indicator
     * urn:x-enexis:ecdm:uid:1:570847
     * Indicates whether the charging limit is critical for the grid.
     */
    public Boolean getIsGridCritical() {
        return isGridCritical;
    }

    /**
     * Charging_ Limit. Is_ Grid_ Critical. Indicator
     * urn:x-enexis:ecdm:uid:1:570847
     * Indicates whether the charging limit is critical for the grid.
     */
    public void setIsGridCritical(Boolean isGridCritical) {
        this.isGridCritical = isGridCritical;
    }

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject() {
        return JsonTools.toJsonObject(this);
    }

    @Override
    public void fromString(String jsonString) {
        JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
        fromJsonObject(jsonObject);
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        JsonTools.fromJsonObject(this, jsonObject);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof ChargingLimit))
            return false;
        ChargingLimit that = (ChargingLimit) obj;
        return Objects.equals(customData, that.customData)
                && chargingLimitSource == that.chargingLimitSource
                && Objects.equals(isGridCritical, that.isGridCritical);
    }

    @Override
    public int hashCode() {
        int result = (chargingLimitSource != null ? chargingLimitSource.hashCode() : 0);
        result = 31 * result + (isGridCritical != null ? isGridCritical.hashCode() : 0);
        result = 31 * result + (customData != null ? customData.hashCode() : 0);
        return result;
    }
}
