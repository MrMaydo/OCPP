package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * EV DC charging parameters for ISO 15118-2
 */
public class DCChargingParameters implements JsonInterface {

    /**
     * Maximum current (in A) supported by the electric vehicle. Includes cable capacity.
     * Relates to: +
     * *ISO 15118-2*: DC_EVChargeParameterType:EVMaximumCurrentLimit
     * <p>
     * (Required)
     */
    @Required
    private Float evMaxCurrent;
    /**
     * Maximum voltage supported by the electric vehicle.
     * Relates to: +
     * *ISO 15118-2*: DC_EVChargeParameterType: EVMaximumVoltageLimit
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private Float evMaxVoltage;
    /**
     * Maximum power (in W) supported by the electric vehicle. Required for DC charging.
     * Relates to: +
     * *ISO 15118-2*: DC_EVChargeParameterType: EVMaximumPowerLimit
     */
    @Optional
    private Float evMaxPower;
    /**
     * Capacity of the electric vehicle battery (in Wh).
     * Relates to: +
     * *ISO 15118-2*: DC_EVChargeParameterType: EVEnergyCapacity
     */
    @Optional
    private Float evEnergyCapacity;
    /**
     * Amount of energy requested (in Wh). This inludes energy required for preconditioning.
     * Relates to: +
     * *ISO 15118-2*: DC_EVChargeParameterType: EVEnergyRequest
     */
    @Optional
    private Float energyAmount;
    /**
     * Energy available in the battery (in percent of the battery capacity)
     * Relates to: +
     * *ISO 15118-2*: DC_EVChargeParameterType: DC_EVStatus: EVRESSSOC
     */
    @Optional
    private Integer stateOfCharge;
    /**
     * Percentage of SoC at which the EV considers the battery fully charged. (possible values: 0 - 100)
     * Relates to: +
     * *ISO 15118-2*: DC_EVChargeParameterType: FullSOC
     */
    @Optional
    private Integer fullSoC;
    /**
     * Percentage of SoC at which the EV considers a fast charging process to end. (possible values: 0 - 100)
     * Relates to: +
     * *ISO 15118-2*: DC_EVChargeParameterType: BulkSOC
     */
    @Optional
    private Integer bulkSoC;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public DCChargingParameters() {
    }

    /**
     * @param evMaxCurrent     Maximum current (in A) supported by the electric vehicle. Includes cable capacity.
     *                         Relates to: +
     *                         *ISO 15118-2*: DC_EVChargeParameterType:EVMaximumCurrentLimit
     *                         .
     * @param stateOfCharge    Energy available in the battery (in percent of the battery capacity)
     *                         Relates to: +
     *                         *ISO 15118-2*: DC_EVChargeParameterType: DC_EVStatus: EVRESSSOC
     *                         <p>
     *                         .
     * @param evEnergyCapacity Capacity of the electric vehicle battery (in Wh).
     *                         Relates to: +
     *                         *ISO 15118-2*: DC_EVChargeParameterType: EVEnergyCapacity
     *                         <p>
     *                         .
     * @param evMaxVoltage     Maximum voltage supported by the electric vehicle.
     *                         Relates to: +
     *                         *ISO 15118-2*: DC_EVChargeParameterType: EVMaximumVoltageLimit
     *                         <p>
     *                         .
     * @param energyAmount     Amount of energy requested (in Wh). This inludes energy required for preconditioning.
     *                         Relates to: +
     *                         *ISO 15118-2*: DC_EVChargeParameterType: EVEnergyRequest
     *                         <p>
     *                         <p>
     *                         .
     * @param bulkSoC          Percentage of SoC at which the EV considers a fast charging process to end. (possible values: 0 - 100)
     *                         Relates to: +
     *                         *ISO 15118-2*: DC_EVChargeParameterType: BulkSOC
     *                         <p>
     *                         .
     * @param evMaxPower       Maximum power (in W) supported by the electric vehicle. Required for DC charging.
     *                         Relates to: +
     *                         *ISO 15118-2*: DC_EVChargeParameterType: EVMaximumPowerLimit
     *                         <p>
     *                         .
     * @param fullSoC          Percentage of SoC at which the EV considers the battery fully charged. (possible values: 0 - 100)
     *                         Relates to: +
     *                         *ISO 15118-2*: DC_EVChargeParameterType: FullSOC
     *                         <p>
     *                         .
     */
    public DCChargingParameters(Float evMaxCurrent, Float evMaxVoltage, Float evMaxPower, Float evEnergyCapacity, Float energyAmount, Integer stateOfCharge, Integer fullSoC, Integer bulkSoC, CustomData customData) {
        super();
        this.evMaxCurrent = evMaxCurrent;
        this.evMaxVoltage = evMaxVoltage;
        this.evMaxPower = evMaxPower;
        this.evEnergyCapacity = evEnergyCapacity;
        this.energyAmount = energyAmount;
        this.stateOfCharge = stateOfCharge;
        this.fullSoC = fullSoC;
        this.bulkSoC = bulkSoC;
        this.customData = customData;
    }

    /**
     * Maximum current (in A) supported by the electric vehicle. Includes cable capacity.
     * Relates to: +
     * *ISO 15118-2*: DC_EVChargeParameterType:EVMaximumCurrentLimit
     * <p>
     * (Required)
     */
    public Float getEvMaxCurrent() {
        return evMaxCurrent;
    }

    /**
     * Maximum current (in A) supported by the electric vehicle. Includes cable capacity.
     * Relates to: +
     * *ISO 15118-2*: DC_EVChargeParameterType:EVMaximumCurrentLimit
     * <p>
     * (Required)
     */
    public void setEvMaxCurrent(Float evMaxCurrent) {
        this.evMaxCurrent = evMaxCurrent;
    }

    /**
     * Maximum voltage supported by the electric vehicle.
     * Relates to: +
     * *ISO 15118-2*: DC_EVChargeParameterType: EVMaximumVoltageLimit
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
     * *ISO 15118-2*: DC_EVChargeParameterType: EVMaximumVoltageLimit
     * <p>
     * <p>
     * (Required)
     */
    public void setEvMaxVoltage(Float evMaxVoltage) {
        this.evMaxVoltage = evMaxVoltage;
    }

    /**
     * Maximum power (in W) supported by the electric vehicle. Required for DC charging.
     * Relates to: +
     * *ISO 15118-2*: DC_EVChargeParameterType: EVMaximumPowerLimit
     */
    public Float getEvMaxPower() {
        return evMaxPower;
    }

    /**
     * Maximum power (in W) supported by the electric vehicle. Required for DC charging.
     * Relates to: +
     * *ISO 15118-2*: DC_EVChargeParameterType: EVMaximumPowerLimit
     */
    public void setEvMaxPower(Float evMaxPower) {
        this.evMaxPower = evMaxPower;
    }

    /**
     * Capacity of the electric vehicle battery (in Wh).
     * Relates to: +
     * *ISO 15118-2*: DC_EVChargeParameterType: EVEnergyCapacity
     */
    public Float getEvEnergyCapacity() {
        return evEnergyCapacity;
    }

    /**
     * Capacity of the electric vehicle battery (in Wh).
     * Relates to: +
     * *ISO 15118-2*: DC_EVChargeParameterType: EVEnergyCapacity
     */
    public void setEvEnergyCapacity(Float evEnergyCapacity) {
        this.evEnergyCapacity = evEnergyCapacity;
    }

    /**
     * Amount of energy requested (in Wh). This inludes energy required for preconditioning.
     * Relates to: +
     * *ISO 15118-2*: DC_EVChargeParameterType: EVEnergyRequest
     */
    public Float getEnergyAmount() {
        return energyAmount;
    }

    /**
     * Amount of energy requested (in Wh). This inludes energy required for preconditioning.
     * Relates to: +
     * *ISO 15118-2*: DC_EVChargeParameterType: EVEnergyRequest
     */
    public void setEnergyAmount(Float energyAmount) {
        this.energyAmount = energyAmount;
    }

    /**
     * Energy available in the battery (in percent of the battery capacity)
     * Relates to: +
     * *ISO 15118-2*: DC_EVChargeParameterType: DC_EVStatus: EVRESSSOC
     */
    public Integer getStateOfCharge() {
        return stateOfCharge;
    }

    /**
     * Energy available in the battery (in percent of the battery capacity)
     * Relates to: +
     * *ISO 15118-2*: DC_EVChargeParameterType: DC_EVStatus: EVRESSSOC
     */
    public void setStateOfCharge(Integer stateOfCharge) {
        this.stateOfCharge = stateOfCharge;
    }

    /**
     * Percentage of SoC at which the EV considers the battery fully charged. (possible values: 0 - 100)
     * Relates to: +
     * *ISO 15118-2*: DC_EVChargeParameterType: FullSOC
     */
    public Integer getFullSoC() {
        return fullSoC;
    }

    /**
     * Percentage of SoC at which the EV considers the battery fully charged. (possible values: 0 - 100)
     * Relates to: +
     * *ISO 15118-2*: DC_EVChargeParameterType: FullSOC
     */
    public void setFullSoC(Integer fullSoC) {
        this.fullSoC = fullSoC;
    }

    /**
     * Percentage of SoC at which the EV considers a fast charging process to end. (possible values: 0 - 100)
     * Relates to: +
     * *ISO 15118-2*: DC_EVChargeParameterType: BulkSOC
     */
    public Integer getBulkSoC() {
        return bulkSoC;
    }

    /**
     * Percentage of SoC at which the EV considers a fast charging process to end. (possible values: 0 - 100)
     * Relates to: +
     * *ISO 15118-2*: DC_EVChargeParameterType: BulkSOC
     */
    public void setBulkSoC(Integer bulkSoC) {
        this.bulkSoC = bulkSoC;
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
        json.addProperty("evMaxCurrent", evMaxCurrent);
        json.addProperty("evMaxVoltage", evMaxVoltage);
        json.addProperty("evMaxPower", evMaxPower);
        json.addProperty("evEnergyCapacity", evEnergyCapacity);
        json.addProperty("energyAmount", energyAmount);
        json.addProperty("stateOfCharge", stateOfCharge);
        json.addProperty("fullSoC", fullSoC);
        json.addProperty("bulkSoC", bulkSoC);
        json.add("customData", customData.toJsonObject());
        return json;
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
        if (!(obj instanceof DCChargingParameters))
            return false;
        DCChargingParameters that = (DCChargingParameters) obj;
        return Objects.equals(this.evMaxCurrent, that.evMaxCurrent)
                && Objects.equals(this.stateOfCharge, that.stateOfCharge)
                && Objects.equals(this.evEnergyCapacity, that.evEnergyCapacity)
                && Objects.equals(this.evMaxVoltage, that.evMaxVoltage)
                && Objects.equals(this.energyAmount, that.energyAmount)
                && Objects.equals(this.bulkSoC, that.bulkSoC)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.evMaxPower, that.evMaxPower)
                && Objects.equals(this.fullSoC, that.fullSoC);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.evMaxCurrent != null ? this.evMaxCurrent.hashCode() : 0);
        result = 31 * result + (this.stateOfCharge != null ? this.stateOfCharge.hashCode() : 0);
        result = 31 * result + (this.evEnergyCapacity != null ? this.evEnergyCapacity.hashCode() : 0);
        result = 31 * result + (this.evMaxVoltage != null ? this.evMaxVoltage.hashCode() : 0);
        result = 31 * result + (this.energyAmount != null ? this.energyAmount.hashCode() : 0);
        result = 31 * result + (this.bulkSoC != null ? this.bulkSoC.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.evMaxPower != null ? this.evMaxPower.hashCode() : 0);
        result = 31 * result + (this.fullSoC != null ? this.fullSoC.hashCode() : 0);
        return result;
    }
}
