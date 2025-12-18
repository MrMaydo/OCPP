package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Contains a case insensitive identifier to use for the authorization
 * and the type of authorization to support multiple forms of identifiers.
 */
public class IdToken implements JsonInterface {

    /**
     * AdditionalInfo can be used to send extra information which can be validated by the CSMS in addition to
     * the regular authorization with IdToken.  AdditionalInfo contains one or more custom types,
     * which need to be agreed upon by all parties involved.
     * When AdditionalInfo is NOT implemented or a not supported AdditionalInfo.type is used,
     * the CSMS/Charging Station MAY ignore the AdditionalInfo.
     */
    private List<AdditionalInfo> additionalInfo;

    /**
     * (2.1) IdToken is case insensitive. Might hold the hidden id of an RFID tag, but can for example also contain a UUID.
     */
    @Required
    private String idToken;

    /**
     * (2.1) Enumeration of possible idToken types. Values defined in Appendix as IdTokenEnumStringType.
     */
    @Required
    private String type;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public IdToken() {
    }


    public List<AdditionalInfo> getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(List<AdditionalInfo> additionalInfo) {
        this.additionalInfo = additionalInfo;
    }


    public String getIdToken() {
        return idToken;
    }


    public void setIdToken(String idToken) {
        this.idToken = idToken;
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

        JsonArray additionalInfoArray = new JsonArray();
        for (AdditionalInfo item : getAdditionalInfo()) {
            additionalInfoArray.add(item.toJsonObject());
        }
        json.add("additionalInfo", additionalInfoArray);

        json.addProperty("idToken", getIdToken());

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
        if (jsonObject.has("additionalInfo")) {
            setAdditionalInfo(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("additionalInfo");
            for (JsonElement el : arr) {
                AdditionalInfo item = new AdditionalInfo();
                item.fromJsonObject(el.getAsJsonObject());
                getAdditionalInfo().add(item);
            }
        }

        if (jsonObject.has("idToken")) {
            setIdToken(jsonObject.get("idToken").getAsString());
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
        if (!(obj instanceof IdToken))
            return false;
        IdToken that = (IdToken) obj;
        return Objects.equals(getAdditionalInfo(), that.getAdditionalInfo())
                && Objects.equals(getIdToken(), that.getIdToken())
                && Objects.equals(getType(), that.getType())
                && Objects.equals(getCustomData(), that.getCustomData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getAdditionalInfo(),
                getIdToken(),
                getType(),
                getCustomData()
        );
    }
}
