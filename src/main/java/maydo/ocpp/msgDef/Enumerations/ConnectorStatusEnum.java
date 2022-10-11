package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * This contains the current status of the Connector.
 */
public enum ConnectorStatusEnum {

    AVAILABLE("Available"),
    OCCUPIED("Occupied"),
    RESERVED("Reserved"),
    UNAVAILABLE("Unavailable"),
    FAULTED("Faulted");
    private final String value;
    private final static Map<String, ConnectorStatusEnum> CONSTANTS = new HashMap<String, ConnectorStatusEnum>();

    static {
        for (ConnectorStatusEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ConnectorStatusEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static ConnectorStatusEnum fromValue(String value) {
        ConnectorStatusEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
