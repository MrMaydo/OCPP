package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * (2.1) This message is sent by a Charging Station to request an update of setpoints
 * and/or limits of the charging profile with given chargingProfileId.
 */
public class PullDynamicScheduleUpdateRequest implements JsonInterface {

    /**
     * Id of charging profile to update.
     */
    @Required
    private Integer chargingProfileId;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public PullDynamicScheduleUpdateRequest() {
    }


    public PullDynamicScheduleUpdateRequest(Integer chargingProfileId, CustomData customData) {
        super();
        this.chargingProfileId = chargingProfileId;
        this.customData = customData;
    }


    public Integer getChargingProfileId() {
        return chargingProfileId;
    }


    public void setChargingProfileId(Integer chargingProfileId) {
        this.chargingProfileId = chargingProfileId;
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
        json.addProperty("chargingProfileId", chargingProfileId);
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
        if (jsonObject.has("chargingProfileId")) {
            this.chargingProfileId = jsonObject.get("chargingProfileId").getAsInt();
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
        if (!(obj instanceof PullDynamicScheduleUpdateRequest))
            return false;
        PullDynamicScheduleUpdateRequest that = (PullDynamicScheduleUpdateRequest) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.chargingProfileId, that.chargingProfileId);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.chargingProfileId != null ? this.chargingProfileId.hashCode() : 0);
        return result;
    }
}
