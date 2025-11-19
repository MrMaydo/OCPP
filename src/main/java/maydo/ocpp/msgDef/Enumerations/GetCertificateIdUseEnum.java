package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;

public enum GetCertificateIdUseEnum {

    V2G_ROOT_CERTIFICATE("V2GRootCertificate"),
    MO_ROOT_CERTIFICATE("MORootCertificate"),
    CSMS_ROOT_CERTIFICATE("CSMSRootCertificate"),
    V2G_CERTIFICATE_CHAIN("V2GCertificateChain"),
    MANUFACTURER_ROOT_CERTIFICATE("ManufacturerRootCertificate"),
    OEM_ROOT_CERTIFICATE("OEMRootCertificate");
    private final String value;
    private final static Map<String, GetCertificateIdUseEnum> CONSTANTS = new HashMap<String, GetCertificateIdUseEnum>();

    static {
        for (GetCertificateIdUseEnum c : values()) {
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
