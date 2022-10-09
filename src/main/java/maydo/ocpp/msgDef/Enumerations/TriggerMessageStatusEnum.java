
package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;


/**
 * Indicates whether the Charging Station will send the requested notification or not.
 * 
 * 
 */
public enum TriggerMessageStatusEnum {

    ACCEPTED("Accepted"),
    REJECTED("Rejected"),
    NOT_IMPLEMENTED("NotImplemented");
    private final String value;
    private final static Map<String, TriggerMessageStatusEnum> CONSTANTS = new HashMap<String, TriggerMessageStatusEnum>();

    static {
        for (TriggerMessageStatusEnum c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    TriggerMessageStatusEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static TriggerMessageStatusEnum fromValue(String value) {
        TriggerMessageStatusEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
