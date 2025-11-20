package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * Result of the request.
 */
public enum PriorityChargingStatusEnum {

    ACCEPTED("Accepted"),
    REJECTED("Rejected"),
    NO_PROFILE("NoProfile");
    private final static Map<String, PriorityChargingStatusEnum> CONSTANTS = new HashMap<String, PriorityChargingStatusEnum>();

    static {
        for (PriorityChargingStatusEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private final String value;

    PriorityChargingStatusEnum(String value) {
        this.value = value;
    }

    public static PriorityChargingStatusEnum fromValue(String value) {
        PriorityChargingStatusEnum constant = CONSTANTS.get(value);
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
