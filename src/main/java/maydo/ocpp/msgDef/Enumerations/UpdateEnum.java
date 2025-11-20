package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * This contains the type of update (full or differential) of this request.
 */
public enum UpdateEnum {

    DIFFERENTIAL("Differential"),
    FULL("Full");
    private final static Map<String, UpdateEnum> CONSTANTS = new HashMap<String, UpdateEnum>();

    static {
        for (UpdateEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private final String value;

    UpdateEnum(String value) {
        this.value = value;
    }

    public static UpdateEnum fromValue(String value) {
        UpdateEnum constant = CONSTANTS.get(value);
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
