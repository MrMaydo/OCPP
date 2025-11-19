package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.ChargingScheduleUpdate;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.StatusInfo;
import maydo.ocpp.msgDef.Enumerations.ChargingProfileStatusEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class PullDynamicScheduleUpdateResponse implements JsonInterface {

    /**
     * Updates to a ChargingSchedulePeriodType for dynamic charging profiles.
     * 
     */
    @Optional
    private ChargingScheduleUpdate scheduleUpdate;
    /**
     * Result of request.
     * 
     * 
     * (Required)
     */
    @Required
    private ChargingProfileStatusEnum status;
    /**
     * Element providing more information about the status.
     */
    @Optional
    private StatusInfo statusInfo;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public PullDynamicScheduleUpdateResponse() {
    }

    public PullDynamicScheduleUpdateResponse(ChargingScheduleUpdate scheduleUpdate, ChargingProfileStatusEnum status, StatusInfo statusInfo, CustomData customData) {
        super();
        this.scheduleUpdate = scheduleUpdate;
        this.status = status;
        this.statusInfo = statusInfo;
        this.customData = customData;
    }

    /**
     * Updates to a ChargingSchedulePeriodType for dynamic charging profiles.
     * 
     */
    public ChargingScheduleUpdate getScheduleUpdate() {
        return scheduleUpdate;
    }

    /**
     * Updates to a ChargingSchedulePeriodType for dynamic charging profiles.
     * 
     */
    public void setScheduleUpdate(ChargingScheduleUpdate scheduleUpdate) {
        this.scheduleUpdate = scheduleUpdate;
    }

    /**
     * Result of request.
     * 
     * 
     * (Required)
     */
    public ChargingProfileStatusEnum getStatus() {
        return status;
    }

    /**
     * Result of request.
     * 
     * 
     * (Required)
     */
    public void setStatus(ChargingProfileStatusEnum status) {
        this.status = status;
    }

    /**
     * Element providing more information about the status.
     */
    public StatusInfo getStatusInfo() {
        return statusInfo;
    }

    /**
     * Element providing more information about the status.
     */
    public void setStatusInfo(StatusInfo statusInfo) {
        this.statusInfo = statusInfo;
    }

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

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject() {
        return null;
    }

    @Override
    public void fromString(String jsonString) {
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
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
