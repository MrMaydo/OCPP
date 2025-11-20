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

public class BootNotificationRequest implements JsonInterface {

    /**
     * The physical system where an Electrical Vehicle (EV) can be charged.
     * <p>
     * (Required)
     */
    @Required
    private ChargingStation chargingStation;
    /**
     * This contains the reason for sending this message to the CSMS.
     * <p>
     * (Required)
     */
    @Required
    private BootReasonEnum reason;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public BootNotificationRequest() {
    }

    public BootNotificationRequest(ChargingStation chargingStation, BootReasonEnum reason, CustomData customData) {
        super();
        this.chargingStation = chargingStation;
        this.reason = reason;
        this.customData = customData;
    }

    /**
     * The physical system where an Electrical Vehicle (EV) can be charged.
     * <p>
     * (Required)
     */
    public ChargingStation getChargingStation() {
        return chargingStation;
    }

    /**
     * The physical system where an Electrical Vehicle (EV) can be charged.
     * <p>
     * (Required)
     */
    public void setChargingStation(ChargingStation chargingStation) {
        this.chargingStation = chargingStation;
    }

    /**
     * This contains the reason for sending this message to the CSMS.
     * <p>
     * (Required)
     */
    public BootReasonEnum getReason() {
        return reason;
    }

    /**
     * This contains the reason for sending this message to the CSMS.
     * <p>
     * (Required)
     */
    public void setReason(BootReasonEnum reason) {
        this.reason = reason;
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
        JsonObject json = new JsonObject();
        json.add("chargingStation", chargingStation.toJsonObject());
        json.addProperty("reason", reason.toString());
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
        if (jsonObject.has("chargingStation")) {
            this.chargingStation = new ChargingStation();
            this.chargingStation.fromJsonObject(jsonObject.getAsJsonObject("chargingStation"));
        }

        if (jsonObject.has("reason")) {
            this.reason = BootReasonEnum.valueOf(jsonObject.get("reason").getAsString());
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
