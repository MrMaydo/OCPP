
package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;


/**
 * This contains the type of reset that the Charging Station or EVSE should perform.
 * 
 * 
 */
public enum ResetEnum {

    IMMEDIATE("Immediate"),
    ON_IDLE("OnIdle");
    private final String value;
    private final static Map<String, ResetEnum> CONSTANTS = new HashMap<String, ResetEnum>();

    static {
        for (ResetEnum c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ResetEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static ResetEnum fromValue(String value) {
        ResetEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
