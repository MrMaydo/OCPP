package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;

import java.util.Objects;

/**
 * Charging parameters for ISO 15118-20, also supporting V2X charging/discharging.+
 * All values are greater or equal to zero, with the exception of EVMinEnergyRequest, EVMaxEnergyRequest, EVTargetEnergyRequest, EVMinV2XEnergyRequest and EVMaxV2XEnergyRequest.
 */
public class V2XChargingParameters implements JsonInterface {

    /**
     * Minimum charge power in W, defined by max(EV, EVSE).
     * This field represents the sum of all phases, unless values are provided for L2 and L3, in which case this field represents phase L1.
     * Relates to:
     * *ISO 15118-20*: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMinimumChargePower
     */
    @Optional
    private Float minChargePower;
    /**
     * Minimum charge power on phase L2 in W, defined by max(EV, EVSE).
     * Relates to:
     * *ISO 15118-20*: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMinimumChargePower_L2
     */
    @Optional
    private Float minChargePowerL2;
    /**
     * Minimum charge power on phase L3 in W, defined by max(EV, EVSE).
     * Relates to:
     * *ISO 15118-20*: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMinimumChargePower_L3
     */
    @Optional
    private Float minChargePowerL3;
    /**
     * Maximum charge (absorbed) power in W, defined by min(EV, EVSE) at unity power factor. +
     * This field represents the sum of all phases, unless values are provided for L2 and L3, in which case this field represents phase L1.
     * It corresponds to the ChaWMax attribute in the IEC 61850.
     * It is usually equivalent to the rated apparent power of the EV when discharging (ChaVAMax) in IEC 61850. +
     * <p>
     * Relates to:
     * *ISO 15118-20*: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMaximumChargePower
     */
    @Optional
    private Float maxChargePower;
    /**
     * Maximum charge power on phase L2 in W, defined by min(EV, EVSE)
     * Relates to:
     * *ISO 15118-20*: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMaximumChargePower_L2
     */
    @Optional
    private Float maxChargePowerL2;
    /**
     * Maximum charge power on phase L3 in W, defined by min(EV, EVSE)
     * Relates to:
     * *ISO 15118-20*: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMaximumChargePower_L3
     */
    @Optional
    private Float maxChargePowerL3;
    /**
     * Minimum discharge (injected) power in W, defined by max(EV, EVSE) at unity power factor. Value &gt;= 0. +
     * This field represents the sum of all phases, unless values are provided for L2 and L3, in which case this field represents phase L1. +
     * It corresponds to the WMax attribute in the IEC 61850.
     * It is usually equivalent to the rated apparent power of the EV when discharging (VAMax attribute in the IEC 61850).
     * <p>
     * Relates to:
     * *ISO 15118-20*: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMinimumDischargePower
     */
    @Optional
    private Float minDischargePower;
    /**
     * Minimum discharge power on phase L2 in W, defined by max(EV, EVSE).  Value &gt;= 0.
     * Relates to:
     * *ISO 15118-20*: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMinimumDischargePower_L2
     */
    @Optional
    private Float minDischargePowerL2;
    /**
     * Minimum discharge power on phase L3 in W, defined by max(EV, EVSE).  Value &gt;= 0.
     * Relates to:
     * *ISO 15118-20*: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMinimumDischargePower_L3
     */
    @Optional
    private Float minDischargePowerL3;
    /**
     * Maximum discharge (injected) power in W, defined by min(EV, EVSE) at unity power factor.  Value &gt;= 0.
     * This field represents the sum of all phases, unless values are provided for L2 and L3, in which case this field represents phase L1.
     * Relates to:
     * *ISO 15118-20*: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMaximumDischargePower
     */
    @Optional
    private Float maxDischargePower;
    /**
     * Maximum discharge power on phase L2 in W, defined by min(EV, EVSE).  Value &gt;= 0.
     * Relates to:
     * *ISO 15118-20*: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMaximumDischargePowe_L2
     */
    @Optional
    private Float maxDischargePowerL2;
    /**
     * Maximum discharge power on phase L3 in W, defined by min(EV, EVSE).  Value &gt;= 0.
     * Relates to:
     * *ISO 15118-20*: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMaximumDischargePower_L3
     */
    @Optional
    private Float maxDischargePowerL3;
    /**
     * Minimum charge current in A, defined by max(EV, EVSE)
     * Relates to:
     * *ISO 15118-20*: BPT_DC_CPDReqEnergyTransferModeType: EVMinimumChargeCurrent
     */
    @Optional
    private Float minChargeCurrent;
    /**
     * Maximum charge current in A, defined by min(EV, EVSE)
     * Relates to:
     * *ISO 15118-20*: BPT_DC_CPDReqEnergyTransferModeType: EVMaximumChargeCurrent
     */
    @Optional
    private Float maxChargeCurrent;
    /**
     * Minimum discharge current in A, defined by max(EV, EVSE).  Value &gt;= 0.
     * Relates to:
     * *ISO 15118-20*: BPT_DC_CPDReqEnergyTransferModeType: EVMinimumDischargeCurrent
     */
    @Optional
    private Float minDischargeCurrent;
    /**
     * Maximum discharge current in A, defined by min(EV, EVSE).  Value &gt;= 0.
     * Relates to:
     * *ISO 15118-20*: BPT_DC_CPDReqEnergyTransferModeType: EVMaximumDischargeCurrent
     */
    @Optional
    private Float maxDischargeCurrent;
    /**
     * Minimum voltage in V, defined by max(EV, EVSE)
     * Relates to:
     * *ISO 15118-20*: BPT_DC_CPDReqEnergyTransferModeType: EVMinimumVoltage
     */
    @Optional
    private Float minVoltage;
    /**
     * Maximum voltage in V, defined by min(EV, EVSE)
     * Relates to:
     * *ISO 15118-20*: BPT_DC_CPDReqEnergyTransferModeType: EVMaximumVoltage
     */
    @Optional
    private Float maxVoltage;
    /**
     * Energy to requested state of charge in Wh
     * Relates to:
     * *ISO 15118-20*: Dynamic/Scheduled_SEReqControlModeType: EVTargetEnergyRequest
     */
    @Optional
    private Float evTargetEnergyRequest;
    /**
     * Energy to minimum allowed state of charge in Wh
     * Relates to:
     * *ISO 15118-20*: Dynamic/Scheduled_SEReqControlModeType: EVMinimumEnergyRequest
     */
    @Optional
    private Float evMinEnergyRequest;
    /**
     * Energy to maximum state of charge in Wh
     * Relates to:
     * *ISO 15118-20*: Dynamic/Scheduled_SEReqControlModeType: EVMaximumEnergyRequest
     */
    @Optional
    private Float evMaxEnergyRequest;
    /**
     * Energy (in Wh) to minimum state of charge for cycling (V2X) activity.
     * Positive value means that current state of charge is below V2X range.
     * Relates to:
     * *ISO 15118-20*: Dynamic_SEReqControlModeType: EVMinimumV2XEnergyRequest
     */
    @Optional
    private Float evMinV2XEnergyRequest;
    /**
     * Energy (in Wh) to maximum state of charge for cycling (V2X) activity.
     * Negative value indicates that current state of charge is above V2X range.
     * Relates to:
     * *ISO 15118-20*: Dynamic_SEReqControlModeType: EVMaximumV2XEnergyRequest
     */
    @Optional
    private Float evMaxV2XEnergyRequest;
    /**
     * Target state of charge at departure as percentage.
     * Relates to:
     * *ISO 15118-20*: BPT_DC_CPDReqEnergyTransferModeType: TargetSOC
     */
    @Optional
    private Integer targetSoC;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public V2XChargingParameters() {
    }

    /**
     * @param minDischargePower     Minimum discharge (injected) power in W, defined by max(EV, EVSE) at unity power factor. Value &gt;= 0. +
     *                              This field represents the sum of all phases, unless values are provided for L2 and L3, in which case this field represents phase L1. +
     *                              It corresponds to the WMax attribute in the IEC 61850.
     *                              It is usually equivalent to the rated apparent power of the EV when discharging (VAMax attribute in the IEC 61850).
     *                              <p>
     *                              Relates to:
     *                              *ISO 15118-20*: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMinimumDischargePower
     *                              <p>
     *                              .
     * @param minChargePower        Minimum charge power in W, defined by max(EV, EVSE).
     *                              This field represents the sum of all phases, unless values are provided for L2 and L3, in which case this field represents phase L1.
     *                              Relates to:
     *                              *ISO 15118-20*: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMinimumChargePower
     *                              .
     * @param evMinV2XEnergyRequest Energy (in Wh) to minimum state of charge for cycling (V2X) activity.
     *                              Positive value means that current state of charge is below V2X range.
     *                              Relates to:
     *                              *ISO 15118-20*: Dynamic_SEReqControlModeType: EVMinimumV2XEnergyRequest
     *                              <p>
     *                              .
     * @param maxChargePowerL3      Maximum charge power on phase L3 in W, defined by min(EV, EVSE)
     *                              Relates to:
     *                              *ISO 15118-20*: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMaximumChargePower_L3
     *                              <p>
     *                              <p>
     *                              .
     * @param maxChargeCurrent      Maximum charge current in A, defined by min(EV, EVSE)
     *                              Relates to:
     *                              *ISO 15118-20*: BPT_DC_CPDReqEnergyTransferModeType: EVMaximumChargeCurrent
     *                              <p>
     *                              <p>
     *                              .
     * @param maxChargePowerL2      Maximum charge power on phase L2 in W, defined by min(EV, EVSE)
     *                              Relates to:
     *                              *ISO 15118-20*: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMaximumChargePower_L2
     *                              <p>
     *                              <p>
     *                              .
     * @param minVoltage            Minimum voltage in V, defined by max(EV, EVSE)
     *                              Relates to:
     *                              *ISO 15118-20*: BPT_DC_CPDReqEnergyTransferModeType: EVMinimumVoltage
     *                              <p>
     *                              .
     * @param minChargeCurrent      Minimum charge current in A, defined by max(EV, EVSE)
     *                              Relates to:
     *                              *ISO 15118-20*: BPT_DC_CPDReqEnergyTransferModeType: EVMinimumChargeCurrent
     *                              <p>
     *                              .
     * @param maxVoltage            Maximum voltage in V, defined by min(EV, EVSE)
     *                              Relates to:
     *                              *ISO 15118-20*: BPT_DC_CPDReqEnergyTransferModeType: EVMaximumVoltage
     *                              <p>
     *                              .
     * @param maxDischargePowerL2   Maximum discharge power on phase L2 in W, defined by min(EV, EVSE).  Value &gt;= 0.
     *                              Relates to:
     *                              *ISO 15118-20*: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMaximumDischargePowe_L2
     *                              <p>
     *                              .
     * @param minDischargePowerL2   Minimum discharge power on phase L2 in W, defined by max(EV, EVSE).  Value &gt;= 0.
     *                              Relates to:
     *                              *ISO 15118-20*: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMinimumDischargePower_L2
     *                              <p>
     *                              .
     * @param maxDischargePowerL3   Maximum discharge power on phase L3 in W, defined by min(EV, EVSE).  Value &gt;= 0.
     *                              Relates to:
     *                              *ISO 15118-20*: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMaximumDischargePower_L3
     *                              <p>
     *                              .
     * @param evMaxEnergyRequest    Energy to maximum state of charge in Wh
     *                              Relates to:
     *                              *ISO 15118-20*: Dynamic/Scheduled_SEReqControlModeType: EVMaximumEnergyRequest
     *                              <p>
     *                              .
     * @param minChargePowerL2      Minimum charge power on phase L2 in W, defined by max(EV, EVSE).
     *                              Relates to:
     *                              *ISO 15118-20*: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMinimumChargePower_L2
     *                              .
     * @param minDischargePowerL3   Minimum discharge power on phase L3 in W, defined by max(EV, EVSE).  Value &gt;= 0.
     *                              Relates to:
     *                              *ISO 15118-20*: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMinimumDischargePower_L3
     *                              <p>
     *                              .
     * @param targetSoC             Target state of charge at departure as percentage.
     *                              Relates to:
     *                              *ISO 15118-20*: BPT_DC_CPDReqEnergyTransferModeType: TargetSOC
     *                              <p>
     *                              .
     * @param minChargePowerL3      Minimum charge power on phase L3 in W, defined by max(EV, EVSE).
     *                              Relates to:
     *                              *ISO 15118-20*: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMinimumChargePower_L3
     *                              .
     * @param maxChargePower        Maximum charge (absorbed) power in W, defined by min(EV, EVSE) at unity power factor. +
     *                              This field represents the sum of all phases, unless values are provided for L2 and L3, in which case this field represents phase L1.
     *                              It corresponds to the ChaWMax attribute in the IEC 61850.
     *                              It is usually equivalent to the rated apparent power of the EV when discharging (ChaVAMax) in IEC 61850. +
     *                              <p>
     *                              Relates to:
     *                              *ISO 15118-20*: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMaximumChargePower
     *                              <p>
     *                              .
     * @param maxDischargeCurrent   Maximum discharge current in A, defined by min(EV, EVSE).  Value &gt;= 0.
     *                              Relates to:
     *                              *ISO 15118-20*: BPT_DC_CPDReqEnergyTransferModeType: EVMaximumDischargeCurrent
     *                              <p>
     *                              .
     * @param minDischargeCurrent   Minimum discharge current in A, defined by max(EV, EVSE).  Value &gt;= 0.
     *                              Relates to:
     *                              *ISO 15118-20*: BPT_DC_CPDReqEnergyTransferModeType: EVMinimumDischargeCurrent
     *                              <p>
     *                              <p>
     *                              .
     * @param evTargetEnergyRequest Energy to requested state of charge in Wh
     *                              Relates to:
     *                              *ISO 15118-20*: Dynamic/Scheduled_SEReqControlModeType: EVTargetEnergyRequest
     *                              <p>
     *                              .
     * @param evMaxV2XEnergyRequest Energy (in Wh) to maximum state of charge for cycling (V2X) activity.
     *                              Negative value indicates that current state of charge is above V2X range.
     *                              Relates to:
     *                              *ISO 15118-20*: Dynamic_SEReqControlModeType: EVMaximumV2XEnergyRequest
     *                              <p>
     *                              <p>
     *                              .
     * @param evMinEnergyRequest    Energy to minimum allowed state of charge in Wh
     *                              Relates to:
     *                              *ISO 15118-20*: Dynamic/Scheduled_SEReqControlModeType: EVMinimumEnergyRequest
     *                              <p>
     *                              .
     * @param maxDischargePower     Maximum discharge (injected) power in W, defined by min(EV, EVSE) at unity power factor.  Value &gt;= 0.
     *                              This field represents the sum of all phases, unless values are provided for L2 and L3, in which case this field represents phase L1.
     *                              Relates to:
     *                              *ISO 15118-20*: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMaximumDischargePower
     *                              <p>
     *                              <p>
     *                              .
     */
    public V2XChargingParameters(Float minChargePower, Float minChargePowerL2, Float minChargePowerL3, Float maxChargePower, Float maxChargePowerL2, Float maxChargePowerL3, Float minDischargePower, Float minDischargePowerL2, Float minDischargePowerL3, Float maxDischargePower, Float maxDischargePowerL2, Float maxDischargePowerL3, Float minChargeCurrent, Float maxChargeCurrent, Float minDischargeCurrent, Float maxDischargeCurrent, Float minVoltage, Float maxVoltage, Float evTargetEnergyRequest, Float evMinEnergyRequest, Float evMaxEnergyRequest, Float evMinV2XEnergyRequest, Float evMaxV2XEnergyRequest, Integer targetSoC, CustomData customData) {
        super();
        this.minChargePower = minChargePower;
        this.minChargePowerL2 = minChargePowerL2;
        this.minChargePowerL3 = minChargePowerL3;
        this.maxChargePower = maxChargePower;
        this.maxChargePowerL2 = maxChargePowerL2;
        this.maxChargePowerL3 = maxChargePowerL3;
        this.minDischargePower = minDischargePower;
        this.minDischargePowerL2 = minDischargePowerL2;
        this.minDischargePowerL3 = minDischargePowerL3;
        this.maxDischargePower = maxDischargePower;
        this.maxDischargePowerL2 = maxDischargePowerL2;
        this.maxDischargePowerL3 = maxDischargePowerL3;
        this.minChargeCurrent = minChargeCurrent;
        this.maxChargeCurrent = maxChargeCurrent;
        this.minDischargeCurrent = minDischargeCurrent;
        this.maxDischargeCurrent = maxDischargeCurrent;
        this.minVoltage = minVoltage;
        this.maxVoltage = maxVoltage;
        this.evTargetEnergyRequest = evTargetEnergyRequest;
        this.evMinEnergyRequest = evMinEnergyRequest;
        this.evMaxEnergyRequest = evMaxEnergyRequest;
        this.evMinV2XEnergyRequest = evMinV2XEnergyRequest;
        this.evMaxV2XEnergyRequest = evMaxV2XEnergyRequest;
        this.targetSoC = targetSoC;
        this.customData = customData;
    }

    /**
     * Minimum charge power in W, defined by max(EV, EVSE).
     * This field represents the sum of all phases, unless values are provided for L2 and L3, in which case this field represents phase L1.
     * Relates to:
     * *ISO 15118-20*: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMinimumChargePower
     */
    public Float getMinChargePower() {
        return minChargePower;
    }

    /**
     * Minimum charge power in W, defined by max(EV, EVSE).
     * This field represents the sum of all phases, unless values are provided for L2 and L3, in which case this field represents phase L1.
     * Relates to:
     * *ISO 15118-20*: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMinimumChargePower
     */
    public void setMinChargePower(Float minChargePower) {
        this.minChargePower = minChargePower;
    }

    /**
     * Minimum charge power on phase L2 in W, defined by max(EV, EVSE).
     * Relates to:
     * *ISO 15118-20*: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMinimumChargePower_L2
     */
    public Float getMinChargePowerL2() {
        return minChargePowerL2;
    }

    /**
     * Minimum charge power on phase L2 in W, defined by max(EV, EVSE).
     * Relates to:
     * *ISO 15118-20*: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMinimumChargePower_L2
     */
    public void setMinChargePowerL2(Float minChargePowerL2) {
        this.minChargePowerL2 = minChargePowerL2;
    }

    /**
     * Minimum charge power on phase L3 in W, defined by max(EV, EVSE).
     * Relates to:
     * *ISO 15118-20*: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMinimumChargePower_L3
     */
    public Float getMinChargePowerL3() {
        return minChargePowerL3;
    }

    /**
     * Minimum charge power on phase L3 in W, defined by max(EV, EVSE).
     * Relates to:
     * *ISO 15118-20*: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMinimumChargePower_L3
     */
    public void setMinChargePowerL3(Float minChargePowerL3) {
        this.minChargePowerL3 = minChargePowerL3;
    }

    /**
     * Maximum charge (absorbed) power in W, defined by min(EV, EVSE) at unity power factor. +
     * This field represents the sum of all phases, unless values are provided for L2 and L3, in which case this field represents phase L1.
     * It corresponds to the ChaWMax attribute in the IEC 61850.
     * It is usually equivalent to the rated apparent power of the EV when discharging (ChaVAMax) in IEC 61850. +
     * <p>
     * Relates to:
     * *ISO 15118-20*: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMaximumChargePower
     */
    public Float getMaxChargePower() {
        return maxChargePower;
    }

    /**
     * Maximum charge (absorbed) power in W, defined by min(EV, EVSE) at unity power factor. +
     * This field represents the sum of all phases, unless values are provided for L2 and L3, in which case this field represents phase L1.
     * It corresponds to the ChaWMax attribute in the IEC 61850.
     * It is usually equivalent to the rated apparent power of the EV when discharging (ChaVAMax) in IEC 61850. +
     * <p>
     * Relates to:
     * *ISO 15118-20*: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMaximumChargePower
     */
    public void setMaxChargePower(Float maxChargePower) {
        this.maxChargePower = maxChargePower;
    }

    /**
     * Maximum charge power on phase L2 in W, defined by min(EV, EVSE)
     * Relates to:
     * *ISO 15118-20*: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMaximumChargePower_L2
     */
    public Float getMaxChargePowerL2() {
        return maxChargePowerL2;
    }

    /**
     * Maximum charge power on phase L2 in W, defined by min(EV, EVSE)
     * Relates to:
     * *ISO 15118-20*: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMaximumChargePower_L2
     */
    public void setMaxChargePowerL2(Float maxChargePowerL2) {
        this.maxChargePowerL2 = maxChargePowerL2;
    }

    /**
     * Maximum charge power on phase L3 in W, defined by min(EV, EVSE)
     * Relates to:
     * *ISO 15118-20*: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMaximumChargePower_L3
     */
    public Float getMaxChargePowerL3() {
        return maxChargePowerL3;
    }

    /**
     * Maximum charge power on phase L3 in W, defined by min(EV, EVSE)
     * Relates to:
     * *ISO 15118-20*: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMaximumChargePower_L3
     */
    public void setMaxChargePowerL3(Float maxChargePowerL3) {
        this.maxChargePowerL3 = maxChargePowerL3;
    }

    /**
     * Minimum discharge (injected) power in W, defined by max(EV, EVSE) at unity power factor. Value &gt;= 0. +
     * This field represents the sum of all phases, unless values are provided for L2 and L3, in which case this field represents phase L1. +
     * It corresponds to the WMax attribute in the IEC 61850.
     * It is usually equivalent to the rated apparent power of the EV when discharging (VAMax attribute in the IEC 61850).
     * <p>
     * Relates to:
     * *ISO 15118-20*: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMinimumDischargePower
     */
    public Float getMinDischargePower() {
        return minDischargePower;
    }

    /**
     * Minimum discharge (injected) power in W, defined by max(EV, EVSE) at unity power factor. Value &gt;= 0. +
     * This field represents the sum of all phases, unless values are provided for L2 and L3, in which case this field represents phase L1. +
     * It corresponds to the WMax attribute in the IEC 61850.
     * It is usually equivalent to the rated apparent power of the EV when discharging (VAMax attribute in the IEC 61850).
     * <p>
     * Relates to:
     * *ISO 15118-20*: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMinimumDischargePower
     */
    public void setMinDischargePower(Float minDischargePower) {
        this.minDischargePower = minDischargePower;
    }

    /**
     * Minimum discharge power on phase L2 in W, defined by max(EV, EVSE).  Value &gt;= 0.
     * Relates to:
     * *ISO 15118-20*: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMinimumDischargePower_L2
     */
    public Float getMinDischargePowerL2() {
        return minDischargePowerL2;
    }

    /**
     * Minimum discharge power on phase L2 in W, defined by max(EV, EVSE).  Value &gt;= 0.
     * Relates to:
     * *ISO 15118-20*: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMinimumDischargePower_L2
     */
    public void setMinDischargePowerL2(Float minDischargePowerL2) {
        this.minDischargePowerL2 = minDischargePowerL2;
    }

    /**
     * Minimum discharge power on phase L3 in W, defined by max(EV, EVSE).  Value &gt;= 0.
     * Relates to:
     * *ISO 15118-20*: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMinimumDischargePower_L3
     */
    public Float getMinDischargePowerL3() {
        return minDischargePowerL3;
    }

    /**
     * Minimum discharge power on phase L3 in W, defined by max(EV, EVSE).  Value &gt;= 0.
     * Relates to:
     * *ISO 15118-20*: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMinimumDischargePower_L3
     */
    public void setMinDischargePowerL3(Float minDischargePowerL3) {
        this.minDischargePowerL3 = minDischargePowerL3;
    }

    /**
     * Maximum discharge (injected) power in W, defined by min(EV, EVSE) at unity power factor.  Value &gt;= 0.
     * This field represents the sum of all phases, unless values are provided for L2 and L3, in which case this field represents phase L1.
     * Relates to:
     * *ISO 15118-20*: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMaximumDischargePower
     */
    public Float getMaxDischargePower() {
        return maxDischargePower;
    }

    /**
     * Maximum discharge (injected) power in W, defined by min(EV, EVSE) at unity power factor.  Value &gt;= 0.
     * This field represents the sum of all phases, unless values are provided for L2 and L3, in which case this field represents phase L1.
     * Relates to:
     * *ISO 15118-20*: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMaximumDischargePower
     */
    public void setMaxDischargePower(Float maxDischargePower) {
        this.maxDischargePower = maxDischargePower;
    }

    /**
     * Maximum discharge power on phase L2 in W, defined by min(EV, EVSE).  Value &gt;= 0.
     * Relates to:
     * *ISO 15118-20*: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMaximumDischargePowe_L2
     */
    public Float getMaxDischargePowerL2() {
        return maxDischargePowerL2;
    }

    /**
     * Maximum discharge power on phase L2 in W, defined by min(EV, EVSE).  Value &gt;= 0.
     * Relates to:
     * *ISO 15118-20*: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMaximumDischargePowe_L2
     */
    public void setMaxDischargePowerL2(Float maxDischargePowerL2) {
        this.maxDischargePowerL2 = maxDischargePowerL2;
    }

    /**
     * Maximum discharge power on phase L3 in W, defined by min(EV, EVSE).  Value &gt;= 0.
     * Relates to:
     * *ISO 15118-20*: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMaximumDischargePower_L3
     */
    public Float getMaxDischargePowerL3() {
        return maxDischargePowerL3;
    }

    /**
     * Maximum discharge power on phase L3 in W, defined by min(EV, EVSE).  Value &gt;= 0.
     * Relates to:
     * *ISO 15118-20*: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMaximumDischargePower_L3
     */
    public void setMaxDischargePowerL3(Float maxDischargePowerL3) {
        this.maxDischargePowerL3 = maxDischargePowerL3;
    }

    /**
     * Minimum charge current in A, defined by max(EV, EVSE)
     * Relates to:
     * *ISO 15118-20*: BPT_DC_CPDReqEnergyTransferModeType: EVMinimumChargeCurrent
     */
    public Float getMinChargeCurrent() {
        return minChargeCurrent;
    }

    /**
     * Minimum charge current in A, defined by max(EV, EVSE)
     * Relates to:
     * *ISO 15118-20*: BPT_DC_CPDReqEnergyTransferModeType: EVMinimumChargeCurrent
     */
    public void setMinChargeCurrent(Float minChargeCurrent) {
        this.minChargeCurrent = minChargeCurrent;
    }

    /**
     * Maximum charge current in A, defined by min(EV, EVSE)
     * Relates to:
     * *ISO 15118-20*: BPT_DC_CPDReqEnergyTransferModeType: EVMaximumChargeCurrent
     */
    public Float getMaxChargeCurrent() {
        return maxChargeCurrent;
    }

    /**
     * Maximum charge current in A, defined by min(EV, EVSE)
     * Relates to:
     * *ISO 15118-20*: BPT_DC_CPDReqEnergyTransferModeType: EVMaximumChargeCurrent
     */
    public void setMaxChargeCurrent(Float maxChargeCurrent) {
        this.maxChargeCurrent = maxChargeCurrent;
    }

    /**
     * Minimum discharge current in A, defined by max(EV, EVSE).  Value &gt;= 0.
     * Relates to:
     * *ISO 15118-20*: BPT_DC_CPDReqEnergyTransferModeType: EVMinimumDischargeCurrent
     */
    public Float getMinDischargeCurrent() {
        return minDischargeCurrent;
    }

    /**
     * Minimum discharge current in A, defined by max(EV, EVSE).  Value &gt;= 0.
     * Relates to:
     * *ISO 15118-20*: BPT_DC_CPDReqEnergyTransferModeType: EVMinimumDischargeCurrent
     */
    public void setMinDischargeCurrent(Float minDischargeCurrent) {
        this.minDischargeCurrent = minDischargeCurrent;
    }

    /**
     * Maximum discharge current in A, defined by min(EV, EVSE).  Value &gt;= 0.
     * Relates to:
     * *ISO 15118-20*: BPT_DC_CPDReqEnergyTransferModeType: EVMaximumDischargeCurrent
     */
    public Float getMaxDischargeCurrent() {
        return maxDischargeCurrent;
    }

    /**
     * Maximum discharge current in A, defined by min(EV, EVSE).  Value &gt;= 0.
     * Relates to:
     * *ISO 15118-20*: BPT_DC_CPDReqEnergyTransferModeType: EVMaximumDischargeCurrent
     */
    public void setMaxDischargeCurrent(Float maxDischargeCurrent) {
        this.maxDischargeCurrent = maxDischargeCurrent;
    }

    /**
     * Minimum voltage in V, defined by max(EV, EVSE)
     * Relates to:
     * *ISO 15118-20*: BPT_DC_CPDReqEnergyTransferModeType: EVMinimumVoltage
     */
    public Float getMinVoltage() {
        return minVoltage;
    }

    /**
     * Minimum voltage in V, defined by max(EV, EVSE)
     * Relates to:
     * *ISO 15118-20*: BPT_DC_CPDReqEnergyTransferModeType: EVMinimumVoltage
     */
    public void setMinVoltage(Float minVoltage) {
        this.minVoltage = minVoltage;
    }

    /**
     * Maximum voltage in V, defined by min(EV, EVSE)
     * Relates to:
     * *ISO 15118-20*: BPT_DC_CPDReqEnergyTransferModeType: EVMaximumVoltage
     */
    public Float getMaxVoltage() {
        return maxVoltage;
    }

    /**
     * Maximum voltage in V, defined by min(EV, EVSE)
     * Relates to:
     * *ISO 15118-20*: BPT_DC_CPDReqEnergyTransferModeType: EVMaximumVoltage
     */
    public void setMaxVoltage(Float maxVoltage) {
        this.maxVoltage = maxVoltage;
    }

    /**
     * Energy to requested state of charge in Wh
     * Relates to:
     * *ISO 15118-20*: Dynamic/Scheduled_SEReqControlModeType: EVTargetEnergyRequest
     */
    public Float getEvTargetEnergyRequest() {
        return evTargetEnergyRequest;
    }

    /**
     * Energy to requested state of charge in Wh
     * Relates to:
     * *ISO 15118-20*: Dynamic/Scheduled_SEReqControlModeType: EVTargetEnergyRequest
     */
    public void setEvTargetEnergyRequest(Float evTargetEnergyRequest) {
        this.evTargetEnergyRequest = evTargetEnergyRequest;
    }

    /**
     * Energy to minimum allowed state of charge in Wh
     * Relates to:
     * *ISO 15118-20*: Dynamic/Scheduled_SEReqControlModeType: EVMinimumEnergyRequest
     */
    public Float getEvMinEnergyRequest() {
        return evMinEnergyRequest;
    }

    /**
     * Energy to minimum allowed state of charge in Wh
     * Relates to:
     * *ISO 15118-20*: Dynamic/Scheduled_SEReqControlModeType: EVMinimumEnergyRequest
     */
    public void setEvMinEnergyRequest(Float evMinEnergyRequest) {
        this.evMinEnergyRequest = evMinEnergyRequest;
    }

    /**
     * Energy to maximum state of charge in Wh
     * Relates to:
     * *ISO 15118-20*: Dynamic/Scheduled_SEReqControlModeType: EVMaximumEnergyRequest
     */
    public Float getEvMaxEnergyRequest() {
        return evMaxEnergyRequest;
    }

    /**
     * Energy to maximum state of charge in Wh
     * Relates to:
     * *ISO 15118-20*: Dynamic/Scheduled_SEReqControlModeType: EVMaximumEnergyRequest
     */
    public void setEvMaxEnergyRequest(Float evMaxEnergyRequest) {
        this.evMaxEnergyRequest = evMaxEnergyRequest;
    }

    /**
     * Energy (in Wh) to minimum state of charge for cycling (V2X) activity.
     * Positive value means that current state of charge is below V2X range.
     * Relates to:
     * *ISO 15118-20*: Dynamic_SEReqControlModeType: EVMinimumV2XEnergyRequest
     */
    public Float getEvMinV2XEnergyRequest() {
        return evMinV2XEnergyRequest;
    }

    /**
     * Energy (in Wh) to minimum state of charge for cycling (V2X) activity.
     * Positive value means that current state of charge is below V2X range.
     * Relates to:
     * *ISO 15118-20*: Dynamic_SEReqControlModeType: EVMinimumV2XEnergyRequest
     */
    public void setEvMinV2XEnergyRequest(Float evMinV2XEnergyRequest) {
        this.evMinV2XEnergyRequest = evMinV2XEnergyRequest;
    }

    /**
     * Energy (in Wh) to maximum state of charge for cycling (V2X) activity.
     * Negative value indicates that current state of charge is above V2X range.
     * Relates to:
     * *ISO 15118-20*: Dynamic_SEReqControlModeType: EVMaximumV2XEnergyRequest
     */
    public Float getEvMaxV2XEnergyRequest() {
        return evMaxV2XEnergyRequest;
    }

    /**
     * Energy (in Wh) to maximum state of charge for cycling (V2X) activity.
     * Negative value indicates that current state of charge is above V2X range.
     * Relates to:
     * *ISO 15118-20*: Dynamic_SEReqControlModeType: EVMaximumV2XEnergyRequest
     */
    public void setEvMaxV2XEnergyRequest(Float evMaxV2XEnergyRequest) {
        this.evMaxV2XEnergyRequest = evMaxV2XEnergyRequest;
    }

    /**
     * Target state of charge at departure as percentage.
     * Relates to:
     * *ISO 15118-20*: BPT_DC_CPDReqEnergyTransferModeType: TargetSOC
     */
    public Integer getTargetSoC() {
        return targetSoC;
    }

    /**
     * Target state of charge at departure as percentage.
     * Relates to:
     * *ISO 15118-20*: BPT_DC_CPDReqEnergyTransferModeType: TargetSOC
     */
    public void setTargetSoC(Integer targetSoC) {
        this.targetSoC = targetSoC;
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
        json.addProperty("minChargePower", minChargePower);
        json.addProperty("minChargePowerL2", minChargePowerL2);
        json.addProperty("minChargePowerL3", minChargePowerL3);
        json.addProperty("maxChargePower", maxChargePower);
        json.addProperty("maxChargePowerL2", maxChargePowerL2);
        json.addProperty("maxChargePowerL3", maxChargePowerL3);
        json.addProperty("minDischargePower", minDischargePower);
        json.addProperty("minDischargePowerL2", minDischargePowerL2);
        json.addProperty("minDischargePowerL3", minDischargePowerL3);
        json.addProperty("maxDischargePower", maxDischargePower);
        json.addProperty("maxDischargePowerL2", maxDischargePowerL2);
        json.addProperty("maxDischargePowerL3", maxDischargePowerL3);
        json.addProperty("minChargeCurrent", minChargeCurrent);
        json.addProperty("maxChargeCurrent", maxChargeCurrent);
        json.addProperty("minDischargeCurrent", minDischargeCurrent);
        json.addProperty("maxDischargeCurrent", maxDischargeCurrent);
        json.addProperty("minVoltage", minVoltage);
        json.addProperty("maxVoltage", maxVoltage);
        json.addProperty("evTargetEnergyRequest", evTargetEnergyRequest);
        json.addProperty("evMinEnergyRequest", evMinEnergyRequest);
        json.addProperty("evMaxEnergyRequest", evMaxEnergyRequest);
        json.addProperty("evMinV2XEnergyRequest", evMinV2XEnergyRequest);
        json.addProperty("evMaxV2XEnergyRequest", evMaxV2XEnergyRequest);
        json.addProperty("targetSoC", targetSoC);
        json.add("customData", customData.toJsonObject());
        return json;
    }

    @Override
    public void fromString(String jsonString) {
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        if (jsonObject.has("minChargePower")) {
            this.minChargePower = jsonObject.get("minChargePower").getAsFloat();
        }

        if (jsonObject.has("minChargePowerL2")) {
            this.minChargePowerL2 = jsonObject.get("minChargePowerL2").getAsFloat();
        }

        if (jsonObject.has("minChargePowerL3")) {
            this.minChargePowerL3 = jsonObject.get("minChargePowerL3").getAsFloat();
        }

        if (jsonObject.has("maxChargePower")) {
            this.maxChargePower = jsonObject.get("maxChargePower").getAsFloat();
        }

        if (jsonObject.has("maxChargePowerL2")) {
            this.maxChargePowerL2 = jsonObject.get("maxChargePowerL2").getAsFloat();
        }

        if (jsonObject.has("maxChargePowerL3")) {
            this.maxChargePowerL3 = jsonObject.get("maxChargePowerL3").getAsFloat();
        }

        if (jsonObject.has("minDischargePower")) {
            this.minDischargePower = jsonObject.get("minDischargePower").getAsFloat();
        }

        if (jsonObject.has("minDischargePowerL2")) {
            this.minDischargePowerL2 = jsonObject.get("minDischargePowerL2").getAsFloat();
        }

        if (jsonObject.has("minDischargePowerL3")) {
            this.minDischargePowerL3 = jsonObject.get("minDischargePowerL3").getAsFloat();
        }

        if (jsonObject.has("maxDischargePower")) {
            this.maxDischargePower = jsonObject.get("maxDischargePower").getAsFloat();
        }

        if (jsonObject.has("maxDischargePowerL2")) {
            this.maxDischargePowerL2 = jsonObject.get("maxDischargePowerL2").getAsFloat();
        }

        if (jsonObject.has("maxDischargePowerL3")) {
            this.maxDischargePowerL3 = jsonObject.get("maxDischargePowerL3").getAsFloat();
        }

        if (jsonObject.has("minChargeCurrent")) {
            this.minChargeCurrent = jsonObject.get("minChargeCurrent").getAsFloat();
        }

        if (jsonObject.has("maxChargeCurrent")) {
            this.maxChargeCurrent = jsonObject.get("maxChargeCurrent").getAsFloat();
        }

        if (jsonObject.has("minDischargeCurrent")) {
            this.minDischargeCurrent = jsonObject.get("minDischargeCurrent").getAsFloat();
        }

        if (jsonObject.has("maxDischargeCurrent")) {
            this.maxDischargeCurrent = jsonObject.get("maxDischargeCurrent").getAsFloat();
        }

        if (jsonObject.has("minVoltage")) {
            this.minVoltage = jsonObject.get("minVoltage").getAsFloat();
        }

        if (jsonObject.has("maxVoltage")) {
            this.maxVoltage = jsonObject.get("maxVoltage").getAsFloat();
        }

        if (jsonObject.has("evTargetEnergyRequest")) {
            this.evTargetEnergyRequest = jsonObject.get("evTargetEnergyRequest").getAsFloat();
        }

        if (jsonObject.has("evMinEnergyRequest")) {
            this.evMinEnergyRequest = jsonObject.get("evMinEnergyRequest").getAsFloat();
        }

        if (jsonObject.has("evMaxEnergyRequest")) {
            this.evMaxEnergyRequest = jsonObject.get("evMaxEnergyRequest").getAsFloat();
        }

        if (jsonObject.has("evMinV2XEnergyRequest")) {
            this.evMinV2XEnergyRequest = jsonObject.get("evMinV2XEnergyRequest").getAsFloat();
        }

        if (jsonObject.has("evMaxV2XEnergyRequest")) {
            this.evMaxV2XEnergyRequest = jsonObject.get("evMaxV2XEnergyRequest").getAsFloat();
        }

        if (jsonObject.has("targetSoC")) {
            this.targetSoC = jsonObject.get("targetSoC").getAsInt();
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
        if (!(obj instanceof V2XChargingParameters))
            return false;
        V2XChargingParameters that = (V2XChargingParameters) obj;
        return Objects.equals(this.minChargePower, that.minChargePower)
                && Objects.equals(this.evMinV2XEnergyRequest, that.evMinV2XEnergyRequest)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.minChargeCurrent, that.minChargeCurrent)
                && Objects.equals(this.minDischargePowerL2, that.minDischargePowerL2)
                && Objects.equals(this.evMaxEnergyRequest, that.evMaxEnergyRequest)
                && Objects.equals(this.minChargePowerL2, that.minChargePowerL2)
                && Objects.equals(this.minDischargePowerL3, that.minDischargePowerL3)
                && Objects.equals(this.minChargePowerL3, that.minChargePowerL3)
                && Objects.equals(this.maxDischargeCurrent, that.maxDischargeCurrent)
                && Objects.equals(this.evMinEnergyRequest, that.evMinEnergyRequest)
                && Objects.equals(this.maxDischargePower, that.maxDischargePower)
                && Objects.equals(this.minDischargePower, that.minDischargePower)
                && Objects.equals(this.maxChargePowerL3, that.maxChargePowerL3)
                && Objects.equals(this.maxChargeCurrent, that.maxChargeCurrent)
                && Objects.equals(this.maxChargePowerL2, that.maxChargePowerL2)
                && Objects.equals(this.minVoltage, that.minVoltage)
                && Objects.equals(this.maxVoltage, that.maxVoltage)
                && Objects.equals(this.maxDischargePowerL2, that.maxDischargePowerL2)
                && Objects.equals(this.maxDischargePowerL3, that.maxDischargePowerL3)
                && Objects.equals(this.targetSoC, that.targetSoC)
                && Objects.equals(this.maxChargePower, that.maxChargePower)
                && Objects.equals(this.minDischargeCurrent, that.minDischargeCurrent)
                && Objects.equals(this.evTargetEnergyRequest, that.evTargetEnergyRequest)
                && Objects.equals(this.evMaxV2XEnergyRequest, that.evMaxV2XEnergyRequest);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.minChargePower != null ? this.minChargePower.hashCode() : 0);
        result = 31 * result + (this.evMinV2XEnergyRequest != null ? this.evMinV2XEnergyRequest.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.minChargeCurrent != null ? this.minChargeCurrent.hashCode() : 0);
        result = 31 * result + (this.minDischargePowerL2 != null ? this.minDischargePowerL2.hashCode() : 0);
        result = 31 * result + (this.evMaxEnergyRequest != null ? this.evMaxEnergyRequest.hashCode() : 0);
        result = 31 * result + (this.minChargePowerL2 != null ? this.minChargePowerL2.hashCode() : 0);
        result = 31 * result + (this.minDischargePowerL3 != null ? this.minDischargePowerL3.hashCode() : 0);
        result = 31 * result + (this.minChargePowerL3 != null ? this.minChargePowerL3.hashCode() : 0);
        result = 31 * result + (this.maxDischargeCurrent != null ? this.maxDischargeCurrent.hashCode() : 0);
        result = 31 * result + (this.evMinEnergyRequest != null ? this.evMinEnergyRequest.hashCode() : 0);
        result = 31 * result + (this.maxDischargePower != null ? this.maxDischargePower.hashCode() : 0);
        result = 31 * result + (this.minDischargePower != null ? this.minDischargePower.hashCode() : 0);
        result = 31 * result + (this.maxChargePowerL3 != null ? this.maxChargePowerL3.hashCode() : 0);
        result = 31 * result + (this.maxChargeCurrent != null ? this.maxChargeCurrent.hashCode() : 0);
        result = 31 * result + (this.maxChargePowerL2 != null ? this.maxChargePowerL2.hashCode() : 0);
        result = 31 * result + (this.minVoltage != null ? this.minVoltage.hashCode() : 0);
        result = 31 * result + (this.maxVoltage != null ? this.maxVoltage.hashCode() : 0);
        result = 31 * result + (this.maxDischargePowerL2 != null ? this.maxDischargePowerL2.hashCode() : 0);
        result = 31 * result + (this.maxDischargePowerL3 != null ? this.maxDischargePowerL3.hashCode() : 0);
        result = 31 * result + (this.targetSoC != null ? this.targetSoC.hashCode() : 0);
        result = 31 * result + (this.maxChargePower != null ? this.maxChargePower.hashCode() : 0);
        result = 31 * result + (this.minDischargeCurrent != null ? this.minDischargeCurrent.hashCode() : 0);
        result = 31 * result + (this.evTargetEnergyRequest != null ? this.evTargetEnergyRequest.hashCode() : 0);
        result = 31 * result + (this.evMaxV2XEnergyRequest != null ? this.evMaxV2XEnergyRequest.hashCode() : 0);
        return result;
    }
}
