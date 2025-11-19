package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * Data type of this variable.
 */
public enum DataEnum {

    STRING("string"),
    DECIMAL("decimal"),
    INTEGER("integer"),
    DATE_TIME("dateTime"),
    BOOLEAN("boolean"),
    OPTION_LIST("OptionList"),
    SEQUENCE_LIST("SequenceList"),
    MEMBER_LIST("MemberList");
    private final static Map<String, DataEnum> CONSTANTS = new HashMap<String, DataEnum>();

    static {
        for (DataEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private final String value;

    DataEnum(String value) {
        this.value = value;
    }

    public static DataEnum fromValue(String value) {
        DataEnum constant = CONSTANTS.get(value);
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
