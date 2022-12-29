package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.Objects;


/**
 * AC_ Charging_ Parameters
 * urn:x-oca:ocpp:uid:2:233250
 * EV AC charging parameters.
 */
public class ACChargingParameters implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
    /**
     * AC_ Charging_ Parameters. Energy_ Amount. Energy_ Amount
     * urn:x-oca:ocpp:uid:1:569211
     * Amount of energy requested (in Wh). This includes energy required for preconditioning.
     * <p>
     * (Required)
     */
    @Required
    private Integer energyAmount;
    /**
     * AC_ Charging_ Parameters. EV_ Min. Current
     * urn:x-oca:ocpp:uid:1:569212
     * Minimum current (amps) supported by the electric vehicle (per phase).
     * <p>
     * (Required)
     */
    @Required
    private Integer evMinCurrent;
    /**
     * AC_ Charging_ Parameters. EV_ Max. Current
     * urn:x-oca:ocpp:uid:1:569213
     * Maximum current (amps) supported by the electric vehicle (per phase). Includes cable capacity.
     * <p>
     * (Required)
     */
    @Required
    private Integer evMaxCurrent;
    /**
     * AC_ Charging_ Parameters. EV_ Max. Voltage
     * urn:x-oca:ocpp:uid:1:569214
     * Maximum voltage supported by the electric vehicle
     * <p>
     * (Required)
     */
    @Required
    private Integer evMaxVoltage;

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
     * AC_ Charging_ Parameters. Energy_ Amount. Energy_ Amount
     * urn:x-oca:ocpp:uid:1:569211
     * Amount of energy requested (in Wh). This includes energy required for preconditioning.
     * <p>
     * (Required)
     */
    public Integer getEnergyAmount() {
        return energyAmount;
    }

    /**
     * AC_ Charging_ Parameters. Energy_ Amount. Energy_ Amount
     * urn:x-oca:ocpp:uid:1:569211
     * Amount of energy requested (in Wh). This includes energy required for preconditioning.
     * <p>
     * (Required)
     */
    public void setEnergyAmount(Integer energyAmount) {
        this.energyAmount = energyAmount;
    }

    /**
     * AC_ Charging_ Parameters. EV_ Min. Current
     * urn:x-oca:ocpp:uid:1:569212
     * Minimum current (amps) supported by the electric vehicle (per phase).
     * <p>
     * (Required)
     */
    public Integer getEvMinCurrent() {
        return evMinCurrent;
    }

    /**
     * AC_ Charging_ Parameters. EV_ Min. Current
     * urn:x-oca:ocpp:uid:1:569212
     * Minimum current (amps) supported by the electric vehicle (per phase).
     * <p>
     * (Required)
     */
    public void setEvMinCurrent(Integer evMinCurrent) {
        this.evMinCurrent = evMinCurrent;
    }

    /**
     * AC_ Charging_ Parameters. EV_ Max. Current
     * urn:x-oca:ocpp:uid:1:569213
     * Maximum current (amps) supported by the electric vehicle (per phase). Includes cable capacity.
     * <p>
     * (Required)
     */
    public Integer getEvMaxCurrent() {
        return evMaxCurrent;
    }

    /**
     * AC_ Charging_ Parameters. EV_ Max. Current
     * urn:x-oca:ocpp:uid:1:569213
     * Maximum current (amps) supported by the electric vehicle (per phase). Includes cable capacity.
     * <p>
     * (Required)
     */
    public void setEvMaxCurrent(Integer evMaxCurrent) {
        this.evMaxCurrent = evMaxCurrent;
    }

    /**
     * AC_ Charging_ Parameters. EV_ Max. Voltage
     * urn:x-oca:ocpp:uid:1:569214
     * Maximum voltage supported by the electric vehicle
     * <p>
     * (Required)
     */
    public Integer getEvMaxVoltage() {
        return evMaxVoltage;
    }

    /**
     * AC_ Charging_ Parameters. EV_ Max. Voltage
     * urn:x-oca:ocpp:uid:1:569214
     * Maximum voltage supported by the electric vehicle
     * <p>
     * (Required)
     */
    public void setEvMaxVoltage(Integer evMaxVoltage) {
        this.evMaxVoltage = evMaxVoltage;
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
        if (!(obj instanceof ACChargingParameters))
            return false;
        ACChargingParameters that = (ACChargingParameters) obj;
        return Objects.equals(customData, that.customData)
                && Objects.equals(energyAmount, that.energyAmount)
                && Objects.equals(evMinCurrent, that.evMinCurrent)
                && Objects.equals(evMaxCurrent, that.evMaxCurrent)
                && Objects.equals(evMaxVoltage, that.evMaxVoltage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customData, energyAmount, evMinCurrent, evMaxCurrent, evMaxVoltage);
    }
}
