package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * Defines the mutability of this attribute. Default is ReadWrite when omitted.
 */
public enum MutabilityEnum {

    READ_ONLY("ReadOnly"),
    WRITE_ONLY("WriteOnly"),
    READ_WRITE("ReadWrite");
    private final String value;
    private final static Map<String, MutabilityEnum> CONSTANTS = new HashMap<String, MutabilityEnum>();

    static {
        for (MutabilityEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    MutabilityEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static MutabilityEnum fromValue(String value) {
        MutabilityEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
