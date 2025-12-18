package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.ChargingProfileCriterion;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * The message GetChargingProfilesRequest can be used by the CSMS to request installed charging profiles from the Charging Station.
 * The charging profiles will then be reported by the Charging Station via ReportChargingProfilesRequest messages.
 */
public class GetChargingProfilesRequest implements JsonInterface {

    /**
     * Reference identification that is to be used by the Charging Station in the ReportChargingProfilesRequest when provided.
     */
    @Required
    private Integer requestId;

    /**
     * For which EVSE installed charging profiles SHALL be reported.
     * If 0, only charging profiles installed on the Charging Station itself (the grid connection) SHALL be reported.
     * If omitted, all installed charging profiles SHALL be reported.
     * Reported charging profiles SHALL match the criteria in field chargingProfile.
     */
    @Optional
    private Integer evseId;

    /**
     * Specifies the charging profile.
     */
    @Required
    private ChargingProfileCriterion chargingProfile;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public GetChargingProfilesRequest() {
    }


    public Integer getRequestId() {
        return requestId;
    }


    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }


    public Integer getEvseId() {
        return evseId;
    }


    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
    }


    public ChargingProfileCriterion getChargingProfile() {
        return chargingProfile;
    }


    public void setChargingProfile(ChargingProfileCriterion chargingProfile) {
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

        json.addProperty("requestId", getRequestId());

        if (getEvseId() != null) {
            json.addProperty("evseId", getEvseId());
        }
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
        if (jsonObject.has("requestId")) {
            setRequestId(jsonObject.get("requestId").getAsInt());
        }

        if (jsonObject.has("evseId")) {
            setEvseId(jsonObject.get("evseId").getAsInt());
        }

        if (jsonObject.has("chargingProfile")) {
            setChargingProfile(new ChargingProfileCriterion());
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
        if (!(obj instanceof GetChargingProfilesRequest))
            return false;
        GetChargingProfilesRequest that = (GetChargingProfilesRequest) obj;
        return Objects.equals(this.evseId, that.evseId)
                && Objects.equals(this.chargingProfile, that.chargingProfile)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getRequestId(),
                getEvseId(),
                getChargingProfile(),
                getCustomData()
        );
    }
}
