
package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;


/**
 * Type of monitor that triggered this event, e.g. exceeding a threshold value.
 * 
 * 
 * 
 */
public enum EventTriggerEnum {

    ALERTING("Alerting"),
    DELTA("Delta"),
    PERIODIC("Periodic");
    private final String value;
    private final static Map<String, EventTriggerEnum> CONSTANTS = new HashMap<String, EventTriggerEnum>();

    static {
        for (EventTriggerEnum c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    EventTriggerEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static EventTriggerEnum fromValue(String value) {
        EventTriggerEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
