package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * Indicates whether the request was accepted.
 */
public enum CustomerInformationStatusEnum {

    ACCEPTED("Accepted"),
    REJECTED("Rejected"),
    INVALID("Invalid");
    private final static Map<String, CustomerInformationStatusEnum> CONSTANTS = new HashMap<String, CustomerInformationStatusEnum>();

    static {
        for (CustomerInformationStatusEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private final String value;

    CustomerInformationStatusEnum(String value) {
        this.value = value;
    }

    public static CustomerInformationStatusEnum fromValue(String value) {
        CustomerInformationStatusEnum constant = CONSTANTS.get(value);
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
