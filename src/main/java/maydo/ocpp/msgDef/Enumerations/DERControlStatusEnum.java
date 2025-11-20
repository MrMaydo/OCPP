package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * Result of operation.
 */
public enum DERControlStatusEnum {

    ACCEPTED("Accepted"),
    REJECTED("Rejected"),
    NOT_SUPPORTED("NotSupported"),
    NOT_FOUND("NotFound");
    private final static Map<String, DERControlStatusEnum> CONSTANTS = new HashMap<String, DERControlStatusEnum>();

    static {
        for (DERControlStatusEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private final String value;

    DERControlStatusEnum(String value) {
        this.value = value;
    }

    public static DERControlStatusEnum fromValue(String value) {
        DERControlStatusEnum constant = CONSTANTS.get(value);
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
