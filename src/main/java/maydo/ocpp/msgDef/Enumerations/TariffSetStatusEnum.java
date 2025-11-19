package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;

public enum TariffSetStatusEnum {

    ACCEPTED("Accepted"),
    REJECTED("Rejected"),
    TOO_MANY_ELEMENTS("TooManyElements"),
    CONDITION_NOT_SUPPORTED("ConditionNotSupported"),
    DUPLICATE_TARIFF_ID("DuplicateTariffId");
    private final String value;
    private final static Map<String, TariffSetStatusEnum> CONSTANTS = new HashMap<String, TariffSetStatusEnum>();

    static {
        for (TariffSetStatusEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    TariffSetStatusEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static TariffSetStatusEnum fromValue(String value) {
        TariffSetStatusEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
