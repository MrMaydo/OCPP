package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class DERCurvePoints implements JsonInterface {

    /**
     * The data value of the X-axis (independent) variable, depending on the curve type.
     * <p>
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private Float x;
    /**
     * The data value of the Y-axis (dependent) variable, depending on the  &lt;&lt;cmn_derunitenumtype&gt;&gt; of the curve. If _y_ is power factor, then a positive value means DER is absorbing reactive power (under-excited), a negative value when DER is injecting reactive power (over-excited).
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private Float y;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public DERCurvePoints() {
    }

    /**
     * @param x The data value of the X-axis (independent) variable, depending on the curve type.
     *          <p>
     *          <p>
     *          .
     * @param y The data value of the Y-axis (dependent) variable, depending on the  &lt;&lt;cmn_derunitenumtype&gt;&gt; of the curve. If _y_ is power factor, then a positive value means DER is absorbing reactive power (under-excited), a negative value when DER is injecting reactive power (over-excited).
     *          <p>
     *          .
     */
    public DERCurvePoints(Float x, Float y, CustomData customData) {
        super();
        this.x = x;
        this.y = y;
        this.customData = customData;
    }

    /**
     * The data value of the X-axis (independent) variable, depending on the curve type.
     * <p>
     * <p>
     * <p>
     * (Required)
     */
    public Float getX() {
        return x;
    }

    /**
     * The data value of the X-axis (independent) variable, depending on the curve type.
     * <p>
     * <p>
     * <p>
     * (Required)
     */
    public void setX(Float x) {
        this.x = x;
    }

    /**
     * The data value of the Y-axis (dependent) variable, depending on the  &lt;&lt;cmn_derunitenumtype&gt;&gt; of the curve. If _y_ is power factor, then a positive value means DER is absorbing reactive power (under-excited), a negative value when DER is injecting reactive power (over-excited).
     * <p>
     * <p>
     * (Required)
     */
    public Float getY() {
        return y;
    }

    /**
     * The data value of the Y-axis (dependent) variable, depending on the  &lt;&lt;cmn_derunitenumtype&gt;&gt; of the curve. If _y_ is power factor, then a positive value means DER is absorbing reactive power (under-excited), a negative value when DER is injecting reactive power (over-excited).
     * <p>
     * <p>
     * (Required)
     */
    public void setY(Float y) {
        this.y = y;
    }

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    public CustomData getCustomData() {
        return customData;
    }

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    public void setCustomData(CustomData customData) {
        this.customData = customData;
    }

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject() {
        return null;
    }

    @Override
    public void fromString(String jsonString) {
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof DERCurvePoints))
            return false;
        DERCurvePoints that = (DERCurvePoints) obj;
        return Objects.equals(this.x, that.x)
                && Objects.equals(this.y, that.y)
                && Objects.equals(this.customData, that.customData);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.x != null ? this.x.hashCode() : 0);
        result = 31 * result + (this.y != null ? this.y.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        return result;
    }
}
