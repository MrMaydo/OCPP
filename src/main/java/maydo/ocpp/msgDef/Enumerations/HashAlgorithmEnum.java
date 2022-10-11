package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * Used algorithms for the hashes provided.
 */
public enum HashAlgorithmEnum {

    SHA_256("SHA256"),
    SHA_384("SHA384"),
    SHA_512("SHA512");
    private final String value;
    private final static Map<String, HashAlgorithmEnum> CONSTANTS = new HashMap<String, HashAlgorithmEnum>();

    static {
        for (HashAlgorithmEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    HashAlgorithmEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static HashAlgorithmEnum fromValue(String value) {
        HashAlgorithmEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
