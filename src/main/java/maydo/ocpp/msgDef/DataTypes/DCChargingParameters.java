package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.Objects;


/**
 * DC_ Charging_ Parameters
 * urn:x-oca:ocpp:uid:2:233251
 * EV DC charging parameters
 */
public class DCChargingParameters implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
    /**
     * DC_ Charging_ Parameters. EV_ Max. Current
     * urn:x-oca:ocpp:uid:1:569215
     * Maximum current (amps) supported by the electric vehicle. Includes cable capacity.
     * <p>
     * (Required)
     */
    @Required
    private Integer evMaxCurrent;
    /**
     * DC_ Charging_ Parameters. EV_ Max. Voltage
     * urn:x-oca:ocpp:uid:1:569216
     * Maximum voltage supported by the electric vehicle
     * <p>
     * (Required)
     */
    @Required
    private Integer evMaxVoltage;
    /**
     * DC_ Charging_ Parameters. Energy_ Amount. Energy_ Amount
     * urn:x-oca:ocpp:uid:1:569217
     * Amount of energy requested (in Wh). This inludes energy required for preconditioning.
     */
    @Optional
    private Integer energyAmount;
    /**
     * DC_ Charging_ Parameters. EV_ Max. Power
     * urn:x-oca:ocpp:uid:1:569218
     * Maximum power (in W) supported by the electric vehicle. Required for DC charging.
     */
    @Optional
    private Integer evMaxPower;
    /**
     * DC_ Charging_ Parameters. State_ Of_ Charge. Numeric
     * urn:x-oca:ocpp:uid:1:569219
     * Energy available in the battery (in percent of the battery capacity)
     */
    @Optional
    private Integer stateOfCharge;
    /**
     * DC_ Charging_ Parameters. EV_ Energy_ Capacity. Numeric
     * urn:x-oca:ocpp:uid:1:569220
     * Capacity of the electric vehicle battery (in Wh)
     */
    @Optional
    private Integer evEnergyCapacity;
    /**
     * DC_ Charging_ Parameters. Full_ SOC. Percentage
     * urn:x-oca:ocpp:uid:1:569221
     * Percentage of SoC at which the EV considers the battery fully charged. (possible values: 0 - 100)
     */
    @Optional
    private Integer fullSoC;
    /**
     * DC_ Charging_ Parameters. Bulk_ SOC. Percentage
     * urn:x-oca:ocpp:uid:1:569222
     * Percentage of SoC at which the EV considers a fast charging process to end. (possible values: 0 - 100)
     */
    @Optional
    private Integer bulkSoC;

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

    /**
     * DC_ Charging_ Parameters. EV_ Max. Current
     * urn:x-oca:ocpp:uid:1:569215
     * Maximum current (amps) supported by the electric vehicle. Includes cable capacity.
     * <p>
     * (Required)
     */
    public Integer getEvMaxCurrent() {
        return evMaxCurrent;
    }

    /**
     * DC_ Charging_ Parameters. EV_ Max. Current
     * urn:x-oca:ocpp:uid:1:569215
     * Maximum current (amps) supported by the electric vehicle. Includes cable capacity.
     * <p>
     * (Required)
     */
    public void setEvMaxCurrent(Integer evMaxCurrent) {
        this.evMaxCurrent = evMaxCurrent;
    }

    /**
     * DC_ Charging_ Parameters. EV_ Max. Voltage
     * urn:x-oca:ocpp:uid:1:569216
     * Maximum voltage supported by the electric vehicle
     * <p>
     * (Required)
     */
    public Integer getEvMaxVoltage() {
        return evMaxVoltage;
    }

    /**
     * DC_ Charging_ Parameters. EV_ Max. Voltage
     * urn:x-oca:ocpp:uid:1:569216
     * Maximum voltage supported by the electric vehicle
     * <p>
     * (Required)
     */
    public void setEvMaxVoltage(Integer evMaxVoltage) {
        this.evMaxVoltage = evMaxVoltage;
    }

    /**
     * DC_ Charging_ Parameters. Energy_ Amount. Energy_ Amount
     * urn:x-oca:ocpp:uid:1:569217
     * Amount of energy requested (in Wh). This inludes energy required for preconditioning.
     */
    public Integer getEnergyAmount() {
        return energyAmount;
    }

    /**
     * DC_ Charging_ Parameters. Energy_ Amount. Energy_ Amount
     * urn:x-oca:ocpp:uid:1:569217
     * Amount of energy requested (in Wh). This inludes energy required for preconditioning.
     */
    public void setEnergyAmount(Integer energyAmount) {
        this.energyAmount = energyAmount;
    }

    /**
     * DC_ Charging_ Parameters. EV_ Max. Power
     * urn:x-oca:ocpp:uid:1:569218
     * Maximum power (in W) supported by the electric vehicle. Required for DC charging.
     */
    public Integer getEvMaxPower() {
        return evMaxPower;
    }

    /**
     * DC_ Charging_ Parameters. EV_ Max. Power
     * urn:x-oca:ocpp:uid:1:569218
     * Maximum power (in W) supported by the electric vehicle. Required for DC charging.
     */
    public void setEvMaxPower(Integer evMaxPower) {
        this.evMaxPower = evMaxPower;
    }

    /**
     * DC_ Charging_ Parameters. State_ Of_ Charge. Numeric
     * urn:x-oca:ocpp:uid:1:569219
     * Energy available in the battery (in percent of the battery capacity)
     */
    public Integer getStateOfCharge() {
        return stateOfCharge;
    }

    /**
     * DC_ Charging_ Parameters. State_ Of_ Charge. Numeric
     * urn:x-oca:ocpp:uid:1:569219
     * Energy available in the battery (in percent of the battery capacity)
     */
    public void setStateOfCharge(Integer stateOfCharge) {
        this.stateOfCharge = stateOfCharge;
    }

    /**
     * DC_ Charging_ Parameters. EV_ Energy_ Capacity. Numeric
     * urn:x-oca:ocpp:uid:1:569220
     * Capacity of the electric vehicle battery (in Wh)
     */
    public Integer getEvEnergyCapacity() {
        return evEnergyCapacity;
    }

    /**
     * DC_ Charging_ Parameters. EV_ Energy_ Capacity. Numeric
     * urn:x-oca:ocpp:uid:1:569220
     * Capacity of the electric vehicle battery (in Wh)
     */
    public void setEvEnergyCapacity(Integer evEnergyCapacity) {
        this.evEnergyCapacity = evEnergyCapacity;
    }

    /**
     * DC_ Charging_ Parameters. Full_ SOC. Percentage
     * urn:x-oca:ocpp:uid:1:569221
     * Percentage of SoC at which the EV considers the battery fully charged. (possible values: 0 - 100)
     */
    public Integer getFullSoC() {
        return fullSoC;
    }

    /**
     * DC_ Charging_ Parameters. Full_ SOC. Percentage
     * urn:x-oca:ocpp:uid:1:569221
     * Percentage of SoC at which the EV considers the battery fully charged. (possible values: 0 - 100)
     */
    public void setFullSoC(Integer fullSoC) {
        this.fullSoC = fullSoC;
    }

    /**
     * DC_ Charging_ Parameters. Bulk_ SOC. Percentage
     * urn:x-oca:ocpp:uid:1:569222
     * Percentage of SoC at which the EV considers a fast charging process to end. (possible values: 0 - 100)
     */
    public Integer getBulkSoC() {
        return bulkSoC;
    }

    /**
     * DC_ Charging_ Parameters. Bulk_ SOC. Percentage
     * urn:x-oca:ocpp:uid:1:569222
     * Percentage of SoC at which the EV considers a fast charging process to end. (possible values: 0 - 100)
     */
    public void setBulkSoC(Integer bulkSoC) {
        this.bulkSoC = bulkSoC;
    }

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject() {
        return JsonTools.toJsonObject(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof DCChargingParameters))
            return false;
        DCChargingParameters that = (DCChargingParameters) obj;
        return Objects.equals(customData, that.customData)
                && Objects.equals(evMaxCurrent, that.evMaxCurrent)
                && Objects.equals(evMaxVoltage, that.evMaxVoltage)
                && Objects.equals(energyAmount, that.energyAmount)
                && Objects.equals(evMaxPower, that.evMaxPower)
                && Objects.equals(stateOfCharge, that.stateOfCharge)
                && Objects.equals(evEnergyCapacity, that.evEnergyCapacity)
                && Objects.equals(fullSoC, that.fullSoC)
                && Objects.equals(bulkSoC, that.bulkSoC);
    }

    @Override
    public int hashCode() {
        int result = (evMaxCurrent != null ? evMaxCurrent.hashCode() : 0);
        result = 31 * result + (evMaxVoltage != null ? evMaxVoltage.hashCode() : 0);
        result = 31 * result + (energyAmount != null ? energyAmount.hashCode() : 0);
        result = 31 * result + (evMaxPower != null ? evMaxPower.hashCode() : 0);
        result = 31 * result + (stateOfCharge != null ? stateOfCharge.hashCode() : 0);
        result = 31 * result + (evEnergyCapacity != null ? evEnergyCapacity.hashCode() : 0);
        result = 31 * result + (fullSoC != null ? fullSoC.hashCode() : 0);
        result = 31 * result + (bulkSoC != null ? bulkSoC.hashCode() : 0);
        result = 31 * result + (customData != null ? customData.hashCode() : 0);
        return result;
    }
}
