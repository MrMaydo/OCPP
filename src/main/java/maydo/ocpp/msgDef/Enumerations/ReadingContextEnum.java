package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * Type of detail value: start, end or sample. Default = "Sample.Periodic"
 */
public enum ReadingContextEnum {

    INTERRUPTION_BEGIN("Interruption.Begin"),
    INTERRUPTION_END("Interruption.End"),
    OTHER("Other"),
    SAMPLE_CLOCK("Sample.Clock"),
    SAMPLE_PERIODIC("Sample.Periodic"),
    TRANSACTION_BEGIN("Transaction.Begin"),
    TRANSACTION_END("Transaction.End"),
    TRIGGER("Trigger");
    private final String value;
    private final static Map<String, ReadingContextEnum> CONSTANTS = new HashMap<String, ReadingContextEnum>();

    static {
        for (ReadingContextEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ReadingContextEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static ReadingContextEnum fromValue(String value) {
        ReadingContextEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
