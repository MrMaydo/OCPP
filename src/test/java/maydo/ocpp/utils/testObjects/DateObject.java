package maydo.ocpp.utils.testObjects;

import java.util.Date;
import java.util.Objects;

public class DateObject {
    private Date dateValue;

    public Date getDateValue() {
        return dateValue;
    }

    public void setDateValue(Date dateValue) {
        this.dateValue = dateValue;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof DateObject))
            return false;

        DateObject that = (DateObject) o;

        return Objects.equals(dateValue, that.dateValue);
    }

    @Override
    public int hashCode() {
        return dateValue != null ? dateValue.hashCode() : 0;
    }
}
