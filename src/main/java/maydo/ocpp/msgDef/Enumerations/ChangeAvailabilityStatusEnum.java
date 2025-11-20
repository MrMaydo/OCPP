package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * This indicates whether the Charging Station is able to perform the availability change.
 */
public enum ChangeAvailabilityStatusEnum {

    ACCEPTED("Accepted"),
    REJECTED("Rejected"),
    SCHEDULED("Scheduled");
    private final static Map<String, ChangeAvailabilityStatusEnum> CONSTANTS = new HashMap<String, ChangeAvailabilityStatusEnum>();

    static {
        for (ChangeAvailabilityStatusEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private final String value;

    ChangeAvailabilityStatusEnum(String value) {
        this.value = value;
    }

    public static ChangeAvailabilityStatusEnum fromValue(String value) {
        ChangeAvailabilityStatusEnum constant = CONSTANTS.get(value);
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
