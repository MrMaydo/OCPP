package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * Parameter is only sent, if the EV has to feed-in power or reactive power during fault-ride through (FRT) as defined by HVMomCess curve and LVMomCess curve.
 * 
 */
public enum PowerDuringCessationEnum {

    ACTIVE("Active"),
    REACTIVE("Reactive");
    private final String value;
    private final static Map<String, PowerDuringCessationEnum> CONSTANTS = new HashMap<String, PowerDuringCessationEnum>();

    static {
        for (PowerDuringCessationEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    PowerDuringCessationEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static PowerDuringCessationEnum fromValue(String value) {
        PowerDuringCessationEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
