
package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;


/**
 * This contains the type of availability change that the Charging Station should perform.
 * 
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum OperationalStatusEnum {

    INOPERATIVE("Inoperative"),
    OPERATIVE("Operative");
    private final String value;
    private final static Map<String, OperationalStatusEnum> CONSTANTS = new HashMap<String, OperationalStatusEnum>();

    static {
        for (OperationalStatusEnum c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    OperationalStatusEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static OperationalStatusEnum fromValue(String value) {
        OperationalStatusEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}