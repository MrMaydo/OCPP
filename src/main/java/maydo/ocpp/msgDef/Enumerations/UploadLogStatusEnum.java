
package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;


/**
 * This contains the status of the log upload.
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum UploadLogStatusEnum {

    BAD_MESSAGE("BadMessage"),
    IDLE("Idle"),
    NOT_SUPPORTED_OPERATION("NotSupportedOperation"),
    PERMISSION_DENIED("PermissionDenied"),
    UPLOADED("Uploaded"),
    UPLOAD_FAILURE("UploadFailure"),
    UPLOADING("Uploading"),
    ACCEPTED_CANCELED("AcceptedCanceled");
    private final String value;
    private final static Map<String, UploadLogStatusEnum> CONSTANTS = new HashMap<String, UploadLogStatusEnum>();

    static {
        for (UploadLogStatusEnum c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    UploadLogStatusEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static UploadLogStatusEnum fromValue(String value) {
        UploadLogStatusEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
