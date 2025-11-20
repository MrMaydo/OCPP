package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * This contains the type of reset that the Charging Station or EVSE should perform.
 */
public enum ResetEnum {

    IMMEDIATE("Immediate"),
    ON_IDLE("OnIdle"),
    IMMEDIATE_AND_RESUME("ImmediateAndResume");
    private final static Map<String, ResetEnum> CONSTANTS = new HashMap<String, ResetEnum>();

    static {
        for (ResetEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private final String value;

    ResetEnum(String value) {
        this.value = value;
    }

    public static ResetEnum fromValue(String value) {
        ResetEnum constant = CONSTANTS.get(value);
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
