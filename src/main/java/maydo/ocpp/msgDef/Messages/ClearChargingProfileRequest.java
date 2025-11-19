package maydo.ocpp.msgDef.Messages;

import maydo.ocpp.msgDef.DataTypes.ClearChargingProfile;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.annotations.Optional;

import java.util.Objects;

public class ClearChargingProfileRequest {

    /**
     * The Id of the charging profile to clear.
     */
    @Optional
    private Integer chargingProfileId;
    /**
     * A ClearChargingProfileType is a filter for charging profiles to be cleared by ClearChargingProfileRequest.
     * 
     */
    @Optional
    private ClearChargingProfile chargingProfileCriteria;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public ClearChargingProfileRequest() {
    }

    /**
     * 
     * @param chargingProfileId
     *     The Id of the charging profile to clear.
     *     .
     */
    public ClearChargingProfileRequest(Integer chargingProfileId, ClearChargingProfile chargingProfileCriteria, CustomData customData) {
        super();
        this.chargingProfileId = chargingProfileId;
        this.chargingProfileCriteria = chargingProfileCriteria;
        this.customData = customData;
    }

    /**
     * The Id of the charging profile to clear.
     */
    public Integer getChargingProfileId() {
        return chargingProfileId;
    }

    /**
     * The Id of the charging profile to clear.
     */
    public void setChargingProfileId(Integer chargingProfileId) {
        this.chargingProfileId = chargingProfileId;
    }

    /**
     * A ClearChargingProfileType is a filter for charging profiles to be cleared by ClearChargingProfileRequest.
     * 
     */
    public ClearChargingProfile getChargingProfileCriteria() {
        return chargingProfileCriteria;
    }

    /**
     * A ClearChargingProfileType is a filter for charging profiles to be cleared by ClearChargingProfileRequest.
     * 
     */
    public void setChargingProfileCriteria(ClearChargingProfile chargingProfileCriteria) {
        this.chargingProfileCriteria = chargingProfileCriteria;
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
        if (!(obj instanceof ClearChargingProfileRequest))
            return false;
        ClearChargingProfileRequest that = (ClearChargingProfileRequest) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.chargingProfileCriteria, that.chargingProfileCriteria) 
                && Objects.equals(this.chargingProfileId, that.chargingProfileId);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.chargingProfileCriteria != null ? this.chargingProfileCriteria.hashCode() : 0);
        result = 31 * result + (this.chargingProfileId != null ? this.chargingProfileId.hashCode() : 0);
        return result;
    }
}
