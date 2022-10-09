
package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;


/**
 * Source of the charging limit.
 * 
 * 
 */
public enum ChargingLimitSourceEnum {

    EMS("EMS"),
    OTHER("Other"),
    SO("SO"),
    CSO("CSO");
    private final String value;
    private final static Map<String, ChargingLimitSourceEnum> CONSTANTS = new HashMap<String, ChargingLimitSourceEnum>();

    static {
        for (ChargingLimitSourceEnum c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ChargingLimitSourceEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static ChargingLimitSourceEnum fromValue(String value) {
        ChargingLimitSourceEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
