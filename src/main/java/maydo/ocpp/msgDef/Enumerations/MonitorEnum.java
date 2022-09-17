
package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;


/**
 * The type of this monitor, e.g. a threshold, delta or periodic monitor. 
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum MonitorEnum {

    UPPER_THRESHOLD("UpperThreshold"),
    LOWER_THRESHOLD("LowerThreshold"),
    DELTA("Delta"),
    PERIODIC("Periodic"),
    PERIODIC_CLOCK_ALIGNED("PeriodicClockAligned");
    private final String value;
    private final static Map<String, MonitorEnum> CONSTANTS = new HashMap<String, MonitorEnum>();

    static {
        for (MonitorEnum c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    MonitorEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static MonitorEnum fromValue(String value) {
        MonitorEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}