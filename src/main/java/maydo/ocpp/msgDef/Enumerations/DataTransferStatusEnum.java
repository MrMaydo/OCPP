package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * This indicates the success or failure of the data transfer.
 */
public enum DataTransferStatusEnum {

    ACCEPTED("Accepted"),
    REJECTED("Rejected"),
    UNKNOWN_MESSAGE_ID("UnknownMessageId"),
    UNKNOWN_VENDOR_ID("UnknownVendorId");
    private final String value;
    private final static Map<String, DataTransferStatusEnum> CONSTANTS = new HashMap<String, DataTransferStatusEnum>();

    static {
        for (DataTransferStatusEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    DataTransferStatusEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static DataTransferStatusEnum fromValue(String value) {
        DataTransferStatusEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
