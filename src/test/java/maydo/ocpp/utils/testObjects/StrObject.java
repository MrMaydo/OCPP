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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (this.getClass() != obj.getClass()) {
            return false;
        }

        final StrObject other = (StrObject) obj;
        if (this.strValue.equals(other.strValue)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(strValue);
    }
}
