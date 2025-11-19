package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * This indicates whether the Charging Station has successfully received and applied the update of the Local Authorization List.
 */
public enum SendLocalListStatusEnum {

    ACCEPTED("Accepted"),
    FAILED("Failed"),
    VERSION_MISMATCH("VersionMismatch");
    private final static Map<String, SendLocalListStatusEnum> CONSTANTS = new HashMap<String, SendLocalListStatusEnum>();

    static {
        for (SendLocalListStatusEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private final String value;

    SendLocalListStatusEnum(String value) {
        this.value = value;
    }

    public static SendLocalListStatusEnum fromValue(String value) {
        SendLocalListStatusEnum constant = CONSTANTS.get(value);
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
