package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;

import java.util.Objects;

/**
 *
 */
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
     *
     */
    @Optional
    private CustomData customData;


    public ReactivePowerParams() {
    }


    public Float getVRef() {
        return vRef;
    }


    public void setVRef(Float vRef) {
        this.vRef = vRef;
    }


    public Boolean getAutonomousVRefEnable() {
        return autonomousVRefEnable;
    }


    public void setAutonomousVRefEnable(Boolean autonomousVRefEnable) {
        this.autonomousVRefEnable = autonomousVRefEnable;
    }


    public Float getAutonomousVRefTimeConstant() {
        return autonomousVRefTimeConstant;
    }


    public void setAutonomousVRefTimeConstant(Float autonomousVRefTimeConstant) {
        this.autonomousVRefTimeConstant = autonomousVRefTimeConstant;
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

        if (getVRef() != null) {
            json.addProperty("vRef", getVRef());
        }
        if (getAutonomousVRefEnable() != null) {
            json.addProperty("autonomousVRefEnable", getAutonomousVRefEnable());
        }
        if (getAutonomousVRefTimeConstant() != null) {
            json.addProperty("autonomousVRefTimeConstant", getAutonomousVRefTimeConstant());
        }
        if (getCustomData() != null) {
            json.add("customData", getCustomData().toJsonObject());
        }

        return json;
    }

    @Override
    public void fromString(String jsonString) {
        JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
        fromJsonObject(jsonObject);
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        if (jsonObject.has("vRef")) {
            setVRef(jsonObject.get("vRef").getAsFloat());
        }

        if (jsonObject.has("autonomousVRefEnable")) {
            setAutonomousVRefEnable(jsonObject.get("autonomousVRefEnable").getAsBoolean());
        }

        if (jsonObject.has("autonomousVRefTimeConstant")) {
            setAutonomousVRefTimeConstant(jsonObject.get("autonomousVRefTimeConstant").getAsFloat());
        }

        if (jsonObject.has("customData")) {
            setCustomData(new CustomData());
            getCustomData().fromJsonObject(jsonObject.getAsJsonObject("customData"));
        }
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
