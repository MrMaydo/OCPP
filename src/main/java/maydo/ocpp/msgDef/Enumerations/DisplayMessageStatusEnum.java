package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * This indicates whether the Charging Station is able to display the message.
 */
public enum DisplayMessageStatusEnum {

    ACCEPTED("Accepted"),
    NOT_SUPPORTED_MESSAGE_FORMAT("NotSupportedMessageFormat"),
    REJECTED("Rejected"),
    NOT_SUPPORTED_PRIORITY("NotSupportedPriority"),
    NOT_SUPPORTED_STATE("NotSupportedState"),
    UNKNOWN_TRANSACTION("UnknownTransaction"),
    LANGUAGE_NOT_SUPPORTED("LanguageNotSupported");
    private final static Map<String, DisplayMessageStatusEnum> CONSTANTS = new HashMap<String, DisplayMessageStatusEnum>();

    static {
        for (DisplayMessageStatusEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private final String value;

    DisplayMessageStatusEnum(String value) {
        this.value = value;
    }

    public static DisplayMessageStatusEnum fromValue(String value) {
        DisplayMessageStatusEnum constant = CONSTANTS.get(value);
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
