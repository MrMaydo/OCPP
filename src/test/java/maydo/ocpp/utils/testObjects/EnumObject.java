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
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }

        final EnumObject other = (EnumObject) obj;
        if (!Objects.equals(this.enumValue, other.enumValue)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(enumValue);
    }
}
