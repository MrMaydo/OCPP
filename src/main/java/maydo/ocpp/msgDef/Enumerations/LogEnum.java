
package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;


/**
 * This contains the type of log file that the Charging Station
 * should send.
 * 
 * 
 */
public enum LogEnum {

    DIAGNOSTICS_LOG("DiagnosticsLog"),
    SECURITY_LOG("SecurityLog");
    private final String value;
    private final static Map<String, LogEnum> CONSTANTS = new HashMap<String, LogEnum>();

    static {
        for (LogEnum c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    LogEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static LogEnum fromValue(String value) {
        LogEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
