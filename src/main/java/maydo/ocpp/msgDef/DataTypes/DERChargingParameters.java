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

        if (getEvSupportedDERControl() != null) {
            JsonArray evSupportedDERControlArray = new JsonArray();
            for (DERControlEnum item : getEvSupportedDERControl()) {
                evSupportedDERControlArray.add(item.toString());
            }
            json.add("evSupportedDERControl", evSupportedDERControlArray);
        }
        if (getEvOverExcitedMaxDischargePower() != null) {
            json.addProperty("evOverExcitedMaxDischargePower", getEvOverExcitedMaxDischargePower());
        }
        if (getEvOverExcitedPowerFactor() != null) {
            json.addProperty("evOverExcitedPowerFactor", getEvOverExcitedPowerFactor());
        }
        if (getEvUnderExcitedMaxDischargePower() != null) {
            json.addProperty("evUnderExcitedMaxDischargePower", getEvUnderExcitedMaxDischargePower());
        }
        if (getEvUnderExcitedPowerFactor() != null) {
            json.addProperty("evUnderExcitedPowerFactor", getEvUnderExcitedPowerFactor());
        }
        if (getMaxApparentPower() != null) {
            json.addProperty("maxApparentPower", getMaxApparentPower());
        }
        if (getMaxChargeApparentPower() != null) {
            json.addProperty("maxChargeApparentPower", getMaxChargeApparentPower());
        }
        if (getMaxChargeApparentPowerL2() != null) {
            json.addProperty("maxChargeApparentPowerL2", getMaxChargeApparentPowerL2());
        }
        if (getMaxChargeApparentPowerL3() != null) {
            json.addProperty("maxChargeApparentPowerL3", getMaxChargeApparentPowerL3());
        }
        if (getMaxDischargeApparentPower() != null) {
            json.addProperty("maxDischargeApparentPower", getMaxDischargeApparentPower());
        }
        if (getMaxDischargeApparentPowerL2() != null) {
            json.addProperty("maxDischargeApparentPowerL2", getMaxDischargeApparentPowerL2());
        }
        if (getMaxDischargeApparentPowerL3() != null) {
            json.addProperty("maxDischargeApparentPowerL3", getMaxDischargeApparentPowerL3());
        }
        if (getMaxChargeReactivePower() != null) {
            json.addProperty("maxChargeReactivePower", getMaxChargeReactivePower());
        }
        if (getMaxChargeReactivePowerL2() != null) {
            json.addProperty("maxChargeReactivePowerL2", getMaxChargeReactivePowerL2());
        }
        if (getMaxChargeReactivePowerL3() != null) {
            json.addProperty("maxChargeReactivePowerL3", getMaxChargeReactivePowerL3());
        }
        if (getMinChargeReactivePower() != null) {
            json.addProperty("minChargeReactivePower", getMinChargeReactivePower());
        }
        if (getMinChargeReactivePowerL2() != null) {
            json.addProperty("minChargeReactivePowerL2", getMinChargeReactivePowerL2());
        }
        if (getMinChargeReactivePowerL3() != null) {
            json.addProperty("minChargeReactivePowerL3", getMinChargeReactivePowerL3());
        }
        if (getMaxDischargeReactivePower() != null) {
            json.addProperty("maxDischargeReactivePower", getMaxDischargeReactivePower());
        }
        if (getMaxDischargeReactivePowerL2() != null) {
            json.addProperty("maxDischargeReactivePowerL2", getMaxDischargeReactivePowerL2());
        }
        if (getMaxDischargeReactivePowerL3() != null) {
            json.addProperty("maxDischargeReactivePowerL3", getMaxDischargeReactivePowerL3());
        }
        if (getMinDischargeReactivePower() != null) {
            json.addProperty("minDischargeReactivePower", getMinDischargeReactivePower());
        }
        if (getMinDischargeReactivePowerL2() != null) {
            json.addProperty("minDischargeReactivePowerL2", getMinDischargeReactivePowerL2());
        }
        if (getMinDischargeReactivePowerL3() != null) {
            json.addProperty("minDischargeReactivePowerL3", getMinDischargeReactivePowerL3());
        }
        if (getNominalVoltage() != null) {
            json.addProperty("nominalVoltage", getNominalVoltage());
        }
        if (getNominalVoltageOffset() != null) {
            json.addProperty("nominalVoltageOffset", getNominalVoltageOffset());
        }
        if (getMaxNominalVoltage() != null) {
            json.addProperty("maxNominalVoltage", getMaxNominalVoltage());
        }
        if (getMinNominalVoltage() != null) {
            json.addProperty("minNominalVoltage", getMinNominalVoltage());
        }
        if (getEvInverterManufacturer() != null) {
            json.addProperty("evInverterManufacturer", getEvInverterManufacturer());
        }
        if (getEvInverterModel() != null) {
            json.addProperty("evInverterModel", getEvInverterModel());
        }
        if (getEvInverterSerialNumber() != null) {
            json.addProperty("evInverterSerialNumber", getEvInverterSerialNumber());
        }
        if (getEvInverterSwVersion() != null) {
            json.addProperty("evInverterSwVersion", getEvInverterSwVersion());
        }
        if (getEvInverterHwVersion() != null) {
            json.addProperty("evInverterHwVersion", getEvInverterHwVersion());
        }
        if (getEvIslandingDetectionMethod() != null) {
            JsonArray evIslandingDetectionMethodArray = new JsonArray();
            for (IslandingDetectionEnum item : getEvIslandingDetectionMethod()) {
                evIslandingDetectionMethodArray.add(item.toString());
            }
            json.add("evIslandingDetectionMethod", evIslandingDetectionMethodArray);
        }
        if (getEvIslandingTripTime() != null) {
            json.addProperty("evIslandingTripTime", getEvIslandingTripTime());
        }
        if (getEvMaximumLevel1DCInjection() != null) {
            json.addProperty("evMaximumLevel1DCInjection", getEvMaximumLevel1DCInjection());
        }
        if (getEvDurationLevel1DCInjection() != null) {
            json.addProperty("evDurationLevel1DCInjection", getEvDurationLevel1DCInjection());
        }
        if (getEvMaximumLevel2DCInjection() != null) {
            json.addProperty("evMaximumLevel2DCInjection", getEvMaximumLevel2DCInjection());
        }
        if (getEvDurationLevel2DCInjection() != null) {
            json.addProperty("evDurationLevel2DCInjection", getEvDurationLevel2DCInjection());
        }
        if (getEvReactiveSusceptance() != null) {
            json.addProperty("evReactiveSusceptance", getEvReactiveSusceptance());
        }
        if (getEvSessionTotalDischargeEnergyAvailable() != null) {
            json.addProperty("evSessionTotalDischargeEnergyAvailable", getEvSessionTotalDischargeEnergyAvailable());
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
        return Objects.equals(getEvSupportedDERControl(), that.getEvSupportedDERControl())
                && Objects.equals(getEvOverExcitedMaxDischargePower(), that.getEvOverExcitedMaxDischargePower())
                && Objects.equals(getEvOverExcitedPowerFactor(), that.getEvOverExcitedPowerFactor())
                && Objects.equals(getEvUnderExcitedMaxDischargePower(), that.getEvUnderExcitedMaxDischargePower())
                && Objects.equals(getEvUnderExcitedPowerFactor(), that.getEvUnderExcitedPowerFactor())
                && Objects.equals(getMaxApparentPower(), that.getMaxApparentPower())
                && Objects.equals(getMaxChargeApparentPower(), that.getMaxChargeApparentPower())
                && Objects.equals(getMaxChargeApparentPowerL2(), that.getMaxChargeApparentPowerL2())
                && Objects.equals(getMaxChargeApparentPowerL3(), that.getMaxChargeApparentPowerL3())
                && Objects.equals(getMaxDischargeApparentPower(), that.getMaxDischargeApparentPower())
                && Objects.equals(getMaxDischargeApparentPowerL2(), that.getMaxDischargeApparentPowerL2())
                && Objects.equals(getMaxDischargeApparentPowerL3(), that.getMaxDischargeApparentPowerL3())
                && Objects.equals(getMaxChargeReactivePower(), that.getMaxChargeReactivePower())
                && Objects.equals(getMaxChargeReactivePowerL2(), that.getMaxChargeReactivePowerL2())
                && Objects.equals(getMaxChargeReactivePowerL3(), that.getMaxChargeReactivePowerL3())
                && Objects.equals(getMinChargeReactivePower(), that.getMinChargeReactivePower())
                && Objects.equals(getMinChargeReactivePowerL2(), that.getMinChargeReactivePowerL2())
                && Objects.equals(getMinChargeReactivePowerL3(), that.getMinChargeReactivePowerL3())
                && Objects.equals(getMaxDischargeReactivePower(), that.getMaxDischargeReactivePower())
                && Objects.equals(getMaxDischargeReactivePowerL2(), that.getMaxDischargeReactivePowerL2())
                && Objects.equals(getMaxDischargeReactivePowerL3(), that.getMaxDischargeReactivePowerL3())
                && Objects.equals(getMinDischargeReactivePower(), that.getMinDischargeReactivePower())
                && Objects.equals(getMinDischargeReactivePowerL2(), that.getMinDischargeReactivePowerL2())
                && Objects.equals(getMinDischargeReactivePowerL3(), that.getMinDischargeReactivePowerL3())
                && Objects.equals(getNominalVoltage(), that.getNominalVoltage())
                && Objects.equals(getNominalVoltageOffset(), that.getNominalVoltageOffset())
                && Objects.equals(getMaxNominalVoltage(), that.getMaxNominalVoltage())
                && Objects.equals(getMinNominalVoltage(), that.getMinNominalVoltage())
                && Objects.equals(getEvInverterManufacturer(), that.getEvInverterManufacturer())
                && Objects.equals(getEvInverterModel(), that.getEvInverterModel())
                && Objects.equals(getEvInverterSerialNumber(), that.getEvInverterSerialNumber())
                && Objects.equals(getEvInverterSwVersion(), that.getEvInverterSwVersion())
                && Objects.equals(getEvInverterHwVersion(), that.getEvInverterHwVersion())
                && Objects.equals(getEvIslandingDetectionMethod(), that.getEvIslandingDetectionMethod())
                && Objects.equals(getEvIslandingTripTime(), that.getEvIslandingTripTime())
                && Objects.equals(getEvMaximumLevel1DCInjection(), that.getEvMaximumLevel1DCInjection())
                && Objects.equals(getEvDurationLevel1DCInjection(), that.getEvDurationLevel1DCInjection())
                && Objects.equals(getEvMaximumLevel2DCInjection(), that.getEvMaximumLevel2DCInjection())
                && Objects.equals(getEvDurationLevel2DCInjection(), that.getEvDurationLevel2DCInjection())
                && Objects.equals(getEvReactiveSusceptance(), that.getEvReactiveSusceptance())
                && Objects.equals(getEvSessionTotalDischargeEnergyAvailable(), that.getEvSessionTotalDischargeEnergyAvailable())
                && Objects.equals(getCustomData(), that.getCustomData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getEvSupportedDERControl(),
                getEvOverExcitedMaxDischargePower(),
                getEvOverExcitedPowerFactor(),
                getEvUnderExcitedMaxDischargePower(),
                getEvUnderExcitedPowerFactor(),
                getMaxApparentPower(),
                getMaxChargeApparentPower(),
                getMaxChargeApparentPowerL2(),
                getMaxChargeApparentPowerL3(),
                getMaxDischargeApparentPower(),
                getMaxDischargeApparentPowerL2(),
                getMaxDischargeApparentPowerL3(),
                getMaxChargeReactivePower(),
                getMaxChargeReactivePowerL2(),
                getMaxChargeReactivePowerL3(),
                getMinChargeReactivePower(),
                getMinChargeReactivePowerL2(),
                getMinChargeReactivePowerL3(),
                getMaxDischargeReactivePower(),
                getMaxDischargeReactivePowerL2(),
                getMaxDischargeReactivePowerL3(),
                getMinDischargeReactivePower(),
                getMinDischargeReactivePowerL2(),
                getMinDischargeReactivePowerL3(),
                getNominalVoltage(),
                getNominalVoltageOffset(),
                getMaxNominalVoltage(),
                getMinNominalVoltage(),
                getEvInverterManufacturer(),
                getEvInverterModel(),
                getEvInverterSerialNumber(),
                getEvInverterSwVersion(),
                getEvInverterHwVersion(),
                getEvIslandingDetectionMethod(),
                getEvIslandingTripTime(),
                getEvMaximumLevel1DCInjection(),
                getEvDurationLevel1DCInjection(),
                getEvMaximumLevel2DCInjection(),
                getEvDurationLevel2DCInjection(),
                getEvReactiveSusceptance(),
                getEvSessionTotalDischargeEnergyAvailable(),
                getCustomData()
        );
    }
}
