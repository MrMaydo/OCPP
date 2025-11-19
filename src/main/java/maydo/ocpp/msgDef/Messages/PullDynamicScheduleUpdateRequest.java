package maydo.ocpp.msgDef.Messages;

import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class PullDynamicScheduleUpdateRequest implements JsonInterface {

    /**
     * Id of charging profile to update.
     * 
     * (Required)
     */
    @Required
    private Integer chargingProfileId;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public PullDynamicScheduleUpdateRequest() {
    }

    /**
     * 
     * @param chargingProfileId
     *     Id of charging profile to update.
     *     .
     */
    public PullDynamicScheduleUpdateRequest(Integer chargingProfileId, CustomData customData) {
        super();
        this.chargingProfileId = chargingProfileId;
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
