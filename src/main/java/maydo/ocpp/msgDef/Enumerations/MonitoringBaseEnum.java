
package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;


/**
 * Specify which monitoring base will be set
 * 
 * 
 */
public enum MonitoringBaseEnum {

    ALL("All"),
    FACTORY_DEFAULT("FactoryDefault"),
    HARD_WIRED_ONLY("HardWiredOnly");
    private final String value;
    private final static Map<String, MonitoringBaseEnum> CONSTANTS = new HashMap<String, MonitoringBaseEnum>();

    static {
        for (MonitoringBaseEnum c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    MonitoringBaseEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static MonitoringBaseEnum fromValue(String value) {
        MonitoringBaseEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
