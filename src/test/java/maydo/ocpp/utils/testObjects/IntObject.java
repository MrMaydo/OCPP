package maydo.ocpp.utils.testObjects;

import java.util.Objects;

public class IntObject {

    private Integer intValue;

    public Integer getIntValue() {
        return intValue;
    }

    public void setIntValue(Integer intValue) {
        this.intValue = intValue;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (this.getClass() != obj.getClass()) {
            return false;
        }

        final IntObject other = (IntObject) obj;
        if (this.intValue.equals(other.intValue)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(intValue);
    }
}
