package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * Indicates where the measured value has been sampled. Default =  "Outlet"
 */
public enum LocationEnum {

    BODY("Body"),
    CABLE("Cable"),
    EV("EV"),
    INLET("Inlet"),
    OUTLET("Outlet"),
    UPSTREAM("Upstream");
    private final String value;
    private final static Map<String, LocationEnum> CONSTANTS = new HashMap<String, LocationEnum>();

    static {
        for (LocationEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    LocationEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static LocationEnum fromValue(String value) {
        LocationEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
