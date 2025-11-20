package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
 */
public class CustomData implements JsonInterface {

    /**
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
     * (Required)
     */
    public String getVendorId() {
        return vendorId;
    }

    /**
     * (Required)
     */
    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject() {
        JsonObject json = new JsonObject();
        json.addProperty("vendorId", vendorId);
        return json;
    }

    @Override
    public void fromString(String jsonString) {
        JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
        fromJsonObject(jsonObject);
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        if (jsonObject.has("vendorId")) {
            this.vendorId = jsonObject.get("vendorId").getAsString();
        }

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
