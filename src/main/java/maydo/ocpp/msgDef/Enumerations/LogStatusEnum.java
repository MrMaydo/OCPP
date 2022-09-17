
package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;


/**
 * This field indicates whether the Charging Station was able to accept the request.
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum LogStatusEnum {

    ACCEPTED("Accepted"),
    REJECTED("Rejected"),
    ACCEPTED_CANCELED("AcceptedCanceled");
    private final String value;
    private final static Map<String, LogStatusEnum> CONSTANTS = new HashMap<String, LogStatusEnum>();

    static {
        for (LogStatusEnum c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    LogStatusEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static LogStatusEnum fromValue(String value) {
        LogStatusEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
