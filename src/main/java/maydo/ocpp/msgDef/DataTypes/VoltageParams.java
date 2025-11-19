package maydo.ocpp.msgDef.DataTypes;

import maydo.ocpp.msgDef.Enumerations.PowerDuringCessationEnum;
import maydo.ocpp.msgDef.annotations.Optional;

import java.util.Objects;

public class VoltageParams {

    /**
     * EN 50549-1 chapter 4.9.3.4
     *     Voltage threshold for the 10 min time window mean value monitoring.
     *     The 10 min mean is recalculated up to every 3 s. 
     *     If the present voltage is above this threshold for more than the time defined by _hv10MinMeanValue_, the EV must trip.
     *     This value is mandatory if _hv10MinMeanTripDelay_ is set.
     * 
     * 
     */
    @Optional
    private Float hv10MinMeanValue;
    /**
     * Time for which the voltage is allowed to stay above the 10 min mean value. 
     *     After this time, the EV must trip.
     *     This value is mandatory if OverVoltageMeanValue10min is set.
     * 
     * 
     */
    @Optional
    private Float hv10MinMeanTripDelay;
    /**
     * Parameter is only sent, if the EV has to feed-in power or reactive power during fault-ride through (FRT) as defined by HVMomCess curve and LVMomCess curve.
     * 
     * 
     */
    @Optional
    private PowerDuringCessationEnum powerDuringCessation;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public VoltageParams() {
    }

    /**
     * 
     * @param hv10MinMeanTripDelay
     *     Time for which the voltage is allowed to stay above the 10 min mean value. 
     *         After this time, the EV must trip.
     *         This value is mandatory if OverVoltageMeanValue10min is set.
     *     
     *     
     *     .
     * @param hv10MinMeanValue
     *     EN 50549-1 chapter 4.9.3.4
     *         Voltage threshold for the 10 min time window mean value monitoring.
     *         The 10 min mean is recalculated up to every 3 s. 
     *         If the present voltage is above this threshold for more than the time defined by _hv10MinMeanValue_, the EV must trip.
     *         This value is mandatory if _hv10MinMeanTripDelay_ is set.
     *     
     *     
     *     .
     */
    public VoltageParams(Float hv10MinMeanValue, Float hv10MinMeanTripDelay, PowerDuringCessationEnum powerDuringCessation, CustomData customData) {
        super();
        this.hv10MinMeanValue = hv10MinMeanValue;
        this.hv10MinMeanTripDelay = hv10MinMeanTripDelay;
        this.powerDuringCessation = powerDuringCessation;
        this.customData = customData;
    }

    /**
     * EN 50549-1 chapter 4.9.3.4
     *     Voltage threshold for the 10 min time window mean value monitoring.
     *     The 10 min mean is recalculated up to every 3 s. 
     *     If the present voltage is above this threshold for more than the time defined by _hv10MinMeanValue_, the EV must trip.
     *     This value is mandatory if _hv10MinMeanTripDelay_ is set.
     * 
     * 
     */
    public Float getHv10MinMeanValue() {
        return hv10MinMeanValue;
    }

    /**
     * EN 50549-1 chapter 4.9.3.4
     *     Voltage threshold for the 10 min time window mean value monitoring.
     *     The 10 min mean is recalculated up to every 3 s. 
     *     If the present voltage is above this threshold for more than the time defined by _hv10MinMeanValue_, the EV must trip.
     *     This value is mandatory if _hv10MinMeanTripDelay_ is set.
     * 
     * 
     */
    public void setHv10MinMeanValue(Float hv10MinMeanValue) {
        this.hv10MinMeanValue = hv10MinMeanValue;
    }

    /**
     * Time for which the voltage is allowed to stay above the 10 min mean value. 
     *     After this time, the EV must trip.
     *     This value is mandatory if OverVoltageMeanValue10min is set.
     * 
     * 
     */
    public Float getHv10MinMeanTripDelay() {
        return hv10MinMeanTripDelay;
    }

    /**
     * Time for which the voltage is allowed to stay above the 10 min mean value. 
     *     After this time, the EV must trip.
     *     This value is mandatory if OverVoltageMeanValue10min is set.
     * 
     * 
     */
    public void setHv10MinMeanTripDelay(Float hv10MinMeanTripDelay) {
        this.hv10MinMeanTripDelay = hv10MinMeanTripDelay;
    }

    /**
     * Parameter is only sent, if the EV has to feed-in power or reactive power during fault-ride through (FRT) as defined by HVMomCess curve and LVMomCess curve.
     * 
     * 
     */
    public PowerDuringCessationEnum getPowerDuringCessation() {
        return powerDuringCessation;
    }

    /**
     * Parameter is only sent, if the EV has to feed-in power or reactive power during fault-ride through (FRT) as defined by HVMomCess curve and LVMomCess curve.
     * 
     * 
     */
    public void setPowerDuringCessation(PowerDuringCessationEnum powerDuringCessation) {
        this.powerDuringCessation = powerDuringCessation;
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
