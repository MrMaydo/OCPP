package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * The updated reservation status.
 */
public enum ReservationUpdateStatusEnum {

    EXPIRED("Expired"),
    REMOVED("Removed"),
    NO_TRANSACTION("NoTransaction");
    private final static Map<String, ReservationUpdateStatusEnum> CONSTANTS = new HashMap<String, ReservationUpdateStatusEnum>();

    static {
        for (ReservationUpdateStatusEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private final String value;

    ReservationUpdateStatusEnum(String value) {
        this.value = value;
    }

    public static ReservationUpdateStatusEnum fromValue(String value) {
        ReservationUpdateStatusEnum constant = CONSTANTS.get(value);
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
