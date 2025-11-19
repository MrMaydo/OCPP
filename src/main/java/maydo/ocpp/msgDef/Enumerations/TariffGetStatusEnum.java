package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * Status of operation
 */
public enum TariffGetStatusEnum {

    ACCEPTED("Accepted"),
    REJECTED("Rejected"),
    NO_TARIFF("NoTariff");
    private final String value;
    private final static Map<String, TariffGetStatusEnum> CONSTANTS = new HashMap<String, TariffGetStatusEnum>();

    static {
        for (TariffGetStatusEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    TariffGetStatusEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static TariffGetStatusEnum fromValue(String value) {
        TariffGetStatusEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
