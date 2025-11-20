package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * This contains whether the Charging Station has been registered
 * within the CSMS.
 */
public enum RegistrationStatusEnum {

    ACCEPTED("Accepted"),
    PENDING("Pending"),
    REJECTED("Rejected");
    private final static Map<String, RegistrationStatusEnum> CONSTANTS = new HashMap<String, RegistrationStatusEnum>();

    static {
        for (RegistrationStatusEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private final String value;

    RegistrationStatusEnum(String value) {
        this.value = value;
    }

    public static RegistrationStatusEnum fromValue(String value) {
        RegistrationStatusEnum constant = CONSTANTS.get(value);
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
