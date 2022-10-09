package maydo.ocpp.utils.testObjects;

public enum TestEnum {

    STRING("string"),
    INTEGER("integer"),
    BOOLEAN("boolean");

    private final String value;

    TestEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
