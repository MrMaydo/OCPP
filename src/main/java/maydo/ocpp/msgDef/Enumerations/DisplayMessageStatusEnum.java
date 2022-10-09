
package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;


/**
 * This indicates whether the Charging Station is able to display the message.
 * 
 * 
 */
public enum DisplayMessageStatusEnum {

    ACCEPTED("Accepted"),
    NOT_SUPPORTED_MESSAGE_FORMAT("NotSupportedMessageFormat"),
    REJECTED("Rejected"),
    NOT_SUPPORTED_PRIORITY("NotSupportedPriority"),
    NOT_SUPPORTED_STATE("NotSupportedState"),
    UNKNOWN_TRANSACTION("UnknownTransaction");
    private final String value;
    private final static Map<String, DisplayMessageStatusEnum> CONSTANTS = new HashMap<String, DisplayMessageStatusEnum>();

    static {
        for (DisplayMessageStatusEnum c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    DisplayMessageStatusEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static DisplayMessageStatusEnum fromValue(String value) {
        DisplayMessageStatusEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
