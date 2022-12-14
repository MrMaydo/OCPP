package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.Objects;


/**
 * Contains a case insensitive identifier to use for the authorization and the type of authorization to support multiple forms of identifiers.
 */
public class AdditionalInfo implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
    /**
     * This field specifies the additional IdToken.
     * <p>
     * (Required)
     */
    @Required
    private String additionalIdToken;
    /**
     * This defines the type of the additionalIdToken. This is a custom type, so the implementation needs to be agreed upon by all involved parties.
     * <p>
     * (Required)
     */
    @Required
    private String type;

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

    /**
     * This field specifies the additional IdToken.
     * <p>
     * (Required)
     */
    public String getAdditionalIdToken() {
        return additionalIdToken;
    }

    /**
     * This field specifies the additional IdToken.
     * <p>
     * (Required)
     */
    public void setAdditionalIdToken(String additionalIdToken) {
        this.additionalIdToken = additionalIdToken;
    }

    /**
     * This defines the type of the additionalIdToken. This is a custom type, so the implementation needs to be agreed upon by all involved parties.
     * <p>
     * (Required)
     */
    public String getType() {
        return type;
    }

    /**
     * This defines the type of the additionalIdToken. This is a custom type, so the implementation needs to be agreed upon by all involved parties.
     * <p>
     * (Required)
     */
    public void setType(String type) {
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
        if (!(obj instanceof AdditionalInfo))
            return false;
        AdditionalInfo that = (AdditionalInfo) obj;
        return Objects.equals(customData, that.customData)
                && Objects.equals(additionalIdToken, that.additionalIdToken)
                && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        int result =  (additionalIdToken != null ? additionalIdToken.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (customData != null ? customData.hashCode() : 0);
        return result;
    }
}
