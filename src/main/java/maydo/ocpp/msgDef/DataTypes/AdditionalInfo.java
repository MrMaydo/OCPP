package maydo.ocpp.msgDef.DataTypes;

import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * Contains a case insensitive identifier to use for the authorization and the type of authorization to support multiple forms of identifiers.
 * 
 * 
 */
public class AdditionalInfo {

    /**
     * *(2.1)* This field specifies the additional IdToken.
     * 
     * (Required)
     */
    @Required
    private String additionalIdToken;
    /**
     * _additionalInfo_ can be used to send extra information to CSMS in addition to the regular authorization with _IdToken_. _AdditionalInfo_ contains one or more custom _types_, which need to be agreed upon by all parties involved. When the _type_ is not supported, the CSMS/Charging Station MAY ignore the _additionalInfo_.
     * 
     * 
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
    public AdditionalInfo() {
    }

    /**
     * 
     * @param additionalIdToken
     *     *(2.1)* This field specifies the additional IdToken.
     *     .
     * @param type
     *     _additionalInfo_ can be used to send extra information to CSMS in addition to the regular authorization with _IdToken_. _AdditionalInfo_ contains one or more custom _types_, which need to be agreed upon by all parties involved. When the _type_ is not supported, the CSMS/Charging Station MAY ignore the _additionalInfo_.
     *     
     *     .
     */
    public AdditionalInfo(String additionalIdToken, String type, CustomData customData) {
        super();
        this.additionalIdToken = additionalIdToken;
        this.type = type;
        this.customData = customData;
    }

    /**
     * *(2.1)* This field specifies the additional IdToken.
     * 
     * (Required)
     */
    public String getAdditionalIdToken() {
        return additionalIdToken;
    }

    /**
     * *(2.1)* This field specifies the additional IdToken.
     * 
     * (Required)
     */
    public void setAdditionalIdToken(String additionalIdToken) {
        this.additionalIdToken = additionalIdToken;
    }

    /**
     * _additionalInfo_ can be used to send extra information to CSMS in addition to the regular authorization with _IdToken_. _AdditionalInfo_ contains one or more custom _types_, which need to be agreed upon by all parties involved. When the _type_ is not supported, the CSMS/Charging Station MAY ignore the _additionalInfo_.
     * 
     * 
     * (Required)
     */
    public String getType() {
        return type;
    }

    /**
     * _additionalInfo_ can be used to send extra information to CSMS in addition to the regular authorization with _IdToken_. _AdditionalInfo_ contains one or more custom _types_, which need to be agreed upon by all parties involved. When the _type_ is not supported, the CSMS/Charging Station MAY ignore the _additionalInfo_.
     * 
     * 
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
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof AdditionalInfo))
            return false;
        AdditionalInfo that = (AdditionalInfo) obj;
        return Objects.equals(this.additionalIdToken, that.additionalIdToken)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.additionalIdToken != null ? this.additionalIdToken.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.type != null ? this.type.hashCode() : 0);
        return result;
    }
}
