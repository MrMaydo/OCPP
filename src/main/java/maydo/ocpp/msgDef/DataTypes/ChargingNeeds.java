package maydo.ocpp.msgDef.DataTypes;

import maydo.ocpp.msgDef.Enumerations.ControlModeEnum;
import maydo.ocpp.msgDef.Enumerations.EnergyTransferModeEnum;
import maydo.ocpp.msgDef.Enumerations.MobilityNeedsModeEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class ChargingNeeds implements JsonInterface {

    /**
     * EV AC charging parameters for ISO 15118-2
     * 
     */
    @Optional
    private ACChargingParameters acChargingParameters;
    /**
     * *(2.1)* DERChargingParametersType is used in ChargingNeedsType during an ISO 15118-20 session for AC_BPT_DER to report the inverter settings related to DER control that were agreed between EVSE and EV.
     * 
     * Fields starting with "ev" contain values from the EV.
     * Other fields contain a value that is supported by both EV and EVSE.
     * 
     * DERChargingParametersType type is only relevant in case of an ISO 15118-20 AC_BPT_DER/AC_DER charging session.
     * 
     * NOTE: All these fields have values greater or equal to zero (i.e. are non-negative)
     * 
     */
    @Optional
    private DERChargingParameters derChargingParameters;
    /**
     * *(2.1)* A schedule of the energy amount over time that EV is willing to discharge. A negative value indicates the willingness to discharge under specific conditions, a positive value indicates that the EV currently is not able to offer energy to discharge. 
     */
    @Optional
    private EVEnergyOffer evEnergyOffer;
    /**
     * Mode of energy transfer requested by the EV.
     * 
     * (Required)
     */
    @Required
    private EnergyTransferModeEnum requestedEnergyTransfer;
    /**
     * EV DC charging parameters for ISO 15118-2
     */
    @Optional
    private DCChargingParameters dcChargingParameters;
    /**
     * Charging parameters for ISO 15118-20, also supporting V2X charging/discharging.+
     * All values are greater or equal to zero, with the exception of EVMinEnergyRequest, EVMaxEnergyRequest, EVTargetEnergyRequest, EVMinV2XEnergyRequest and EVMaxV2XEnergyRequest.
     */
    @Optional
    private V2XChargingParameters v2xChargingParameters;
    /**
     * *(2.1)* Modes of energy transfer that are marked as available by EV.
     */
    @Optional
    private List<EnergyTransferModeEnum> availableEnergyTransfer;
    /**
     * *(2.1)* Indicates whether EV wants to operate in Dynamic or Scheduled mode. When absent, Scheduled mode is assumed for backwards compatibility. +
     * *ISO 15118-20:* +
     * ServiceSelectionReq(SelectedEnergyTransferService)
     */
    @Optional
    private ControlModeEnum controlMode;
    /**
     * *(2.1)* Value of EVCC indicates that EV determines min/target SOC and departure time. +
     * A value of EVCC_SECC indicates that charging station or CSMS may also update min/target SOC and departure time. +
     * *ISO 15118-20:* +
     * ServiceSelectionReq(SelectedEnergyTransferService)
     */
    @Optional
    private MobilityNeedsModeEnum mobilityNeedsMode;
    /**
     * Estimated departure time of the EV. +
     * *ISO 15118-2:* AC/DC_EVChargeParameterType: DepartureTime +
     * *ISO 15118-20:* Dynamic/Scheduled_SEReqControlModeType: DepartureTIme
     */
    @Optional
    private Date departureTime;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public ChargingNeeds() {
    }

    /**
     * 
     * @param departureTime
     *     Estimated departure time of the EV. +
     *     *ISO 15118-2:* AC/DC_EVChargeParameterType: DepartureTime +
     *     *ISO 15118-20:* Dynamic/Scheduled_SEReqControlModeType: DepartureTIme
     *     .
     * @param availableEnergyTransfer
     *     *(2.1)* Modes of energy transfer that are marked as available by EV.
     *     .
     */
    public ChargingNeeds(ACChargingParameters acChargingParameters, DERChargingParameters derChargingParameters, EVEnergyOffer evEnergyOffer, EnergyTransferModeEnum requestedEnergyTransfer, DCChargingParameters dcChargingParameters, V2XChargingParameters v2xChargingParameters, List<EnergyTransferModeEnum> availableEnergyTransfer, ControlModeEnum controlMode, MobilityNeedsModeEnum mobilityNeedsMode, Date departureTime, CustomData customData) {
        super();
        this.acChargingParameters = acChargingParameters;
        this.derChargingParameters = derChargingParameters;
        this.evEnergyOffer = evEnergyOffer;
        this.requestedEnergyTransfer = requestedEnergyTransfer;
        this.dcChargingParameters = dcChargingParameters;
        this.v2xChargingParameters = v2xChargingParameters;
        this.availableEnergyTransfer = availableEnergyTransfer;
        this.controlMode = controlMode;
        this.mobilityNeedsMode = mobilityNeedsMode;
        this.departureTime = departureTime;
        this.customData = customData;
    }

    /**
     * EV AC charging parameters for ISO 15118-2
     * 
     */
    public ACChargingParameters getAcChargingParameters() {
        return acChargingParameters;
    }

    /**
     * EV AC charging parameters for ISO 15118-2
     * 
     */
    public void setAcChargingParameters(ACChargingParameters acChargingParameters) {
        this.acChargingParameters = acChargingParameters;
    }

    /**
     * *(2.1)* DERChargingParametersType is used in ChargingNeedsType during an ISO 15118-20 session for AC_BPT_DER to report the inverter settings related to DER control that were agreed between EVSE and EV.
     * 
     * Fields starting with "ev" contain values from the EV.
     * Other fields contain a value that is supported by both EV and EVSE.
     * 
     * DERChargingParametersType type is only relevant in case of an ISO 15118-20 AC_BPT_DER/AC_DER charging session.
     * 
     * NOTE: All these fields have values greater or equal to zero (i.e. are non-negative)
     * 
     */
    public DERChargingParameters getDerChargingParameters() {
        return derChargingParameters;
    }

    /**
     * *(2.1)* DERChargingParametersType is used in ChargingNeedsType during an ISO 15118-20 session for AC_BPT_DER to report the inverter settings related to DER control that were agreed between EVSE and EV.
     * 
     * Fields starting with "ev" contain values from the EV.
     * Other fields contain a value that is supported by both EV and EVSE.
     * 
     * DERChargingParametersType type is only relevant in case of an ISO 15118-20 AC_BPT_DER/AC_DER charging session.
     * 
     * NOTE: All these fields have values greater or equal to zero (i.e. are non-negative)
     * 
     */
    public void setDerChargingParameters(DERChargingParameters derChargingParameters) {
        this.derChargingParameters = derChargingParameters;
    }

    /**
     * *(2.1)* A schedule of the energy amount over time that EV is willing to discharge. A negative value indicates the willingness to discharge under specific conditions, a positive value indicates that the EV currently is not able to offer energy to discharge. 
     */
    public EVEnergyOffer getEvEnergyOffer() {
        return evEnergyOffer;
    }

    /**
     * *(2.1)* A schedule of the energy amount over time that EV is willing to discharge. A negative value indicates the willingness to discharge under specific conditions, a positive value indicates that the EV currently is not able to offer energy to discharge. 
     */
    public void setEvEnergyOffer(EVEnergyOffer evEnergyOffer) {
        this.evEnergyOffer = evEnergyOffer;
    }

    /**
     * Mode of energy transfer requested by the EV.
     * 
     * (Required)
     */
    public EnergyTransferModeEnum getRequestedEnergyTransfer() {
        return requestedEnergyTransfer;
    }

    /**
     * Mode of energy transfer requested by the EV.
     * 
     * (Required)
     */
    public void setRequestedEnergyTransfer(EnergyTransferModeEnum requestedEnergyTransfer) {
        this.requestedEnergyTransfer = requestedEnergyTransfer;
    }

    /**
     * EV DC charging parameters for ISO 15118-2
     */
    public DCChargingParameters getDcChargingParameters() {
        return dcChargingParameters;
    }

    /**
     * EV DC charging parameters for ISO 15118-2
     */
    public void setDcChargingParameters(DCChargingParameters dcChargingParameters) {
        this.dcChargingParameters = dcChargingParameters;
    }

    /**
     * Charging parameters for ISO 15118-20, also supporting V2X charging/discharging.+
     * All values are greater or equal to zero, with the exception of EVMinEnergyRequest, EVMaxEnergyRequest, EVTargetEnergyRequest, EVMinV2XEnergyRequest and EVMaxV2XEnergyRequest.
     */
    public V2XChargingParameters getV2xChargingParameters() {
        return v2xChargingParameters;
    }

    /**
     * Charging parameters for ISO 15118-20, also supporting V2X charging/discharging.+
     * All values are greater or equal to zero, with the exception of EVMinEnergyRequest, EVMaxEnergyRequest, EVTargetEnergyRequest, EVMinV2XEnergyRequest and EVMaxV2XEnergyRequest.
     */
    public void setV2xChargingParameters(V2XChargingParameters v2xChargingParameters) {
        this.v2xChargingParameters = v2xChargingParameters;
    }

    /**
     * *(2.1)* Modes of energy transfer that are marked as available by EV.
     */
    public List<EnergyTransferModeEnum> getAvailableEnergyTransfer() {
        return availableEnergyTransfer;
    }

    /**
     * *(2.1)* Modes of energy transfer that are marked as available by EV.
     */
    public void setAvailableEnergyTransfer(List<EnergyTransferModeEnum> availableEnergyTransfer) {
        this.availableEnergyTransfer = availableEnergyTransfer;
    }

    /**
     * *(2.1)* Indicates whether EV wants to operate in Dynamic or Scheduled mode. When absent, Scheduled mode is assumed for backwards compatibility. +
     * *ISO 15118-20:* +
     * ServiceSelectionReq(SelectedEnergyTransferService)
     */
    public ControlModeEnum getControlMode() {
        return controlMode;
    }

    /**
     * *(2.1)* Indicates whether EV wants to operate in Dynamic or Scheduled mode. When absent, Scheduled mode is assumed for backwards compatibility. +
     * *ISO 15118-20:* +
     * ServiceSelectionReq(SelectedEnergyTransferService)
     */
    public void setControlMode(ControlModeEnum controlMode) {
        this.controlMode = controlMode;
    }

    /**
     * *(2.1)* Value of EVCC indicates that EV determines min/target SOC and departure time. +
     * A value of EVCC_SECC indicates that charging station or CSMS may also update min/target SOC and departure time. +
     * *ISO 15118-20:* +
     * ServiceSelectionReq(SelectedEnergyTransferService)
     */
    public MobilityNeedsModeEnum getMobilityNeedsMode() {
        return mobilityNeedsMode;
    }

    /**
     * *(2.1)* Value of EVCC indicates that EV determines min/target SOC and departure time. +
     * A value of EVCC_SECC indicates that charging station or CSMS may also update min/target SOC and departure time. +
     * *ISO 15118-20:* +
     * ServiceSelectionReq(SelectedEnergyTransferService)
     */
    public void setMobilityNeedsMode(MobilityNeedsModeEnum mobilityNeedsMode) {
        this.mobilityNeedsMode = mobilityNeedsMode;
    }

    /**
     * Estimated departure time of the EV. +
     * *ISO 15118-2:* AC/DC_EVChargeParameterType: DepartureTime +
     * *ISO 15118-20:* Dynamic/Scheduled_SEReqControlModeType: DepartureTIme
     */
    public Date getDepartureTime() {
        return departureTime;
    }

    /**
     * Estimated departure time of the EV. +
     * *ISO 15118-2:* AC/DC_EVChargeParameterType: DepartureTime +
     * *ISO 15118-20:* Dynamic/Scheduled_SEReqControlModeType: DepartureTIme
     */
    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
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
        return null;
    }

    @Override
    public void fromString(String jsonString) {
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
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
