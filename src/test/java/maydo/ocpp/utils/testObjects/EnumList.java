package maydo.ocpp.utils.testObjects;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class EnumList {

    private List<TestEnum> listValue = null;

    public List<TestEnum> getListValue() {
        return listValue;
    }

    public void setListValue(List<TestEnum> listValue) {
        this.listValue = listValue;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof EnumList))
            return false;

        EnumList enumList = (EnumList) o;

        return Objects.equals(listValue, enumList.listValue);
    }

    @Override
    public int hashCode() {
        return listValue != null ? listValue.hashCode() : 0;
    }
}
