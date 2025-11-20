package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * The kind of cost referred to in the message element amount
 */
public enum CostKindEnum {

    CARBON_DIOXIDE_EMISSION("CarbonDioxideEmission"),
    RELATIVE_PRICE_PERCENTAGE("RelativePricePercentage"),
    RENEWABLE_GENERATION_PERCENTAGE("RenewableGenerationPercentage");
    private final static Map<String, CostKindEnum> CONSTANTS = new HashMap<String, CostKindEnum>();

    static {
        for (CostKindEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private final String value;

    CostKindEnum(String value) {
        this.value = value;
    }

    public static CostKindEnum fromValue(String value) {
        CostKindEnum constant = CONSTANTS.get(value);
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
