package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * Returns whether the Charging Station has been able to remove the message.
 */
public enum ClearMessageStatusEnum {

    ACCEPTED("Accepted"),
    UNKNOWN("Unknown");
    private final String value;
    private final static Map<String, ClearMessageStatusEnum> CONSTANTS = new HashMap<String, ClearMessageStatusEnum>();

    static {
        for (ClearMessageStatusEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ClearMessageStatusEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static ClearMessageStatusEnum fromValue(String value) {
        ClearMessageStatusEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
