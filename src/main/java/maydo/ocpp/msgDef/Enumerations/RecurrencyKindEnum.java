package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * Indicates the start point of a recurrence.
 */
public enum RecurrencyKindEnum {

    DAILY("Daily"),
    WEEKLY("Weekly");
    private final static Map<String, RecurrencyKindEnum> CONSTANTS = new HashMap<String, RecurrencyKindEnum>();

    static {
        for (RecurrencyKindEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private final String value;

    RecurrencyKindEnum(String value) {
        this.value = value;
    }

    public static RecurrencyKindEnum fromValue(String value) {
        RecurrencyKindEnum constant = CONSTANTS.get(value);
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
