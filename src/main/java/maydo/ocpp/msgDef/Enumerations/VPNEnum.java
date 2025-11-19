package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * Type of VPN
 */
public enum VPNEnum {

    IKEV2("IKEv2"),
    IPSEC("IPSec"),
    L2TP("L2TP"),
    PPTP("PPTP");
    private final static Map<String, VPNEnum> CONSTANTS = new HashMap<String, VPNEnum>();

    static {
        for (VPNEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private final String value;

    VPNEnum(String value) {
        this.value = value;
    }

    public static VPNEnum fromValue(String value) {
        VPNEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

}
