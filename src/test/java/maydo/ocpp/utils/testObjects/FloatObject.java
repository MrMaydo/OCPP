package maydo.ocpp.utils.testObjects;

import java.util.Objects;

public class FloatObject {
    private Float floatValue;

    public Float getFloatValue() {
        return floatValue;
    }

    public void setFloatValue(Float floatValue) {
        this.floatValue = floatValue;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (this.getClass() != obj.getClass()) {
            return false;
        }

        final FloatObject other = (FloatObject) obj;
        if (Float.compare(this.floatValue, other.floatValue) != 0) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(floatValue);
    }
}
