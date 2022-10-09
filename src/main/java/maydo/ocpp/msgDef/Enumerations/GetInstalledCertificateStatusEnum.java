package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * Charging Station indicates if it can process the request.
 */
public enum GetInstalledCertificateStatusEnum {

    ACCEPTED("Accepted"),
    NOT_FOUND("NotFound");
    private final String value;
    private final static Map<String, GetInstalledCertificateStatusEnum> CONSTANTS = new HashMap<String, GetInstalledCertificateStatusEnum>();

    static {
        for (GetInstalledCertificateStatusEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    GetInstalledCertificateStatusEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static GetInstalledCertificateStatusEnum fromValue(String value) {
        GetInstalledCertificateStatusEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
