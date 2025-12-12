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


    public GetChargingProfilesRequest(Integer requestId, Integer evseId, ChargingProfileCriterion chargingProfile, CustomData customData) {
        super();
        this.requestId = requestId;
        this.evseId = evseId;
        this.chargingProfile = chargingProfile;
        this.customData = customData;
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
        json.addProperty("requestId", requestId);
        json.addProperty("evseId", evseId);
        json.add("chargingProfile", chargingProfile.toJsonObject());
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
        if (jsonObject.has("requestId")) {
            this.requestId = jsonObject.get("requestId").getAsInt();
        }

        if (jsonObject.has("evseId")) {
            this.evseId = jsonObject.get("evseId").getAsInt();
        }

        if (jsonObject.has("chargingProfile")) {
            this.chargingProfile = new ChargingProfileCriterion();
            this.chargingProfile.fromJsonObject(jsonObject.getAsJsonObject("chargingProfile"));
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
        int result = 1;
        result = 31 * result + (this.evseId != null ? this.evseId.hashCode() : 0);
        result = 31 * result + (this.chargingProfile != null ? this.chargingProfile.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.requestId != null ? this.requestId.hashCode() : 0);
        return result;
    }
}
