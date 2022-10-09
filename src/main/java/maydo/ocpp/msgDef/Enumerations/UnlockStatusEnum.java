
package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;


/**
 * This indicates whether the Charging Station has unlocked the connector.
 * 
 * 
 */
public enum UnlockStatusEnum {

    UNLOCKED("Unlocked"),
    UNLOCK_FAILED("UnlockFailed"),
    ONGOING_AUTHORIZED_TRANSACTION("OngoingAuthorizedTransaction"),
    UNKNOWN_CONNECTOR("UnknownConnector");
    private final String value;
    private final static Map<String, UnlockStatusEnum> CONSTANTS = new HashMap<String, UnlockStatusEnum>();

    static {
        for (UnlockStatusEnum c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    UnlockStatusEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static UnlockStatusEnum fromValue(String value) {
        UnlockStatusEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
