package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * Charging_ Profile. Recurrency_ Kind. Recurrency_ Kind_ Code
 * urn:x-oca:ocpp:uid:1:569233
 * Indicates the start point of a recurrence.
 */
public enum RecurrencyKindEnum {

    DAILY("Daily"),
    WEEKLY("Weekly");
    private final String value;
    private final static Map<String, RecurrencyKindEnum> CONSTANTS = new HashMap<String, RecurrencyKindEnum>();

    static {
        for (RecurrencyKindEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    RecurrencyKindEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static RecurrencyKindEnum fromValue(String value) {
        RecurrencyKindEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
