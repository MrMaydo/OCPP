package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;


/**
 * A CustomData element exists as an optional element in the JSON schemas of all types.
 * CustomData is the only class in the JSON schema files that allows additional properties.
 * It can thus be used to add additional custom attributes to any type.
 * The CustomData has been deliberately left out of the specification document,
 * because it would introduce a lot of clutter and it is not meant to be used in standard implementations.
 * See also [OCPP2.1-PART4].
 */
public class CustomData implements JsonInterface {

    /**
     *
     */
    @Required
    private String vendorId;


    public CustomData() {
    }


    public String getVendorId() {
        return vendorId;
    }


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

        json.addProperty("vendorId", getVendorId());


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
            setVendorId(jsonObject.get("vendorId").getAsString());
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
        return Objects.hash(getVendorId());
    }
}
