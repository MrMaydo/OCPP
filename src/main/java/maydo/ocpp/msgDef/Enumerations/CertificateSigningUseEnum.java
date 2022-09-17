
package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;


/**
 * Indicates the type of the signed certificate that is returned. When omitted the certificate is used for both the 15118 connection (if implemented) and the Charging Station to CSMS connection. This field is required when a typeOfCertificate was included in the &lt;&lt;signcertificaterequest,SignCertificateRequest&gt;&gt; that requested this certificate to be signed AND both the 15118 connection and the Charging Station connection are implemented.
 * 
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum CertificateSigningUseEnum {

    CHARGING_STATION_CERTIFICATE("ChargingStationCertificate"),
    V_2_G_CERTIFICATE("V2GCertificate");
    private final String value;
    private final static Map<String, CertificateSigningUseEnum> CONSTANTS = new HashMap<String, CertificateSigningUseEnum>();

    static {
        for (CertificateSigningUseEnum c: values()) {
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
