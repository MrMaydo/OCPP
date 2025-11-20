package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * Indicates the kind of schedule.
 */
public enum ChargingProfileKindEnum {

    ABSOLUTE("Absolute"),
    RECURRING("Recurring"),
    RELATIVE("Relative"),
    DYNAMIC("Dynamic");
    private final static Map<String, ChargingProfileKindEnum> CONSTANTS = new HashMap<String, ChargingProfileKindEnum>();

    static {
        for (ChargingProfileKindEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private final String value;

    ChargingProfileKindEnum(String value) {
        this.value = value;
    }

    public static ChargingProfileKindEnum fromValue(String value) {
        ChargingProfileKindEnum constant = CONSTANTS.get(value);
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
