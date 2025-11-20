package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.Enumerations.DERControlEnum;
import maydo.ocpp.msgDef.Enumerations.IslandingDetectionEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;

import java.util.List;
import java.util.Objects;

public class DERChargingParameters implements JsonInterface {

    /**
     * DER control functions supported by EV. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType:DERControlFunctions (bitmap)
     */
    @Optional
    private List<DERControlEnum> evSupportedDERControl;
    /**
     * Rated maximum injected active power by EV, at specified over-excited power factor (overExcitedPowerFactor). +
     * It can also be defined as the rated maximum discharge power at the rated minimum injected reactive power value. This means that if the EV is providing reactive power support, and it is requested to discharge at max power (e.g. to satisfy an EMS request), the EV may override the request and discharge up to overExcitedMaximumDischargePower to meet the minimum reactive power requirements. +
     * Corresponds to the WOvPF attribute in IEC 61850. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVOverExcitedMaximumDischargePower
     */
    @Optional
    private Float evOverExcitedMaxDischargePower;
    /**
     * EV power factor when injecting (over excited) the minimum reactive power. +
     * Corresponds to the OvPF attribute in IEC 61850. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVOverExcitedPowerFactor
     */
    @Optional
    private Float evOverExcitedPowerFactor;
    /**
     * Rated maximum injected active power by EV supported at specified under-excited power factor (EVUnderExcitedPowerFactor). +
     * It can also be defined as the rated maximum dischargePower at the rated minimum absorbed reactive power value.
     * This means that if the EV is providing reactive power support, and it is requested to discharge at max power (e.g. to satisfy an EMS request), the EV may override the request and discharge up to underExcitedMaximumDischargePower to meet the minimum reactive power requirements. +
     * This corresponds to the WUnPF attribute in the IEC 61850. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVUnderExcitedMaximumDischargePower
     */
    @Optional
    private Float evUnderExcitedMaxDischargePower;
    /**
     * EV power factor when injecting (under excited) the minimum reactive power. +
     * Corresponds to the OvPF attribute in IEC 61850. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVUnderExcitedPowerFactor
     */
    @Optional
    private Float evUnderExcitedPowerFactor;
    /**
     * Rated maximum total apparent power, defined by min(EV, EVSE) in va.
     * Corresponds to the VAMaxRtg in IEC 61850. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumApparentPower
     */
    @Optional
    private Float maxApparentPower;
    /**
     * Rated maximum absorbed apparent power, defined by min(EV, EVSE) in va. +
     * This field represents the sum of all phases, unless values are provided for L2 and L3,
     * in which case this field represents phase L1. +
     * Corresponds to the ChaVAMaxRtg in IEC 61850. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumChargeApparentPower
     */
    @Optional
    private Float maxChargeApparentPower;
    /**
     * Rated maximum absorbed apparent power on phase L2, defined by min(EV, EVSE) in va.
     * Corresponds to the ChaVAMaxRtg in IEC 61850. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumChargeApparentPower_L2
     */
    @Optional
    private Float maxChargeApparentPowerL2;
    /**
     * Rated maximum absorbed apparent power on phase L3, defined by min(EV, EVSE) in va.
     * Corresponds to the ChaVAMaxRtg in IEC 61850. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumChargeApparentPower_L3
     */
    @Optional
    private Float maxChargeApparentPowerL3;
    /**
     * Rated maximum injected apparent power, defined by min(EV, EVSE) in va. +
     * This field represents the sum of all phases, unless values are provided for L2 and L3,
     * in which case this field represents phase L1. +
     * Corresponds to the DisVAMaxRtg in IEC 61850. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumDischargeApparentPower
     */
    @Optional
    private Float maxDischargeApparentPower;
    /**
     * Rated maximum injected apparent power on phase L2, defined by min(EV, EVSE) in va. +
     * Corresponds to the DisVAMaxRtg in IEC 61850. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumDischargeApparentPower_L2
     */
    @Optional
    private Float maxDischargeApparentPowerL2;
    /**
     * Rated maximum injected apparent power on phase L3, defined by min(EV, EVSE) in va. +
     * Corresponds to the DisVAMaxRtg in IEC 61850. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumDischargeApparentPower_L3
     */
    @Optional
    private Float maxDischargeApparentPowerL3;
    /**
     * Rated maximum absorbed reactive power, defined by min(EV, EVSE), in vars. +
     * This field represents the sum of all phases, unless values are provided for L2 and L3,
     * in which case this field represents phase L1. +
     * Corresponds to the AvarMax attribute in the IEC 61850. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumChargeReactivePower
     */
    @Optional
    private Float maxChargeReactivePower;
    /**
     * Rated maximum absorbed reactive power, defined by min(EV, EVSE), in vars on phase L2. +
     * Corresponds to the AvarMax attribute in the IEC 61850. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumChargeReactivePower_L2
     */
    @Optional
    private Float maxChargeReactivePowerL2;
    /**
     * Rated maximum absorbed reactive power, defined by min(EV, EVSE), in vars on phase L3. +
     * Corresponds to the AvarMax attribute in the IEC 61850. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumChargeReactivePower_L3
     */
    @Optional
    private Float maxChargeReactivePowerL3;
    /**
     * Rated minimum absorbed reactive power, defined by max(EV, EVSE), in vars. +
     * This field represents the sum of all phases, unless values are provided for L2 and L3,
     * in which case this field represents phase L1. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMinimumChargeReactivePower
     */
    @Optional
    private Float minChargeReactivePower;
    /**
     * Rated minimum absorbed reactive power, defined by max(EV, EVSE), in vars on phase L2. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMinimumChargeReactivePower_L2
     */
    @Optional
    private Float minChargeReactivePowerL2;
    /**
     * Rated minimum absorbed reactive power, defined by max(EV, EVSE), in vars on phase L3. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMinimumChargeReactivePower_L3
     */
    @Optional
    private Float minChargeReactivePowerL3;
    /**
     * Rated maximum injected reactive power, defined by min(EV, EVSE), in vars. +
     * This field represents the sum of all phases, unless values are provided for L2 and L3,
     * in which case this field represents phase L1. +
     * Corresponds to the IvarMax attribute in the IEC 61850. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumDischargeReactivePower
     */
    @Optional
    private Float maxDischargeReactivePower;
    /**
     * Rated maximum injected reactive power, defined by min(EV, EVSE), in vars on phase L2. +
     * Corresponds to the IvarMax attribute in the IEC 61850. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumDischargeReactivePower_L2
     */
    @Optional
    private Float maxDischargeReactivePowerL2;
    /**
     * Rated maximum injected reactive power, defined by min(EV, EVSE), in vars on phase L3. +
     * Corresponds to the IvarMax attribute in the IEC 61850. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumDischargeReactivePower_L3
     */
    @Optional
    private Float maxDischargeReactivePowerL3;
    /**
     * Rated minimum injected reactive power, defined by max(EV, EVSE), in vars. +
     * This field represents the sum of all phases, unless values are provided for L2 and L3,
     * in which case this field represents phase L1. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMinimumDischargeReactivePower
     */
    @Optional
    private Float minDischargeReactivePower;
    /**
     * Rated minimum injected reactive power, defined by max(EV, EVSE), in var on phase L2. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMinimumDischargeReactivePower_L2
     */
    @Optional
    private Float minDischargeReactivePowerL2;
    /**
     * Rated minimum injected reactive power, defined by max(EV, EVSE), in var on phase L3. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMinimumDischargeReactivePower_L3
     */
    @Optional
    private Float minDischargeReactivePowerL3;
    /**
     * Line voltage supported by EVSE and EV.
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVNominalVoltage
     */
    @Optional
    private Float nominalVoltage;
    /**
     * The nominal AC voltage (rms) offset between the Charging Station's electrical connection point and the utility’s point of common coupling. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVNominalVoltageOffset
     */
    @Optional
    private Float nominalVoltageOffset;
    /**
     * Maximum AC rms voltage, as defined by min(EV, EVSE)  to operate with. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumNominalVoltage
     */
    @Optional
    private Float maxNominalVoltage;
    /**
     * Minimum AC rms voltage, as defined by max(EV, EVSE)  to operate with. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMinimumNominalVoltage
     */
    @Optional
    private Float minNominalVoltage;
    /**
     * Manufacturer of the EV inverter. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVInverterManufacturer
     */
    @Optional
    private String evInverterManufacturer;
    /**
     * Model name of the EV inverter. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVInverterModel
     */
    @Optional
    private String evInverterModel;
    /**
     * Serial number of the EV inverter. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVInverterSerialNumber
     */
    @Optional
    private String evInverterSerialNumber;
    /**
     * Software version of EV inverter. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVInverterSwVersion
     */
    @Optional
    private String evInverterSwVersion;
    /**
     * Hardware version of EV inverter. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVInverterHwVersion
     */
    @Optional
    private String evInverterHwVersion;
    /**
     * Type of islanding detection method. Only mandatory when islanding detection is required at the site, as set in the ISO 15118 Service Details configuration. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVIslandingDetectionMethod
     */
    @Optional
    private List<IslandingDetectionEnum> evIslandingDetectionMethod;
    /**
     * Time after which EV will trip if an island has been detected. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVIslandingTripTime
     */
    @Optional
    private Float evIslandingTripTime;
    /**
     * Maximum injected DC current allowed at level 1 charging. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumLevel1DCInjection
     */
    @Optional
    private Float evMaximumLevel1DCInjection;
    /**
     * Maximum allowed duration of DC injection at level 1 charging. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVDurationLevel1DCInjection
     */
    @Optional
    private Float evDurationLevel1DCInjection;
    /**
     * Maximum injected DC current allowed at level 2 charging. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumLevel2DCInjection
     */
    @Optional
    private Float evMaximumLevel2DCInjection;
    /**
     * Maximum allowed duration of DC injection at level 2 charging. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVDurationLevel2DCInjection
     */
    @Optional
    private Float evDurationLevel2DCInjection;
    /**
     * Measure of the susceptibility of the circuit to reactance, in Siemens (S). +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVReactiveSusceptance
     */
    @Optional
    private Float evReactiveSusceptance;
    /**
     * Total energy value, in Wh, that EV is allowed to provide during the entire V2G session. The value is independent of the V2X Cycling area. Once this value reaches the value of 0, the EV may block any attempt to discharge in order to protect the battery health.
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVSessionTotalDischargeEnergyAvailable
     */
    @Optional
    private Float evSessionTotalDischargeEnergyAvailable;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public DERChargingParameters() {
    }

    /**
     * @param maxDischargeReactivePower              Rated maximum injected reactive power, defined by min(EV, EVSE), in vars. +
     *                                               This field represents the sum of all phases, unless values are provided for L2 and L3,
     *                                               in which case this field represents phase L1. +
     *                                               Corresponds to the IvarMax attribute in the IEC 61850. +
     *                                               *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumDischargeReactivePower
     *                                               .
     * @param evInverterHwVersion                    Hardware version of EV inverter. +
     *                                               *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVInverterHwVersion
     *                                               .
     * @param evInverterManufacturer                 Manufacturer of the EV inverter. +
     *                                               *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVInverterManufacturer
     *                                               .
     * @param maxDischargeApparentPower              Rated maximum injected apparent power, defined by min(EV, EVSE) in va. +
     *                                               This field represents the sum of all phases, unless values are provided for L2 and L3,
     *                                               in which case this field represents phase L1. +
     *                                               Corresponds to the DisVAMaxRtg in IEC 61850. +
     *                                               *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumDischargeApparentPower
     *                                               .
     * @param evInverterModel                        Model name of the EV inverter. +
     *                                               *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVInverterModel
     *                                               .
     * @param evDurationLevel1DCInjection            Maximum allowed duration of DC injection at level 1 charging. +
     *                                               *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVDurationLevel1DCInjection
     *                                               .
     * @param evOverExcitedMaxDischargePower         Rated maximum injected active power by EV, at specified over-excited power factor (overExcitedPowerFactor). +
     *                                               It can also be defined as the rated maximum discharge power at the rated minimum injected reactive power value. This means that if the EV is providing reactive power support, and it is requested to discharge at max power (e.g. to satisfy an EMS request), the EV may override the request and discharge up to overExcitedMaximumDischargePower to meet the minimum reactive power requirements. +
     *                                               Corresponds to the WOvPF attribute in IEC 61850. +
     *                                               *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVOverExcitedMaximumDischargePower
     *                                               .
     * @param maxNominalVoltage                      Maximum AC rms voltage, as defined by min(EV, EVSE)  to operate with. +
     *                                               *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumNominalVoltage
     *                                               .
     * @param nominalVoltageOffset                   The nominal AC voltage (rms) offset between the Charging Station's electrical connection point and the utility’s point of common coupling. +
     *                                               *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVNominalVoltageOffset
     *                                               .
     * @param evUnderExcitedPowerFactor              EV power factor when injecting (under excited) the minimum reactive power. +
     *                                               Corresponds to the OvPF attribute in IEC 61850. +
     *                                               *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVUnderExcitedPowerFactor
     *                                               .
     * @param nominalVoltage                         Line voltage supported by EVSE and EV.
     *                                               *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVNominalVoltage
     *                                               .
     * @param evSessionTotalDischargeEnergyAvailable Total energy value, in Wh, that EV is allowed to provide during the entire V2G session. The value is independent of the V2X Cycling area. Once this value reaches the value of 0, the EV may block any attempt to discharge in order to protect the battery health.
     *                                               *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVSessionTotalDischargeEnergyAvailable
     *                                               <p>
     *                                               <p>
     *                                               .
     * @param evIslandingDetectionMethod             Type of islanding detection method. Only mandatory when islanding detection is required at the site, as set in the ISO 15118 Service Details configuration. +
     *                                               *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVIslandingDetectionMethod
     *                                               .
     * @param evMaximumLevel1DCInjection             Maximum injected DC current allowed at level 1 charging. +
     *                                               *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumLevel1DCInjection
     *                                               .
     * @param maxDischargeApparentPowerL2            Rated maximum injected apparent power on phase L2, defined by min(EV, EVSE) in va. +
     *                                               Corresponds to the DisVAMaxRtg in IEC 61850. +
     *                                               *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumDischargeApparentPower_L2
     *                                               .
     * @param maxDischargeApparentPowerL3            Rated maximum injected apparent power on phase L3, defined by min(EV, EVSE) in va. +
     *                                               Corresponds to the DisVAMaxRtg in IEC 61850. +
     *                                               *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumDischargeApparentPower_L3
     *                                               .
     * @param maxDischargeReactivePowerL2            Rated maximum injected reactive power, defined by min(EV, EVSE), in vars on phase L2. +
     *                                               Corresponds to the IvarMax attribute in the IEC 61850. +
     *                                               *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumDischargeReactivePower_L2
     *                                               .
     * @param minDischargeReactivePower              Rated minimum injected reactive power, defined by max(EV, EVSE), in vars. +
     *                                               This field represents the sum of all phases, unless values are provided for L2 and L3,
     *                                               in which case this field represents phase L1. +
     *                                               *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMinimumDischargeReactivePower
     *                                               .
     * @param maxDischargeReactivePowerL3            Rated maximum injected reactive power, defined by min(EV, EVSE), in vars on phase L3. +
     *                                               Corresponds to the IvarMax attribute in the IEC 61850. +
     *                                               *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumDischargeReactivePower_L3
     *                                               .
     * @param evReactiveSusceptance                  Measure of the susceptibility of the circuit to reactance, in Siemens (S). +
     *                                               *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVReactiveSusceptance
     *                                               <p>
     *                                               <p>
     *                                               .
     * @param evDurationLevel2DCInjection            Maximum allowed duration of DC injection at level 2 charging. +
     *                                               *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVDurationLevel2DCInjection
     *                                               .
     * @param evSupportedDERControl                  DER control functions supported by EV. +
     *                                               *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType:DERControlFunctions (bitmap)
     *                                               .
     * @param evOverExcitedPowerFactor               EV power factor when injecting (over excited) the minimum reactive power. +
     *                                               Corresponds to the OvPF attribute in IEC 61850. +
     *                                               *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVOverExcitedPowerFactor
     *                                               .
     * @param evUnderExcitedMaxDischargePower        Rated maximum injected active power by EV supported at specified under-excited power factor (EVUnderExcitedPowerFactor). +
     *                                               It can also be defined as the rated maximum dischargePower at the rated minimum absorbed reactive power value.
     *                                               This means that if the EV is providing reactive power support, and it is requested to discharge at max power (e.g. to satisfy an EMS request), the EV may override the request and discharge up to underExcitedMaximumDischargePower to meet the minimum reactive power requirements. +
     *                                               This corresponds to the WUnPF attribute in the IEC 61850. +
     *                                               *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVUnderExcitedMaximumDischargePower
     *                                               .
     * @param maxChargeReactivePowerL2               Rated maximum absorbed reactive power, defined by min(EV, EVSE), in vars on phase L2. +
     *                                               Corresponds to the AvarMax attribute in the IEC 61850. +
     *                                               *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumChargeReactivePower_L2
     *                                               .
     * @param evInverterSwVersion                    Software version of EV inverter. +
     *                                               *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVInverterSwVersion
     *                                               .
     * @param maxChargeReactivePowerL3               Rated maximum absorbed reactive power, defined by min(EV, EVSE), in vars on phase L3. +
     *                                               Corresponds to the AvarMax attribute in the IEC 61850. +
     *                                               *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumChargeReactivePower_L3
     *                                               .
     * @param maxChargeApparentPowerL3               Rated maximum absorbed apparent power on phase L3, defined by min(EV, EVSE) in va.
     *                                               Corresponds to the ChaVAMaxRtg in IEC 61850. +
     *                                               *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumChargeApparentPower_L3
     *                                               .
     * @param minChargeReactivePowerL2               Rated minimum absorbed reactive power, defined by max(EV, EVSE), in vars on phase L2. +
     *                                               *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMinimumChargeReactivePower_L2
     *                                               .
     * @param minDischargeReactivePowerL3            Rated minimum injected reactive power, defined by max(EV, EVSE), in var on phase L3. +
     *                                               *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMinimumDischargeReactivePower_L3
     *                                               .
     * @param maxChargeApparentPowerL2               Rated maximum absorbed apparent power on phase L2, defined by min(EV, EVSE) in va.
     *                                               Corresponds to the ChaVAMaxRtg in IEC 61850. +
     *                                               *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumChargeApparentPower_L2
     *                                               .
     * @param minChargeReactivePowerL3               Rated minimum absorbed reactive power, defined by max(EV, EVSE), in vars on phase L3. +
     *                                               *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMinimumChargeReactivePower_L3
     *                                               .
     * @param minDischargeReactivePowerL2            Rated minimum injected reactive power, defined by max(EV, EVSE), in var on phase L2. +
     *                                               *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMinimumDischargeReactivePower_L2
     *                                               .
     * @param evIslandingTripTime                    Time after which EV will trip if an island has been detected. +
     *                                               *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVIslandingTripTime
     *                                               .
     * @param maxChargeReactivePower                 Rated maximum absorbed reactive power, defined by min(EV, EVSE), in vars. +
     *                                               This field represents the sum of all phases, unless values are provided for L2 and L3,
     *                                               in which case this field represents phase L1. +
     *                                               Corresponds to the AvarMax attribute in the IEC 61850. +
     *                                               *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumChargeReactivePower
     *                                               .
     * @param maxChargeApparentPower                 Rated maximum absorbed apparent power, defined by min(EV, EVSE) in va. +
     *                                               This field represents the sum of all phases, unless values are provided for L2 and L3,
     *                                               in which case this field represents phase L1. +
     *                                               Corresponds to the ChaVAMaxRtg in IEC 61850. +
     *                                               *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumChargeApparentPower
     *                                               .
     * @param maxApparentPower                       Rated maximum total apparent power, defined by min(EV, EVSE) in va.
     *                                               Corresponds to the VAMaxRtg in IEC 61850. +
     *                                               *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumApparentPower
     *                                               .
     * @param evInverterSerialNumber                 Serial number of the EV inverter. +
     *                                               *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVInverterSerialNumber
     *                                               .
     * @param evMaximumLevel2DCInjection             Maximum injected DC current allowed at level 2 charging. +
     *                                               *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumLevel2DCInjection
     *                                               .
     * @param minNominalVoltage                      Minimum AC rms voltage, as defined by max(EV, EVSE)  to operate with. +
     *                                               *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMinimumNominalVoltage
     *                                               .
     * @param minChargeReactivePower                 Rated minimum absorbed reactive power, defined by max(EV, EVSE), in vars. +
     *                                               This field represents the sum of all phases, unless values are provided for L2 and L3,
     *                                               in which case this field represents phase L1. +
     *                                               *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMinimumChargeReactivePower
     *                                               .
     */
    public DERChargingParameters(List<DERControlEnum> evSupportedDERControl, Float evOverExcitedMaxDischargePower, Float evOverExcitedPowerFactor, Float evUnderExcitedMaxDischargePower, Float evUnderExcitedPowerFactor, Float maxApparentPower, Float maxChargeApparentPower, Float maxChargeApparentPowerL2, Float maxChargeApparentPowerL3, Float maxDischargeApparentPower, Float maxDischargeApparentPowerL2, Float maxDischargeApparentPowerL3, Float maxChargeReactivePower, Float maxChargeReactivePowerL2, Float maxChargeReactivePowerL3, Float minChargeReactivePower, Float minChargeReactivePowerL2, Float minChargeReactivePowerL3, Float maxDischargeReactivePower, Float maxDischargeReactivePowerL2, Float maxDischargeReactivePowerL3, Float minDischargeReactivePower, Float minDischargeReactivePowerL2, Float minDischargeReactivePowerL3, Float nominalVoltage, Float nominalVoltageOffset, Float maxNominalVoltage, Float minNominalVoltage, String evInverterManufacturer, String evInverterModel, String evInverterSerialNumber, String evInverterSwVersion, String evInverterHwVersion, List<IslandingDetectionEnum> evIslandingDetectionMethod, Float evIslandingTripTime, Float evMaximumLevel1DCInjection, Float evDurationLevel1DCInjection, Float evMaximumLevel2DCInjection, Float evDurationLevel2DCInjection, Float evReactiveSusceptance, Float evSessionTotalDischargeEnergyAvailable, CustomData customData) {
        super();
        this.evSupportedDERControl = evSupportedDERControl;
        this.evOverExcitedMaxDischargePower = evOverExcitedMaxDischargePower;
        this.evOverExcitedPowerFactor = evOverExcitedPowerFactor;
        this.evUnderExcitedMaxDischargePower = evUnderExcitedMaxDischargePower;
        this.evUnderExcitedPowerFactor = evUnderExcitedPowerFactor;
        this.maxApparentPower = maxApparentPower;
        this.maxChargeApparentPower = maxChargeApparentPower;
        this.maxChargeApparentPowerL2 = maxChargeApparentPowerL2;
        this.maxChargeApparentPowerL3 = maxChargeApparentPowerL3;
        this.maxDischargeApparentPower = maxDischargeApparentPower;
        this.maxDischargeApparentPowerL2 = maxDischargeApparentPowerL2;
        this.maxDischargeApparentPowerL3 = maxDischargeApparentPowerL3;
        this.maxChargeReactivePower = maxChargeReactivePower;
        this.maxChargeReactivePowerL2 = maxChargeReactivePowerL2;
        this.maxChargeReactivePowerL3 = maxChargeReactivePowerL3;
        this.minChargeReactivePower = minChargeReactivePower;
        this.minChargeReactivePowerL2 = minChargeReactivePowerL2;
        this.minChargeReactivePowerL3 = minChargeReactivePowerL3;
        this.maxDischargeReactivePower = maxDischargeReactivePower;
        this.maxDischargeReactivePowerL2 = maxDischargeReactivePowerL2;
        this.maxDischargeReactivePowerL3 = maxDischargeReactivePowerL3;
        this.minDischargeReactivePower = minDischargeReactivePower;
        this.minDischargeReactivePowerL2 = minDischargeReactivePowerL2;
        this.minDischargeReactivePowerL3 = minDischargeReactivePowerL3;
        this.nominalVoltage = nominalVoltage;
        this.nominalVoltageOffset = nominalVoltageOffset;
        this.maxNominalVoltage = maxNominalVoltage;
        this.minNominalVoltage = minNominalVoltage;
        this.evInverterManufacturer = evInverterManufacturer;
        this.evInverterModel = evInverterModel;
        this.evInverterSerialNumber = evInverterSerialNumber;
        this.evInverterSwVersion = evInverterSwVersion;
        this.evInverterHwVersion = evInverterHwVersion;
        this.evIslandingDetectionMethod = evIslandingDetectionMethod;
        this.evIslandingTripTime = evIslandingTripTime;
        this.evMaximumLevel1DCInjection = evMaximumLevel1DCInjection;
        this.evDurationLevel1DCInjection = evDurationLevel1DCInjection;
        this.evMaximumLevel2DCInjection = evMaximumLevel2DCInjection;
        this.evDurationLevel2DCInjection = evDurationLevel2DCInjection;
        this.evReactiveSusceptance = evReactiveSusceptance;
        this.evSessionTotalDischargeEnergyAvailable = evSessionTotalDischargeEnergyAvailable;
        this.customData = customData;
    }

    /**
     * DER control functions supported by EV. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType:DERControlFunctions (bitmap)
     */
    public List<DERControlEnum> getEvSupportedDERControl() {
        return evSupportedDERControl;
    }

    /**
     * DER control functions supported by EV. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType:DERControlFunctions (bitmap)
     */
    public void setEvSupportedDERControl(List<DERControlEnum> evSupportedDERControl) {
        this.evSupportedDERControl = evSupportedDERControl;
    }

    /**
     * Rated maximum injected active power by EV, at specified over-excited power factor (overExcitedPowerFactor). +
     * It can also be defined as the rated maximum discharge power at the rated minimum injected reactive power value. This means that if the EV is providing reactive power support, and it is requested to discharge at max power (e.g. to satisfy an EMS request), the EV may override the request and discharge up to overExcitedMaximumDischargePower to meet the minimum reactive power requirements. +
     * Corresponds to the WOvPF attribute in IEC 61850. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVOverExcitedMaximumDischargePower
     */
    public Float getEvOverExcitedMaxDischargePower() {
        return evOverExcitedMaxDischargePower;
    }

    /**
     * Rated maximum injected active power by EV, at specified over-excited power factor (overExcitedPowerFactor). +
     * It can also be defined as the rated maximum discharge power at the rated minimum injected reactive power value. This means that if the EV is providing reactive power support, and it is requested to discharge at max power (e.g. to satisfy an EMS request), the EV may override the request and discharge up to overExcitedMaximumDischargePower to meet the minimum reactive power requirements. +
     * Corresponds to the WOvPF attribute in IEC 61850. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVOverExcitedMaximumDischargePower
     */
    public void setEvOverExcitedMaxDischargePower(Float evOverExcitedMaxDischargePower) {
        this.evOverExcitedMaxDischargePower = evOverExcitedMaxDischargePower;
    }

    /**
     * EV power factor when injecting (over excited) the minimum reactive power. +
     * Corresponds to the OvPF attribute in IEC 61850. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVOverExcitedPowerFactor
     */
    public Float getEvOverExcitedPowerFactor() {
        return evOverExcitedPowerFactor;
    }

    /**
     * EV power factor when injecting (over excited) the minimum reactive power. +
     * Corresponds to the OvPF attribute in IEC 61850. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVOverExcitedPowerFactor
     */
    public void setEvOverExcitedPowerFactor(Float evOverExcitedPowerFactor) {
        this.evOverExcitedPowerFactor = evOverExcitedPowerFactor;
    }

    /**
     * Rated maximum injected active power by EV supported at specified under-excited power factor (EVUnderExcitedPowerFactor). +
     * It can also be defined as the rated maximum dischargePower at the rated minimum absorbed reactive power value.
     * This means that if the EV is providing reactive power support, and it is requested to discharge at max power (e.g. to satisfy an EMS request), the EV may override the request and discharge up to underExcitedMaximumDischargePower to meet the minimum reactive power requirements. +
     * This corresponds to the WUnPF attribute in the IEC 61850. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVUnderExcitedMaximumDischargePower
     */
    public Float getEvUnderExcitedMaxDischargePower() {
        return evUnderExcitedMaxDischargePower;
    }

    /**
     * Rated maximum injected active power by EV supported at specified under-excited power factor (EVUnderExcitedPowerFactor). +
     * It can also be defined as the rated maximum dischargePower at the rated minimum absorbed reactive power value.
     * This means that if the EV is providing reactive power support, and it is requested to discharge at max power (e.g. to satisfy an EMS request), the EV may override the request and discharge up to underExcitedMaximumDischargePower to meet the minimum reactive power requirements. +
     * This corresponds to the WUnPF attribute in the IEC 61850. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVUnderExcitedMaximumDischargePower
     */
    public void setEvUnderExcitedMaxDischargePower(Float evUnderExcitedMaxDischargePower) {
        this.evUnderExcitedMaxDischargePower = evUnderExcitedMaxDischargePower;
    }

    /**
     * EV power factor when injecting (under excited) the minimum reactive power. +
     * Corresponds to the OvPF attribute in IEC 61850. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVUnderExcitedPowerFactor
     */
    public Float getEvUnderExcitedPowerFactor() {
        return evUnderExcitedPowerFactor;
    }

    /**
     * EV power factor when injecting (under excited) the minimum reactive power. +
     * Corresponds to the OvPF attribute in IEC 61850. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVUnderExcitedPowerFactor
     */
    public void setEvUnderExcitedPowerFactor(Float evUnderExcitedPowerFactor) {
        this.evUnderExcitedPowerFactor = evUnderExcitedPowerFactor;
    }

    /**
     * Rated maximum total apparent power, defined by min(EV, EVSE) in va.
     * Corresponds to the VAMaxRtg in IEC 61850. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumApparentPower
     */
    public Float getMaxApparentPower() {
        return maxApparentPower;
    }

    /**
     * Rated maximum total apparent power, defined by min(EV, EVSE) in va.
     * Corresponds to the VAMaxRtg in IEC 61850. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumApparentPower
     */
    public void setMaxApparentPower(Float maxApparentPower) {
        this.maxApparentPower = maxApparentPower;
    }

    /**
     * Rated maximum absorbed apparent power, defined by min(EV, EVSE) in va. +
     * This field represents the sum of all phases, unless values are provided for L2 and L3,
     * in which case this field represents phase L1. +
     * Corresponds to the ChaVAMaxRtg in IEC 61850. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumChargeApparentPower
     */
    public Float getMaxChargeApparentPower() {
        return maxChargeApparentPower;
    }

    /**
     * Rated maximum absorbed apparent power, defined by min(EV, EVSE) in va. +
     * This field represents the sum of all phases, unless values are provided for L2 and L3,
     * in which case this field represents phase L1. +
     * Corresponds to the ChaVAMaxRtg in IEC 61850. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumChargeApparentPower
     */
    public void setMaxChargeApparentPower(Float maxChargeApparentPower) {
        this.maxChargeApparentPower = maxChargeApparentPower;
    }

    /**
     * Rated maximum absorbed apparent power on phase L2, defined by min(EV, EVSE) in va.
     * Corresponds to the ChaVAMaxRtg in IEC 61850. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumChargeApparentPower_L2
     */
    public Float getMaxChargeApparentPowerL2() {
        return maxChargeApparentPowerL2;
    }

    /**
     * Rated maximum absorbed apparent power on phase L2, defined by min(EV, EVSE) in va.
     * Corresponds to the ChaVAMaxRtg in IEC 61850. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumChargeApparentPower_L2
     */
    public void setMaxChargeApparentPowerL2(Float maxChargeApparentPowerL2) {
        this.maxChargeApparentPowerL2 = maxChargeApparentPowerL2;
    }

    /**
     * Rated maximum absorbed apparent power on phase L3, defined by min(EV, EVSE) in va.
     * Corresponds to the ChaVAMaxRtg in IEC 61850. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumChargeApparentPower_L3
     */
    public Float getMaxChargeApparentPowerL3() {
        return maxChargeApparentPowerL3;
    }

    /**
     * Rated maximum absorbed apparent power on phase L3, defined by min(EV, EVSE) in va.
     * Corresponds to the ChaVAMaxRtg in IEC 61850. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumChargeApparentPower_L3
     */
    public void setMaxChargeApparentPowerL3(Float maxChargeApparentPowerL3) {
        this.maxChargeApparentPowerL3 = maxChargeApparentPowerL3;
    }

    /**
     * Rated maximum injected apparent power, defined by min(EV, EVSE) in va. +
     * This field represents the sum of all phases, unless values are provided for L2 and L3,
     * in which case this field represents phase L1. +
     * Corresponds to the DisVAMaxRtg in IEC 61850. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumDischargeApparentPower
     */
    public Float getMaxDischargeApparentPower() {
        return maxDischargeApparentPower;
    }

    /**
     * Rated maximum injected apparent power, defined by min(EV, EVSE) in va. +
     * This field represents the sum of all phases, unless values are provided for L2 and L3,
     * in which case this field represents phase L1. +
     * Corresponds to the DisVAMaxRtg in IEC 61850. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumDischargeApparentPower
     */
    public void setMaxDischargeApparentPower(Float maxDischargeApparentPower) {
        this.maxDischargeApparentPower = maxDischargeApparentPower;
    }

    /**
     * Rated maximum injected apparent power on phase L2, defined by min(EV, EVSE) in va. +
     * Corresponds to the DisVAMaxRtg in IEC 61850. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumDischargeApparentPower_L2
     */
    public Float getMaxDischargeApparentPowerL2() {
        return maxDischargeApparentPowerL2;
    }

    /**
     * Rated maximum injected apparent power on phase L2, defined by min(EV, EVSE) in va. +
     * Corresponds to the DisVAMaxRtg in IEC 61850. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumDischargeApparentPower_L2
     */
    public void setMaxDischargeApparentPowerL2(Float maxDischargeApparentPowerL2) {
        this.maxDischargeApparentPowerL2 = maxDischargeApparentPowerL2;
    }

    /**
     * Rated maximum injected apparent power on phase L3, defined by min(EV, EVSE) in va. +
     * Corresponds to the DisVAMaxRtg in IEC 61850. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumDischargeApparentPower_L3
     */
    public Float getMaxDischargeApparentPowerL3() {
        return maxDischargeApparentPowerL3;
    }

    /**
     * Rated maximum injected apparent power on phase L3, defined by min(EV, EVSE) in va. +
     * Corresponds to the DisVAMaxRtg in IEC 61850. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumDischargeApparentPower_L3
     */
    public void setMaxDischargeApparentPowerL3(Float maxDischargeApparentPowerL3) {
        this.maxDischargeApparentPowerL3 = maxDischargeApparentPowerL3;
    }

    /**
     * Rated maximum absorbed reactive power, defined by min(EV, EVSE), in vars. +
     * This field represents the sum of all phases, unless values are provided for L2 and L3,
     * in which case this field represents phase L1. +
     * Corresponds to the AvarMax attribute in the IEC 61850. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumChargeReactivePower
     */
    public Float getMaxChargeReactivePower() {
        return maxChargeReactivePower;
    }

    /**
     * Rated maximum absorbed reactive power, defined by min(EV, EVSE), in vars. +
     * This field represents the sum of all phases, unless values are provided for L2 and L3,
     * in which case this field represents phase L1. +
     * Corresponds to the AvarMax attribute in the IEC 61850. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumChargeReactivePower
     */
    public void setMaxChargeReactivePower(Float maxChargeReactivePower) {
        this.maxChargeReactivePower = maxChargeReactivePower;
    }

    /**
     * Rated maximum absorbed reactive power, defined by min(EV, EVSE), in vars on phase L2. +
     * Corresponds to the AvarMax attribute in the IEC 61850. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumChargeReactivePower_L2
     */
    public Float getMaxChargeReactivePowerL2() {
        return maxChargeReactivePowerL2;
    }

    /**
     * Rated maximum absorbed reactive power, defined by min(EV, EVSE), in vars on phase L2. +
     * Corresponds to the AvarMax attribute in the IEC 61850. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumChargeReactivePower_L2
     */
    public void setMaxChargeReactivePowerL2(Float maxChargeReactivePowerL2) {
        this.maxChargeReactivePowerL2 = maxChargeReactivePowerL2;
    }

    /**
     * Rated maximum absorbed reactive power, defined by min(EV, EVSE), in vars on phase L3. +
     * Corresponds to the AvarMax attribute in the IEC 61850. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumChargeReactivePower_L3
     */
    public Float getMaxChargeReactivePowerL3() {
        return maxChargeReactivePowerL3;
    }

    /**
     * Rated maximum absorbed reactive power, defined by min(EV, EVSE), in vars on phase L3. +
     * Corresponds to the AvarMax attribute in the IEC 61850. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumChargeReactivePower_L3
     */
    public void setMaxChargeReactivePowerL3(Float maxChargeReactivePowerL3) {
        this.maxChargeReactivePowerL3 = maxChargeReactivePowerL3;
    }

    /**
     * Rated minimum absorbed reactive power, defined by max(EV, EVSE), in vars. +
     * This field represents the sum of all phases, unless values are provided for L2 and L3,
     * in which case this field represents phase L1. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMinimumChargeReactivePower
     */
    public Float getMinChargeReactivePower() {
        return minChargeReactivePower;
    }

    /**
     * Rated minimum absorbed reactive power, defined by max(EV, EVSE), in vars. +
     * This field represents the sum of all phases, unless values are provided for L2 and L3,
     * in which case this field represents phase L1. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMinimumChargeReactivePower
     */
    public void setMinChargeReactivePower(Float minChargeReactivePower) {
        this.minChargeReactivePower = minChargeReactivePower;
    }

    /**
     * Rated minimum absorbed reactive power, defined by max(EV, EVSE), in vars on phase L2. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMinimumChargeReactivePower_L2
     */
    public Float getMinChargeReactivePowerL2() {
        return minChargeReactivePowerL2;
    }

    /**
     * Rated minimum absorbed reactive power, defined by max(EV, EVSE), in vars on phase L2. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMinimumChargeReactivePower_L2
     */
    public void setMinChargeReactivePowerL2(Float minChargeReactivePowerL2) {
        this.minChargeReactivePowerL2 = minChargeReactivePowerL2;
    }

    /**
     * Rated minimum absorbed reactive power, defined by max(EV, EVSE), in vars on phase L3. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMinimumChargeReactivePower_L3
     */
    public Float getMinChargeReactivePowerL3() {
        return minChargeReactivePowerL3;
    }

    /**
     * Rated minimum absorbed reactive power, defined by max(EV, EVSE), in vars on phase L3. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMinimumChargeReactivePower_L3
     */
    public void setMinChargeReactivePowerL3(Float minChargeReactivePowerL3) {
        this.minChargeReactivePowerL3 = minChargeReactivePowerL3;
    }

    /**
     * Rated maximum injected reactive power, defined by min(EV, EVSE), in vars. +
     * This field represents the sum of all phases, unless values are provided for L2 and L3,
     * in which case this field represents phase L1. +
     * Corresponds to the IvarMax attribute in the IEC 61850. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumDischargeReactivePower
     */
    public Float getMaxDischargeReactivePower() {
        return maxDischargeReactivePower;
    }

    /**
     * Rated maximum injected reactive power, defined by min(EV, EVSE), in vars. +
     * This field represents the sum of all phases, unless values are provided for L2 and L3,
     * in which case this field represents phase L1. +
     * Corresponds to the IvarMax attribute in the IEC 61850. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumDischargeReactivePower
     */
    public void setMaxDischargeReactivePower(Float maxDischargeReactivePower) {
        this.maxDischargeReactivePower = maxDischargeReactivePower;
    }

    /**
     * Rated maximum injected reactive power, defined by min(EV, EVSE), in vars on phase L2. +
     * Corresponds to the IvarMax attribute in the IEC 61850. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumDischargeReactivePower_L2
     */
    public Float getMaxDischargeReactivePowerL2() {
        return maxDischargeReactivePowerL2;
    }

    /**
     * Rated maximum injected reactive power, defined by min(EV, EVSE), in vars on phase L2. +
     * Corresponds to the IvarMax attribute in the IEC 61850. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumDischargeReactivePower_L2
     */
    public void setMaxDischargeReactivePowerL2(Float maxDischargeReactivePowerL2) {
        this.maxDischargeReactivePowerL2 = maxDischargeReactivePowerL2;
    }

    /**
     * Rated maximum injected reactive power, defined by min(EV, EVSE), in vars on phase L3. +
     * Corresponds to the IvarMax attribute in the IEC 61850. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumDischargeReactivePower_L3
     */
    public Float getMaxDischargeReactivePowerL3() {
        return maxDischargeReactivePowerL3;
    }

    /**
     * Rated maximum injected reactive power, defined by min(EV, EVSE), in vars on phase L3. +
     * Corresponds to the IvarMax attribute in the IEC 61850. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumDischargeReactivePower_L3
     */
    public void setMaxDischargeReactivePowerL3(Float maxDischargeReactivePowerL3) {
        this.maxDischargeReactivePowerL3 = maxDischargeReactivePowerL3;
    }

    /**
     * Rated minimum injected reactive power, defined by max(EV, EVSE), in vars. +
     * This field represents the sum of all phases, unless values are provided for L2 and L3,
     * in which case this field represents phase L1. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMinimumDischargeReactivePower
     */
    public Float getMinDischargeReactivePower() {
        return minDischargeReactivePower;
    }

    /**
     * Rated minimum injected reactive power, defined by max(EV, EVSE), in vars. +
     * This field represents the sum of all phases, unless values are provided for L2 and L3,
     * in which case this field represents phase L1. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMinimumDischargeReactivePower
     */
    public void setMinDischargeReactivePower(Float minDischargeReactivePower) {
        this.minDischargeReactivePower = minDischargeReactivePower;
    }

    /**
     * Rated minimum injected reactive power, defined by max(EV, EVSE), in var on phase L2. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMinimumDischargeReactivePower_L2
     */
    public Float getMinDischargeReactivePowerL2() {
        return minDischargeReactivePowerL2;
    }

    /**
     * Rated minimum injected reactive power, defined by max(EV, EVSE), in var on phase L2. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMinimumDischargeReactivePower_L2
     */
    public void setMinDischargeReactivePowerL2(Float minDischargeReactivePowerL2) {
        this.minDischargeReactivePowerL2 = minDischargeReactivePowerL2;
    }

    /**
     * Rated minimum injected reactive power, defined by max(EV, EVSE), in var on phase L3. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMinimumDischargeReactivePower_L3
     */
    public Float getMinDischargeReactivePowerL3() {
        return minDischargeReactivePowerL3;
    }

    /**
     * Rated minimum injected reactive power, defined by max(EV, EVSE), in var on phase L3. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMinimumDischargeReactivePower_L3
     */
    public void setMinDischargeReactivePowerL3(Float minDischargeReactivePowerL3) {
        this.minDischargeReactivePowerL3 = minDischargeReactivePowerL3;
    }

    /**
     * Line voltage supported by EVSE and EV.
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVNominalVoltage
     */
    public Float getNominalVoltage() {
        return nominalVoltage;
    }

    /**
     * Line voltage supported by EVSE and EV.
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVNominalVoltage
     */
    public void setNominalVoltage(Float nominalVoltage) {
        this.nominalVoltage = nominalVoltage;
    }

    /**
     * The nominal AC voltage (rms) offset between the Charging Station's electrical connection point and the utility’s point of common coupling. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVNominalVoltageOffset
     */
    public Float getNominalVoltageOffset() {
        return nominalVoltageOffset;
    }

    /**
     * The nominal AC voltage (rms) offset between the Charging Station's electrical connection point and the utility’s point of common coupling. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVNominalVoltageOffset
     */
    public void setNominalVoltageOffset(Float nominalVoltageOffset) {
        this.nominalVoltageOffset = nominalVoltageOffset;
    }

    /**
     * Maximum AC rms voltage, as defined by min(EV, EVSE)  to operate with. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumNominalVoltage
     */
    public Float getMaxNominalVoltage() {
        return maxNominalVoltage;
    }

    /**
     * Maximum AC rms voltage, as defined by min(EV, EVSE)  to operate with. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumNominalVoltage
     */
    public void setMaxNominalVoltage(Float maxNominalVoltage) {
        this.maxNominalVoltage = maxNominalVoltage;
    }

    /**
     * Minimum AC rms voltage, as defined by max(EV, EVSE)  to operate with. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMinimumNominalVoltage
     */
    public Float getMinNominalVoltage() {
        return minNominalVoltage;
    }

    /**
     * Minimum AC rms voltage, as defined by max(EV, EVSE)  to operate with. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMinimumNominalVoltage
     */
    public void setMinNominalVoltage(Float minNominalVoltage) {
        this.minNominalVoltage = minNominalVoltage;
    }

    /**
     * Manufacturer of the EV inverter. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVInverterManufacturer
     */
    public String getEvInverterManufacturer() {
        return evInverterManufacturer;
    }

    /**
     * Manufacturer of the EV inverter. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVInverterManufacturer
     */
    public void setEvInverterManufacturer(String evInverterManufacturer) {
        this.evInverterManufacturer = evInverterManufacturer;
    }

    /**
     * Model name of the EV inverter. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVInverterModel
     */
    public String getEvInverterModel() {
        return evInverterModel;
    }

    /**
     * Model name of the EV inverter. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVInverterModel
     */
    public void setEvInverterModel(String evInverterModel) {
        this.evInverterModel = evInverterModel;
    }

    /**
     * Serial number of the EV inverter. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVInverterSerialNumber
     */
    public String getEvInverterSerialNumber() {
        return evInverterSerialNumber;
    }

    /**
     * Serial number of the EV inverter. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVInverterSerialNumber
     */
    public void setEvInverterSerialNumber(String evInverterSerialNumber) {
        this.evInverterSerialNumber = evInverterSerialNumber;
    }

    /**
     * Software version of EV inverter. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVInverterSwVersion
     */
    public String getEvInverterSwVersion() {
        return evInverterSwVersion;
    }

    /**
     * Software version of EV inverter. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVInverterSwVersion
     */
    public void setEvInverterSwVersion(String evInverterSwVersion) {
        this.evInverterSwVersion = evInverterSwVersion;
    }

    /**
     * Hardware version of EV inverter. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVInverterHwVersion
     */
    public String getEvInverterHwVersion() {
        return evInverterHwVersion;
    }

    /**
     * Hardware version of EV inverter. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVInverterHwVersion
     */
    public void setEvInverterHwVersion(String evInverterHwVersion) {
        this.evInverterHwVersion = evInverterHwVersion;
    }

    /**
     * Type of islanding detection method. Only mandatory when islanding detection is required at the site, as set in the ISO 15118 Service Details configuration. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVIslandingDetectionMethod
     */
    public List<IslandingDetectionEnum> getEvIslandingDetectionMethod() {
        return evIslandingDetectionMethod;
    }

    /**
     * Type of islanding detection method. Only mandatory when islanding detection is required at the site, as set in the ISO 15118 Service Details configuration. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVIslandingDetectionMethod
     */
    public void setEvIslandingDetectionMethod(List<IslandingDetectionEnum> evIslandingDetectionMethod) {
        this.evIslandingDetectionMethod = evIslandingDetectionMethod;
    }

    /**
     * Time after which EV will trip if an island has been detected. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVIslandingTripTime
     */
    public Float getEvIslandingTripTime() {
        return evIslandingTripTime;
    }

    /**
     * Time after which EV will trip if an island has been detected. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVIslandingTripTime
     */
    public void setEvIslandingTripTime(Float evIslandingTripTime) {
        this.evIslandingTripTime = evIslandingTripTime;
    }

    /**
     * Maximum injected DC current allowed at level 1 charging. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumLevel1DCInjection
     */
    public Float getEvMaximumLevel1DCInjection() {
        return evMaximumLevel1DCInjection;
    }

    /**
     * Maximum injected DC current allowed at level 1 charging. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumLevel1DCInjection
     */
    public void setEvMaximumLevel1DCInjection(Float evMaximumLevel1DCInjection) {
        this.evMaximumLevel1DCInjection = evMaximumLevel1DCInjection;
    }

    /**
     * Maximum allowed duration of DC injection at level 1 charging. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVDurationLevel1DCInjection
     */
    public Float getEvDurationLevel1DCInjection() {
        return evDurationLevel1DCInjection;
    }

    /**
     * Maximum allowed duration of DC injection at level 1 charging. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVDurationLevel1DCInjection
     */
    public void setEvDurationLevel1DCInjection(Float evDurationLevel1DCInjection) {
        this.evDurationLevel1DCInjection = evDurationLevel1DCInjection;
    }

    /**
     * Maximum injected DC current allowed at level 2 charging. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumLevel2DCInjection
     */
    public Float getEvMaximumLevel2DCInjection() {
        return evMaximumLevel2DCInjection;
    }

    /**
     * Maximum injected DC current allowed at level 2 charging. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVMaximumLevel2DCInjection
     */
    public void setEvMaximumLevel2DCInjection(Float evMaximumLevel2DCInjection) {
        this.evMaximumLevel2DCInjection = evMaximumLevel2DCInjection;
    }

    /**
     * Maximum allowed duration of DC injection at level 2 charging. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVDurationLevel2DCInjection
     */
    public Float getEvDurationLevel2DCInjection() {
        return evDurationLevel2DCInjection;
    }

    /**
     * Maximum allowed duration of DC injection at level 2 charging. +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVDurationLevel2DCInjection
     */
    public void setEvDurationLevel2DCInjection(Float evDurationLevel2DCInjection) {
        this.evDurationLevel2DCInjection = evDurationLevel2DCInjection;
    }

    /**
     * Measure of the susceptibility of the circuit to reactance, in Siemens (S). +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVReactiveSusceptance
     */
    public Float getEvReactiveSusceptance() {
        return evReactiveSusceptance;
    }

    /**
     * Measure of the susceptibility of the circuit to reactance, in Siemens (S). +
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVReactiveSusceptance
     */
    public void setEvReactiveSusceptance(Float evReactiveSusceptance) {
        this.evReactiveSusceptance = evReactiveSusceptance;
    }

    /**
     * Total energy value, in Wh, that EV is allowed to provide during the entire V2G session. The value is independent of the V2X Cycling area. Once this value reaches the value of 0, the EV may block any attempt to discharge in order to protect the battery health.
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVSessionTotalDischargeEnergyAvailable
     */
    public Float getEvSessionTotalDischargeEnergyAvailable() {
        return evSessionTotalDischargeEnergyAvailable;
    }

    /**
     * Total energy value, in Wh, that EV is allowed to provide during the entire V2G session. The value is independent of the V2X Cycling area. Once this value reaches the value of 0, the EV may block any attempt to discharge in order to protect the battery health.
     * *ISO 15118-20*: DER_BPT_AC_CPDReqEnergyTransferModeType: EVSessionTotalDischargeEnergyAvailable
     */
    public void setEvSessionTotalDischargeEnergyAvailable(Float evSessionTotalDischargeEnergyAvailable) {
        this.evSessionTotalDischargeEnergyAvailable = evSessionTotalDischargeEnergyAvailable;
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
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        if (jsonObject.has("evOverExcitedMaxDischargePower")) {
            this.evOverExcitedMaxDischargePower = jsonObject.get("evOverExcitedMaxDischargePower").getAsFloat();
        }

        if (jsonObject.has("evOverExcitedPowerFactor")) {
            this.evOverExcitedPowerFactor = jsonObject.get("evOverExcitedPowerFactor").getAsFloat();
        }

        if (jsonObject.has("evUnderExcitedMaxDischargePower")) {
            this.evUnderExcitedMaxDischargePower = jsonObject.get("evUnderExcitedMaxDischargePower").getAsFloat();
        }

        if (jsonObject.has("evUnderExcitedPowerFactor")) {
            this.evUnderExcitedPowerFactor = jsonObject.get("evUnderExcitedPowerFactor").getAsFloat();
        }

        if (jsonObject.has("maxApparentPower")) {
            this.maxApparentPower = jsonObject.get("maxApparentPower").getAsFloat();
        }

        if (jsonObject.has("maxChargeApparentPower")) {
            this.maxChargeApparentPower = jsonObject.get("maxChargeApparentPower").getAsFloat();
        }

        if (jsonObject.has("maxChargeApparentPowerL2")) {
            this.maxChargeApparentPowerL2 = jsonObject.get("maxChargeApparentPowerL2").getAsFloat();
        }

        if (jsonObject.has("maxChargeApparentPowerL3")) {
            this.maxChargeApparentPowerL3 = jsonObject.get("maxChargeApparentPowerL3").getAsFloat();
        }

        if (jsonObject.has("maxDischargeApparentPower")) {
            this.maxDischargeApparentPower = jsonObject.get("maxDischargeApparentPower").getAsFloat();
        }

        if (jsonObject.has("maxDischargeApparentPowerL2")) {
            this.maxDischargeApparentPowerL2 = jsonObject.get("maxDischargeApparentPowerL2").getAsFloat();
        }

        if (jsonObject.has("maxDischargeApparentPowerL3")) {
            this.maxDischargeApparentPowerL3 = jsonObject.get("maxDischargeApparentPowerL3").getAsFloat();
        }

        if (jsonObject.has("maxChargeReactivePower")) {
            this.maxChargeReactivePower = jsonObject.get("maxChargeReactivePower").getAsFloat();
        }

        if (jsonObject.has("maxChargeReactivePowerL2")) {
            this.maxChargeReactivePowerL2 = jsonObject.get("maxChargeReactivePowerL2").getAsFloat();
        }

        if (jsonObject.has("maxChargeReactivePowerL3")) {
            this.maxChargeReactivePowerL3 = jsonObject.get("maxChargeReactivePowerL3").getAsFloat();
        }

        if (jsonObject.has("minChargeReactivePower")) {
            this.minChargeReactivePower = jsonObject.get("minChargeReactivePower").getAsFloat();
        }

        if (jsonObject.has("minChargeReactivePowerL2")) {
            this.minChargeReactivePowerL2 = jsonObject.get("minChargeReactivePowerL2").getAsFloat();
        }

        if (jsonObject.has("minChargeReactivePowerL3")) {
            this.minChargeReactivePowerL3 = jsonObject.get("minChargeReactivePowerL3").getAsFloat();
        }

        if (jsonObject.has("maxDischargeReactivePower")) {
            this.maxDischargeReactivePower = jsonObject.get("maxDischargeReactivePower").getAsFloat();
        }

        if (jsonObject.has("maxDischargeReactivePowerL2")) {
            this.maxDischargeReactivePowerL2 = jsonObject.get("maxDischargeReactivePowerL2").getAsFloat();
        }

        if (jsonObject.has("maxDischargeReactivePowerL3")) {
            this.maxDischargeReactivePowerL3 = jsonObject.get("maxDischargeReactivePowerL3").getAsFloat();
        }

        if (jsonObject.has("minDischargeReactivePower")) {
            this.minDischargeReactivePower = jsonObject.get("minDischargeReactivePower").getAsFloat();
        }

        if (jsonObject.has("minDischargeReactivePowerL2")) {
            this.minDischargeReactivePowerL2 = jsonObject.get("minDischargeReactivePowerL2").getAsFloat();
        }

        if (jsonObject.has("minDischargeReactivePowerL3")) {
            this.minDischargeReactivePowerL3 = jsonObject.get("minDischargeReactivePowerL3").getAsFloat();
        }

        if (jsonObject.has("nominalVoltage")) {
            this.nominalVoltage = jsonObject.get("nominalVoltage").getAsFloat();
        }

        if (jsonObject.has("nominalVoltageOffset")) {
            this.nominalVoltageOffset = jsonObject.get("nominalVoltageOffset").getAsFloat();
        }

        if (jsonObject.has("maxNominalVoltage")) {
            this.maxNominalVoltage = jsonObject.get("maxNominalVoltage").getAsFloat();
        }

        if (jsonObject.has("minNominalVoltage")) {
            this.minNominalVoltage = jsonObject.get("minNominalVoltage").getAsFloat();
        }

        if (jsonObject.has("evInverterManufacturer")) {
            this.evInverterManufacturer = jsonObject.get("evInverterManufacturer").getAsString();
        }

        if (jsonObject.has("evInverterModel")) {
            this.evInverterModel = jsonObject.get("evInverterModel").getAsString();
        }

        if (jsonObject.has("evInverterSerialNumber")) {
            this.evInverterSerialNumber = jsonObject.get("evInverterSerialNumber").getAsString();
        }

        if (jsonObject.has("evInverterSwVersion")) {
            this.evInverterSwVersion = jsonObject.get("evInverterSwVersion").getAsString();
        }

        if (jsonObject.has("evInverterHwVersion")) {
            this.evInverterHwVersion = jsonObject.get("evInverterHwVersion").getAsString();
        }

        if (jsonObject.has("evIslandingTripTime")) {
            this.evIslandingTripTime = jsonObject.get("evIslandingTripTime").getAsFloat();
        }

        if (jsonObject.has("evMaximumLevel1DCInjection")) {
            this.evMaximumLevel1DCInjection = jsonObject.get("evMaximumLevel1DCInjection").getAsFloat();
        }

        if (jsonObject.has("evDurationLevel1DCInjection")) {
            this.evDurationLevel1DCInjection = jsonObject.get("evDurationLevel1DCInjection").getAsFloat();
        }

        if (jsonObject.has("evMaximumLevel2DCInjection")) {
            this.evMaximumLevel2DCInjection = jsonObject.get("evMaximumLevel2DCInjection").getAsFloat();
        }

        if (jsonObject.has("evDurationLevel2DCInjection")) {
            this.evDurationLevel2DCInjection = jsonObject.get("evDurationLevel2DCInjection").getAsFloat();
        }

        if (jsonObject.has("evReactiveSusceptance")) {
            this.evReactiveSusceptance = jsonObject.get("evReactiveSusceptance").getAsFloat();
        }

        if (jsonObject.has("evSessionTotalDischargeEnergyAvailable")) {
            this.evSessionTotalDischargeEnergyAvailable = jsonObject.get("evSessionTotalDischargeEnergyAvailable").getAsFloat();
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
