
package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;


/**
 * Result status of setting the variable.
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum SetVariableStatusEnum {

    ACCEPTED("Accepted"),
    REJECTED("Rejected"),
    UNKNOWN_COMPONENT("UnknownComponent"),
    UNKNOWN_VARIABLE("UnknownVariable"),
    NOT_SUPPORTED_ATTRIBUTE_TYPE("NotSupportedAttributeType"),
    REBOOT_REQUIRED("RebootRequired");
    private final String value;
    private final static Map<String, SetVariableStatusEnum> CONSTANTS = new HashMap<String, SetVariableStatusEnum>();

    static {
        for (SetVariableStatusEnum c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    SetVariableStatusEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static SetVariableStatusEnum fromValue(String value) {
        SetVariableStatusEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
