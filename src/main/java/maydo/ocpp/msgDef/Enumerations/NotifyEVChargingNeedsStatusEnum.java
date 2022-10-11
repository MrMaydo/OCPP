package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * Returns whether the CSMS has been able to process the message successfully. It does not imply that the evChargingNeeds can be met with the current charging profile.
 */
public enum NotifyEVChargingNeedsStatusEnum {

    ACCEPTED("Accepted"),
    REJECTED("Rejected"),
    PROCESSING("Processing");
    private final String value;
    private final static Map<String, NotifyEVChargingNeedsStatusEnum> CONSTANTS = new HashMap<String, NotifyEVChargingNeedsStatusEnum>();

    static {
        for (NotifyEVChargingNeedsStatusEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    NotifyEVChargingNeedsStatusEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static NotifyEVChargingNeedsStatusEnum fromValue(String value) {
        NotifyEVChargingNeedsStatusEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
