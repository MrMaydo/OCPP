package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * This contains the field definition of the GetLocalListVersionResponse PDU sent by
 * the Charging Station to CSMS in response to a GetLocalListVersionRequest.
 */
public class GetLocalListVersionResponse implements JsonInterface {

    /**
     * This contains the current version number of the local authorization list in the Charging Station.
     */
    @Required
    private Integer versionNumber;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public GetLocalListVersionResponse() {
    }


    public Integer getVersionNumber() {
        return versionNumber;
    }


    public void setVersionNumber(Integer versionNumber) {
        this.versionNumber = versionNumber;
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

        json.addProperty("versionNumber", getVersionNumber());

        if (getCustomData() != null) {
            json.add("customData", getCustomData().toJsonObject());
        }

        return json;
    }

    @Override
    public void fromString(String jsonString) {
        JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
        fromJsonObject(jsonObject);
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        if (jsonObject.has("versionNumber")) {
            setVersionNumber(jsonObject.get("versionNumber").getAsInt());
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
        if (!(obj instanceof GetLocalListVersionResponse))
            return false;
        GetLocalListVersionResponse that = (GetLocalListVersionResponse) obj;
        return Objects.equals(this.versionNumber, that.versionNumber)
                && Objects.equals(this.customData, that.customData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getVersionNumber(),
                getCustomData()
        );
    }
}
