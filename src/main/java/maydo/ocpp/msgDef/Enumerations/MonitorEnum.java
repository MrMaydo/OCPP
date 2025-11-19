package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * The type of this monitor, e.g. a threshold, delta or periodic monitor.
 */
public enum MonitorEnum {

    UPPER_THRESHOLD("UpperThreshold"),
    LOWER_THRESHOLD("LowerThreshold"),
    DELTA("Delta"),
    PERIODIC("Periodic"),
    PERIODIC_CLOCK_ALIGNED("PeriodicClockAligned"),
    TARGET_DELTA("TargetDelta"),
    TARGET_DELTA_RELATIVE("TargetDeltaRelative");
    private final static Map<String, MonitorEnum> CONSTANTS = new HashMap<String, MonitorEnum>();

    static {
        for (MonitorEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private final String value;

    MonitorEnum(String value) {
        this.value = value;
    }

    public static MonitorEnum fromValue(String value) {
        MonitorEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

}
