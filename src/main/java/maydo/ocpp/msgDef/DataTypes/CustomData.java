
package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.utils.JsonTools;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;


/**
 * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
 * 
 */
public class CustomData implements JsonInterface {

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

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject(){
        return JsonTools.toJsonObject(this);
    }
}
