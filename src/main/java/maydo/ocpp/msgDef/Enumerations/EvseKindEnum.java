package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * Type of EVSE (AC, DC) this tariff applies to.
 */
public enum EvseKindEnum {

    AC("AC"),
    DC("DC");
    private final String value;
    private final static Map<String, EvseKindEnum> CONSTANTS = new HashMap<String, EvseKindEnum>();

    static {
        for (EvseKindEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    EvseKindEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static EvseKindEnum fromValue(String value) {
        EvseKindEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
