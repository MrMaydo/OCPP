
package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import static maydo.ocpp.config.Configuration.DATE_FORMAT;
import maydo.ocpp.msgDef.Enumerations.EnergyTransferModeEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.utils.JsonTools;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.annotation.Generated;


/**
 * Charging_ Needs
 * urn:x-oca:ocpp:uid:2:233249
 * 
 * 
 */
public class ChargingNeeds implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * AC_ Charging_ Parameters
     * urn:x-oca:ocpp:uid:2:233250
     * EV AC charging parameters.
     * 
     * 
     * 
     */
    private ACChargingParameters acChargingParameters;
    /**
     * DC_ Charging_ Parameters
     * urn:x-oca:ocpp:uid:2:233251
     * EV DC charging parameters
     * 
     * 
     * 
     * 
     */
    private DCChargingParameters dcChargingParameters;
    /**
     * Charging_ Needs. Requested. Energy_ Transfer_ Mode_ Code
     * urn:x-oca:ocpp:uid:1:569209
     * Mode of energy transfer requested by the EV.
     * 
     * (Required)
     * 
     */
    private EnergyTransferModeEnum requestedEnergyTransfer;
    /**
     * Charging_ Needs. Departure_ Time. Date_ Time
     * urn:x-oca:ocpp:uid:1:569223
     * Estimated departure time of the EV.
     * 
     * 
     */
    private Date departureTime;

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
     * AC_ Charging_ Parameters
     * urn:x-oca:ocpp:uid:2:233250
     * EV AC charging parameters.
     * 
     * 
     * 
     */
    public ACChargingParameters getAcChargingParameters() {
        return acChargingParameters;
    }

    /**
     * AC_ Charging_ Parameters
     * urn:x-oca:ocpp:uid:2:233250
     * EV AC charging parameters.
     * 
     * 
     * 
     */
    public void setAcChargingParameters(ACChargingParameters acChargingParameters) {
        this.acChargingParameters = acChargingParameters;
    }

    /**
     * DC_ Charging_ Parameters
     * urn:x-oca:ocpp:uid:2:233251
     * EV DC charging parameters
     * 
     * 
     * 
     * 
     */
    public DCChargingParameters getDcChargingParameters() {
        return dcChargingParameters;
    }

    /**
     * DC_ Charging_ Parameters
     * urn:x-oca:ocpp:uid:2:233251
     * EV DC charging parameters
     * 
     * 
     * 
     * 
     */
    public void setDcChargingParameters(DCChargingParameters dcChargingParameters) {
        this.dcChargingParameters = dcChargingParameters;
    }

    /**
     * Charging_ Needs. Requested. Energy_ Transfer_ Mode_ Code
     * urn:x-oca:ocpp:uid:1:569209
     * Mode of energy transfer requested by the EV.
     * 
     * (Required)
     * 
     */
    public EnergyTransferModeEnum getRequestedEnergyTransfer() {
        return requestedEnergyTransfer;
    }

    /**
     * Charging_ Needs. Requested. Energy_ Transfer_ Mode_ Code
     * urn:x-oca:ocpp:uid:1:569209
     * Mode of energy transfer requested by the EV.
     * 
     * (Required)
     * 
     */
    public void setRequestedEnergyTransfer(EnergyTransferModeEnum requestedEnergyTransfer) {
        this.requestedEnergyTransfer = requestedEnergyTransfer;
    }

    /**
     * Charging_ Needs. Departure_ Time. Date_ Time
     * urn:x-oca:ocpp:uid:1:569223
     * Estimated departure time of the EV.
     * 
     * 
     */
    public Date getDepartureTime() {
        return departureTime;
    }

    /**
     * Charging_ Needs. Departure_ Time. Date_ Time
     * urn:x-oca:ocpp:uid:1:569223
     * Estimated departure time of the EV.
     * 
     * 
     */
    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
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
