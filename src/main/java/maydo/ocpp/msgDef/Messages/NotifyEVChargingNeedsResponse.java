
package maydo.ocpp.msgDef.Messages;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.NotifyEVChargingNeedsStatusEnum;
import maydo.ocpp.msgDef.DataTypes.StatusInfo;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.utils.JsonTools;

import javax.annotation.Generated;

public class NotifyEVChargingNeedsResponse implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * Returns whether the CSMS has been able to process the message successfully. It does not imply that the evChargingNeeds can be met with the current charging profile.
     * 
     * (Required)
     * 
     */
    private NotifyEVChargingNeedsStatusEnum status;
    /**
     * Element providing more information about the status.
     * 
     * 
     */
    private StatusInfo statusInfo;

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
     * Returns whether the CSMS has been able to process the message successfully. It does not imply that the evChargingNeeds can be met with the current charging profile.
     * 
     * (Required)
     * 
     */
    public NotifyEVChargingNeedsStatusEnum getStatus() {
        return status;
    }

    /**
     * Returns whether the CSMS has been able to process the message successfully. It does not imply that the evChargingNeeds can be met with the current charging profile.
     * 
     * (Required)
     * 
     */
    public void setStatus(NotifyEVChargingNeedsStatusEnum status) {
        this.status = status;
    }

    /**
     * Element providing more information about the status.
     * 
     * 
     */
    public StatusInfo getStatusInfo() {
        return statusInfo;
    }

    /**
     * Element providing more information about the status.
     * 
     * 
     */
    public void setStatusInfo(StatusInfo statusInfo) {
        this.statusInfo = statusInfo;
    }

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject(){
        return JsonTools.toJsonObject(this);
    }
}
