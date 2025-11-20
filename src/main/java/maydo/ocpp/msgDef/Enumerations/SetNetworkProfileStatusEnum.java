package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * Result of operation.
 */
public enum SetNetworkProfileStatusEnum {

    ACCEPTED("Accepted"),
    REJECTED("Rejected"),
    FAILED("Failed");
    private final static Map<String, SetNetworkProfileStatusEnum> CONSTANTS = new HashMap<String, SetNetworkProfileStatusEnum>();

    static {
        for (SetNetworkProfileStatusEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private final String value;

    SetNetworkProfileStatusEnum(String value) {
        this.value = value;
    }

    public static SetNetworkProfileStatusEnum fromValue(String value) {
        SetNetworkProfileStatusEnum constant = CONSTANTS.get(value);
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
