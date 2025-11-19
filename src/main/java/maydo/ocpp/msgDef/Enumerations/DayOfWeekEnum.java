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
    private final String value;
    private final static Map<String, DayOfWeekEnum> CONSTANTS = new HashMap<String, DayOfWeekEnum>();

    static {
        for (DayOfWeekEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    DayOfWeekEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static DayOfWeekEnum fromValue(String value) {
        DayOfWeekEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
