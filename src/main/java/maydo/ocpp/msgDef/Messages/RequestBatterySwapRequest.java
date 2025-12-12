package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.IdToken;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 *
 */
public class RequestBatterySwapRequest implements JsonInterface {

    /**
     * Id token of EV driver.
     */
    @Required
    private IdToken idToken;

    /**
     * Request id to match with BatterySwapRequest.
     */
    @Required
    private Integer requestId;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public RequestBatterySwapRequest() {
    }


    public IdToken getIdToken() {
        return idToken;
    }


    public void setIdToken(IdToken idToken) {
        this.idToken = idToken;
    }


    public Integer getRequestId() {
        return requestId;
    }


    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
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
        json.addProperty("requestId", requestId);
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
            this.idToken = new IdToken();
            this.idToken.fromJsonObject(jsonObject.getAsJsonObject("idToken"));
        }

        if (jsonObject.has("requestId")) {
            this.requestId = jsonObject.get("requestId").getAsInt();
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
        if (!(obj instanceof RequestBatterySwapRequest))
            return false;
        RequestBatterySwapRequest that = (RequestBatterySwapRequest) obj;
        return Objects.equals(this.idToken, that.idToken)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.idToken != null ? this.idToken.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.requestId != null ? this.requestId.hashCode() : 0);
        return result;
    }
}
