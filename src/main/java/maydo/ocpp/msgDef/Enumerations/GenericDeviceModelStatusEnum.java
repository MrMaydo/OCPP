
package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;


/**
 * This indicates whether the Charging Station is able to accept this request.
 * 
 * 
 */
public enum GenericDeviceModelStatusEnum {

    ACCEPTED("Accepted"),
    REJECTED("Rejected"),
    NOT_SUPPORTED("NotSupported"),
    EMPTY_RESULT_SET("EmptyResultSet");
    private final String value;
    private final static Map<String, GenericDeviceModelStatusEnum> CONSTANTS = new HashMap<String, GenericDeviceModelStatusEnum>();

    static {
        for (GenericDeviceModelStatusEnum c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    GenericDeviceModelStatusEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static GenericDeviceModelStatusEnum fromValue(String value) {
        GenericDeviceModelStatusEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
