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
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof FloatObject))
            return false;

        FloatObject that = (FloatObject) o;

        return Objects.equals(floatValue, that.floatValue);
    }

    @Override
    public int hashCode() {
        return floatValue != null ? floatValue.hashCode() : 0;
    }
}
