package maydo.ocpp.msgDef.Messages;

import maydo.ocpp.msgDef.DataTypes.AuthorizationData;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.UpdateEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.List;
import java.util.Objects;

public class SendLocalListRequest implements JsonInterface {

    private List<AuthorizationData> localAuthorizationList;
    /**
     * In case of a full update this is the version number of the full list. In case of a differential update it is the version number of the list after the update has been applied.
     * 
     * (Required)
     */
    @Required
    private Integer versionNumber;
    /**
     * This contains the type of update (full or differential) of this request.
     * 
     * (Required)
     */
    @Required
    private UpdateEnum updateType;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public SendLocalListRequest() {
    }

    /**
     * 
     * @param versionNumber
     *     In case of a full update this is the version number of the full list. In case of a differential update it is the version number of the list after the update has been applied.
     *     .
     */
    public SendLocalListRequest(List<AuthorizationData> localAuthorizationList, Integer versionNumber, UpdateEnum updateType, CustomData customData) {
        super();
        this.localAuthorizationList = localAuthorizationList;
        this.versionNumber = versionNumber;
        this.updateType = updateType;
        this.customData = customData;
    }

    public List<AuthorizationData> getLocalAuthorizationList() {
        return localAuthorizationList;
    }

    public void setLocalAuthorizationList(List<AuthorizationData> localAuthorizationList) {
        this.localAuthorizationList = localAuthorizationList;
    }

    /**
     * In case of a full update this is the version number of the full list. In case of a differential update it is the version number of the list after the update has been applied.
     * 
     * (Required)
     */
    public Integer getVersionNumber() {
        return versionNumber;
    }

    /**
     * In case of a full update this is the version number of the full list. In case of a differential update it is the version number of the list after the update has been applied.
     * 
     * (Required)
     */
    public void setVersionNumber(Integer versionNumber) {
        this.versionNumber = versionNumber;
    }

    /**
     * This contains the type of update (full or differential) of this request.
     * 
     * (Required)
     */
    public UpdateEnum getUpdateType() {
        return updateType;
    }

    /**
     * This contains the type of update (full or differential) of this request.
     * 
     * (Required)
     */
    public void setUpdateType(UpdateEnum updateType) {
        this.updateType = updateType;
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
        if (!(obj instanceof SendLocalListRequest))
            return false;
        SendLocalListRequest that = (SendLocalListRequest) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.localAuthorizationList, that.localAuthorizationList) 
                && Objects.equals(this.versionNumber, that.versionNumber) 
                && Objects.equals(this.updateType, that.updateType);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.localAuthorizationList != null ? this.localAuthorizationList.hashCode() : 0);
        result = 31 * result + (this.versionNumber != null ? this.versionNumber.hashCode() : 0);
        result = 31 * result + (this.updateType != null ? this.updateType.hashCode() : 0);
        return result;
    }
}
