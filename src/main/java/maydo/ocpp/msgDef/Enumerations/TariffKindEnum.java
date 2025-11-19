package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * Kind of tariff (driver/default)
 */
public enum TariffKindEnum {

    DEFAULT_TARIFF("DefaultTariff"),
    DRIVER_TARIFF("DriverTariff");
    private final String value;
    private final static Map<String, TariffKindEnum> CONSTANTS = new HashMap<String, TariffKindEnum>();

    static {
        for (TariffKindEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    TariffKindEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static TariffKindEnum fromValue(String value) {
        TariffKindEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
