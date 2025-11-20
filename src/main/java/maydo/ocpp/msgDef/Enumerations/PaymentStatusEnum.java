package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * The status of the settlement attempt.
 */
public enum PaymentStatusEnum {

    SETTLED("Settled"),
    CANCELED("Canceled"),
    REJECTED("Rejected"),
    FAILED("Failed");
    private final static Map<String, PaymentStatusEnum> CONSTANTS = new HashMap<String, PaymentStatusEnum>();

    static {
        for (PaymentStatusEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private final String value;

    PaymentStatusEnum(String value) {
        this.value = value;
    }

    public static PaymentStatusEnum fromValue(String value) {
        PaymentStatusEnum constant = CONSTANTS.get(value);
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
