package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * *(2.1)* The current preconditioning status of the BMS in the EV. Default value is Unknown.
 */
public enum PreconditioningStatusEnum {

    UNKNOWN("Unknown"),
    READY("Ready"),
    NOT_READY("NotReady"),
    PRECONDITIONING("Preconditioning");
    private final static Map<String, PreconditioningStatusEnum> CONSTANTS = new HashMap<String, PreconditioningStatusEnum>();

    static {
        for (PreconditioningStatusEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private final String value;

    PreconditioningStatusEnum(String value) {
        this.value = value;
    }

    public static PreconditioningStatusEnum fromValue(String value) {
        PreconditioningStatusEnum constant = CONSTANTS.get(value);
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
