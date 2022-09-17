
package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;


/**
 * The updated reservation status.
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum ReservationUpdateStatusEnum {

    EXPIRED("Expired"),
    REMOVED("Removed");
    private final String value;
    private final static Map<String, ReservationUpdateStatusEnum> CONSTANTS = new HashMap<String, ReservationUpdateStatusEnum>();

    static {
        for (ReservationUpdateStatusEnum c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ReservationUpdateStatusEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static ReservationUpdateStatusEnum fromValue(String value) {
        ReservationUpdateStatusEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
