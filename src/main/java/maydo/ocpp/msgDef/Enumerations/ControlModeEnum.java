package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * *(2.1)* Indicates whether EV wants to operate in Dynamic or Scheduled mode. When absent, Scheduled mode is assumed for backwards compatibility. +
 * *ISO 15118-20:* +
 * ServiceSelectionReq(SelectedEnergyTransferService)
 */
public enum ControlModeEnum {

    SCHEDULED_CONTROL("ScheduledControl"),
    DYNAMIC_CONTROL("DynamicControl");
    private final static Map<String, ControlModeEnum> CONSTANTS = new HashMap<String, ControlModeEnum>();

    static {
        for (ControlModeEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private final String value;

    ControlModeEnum(String value) {
        this.value = value;
    }

    public static ControlModeEnum fromValue(String value) {
        ControlModeEnum constant = CONSTANTS.get(value);
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
