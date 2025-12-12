package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.BatteryData;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.IdToken;
import maydo.ocpp.msgDef.Enumerations.BatterySwapEventEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.List;
import java.util.Objects;

/**
 * (2.1) Message sent by Charging Station when a battery is swapped in or out of a battery swap station.
 */
public class BatterySwapRequest implements JsonInterface {

    /**
     * Info on batteries inserted or taken out.
     */
    @Required
    private List<BatteryData> batteryData;

    /**
     * Battery in/out
     */
    @Required
    private BatterySwapEventEnum eventType;

    /**
     * Id token of EV Driver
     */
    @Required
    private IdToken idToken;

    /**
     * RequestId to correlate BatteryIn/Out events and optional RequestBatterySwapRequest.
     */
    @Required
    private Integer requestId;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public BatterySwapRequest() {
    }


    public BatterySwapRequest(List<BatteryData> batteryData, BatterySwapEventEnum eventType, IdToken idToken, Integer requestId, CustomData customData) {
        super();
        this.batteryData = batteryData;
        this.eventType = eventType;
        this.idToken = idToken;
        this.requestId = requestId;
        this.customData = customData;
    }


    public List<BatteryData> getBatteryData() {
        return batteryData;
    }


    public void setBatteryData(List<BatteryData> batteryData) {
        this.batteryData = batteryData;
    }


    public BatterySwapEventEnum getEventType() {
        return eventType;
    }


    public void setEventType(BatterySwapEventEnum eventType) {
        this.eventType = eventType;
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
        json.addProperty("eventType", eventType.toString());
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
        if (jsonObject.has("eventType")) {
            this.eventType = BatterySwapEventEnum.valueOf(jsonObject.get("eventType").getAsString());
        }

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
        if (!(obj instanceof BatterySwapRequest))
            return false;
        BatterySwapRequest that = (BatterySwapRequest) obj;
        return Objects.equals(this.idToken, that.idToken)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.eventType, that.eventType)
                && Objects.equals(this.batteryData, that.batteryData)
                && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.idToken != null ? this.idToken.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.eventType != null ? this.eventType.hashCode() : 0);
        result = 31 * result + (this.batteryData != null ? this.batteryData.hashCode() : 0);
        result = 31 * result + (this.requestId != null ? this.requestId.hashCode() : 0);
        return result;
    }
}
