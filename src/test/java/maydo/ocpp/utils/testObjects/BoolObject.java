package maydo.ocpp.utils.testObjects;

import java.util.Objects;

public class BoolObject {
    private Boolean boolValue;

    public Boolean getBoolValue() {
        return boolValue;
    }

    public void setBoolValue(Boolean boolValue) {
        this.boolValue = boolValue;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof BoolObject))
            return false;

        BoolObject that = (BoolObject) o;

        return Objects.equals(boolValue, that.boolValue);
    }

    @Override
    public int hashCode() {
        return boolValue != null ? boolValue.hashCode() : 0;
    }
}
