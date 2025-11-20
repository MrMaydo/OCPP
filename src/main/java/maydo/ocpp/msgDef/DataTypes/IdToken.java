package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.List;
import java.util.Objects;

public class IdToken implements JsonInterface {

    private List<AdditionalInfo> additionalInfo;
    /**
     * *(2.1)* IdToken is case insensitive. Might hold the hidden id of an RFID tag, but can for example also contain a UUID.
     * <p>
     * (Required)
     */
    @Required
    private String idToken;
    /**
     * *(2.1)* Enumeration of possible idToken types. Values defined in Appendix as IdTokenEnumStringType.
     * <p>
     * (Required)
     */
    @Required
    private String type;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public IdToken() {
    }

    /**
     * @param idToken *(2.1)* IdToken is case insensitive. Might hold the hidden id of an RFID tag, but can for example also contain a UUID.
     *                .
     * @param type    *(2.1)* Enumeration of possible idToken types. Values defined in Appendix as IdTokenEnumStringType.
     *                .
     */
    public IdToken(List<AdditionalInfo> additionalInfo, String idToken, String type, CustomData customData) {
        super();
        this.additionalInfo = additionalInfo;
        this.idToken = idToken;
        this.type = type;
        this.customData = customData;
    }

    public List<AdditionalInfo> getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(List<AdditionalInfo> additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    /**
     * *(2.1)* IdToken is case insensitive. Might hold the hidden id of an RFID tag, but can for example also contain a UUID.
     * <p>
     * (Required)
     */
    public String getIdToken() {
        return idToken;
    }

    /**
     * *(2.1)* IdToken is case insensitive. Might hold the hidden id of an RFID tag, but can for example also contain a UUID.
     * <p>
     * (Required)
     */
    public void setIdToken(String idToken) {
        this.idToken = idToken;
    }

    /**
     * *(2.1)* Enumeration of possible idToken types. Values defined in Appendix as IdTokenEnumStringType.
     * <p>
     * (Required)
     */
    public String getType() {
        return type;
    }

    /**
     * *(2.1)* Enumeration of possible idToken types. Values defined in Appendix as IdTokenEnumStringType.
     * <p>
     * (Required)
     */
    public void setType(String type) {
        this.type = type;
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
        JsonObject json = new JsonObject();
        json.addProperty("idToken", idToken);
        json.addProperty("type", type);
        json.add("customData", customData.toJsonObject());
        return json;
    }

    @Override
    public void fromString(String jsonString) {
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        if (jsonObject.has("idToken")) {
            this.idToken = jsonObject.get("idToken").getAsString();
        }

        if (jsonObject.has("type")) {
            this.type = jsonObject.get("type").getAsString();
        }

        if (jsonObject.has("customData")) {
            this.customData = new CustomData();
            this.customData.fromJsonObject(jsonObject.getAsJsonObject("customData"));
        }

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof IdToken))
            return false;
        IdToken that = (IdToken) obj;
        return Objects.equals(this.additionalInfo, that.additionalInfo)
                && Objects.equals(this.idToken, that.idToken)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.additionalInfo != null ? this.additionalInfo.hashCode() : 0);
        result = 31 * result + (this.idToken != null ? this.idToken.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.type != null ? this.type.hashCode() : 0);
        return result;
    }
}
