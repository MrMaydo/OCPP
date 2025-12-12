package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * EV AC charging parameters for ISO 15118-2
 */
public class ACChargingParameters implements JsonInterface {

    /**
     * Amount of energy requested (in Wh).
     * This includes energy required for preconditioning.
     * <p> Relates to: </p>
     * <p> ISO 15118-2: AC_EVChargeParameterType: EAmount </p>
     * <p> ISO 15118-20: Dynamic/Scheduled_SEReqControlModeType: EVTargetEnergyRequest </p>
     */
    @Required
    private Float energyAmount;

    /**
     * Minimum current (amps) supported by the electric vehicle (per phase).
     * <p> Relates to: </p>
     * <p> ISO 15118-2: AC_EVChargeParameterType: EVMinCurrent </p>
     */
    @Required
    private Float evMinCurrent;

    /**
     * Maximum current (amps) supported by the electric vehicle (per phase). Includes cable capacity.
     * <p> Relates to: </p>
     * <p> ISO 15118-2: AC_EVChargeParameterType:  EVMaxCurrent </p>
     */
    @Required
    private Float evMaxCurrent;

    /**
     * Maximum voltage supported by the electric vehicle.
     * <p> Relates to: </p>
     * <p> ISO 15118-2: AC_EVChargeParameterType: EVMaxVoltage </p>
     */
    @Required
    private Float evMaxVoltage;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public ACChargingParameters() {
    }


    public Float getEnergyAmount() {
        return energyAmount;
    }


    public void setEnergyAmount(Float energyAmount) {
        this.energyAmount = energyAmount;
    }


    public Float getEvMinCurrent() {
        return evMinCurrent;
    }


    public void setEvMinCurrent(Float evMinCurrent) {
        this.evMinCurrent = evMinCurrent;
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
        json.addProperty("energyAmount", energyAmount);
        json.addProperty("evMinCurrent", evMinCurrent);
        json.addProperty("evMaxCurrent", evMaxCurrent);
        json.addProperty("evMaxVoltage", evMaxVoltage);
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
