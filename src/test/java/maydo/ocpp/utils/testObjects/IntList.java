package maydo.ocpp.utils.testObjects;

import java.util.List;
import java.util.Objects;

public class IntList {

    private List<Integer> listValue = null;

    public List<Integer> getListValue() {
        return listValue;
    }

    public void setListValue(List<Integer> listValue) {
        this.listValue = listValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntList intList = (IntList) o;
        return Objects.equals(listValue, intList.listValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listValue);
    }
}
