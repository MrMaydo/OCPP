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
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }

        final DateObject other = (DateObject) obj;
        if (!Objects.equals(this.dateValue, other.dateValue)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateValue);
    }
}
