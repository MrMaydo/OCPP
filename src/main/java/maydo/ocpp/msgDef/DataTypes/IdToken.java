package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.Enumerations.IdTokenEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.List;
import java.util.Objects;


/**
 * Contains a case insensitive identifier to use for the authorization and the type of authorization to support multiple forms of identifiers.
 */
public class IdToken implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    @Optional
    private List<AdditionalInfo> additionalInfo = null;
    /**
     * IdToken is case insensitive. Might hold the hidden id of an RFID tag, but can for example also contain a UUID.
     * <p>
     * (Required)
     */
    @Required
    private String idToken;
    /**
     * Enumeration of possible idToken types.
     * <p>
     * (Required)
     */
    @Required
    private IdTokenEnum type;

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

    public List<AdditionalInfo> getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(List<AdditionalInfo> additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    /**
     * IdToken is case insensitive. Might hold the hidden id of an RFID tag, but can for example also contain a UUID.
     * <p>
     * (Required)
     */
    public String getIdToken() {
        return idToken;
    }

    /**
     * IdToken is case insensitive. Might hold the hidden id of an RFID tag, but can for example also contain a UUID.
     * <p>
     * (Required)
     */
    public void setIdToken(String idToken) {
        this.idToken = idToken;
    }

    /**
     * Enumeration of possible idToken types.
     * <p>
     * (Required)
     */
    public IdTokenEnum getType() {
        return type;
    }

    /**
     * Enumeration of possible idToken types.
     * <p>
     * (Required)
     */
    public void setType(IdTokenEnum type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject() {
        return JsonTools.toJsonObject(this);
    }

    @Override
    public void fromString(String jsonString) {
        JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
        fromJsonObject(jsonObject);
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        JsonTools.fromJsonObject(this, jsonObject);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof IdToken))
            return false;
        IdToken that = (IdToken) obj;
        return Objects.equals(customData, that.customData)
                && Objects.equals(additionalInfo, that.additionalInfo)
                && Objects.equals(idToken, that.idToken)
                && type == that.type;
    }

    @Override
    public int hashCode() {
        int result = (additionalInfo != null ? additionalInfo.hashCode() : 0);
        result = 31 * result + (idToken != null ? idToken.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (customData != null ? customData.hashCode() : 0);
        return result;
    }
}
