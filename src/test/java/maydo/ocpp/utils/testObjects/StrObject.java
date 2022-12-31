package maydo.ocpp.utils.testObjects;

import java.util.Objects;

public class StrObject {
    private String strValue;

    public String getStrValue() {
        return strValue;
    }

    public void setStrValue(String strValue) {
        this.strValue = strValue;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof StrObject))
            return false;

        StrObject strObject = (StrObject) o;

        return Objects.equals(strValue, strObject.strValue);
    }

    @Override
    public int hashCode() {
        return strValue != null ? strValue.hashCode() : 0;
    }
}
