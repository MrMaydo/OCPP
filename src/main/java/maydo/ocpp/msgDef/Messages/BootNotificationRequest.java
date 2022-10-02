
package maydo.ocpp.msgDef.Messages;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.ChargingStation;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.BootReasonEnum;
import maydo.ocpp.msgDef.JsonInterface;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class BootNotificationRequest implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * Charge_ Point
     * urn:x-oca:ocpp:uid:2:233122
     * The physical system where an Electrical Vehicle (EV) can be charged.
     * 
     * (Required)
     * 
     */
    private ChargingStation chargingStation;
    /**
     * This contains the reason for sending this message to the CSMS.
     * 
     * (Required)
     * 
     */
    private BootReasonEnum reason;

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

    /**
     * Charge_ Point
     * urn:x-oca:ocpp:uid:2:233122
     * The physical system where an Electrical Vehicle (EV) can be charged.
     * 
     * (Required)
     * 
     */
    public ChargingStation getChargingStation() {
        return chargingStation;
    }

    /**
     * Charge_ Point
     * urn:x-oca:ocpp:uid:2:233122
     * The physical system where an Electrical Vehicle (EV) can be charged.
     * 
     * (Required)
     * 
     */
    public void setChargingStation(ChargingStation chargingStation) {
        this.chargingStation = chargingStation;
    }

    /**
     * This contains the reason for sending this message to the CSMS.
     * 
     * (Required)
     * 
     */
    public BootReasonEnum getReason() {
        return reason;
    }

    /**
     * This contains the reason for sending this message to the CSMS.
     * 
     * (Required)
     * 
     */
    public void setReason(BootReasonEnum reason) {
        this.reason = reason;
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
