package maydo.ocpp.utils.testObjects;

import java.util.List;
import java.util.Objects;

public class ComplexList {

    private List<ComplexObject> listValue = null;

    public List<ComplexObject> getListValue() {
        return listValue;
    }

    public void setListValue(List<ComplexObject> listValue) {
        this.listValue = listValue;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof ComplexList))
            return false;

        ComplexList that = (ComplexList) o;

        return Objects.equals(listValue, that.listValue);
    }

    @Override
    public int hashCode() {
        return listValue != null ? listValue.hashCode() : 0;
    }
}
