package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.Enumerations.DERControlEnum;
import maydo.ocpp.msgDef.Enumerations.IslandingDetectionEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * (2.1) DERChargingParametersType is used in ChargingNeedsType during an ISO 15118-20 session
 * for AC_BPT_DER to report the inverter settings related to DER control that were agreed between EVSE and EV.
 * Fields starting with "ev" contain values from the EV. Other fields contain a value that is supported by both EV and EVSE.
 * DERChargingParametersType type is only relevant in case of an ISO 15118-20 AC_BPT_DER/AC_DER charging session.
 */
public class DERChargingParameters implements JsonInterface {

    /**
     * DER control functions supported by EV.
     * <p> ISO 15118-20: DER_BPT_AC_CPDReqEnergyTransferModeType:DERCon trolFunctions (bitmap)
     */
    @Optional
    private List<DERControlEnum> evSupportedDERControl;

    /**
     * Rated maximum injected active power by EV, at specified over-excited power factor (overExcitedPowerFactor).
     * It can also be defined as the rated maximum discharge power at the rated minimum injected reactive power value.
     * This means that if the EV is providing reactive power support, and it is requested to discharge at max power
     * (e.g. to satisfy an EMS request), the EV may override the request
     * and discharge up to overExcitedMaximumDischargePower to meet the minimum reactive power requirements.
     * Corresponds to the WOvPF attribute in IEC 61850.
     * <p> ISO 15118-20: DER_BPT_AC_CPDReqEnergyTransferModeType: EVOverExcitedMaximumDischargePower </p>
     */
    @Optional
    private Float evOverExcitedMaxDischargePower;

    /**
     * EV power factor when injecting (over excited) the minimum reactive power.
     * Corresponds to the OvPF attribute in IEC 61850.
     * <p> ISO 15118-20: DER_BPT_AC_CPDReqEnergyTransferModeType: EVOverExcitedPowerFactor </p>
     */
    @Optional
    private Float evOverExcitedPowerFactor;

    /**
     * Rated maximum injected active power by EV supported at specified under-excited power factor (EVUnderExcitedPowerFactor).
     * It can also be defined as the rated maximum dischargePower at the rated minimum absorbed reactive power value.
     * This means that if the EV is providing reactive power support,
     * and it is requested to discharge at max power (e.g. to satisfy an EMS request),
     * the EV may override the request and discharge up to underExcitedMaximumDischargePower
     * to meet the minimum reactive power requirements. This corresponds to the WUnPF attribute in the IEC 61850.
     * <p> ISO 15118-20: DER_BPT_AC_CPDReqEnergyTransferModeType: EVUnderExcitedMaximumDischargePower </p>
     */
    @Optional
    private Float evUnderExcitedMaxDischargePower;

    /**
     * EV power factor when injecting (under excited) the minimum reactive power.
     * Corresponds to the OvPF attribute in IEC 61850.
     * <p> ISO 15118-20: DER_BPT_AC_CPDReqEnergyTransferModeType: EVUnderExcitedPowerFactor </p>
     */
    @Optional
    private Float evUnderExcitedPowerFactor;

    /**
     * Rated maximum total apparent power, defined by min(EV, EVSE) in va. Corresponds to the VAMaxRtg in IEC 61850.
     * <p> ISO 15118-20: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumApparentPower </p>
     */
    @Optional
    private Float maxApparentPower;

    /**
     * Rated maximum absorbed apparent power, defined by min(EV, EVSE) in va.
     * This field represents the sum of all phases, unless values are provided for L2 and L3,
     * in which case this field represents phase L1. Corresponds to the ChaVAMaxRtg in IEC 61850.
     * <p> ISO 15118-20: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumChargeApparentPower </p>
     */
    @Optional
    private Float maxChargeApparentPower;

    /**
     * Rated maximum absorbed apparent power on phase L2, defined by min(EV, EVSE) in va.
     * Corresponds to the ChaVAMaxRtg in IEC 61850.
     * <p> ISO 15118-20: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumChargeApparentPower_L2 </p>
     */
    @Optional
    private Float maxChargeApparentPowerL2;

    /**
     * Rated maximum absorbed apparent power on phase L3, defined by min(EV, EVSE) in va.
     * Corresponds to the ChaVAMaxRtg in IEC 61850.
     * <p> ISO 15118-20: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumChargeApparentPower_L3
     */
    @Optional
    private Float maxChargeApparentPowerL3;

    /**
     * Rated maximum injected apparent power, defined by min(EV, EVSE) in va.
     * This field represents the sum of all phases, unless values are provided for L2 and L3,
     * in which case this field represents phase L1. Corresponds to the DisVAMaxRtg in IEC 61850.
     * <p> ISO 15118-20: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumDischargeApparentPower </p>
     */
    @Optional
    private Float maxDischargeApparentPower;

    /**
     * Rated maximum injected apparent power on phase L2, defined by min(EV, EVSE) in va.
     * Corresponds to the DisVAMaxRtg in IEC 61850.
     * <p> ISO 15118-20: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumDischargeApparentPower_L2 </p>
     */
    @Optional
    private Float maxDischargeApparentPowerL2;

    /**
     * Rated maximum injected apparent power on phase L3, defined by min(EV, EVSE) in va.
     * Corresponds to the DisVAMaxRtg in IEC 61850.
     * <p> ISO 15118-20: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumDischargeApparentPower_L3 </p>
     */
    @Optional
    private Float maxDischargeApparentPowerL3;

    /**
     * Rated maximum absorbed reactive power, defined by min(EV, EVSE), in vars.
     * This field represents the sum of all phases, unless values are provided for L2 and L3,
     * in which case this field represents phase L1. Corresponds to the AvarMax attribute in the IEC 61850.
     * <p> ISO 15118-20: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumChargeReactivePower </p>
     */
    @Optional
    private Float maxChargeReactivePower;

    /**
     * Rated maximum absorbed reactive power, defined by min(EV, EVSE), in vars on phase L2.
     * Corresponds to the AvarMax attribute in the IEC 61850.
     * <p> ISO 15118-20: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumChargeReactivePower_L2 </p>
     */
    @Optional
    private Float maxChargeReactivePowerL2;

    /**
     * Rated maximum absorbed reactive power, defined by min(EV, EVSE), in vars on phase L3.
     * Corresponds to the AvarMax attribute in the IEC 61850.
     * <p> ISO 15118-20: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumChargeReactivePower_L3 </p>
     */
    @Optional
    private Float maxChargeReactivePowerL3;

    /**
     * Rated minimum absorbed reactive power, defined by max(EV, EVSE), in vars.
     * This field represents the sum of all phases, unless values are provided for L2 and L3,
     * in which case this field represents phase L1.
     * <p> ISO 15118-20: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMinimumChargeReactivePower </p>
     */
    @Optional
    private Float minChargeReactivePower;

    /**
     * Rated minimum absorbed reactive power, defined by max(EV, EVSE), in vars on phase L2.
     * <p> ISO 15118-20: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMinimumChargeReactivePower_L2 </p>
     */
    @Optional
    private Float minChargeReactivePowerL2;

    /**
     * Rated minimum absorbed reactive power, defined by max(EV, EVSE), in vars on phase L3.
     * <p> ISO 15118-20: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMinimumChargeReactivePower_L3 </p>
     */
    @Optional
    private Float minChargeReactivePowerL3;

    /**
     * Rated maximum injected reactive power, defined by min(EV, EVSE), in vars.
     * This field represents the sum of all phases, unless values are provided for L2 and L3,
     * in which case this field represents phase L1. Corresponds to the IvarMax attribute in the IEC 61850.
     * <p> ISO 15118-20: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumDischargeReactivePower </p>
     */
    @Optional
    private Float maxDischargeReactivePower;

    /**
     * Rated maximum injected reactive power, defined by min(EV, EVSE), in vars on phase L2.
     * Corresponds to the IvarMax attribute in the IEC 61850.
     * <p> ISO 15118-20: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumDischargeReactivePower_L2 </p>
     */
    @Optional
    private Float maxDischargeReactivePowerL2;

    /**
     * Rated maximum injected reactive power, defined by min(EV, EVSE), in vars on phase L3.
     * Corresponds to the IvarMax attribute in the IEC 61850.
     * <p> ISO 15118-20: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumDischargeReactivePower_L3 </p>
     */
    @Optional
    private Float maxDischargeReactivePowerL3;

    /**
     * Rated minimum injected reactive power, defined by max(EV, EVSE), in vars.
     * This field represents the sum of all phases, unless values are provided for L2 and L3,
     * in which case this field represents phase L1.
     * <p> ISO 15118-20: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMinimumDischargeReactivePower </p>
     */
    @Optional
    private Float minDischargeReactivePower;

    /**
     * Rated minimum injected reactive power, defined by max(EV, EVSE), in var on phase L2.
     * <p> ISO 15118-20: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMinimumDischargeReactivePower_L2 </p>
     */
    @Optional
    private Float minDischargeReactivePowerL2;

    /**
     * Rated minimum injected reactive power, defined by max(EV, EVSE), in var on phase L3.
     * <p> ISO 15118-20: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMinimumDischargeReactivePower_L3 </p>
     */
    @Optional
    private Float minDischargeReactivePowerL3;

    /**
     * Line voltage supported by EVSE and EV.
     * <p> ISO 15118-20: DER_BPT_AC_CPDReqEnergyTransferModeType: EVNominalVoltage </p>
     */
    @Optional
    private Float nominalVoltage;

    /**
     * The nominal AC voltage (rms) offset between the Charging Station’s electrical connection point
     * and the utility’s point of common coupling.
     * <p> ISO 15118-20: DER_BPT_AC_CPDReqEnergyTransferModeType: EVNominalVoltageOffset </p>
     */
    @Optional
    private Float nominalVoltageOffset;

    /**
     * Maximum AC rms voltage, as defined by min(EV, EVSE) to operate with.
     * <p> ISO 15118-20: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumNominalVoltage </p>
     */
    @Optional
    private Float maxNominalVoltage;

    /**
     * Minimum AC rms voltage, as defined by max(EV, EVSE) to operate with.
     * <p> ISO 15118-20: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMinimumNominalVoltage </p>
     */
    @Optional
    private Float minNominalVoltage;

    /**
     * Manufacturer of the EV inverter.
     * <p> ISO 15118-20: DER_BPT_AC_CPDReqEnergyTransferModeType: EVInverterManufacturer </p>
     */
    @Optional
    private String evInverterManufacturer;

    /**
     * Model name of the EV inverter.
     * <p> ISO 15118-20: DER_BPT_AC_CPDReqEnergyTransferModeType: EVInverterModel </p>
     */
    @Optional
    private String evInverterModel;

    /**
     * Serial number of the EV inverter.
     * <p> ISO 15118-20: DER_BPT_AC_CPDReqEnergyTransferModeType: EVInverterSerialNumber </p>
     */
    @Optional
    private String evInverterSerialNumber;

    /**
     * Software version of EV inverter.
     * <p> ISO 15118-20: DER_BPT_AC_CPDReqEnergyTransferModeType: EVInverterSwVersion </p>
     */
    @Optional
    private String evInverterSwVersion;

    /**
     * Hardware version of EV inverter.
     * <p> ISO 15118-20: DER_BPT_AC_CPDReqEnergyTransferModeType: EVInverterHwVersion </p>
     */
    @Optional
    private String evInverterHwVersion;

    /**
     * Type of islanding detection method.
     * Only mandatory when islanding detection is required at the site, as set in the ISO 15118 Service Details configuration.
     * <p> ISO 15118-20: DER_BPT_AC_CPDReqEnergyTransferModeType: EVIslandingDetectionMethod </p>
     */
    @Optional
    private List<IslandingDetectionEnum> evIslandingDetectionMethod;

    /**
     * Time after which EV will trip if an island has been detected.
     * <p> ISO 15118-20: DER_BPT_AC_CPDReqEnergyTransferModeType: EVIslandingTripTime </p>
     */
    @Optional
    private Float evIslandingTripTime;

    /**
     * Maximum injected DC current allowed at level 1 charging.
     * <p> ISO 15118-20: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumLevel1DCInjection </p>
     */
    @Optional
    private Float evMaximumLevel1DCInjection;

    /**
     * Maximum allowed duration of DC injection at level 1 charging.
     * <p> ISO 15118-20: DER_BPT_AC_CPDReqEnergyTransferModeType: EVDurationLevel1DCInjection </p>
     */
    @Optional
    private Float evDurationLevel1DCInjection;

    /**
     * Maximum injected DC current allowed at level 2 charging.
     * <p> ISO 15118-20: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumLevel2DCInjection </p>
     */
    @Optional
    private Float evMaximumLevel2DCInjection;

    /**
     * Maximum allowed duration of DC injection at level 2 charging.
     * <p> ISO 15118-20: DER_BPT_AC_CPDReqEnergyTransferModeType: EVDurationLevel2DCInjection </p>
     */
    @Optional
    private Float evDurationLevel2DCInjection;

    /**
     * Measure of the susceptibility of the circuit to reactance, in Siemens (S).
     * <p> ISO 15118-20: DER_BPT_AC_CPDReqEnergyTransferModeType: EVReactiveSusceptance </p>
     */
    @Optional
    private Float evReactiveSusceptance;

    /**
     * Total energy value, in Wh, that EV is allowed to provide during the entire V2G session.
     * The value is independent of the V2X Cycling area.
     * Once this value reaches the value of 0, the EV may block any attempt to discharge in order to protect the battery health.
     * <p> ISO 15118-20: DER_BPT_AC_CPDReqEnergyTransferModeType: EVSessionTotalDischargeEnergyAvailable </p>
     */
    @Optional
    private Float evSessionTotalDischargeEnergyAvailable;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public DERChargingParameters() {
    }


    public List<DERControlEnum> getEvSupportedDERControl() {
        return evSupportedDERControl;
    }


    public void setEvSupportedDERControl(List<DERControlEnum> evSupportedDERControl) {
        this.evSupportedDERControl = evSupportedDERControl;
    }


    public Float getEvOverExcitedMaxDischargePower() {
        return evOverExcitedMaxDischargePower;
    }


    public void setEvOverExcitedMaxDischargePower(Float evOverExcitedMaxDischargePower) {
        this.evOverExcitedMaxDischargePower = evOverExcitedMaxDischargePower;
    }


    public Float getEvOverExcitedPowerFactor() {
        return evOverExcitedPowerFactor;
    }


    public void setEvOverExcitedPowerFactor(Float evOverExcitedPowerFactor) {
        this.evOverExcitedPowerFactor = evOverExcitedPowerFactor;
    }


    public Float getEvUnderExcitedMaxDischargePower() {
        return evUnderExcitedMaxDischargePower;
    }


    public void setEvUnderExcitedMaxDischargePower(Float evUnderExcitedMaxDischargePower) {
        this.evUnderExcitedMaxDischargePower = evUnderExcitedMaxDischargePower;
    }


    public Float getEvUnderExcitedPowerFactor() {
        return evUnderExcitedPowerFactor;
    }


    public void setEvUnderExcitedPowerFactor(Float evUnderExcitedPowerFactor) {
        this.evUnderExcitedPowerFactor = evUnderExcitedPowerFactor;
    }


    public Float getMaxApparentPower() {
        return maxApparentPower;
    }


    public void setMaxApparentPower(Float maxApparentPower) {
        this.maxApparentPower = maxApparentPower;
    }


    public Float getMaxChargeApparentPower() {
        return maxChargeApparentPower;
    }


    public void setMaxChargeApparentPower(Float maxChargeApparentPower) {
        this.maxChargeApparentPower = maxChargeApparentPower;
    }


    public Float getMaxChargeApparentPowerL2() {
        return maxChargeApparentPowerL2;
    }


    public void setMaxChargeApparentPowerL2(Float maxChargeApparentPowerL2) {
        this.maxChargeApparentPowerL2 = maxChargeApparentPowerL2;
    }


    public Float getMaxChargeApparentPowerL3() {
        return maxChargeApparentPowerL3;
    }


    public void setMaxChargeApparentPowerL3(Float maxChargeApparentPowerL3) {
        this.maxChargeApparentPowerL3 = maxChargeApparentPowerL3;
    }


    public Float getMaxDischargeApparentPower() {
        return maxDischargeApparentPower;
    }


    public void setMaxDischargeApparentPower(Float maxDischargeApparentPower) {
        this.maxDischargeApparentPower = maxDischargeApparentPower;
    }


    public Float getMaxDischargeApparentPowerL2() {
        return maxDischargeApparentPowerL2;
    }


    public void setMaxDischargeApparentPowerL2(Float maxDischargeApparentPowerL2) {
        this.maxDischargeApparentPowerL2 = maxDischargeApparentPowerL2;
    }


    public Float getMaxDischargeApparentPowerL3() {
        return maxDischargeApparentPowerL3;
    }


    public void setMaxDischargeApparentPowerL3(Float maxDischargeApparentPowerL3) {
        this.maxDischargeApparentPowerL3 = maxDischargeApparentPowerL3;
    }


    public Float getMaxChargeReactivePower() {
        return maxChargeReactivePower;
    }


    public void setMaxChargeReactivePower(Float maxChargeReactivePower) {
        this.maxChargeReactivePower = maxChargeReactivePower;
    }


    public Float getMaxChargeReactivePowerL2() {
        return maxChargeReactivePowerL2;
    }


    public void setMaxChargeReactivePowerL2(Float maxChargeReactivePowerL2) {
        this.maxChargeReactivePowerL2 = maxChargeReactivePowerL2;
    }


    public Float getMaxChargeReactivePowerL3() {
        return maxChargeReactivePowerL3;
    }


    public void setMaxChargeReactivePowerL3(Float maxChargeReactivePowerL3) {
        this.maxChargeReactivePowerL3 = maxChargeReactivePowerL3;
    }


    public Float getMinChargeReactivePower() {
        return minChargeReactivePower;
    }


    public void setMinChargeReactivePower(Float minChargeReactivePower) {
        this.minChargeReactivePower = minChargeReactivePower;
    }


    public Float getMinChargeReactivePowerL2() {
        return minChargeReactivePowerL2;
    }


    public void setMinChargeReactivePowerL2(Float minChargeReactivePowerL2) {
        this.minChargeReactivePowerL2 = minChargeReactivePowerL2;
    }


    public Float getMinChargeReactivePowerL3() {
        return minChargeReactivePowerL3;
    }


    public void setMinChargeReactivePowerL3(Float minChargeReactivePowerL3) {
        this.minChargeReactivePowerL3 = minChargeReactivePowerL3;
    }


    public Float getMaxDischargeReactivePower() {
        return maxDischargeReactivePower;
    }


    public void setMaxDischargeReactivePower(Float maxDischargeReactivePower) {
        this.maxDischargeReactivePower = maxDischargeReactivePower;
    }


    public Float getMaxDischargeReactivePowerL2() {
        return maxDischargeReactivePowerL2;
    }


    public void setMaxDischargeReactivePowerL2(Float maxDischargeReactivePowerL2) {
        this.maxDischargeReactivePowerL2 = maxDischargeReactivePowerL2;
    }


    public Float getMaxDischargeReactivePowerL3() {
        return maxDischargeReactivePowerL3;
    }


    public void setMaxDischargeReactivePowerL3(Float maxDischargeReactivePowerL3) {
        this.maxDischargeReactivePowerL3 = maxDischargeReactivePowerL3;
    }


    public Float getMinDischargeReactivePower() {
        return minDischargeReactivePower;
    }


    public void setMinDischargeReactivePower(Float minDischargeReactivePower) {
        this.minDischargeReactivePower = minDischargeReactivePower;
    }


    public Float getMinDischargeReactivePowerL2() {
        return minDischargeReactivePowerL2;
    }


    public void setMinDischargeReactivePowerL2(Float minDischargeReactivePowerL2) {
        this.minDischargeReactivePowerL2 = minDischargeReactivePowerL2;
    }


    public Float getMinDischargeReactivePowerL3() {
        return minDischargeReactivePowerL3;
    }


    public void setMinDischargeReactivePowerL3(Float minDischargeReactivePowerL3) {
        this.minDischargeReactivePowerL3 = minDischargeReactivePowerL3;
    }


    public Float getNominalVoltage() {
        return nominalVoltage;
    }


    public void setNominalVoltage(Float nominalVoltage) {
        this.nominalVoltage = nominalVoltage;
    }


    public Float getNominalVoltageOffset() {
        return nominalVoltageOffset;
    }


    public void setNominalVoltageOffset(Float nominalVoltageOffset) {
        this.nominalVoltageOffset = nominalVoltageOffset;
    }


    public Float getMaxNominalVoltage() {
        return maxNominalVoltage;
    }


    public void setMaxNominalVoltage(Float maxNominalVoltage) {
        this.maxNominalVoltage = maxNominalVoltage;
    }


    public Float getMinNominalVoltage() {
        return minNominalVoltage;
    }


    public void setMinNominalVoltage(Float minNominalVoltage) {
        this.minNominalVoltage = minNominalVoltage;
    }


    public String getEvInverterManufacturer() {
        return evInverterManufacturer;
    }


    public void setEvInverterManufacturer(String evInverterManufacturer) {
        this.evInverterManufacturer = evInverterManufacturer;
    }


    public String getEvInverterModel() {
        return evInverterModel;
    }


    public void setEvInverterModel(String evInverterModel) {
        this.evInverterModel = evInverterModel;
    }


    public String getEvInverterSerialNumber() {
        return evInverterSerialNumber;
    }


    public void setEvInverterSerialNumber(String evInverterSerialNumber) {
        this.evInverterSerialNumber = evInverterSerialNumber;
    }


    public String getEvInverterSwVersion() {
        return evInverterSwVersion;
    }


    public void setEvInverterSwVersion(String evInverterSwVersion) {
        this.evInverterSwVersion = evInverterSwVersion;
    }


    public String getEvInverterHwVersion() {
        return evInverterHwVersion;
    }


    public void setEvInverterHwVersion(String evInverterHwVersion) {
        this.evInverterHwVersion = evInverterHwVersion;
    }


    public List<IslandingDetectionEnum> getEvIslandingDetectionMethod() {
        return evIslandingDetectionMethod;
    }


    public void setEvIslandingDetectionMethod(List<IslandingDetectionEnum> evIslandingDetectionMethod) {
        this.evIslandingDetectionMethod = evIslandingDetectionMethod;
    }


    public Float getEvIslandingTripTime() {
        return evIslandingTripTime;
    }


    public void setEvIslandingTripTime(Float evIslandingTripTime) {
        this.evIslandingTripTime = evIslandingTripTime;
    }


    public Float getEvMaximumLevel1DCInjection() {
        return evMaximumLevel1DCInjection;
    }


    public void setEvMaximumLevel1DCInjection(Float evMaximumLevel1DCInjection) {
        this.evMaximumLevel1DCInjection = evMaximumLevel1DCInjection;
    }


    public Float getEvDurationLevel1DCInjection() {
        return evDurationLevel1DCInjection;
    }


    public void setEvDurationLevel1DCInjection(Float evDurationLevel1DCInjection) {
        this.evDurationLevel1DCInjection = evDurationLevel1DCInjection;
    }


    public Float getEvMaximumLevel2DCInjection() {
        return evMaximumLevel2DCInjection;
    }


    public void setEvMaximumLevel2DCInjection(Float evMaximumLevel2DCInjection) {
        this.evMaximumLevel2DCInjection = evMaximumLevel2DCInjection;
    }


    public Float getEvDurationLevel2DCInjection() {
        return evDurationLevel2DCInjection;
    }


    public void setEvDurationLevel2DCInjection(Float evDurationLevel2DCInjection) {
        this.evDurationLevel2DCInjection = evDurationLevel2DCInjection;
    }


    public Float getEvReactiveSusceptance() {
        return evReactiveSusceptance;
    }


    public void setEvReactiveSusceptance(Float evReactiveSusceptance) {
        this.evReactiveSusceptance = evReactiveSusceptance;
    }


    public Float getEvSessionTotalDischargeEnergyAvailable() {
        return evSessionTotalDischargeEnergyAvailable;
    }


    public void setEvSessionTotalDischargeEnergyAvailable(Float evSessionTotalDischargeEnergyAvailable) {
        this.evSessionTotalDischargeEnergyAvailable = evSessionTotalDischargeEnergyAvailable;
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
        json.addProperty("evOverExcitedMaxDischargePower", evOverExcitedMaxDischargePower);
        json.addProperty("evOverExcitedPowerFactor", evOverExcitedPowerFactor);
        json.addProperty("evUnderExcitedMaxDischargePower", evUnderExcitedMaxDischargePower);
        json.addProperty("evUnderExcitedPowerFactor", evUnderExcitedPowerFactor);
        json.addProperty("maxApparentPower", maxApparentPower);
        json.addProperty("maxChargeApparentPower", maxChargeApparentPower);
        json.addProperty("maxChargeApparentPowerL2", maxChargeApparentPowerL2);
        json.addProperty("maxChargeApparentPowerL3", maxChargeApparentPowerL3);
        json.addProperty("maxDischargeApparentPower", maxDischargeApparentPower);
        json.addProperty("maxDischargeApparentPowerL2", maxDischargeApparentPowerL2);
        json.addProperty("maxDischargeApparentPowerL3", maxDischargeApparentPowerL3);
        json.addProperty("maxChargeReactivePower", maxChargeReactivePower);
        json.addProperty("maxChargeReactivePowerL2", maxChargeReactivePowerL2);
        json.addProperty("maxChargeReactivePowerL3", maxChargeReactivePowerL3);
        json.addProperty("minChargeReactivePower", minChargeReactivePower);
        json.addProperty("minChargeReactivePowerL2", minChargeReactivePowerL2);
        json.addProperty("minChargeReactivePowerL3", minChargeReactivePowerL3);
        json.addProperty("maxDischargeReactivePower", maxDischargeReactivePower);
        json.addProperty("maxDischargeReactivePowerL2", maxDischargeReactivePowerL2);
        json.addProperty("maxDischargeReactivePowerL3", maxDischargeReactivePowerL3);
        json.addProperty("minDischargeReactivePower", minDischargeReactivePower);
        json.addProperty("minDischargeReactivePowerL2", minDischargeReactivePowerL2);
        json.addProperty("minDischargeReactivePowerL3", minDischargeReactivePowerL3);
        json.addProperty("nominalVoltage", nominalVoltage);
        json.addProperty("nominalVoltageOffset", nominalVoltageOffset);
        json.addProperty("maxNominalVoltage", maxNominalVoltage);
        json.addProperty("minNominalVoltage", minNominalVoltage);
        json.addProperty("evInverterManufacturer", evInverterManufacturer);
        json.addProperty("evInverterModel", evInverterModel);
        json.addProperty("evInverterSerialNumber", evInverterSerialNumber);
        json.addProperty("evInverterSwVersion", evInverterSwVersion);
        json.addProperty("evInverterHwVersion", evInverterHwVersion);
        json.addProperty("evIslandingTripTime", evIslandingTripTime);
        json.addProperty("evMaximumLevel1DCInjection", evMaximumLevel1DCInjection);
        json.addProperty("evDurationLevel1DCInjection", evDurationLevel1DCInjection);
        json.addProperty("evMaximumLevel2DCInjection", evMaximumLevel2DCInjection);
        json.addProperty("evDurationLevel2DCInjection", evDurationLevel2DCInjection);
        json.addProperty("evReactiveSusceptance", evReactiveSusceptance);
        json.addProperty("evSessionTotalDischargeEnergyAvailable", evSessionTotalDischargeEnergyAvailable);
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
        if (jsonObject.has("evSupportedDERControl")) {
            setEvSupportedDERControl(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("evSupportedDERControl");
            for (JsonElement el : arr) {
                getEvSupportedDERControl().add(DERControlEnum.valueOf(el.getAsString()));
            }
        }

        if (jsonObject.has("evOverExcitedMaxDischargePower")) {
            setEvOverExcitedMaxDischargePower(jsonObject.get("evOverExcitedMaxDischargePower").getAsFloat());
        }

        if (jsonObject.has("evOverExcitedPowerFactor")) {
            setEvOverExcitedPowerFactor(jsonObject.get("evOverExcitedPowerFactor").getAsFloat());
        }

        if (jsonObject.has("evUnderExcitedMaxDischargePower")) {
            setEvUnderExcitedMaxDischargePower(jsonObject.get("evUnderExcitedMaxDischargePower").getAsFloat());
        }

        if (jsonObject.has("evUnderExcitedPowerFactor")) {
            setEvUnderExcitedPowerFactor(jsonObject.get("evUnderExcitedPowerFactor").getAsFloat());
        }

        if (jsonObject.has("maxApparentPower")) {
            setMaxApparentPower(jsonObject.get("maxApparentPower").getAsFloat());
        }

        if (jsonObject.has("maxChargeApparentPower")) {
            setMaxChargeApparentPower(jsonObject.get("maxChargeApparentPower").getAsFloat());
        }

        if (jsonObject.has("maxChargeApparentPowerL2")) {
            setMaxChargeApparentPowerL2(jsonObject.get("maxChargeApparentPowerL2").getAsFloat());
        }

        if (jsonObject.has("maxChargeApparentPowerL3")) {
            setMaxChargeApparentPowerL3(jsonObject.get("maxChargeApparentPowerL3").getAsFloat());
        }

        if (jsonObject.has("maxDischargeApparentPower")) {
            setMaxDischargeApparentPower(jsonObject.get("maxDischargeApparentPower").getAsFloat());
        }

        if (jsonObject.has("maxDischargeApparentPowerL2")) {
            setMaxDischargeApparentPowerL2(jsonObject.get("maxDischargeApparentPowerL2").getAsFloat());
        }

        if (jsonObject.has("maxDischargeApparentPowerL3")) {
            setMaxDischargeApparentPowerL3(jsonObject.get("maxDischargeApparentPowerL3").getAsFloat());
        }

        if (jsonObject.has("maxChargeReactivePower")) {
            setMaxChargeReactivePower(jsonObject.get("maxChargeReactivePower").getAsFloat());
        }

        if (jsonObject.has("maxChargeReactivePowerL2")) {
            setMaxChargeReactivePowerL2(jsonObject.get("maxChargeReactivePowerL2").getAsFloat());
        }

        if (jsonObject.has("maxChargeReactivePowerL3")) {
            setMaxChargeReactivePowerL3(jsonObject.get("maxChargeReactivePowerL3").getAsFloat());
        }

        if (jsonObject.has("minChargeReactivePower")) {
            setMinChargeReactivePower(jsonObject.get("minChargeReactivePower").getAsFloat());
        }

        if (jsonObject.has("minChargeReactivePowerL2")) {
            setMinChargeReactivePowerL2(jsonObject.get("minChargeReactivePowerL2").getAsFloat());
        }

        if (jsonObject.has("minChargeReactivePowerL3")) {
            setMinChargeReactivePowerL3(jsonObject.get("minChargeReactivePowerL3").getAsFloat());
        }

        if (jsonObject.has("maxDischargeReactivePower")) {
            setMaxDischargeReactivePower(jsonObject.get("maxDischargeReactivePower").getAsFloat());
        }

        if (jsonObject.has("maxDischargeReactivePowerL2")) {
            setMaxDischargeReactivePowerL2(jsonObject.get("maxDischargeReactivePowerL2").getAsFloat());
        }

        if (jsonObject.has("maxDischargeReactivePowerL3")) {
            setMaxDischargeReactivePowerL3(jsonObject.get("maxDischargeReactivePowerL3").getAsFloat());
        }

        if (jsonObject.has("minDischargeReactivePower")) {
            setMinDischargeReactivePower(jsonObject.get("minDischargeReactivePower").getAsFloat());
        }

        if (jsonObject.has("minDischargeReactivePowerL2")) {
            setMinDischargeReactivePowerL2(jsonObject.get("minDischargeReactivePowerL2").getAsFloat());
        }

        if (jsonObject.has("minDischargeReactivePowerL3")) {
            setMinDischargeReactivePowerL3(jsonObject.get("minDischargeReactivePowerL3").getAsFloat());
        }

        if (jsonObject.has("nominalVoltage")) {
            setNominalVoltage(jsonObject.get("nominalVoltage").getAsFloat());
        }

        if (jsonObject.has("nominalVoltageOffset")) {
            setNominalVoltageOffset(jsonObject.get("nominalVoltageOffset").getAsFloat());
        }

        if (jsonObject.has("maxNominalVoltage")) {
            setMaxNominalVoltage(jsonObject.get("maxNominalVoltage").getAsFloat());
        }

        if (jsonObject.has("minNominalVoltage")) {
            setMinNominalVoltage(jsonObject.get("minNominalVoltage").getAsFloat());
        }

        if (jsonObject.has("evInverterManufacturer")) {
            setEvInverterManufacturer(jsonObject.get("evInverterManufacturer").getAsString());
        }

        if (jsonObject.has("evInverterModel")) {
            setEvInverterModel(jsonObject.get("evInverterModel").getAsString());
        }

        if (jsonObject.has("evInverterSerialNumber")) {
            setEvInverterSerialNumber(jsonObject.get("evInverterSerialNumber").getAsString());
        }

        if (jsonObject.has("evInverterSwVersion")) {
            setEvInverterSwVersion(jsonObject.get("evInverterSwVersion").getAsString());
        }

        if (jsonObject.has("evInverterHwVersion")) {
            setEvInverterHwVersion(jsonObject.get("evInverterHwVersion").getAsString());
        }

        if (jsonObject.has("evIslandingDetectionMethod")) {
            setEvIslandingDetectionMethod(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("evIslandingDetectionMethod");
            for (JsonElement el : arr) {
                getEvIslandingDetectionMethod().add(IslandingDetectionEnum.valueOf(el.getAsString()));
            }
        }

        if (jsonObject.has("evIslandingTripTime")) {
            setEvIslandingTripTime(jsonObject.get("evIslandingTripTime").getAsFloat());
        }

        if (jsonObject.has("evMaximumLevel1DCInjection")) {
            setEvMaximumLevel1DCInjection(jsonObject.get("evMaximumLevel1DCInjection").getAsFloat());
        }

        if (jsonObject.has("evDurationLevel1DCInjection")) {
            setEvDurationLevel1DCInjection(jsonObject.get("evDurationLevel1DCInjection").getAsFloat());
        }

        if (jsonObject.has("evMaximumLevel2DCInjection")) {
            setEvMaximumLevel2DCInjection(jsonObject.get("evMaximumLevel2DCInjection").getAsFloat());
        }

        if (jsonObject.has("evDurationLevel2DCInjection")) {
            setEvDurationLevel2DCInjection(jsonObject.get("evDurationLevel2DCInjection").getAsFloat());
        }

        if (jsonObject.has("evReactiveSusceptance")) {
            setEvReactiveSusceptance(jsonObject.get("evReactiveSusceptance").getAsFloat());
        }

        if (jsonObject.has("evSessionTotalDischargeEnergyAvailable")) {
            setEvSessionTotalDischargeEnergyAvailable(jsonObject.get("evSessionTotalDischargeEnergyAvailable").getAsFloat());
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
        if (!(obj instanceof DERChargingParameters))
            return false;
        DERChargingParameters that = (DERChargingParameters) obj;
        return Objects.equals(this.maxDischargeReactivePower, that.maxDischargeReactivePower)
                && Objects.equals(this.evInverterHwVersion, that.evInverterHwVersion)
                && Objects.equals(this.evInverterManufacturer, that.evInverterManufacturer)
                && Objects.equals(this.maxDischargeApparentPower, that.maxDischargeApparentPower)
                && Objects.equals(this.evInverterModel, that.evInverterModel)
                && Objects.equals(this.evDurationLevel1DCInjection, that.evDurationLevel1DCInjection)
                && Objects.equals(this.evOverExcitedMaxDischargePower, that.evOverExcitedMaxDischargePower)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.maxNominalVoltage, that.maxNominalVoltage)
                && Objects.equals(this.nominalVoltageOffset, that.nominalVoltageOffset)
                && Objects.equals(this.evUnderExcitedPowerFactor, that.evUnderExcitedPowerFactor)
                && Objects.equals(this.nominalVoltage, that.nominalVoltage)
                && Objects.equals(this.evSessionTotalDischargeEnergyAvailable, that.evSessionTotalDischargeEnergyAvailable)
                && Objects.equals(this.evIslandingDetectionMethod, that.evIslandingDetectionMethod)
                && Objects.equals(this.evMaximumLevel1DCInjection, that.evMaximumLevel1DCInjection)
                && Objects.equals(this.maxDischargeApparentPowerL2, that.maxDischargeApparentPowerL2)
                && Objects.equals(this.maxDischargeApparentPowerL3, that.maxDischargeApparentPowerL3)
                && Objects.equals(this.maxDischargeReactivePowerL2, that.maxDischargeReactivePowerL2)
                && Objects.equals(this.minDischargeReactivePower, that.minDischargeReactivePower)
                && Objects.equals(this.maxDischargeReactivePowerL3, that.maxDischargeReactivePowerL3)
                && Objects.equals(this.evReactiveSusceptance, that.evReactiveSusceptance)
                && Objects.equals(this.evDurationLevel2DCInjection, that.evDurationLevel2DCInjection)
                && Objects.equals(this.evSupportedDERControl, that.evSupportedDERControl)
                && Objects.equals(this.evOverExcitedPowerFactor, that.evOverExcitedPowerFactor)
                && Objects.equals(this.evUnderExcitedMaxDischargePower, that.evUnderExcitedMaxDischargePower)
                && Objects.equals(this.maxChargeReactivePowerL2, that.maxChargeReactivePowerL2)
                && Objects.equals(this.evInverterSwVersion, that.evInverterSwVersion)
                && Objects.equals(this.maxChargeReactivePowerL3, that.maxChargeReactivePowerL3)
                && Objects.equals(this.maxChargeApparentPowerL3, that.maxChargeApparentPowerL3)
                && Objects.equals(this.minChargeReactivePowerL2, that.minChargeReactivePowerL2)
                && Objects.equals(this.minDischargeReactivePowerL3, that.minDischargeReactivePowerL3)
                && Objects.equals(this.maxChargeApparentPowerL2, that.maxChargeApparentPowerL2)
                && Objects.equals(this.minChargeReactivePowerL3, that.minChargeReactivePowerL3)
                && Objects.equals(this.minDischargeReactivePowerL2, that.minDischargeReactivePowerL2)
                && Objects.equals(this.evIslandingTripTime, that.evIslandingTripTime)
                && Objects.equals(this.maxChargeReactivePower, that.maxChargeReactivePower)
                && Objects.equals(this.maxChargeApparentPower, that.maxChargeApparentPower)
                && Objects.equals(this.maxApparentPower, that.maxApparentPower)
                && Objects.equals(this.evInverterSerialNumber, that.evInverterSerialNumber)
                && Objects.equals(this.evMaximumLevel2DCInjection, that.evMaximumLevel2DCInjection)
                && Objects.equals(this.minNominalVoltage, that.minNominalVoltage)
                && Objects.equals(this.minChargeReactivePower, that.minChargeReactivePower);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.maxDischargeReactivePower != null ? this.maxDischargeReactivePower.hashCode() : 0);
        result = 31 * result + (this.evInverterHwVersion != null ? this.evInverterHwVersion.hashCode() : 0);
        result = 31 * result + (this.evInverterManufacturer != null ? this.evInverterManufacturer.hashCode() : 0);
        result = 31 * result + (this.maxDischargeApparentPower != null ? this.maxDischargeApparentPower.hashCode() : 0);
        result = 31 * result + (this.evInverterModel != null ? this.evInverterModel.hashCode() : 0);
        result = 31 * result + (this.evDurationLevel1DCInjection != null ? this.evDurationLevel1DCInjection.hashCode() : 0);
        result = 31 * result + (this.evOverExcitedMaxDischargePower != null ? this.evOverExcitedMaxDischargePower.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.maxNominalVoltage != null ? this.maxNominalVoltage.hashCode() : 0);
        result = 31 * result + (this.nominalVoltageOffset != null ? this.nominalVoltageOffset.hashCode() : 0);
        result = 31 * result + (this.evUnderExcitedPowerFactor != null ? this.evUnderExcitedPowerFactor.hashCode() : 0);
        result = 31 * result + (this.nominalVoltage != null ? this.nominalVoltage.hashCode() : 0);
        result = 31 * result + (this.evSessionTotalDischargeEnergyAvailable != null ? this.evSessionTotalDischargeEnergyAvailable.hashCode() : 0);
        result = 31 * result + (this.evIslandingDetectionMethod != null ? this.evIslandingDetectionMethod.hashCode() : 0);
        result = 31 * result + (this.evMaximumLevel1DCInjection != null ? this.evMaximumLevel1DCInjection.hashCode() : 0);
        result = 31 * result + (this.maxDischargeApparentPowerL2 != null ? this.maxDischargeApparentPowerL2.hashCode() : 0);
        result = 31 * result + (this.maxDischargeApparentPowerL3 != null ? this.maxDischargeApparentPowerL3.hashCode() : 0);
        result = 31 * result + (this.maxDischargeReactivePowerL2 != null ? this.maxDischargeReactivePowerL2.hashCode() : 0);
        result = 31 * result + (this.minDischargeReactivePower != null ? this.minDischargeReactivePower.hashCode() : 0);
        result = 31 * result + (this.maxDischargeReactivePowerL3 != null ? this.maxDischargeReactivePowerL3.hashCode() : 0);
        result = 31 * result + (this.evReactiveSusceptance != null ? this.evReactiveSusceptance.hashCode() : 0);
        result = 31 * result + (this.evDurationLevel2DCInjection != null ? this.evDurationLevel2DCInjection.hashCode() : 0);
        result = 31 * result + (this.evSupportedDERControl != null ? this.evSupportedDERControl.hashCode() : 0);
        result = 31 * result + (this.evOverExcitedPowerFactor != null ? this.evOverExcitedPowerFactor.hashCode() : 0);
        result = 31 * result + (this.evUnderExcitedMaxDischargePower != null ? this.evUnderExcitedMaxDischargePower.hashCode() : 0);
        result = 31 * result + (this.maxChargeReactivePowerL2 != null ? this.maxChargeReactivePowerL2.hashCode() : 0);
        result = 31 * result + (this.evInverterSwVersion != null ? this.evInverterSwVersion.hashCode() : 0);
        result = 31 * result + (this.maxChargeReactivePowerL3 != null ? this.maxChargeReactivePowerL3.hashCode() : 0);
        result = 31 * result + (this.maxChargeApparentPowerL3 != null ? this.maxChargeApparentPowerL3.hashCode() : 0);
        result = 31 * result + (this.minChargeReactivePowerL2 != null ? this.minChargeReactivePowerL2.hashCode() : 0);
        result = 31 * result + (this.minDischargeReactivePowerL3 != null ? this.minDischargeReactivePowerL3.hashCode() : 0);
        result = 31 * result + (this.maxChargeApparentPowerL2 != null ? this.maxChargeApparentPowerL2.hashCode() : 0);
        result = 31 * result + (this.minChargeReactivePowerL3 != null ? this.minChargeReactivePowerL3.hashCode() : 0);
        result = 31 * result + (this.minDischargeReactivePowerL2 != null ? this.minDischargeReactivePowerL2.hashCode() : 0);
        result = 31 * result + (this.evIslandingTripTime != null ? this.evIslandingTripTime.hashCode() : 0);
        result = 31 * result + (this.maxChargeReactivePower != null ? this.maxChargeReactivePower.hashCode() : 0);
        result = 31 * result + (this.maxChargeApparentPower != null ? this.maxChargeApparentPower.hashCode() : 0);
        result = 31 * result + (this.maxApparentPower != null ? this.maxApparentPower.hashCode() : 0);
        result = 31 * result + (this.evInverterSerialNumber != null ? this.evInverterSerialNumber.hashCode() : 0);
        result = 31 * result + (this.evMaximumLevel2DCInjection != null ? this.evMaximumLevel2DCInjection.hashCode() : 0);
        result = 31 * result + (this.minNominalVoltage != null ? this.minNominalVoltage.hashCode() : 0);
        result = 31 * result + (this.minChargeReactivePower != null ? this.minChargeReactivePower.hashCode() : 0);
        return result;
    }
}
