
package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;


/**
 * Indicates whether the Local Controller succeeded in unpublishing the firmware.
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum UnpublishFirmwareStatusEnum {

    DOWNLOAD_ONGOING("DownloadOngoing"),
    NO_FIRMWARE("NoFirmware"),
    UNPUBLISHED("Unpublished");
    private final String value;
    private final static Map<String, UnpublishFirmwareStatusEnum> CONSTANTS = new HashMap<String, UnpublishFirmwareStatusEnum>();

    static {
        for (UnpublishFirmwareStatusEnum c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    UnpublishFirmwareStatusEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static UnpublishFirmwareStatusEnum fromValue(String value) {
        UnpublishFirmwareStatusEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
