package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.ChargingScheduleUpdate;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * (2.1) This message is used to update a setpoint or limit in a dynamic charging profile.
 */
public class UpdateDynamicScheduleRequest implements JsonInterface {

    /**
     * Id of charging profile to update.
     */
    @Required
    private Integer chargingProfileId;

    /**
     * Updated values for charging schedule period.
     */
    @Required
    private ChargingScheduleUpdate scheduleUpdate;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public UpdateDynamicScheduleRequest() {
    }


    public Integer getChargingProfileId() {
        return chargingProfileId;
    }


    public void setChargingProfileId(Integer chargingProfileId) {
        this.chargingProfileId = chargingProfileId;
    }


    public ChargingScheduleUpdate getScheduleUpdate() {
        return scheduleUpdate;
    }


    public void setScheduleUpdate(ChargingScheduleUpdate scheduleUpdate) {
        this.scheduleUpdate = scheduleUpdate;
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

        json.addProperty("chargingProfileId", getChargingProfileId());

        json.add("scheduleUpdate", getScheduleUpdate().toJsonObject());

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

        if (jsonObject.has("scheduleUpdate")) {
            setScheduleUpdate(new ChargingScheduleUpdate());
            getScheduleUpdate().fromJsonObject(jsonObject.getAsJsonObject("scheduleUpdate"));
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
        if (!(obj instanceof UpdateDynamicScheduleRequest))
            return false;
        UpdateDynamicScheduleRequest that = (UpdateDynamicScheduleRequest) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.scheduleUpdate, that.scheduleUpdate)
                && Objects.equals(this.chargingProfileId, that.chargingProfileId);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.scheduleUpdate != null ? this.scheduleUpdate.hashCode() : 0);
        result = 31 * result + (this.chargingProfileId != null ? this.chargingProfileId.hashCode() : 0);
        return result;
    }
}
