package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * Defines whether certificate needs to be installed or updated.
 */
public enum CertificateActionEnum {

    INSTALL("Install"),
    UPDATE("Update");
    private final String value;
    private final static Map<String, CertificateActionEnum> CONSTANTS = new HashMap<String, CertificateActionEnum>();

    static {
        for (CertificateActionEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    CertificateActionEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static CertificateActionEnum fromValue(String value) {
        CertificateActionEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
