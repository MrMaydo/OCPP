package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.BatteryData;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.IdToken;
import maydo.ocpp.msgDef.Enumerations.BatterySwapEventEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.ArrayList;
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

        JsonArray batteryDataArray = new JsonArray();
        for (BatteryData item : getBatteryData()) {
            batteryDataArray.add(item.toJsonObject());
        }
        json.add("batteryData", batteryDataArray);

        json.addProperty("eventType", getEventType().toString());

        json.add("idToken", getIdToken().toJsonObject());

        json.addProperty("requestId", getRequestId());

        if (getCustomData() != null) {
            json.add("customData", getCustomData().toJsonObject());
        }

        return json;
    }

    @Override
    public void fromString(String jsonString) {
        JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
        fromJsonObject(jsonObject);
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        if (jsonObject.has("batteryData")) {
            setBatteryData(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("batteryData");
            for (JsonElement el : arr) {
                BatteryData item = new BatteryData();
                item.fromJsonObject(el.getAsJsonObject());
                getBatteryData().add(item);
            }
        }

        if (jsonObject.has("eventType")) {
            setEventType(BatterySwapEventEnum.valueOf(jsonObject.get("eventType").getAsString()));
        }

        if (jsonObject.has("idToken")) {
            setIdToken(new IdToken());
            getIdToken().fromJsonObject(jsonObject.getAsJsonObject("idToken"));
        }

        if (jsonObject.has("requestId")) {
            setRequestId(jsonObject.get("requestId").getAsInt());
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
        if (!(obj instanceof BatterySwapRequest))
            return false;
        BatterySwapRequest that = (BatterySwapRequest) obj;
        return Objects.equals(getBatteryData(), that.getBatteryData())
                && Objects.equals(getEventType(), that.getEventType())
                && Objects.equals(getIdToken(), that.getIdToken())
                && Objects.equals(getRequestId(), that.getRequestId())
                && Objects.equals(getCustomData(), that.getCustomData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getBatteryData(),
                getEventType(),
                getIdToken(),
                getRequestId(),
                getCustomData()
        );
    }
}
