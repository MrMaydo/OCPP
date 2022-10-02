
package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.Enumerations.ChargingLimitSourceEnum;
import maydo.ocpp.msgDef.JsonInterface;

import javax.annotation.Generated;


/**
 * Charging_ Limit
 * urn:x-enexis:ecdm:uid:2:234489
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class ChargingLimit implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * Charging_ Limit. Charging_ Limit_ Source. Charging_ Limit_ Source_ Code
     * urn:x-enexis:ecdm:uid:1:570845
     * Represents the source of the charging limit.
     * 
     * (Required)
     * 
     */
    private ChargingLimitSourceEnum chargingLimitSource;
    /**
     * Charging_ Limit. Is_ Grid_ Critical. Indicator
     * urn:x-enexis:ecdm:uid:1:570847
     * Indicates whether the charging limit is critical for the grid.
     * 
     * 
     */
    private Boolean isGridCritical;

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    public CustomData getCustomData() {
        return customData;
    }

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    public void setCustomData(CustomData customData) {
        this.customData = customData;
    }

    /**
     * Charging_ Limit. Charging_ Limit_ Source. Charging_ Limit_ Source_ Code
     * urn:x-enexis:ecdm:uid:1:570845
     * Represents the source of the charging limit.
     * 
     * (Required)
     * 
     */
    public ChargingLimitSourceEnum getChargingLimitSource() {
        return chargingLimitSource;
    }

    /**
     * Charging_ Limit. Charging_ Limit_ Source. Charging_ Limit_ Source_ Code
     * urn:x-enexis:ecdm:uid:1:570845
     * Represents the source of the charging limit.
     * 
     * (Required)
     * 
     */
    public void setChargingLimitSource(ChargingLimitSourceEnum chargingLimitSource) {
        this.chargingLimitSource = chargingLimitSource;
    }

    /**
     * Charging_ Limit. Is_ Grid_ Critical. Indicator
     * urn:x-enexis:ecdm:uid:1:570847
     * Indicates whether the charging limit is critical for the grid.
     * 
     * 
     */
    public Boolean getIsGridCritical() {
        return isGridCritical;
    }

    /**
     * Charging_ Limit. Is_ Grid_ Critical. Indicator
     * urn:x-enexis:ecdm:uid:1:570847
     * Indicates whether the charging limit is critical for the grid.
     * 
     * 
     */
    public void setIsGridCritical(Boolean isGridCritical) {
        this.isGridCritical = isGridCritical;
    }

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonElement toJsonObject(){
        JsonElement jsonObject= new Gson().toJsonTree(this);
        return jsonObject;
    }
}
