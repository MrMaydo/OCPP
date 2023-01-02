package maydo.ocpp.utils.testObjects;

import maydo.ocpp.msgDef.Enumerations.VPNEnum;

import java.util.HashMap;
import java.util.Map;

public enum TestEnum {

    STRING("string"),
    INTEGER("integer"),
    BOOLEAN("boolean");

    private final String value;
    private final static Map<String, TestEnum> CONSTANTS = new HashMap<String, TestEnum>();

    static {
        for (TestEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }
    TestEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public static TestEnum fromValue(String value) {
        TestEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }
}
