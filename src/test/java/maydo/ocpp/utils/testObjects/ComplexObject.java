package maydo.ocpp.utils.testObjects;

import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class ComplexObject {
    @Required
    IntObject intObject;
    @Required
    StrObject strObject;
    @Optional
    DateObject dateObject;
    @Optional
    ListObject listObject;

    public IntObject getIntObject() {
        return intObject;
    }

    public void setIntObject(IntObject intObject) {
        this.intObject = intObject;
    }

    public StrObject getStrObject() {
        return strObject;
    }

    public void setStrObject(StrObject strObject) {
        this.strObject = strObject;
    }

    public DateObject getDateObject() {
        return dateObject;
    }

    public void setDateObject(DateObject dateObject) {
        this.dateObject = dateObject;
    }

    public ListObject getListObject() {
        return listObject;
    }

    public void setListObject(ListObject listObject) {
        this.listObject = listObject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComplexObject that = (ComplexObject) o;
        return Objects.equals(intObject, that.intObject) && Objects.equals(strObject, that.strObject) && Objects.equals(dateObject, that.dateObject) && Objects.equals(listObject, that.listObject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(intObject, strObject, dateObject, listObject);
    }
}
