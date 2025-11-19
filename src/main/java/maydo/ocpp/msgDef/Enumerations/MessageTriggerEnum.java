package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * Type of message to be triggered.
 */
public enum MessageTriggerEnum {

    BOOT_NOTIFICATION("BootNotification"),
    LOG_STATUS_NOTIFICATION("LogStatusNotification"),
    FIRMWARE_STATUS_NOTIFICATION("FirmwareStatusNotification"),
    HEARTBEAT("Heartbeat"),
    METER_VALUES("MeterValues"),
    SIGN_CHARGING_STATION_CERTIFICATE("SignChargingStationCertificate"),
    SIGN_V2G_CERTIFICATE("SignV2GCertificate"),
    SIGN_V2G_20_CERTIFICATE("SignV2G20Certificate"),
    STATUS_NOTIFICATION("StatusNotification"),
    TRANSACTION_EVENT("TransactionEvent"),
    SIGN_COMBINED_CERTIFICATE("SignCombinedCertificate"),
    PUBLISH_FIRMWARE_STATUS_NOTIFICATION("PublishFirmwareStatusNotification"),
    CUSTOM_TRIGGER("CustomTrigger");
    private final static Map<String, MessageTriggerEnum> CONSTANTS = new HashMap<String, MessageTriggerEnum>();

    static {
        for (MessageTriggerEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private final String value;

    MessageTriggerEnum(String value) {
        this.value = value;
    }

    public static MessageTriggerEnum fromValue(String value) {
        MessageTriggerEnum constant = CONSTANTS.get(value);
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
