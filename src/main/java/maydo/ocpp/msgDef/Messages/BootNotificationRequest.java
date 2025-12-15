package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.ChargingStation;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.BootReasonEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * This contains the field definition of the BootNotificationRequest PDU sent by the Charging Station to the CSMS.
 */
public class BootNotificationRequest implements JsonInterface {

    /**
     * Identifies the Charging Station
     */
    @Required
    private ChargingStation chargingStation;

    /**
     * This contains the reason for sending this message to the CSMS.
     */
    @Required
    private BootReasonEnum reason;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public BootNotificationRequest() {
    }


    public ChargingStation getChargingStation() {
        return chargingStation;
    }


    public void setChargingStation(ChargingStation chargingStation) {
        this.chargingStation = chargingStation;
    }


    public BootReasonEnum getReason() {
        return reason;
    }


    public void setReason(BootReasonEnum reason) {
        this.reason = reason;
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

        json.add("chargingStation", getChargingStation().toJsonObject());

        json.addProperty("reason", getReason().toString());

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
        if (jsonObject.has("chargingStation")) {
            setChargingStation(new ChargingStation());
            getChargingStation().fromJsonObject(jsonObject.getAsJsonObject("chargingStation"));
        }

        if (jsonObject.has("reason")) {
            setReason(BootReasonEnum.valueOf(jsonObject.get("reason").getAsString()));
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
        if (!(obj instanceof BootNotificationRequest))
            return false;
        BootNotificationRequest that = (BootNotificationRequest) obj;
        return Objects.equals(this.reason, that.reason)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.chargingStation, that.chargingStation);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.reason != null ? this.reason.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.chargingStation != null ? this.chargingStation.hashCode() : 0);
        return result;
    }
}
