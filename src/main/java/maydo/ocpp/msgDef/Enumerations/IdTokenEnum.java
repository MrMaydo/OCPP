package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * Enumeration of possible idToken types.
 */
public enum IdTokenEnum {

    CENTRAL("Central"),
    E_MAID("eMAID"),
    ISO_14443("ISO14443"),
    ISO_15693("ISO15693"),
    KEY_CODE("KeyCode"),
    LOCAL("Local"),
    MAC_ADDRESS("MacAddress"),
    NO_AUTHORIZATION("NoAuthorization");
    private final String value;
    private final static Map<String, IdTokenEnum> CONSTANTS = new HashMap<String, IdTokenEnum>();

    static {
        for (IdTokenEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    IdTokenEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static IdTokenEnum fromValue(String value) {
        IdTokenEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
