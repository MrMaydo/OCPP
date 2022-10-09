package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * Result status of getting the variable.
 */
public enum GetVariableStatusEnum {

    ACCEPTED("Accepted"),
    REJECTED("Rejected"),
    UNKNOWN_COMPONENT("UnknownComponent"),
    UNKNOWN_VARIABLE("UnknownVariable"),
    NOT_SUPPORTED_ATTRIBUTE_TYPE("NotSupportedAttributeType");
    private final String value;
    private final static Map<String, GetVariableStatusEnum> CONSTANTS = new HashMap<String, GetVariableStatusEnum>();

    static {
        for (GetVariableStatusEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    GetVariableStatusEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static GetVariableStatusEnum fromValue(String value) {
        GetVariableStatusEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
