package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * Format of the message.
 */
public enum MessageFormatEnum {

    ASCII("ASCII"),
    HTML("HTML"),
    URI("URI"),
    UTF8("UTF8"),
    QRCODE("QRCODE");
    private final String value;
    private final static Map<String, MessageFormatEnum> CONSTANTS = new HashMap<String, MessageFormatEnum>();

    static {
        for (MessageFormatEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    MessageFormatEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static MessageFormatEnum fromValue(String value) {
        MessageFormatEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
