package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.ChargingProfile;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * This contains the field definition of the SetChargingProfileRequest PDU sent by the CSMS to the Charging Station.
 * The CSMS uses this message to send charging profiles to a Charging Station.
 */
public class SetChargingProfileRequest implements JsonInterface {

    /**
     * For TxDefaultProfile an evseId=0 applies the profile to each individual evse.
     * For ChargingStationMaxProfile and ChargingStationExternalConstraints
     * an evseId=0 contains an overal limit for the whole Charging Station.
     */
    @Required
    private Integer evseId;

    /**
     * The charging profile to be set at the Charging Station.
     */
    @Required
    private ChargingProfile chargingProfile;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public SetChargingProfileRequest() {
    }


    public Integer getEvseId() {
        return evseId;
    }


    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
    }


    public ChargingProfile getChargingProfile() {
        return chargingProfile;
    }


    public void setChargingProfile(ChargingProfile chargingProfile) {
        this.chargingProfile = chargingProfile;
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

        json.addProperty("evseId", getEvseId());

        json.add("chargingProfile", getChargingProfile().toJsonObject());

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

        if (jsonObject.has("chargingProfile")) {
            setChargingProfile(new ChargingProfile());
            getChargingProfile().fromJsonObject(jsonObject.getAsJsonObject("chargingProfile"));
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
        if (!(obj instanceof SetChargingProfileRequest))
            return false;
        SetChargingProfileRequest that = (SetChargingProfileRequest) obj;
        return Objects.equals(this.evseId, that.evseId)
                && Objects.equals(this.chargingProfile, that.chargingProfile)
                && Objects.equals(this.customData, that.customData);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.evseId != null ? this.evseId.hashCode() : 0);
        result = 31 * result + (this.chargingProfile != null ? this.chargingProfile.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        return result;
    }
}
