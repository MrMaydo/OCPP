package maydo.ocpp.utils.testObjects;

import maydo.ocpp.msgDef.DataTypes.AdditionalInfo;
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
        if (this == o)
            return true;
        if (!(o instanceof ComplexObject))
            return false;

        ComplexObject that = (ComplexObject) o;

        if (!Objects.equals(intObject, that.intObject)) return false;
        if (!Objects.equals(strObject, that.strObject)) return false;
        if (!Objects.equals(dateObject, that.dateObject)) return false;
        return Objects.equals(listObject, that.listObject);
    }

    @Override
    public int hashCode() {
        int result = intObject != null ? intObject.hashCode() : 0;
        result = 31 * result + (strObject != null ? strObject.hashCode() : 0);
        result = 31 * result + (dateObject != null ? dateObject.hashCode() : 0);
        result = 31 * result + (listObject != null ? listObject.hashCode() : 0);
        return result;
    }
}
