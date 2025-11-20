package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * This field indicates whether the Charging Station was able to accept the request.
 */
public enum LogStatusEnum {

    ACCEPTED("Accepted"),
    REJECTED("Rejected"),
    ACCEPTED_CANCELED("AcceptedCanceled");
    private final static Map<String, LogStatusEnum> CONSTANTS = new HashMap<String, LogStatusEnum>();

    static {
        for (LogStatusEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private final String value;

    LogStatusEnum(String value) {
        this.value = value;
    }

    public static LogStatusEnum fromValue(String value) {
        LogStatusEnum constant = CONSTANTS.get(value);
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
