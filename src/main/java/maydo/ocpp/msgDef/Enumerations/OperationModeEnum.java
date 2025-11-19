package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * *(2.1)* The _operationMode_ that is currently in effect for the transaction.
 */
public enum OperationModeEnum {

    IDLE("Idle"),
    CHARGING_ONLY("ChargingOnly"),
    CENTRAL_SETPOINT("CentralSetpoint"),
    EXTERNAL_SETPOINT("ExternalSetpoint"),
    EXTERNAL_LIMITS("ExternalLimits"),
    CENTRAL_FREQUENCY("CentralFrequency"),
    LOCAL_FREQUENCY("LocalFrequency"),
    LOCAL_LOAD_BALANCING("LocalLoadBalancing");
    private final String value;
    private final static Map<String, OperationModeEnum> CONSTANTS = new HashMap<String, OperationModeEnum>();

    static {
        for (OperationModeEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    OperationModeEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static OperationModeEnum fromValue(String value) {
        OperationModeEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
