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
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof IntObject))
            return false;

        IntObject intObject = (IntObject) o;

        return Objects.equals(intValue, intObject.intValue);
    }

    @Override
    public int hashCode() {
        return intValue != null ? intValue.hashCode() : 0;
    }
}
