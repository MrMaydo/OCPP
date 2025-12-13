package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.ChargingProfile;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Reports charging profiles installed in the Charging Station, as requested via a GetChargingProfilesRequest message.
 * The charging profile report can be split over multiple ReportChargingProfilesRequest messages,
 * this can be because charging profiles for different charging sources need to be reported,
 * or because there is just to much data for one message.
 */
public class ReportChargingProfilesRequest implements JsonInterface {

    /**
     * Id used to match the GetChargingProfilesRequest message with the resulting ReportChargingProfilesRequest messages.
     * When the CSMS provided a requestId in the GetChargingProfilesRequest, this field SHALL contain the same value.
     */
    @Required
    private Integer requestId;

    /**
     * Source that has installed this charging profile. Values defined in Appendix as ChargingLimitSourceEnumStringType.
     */
    @Required
    private String chargingLimitSource;

    /**
     * The charging profile as configured in the Charging Station.
     */
    @Required
    private List<ChargingProfile> chargingProfile;

    /**
     * To Be Continued. Default value when omitted: false. false indicates that there are no further messages as part of this report.
     */
    @Optional
    private Boolean tbc = false;

    /**
     * The evse to which the charging profile applies. If evseId = 0, the message contains an overall limit for the Charging Station.
     */
    @Required
    private Integer evseId;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public ReportChargingProfilesRequest() {
    }


    public Integer getRequestId() {
        return requestId;
    }


    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }


    public String getChargingLimitSource() {
        return chargingLimitSource;
    }


    public void setChargingLimitSource(String chargingLimitSource) {
        this.chargingLimitSource = chargingLimitSource;
    }


    public List<ChargingProfile> getChargingProfile() {
        return chargingProfile;
    }


    public void setChargingProfile(List<ChargingProfile> chargingProfile) {
        this.chargingProfile = chargingProfile;
    }


    public Boolean getTbc() {
        return tbc;
    }


    public void setTbc(Boolean tbc) {
        this.tbc = tbc;
    }


    public Integer getEvseId() {
        return evseId;
    }


    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
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
        json.addProperty("chargingLimitSource", chargingLimitSource);
        json.addProperty("evseId", evseId);
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
            setRequestId(jsonObject.get("requestId").getAsInt());
        }

        if (jsonObject.has("chargingLimitSource")) {
            setChargingLimitSource(jsonObject.get("chargingLimitSource").getAsString());
        }

        if (jsonObject.has("chargingProfile")) {
            setChargingProfile(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("chargingProfile");
            for (JsonElement el : arr) {
                ChargingProfile item = new ChargingProfile();
                item.fromJsonObject(el.getAsJsonObject());
                getChargingProfile().add(item);
            }
        }

        if (jsonObject.has("evseId")) {
            setEvseId(jsonObject.get("evseId").getAsInt());
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
        if (!(obj instanceof ReportChargingProfilesRequest))
            return false;
        ReportChargingProfilesRequest that = (ReportChargingProfilesRequest) obj;
        return Objects.equals(this.evseId, that.evseId)
                && Objects.equals(this.tbc, that.tbc)
                && Objects.equals(this.requestId, that.requestId)
                && Objects.equals(this.chargingProfile, that.chargingProfile)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.chargingLimitSource, that.chargingLimitSource);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.evseId != null ? this.evseId.hashCode() : 0);
        result = 31 * result + (this.tbc != null ? this.tbc.hashCode() : 0);
        result = 31 * result + (this.requestId != null ? this.requestId.hashCode() : 0);
        result = 31 * result + (this.chargingProfile != null ? this.chargingProfile.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.chargingLimitSource != null ? this.chargingLimitSource.hashCode() : 0);
        return result;
    }
}
