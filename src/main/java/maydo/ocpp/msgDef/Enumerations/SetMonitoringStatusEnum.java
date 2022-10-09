
package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;


/**
 * Status is OK if a value could be returned. Otherwise this will indicate the reason why a value could not be returned.
 * 
 * 
 */
public enum SetMonitoringStatusEnum {

    ACCEPTED("Accepted"),
    UNKNOWN_COMPONENT("UnknownComponent"),
    UNKNOWN_VARIABLE("UnknownVariable"),
    UNSUPPORTED_MONITOR_TYPE("UnsupportedMonitorType"),
    REJECTED("Rejected"),
    DUPLICATE("Duplicate");
    private final String value;
    private final static Map<String, SetMonitoringStatusEnum> CONSTANTS = new HashMap<String, SetMonitoringStatusEnum>();

    static {
        for (SetMonitoringStatusEnum c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    SetMonitoringStatusEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static SetMonitoringStatusEnum fromValue(String value) {
        SetMonitoringStatusEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
