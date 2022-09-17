
package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;


/**
 * Accepted if the Charging Station has executed the request, otherwise rejected.
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum ClearCacheStatusEnum {

    ACCEPTED("Accepted"),
    REJECTED("Rejected");
    private final String value;
    private final static Map<String, ClearCacheStatusEnum> CONSTANTS = new HashMap<String, ClearCacheStatusEnum>();

    static {
        for (ClearCacheStatusEnum c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ClearCacheStatusEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static ClearCacheStatusEnum fromValue(String value) {
        ClearCacheStatusEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
