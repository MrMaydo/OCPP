package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * This contains the reason for sending this message to the CSMS.
 */
public enum BootReasonEnum {

    APPLICATION_RESET("ApplicationReset"),
    FIRMWARE_UPDATE("FirmwareUpdate"),
    LOCAL_RESET("LocalReset"),
    POWER_UP("PowerUp"),
    REMOTE_RESET("RemoteReset"),
    SCHEDULED_RESET("ScheduledReset"),
    TRIGGERED("Triggered"),
    UNKNOWN("Unknown"),
    WATCHDOG("Watchdog");
    private final static Map<String, BootReasonEnum> CONSTANTS = new HashMap<String, BootReasonEnum>();

    static {
        for (BootReasonEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private final String value;

    BootReasonEnum(String value) {
        this.value = value;
    }

    public static BootReasonEnum fromValue(String value) {
        BootReasonEnum constant = CONSTANTS.get(value);
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
