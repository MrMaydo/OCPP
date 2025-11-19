package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * Type of cost: normal or the minimum or maximum cost.
 */
public enum TariffCostEnum {

    NORMAL_COST("NormalCost"),
    MIN_COST("MinCost"),
    MAX_COST("MaxCost");
    private final String value;
    private final static Map<String, TariffCostEnum> CONSTANTS = new HashMap<String, TariffCostEnum>();

    static {
        for (TariffCostEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    TariffCostEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static TariffCostEnum fromValue(String value) {
        TariffCostEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
