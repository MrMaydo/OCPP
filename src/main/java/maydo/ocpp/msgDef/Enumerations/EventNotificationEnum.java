
package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;


/**
 * Specifies the event notification type of the message.
 * 
 * 
 * 
 */
public enum EventNotificationEnum {

    HARD_WIRED_NOTIFICATION("HardWiredNotification"),
    HARD_WIRED_MONITOR("HardWiredMonitor"),
    PRECONFIGURED_MONITOR("PreconfiguredMonitor"),
    CUSTOM_MONITOR("CustomMonitor");
    private final String value;
    private final static Map<String, EventNotificationEnum> CONSTANTS = new HashMap<String, EventNotificationEnum>();

    static {
        for (EventNotificationEnum c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    EventNotificationEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static EventNotificationEnum fromValue(String value) {
        EventNotificationEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
