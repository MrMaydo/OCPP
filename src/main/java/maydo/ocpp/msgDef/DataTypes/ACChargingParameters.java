package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * EV AC charging parameters for ISO 15118-2
 */
public class ACChargingParameters implements JsonInterface {

    /**
     * Amount of energy requested (in Wh). This includes energy required for preconditioning.
     * Relates to: +
     * *ISO 15118-2*: AC_EVChargeParameterType: EAmount +
     * *ISO 15118-20*: Dynamic/Scheduled_SEReqControlModeType: EVTargetEnergyRequest
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private Float energyAmount;
    /**
     * Minimum current (amps) supported by the electric vehicle (per phase).
     * Relates to: +
     * *ISO 15118-2*: AC_EVChargeParameterType: EVMinCurrent
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private Float evMinCurrent;
    /**
     * Maximum current (amps) supported by the electric vehicle (per phase). Includes cable capacity.
     * Relates to: +
     * *ISO 15118-2*: AC_EVChargeParameterType: EVMaxCurrent
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private Float evMaxCurrent;
    /**
     * Maximum voltage supported by the electric vehicle.
     * Relates to: +
     * *ISO 15118-2*: AC_EVChargeParameterType: EVMaxVoltage
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private Float evMaxVoltage;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public ACChargingParameters() {
    }

    /**
     * @param evMaxCurrent Maximum current (amps) supported by the electric vehicle (per phase). Includes cable capacity.
     *                     Relates to: +
     *                     *ISO 15118-2*: AC_EVChargeParameterType: EVMaxCurrent
     *                     <p>
     *                     .
     * @param evMinCurrent Minimum current (amps) supported by the electric vehicle (per phase).
     *                     Relates to: +
     *                     *ISO 15118-2*: AC_EVChargeParameterType: EVMinCurrent
     *                     <p>
     *                     .
     * @param evMaxVoltage Maximum voltage supported by the electric vehicle.
     *                     Relates to: +
     *                     *ISO 15118-2*: AC_EVChargeParameterType: EVMaxVoltage
     *                     <p>
     *                     .
     * @param energyAmount Amount of energy requested (in Wh). This includes energy required for preconditioning.
     *                     Relates to: +
     *                     *ISO 15118-2*: AC_EVChargeParameterType: EAmount +
     *                     *ISO 15118-20*: Dynamic/Scheduled_SEReqControlModeType: EVTargetEnergyRequest
     *                     <p>
     *                     .
     */
    public ACChargingParameters(Float energyAmount, Float evMinCurrent, Float evMaxCurrent, Float evMaxVoltage, CustomData customData) {
        super();
        this.energyAmount = energyAmount;
        this.evMinCurrent = evMinCurrent;
        this.evMaxCurrent = evMaxCurrent;
        this.evMaxVoltage = evMaxVoltage;
        this.customData = customData;
    }

    /**
     * Amount of energy requested (in Wh). This includes energy required for preconditioning.
     * Relates to: +
     * *ISO 15118-2*: AC_EVChargeParameterType: EAmount +
     * *ISO 15118-20*: Dynamic/Scheduled_SEReqControlModeType: EVTargetEnergyRequest
     * <p>
     * <p>
     * (Required)
     */
    public Float getEnergyAmount() {
        return energyAmount;
    }

    /**
     * Amount of energy requested (in Wh). This includes energy required for preconditioning.
     * Relates to: +
     * *ISO 15118-2*: AC_EVChargeParameterType: EAmount +
     * *ISO 15118-20*: Dynamic/Scheduled_SEReqControlModeType: EVTargetEnergyRequest
     * <p>
     * <p>
     * (Required)
     */
    public void setEnergyAmount(Float energyAmount) {
        this.energyAmount = energyAmount;
    }

    /**
     * Minimum current (amps) supported by the electric vehicle (per phase).
     * Relates to: +
     * *ISO 15118-2*: AC_EVChargeParameterType: EVMinCurrent
     * <p>
     * <p>
     * (Required)
     */
    public Float getEvMinCurrent() {
        return evMinCurrent;
    }

    /**
     * Minimum current (amps) supported by the electric vehicle (per phase).
     * Relates to: +
     * *ISO 15118-2*: AC_EVChargeParameterType: EVMinCurrent
     * <p>
     * <p>
     * (Required)
     */
    public void setEvMinCurrent(Float evMinCurrent) {
        this.evMinCurrent = evMinCurrent;
    }

    /**
     * Maximum current (amps) supported by the electric vehicle (per phase). Includes cable capacity.
     * Relates to: +
     * *ISO 15118-2*: AC_EVChargeParameterType: EVMaxCurrent
     * <p>
     * <p>
     * (Required)
     */
    public Float getEvMaxCurrent() {
        return evMaxCurrent;
    }

    /**
     * Maximum current (amps) supported by the electric vehicle (per phase). Includes cable capacity.
     * Relates to: +
     * *ISO 15118-2*: AC_EVChargeParameterType: EVMaxCurrent
     * <p>
     * <p>
     * (Required)
     */
    public void setEvMaxCurrent(Float evMaxCurrent) {
        this.evMaxCurrent = evMaxCurrent;
    }

    /**
     * Maximum voltage supported by the electric vehicle.
     * Relates to: +
     * *ISO 15118-2*: AC_EVChargeParameterType: EVMaxVoltage
     * <p>
     * <p>
     * (Required)
     */
    public Float getEvMaxVoltage() {
        return evMaxVoltage;
    }

    /**
     * Maximum voltage supported by the electric vehicle.
     * Relates to: +
     * *ISO 15118-2*: AC_EVChargeParameterType: EVMaxVoltage
     * <p>
     * <p>
     * (Required)
     */
    public void setEvMaxVoltage(Float evMaxVoltage) {
        this.evMaxVoltage = evMaxVoltage;
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
        json.addProperty("energyAmount", energyAmount);
        json.addProperty("evMinCurrent", evMinCurrent);
        json.addProperty("evMaxCurrent", evMaxCurrent);
        json.addProperty("evMaxVoltage", evMaxVoltage);
        json.add("customData", customData.toJsonObject());
        return json;
    }

    @Override
    public void fromString(String jsonString) {
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        if (jsonObject.has("energyAmount")) {
            this.energyAmount = jsonObject.get("energyAmount").getAsFloat();
        }

        if (jsonObject.has("evMinCurrent")) {
            this.evMinCurrent = jsonObject.get("evMinCurrent").getAsFloat();
        }

        if (jsonObject.has("evMaxCurrent")) {
            this.evMaxCurrent = jsonObject.get("evMaxCurrent").getAsFloat();
        }

        if (jsonObject.has("evMaxVoltage")) {
            this.evMaxVoltage = jsonObject.get("evMaxVoltage").getAsFloat();
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
        if (!(obj instanceof ACChargingParameters))
            return false;
        ACChargingParameters that = (ACChargingParameters) obj;
        return Objects.equals(this.energyAmount, that.energyAmount)
                && Objects.equals(this.evMaxCurrent, that.evMaxCurrent)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.evMinCurrent, that.evMinCurrent)
                && Objects.equals(this.evMaxVoltage, that.evMaxVoltage);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.energyAmount != null ? this.energyAmount.hashCode() : 0);
        result = 31 * result + (this.evMaxCurrent != null ? this.evMaxCurrent.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.evMinCurrent != null ? this.evMinCurrent.hashCode() : 0);
        result = 31 * result + (this.evMaxVoltage != null ? this.evMaxVoltage.hashCode() : 0);
        return result;
    }
}
