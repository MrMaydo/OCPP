package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.ChargingStation;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.BootReasonEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.Objects;

public class BootNotificationRequest implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
    /**
     * Charge_ Point
     * urn:x-oca:ocpp:uid:2:233122
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
    public CustomData getCustomData() {
        return customData;
    }

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    public void setCustomData(CustomData customData) {
        this.customData = customData;
    }

    /**
     * Charge_ Point
     * urn:x-oca:ocpp:uid:2:233122
     * The physical system where an Electrical Vehicle (EV) can be charged.
     * <p>
     * (Required)
     */
    public ChargingStation getChargingStation() {
        return chargingStation;
    }

    /**
     * Charge_ Point
     * urn:x-oca:ocpp:uid:2:233122
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
        if (!(obj instanceof BootNotificationRequest))
            return false;
        BootNotificationRequest that = (BootNotificationRequest) obj;
        return Objects.equals(customData, that.customData)
                && Objects.equals(chargingStation, that.chargingStation)
                && reason == that.reason;
    }

    @Override
    public int hashCode() {
        return Objects.hash(customData, chargingStation, reason);
    }
}
