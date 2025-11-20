package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * Status of the operation
 */
public enum TariffChangeStatusEnum {

    ACCEPTED("Accepted"),
    REJECTED("Rejected"),
    TOO_MANY_ELEMENTS("TooManyElements"),
    CONDITION_NOT_SUPPORTED("ConditionNotSupported"),
    TX_NOT_FOUND("TxNotFound"),
    NO_CURRENCY_CHANGE("NoCurrencyChange");
    private final static Map<String, TariffChangeStatusEnum> CONSTANTS = new HashMap<String, TariffChangeStatusEnum>();

    static {
        for (TariffChangeStatusEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private final String value;

    TariffChangeStatusEnum(String value) {
        this.value = value;
    }

    public static TariffChangeStatusEnum fromValue(String value) {
        TariffChangeStatusEnum constant = CONSTANTS.get(value);
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
