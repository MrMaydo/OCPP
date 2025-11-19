package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * This indicates the success or failure of the reservation.
 */
public enum ReserveNowStatusEnum {

    ACCEPTED("Accepted"),
    FAULTED("Faulted"),
    OCCUPIED("Occupied"),
    REJECTED("Rejected"),
    UNAVAILABLE("Unavailable");
    private final static Map<String, ReserveNowStatusEnum> CONSTANTS = new HashMap<String, ReserveNowStatusEnum>();

    static {
        for (ReserveNowStatusEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private final String value;

    ReserveNowStatusEnum(String value) {
        this.value = value;
    }

    public static ReserveNowStatusEnum fromValue(String value) {
        ReserveNowStatusEnum constant = CONSTANTS.get(value);
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
