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
    public int hashCode() {
        return Objects.hash(boolValue);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (this.getClass() != obj.getClass()) {
            return false;
        }

        final BoolObject other = (BoolObject) obj;
        if (this.boolValue.equals(other.boolValue)) {
            return false;
        }

        return true;
    }
}
