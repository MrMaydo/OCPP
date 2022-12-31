package maydo.ocpp.utils.testObjects;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class DateList {

    private List<Date> listValue = null;

    public List<Date> getListValue() {
        return listValue;
    }

    public void setListValue(List<Date> listValue) {
        this.listValue = listValue;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof DateList))
            return false;

        DateList dateList = (DateList) o;

        return Objects.equals(listValue, dateList.listValue);
    }

    @Override
    public int hashCode() {
        return listValue != null ? listValue.hashCode() : 0;
    }
}
