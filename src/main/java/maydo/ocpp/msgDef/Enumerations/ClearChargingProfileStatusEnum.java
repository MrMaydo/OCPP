package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * Indicates if the Charging Station was able to execute the request.
 */
public enum ClearChargingProfileStatusEnum {

    ACCEPTED("Accepted"),
    UNKNOWN("Unknown");
    private final String value;
    private final static Map<String, ClearChargingProfileStatusEnum> CONSTANTS = new HashMap<String, ClearChargingProfileStatusEnum>();

    static {
        for (ClearChargingProfileStatusEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ClearChargingProfileStatusEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static ClearChargingProfileStatusEnum fromValue(String value) {
        ClearChargingProfileStatusEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
