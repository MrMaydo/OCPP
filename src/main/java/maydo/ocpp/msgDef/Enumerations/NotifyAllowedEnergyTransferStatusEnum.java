package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;

public enum NotifyAllowedEnergyTransferStatusEnum {

    ACCEPTED("Accepted"),
    REJECTED("Rejected");
    private final static Map<String, NotifyAllowedEnergyTransferStatusEnum> CONSTANTS = new HashMap<String, NotifyAllowedEnergyTransferStatusEnum>();

    static {
        for (NotifyAllowedEnergyTransferStatusEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private final String value;

    NotifyAllowedEnergyTransferStatusEnum(String value) {
        this.value = value;
    }

    public static NotifyAllowedEnergyTransferStatusEnum fromValue(String value) {
        NotifyAllowedEnergyTransferStatusEnum constant = CONSTANTS.get(value);
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
