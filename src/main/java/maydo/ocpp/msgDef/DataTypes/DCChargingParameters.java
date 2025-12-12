package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
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
     * <p> Relates to: </p>
     * <p> ISO 15118-2: DC_EVChargeParameterType:EVMaximumCurrentLimit </p>
     */
    @Required
    private Float evMaxCurrent;

    /**
     * Maximum voltage supported by the electric vehicle.
     * <p> Relates to: </p>
     * <p> ISO 15118-2: DC_EVChargeParameterType: EVMaximumVoltageLimit </p>
     */
    @Required
    private Float evMaxVoltage;

    /**
     * Maximum power (in W) supported by the electric vehicle. Required for DC charging.
     * <p> Relates to: </p>
     * <p> ISO 15118-2: DC_EVChargeParameterType: EVMaximumPowerLimit </p>
     */
    @Optional
    private Float evMaxPower;

    /**
     * Capacity of the electric vehicle battery (in Wh).
     * <p> Relates to: </p>
     * <p> ISO 15118-2: DC_EVChargeParameterType: EVEnergyCapacity </p>
     */
    @Optional
    private Float evEnergyCapacity;

    /**
     * Amount of energy requested (in Wh). This inludes energy required for preconditioning.
     * <p> Relates to: </p>
     * <p> ISO 15118-2: DC_EVChargeParameterType: EVEnergyRequest </p>
     */
    @Optional
    private Float energyAmount;

    /**
     * Energy available in the battery (in percent of the battery capacity)
     * <p> Relates to: </p>
     * <p> ISO 15118-2: DC_EVChargeParameterType: DC_EVStatus: EVRESSSOC </p>
     */
    @Optional
    private Integer stateOfCharge;

    /**
     * Percentage of SoC at which the EV considers the battery fully charged. (possible values: 0 - 100)
     * <p> Relates to: </p>
     * <p> ISO 15118-2: DC_EVChargeParameterType: FullSOC
     */
    @Optional
    private Integer fullSoC;

    /**
     * Percentage of SoC at which the EV considers a fast charging process to end. (possible values: 0 - 100)
     * <p> Relates to: </p>
     * <p> ISO 15118-2: DC_EVChargeParameterType: BulkSOC </p>
     */
    @Optional
    private Integer bulkSoC;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public DCChargingParameters() {
    }


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


    public Float getEvMaxCurrent() {
        return evMaxCurrent;
    }


    public void setEvMaxCurrent(Float evMaxCurrent) {
        this.evMaxCurrent = evMaxCurrent;
    }


    public Float getEvMaxVoltage() {
        return evMaxVoltage;
    }


    public void setEvMaxVoltage(Float evMaxVoltage) {
        this.evMaxVoltage = evMaxVoltage;
    }


    public Float getEvMaxPower() {
        return evMaxPower;
    }


    public void setEvMaxPower(Float evMaxPower) {
        this.evMaxPower = evMaxPower;
    }


    public Float getEvEnergyCapacity() {
        return evEnergyCapacity;
    }


    public void setEvEnergyCapacity(Float evEnergyCapacity) {
        this.evEnergyCapacity = evEnergyCapacity;
    }


    public Float getEnergyAmount() {
        return energyAmount;
    }


    public void setEnergyAmount(Float energyAmount) {
        this.energyAmount = energyAmount;
    }


    public Integer getStateOfCharge() {
        return stateOfCharge;
    }


    public void setStateOfCharge(Integer stateOfCharge) {
        this.stateOfCharge = stateOfCharge;
    }


    public Integer getFullSoC() {
        return fullSoC;
    }


    public void setFullSoC(Integer fullSoC) {
        this.fullSoC = fullSoC;
    }


    public Integer getBulkSoC() {
        return bulkSoC;
    }


    public void setBulkSoC(Integer bulkSoC) {
        this.bulkSoC = bulkSoC;
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
        JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
        fromJsonObject(jsonObject);
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        if (jsonObject.has("evMaxCurrent")) {
            this.evMaxCurrent = jsonObject.get("evMaxCurrent").getAsFloat();
        }

        if (jsonObject.has("evMaxVoltage")) {
            this.evMaxVoltage = jsonObject.get("evMaxVoltage").getAsFloat();
        }

        if (jsonObject.has("evMaxPower")) {
            this.evMaxPower = jsonObject.get("evMaxPower").getAsFloat();
        }

        if (jsonObject.has("evEnergyCapacity")) {
            this.evEnergyCapacity = jsonObject.get("evEnergyCapacity").getAsFloat();
        }

        if (jsonObject.has("energyAmount")) {
            this.energyAmount = jsonObject.get("energyAmount").getAsFloat();
        }

        if (jsonObject.has("stateOfCharge")) {
            this.stateOfCharge = jsonObject.get("stateOfCharge").getAsInt();
        }

        if (jsonObject.has("fullSoC")) {
            this.fullSoC = jsonObject.get("fullSoC").getAsInt();
        }

        if (jsonObject.has("bulkSoC")) {
            this.bulkSoC = jsonObject.get("bulkSoC").getAsInt();
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
