package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * Authentication method.
 *
 */

public enum APNAuthenticationEnum {

    PAP("PAP"),
    CHAP("CHAP"),
    NONE("NONE"),
    AUTO("AUTO");
    private final static Map<String, APNAuthenticationEnum> CONSTANTS = new HashMap<String, APNAuthenticationEnum>();

    static {
        for (APNAuthenticationEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private final String value;

    APNAuthenticationEnum(String value) {
        this.value = value;
    }

    public static APNAuthenticationEnum fromValue(String value) {
        APNAuthenticationEnum constant = CONSTANTS.get(value);
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
