package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * This indicates whether the Charging Station is able to perform the reset.
 */
public enum ResetStatusEnum {

    ACCEPTED("Accepted"),
    REJECTED("Rejected"),
    SCHEDULED("Scheduled");
    private final String value;
    private final static Map<String, ResetStatusEnum> CONSTANTS = new HashMap<String, ResetStatusEnum>();

    static {
        for (ResetStatusEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ResetStatusEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static ResetStatusEnum fromValue(String value) {
        ResetStatusEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
