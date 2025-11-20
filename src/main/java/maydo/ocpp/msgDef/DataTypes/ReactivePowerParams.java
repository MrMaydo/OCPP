package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;

import java.util.Objects;

public class ReactivePowerParams implements JsonInterface {

    /**
     * Only for VoltVar curve: The nominal ac voltage (rms) adjustment to the voltage curve points for Volt-Var curves (percentage).
     */
    @Optional
    private Float vRef;
    /**
     * Only for VoltVar: Enable/disable autonomous VRef adjustment
     */
    @Optional
    private Boolean autonomousVRefEnable;
    /**
     * Only for VoltVar: Adjustment range for VRef time constant
     */
    @Optional
    private Float autonomousVRefTimeConstant;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public ReactivePowerParams() {
    }

    /**
     * @param autonomousVRefEnable       Only for VoltVar: Enable/disable autonomous VRef adjustment
     *                                   <p>
     *                                   <p>
     *                                   .
     * @param autonomousVRefTimeConstant Only for VoltVar: Adjustment range for VRef time constant
     *                                   <p>
     *                                   <p>
     *                                   .
     * @param vRef                       Only for VoltVar curve: The nominal ac voltage (rms) adjustment to the voltage curve points for Volt-Var curves (percentage).
     *                                   <p>
     *                                   <p>
     *                                   .
     */
    public ReactivePowerParams(Float vRef, Boolean autonomousVRefEnable, Float autonomousVRefTimeConstant, CustomData customData) {
        super();
        this.vRef = vRef;
        this.autonomousVRefEnable = autonomousVRefEnable;
        this.autonomousVRefTimeConstant = autonomousVRefTimeConstant;
        this.customData = customData;
    }

    /**
     * Only for VoltVar curve: The nominal ac voltage (rms) adjustment to the voltage curve points for Volt-Var curves (percentage).
     */
    public Float getvRef() {
        return vRef;
    }

    /**
     * Only for VoltVar curve: The nominal ac voltage (rms) adjustment to the voltage curve points for Volt-Var curves (percentage).
     */
    public void setvRef(Float vRef) {
        this.vRef = vRef;
    }

    /**
     * Only for VoltVar: Enable/disable autonomous VRef adjustment
     */
    public Boolean getAutonomousVRefEnable() {
        return autonomousVRefEnable;
    }

    /**
     * Only for VoltVar: Enable/disable autonomous VRef adjustment
     */
    public void setAutonomousVRefEnable(Boolean autonomousVRefEnable) {
        this.autonomousVRefEnable = autonomousVRefEnable;
    }

    /**
     * Only for VoltVar: Adjustment range for VRef time constant
     */
    public Float getAutonomousVRefTimeConstant() {
        return autonomousVRefTimeConstant;
    }

    /**
     * Only for VoltVar: Adjustment range for VRef time constant
     */
    public void setAutonomousVRefTimeConstant(Float autonomousVRefTimeConstant) {
        this.autonomousVRefTimeConstant = autonomousVRefTimeConstant;
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
        json.addProperty("vRef", vRef);
        json.addProperty("autonomousVRefEnable", autonomousVRefEnable);
        json.addProperty("autonomousVRefTimeConstant", autonomousVRefTimeConstant);
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
        if (!(obj instanceof ReactivePowerParams))
            return false;
        ReactivePowerParams that = (ReactivePowerParams) obj;
        return Objects.equals(this.autonomousVRefEnable, that.autonomousVRefEnable)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.vRef, that.vRef)
                && Objects.equals(this.autonomousVRefTimeConstant, that.autonomousVRefTimeConstant);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.autonomousVRefEnable != null ? this.autonomousVRefEnable.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.vRef != null ? this.vRef.hashCode() : 0);
        result = 31 * result + (this.autonomousVRefTimeConstant != null ? this.autonomousVRefTimeConstant.hashCode() : 0);
        return result;
    }
}
