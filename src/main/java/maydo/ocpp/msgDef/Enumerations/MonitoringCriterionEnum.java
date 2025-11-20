package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;

public enum MonitoringCriterionEnum {

    THRESHOLD_MONITORING("ThresholdMonitoring"),
    DELTA_MONITORING("DeltaMonitoring"),
    PERIODIC_MONITORING("PeriodicMonitoring");
    private final static Map<String, MonitoringCriterionEnum> CONSTANTS = new HashMap<String, MonitoringCriterionEnum>();

    static {
        for (MonitoringCriterionEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private final String value;

    MonitoringCriterionEnum(String value) {
        this.value = value;
    }

    public static MonitoringCriterionEnum fromValue(String value) {
        MonitoringCriterionEnum constant = CONSTANTS.get(value);
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
