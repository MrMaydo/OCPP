package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;

public enum DayOfWeekEnum {

    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");
    private final static Map<String, DayOfWeekEnum> CONSTANTS = new HashMap<String, DayOfWeekEnum>();

    static {
        for (DayOfWeekEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private final String value;

    DayOfWeekEnum(String value) {
        this.value = value;
    }

    public static DayOfWeekEnum fromValue(String value) {
        DayOfWeekEnum constant = CONSTANTS.get(value);
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
