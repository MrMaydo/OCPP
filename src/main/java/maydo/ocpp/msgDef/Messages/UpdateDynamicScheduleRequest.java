package maydo.ocpp.msgDef.Messages;

import maydo.ocpp.msgDef.DataTypes.ChargingScheduleUpdate;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class UpdateDynamicScheduleRequest {

    /**
     * Id of charging profile to update.
     * 
     * (Required)
     */
    @Required
    private Integer chargingProfileId;
    /**
     * Updates to a ChargingSchedulePeriodType for dynamic charging profiles.
     * 
     * 
     * (Required)
     */
    @Required
    private ChargingScheduleUpdate scheduleUpdate;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public UpdateDynamicScheduleRequest() {
    }

    /**
     * 
     * @param chargingProfileId
     *     Id of charging profile to update.
     *     .
     */
    public UpdateDynamicScheduleRequest(Integer chargingProfileId, ChargingScheduleUpdate scheduleUpdate, CustomData customData) {
        super();
        this.chargingProfileId = chargingProfileId;
        this.scheduleUpdate = scheduleUpdate;
        this.customData = customData;
    }

    /**
     * Id of charging profile to update.
     * 
     * (Required)
     */
    public Integer getChargingProfileId() {
        return chargingProfileId;
    }

    /**
     * Id of charging profile to update.
     * 
     * (Required)
     */
    public void setChargingProfileId(Integer chargingProfileId) {
        this.chargingProfileId = chargingProfileId;
    }

    /**
     * Updates to a ChargingSchedulePeriodType for dynamic charging profiles.
     * 
     * 
     * (Required)
     */
    public ChargingScheduleUpdate getScheduleUpdate() {
        return scheduleUpdate;
    }

    /**
     * Updates to a ChargingSchedulePeriodType for dynamic charging profiles.
     * 
     * 
     * (Required)
     */
    public void setScheduleUpdate(ChargingScheduleUpdate scheduleUpdate) {
        this.scheduleUpdate = scheduleUpdate;
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
