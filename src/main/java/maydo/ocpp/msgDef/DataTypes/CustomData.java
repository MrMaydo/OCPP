package maydo.ocpp.msgDef.DataTypes;

import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
 * 
 */
public class CustomData {

    /**
     * 
     * (Required)
     */
    @Required
    private String vendorId;

    /**
     * No args constructor for use in serialization
     */
    public CustomData() {
    }

    public CustomData(String vendorId) {
        super();
        this.vendorId = vendorId;
    }

    /**
     * 
     * (Required)
     */
    public String getVendorId() {
        return vendorId;
    }

    /**
     * 
     * (Required)
     */
    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof CustomData))
            return false;
        CustomData that = (CustomData) obj;
        return Objects.equals(this.vendorId, that.vendorId);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.vendorId != null ? this.vendorId.hashCode() : 0);
        return result;
    }
}
