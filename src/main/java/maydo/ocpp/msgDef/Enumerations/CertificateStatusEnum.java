package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * Status of certificate: good, revoked or unknown.
 */
public enum CertificateStatusEnum {

    GOOD("Good"),
    REVOKED("Revoked"),
    UNKNOWN("Unknown"),
    FAILED("Failed");
    private final String value;
    private final static Map<String, CertificateStatusEnum> CONSTANTS = new HashMap<String, CertificateStatusEnum>();

    static {
        for (CertificateStatusEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    CertificateStatusEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static CertificateStatusEnum fromValue(String value) {
        CertificateStatusEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
