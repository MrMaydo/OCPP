
package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;


/**
 * This contains the progress status of the publishfirmware
 * installation.
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum PublishFirmwareStatusEnum {

    IDLE("Idle"),
    DOWNLOAD_SCHEDULED("DownloadScheduled"),
    DOWNLOADING("Downloading"),
    DOWNLOADED("Downloaded"),
    PUBLISHED("Published"),
    DOWNLOAD_FAILED("DownloadFailed"),
    DOWNLOAD_PAUSED("DownloadPaused"),
    INVALID_CHECKSUM("InvalidChecksum"),
    CHECKSUM_VERIFIED("ChecksumVerified"),
    PUBLISH_FAILED("PublishFailed");
    private final String value;
    private final static Map<String, PublishFirmwareStatusEnum> CONSTANTS = new HashMap<String, PublishFirmwareStatusEnum>();

    static {
        for (PublishFirmwareStatusEnum c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    PublishFirmwareStatusEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static PublishFirmwareStatusEnum fromValue(String value) {
        PublishFirmwareStatusEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
