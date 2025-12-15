package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.Enumerations.ChargingProfilePurposeEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;

import java.util.Objects;

/**
 * A ClearChargingProfileType is a filter for charging profiles to be cleared by ClearChargingProfileRequest.
 */
public class ClearChargingProfile implements JsonInterface {

    /**
     * Specifies the id of the EVSE for which to clear charging profiles.
     * An evseId of zero (0) specifies the charging profile for the overall Charging Station.
     * Absence of this parameter means the clearing applies to all charging profiles that match the other criteria in the request.
     */
    @Optional
    private Integer evseId;

    /**
     * Specifies to purpose of the charging profiles that will be cleared, if they meet the other criteria in the request.
     */
    @Optional
    private ChargingProfilePurposeEnum chargingProfilePurpose;

    /**
     * Specifies the stackLevel for which charging profiles will be cleared, if they meet the other criteria in the request.
     */
    @Optional
    private Integer stackLevel;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public ClearChargingProfile() {
    }


    public Integer getEvseId() {
        return evseId;
    }


    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
    }


    public ChargingProfilePurposeEnum getChargingProfilePurpose() {
        return chargingProfilePurpose;
    }


    public void setChargingProfilePurpose(ChargingProfilePurposeEnum chargingProfilePurpose) {
        this.chargingProfilePurpose = chargingProfilePurpose;
    }


    public Integer getStackLevel() {
        return stackLevel;
    }


    public void setStackLevel(Integer stackLevel) {
        this.stackLevel = stackLevel;
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

        if (getEvseId() != null) {
            json.addProperty("evseId", getEvseId());
        }
        if (getChargingProfilePurpose() != null) {
            json.addProperty("chargingProfilePurpose", getChargingProfilePurpose().toString());
        }
        if (getStackLevel() != null) {
            json.addProperty("stackLevel", getStackLevel());
        }
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
        if (jsonObject.has("evseId")) {
            setEvseId(jsonObject.get("evseId").getAsInt());
        }

        if (jsonObject.has("chargingProfilePurpose")) {
            setChargingProfilePurpose(ChargingProfilePurposeEnum.valueOf(jsonObject.get("chargingProfilePurpose").getAsString()));
        }

        if (jsonObject.has("stackLevel")) {
            setStackLevel(jsonObject.get("stackLevel").getAsInt());
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
        if (!(obj instanceof ClearChargingProfile))
            return false;
        ClearChargingProfile that = (ClearChargingProfile) obj;
        return Objects.equals(this.evseId, that.evseId)
                && Objects.equals(this.chargingProfilePurpose, that.chargingProfilePurpose)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.stackLevel, that.stackLevel);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.evseId != null ? this.evseId.hashCode() : 0);
        result = 31 * result + (this.chargingProfilePurpose != null ? this.chargingProfilePurpose.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.stackLevel != null ? this.stackLevel.hashCode() : 0);
        return result;
    }
}
