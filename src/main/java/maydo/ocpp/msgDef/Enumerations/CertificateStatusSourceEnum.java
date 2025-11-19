package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * Source of status: OCSP, CRL
 */
public enum CertificateStatusSourceEnum {

    CRL("CRL"),
    OCSP("OCSP");
    private final String value;
    private final static Map<String, CertificateStatusSourceEnum> CONSTANTS = new HashMap<String, CertificateStatusSourceEnum>();

    static {
        for (CertificateStatusSourceEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    CertificateStatusSourceEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static CertificateStatusSourceEnum fromValue(String value) {
        CertificateStatusSourceEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
