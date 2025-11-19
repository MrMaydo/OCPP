package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * This contains the status of the log upload.
 */
public enum UploadLogStatusEnum {

    BAD_MESSAGE("BadMessage"),
    IDLE("Idle"),
    NOT_SUPPORTED_OPERATION("NotSupportedOperation"),
    PERMISSION_DENIED("PermissionDenied"),
    UPLOADED("Uploaded"),
    UPLOAD_FAILURE("UploadFailure"),
    UPLOADING("Uploading"),
    ACCEPTED_CANCELED("AcceptedCanceled");
    private final static Map<String, UploadLogStatusEnum> CONSTANTS = new HashMap<String, UploadLogStatusEnum>();

    static {
        for (UploadLogStatusEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private final String value;

    UploadLogStatusEnum(String value) {
        this.value = value;
    }

    public static UploadLogStatusEnum fromValue(String value) {
        UploadLogStatusEnum constant = CONSTANTS.get(value);
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
