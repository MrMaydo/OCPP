package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.ClearChargingProfile;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;

import java.util.Objects;

/**
 * This contains the field definition of the ClearChargingProfileRequest PDU sent by the CSMS to the Charging Station.
 * The CSMS can use this message to clear (remove) either a specific charging profile (denoted by id)
 * or a selection of charging profiles that match with the values
 * of the optional evse, stackLevel and ChargingProfilePurpose fields.
 */
public class ClearChargingProfileRequest implements JsonInterface {

    /**
     * The Id of the charging profile to clear.
     */
    @Optional
    private Integer chargingProfileId;

    /**
     * Specifies the charging profile.
     */
    @Optional
    private ClearChargingProfile chargingProfileCriteria;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public ClearChargingProfileRequest() {
    }


    public Integer getChargingProfileId() {
        return chargingProfileId;
    }


    public void setChargingProfileId(Integer chargingProfileId) {
        this.chargingProfileId = chargingProfileId;
    }


    public ClearChargingProfile getChargingProfileCriteria() {
        return chargingProfileCriteria;
    }


    public void setChargingProfileCriteria(ClearChargingProfile chargingProfileCriteria) {
        this.chargingProfileCriteria = chargingProfileCriteria;
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

        if (getChargingProfileId() != null) {
            json.addProperty("chargingProfileId", getChargingProfileId());
        }
        if (getChargingProfileCriteria() != null) {
            json.add("chargingProfileCriteria", getChargingProfileCriteria().toJsonObject());
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
        if (jsonObject.has("chargingProfileId")) {
            setChargingProfileId(jsonObject.get("chargingProfileId").getAsInt());
        }

        if (jsonObject.has("chargingProfileCriteria")) {
            setChargingProfileCriteria(new ClearChargingProfile());
            getChargingProfileCriteria().fromJsonObject(jsonObject.getAsJsonObject("chargingProfileCriteria"));
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
        if (!(obj instanceof ClearChargingProfileRequest))
            return false;
        ClearChargingProfileRequest that = (ClearChargingProfileRequest) obj;
        return Objects.equals(getChargingProfileId(), that.getChargingProfileId())
                && Objects.equals(getChargingProfileCriteria(), that.getChargingProfileCriteria())
                && Objects.equals(getCustomData(), that.getCustomData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getChargingProfileId(),
                getChargingProfileCriteria(),
                getCustomData()
        );
    }
}
