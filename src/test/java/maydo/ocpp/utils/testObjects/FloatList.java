package maydo.ocpp.utils.testObjects;

import java.util.List;
import java.util.Objects;

public class FloatList {

    private List<Float> listValue = null;

    public List<Float> getListValue() {
        return listValue;
    }

    public void setListValue(List<Float> listValue) {
        this.listValue = listValue;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof FloatList))
            return false;

        FloatList floatList = (FloatList) o;

        return Objects.equals(listValue, floatList.listValue);
    }

    @Override
    public int hashCode() {
        return listValue != null ? listValue.hashCode() : 0;
    }
}
