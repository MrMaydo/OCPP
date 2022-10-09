
package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;


/**
 * Can be used to force a power or current profile.
 * 
 * 
 * 
 */
public enum ChargingRateUnitEnum {

    W("W"),
    A("A");
    private final String value;
    private final static Map<String, ChargingRateUnitEnum> CONSTANTS = new HashMap<String, ChargingRateUnitEnum>();

    static {
        for (ChargingRateUnitEnum c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ChargingRateUnitEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static ChargingRateUnitEnum fromValue(String value) {
        ChargingRateUnitEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
