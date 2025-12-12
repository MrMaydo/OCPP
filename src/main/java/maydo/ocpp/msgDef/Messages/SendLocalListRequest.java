package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.AuthorizationData;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.UpdateEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.List;
import java.util.Objects;

/**
 * This contains the field definition of the SendLocalListRequest PDU sent by the CSMS to the Charging Station.
 * If no (empty) localAuthorizationList is given and the updateType is Full, all IdTokens are removed from the list.
 * Requesting a Differential update without or with empty localAuthorizationList will have no effect on the list.
 * All IdTokens in the localAuthorizationList MUST be unique, no duplicate values are allowed.
 */
public class SendLocalListRequest implements JsonInterface {

    /**
     * This contains the Local Authorization List entries.
     */
    @Optional
    private List<AuthorizationData> localAuthorizationList;

    /**
     * In case of a full update this is the version number of the full list.
     * In case of a differential update it is the version number of the list after the update has been applied.
     */
    @Required
    private Integer versionNumber;

    /**
     * This contains the type of update (full or differential) of this request.
     */
    @Required
    private UpdateEnum updateType;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public SendLocalListRequest() {
    }


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


    public Integer getVersionNumber() {
        return versionNumber;
    }


    public void setVersionNumber(Integer versionNumber) {
        this.versionNumber = versionNumber;
    }


    public UpdateEnum getUpdateType() {
        return updateType;
    }


    public void setUpdateType(UpdateEnum updateType) {
        this.updateType = updateType;
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
        json.addProperty("versionNumber", versionNumber);
        json.addProperty("updateType", updateType.toString());
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
        if (jsonObject.has("versionNumber")) {
            this.versionNumber = jsonObject.get("versionNumber").getAsInt();
        }

        if (jsonObject.has("updateType")) {
            this.updateType = UpdateEnum.valueOf(jsonObject.get("updateType").getAsString());
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
