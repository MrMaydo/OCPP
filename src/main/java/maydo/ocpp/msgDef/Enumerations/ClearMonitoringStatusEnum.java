package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * Result of the clear request for this monitor, identified by its Id.
 */
public enum ClearMonitoringStatusEnum {

    ACCEPTED("Accepted"),
    REJECTED("Rejected"),
    NOT_FOUND("NotFound");
    private final String value;
    private final static Map<String, ClearMonitoringStatusEnum> CONSTANTS = new HashMap<String, ClearMonitoringStatusEnum>();

    static {
        for (ClearMonitoringStatusEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ClearMonitoringStatusEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static ClearMonitoringStatusEnum fromValue(String value) {
        ClearMonitoringStatusEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
