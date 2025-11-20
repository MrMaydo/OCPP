package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * This field specifies the report base.
 */
public enum ReportBaseEnum {

    CONFIGURATION_INVENTORY("ConfigurationInventory"),
    FULL_INVENTORY("FullInventory"),
    SUMMARY_INVENTORY("SummaryInventory");
    private final static Map<String, ReportBaseEnum> CONSTANTS = new HashMap<String, ReportBaseEnum>();

    static {
        for (ReportBaseEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private final String value;

    ReportBaseEnum(String value) {
        this.value = value;
    }

    public static ReportBaseEnum fromValue(String value) {
        ReportBaseEnum constant = CONSTANTS.get(value);
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
