package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;


/**
 * Contains a case insensitive identifier to use for the authorization and the type of authorization
 * to support multiple forms of identifiers.
 */
public class AdditionalInfo implements JsonInterface {

    /**
     * (2.1) This field specifies the additional IdToken.
     */
    @Required
    private String additionalIdToken;

    /**
     * additionalInfo can be used to send extra information to CSMS in addition to the regular authorization with IdToken.
     * AdditionalInfo contains one or more custom types, which need to be agreed upon by all parties involved.
     * When the type is not supported, the CSMS/Charging Station MAY ignore the additionalInfo.
     */
    @Required
    private String type;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public AdditionalInfo() {
    }


    public String getAdditionalIdToken() {
        return additionalIdToken;
    }


    public void setAdditionalIdToken(String additionalIdToken) {
        this.additionalIdToken = additionalIdToken;
    }


    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
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

        json.addProperty("additionalIdToken", getAdditionalIdToken());

        json.addProperty("type", getType());

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
        if (jsonObject.has("additionalIdToken")) {
            setAdditionalIdToken(jsonObject.get("additionalIdToken").getAsString());
        }

        if (jsonObject.has("type")) {
            setType(jsonObject.get("type").getAsString());
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
        if (!(obj instanceof AdditionalInfo))
            return false;
        AdditionalInfo that = (AdditionalInfo) obj;
        return Objects.equals(getAdditionalIdToken(), that.getAdditionalIdToken())
                && Objects.equals(getType(), that.getType())
                && Objects.equals(getCustomData(), that.getCustomData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getAdditionalIdToken(),
                getType(),
                getCustomData()
        );
    }
}
