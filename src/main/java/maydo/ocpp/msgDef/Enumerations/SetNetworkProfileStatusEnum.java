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
    private final String value;
    private final static Map<String, SetNetworkProfileStatusEnum> CONSTANTS = new HashMap<String, SetNetworkProfileStatusEnum>();

    static {
        for (SetNetworkProfileStatusEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    SetNetworkProfileStatusEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static SetNetworkProfileStatusEnum fromValue(String value) {
        SetNetworkProfileStatusEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
