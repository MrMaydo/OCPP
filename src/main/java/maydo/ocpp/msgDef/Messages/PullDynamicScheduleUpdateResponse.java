package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.ChargingScheduleUpdate;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.StatusInfo;
import maydo.ocpp.msgDef.Enumerations.ChargingProfileStatusEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * (2.1) If no data can be provided by CSMS, then the response will only contain status.
 */
public class PullDynamicScheduleUpdateResponse implements JsonInterface {

    /**
     * Updated charging schedule period values.
     */
    @Optional
    private ChargingScheduleUpdate scheduleUpdate;

    /**
     * Result of request.
     */
    @Required
    private ChargingProfileStatusEnum status;

    /**
     * Additional info about status
     */
    @Optional
    private StatusInfo statusInfo;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public PullDynamicScheduleUpdateResponse() {
    }


    public ChargingScheduleUpdate getScheduleUpdate() {
        return scheduleUpdate;
    }


    public void setScheduleUpdate(ChargingScheduleUpdate scheduleUpdate) {
        this.scheduleUpdate = scheduleUpdate;
    }


    public ChargingProfileStatusEnum getStatus() {
        return status;
    }


    public void setStatus(ChargingProfileStatusEnum status) {
        this.status = status;
    }


    public StatusInfo getStatusInfo() {
        return statusInfo;
    }


    public void setStatusInfo(StatusInfo statusInfo) {
        this.statusInfo = statusInfo;
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
        json.add("scheduleUpdate", scheduleUpdate.toJsonObject());
        json.addProperty("status", status.toString());
        json.add("statusInfo", statusInfo.toJsonObject());
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
        if (jsonObject.has("scheduleUpdate")) {
            this.scheduleUpdate = new ChargingScheduleUpdate();
            this.scheduleUpdate.fromJsonObject(jsonObject.getAsJsonObject("scheduleUpdate"));
        }

        if (jsonObject.has("status")) {
            this.status = ChargingProfileStatusEnum.valueOf(jsonObject.get("status").getAsString());
        }

        if (jsonObject.has("statusInfo")) {
            this.statusInfo = new StatusInfo();
            this.statusInfo.fromJsonObject(jsonObject.getAsJsonObject("statusInfo"));
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
        if (!(obj instanceof PullDynamicScheduleUpdateResponse))
            return false;
        PullDynamicScheduleUpdateResponse that = (PullDynamicScheduleUpdateResponse) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.scheduleUpdate, that.scheduleUpdate)
                && Objects.equals(this.statusInfo, that.statusInfo)
                && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.scheduleUpdate != null ? this.scheduleUpdate.hashCode() : 0);
        result = 31 * result + (this.statusInfo != null ? this.statusInfo.hashCode() : 0);
        result = 31 * result + (this.status != null ? this.status.hashCode() : 0);
        return result;
    }
}
