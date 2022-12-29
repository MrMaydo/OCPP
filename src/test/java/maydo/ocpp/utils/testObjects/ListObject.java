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
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }

        final ListObject other = (ListObject) obj;
        if (!Objects.equals(this.listValue, other.listValue)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(listValue);
    }
}
