
package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;


/**
 * This indicates whether the Charging Station is able to perform the availability change.
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum ChangeAvailabilityStatusEnum {

    ACCEPTED("Accepted"),
    REJECTED("Rejected"),
    SCHEDULED("Scheduled");
    private final String value;
    private final static Map<String, ChangeAvailabilityStatusEnum> CONSTANTS = new HashMap<String, ChangeAvailabilityStatusEnum>();

    static {
        for (ChangeAvailabilityStatusEnum c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ChangeAvailabilityStatusEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static ChangeAvailabilityStatusEnum fromValue(String value) {
        ChangeAvailabilityStatusEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
