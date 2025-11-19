package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * Type of attribute: Actual, Target, MinSet, MaxSet. Default is Actual when omitted.
 */
public enum AttributeEnum {

    ACTUAL("Actual"),
    TARGET("Target"),
    MIN_SET("MinSet"),
    MAX_SET("MaxSet");
    private final String value;
    private final static Map<String, AttributeEnum> CONSTANTS = new HashMap<String, AttributeEnum>();

    static {
        for (AttributeEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    AttributeEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static AttributeEnum fromValue(String value) {
        AttributeEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
