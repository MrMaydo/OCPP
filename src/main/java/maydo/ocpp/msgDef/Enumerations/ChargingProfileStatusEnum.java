package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * Returns whether message was processed successfully.
 */
public enum ChargingProfileStatusEnum {

    ACCEPTED("Accepted"),
    REJECTED("Rejected");
    private final static Map<String, ChargingProfileStatusEnum> CONSTANTS = new HashMap<String, ChargingProfileStatusEnum>();

    static {
        for (ChargingProfileStatusEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private final String value;

    ChargingProfileStatusEnum(String value) {
        this.value = value;
    }

    public static ChargingProfileStatusEnum fromValue(String value) {
        ChargingProfileStatusEnum constant = CONSTANTS.get(value);
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
