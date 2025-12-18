package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.Enumerations.ControlModeEnum;
import maydo.ocpp.msgDef.Enumerations.EnergyTransferModeEnum;
import maydo.ocpp.msgDef.Enumerations.MobilityNeedsModeEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import static maydo.ocpp.config.Configuration.DATE_FORMAT;

/**
 *
 */
public class ChargingNeeds implements JsonInterface {

    /**
     * (2.1) Mode of energy transfer requested by the EV.
     */
    @Required
    private EnergyTransferModeEnum requestedEnergyTransfer;

    /**
     * Modes of energy transfer that are marked as available by EV.
     */
    @Optional
    private List<EnergyTransferModeEnum> availableEnergyTransfer;

    /**
     * (2.1) Indicates whether EV wants to operate in Dynamic or Scheduled mode.
     * When absent, Scheduled mode is assumed for backwards compatibility.
     * <p> ISO 15118-20: ServiceSelectionReq(SelectedEnergyTransferService) </p>
     */
    @Optional
    private ControlModeEnum controlMode;

    /**
     * (2.1) Value of EVCC indicates that EV determines min/target SOC and departure time.
     * A value of EVCC_SECC indicates that charging station or CSMS may also update min/target SOC and departure time.
     * <p> ISO 15118-20: ServiceSelectionReq(SelectedEnergyTransferService) </p>
     */
    @Optional
    private MobilityNeedsModeEnum mobilityNeedsMode;

    /**
     * Estimated departure time of the EV.
     * <p> ISO 15118-2: AC/DC_EVChargeParameterType: DepartureTime </p>
     * <p> ISO 15118-20: Dynamic/Scheduled_SEReqControlModeType: DepartureTIme </p>
     */
    @Optional
    private Date departureTime;

    /**
     * (2.1) Discharging and associated price offered by EV.
     * Schedule periods during which EV is willing to discharge have a negative value for power.
     */
    @Optional
    private EVEnergyOffer evEnergyOffer;

    /**
     * EV AC charging parameters.
     */
    @Optional
    private ACChargingParameters acChargingParameters;

    /**
     * EV DC charging parameters
     */
    @Optional
    private DCChargingParameters dcChargingParameters;

    /**
     * (2.1) Additional charging parameters for ISO 15118-20 AC bidirectional sessions with DER control (AC_BPT_DER)
     */
    @Optional
    private DERChargingParameters derChargingParameters;

    /**
     * (2.1) The list of charging parameters that apply to an ISO 15118-20 session
     * or any other session that supports bidirectional charging.
     */
    @Optional
    private V2XChargingParameters v2xChargingParameters;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public ChargingNeeds() {
    }


    public ACChargingParameters getAcChargingParameters() {
        return acChargingParameters;
    }


    public void setAcChargingParameters(ACChargingParameters acChargingParameters) {
        this.acChargingParameters = acChargingParameters;
    }


    public DERChargingParameters getDerChargingParameters() {
        return derChargingParameters;
    }


    public void setDerChargingParameters(DERChargingParameters derChargingParameters) {
        this.derChargingParameters = derChargingParameters;
    }


    public EVEnergyOffer getEvEnergyOffer() {
        return evEnergyOffer;
    }


    public void setEvEnergyOffer(EVEnergyOffer evEnergyOffer) {
        this.evEnergyOffer = evEnergyOffer;
    }


    public EnergyTransferModeEnum getRequestedEnergyTransfer() {
        return requestedEnergyTransfer;
    }


    public void setRequestedEnergyTransfer(EnergyTransferModeEnum requestedEnergyTransfer) {
        this.requestedEnergyTransfer = requestedEnergyTransfer;
    }


    public DCChargingParameters getDcChargingParameters() {
        return dcChargingParameters;
    }


    public void setDcChargingParameters(DCChargingParameters dcChargingParameters) {
        this.dcChargingParameters = dcChargingParameters;
    }


    public V2XChargingParameters getV2xChargingParameters() {
        return v2xChargingParameters;
    }


    public void setV2xChargingParameters(V2XChargingParameters v2xChargingParameters) {
        this.v2xChargingParameters = v2xChargingParameters;
    }


    public List<EnergyTransferModeEnum> getAvailableEnergyTransfer() {
        return availableEnergyTransfer;
    }


    public void setAvailableEnergyTransfer(List<EnergyTransferModeEnum> availableEnergyTransfer) {
        this.availableEnergyTransfer = availableEnergyTransfer;
    }


    public ControlModeEnum getControlMode() {
        return controlMode;
    }


    public void setControlMode(ControlModeEnum controlMode) {
        this.controlMode = controlMode;
    }


    public MobilityNeedsModeEnum getMobilityNeedsMode() {
        return mobilityNeedsMode;
    }


    public void setMobilityNeedsMode(MobilityNeedsModeEnum mobilityNeedsMode) {
        this.mobilityNeedsMode = mobilityNeedsMode;
    }


    public Date getDepartureTime() {
        return departureTime;
    }


    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
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

        json.addProperty("requestedEnergyTransfer", getRequestedEnergyTransfer().toString());

        if (getAvailableEnergyTransfer() != null) {
            JsonArray availableEnergyTransferArray = new JsonArray();
            for (EnergyTransferModeEnum item : getAvailableEnergyTransfer()) {
                availableEnergyTransferArray.add(item.toString());
            }
            json.add("availableEnergyTransfer", availableEnergyTransferArray);
        }
        if (getControlMode() != null) {
            json.addProperty("controlMode", getControlMode().toString());
        }
        if (getMobilityNeedsMode() != null) {
            json.addProperty("mobilityNeedsMode", getMobilityNeedsMode().toString());
        }
        if (getDepartureTime() != null) {
            json.addProperty("departureTime", new SimpleDateFormat(DATE_FORMAT).format(getDepartureTime()));
        }
        if (getEvEnergyOffer() != null) {
            json.add("evEnergyOffer", getEvEnergyOffer().toJsonObject());
        }
        if (getAcChargingParameters() != null) {
            json.add("acChargingParameters", getAcChargingParameters().toJsonObject());
        }
        if (getDcChargingParameters() != null) {
            json.add("dcChargingParameters", getDcChargingParameters().toJsonObject());
        }
        if (getDerChargingParameters() != null) {
            json.add("derChargingParameters", getDerChargingParameters().toJsonObject());
        }
        if (getV2xChargingParameters() != null) {
            json.add("v2xChargingParameters", getV2xChargingParameters().toJsonObject());
        }
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
        if (jsonObject.has("requestedEnergyTransfer")) {
            setRequestedEnergyTransfer(EnergyTransferModeEnum.valueOf(jsonObject.get("requestedEnergyTransfer").getAsString()));
        }

        if (jsonObject.has("availableEnergyTransfer")) {
            setAvailableEnergyTransfer(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("availableEnergyTransfer");
            for (JsonElement el : arr) {
                getAvailableEnergyTransfer().add(EnergyTransferModeEnum.valueOf(el.getAsString()));
            }
        }

        if (jsonObject.has("controlMode")) {
            setControlMode(ControlModeEnum.valueOf(jsonObject.get("controlMode").getAsString()));
        }

        if (jsonObject.has("mobilityNeedsMode")) {
            setMobilityNeedsMode(MobilityNeedsModeEnum.valueOf(jsonObject.get("mobilityNeedsMode").getAsString()));
        }

        if (jsonObject.has("departureTime")) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                setDepartureTime(dateFormat.parse(jsonObject.get("departureTime").getAsString()));
            } catch (ParseException e) {
                System.out.println("Invalid date format for departureTime" + e);
            }
        }

        if (jsonObject.has("evEnergyOffer")) {
            setEvEnergyOffer(new EVEnergyOffer());
            getEvEnergyOffer().fromJsonObject(jsonObject.getAsJsonObject("evEnergyOffer"));
        }

        if (jsonObject.has("acChargingParameters")) {
            setAcChargingParameters(new ACChargingParameters());
            getAcChargingParameters().fromJsonObject(jsonObject.getAsJsonObject("acChargingParameters"));
        }

        if (jsonObject.has("dcChargingParameters")) {
            setDcChargingParameters(new DCChargingParameters());
            getDcChargingParameters().fromJsonObject(jsonObject.getAsJsonObject("dcChargingParameters"));
        }

        if (jsonObject.has("derChargingParameters")) {
            setDerChargingParameters(new DERChargingParameters());
            getDerChargingParameters().fromJsonObject(jsonObject.getAsJsonObject("derChargingParameters"));
        }

        if (jsonObject.has("v2xChargingParameters")) {
            setV2xChargingParameters(new V2XChargingParameters());
            getV2xChargingParameters().fromJsonObject(jsonObject.getAsJsonObject("v2xChargingParameters"));
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
        if (!(obj instanceof ChargingNeeds))
            return false;
        ChargingNeeds that = (ChargingNeeds) obj;
        return Objects.equals(this.acChargingParameters, that.acChargingParameters)
                && Objects.equals(this.controlMode, that.controlMode)
                && Objects.equals(this.departureTime, that.departureTime)
                && Objects.equals(this.evEnergyOffer, that.evEnergyOffer)
                && Objects.equals(this.mobilityNeedsMode, that.mobilityNeedsMode)
                && Objects.equals(this.availableEnergyTransfer, that.availableEnergyTransfer)
                && Objects.equals(this.v2xChargingParameters, that.v2xChargingParameters)
                && Objects.equals(this.dcChargingParameters, that.dcChargingParameters)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.requestedEnergyTransfer, that.requestedEnergyTransfer)
                && Objects.equals(this.derChargingParameters, that.derChargingParameters);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.acChargingParameters != null ? this.acChargingParameters.hashCode() : 0);
        result = 31 * result + (this.controlMode != null ? this.controlMode.hashCode() : 0);
        result = 31 * result + (this.departureTime != null ? this.departureTime.hashCode() : 0);
        result = 31 * result + (this.evEnergyOffer != null ? this.evEnergyOffer.hashCode() : 0);
        result = 31 * result + (this.mobilityNeedsMode != null ? this.mobilityNeedsMode.hashCode() : 0);
        result = 31 * result + (this.availableEnergyTransfer != null ? this.availableEnergyTransfer.hashCode() : 0);
        result = 31 * result + (this.v2xChargingParameters != null ? this.v2xChargingParameters.hashCode() : 0);
        result = 31 * result + (this.dcChargingParameters != null ? this.dcChargingParameters.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.requestedEnergyTransfer != null ? this.requestedEnergyTransfer.hashCode() : 0);
        result = 31 * result + (this.derChargingParameters != null ? this.derChargingParameters.hashCode() : 0);
        return result;
    }
}
