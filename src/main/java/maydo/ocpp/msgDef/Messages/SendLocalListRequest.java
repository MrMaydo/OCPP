package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.AuthorizationData;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.UpdateEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.List;
import java.util.Objects;

public class SendLocalListRequest implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    @Optional
    private List<AuthorizationData> localAuthorizationList = null;
    /**
     * In case of a full update this is the version number of the full list. In case of a differential update it is the version number of the list after the update has been applied.
     * <p>
     * (Required)
     */
    @Required
    private Integer versionNumber;
    /**
     * This contains the type of update (full or differential) of this request.
     * <p>
     * (Required)
     */
    @Required
    private UpdateEnum updateType;

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

    public List<AuthorizationData> getLocalAuthorizationList() {
        return localAuthorizationList;
    }

    public void setLocalAuthorizationList(List<AuthorizationData> localAuthorizationList) {
        this.localAuthorizationList = localAuthorizationList;
    }

    /**
     * In case of a full update this is the version number of the full list. In case of a differential update it is the version number of the list after the update has been applied.
     * <p>
     * (Required)
     */
    public Integer getVersionNumber() {
        return versionNumber;
    }

    /**
     * In case of a full update this is the version number of the full list. In case of a differential update it is the version number of the list after the update has been applied.
     * <p>
     * (Required)
     */
    public void setVersionNumber(Integer versionNumber) {
        this.versionNumber = versionNumber;
    }

    /**
     * This contains the type of update (full or differential) of this request.
     * <p>
     * (Required)
     */
    public UpdateEnum getUpdateType() {
        return updateType;
    }

    /**
     * This contains the type of update (full or differential) of this request.
     * <p>
     * (Required)
     */
    public void setUpdateType(UpdateEnum updateType) {
        this.updateType = updateType;
    }

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject() {
        return JsonTools.toJsonObject(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof SendLocalListRequest))
            return false;
        SendLocalListRequest that = (SendLocalListRequest) obj;
        return Objects.equals(customData, that.customData)
                && Objects.equals(localAuthorizationList, that.localAuthorizationList)
                && Objects.equals(versionNumber, that.versionNumber)
                && updateType == that.updateType;
    }

    @Override
    public int hashCode() {
        int result = (localAuthorizationList != null ? localAuthorizationList.hashCode() : 0);
        result = 31 * result + (versionNumber != null ? versionNumber.hashCode() : 0);
        result = 31 * result + (updateType != null ? updateType.hashCode() : 0);
        result = 31 * result + (customData != null ? customData.hashCode() : 0);
        return result;
    }
}
