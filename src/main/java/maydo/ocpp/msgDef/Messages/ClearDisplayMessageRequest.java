package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * This contains the field definition of the ClearDisplayMessageRequest PDU sent by the CSMS to the Charging Station.
 * The CSMS asks the Charging Station to clear a display message
 * that has been configured in the Charging Station to be cleared/removed.
 * See also O05 - Clear a Display Message.
 */
public class ClearDisplayMessageRequest implements JsonInterface {

    /**
     * Id of the message that SHALL be removed from the Charging Station.
     */
    @Required
    private Integer id;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public ClearDisplayMessageRequest() {
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public CustomData getCustomData() {
        return customData;
    }


    public void setCustomData(CustomData customData) {
        this.customData = customData;
    }

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject() {
        JsonObject json = new JsonObject();
        json.addProperty("id", id);
        json.add("customData", customData.toJsonObject());
        return json;
    }

    @Override
    public void fromString(String jsonString) {
        JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
        fromJsonObject(jsonObject);
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        if (jsonObject.has("id")) {
            setId(jsonObject.get("id").getAsInt());
        }

        if (jsonObject.has("customData")) {
            setCustomData(new CustomData());
            getCustomData().fromJsonObject(jsonObject.getAsJsonObject("customData"));
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof ClearDisplayMessageRequest))
            return false;
        ClearDisplayMessageRequest that = (ClearDisplayMessageRequest) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.id, that.id);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
        return result;
    }
}
