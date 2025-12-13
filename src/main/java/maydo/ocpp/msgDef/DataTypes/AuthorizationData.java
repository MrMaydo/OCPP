package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;


/**
 * Contains the identifier to use for authorization.
 */
public class AuthorizationData implements JsonInterface {

    /**
     * This contains the identifier which needs to be stored for authorization.
     */
    @Required
    private IdToken idToken;

    /**
     * Required when UpdateType is Full. This contains information about authorization status, expiry and group id.
     * For a Differential update the following applies:
     * <p> If this element is present, then this entry SHALL be added or updated in the Local Authorization List. </p>
     * <p> If this element is absent, the entry for this IdToken in the Local Authorization List SHALL be deleted. </p>
     */
    @Optional
    private IdTokenInfo idTokenInfo;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public AuthorizationData() {
    }


    public IdToken getIdToken() {
        return idToken;
    }


    public void setIdToken(IdToken idToken) {
        this.idToken = idToken;
    }


    public IdTokenInfo getIdTokenInfo() {
        return idTokenInfo;
    }


    public void setIdTokenInfo(IdTokenInfo idTokenInfo) {
        this.idTokenInfo = idTokenInfo;
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
        json.add("idToken", idToken.toJsonObject());
        json.add("idTokenInfo", idTokenInfo.toJsonObject());
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
        if (jsonObject.has("idToken")) {
            setIdToken(new IdToken());
            getIdToken().fromJsonObject(jsonObject.getAsJsonObject("idToken"));
        }

        if (jsonObject.has("idTokenInfo")) {
            setIdTokenInfo(new IdTokenInfo());
            getIdTokenInfo().fromJsonObject(jsonObject.getAsJsonObject("idTokenInfo"));
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
        if (!(obj instanceof AuthorizationData))
            return false;
        AuthorizationData that = (AuthorizationData) obj;
        return Objects.equals(this.idToken, that.idToken)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.idTokenInfo, that.idTokenInfo);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.idToken != null ? this.idToken.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.idTokenInfo != null ? this.idTokenInfo.hashCode() : 0);
        return result;
    }
}
