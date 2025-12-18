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

        if (getScheduleUpdate() != null) {
            json.add("scheduleUpdate", getScheduleUpdate().toJsonObject());
        }
        json.addProperty("status", getStatus().toString());

        if (getStatusInfo() != null) {
            json.add("statusInfo", getStatusInfo().toJsonObject());
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
        if (jsonObject.has("scheduleUpdate")) {
            setScheduleUpdate(new ChargingScheduleUpdate());
            getScheduleUpdate().fromJsonObject(jsonObject.getAsJsonObject("scheduleUpdate"));
        }

        if (jsonObject.has("status")) {
            setStatus(ChargingProfileStatusEnum.valueOf(jsonObject.get("status").getAsString()));
        }

        if (jsonObject.has("statusInfo")) {
            setStatusInfo(new StatusInfo());
            getStatusInfo().fromJsonObject(jsonObject.getAsJsonObject("statusInfo"));
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
        if (!(obj instanceof PullDynamicScheduleUpdateResponse))
            return false;
        PullDynamicScheduleUpdateResponse that = (PullDynamicScheduleUpdateResponse) obj;
        return Objects.equals(getScheduleUpdate(), that.getScheduleUpdate())
                && Objects.equals(getStatus(), that.getStatus())
                && Objects.equals(getStatusInfo(), that.getStatusInfo())
                && Objects.equals(getCustomData(), that.getCustomData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getScheduleUpdate(),
                getStatus(),
                getStatusInfo(),
                getCustomData()
        );
    }
}
