package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * Certificate status information. 
 * - if all certificates are valid: return 'Accepted'.
 * - if one of the certificates was revoked, return 'CertificateRevoked'.
 */
public enum AuthorizeCertificateStatusEnum {

    ACCEPTED("Accepted"),
    SIGNATURE_ERROR("SignatureError"),
    CERTIFICATE_EXPIRED("CertificateExpired"),
    CERTIFICATE_REVOKED("CertificateRevoked"),
    NO_CERTIFICATE_AVAILABLE("NoCertificateAvailable"),
    CERT_CHAIN_ERROR("CertChainError"),
    CONTRACT_CANCELLED("ContractCancelled");
    private final String value;
    private final static Map<String, AuthorizeCertificateStatusEnum> CONSTANTS = new HashMap<String, AuthorizeCertificateStatusEnum>();

    static {
        for (AuthorizeCertificateStatusEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    AuthorizeCertificateStatusEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static AuthorizeCertificateStatusEnum fromValue(String value) {
        AuthorizeCertificateStatusEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
