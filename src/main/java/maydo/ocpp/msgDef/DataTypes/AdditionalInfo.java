
package maydo.ocpp.msgDef.DataTypes;

import javax.annotation.Generated;


/**
 * Contains a case insensitive identifier to use for the authorization and the type of authorization to support multiple forms of identifiers.
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class AdditionalInfo {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * This field specifies the additional IdToken.
     * 
     * (Required)
     * 
     */
    private String additionalIdToken;
    /**
     * This defines the type of the additionalIdToken. This is a custom type, so the implementation needs to be agreed upon by all involved parties.
     * 
     * (Required)
     * 
     */
    private String type;

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

    /**
     * This field specifies the additional IdToken.
     * 
     * (Required)
     * 
     */
    public String getAdditionalIdToken() {
        return additionalIdToken;
    }

    /**
     * This field specifies the additional IdToken.
     * 
     * (Required)
     * 
     */
    public void setAdditionalIdToken(String additionalIdToken) {
        this.additionalIdToken = additionalIdToken;
    }

    /**
     * This defines the type of the additionalIdToken. This is a custom type, so the implementation needs to be agreed upon by all involved parties.
     * 
     * (Required)
     * 
     */
    public String getType() {
        return type;
    }

    /**
     * This defines the type of the additionalIdToken. This is a custom type, so the implementation needs to be agreed upon by all involved parties.
     * 
     * (Required)
     * 
     */
    public void setType(String type) {
        this.type = type;
    }

}
