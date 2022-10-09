
package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;


/**
 * Indicates whether the message was processed properly.
 * 
 * 
 */
public enum Iso15118EVCertificateStatusEnum {

    ACCEPTED("Accepted"),
    FAILED("Failed");
    private final String value;
    private final static Map<String, Iso15118EVCertificateStatusEnum> CONSTANTS = new HashMap<String, Iso15118EVCertificateStatusEnum>();

    static {
        for (Iso15118EVCertificateStatusEnum c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    Iso15118EVCertificateStatusEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static Iso15118EVCertificateStatusEnum fromValue(String value) {
        Iso15118EVCertificateStatusEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
