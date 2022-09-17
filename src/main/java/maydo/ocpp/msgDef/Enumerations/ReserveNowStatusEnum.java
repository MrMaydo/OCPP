
package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;


/**
 * This indicates the success or failure of the reservation.
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum ReserveNowStatusEnum {

    ACCEPTED("Accepted"),
    FAULTED("Faulted"),
    OCCUPIED("Occupied"),
    REJECTED("Rejected"),
    UNAVAILABLE("Unavailable");
    private final String value;
    private final static Map<String, ReserveNowStatusEnum> CONSTANTS = new HashMap<String, ReserveNowStatusEnum>();

    static {
        for (ReserveNowStatusEnum c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ReserveNowStatusEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static ReserveNowStatusEnum fromValue(String value) {
        ReserveNowStatusEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
