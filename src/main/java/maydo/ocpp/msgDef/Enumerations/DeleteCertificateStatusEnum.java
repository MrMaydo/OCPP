package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * Charging Station indicates if it can process the request.
 */
public enum DeleteCertificateStatusEnum {

    ACCEPTED("Accepted"),
    FAILED("Failed"),
    NOT_FOUND("NotFound");
    private final String value;
    private final static Map<String, DeleteCertificateStatusEnum> CONSTANTS = new HashMap<String, DeleteCertificateStatusEnum>();

    static {
        for (DeleteCertificateStatusEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    DeleteCertificateStatusEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static DeleteCertificateStatusEnum fromValue(String value) {
        DeleteCertificateStatusEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
