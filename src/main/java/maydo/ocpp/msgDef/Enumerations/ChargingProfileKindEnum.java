
package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;


/**
 * Charging_ Profile. Charging_ Profile_ Kind. Charging_ Profile_ Kind_ Code
 * urn:x-oca:ocpp:uid:1:569232
 * Indicates the kind of schedule.
 * 
 * 
 */
public enum ChargingProfileKindEnum {

    ABSOLUTE("Absolute"),
    RECURRING("Recurring"),
    RELATIVE("Relative");
    private final String value;
    private final static Map<String, ChargingProfileKindEnum> CONSTANTS = new HashMap<String, ChargingProfileKindEnum>();

    static {
        for (ChargingProfileKindEnum c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ChargingProfileKindEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static ChargingProfileKindEnum fromValue(String value) {
        ChargingProfileKindEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
