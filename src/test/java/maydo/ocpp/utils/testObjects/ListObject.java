package maydo.ocpp.utils.testObjects;

import java.util.List;
import java.util.Objects;

public class ListObject {

    private List<?> listValue = null;

    public List<?> getListValue() {
        return listValue;
    }

    public void setListValue(List<?> listValue) {
        this.listValue = listValue;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof ListObject))
            return false;

        ListObject that = (ListObject) o;

        return Objects.equals(listValue, that.listValue);
    }

    @Override
    public int hashCode() {
        return listValue != null ? listValue.hashCode() : 0;
    }
}
