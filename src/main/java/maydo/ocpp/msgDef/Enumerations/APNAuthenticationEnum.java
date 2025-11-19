package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * Authentication method.
 *
 * <ul>
 *   <li><b>PAP</b> – Use PAP authentication.</li>
 *   <li><b>CHAP</b> – Use CHAP authentication.</li>
 *   <li><b>NONE</b> – Use no authentication.</li>
 *   <li><b>AUTO</b> – Sequentially try CHAP, PAP, NONE.</li>
 * </ul>
 */

public enum APNAuthenticationEnum {

    /** Use PAP authentication */
    PAP("PAP"),
    CHAP("CHAP"),
    NONE("NONE"),
    AUTO("AUTO");
    private final String value;
    private final static Map<String, APNAuthenticationEnum> CONSTANTS = new HashMap<String, APNAuthenticationEnum>();

    static {
        for (APNAuthenticationEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    APNAuthenticationEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static APNAuthenticationEnum fromValue(String value) {
        APNAuthenticationEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
