
package maydo.ocpp.msgDef.Messages;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.AuthorizationData;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.UpdateEnum;
import maydo.ocpp.msgDef.JsonInterface;

import java.util.List;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class SendLocalListRequest implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    private List<AuthorizationData> localAuthorizationList = null;
    /**
     * In case of a full update this is the version number of the full list. In case of a differential update it is the version number of the list after the update has been applied.
     * 
     * (Required)
     * 
     */
    private Integer versionNumber;
    /**
     * This contains the type of update (full or differential) of this request.
     * 
     * (Required)
     * 
     */
    private UpdateEnum updateType;

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    public CustomData getCustomData() {
        return customData;
    }

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
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
     * 
     * (Required)
     * 
     */
    public Integer getVersionNumber() {
        return versionNumber;
    }

    /**
     * In case of a full update this is the version number of the full list. In case of a differential update it is the version number of the list after the update has been applied.
     * 
     * (Required)
     * 
     */
    public void setVersionNumber(Integer versionNumber) {
        this.versionNumber = versionNumber;
    }

    /**
     * This contains the type of update (full or differential) of this request.
     * 
     * (Required)
     * 
     */
    public UpdateEnum getUpdateType() {
        return updateType;
    }

    /**
     * This contains the type of update (full or differential) of this request.
     * 
     * (Required)
     * 
     */
    public void setUpdateType(UpdateEnum updateType) {
        this.updateType = updateType;
    }

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonElement toJsonObject(){
        JsonElement jsonObject= new Gson().toJsonTree(this);
        return jsonObject;
    }
}
