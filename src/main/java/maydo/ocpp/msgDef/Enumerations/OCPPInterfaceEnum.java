
package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;


/**
 * Applicable Network Interface.
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum OCPPInterfaceEnum {

    WIRED_0("Wired0"),
    WIRED_1("Wired1"),
    WIRED_2("Wired2"),
    WIRED_3("Wired3"),
    WIRELESS_0("Wireless0"),
    WIRELESS_1("Wireless1"),
    WIRELESS_2("Wireless2"),
    WIRELESS_3("Wireless3");
    private final String value;
    private final static Map<String, OCPPInterfaceEnum> CONSTANTS = new HashMap<String, OCPPInterfaceEnum>();

    static {
        for (OCPPInterfaceEnum c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    OCPPInterfaceEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static OCPPInterfaceEnum fromValue(String value) {
        OCPPInterfaceEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
