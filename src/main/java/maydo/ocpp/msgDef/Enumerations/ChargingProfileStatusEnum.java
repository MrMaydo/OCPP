
package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;


/**
 * Returns whether the Charging Station has been able to process the message successfully. This does not guarantee the schedule will be followed to the letter. There might be other constraints the Charging Station may need to take into account.
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum ChargingProfileStatusEnum {

    ACCEPTED("Accepted"),
    REJECTED("Rejected");
    private final String value;
    private final static Map<String, ChargingProfileStatusEnum> CONSTANTS = new HashMap<String, ChargingProfileStatusEnum>();

    static {
        for (ChargingProfileStatusEnum c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ChargingProfileStatusEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static ChargingProfileStatusEnum fromValue(String value) {
        ChargingProfileStatusEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
