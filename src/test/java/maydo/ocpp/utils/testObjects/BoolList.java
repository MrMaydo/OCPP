package maydo.ocpp.utils.testObjects;

import java.util.List;
import java.util.Objects;

public class BoolList {

    private List<Boolean> listValue = null;

    public List<Boolean> getListValue() {
        return listValue;
    }

    public void setListValue(List<Boolean> listValue) {
        this.listValue = listValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoolList boolList = (BoolList) o;
        return Objects.equals(listValue, boolList.listValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listValue);
    }
}
