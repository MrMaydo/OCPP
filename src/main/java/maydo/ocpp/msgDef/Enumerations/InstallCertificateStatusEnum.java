
package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;


/**
 * Charging Station indicates if installation was successful.
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum InstallCertificateStatusEnum {

    ACCEPTED("Accepted"),
    REJECTED("Rejected"),
    FAILED("Failed");
    private final String value;
    private final static Map<String, InstallCertificateStatusEnum> CONSTANTS = new HashMap<String, InstallCertificateStatusEnum>();

    static {
        for (InstallCertificateStatusEnum c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    InstallCertificateStatusEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static InstallCertificateStatusEnum fromValue(String value) {
        InstallCertificateStatusEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
