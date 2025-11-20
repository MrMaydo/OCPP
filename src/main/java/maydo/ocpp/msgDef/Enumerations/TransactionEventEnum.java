package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * This contains the type of this event.
 * The first TransactionEvent of a transaction SHALL contain: "Started" The last TransactionEvent of a transaction SHALL contain: "Ended" All others SHALL contain: "Updated"
 */
public enum TransactionEventEnum {

    ENDED("Ended"),
    STARTED("Started"),
    UPDATED("Updated");
    private final static Map<String, TransactionEventEnum> CONSTANTS = new HashMap<String, TransactionEventEnum>();

    static {
        for (TransactionEventEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private final String value;

    TransactionEventEnum(String value) {
        this.value = value;
    }

    public static TransactionEventEnum fromValue(String value) {
        TransactionEventEnum constant = CONSTANTS.get(value);
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
