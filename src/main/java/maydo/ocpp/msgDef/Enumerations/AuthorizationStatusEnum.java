package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * ID_ Token. Status. Authorization_ Status
 * urn:x-oca:ocpp:uid:1:569372
 * Current status of the ID Token.
 */
public enum AuthorizationStatusEnum {

    ACCEPTED("Accepted"),
    BLOCKED("Blocked"),
    CONCURRENT_TX("ConcurrentTx"),
    EXPIRED("Expired"),
    INVALID("Invalid"),
    NO_CREDIT("NoCredit"),
    NOT_ALLOWED_TYPE_EVSE("NotAllowedTypeEVSE"),
    NOT_AT_THIS_LOCATION("NotAtThisLocation"),
    NOT_AT_THIS_TIME("NotAtThisTime"),
    UNKNOWN("Unknown");
    private final String value;
    private final static Map<String, AuthorizationStatusEnum> CONSTANTS = new HashMap<String, AuthorizationStatusEnum>();

    static {
        for (AuthorizationStatusEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    AuthorizationStatusEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static AuthorizationStatusEnum fromValue(String value) {
        AuthorizationStatusEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
