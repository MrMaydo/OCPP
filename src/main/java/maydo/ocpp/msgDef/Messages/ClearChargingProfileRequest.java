package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.ClearChargingProfile;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.utils.JsonTools;

import java.util.Objects;

public class ClearChargingProfileRequest implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
    /**
     * The Id of the charging profile to clear.
     */
    @Optional
    private Integer chargingProfileId;
    /**
     * Charging_ Profile
     * urn:x-oca:ocpp:uid:2:233255
     * A ChargingProfile consists of a ChargingSchedule, describing the amount of power or current that can be delivered per time interval.
     */
    @Optional
    private ClearChargingProfile chargingProfileCriteria;

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
     * The Id of the charging profile to clear.
     */
    public Integer getChargingProfileId() {
        return chargingProfileId;
    }

    /**
     * The Id of the charging profile to clear.
     */
    public void setChargingProfileId(Integer chargingProfileId) {
        this.chargingProfileId = chargingProfileId;
    }

    /**
     * Charging_ Profile
     * urn:x-oca:ocpp:uid:2:233255
     * A ChargingProfile consists of a ChargingSchedule, describing the amount of power or current that can be delivered per time interval.
     */
    public ClearChargingProfile getChargingProfileCriteria() {
        return chargingProfileCriteria;
    }

    /**
     * Charging_ Profile
     * urn:x-oca:ocpp:uid:2:233255
     * A ChargingProfile consists of a ChargingSchedule, describing the amount of power or current that can be delivered per time interval.
     */
    public void setChargingProfileCriteria(ClearChargingProfile chargingProfileCriteria) {
        this.chargingProfileCriteria = chargingProfileCriteria;
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
        if (!(obj instanceof ClearChargingProfileRequest))
            return false;
        ClearChargingProfileRequest that = (ClearChargingProfileRequest) obj;
        return Objects.equals(customData, that.customData)
                && Objects.equals(chargingProfileId, that.chargingProfileId)
                && Objects.equals(chargingProfileCriteria, that.chargingProfileCriteria);
    }

    @Override
    public int hashCode() {
        int result = (chargingProfileId != null ? chargingProfileId.hashCode() : 0);
        result = 31 * result + (chargingProfileCriteria != null ? chargingProfileCriteria.hashCode() : 0);
        result = 31 * result + (customData != null ? customData.hashCode() : 0);
        return result;
    }
}
