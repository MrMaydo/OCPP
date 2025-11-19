package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * Indicates how the measured value is to be interpreted. For instance between L1 and neutral (L1-N) Please note that not all values of phase are applicable to all Measurands. When phase is absent, the measured value is interpreted as an overall value.
 */
public enum PhaseEnum {

    L1("L1"),
    L2("L2"),
    L3("L3"),
    N("N"),
    L1_N("L1-N"),
    L2_N("L2-N"),
    L3_N("L3-N"),
    L1_L2("L1-L2"),
    L2_L3("L2-L3"),
    L3_L1("L3-L1");
    private final static Map<String, PhaseEnum> CONSTANTS = new HashMap<String, PhaseEnum>();

    static {
        for (PhaseEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private final String value;

    PhaseEnum(String value) {
        this.value = value;
    }

    public static PhaseEnum fromValue(String value) {
        PhaseEnum constant = CONSTANTS.get(value);
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
