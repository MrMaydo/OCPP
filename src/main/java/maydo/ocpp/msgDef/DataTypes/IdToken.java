
package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.Enumerations.IdTokenEnum;
import maydo.ocpp.msgDef.JsonInterface;

import java.util.List;
import javax.annotation.Generated;


/**
 * Contains a case insensitive identifier to use for the authorization and the type of authorization to support multiple forms of identifiers.
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class IdToken implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    private List<AdditionalInfo> additionalInfo = null;
    /**
     * IdToken is case insensitive. Might hold the hidden id of an RFID tag, but can for example also contain a UUID.
     * 
     * (Required)
     * 
     */
    private String idToken;
    /**
     * Enumeration of possible idToken types.
     * 
     * (Required)
     * 
     */
    private IdTokenEnum type;

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    public CustomData getCustomData() {
        return customData;
    }

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
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
     * 
     * (Required)
     * 
     */
    public String getIdToken() {
        return idToken;
    }

    /**
     * IdToken is case insensitive. Might hold the hidden id of an RFID tag, but can for example also contain a UUID.
     * 
     * (Required)
     * 
     */
    public void setIdToken(String idToken) {
        this.idToken = idToken;
    }

    /**
     * Enumeration of possible idToken types.
     * 
     * (Required)
     * 
     */
    public IdTokenEnum getType() {
        return type;
    }

    /**
     * Enumeration of possible idToken types.
     * 
     * (Required)
     * 
     */
    public void setType(IdTokenEnum type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonElement toJsonObject(){
        JsonElement jsonObject= new Gson().toJsonTree(this);
        return jsonObject;
    }
}
