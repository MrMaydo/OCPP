
package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.utils.JsonTools;

import javax.annotation.Generated;


/**
 * Charging_ Schedule_ Period
 * urn:x-oca:ocpp:uid:2:233257
 * Charging schedule period structure defines a time period in a charging schedule.
 * 
 * 
 */
public class ChargingSchedulePeriod implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * Charging_ Schedule_ Period. Start_ Period. Elapsed_ Time
     * urn:x-oca:ocpp:uid:1:569240
     * Start of the period, in seconds from the start of schedule. The value of StartPeriod also defines the stop time of the previous period.
     * 
     * (Required)
     * 
     */
    private Integer startPeriod;
    /**
     * Charging_ Schedule_ Period. Limit. Measure
     * urn:x-oca:ocpp:uid:1:569241
     * Charging rate limit during the schedule period, in the applicable chargingRateUnit, for example in Amperes (A) or Watts (W). Accepts at most one digit fraction (e.g. 8.1).
     * 
     * (Required)
     * 
     */
    private Float limit;
    /**
     * Charging_ Schedule_ Period. Number_ Phases. Counter
     * urn:x-oca:ocpp:uid:1:569242
     * The number of phases that can be used for charging. If a number of phases is needed, numberPhases=3 will be assumed unless another number is given.
     * 
     * 
     */
    private Integer numberPhases;
    /**
     * Values: 1..3, Used if numberPhases=1 and if the EVSE is capable of switching the phase connected to the EV, i.e. ACPhaseSwitchingSupported is defined and true. It’s not allowed unless both conditions above are true. If both conditions are true, and phaseToUse is omitted, the Charging Station / EVSE will make the selection on its own.
     * 
     * 
     * 
     */
    private Integer phaseToUse;

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    public CustomData getCustomData() {
        return customData;
    }

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    public void setCustomData(CustomData customData) {
        this.customData = customData;
    }

    /**
     * Charging_ Schedule_ Period. Start_ Period. Elapsed_ Time
     * urn:x-oca:ocpp:uid:1:569240
     * Start of the period, in seconds from the start of schedule. The value of StartPeriod also defines the stop time of the previous period.
     * 
     * (Required)
     * 
     */
    public Integer getStartPeriod() {
        return startPeriod;
    }

    /**
     * Charging_ Schedule_ Period. Start_ Period. Elapsed_ Time
     * urn:x-oca:ocpp:uid:1:569240
     * Start of the period, in seconds from the start of schedule. The value of StartPeriod also defines the stop time of the previous period.
     * 
     * (Required)
     * 
     */
    public void setStartPeriod(Integer startPeriod) {
        this.startPeriod = startPeriod;
    }

    /**
     * Charging_ Schedule_ Period. Limit. Measure
     * urn:x-oca:ocpp:uid:1:569241
     * Charging rate limit during the schedule period, in the applicable chargingRateUnit, for example in Amperes (A) or Watts (W). Accepts at most one digit fraction (e.g. 8.1).
     * 
     * (Required)
     * 
     */
    public Float getLimit() {
        return limit;
    }

    /**
     * Charging_ Schedule_ Period. Limit. Measure
     * urn:x-oca:ocpp:uid:1:569241
     * Charging rate limit during the schedule period, in the applicable chargingRateUnit, for example in Amperes (A) or Watts (W). Accepts at most one digit fraction (e.g. 8.1).
     * 
     * (Required)
     * 
     */
    public void setLimit(Float limit) {
        this.limit = limit;
    }

    /**
     * Charging_ Schedule_ Period. Number_ Phases. Counter
     * urn:x-oca:ocpp:uid:1:569242
     * The number of phases that can be used for charging. If a number of phases is needed, numberPhases=3 will be assumed unless another number is given.
     * 
     * 
     */
    public Integer getNumberPhases() {
        return numberPhases;
    }

    /**
     * Charging_ Schedule_ Period. Number_ Phases. Counter
     * urn:x-oca:ocpp:uid:1:569242
     * The number of phases that can be used for charging. If a number of phases is needed, numberPhases=3 will be assumed unless another number is given.
     * 
     * 
     */
    public void setNumberPhases(Integer numberPhases) {
        this.numberPhases = numberPhases;
    }

    /**
     * Values: 1..3, Used if numberPhases=1 and if the EVSE is capable of switching the phase connected to the EV, i.e. ACPhaseSwitchingSupported is defined and true. It’s not allowed unless both conditions above are true. If both conditions are true, and phaseToUse is omitted, the Charging Station / EVSE will make the selection on its own.
     * 
     * 
     * 
     */
    public Integer getPhaseToUse() {
        return phaseToUse;
    }

    /**
     * Values: 1..3, Used if numberPhases=1 and if the EVSE is capable of switching the phase connected to the EV, i.e. ACPhaseSwitchingSupported is defined and true. It’s not allowed unless both conditions above are true. If both conditions are true, and phaseToUse is omitted, the Charging Station / EVSE will make the selection on its own.
     * 
     * 
     * 
     */
    public void setPhaseToUse(Integer phaseToUse) {
        this.phaseToUse = phaseToUse;
    }

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject(){
        return JsonTools.toJsonObject(this);
    }
}
