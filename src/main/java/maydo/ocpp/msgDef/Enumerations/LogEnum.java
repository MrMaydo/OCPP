package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * This contains the type of log file that the Charging Station
 * should send.
 */
public enum LogEnum {

    DIAGNOSTICS_LOG("DiagnosticsLog"),
    SECURITY_LOG("SecurityLog"),
    DATA_COLLECTOR_LOG("DataCollectorLog");
    private final static Map<String, LogEnum> CONSTANTS = new HashMap<String, LogEnum>();

    static {
        for (LogEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private final String value;

    LogEnum(String value) {
        this.value = value;
    }

    public static LogEnum fromValue(String value) {
        LogEnum constant = CONSTANTS.get(value);
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
