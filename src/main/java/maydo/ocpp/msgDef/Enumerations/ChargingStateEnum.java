package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * Current charging state, is required when state
 * has changed. Omitted when there is no communication between EVSE and EV, because no cable is plugged in.
 */
public enum ChargingStateEnum {

    EV_CONNECTED("EVConnected"),
    CHARGING("Charging"),
    SUSPENDED_EV("SuspendedEV"),
    SUSPENDED_EVSE("SuspendedEVSE"),
    IDLE("Idle");
    private final String value;
    private final static Map<String, ChargingStateEnum> CONSTANTS = new HashMap<String, ChargingStateEnum>();

    static {
        for (ChargingStateEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ChargingStateEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static ChargingStateEnum fromValue(String value) {
        ChargingStateEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
