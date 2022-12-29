package maydo.ocpp.utils.testObjects;

import java.util.List;
import java.util.Objects;

public class StrList {

    private List<String> listValue = null;

    public List<String> getListValue() {
        return listValue;
    }

    public void setListValue(List<String> listValue) {
        this.listValue = listValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StrList strList = (StrList) o;
        return Objects.equals(listValue, strList.listValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listValue);
    }
}
