package maydo.ocpp.utils.testObjects;

import java.util.Objects;

public class EnumObject {

    private TestEnum enumValue = null;

    public TestEnum getEnumValue() {
        return enumValue;
    }

    public void setEnumValue(TestEnum enumValue) {
        this.enumValue = enumValue;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof EnumObject))
            return false;

        EnumObject that = (EnumObject) o;

        return enumValue == that.enumValue;
    }

    @Override
    public int hashCode() {
        return enumValue != null ? enumValue.hashCode() : 0;
    }
}
