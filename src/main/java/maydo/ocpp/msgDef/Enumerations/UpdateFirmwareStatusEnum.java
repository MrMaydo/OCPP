package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * This field indicates whether the Charging Station was able to accept the request.
 */
public enum UpdateFirmwareStatusEnum {

    ACCEPTED("Accepted"),
    REJECTED("Rejected"),
    ACCEPTED_CANCELED("AcceptedCanceled"),
    INVALID_CERTIFICATE("InvalidCertificate"),
    REVOKED_CERTIFICATE("RevokedCertificate");
    private final static Map<String, UpdateFirmwareStatusEnum> CONSTANTS = new HashMap<String, UpdateFirmwareStatusEnum>();

    static {
        for (UpdateFirmwareStatusEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private final String value;

    UpdateFirmwareStatusEnum(String value) {
        this.value = value;
    }

    public static UpdateFirmwareStatusEnum fromValue(String value) {
        UpdateFirmwareStatusEnum constant = CONSTANTS.get(value);
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
