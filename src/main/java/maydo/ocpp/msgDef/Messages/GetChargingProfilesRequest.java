package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.ChargingProfileCriterion;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.Objects;

public class GetChargingProfilesRequest implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
    /**
     * Reference identification that is to be used by the Charging Station in the &lt;&lt;reportchargingprofilesrequest, ReportChargingProfilesRequest&gt;&gt; when provided.
     * <p>
     * (Required)
     */
    @Required
    private Integer requestId;
    /**
     * For which EVSE installed charging profiles SHALL be reported. If 0, only charging profiles installed on the Charging Station itself (the grid connection) SHALL be reported. If omitted, all installed charging profiles SHALL be reported.
     */
    @Optional
    private Integer evseId;
    /**
     * Charging_ Profile
     * urn:x-oca:ocpp:uid:2:233255
     * A ChargingProfile consists of ChargingSchedule, describing the amount of power or current that can be delivered per time interval.
     * <p>
     * (Required)
     */
    @Required
    private ChargingProfileCriterion chargingProfile;

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
     * Reference identification that is to be used by the Charging Station in the &lt;&lt;reportchargingprofilesrequest, ReportChargingProfilesRequest&gt;&gt; when provided.
     * <p>
     * (Required)
     */
    public Integer getRequestId() {
        return requestId;
    }

    /**
     * Reference identification that is to be used by the Charging Station in the &lt;&lt;reportchargingprofilesrequest, ReportChargingProfilesRequest&gt;&gt; when provided.
     * <p>
     * (Required)
     */
    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    /**
     * For which EVSE installed charging profiles SHALL be reported. If 0, only charging profiles installed on the Charging Station itself (the grid connection) SHALL be reported. If omitted, all installed charging profiles SHALL be reported.
     */
    public Integer getEvseId() {
        return evseId;
    }

    /**
     * For which EVSE installed charging profiles SHALL be reported. If 0, only charging profiles installed on the Charging Station itself (the grid connection) SHALL be reported. If omitted, all installed charging profiles SHALL be reported.
     */
    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
    }

    /**
     * Charging_ Profile
     * urn:x-oca:ocpp:uid:2:233255
     * A ChargingProfile consists of ChargingSchedule, describing the amount of power or current that can be delivered per time interval.
     * <p>
     * (Required)
     */
    public ChargingProfileCriterion getChargingProfile() {
        return chargingProfile;
    }

    /**
     * Charging_ Profile
     * urn:x-oca:ocpp:uid:2:233255
     * A ChargingProfile consists of ChargingSchedule, describing the amount of power or current that can be delivered per time interval.
     * <p>
     * (Required)
     */
    public void setChargingProfile(ChargingProfileCriterion chargingProfile) {
        this.chargingProfile = chargingProfile;
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
        if (!(obj instanceof GetChargingProfilesRequest))
            return false;
        GetChargingProfilesRequest that = (GetChargingProfilesRequest) obj;
        return Objects.equals(customData, that.customData)
                && Objects.equals(requestId, that.requestId)
                && Objects.equals(evseId, that.evseId)
                && Objects.equals(chargingProfile, that.chargingProfile);
    }

    @Override
    public int hashCode() {
        int result = (requestId != null ? requestId.hashCode() : 0);
        result = 31 * result + (evseId != null ? evseId.hashCode() : 0);
        result = 31 * result + (chargingProfile != null ? chargingProfile.hashCode() : 0);
        result = 31 * result + (customData != null ? customData.hashCode() : 0);
        return result;
    }
}
