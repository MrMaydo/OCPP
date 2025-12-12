package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;

import java.util.Objects;


/**
 * Charging parameters for ISO 15118-20, also supporting V2X charging/discharging.+ All values are greater or equal to zero, with the
 * exception of EVMinEnergyRequest, EVMaxEnergyRequest, EVTargetEnergyRequest, EVMinV2XEnergyRequest and
 * EVMaxV2XEnergyRequest.
 */
public class V2XChargingParameters implements JsonInterface {

    /**
     * Minimum charge power in W, defined by max(EV, EVSE).
     * This field represents the sum of all phases, unless values are provided for L2 and L3,
     * in which case this field represents phase L1.
     * <p> Relates to: </p>
     * <p> ISO 15118-20: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMinimumChargePower </p>
     */
    @Optional
    private Float minChargePower;

    /**
     * Minimum charge power on phase L2 in W, defined by max(EV, EVSE).
     * <p> Relates to: </p>
     * <p> ISO 15118-20: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMinimumChargePower_L2 </p>
     */
    @Optional
    private Float minChargePowerL2;

    /**
     * Minimum charge power on phase L3 in W, defined by max(EV, EVSE).
     * <p> Relates to: </p>
     * <p> ISO 15118-20: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMinimumChargePower_L3 </p>
     */
    @Optional
    private Float minChargePowerL3;

    /**
     * Maximum charge (absorbed) power in W, defined by min(EV, EVSE) at unity power factor.
     * This field represents the sum of all phases, unless values are provided for L2 and L3,
     * in which case this field represents phase L1. It corresponds to the ChaWMax attribute in the IEC 61850.
     * It is usually equivalent to the rated apparent power of the EV when discharging (ChaVAMax) in IEC 61850.
     * <p> Relates to: </p>
     * <p> ISO 15118-20: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMaximumChargePower </p>
     */
    @Optional
    private Float maxChargePower;

    /**
     * Maximum charge power on phase L2 in W, defined by min(EV, EVSE)
     * <p> Relates to: </p>
     * <p> ISO 15118-20: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMaximumChargePower_L2 </p>
     */
    @Optional
    private Float maxChargePowerL2;

    /**
     * Maximum charge power on phase L3 in W, defined by min(EV, EVSE)
     * <p> Relates to: </p>
     * <p> ISO 15118-20: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMaximumChargePower_L3 </p>
     */
    @Optional
    private Float maxChargePowerL3;

    /**
     * Minimum discharge (injected) power in W, defined by max(EV, EVSE) at unity power factor. Value >= 0.
     * This field represents the sum of all phases, unless values are provided for L2 and L3,
     * in which case this field represents phase L1. It corresponds to the WMax attribute in the IEC 61850.
     * It is usually equivalent to the rated apparent power of the EV when discharging (VAMax attribute in the IEC 61850).
     * <p> Relates to: </p>
     * <p> ISO 15118-20: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMinimumDischargePower </p>
     */
    @Optional
    private Float minDischargePower;

    /**
     * Minimum discharge power on phase L2 in W, defined by max(EV, EVSE). Value >= 0.
     * <p> Relates to: </p>
     * <p> ISO 15118-20: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMinimumDischargePower_L2 </p>
     */
    @Optional
    private Float minDischargePowerL2;

    /**
     * Minimum discharge power on phase L3 in W, defined by max(EV, EVSE). Value >= 0.
     * <p> Relates to: </p>
     * <p> ISO 15118-20: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMinimumDischargePower_L3 </p>
     */
    @Optional
    private Float minDischargePowerL3;

    /**
     * Maximum discharge (injected) power in W, defined by min(EV, EVSE) at unity power factor. Value >= 0.
     * This field represents the sum of all phases, unless values are provided for L2 and L3,
     * in which case this field represents phase L1.
     * <p> Relates to: </p>
     * <p> ISO 15118-20: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMaximumDischargePower </p>
     */
    @Optional
    private Float maxDischargePower;

    /**
     * Maximum discharge power on phase L2 in W, defined by min(EV, EVSE). Value >= 0.
     * <p> Relates to: </p>
     * <p> ISO 15118-20: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMaximumDischargePowe_L2 </p>
     */
    @Optional
    private Float maxDischargePowerL2;

    /**
     * Maximum discharge power on phase L3 in W, defined by min(EV, EVSE). Value >= 0.
     * <p> Relates to: </p>
     * <p> ISO 15118-20: BPT_AC/DC_CPDReqEnergyTransferModeType: EVMaximumDischargePower_L3 </p>
     */
    @Optional
    private Float maxDischargePowerL3;

    /**
     * Minimum charge current in A, defined by max(EV, EVSE)
     * <p> Relates to: </p>
     * <p> ISO 15118-20: BPT_DC_CPDReqEnergyTransferModeType: EVMinimumChargeCurrent </p>
     */
    @Optional
    private Float minChargeCurrent;

    /**
     * Maximum charge current in A, defined by min(EV, EVSE)
     * <p> Relates to: </p>
     * <p> ISO 15118-20: BPT_DC_CPDReqEnergyTransferModeType: EVMaximumChargeCurrent </p>
     */
    @Optional
    private Float maxChargeCurrent;

    /**
     * Minimum discharge current in A, defined by max(EV, EVSE). Value >= 0.
     * <p> Relates to: </p>
     * <p> ISO 15118-20: BPT_DC_CPDReqEnergyTransferModeType: EVMinimumDischargeCurrent </p>
     */
    @Optional
    private Float minDischargeCurrent;

    /**
     * Maximum discharge current in A, defined by min(EV, EVSE). Value >= 0.
     * <p> Relates to: </p>
     * <p> ISO 15118-20: BPT_DC_CPDReqEnergyTransferModeType: EVMaximumDischargeCurrent </p>
     */
    @Optional
    private Float maxDischargeCurrent;

    /**
     * Minimum voltage in V, defined by max(EV, EVSE)
     * <p> Relates to: </p>
     * <p> ISO 15118-20: BPT_DC_CPDReqEnergyTransferModeType: EVMinimumVoltage </p>
     */
    @Optional
    private Float minVoltage;

    /**
     * Maximum voltage in V, defined by min(EV, EVSE)
     * <p> Relates to: </p>
     * <p> ISO 15118-20: BPT_DC_CPDReqEnergyTransferModeType: EVMaximumVoltage </p>
     */
    @Optional
    private Float maxVoltage;

    /**
     * Energy to requested state of charge in Wh
     * <p> Relates to: </p>
     * <p> ISO 15118-20: Dynamic/Scheduled_SEReqControlModeType: EVTargetEnergyRequest </p>
     */
    @Optional
    private Float evTargetEnergyRequest;

    /**
     * Energy to minimum allowed state of charge in Wh
     * <p> Relates to: </p>
     * <p> ISO 15118-20: Dynamic/Scheduled_SEReqControlModeType: EVMinimumEnergyRequest </p>
     */
    @Optional
    private Float evMinEnergyRequest;

    /**
     * Energy to maximum state of charge in Wh
     * <p> Relates to: </p>
     * <p> ISO 15118-20: Dynamic/Scheduled_SEReqControlModeType: EVMaximumEnergyRequest </p>
     */
    @Optional
    private Float evMaxEnergyRequest;

    /**
     * Energy (in Wh) to minimum state of charge for cycling (V2X) activity.
     * Positive value means that current state of charge is below V2X range.
     * <p> Relates to: </p>
     * <p> ISO 15118-20: Dynamic_SEReqControlModeType: EVMinimumV2XEnergyRequest </p>
     */
    @Optional
    private Float evMinV2XEnergyRequest;

    /**
     * Energy (in Wh) to maximum state of charge for cycling (V2X) activity.
     * Negative value indicates that current state of charge is above V2X range.
     * <p> Relates to: </p>
     * <p> ISO 15118-20: Dynamic_SEReqControlModeType: EVMaximumV2XEnergyRequest </p>
     */
    @Optional
    private Float evMaxV2XEnergyRequest;

    /**
     * Target state of charge at departure as percentage.
     * <p> Relates to: </p>
     * <p> ISO 15118-20: BPT_DC_CPDReqEnergyTransferModeType: TargetSOC </p>
     */
    @Optional
    private Integer targetSoC;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public V2XChargingParameters() {
    }


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


    public Float getMinChargePower() {
        return minChargePower;
    }


    public void setMinChargePower(Float minChargePower) {
        this.minChargePower = minChargePower;
    }


    public Float getMinChargePowerL2() {
        return minChargePowerL2;
    }


    public void setMinChargePowerL2(Float minChargePowerL2) {
        this.minChargePowerL2 = minChargePowerL2;
    }


    public Float getMinChargePowerL3() {
        return minChargePowerL3;
    }


    public void setMinChargePowerL3(Float minChargePowerL3) {
        this.minChargePowerL3 = minChargePowerL3;
    }


    public Float getMaxChargePower() {
        return maxChargePower;
    }


    public void setMaxChargePower(Float maxChargePower) {
        this.maxChargePower = maxChargePower;
    }


    public Float getMaxChargePowerL2() {
        return maxChargePowerL2;
    }


    public void setMaxChargePowerL2(Float maxChargePowerL2) {
        this.maxChargePowerL2 = maxChargePowerL2;
    }


    public Float getMaxChargePowerL3() {
        return maxChargePowerL3;
    }


    public void setMaxChargePowerL3(Float maxChargePowerL3) {
        this.maxChargePowerL3 = maxChargePowerL3;
    }


    public Float getMinDischargePower() {
        return minDischargePower;
    }


    public void setMinDischargePower(Float minDischargePower) {
        this.minDischargePower = minDischargePower;
    }


    public Float getMinDischargePowerL2() {
        return minDischargePowerL2;
    }


    public void setMinDischargePowerL2(Float minDischargePowerL2) {
        this.minDischargePowerL2 = minDischargePowerL2;
    }


    public Float getMinDischargePowerL3() {
        return minDischargePowerL3;
    }


    public void setMinDischargePowerL3(Float minDischargePowerL3) {
        this.minDischargePowerL3 = minDischargePowerL3;
    }


    public Float getMaxDischargePower() {
        return maxDischargePower;
    }


    public void setMaxDischargePower(Float maxDischargePower) {
        this.maxDischargePower = maxDischargePower;
    }


    public Float getMaxDischargePowerL2() {
        return maxDischargePowerL2;
    }


    public void setMaxDischargePowerL2(Float maxDischargePowerL2) {
        this.maxDischargePowerL2 = maxDischargePowerL2;
    }


    public Float getMaxDischargePowerL3() {
        return maxDischargePowerL3;
    }


    public void setMaxDischargePowerL3(Float maxDischargePowerL3) {
        this.maxDischargePowerL3 = maxDischargePowerL3;
    }


    public Float getMinChargeCurrent() {
        return minChargeCurrent;
    }


    public void setMinChargeCurrent(Float minChargeCurrent) {
        this.minChargeCurrent = minChargeCurrent;
    }


    public Float getMaxChargeCurrent() {
        return maxChargeCurrent;
    }


    public void setMaxChargeCurrent(Float maxChargeCurrent) {
        this.maxChargeCurrent = maxChargeCurrent;
    }


    public Float getMinDischargeCurrent() {
        return minDischargeCurrent;
    }


    public void setMinDischargeCurrent(Float minDischargeCurrent) {
        this.minDischargeCurrent = minDischargeCurrent;
    }


    public Float getMaxDischargeCurrent() {
        return maxDischargeCurrent;
    }


    public void setMaxDischargeCurrent(Float maxDischargeCurrent) {
        this.maxDischargeCurrent = maxDischargeCurrent;
    }


    public Float getMinVoltage() {
        return minVoltage;
    }


    public void setMinVoltage(Float minVoltage) {
        this.minVoltage = minVoltage;
    }


    public Float getMaxVoltage() {
        return maxVoltage;
    }


    public void setMaxVoltage(Float maxVoltage) {
        this.maxVoltage = maxVoltage;
    }


    public Float getEvTargetEnergyRequest() {
        return evTargetEnergyRequest;
    }


    public void setEvTargetEnergyRequest(Float evTargetEnergyRequest) {
        this.evTargetEnergyRequest = evTargetEnergyRequest;
    }


    public Float getEvMinEnergyRequest() {
        return evMinEnergyRequest;
    }


    public void setEvMinEnergyRequest(Float evMinEnergyRequest) {
        this.evMinEnergyRequest = evMinEnergyRequest;
    }


    public Float getEvMaxEnergyRequest() {
        return evMaxEnergyRequest;
    }


    public void setEvMaxEnergyRequest(Float evMaxEnergyRequest) {
        this.evMaxEnergyRequest = evMaxEnergyRequest;
    }


    public Float getEvMinV2XEnergyRequest() {
        return evMinV2XEnergyRequest;
    }


    public void setEvMinV2XEnergyRequest(Float evMinV2XEnergyRequest) {
        this.evMinV2XEnergyRequest = evMinV2XEnergyRequest;
    }


    public Float getEvMaxV2XEnergyRequest() {
        return evMaxV2XEnergyRequest;
    }


    public void setEvMaxV2XEnergyRequest(Float evMaxV2XEnergyRequest) {
        this.evMaxV2XEnergyRequest = evMaxV2XEnergyRequest;
    }


    public Integer getTargetSoC() {
        return targetSoC;
    }


    public void setTargetSoC(Integer targetSoC) {
        this.targetSoC = targetSoC;
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
        JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
        fromJsonObject(jsonObject);
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
