package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * Indicates the type of certificate that is to be signed. When omitted the certificate is to be used for both the 15118 connection (if implemented) and the Charging Station to CSMS connection.
 */
public enum CertificateSigningUseEnum {

    CHARGING_STATION_CERTIFICATE("ChargingStationCertificate"),
    V2G_CERTIFICATE("V2GCertificate"),
    V2G_20_CERTIFICATE("V2G20Certificate");
    private final String value;
    private final static Map<String, CertificateSigningUseEnum> CONSTANTS = new HashMap<String, CertificateSigningUseEnum>();

    static {
        for (CertificateSigningUseEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    CertificateSigningUseEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static CertificateSigningUseEnum fromValue(String value) {
        CertificateSigningUseEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
