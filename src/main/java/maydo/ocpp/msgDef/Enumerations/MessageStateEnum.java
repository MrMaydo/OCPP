package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * If provided the Charging Station shall return Display Messages with the given state only.
 */
public enum MessageStateEnum {

    CHARGING("Charging"),
    FAULTED("Faulted"),
    IDLE("Idle"),
    UNAVAILABLE("Unavailable"),
    SUSPENDED("Suspended"),
    DISCHARGING("Discharging");
    private final static Map<String, MessageStateEnum> CONSTANTS = new HashMap<String, MessageStateEnum>();

    static {
        for (MessageStateEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private final String value;

    MessageStateEnum(String value) {
        this.value = value;
    }

    public static MessageStateEnum fromValue(String value) {
        MessageStateEnum constant = CONSTANTS.get(value);
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
