
package maydo.ocpp.msgDef.DataTypes;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;


/**
 * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
 * 
 */
@Generated("jsonschema2pojo")
public class CustomData {

    /**
     * 
     * (Required)
     * 
     */
    private String vendorId;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    public String getVendorId() {
        return vendorId;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
