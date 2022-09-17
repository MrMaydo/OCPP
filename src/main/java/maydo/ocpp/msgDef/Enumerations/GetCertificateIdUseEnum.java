
package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public enum GetCertificateIdUseEnum {

    V_2_G_ROOT_CERTIFICATE("V2GRootCertificate"),
    MO_ROOT_CERTIFICATE("MORootCertificate"),
    CSMS_ROOT_CERTIFICATE("CSMSRootCertificate"),
    V_2_G_CERTIFICATE_CHAIN("V2GCertificateChain"),
    MANUFACTURER_ROOT_CERTIFICATE("ManufacturerRootCertificate");
    private final String value;
    private final static Map<String, GetCertificateIdUseEnum> CONSTANTS = new HashMap<String, GetCertificateIdUseEnum>();

    static {
        for (GetCertificateIdUseEnum c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    GetCertificateIdUseEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static GetCertificateIdUseEnum fromValue(String value) {
        GetCertificateIdUseEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
