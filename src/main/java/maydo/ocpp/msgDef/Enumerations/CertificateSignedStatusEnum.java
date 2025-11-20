package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * Returns whether certificate signing has been accepted, otherwise rejected.
 */
public enum CertificateSignedStatusEnum {

    ACCEPTED("Accepted"),
    REJECTED("Rejected");
    private final static Map<String, CertificateSignedStatusEnum> CONSTANTS = new HashMap<String, CertificateSignedStatusEnum>();

    static {
        for (CertificateSignedStatusEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private final String value;

    CertificateSignedStatusEnum(String value) {
        this.value = value;
    }

    public static CertificateSignedStatusEnum fromValue(String value) {
        CertificateSignedStatusEnum constant = CONSTANTS.get(value);
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
