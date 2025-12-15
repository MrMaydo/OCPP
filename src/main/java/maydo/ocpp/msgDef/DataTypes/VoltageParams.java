package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.Enumerations.PowerDuringCessationEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;

import java.util.Objects;

/**
 *
 */
public class VoltageParams implements JsonInterface {

    /**
     * EN 50549-1 chapter 4.9.3.4 Voltage threshold for the 10 min time window mean value monitoring.
     * The 10 min mean is recalculated up to every 3 s.
     * If the present voltage is above this threshold for more than the time defined by hv10MinMeanValue, the EV must trip.
     * This value is mandatory if hv10MinMeanTripDelay is set.
     */
    @Optional
    private Float hv10MinMeanValue;

    /**
     * Time for which the voltage is allowed to stay above the 10 min mean value. After this time, the EV must trip.
     * This value is mandatory if OverVoltageMeanValue10min is set.
     */
    @Optional
    private Float hv10MinMeanTripDelay;

    /**
     * Parameter is only sent, if the EV has to feed-in power or reactive power during fault-ride through (FRT)
     * as defined by HVMomCess curve and LVMomCess curve.
     */
    @Optional
    private PowerDuringCessationEnum powerDuringCessation;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public VoltageParams() {
    }


    public Float getHv10MinMeanValue() {
        return hv10MinMeanValue;
    }


    public void setHv10MinMeanValue(Float hv10MinMeanValue) {
        this.hv10MinMeanValue = hv10MinMeanValue;
    }


    public Float getHv10MinMeanTripDelay() {
        return hv10MinMeanTripDelay;
    }


    public void setHv10MinMeanTripDelay(Float hv10MinMeanTripDelay) {
        this.hv10MinMeanTripDelay = hv10MinMeanTripDelay;
    }


    public PowerDuringCessationEnum getPowerDuringCessation() {
        return powerDuringCessation;
    }


    public void setPowerDuringCessation(PowerDuringCessationEnum powerDuringCessation) {
        this.powerDuringCessation = powerDuringCessation;
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

        if (getHv10MinMeanValue() != null) {
            json.addProperty("hv10MinMeanValue", getHv10MinMeanValue());
        }
        if (getHv10MinMeanTripDelay() != null) {
            json.addProperty("hv10MinMeanTripDelay", getHv10MinMeanTripDelay());
        }
        if (getPowerDuringCessation() != null) {
            json.addProperty("powerDuringCessation", getPowerDuringCessation().toString());
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
        if (jsonObject.has("hv10MinMeanValue")) {
            setHv10MinMeanValue(jsonObject.get("hv10MinMeanValue").getAsFloat());
        }

        if (jsonObject.has("hv10MinMeanTripDelay")) {
            setHv10MinMeanTripDelay(jsonObject.get("hv10MinMeanTripDelay").getAsFloat());
        }

        if (jsonObject.has("powerDuringCessation")) {
            setPowerDuringCessation(PowerDuringCessationEnum.valueOf(jsonObject.get("powerDuringCessation").getAsString()));
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
        if (!(obj instanceof VoltageParams))
            return false;
        VoltageParams that = (VoltageParams) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.hv10MinMeanValue, that.hv10MinMeanValue)
                && Objects.equals(this.powerDuringCessation, that.powerDuringCessation)
                && Objects.equals(this.hv10MinMeanTripDelay, that.hv10MinMeanTripDelay);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.hv10MinMeanValue != null ? this.hv10MinMeanValue.hashCode() : 0);
        result = 31 * result + (this.powerDuringCessation != null ? this.powerDuringCessation.hashCode() : 0);
        result = 31 * result + (this.hv10MinMeanTripDelay != null ? this.hv10MinMeanTripDelay.hashCode() : 0);
        return result;
    }
}
