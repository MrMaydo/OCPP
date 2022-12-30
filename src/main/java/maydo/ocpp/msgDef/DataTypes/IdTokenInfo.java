package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.Enumerations.AuthorizationStatusEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.Date;
import java.util.List;
import java.util.Objects;


/**
 * ID_ Token
 * urn:x-oca:ocpp:uid:2:233247
 * Contains status information about an identifier.
 * It is advised to not stop charging for a token that expires during charging, as ExpiryDate is only used for caching purposes. If ExpiryDate is not given, the status has no end date.
 */
public class IdTokenInfo implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
    /**
     * ID_ Token. Status. Authorization_ Status
     * urn:x-oca:ocpp:uid:1:569372
     * Current status of the ID Token.
     * <p>
     * (Required)
     */
    @Required
    private AuthorizationStatusEnum status;
    /**
     * ID_ Token. Expiry. Date_ Time
     * urn:x-oca:ocpp:uid:1:569373
     * Date and Time after which the token must be considered invalid.
     */
    @Optional
    private Date cacheExpiryDateTime;
    /**
     * Priority from a business point of view. Default priority is 0, The range is from -9 to 9. Higher values indicate a higher priority. The chargingPriority in &lt;&lt;transactioneventresponse,TransactionEventResponse&gt;&gt; overrules this one.
     */
    @Optional
    private Integer chargingPriority;
    /**
     * ID_ Token. Language1. Language_ Code
     * urn:x-oca:ocpp:uid:1:569374
     * Preferred user interface language of identifier user. Contains a language code as defined in &lt;&lt;ref-RFC5646,[RFC5646]&gt;&gt;.
     */
    @Optional
    private String language1;
    /**
     * Only used when the IdToken is only valid for one or more specific EVSEs, not for the entire Charging Station.
     */
    @Optional
    private List<Integer> evseId = null;
    /**
     * Contains a case insensitive identifier to use for the authorization and the type of authorization to support multiple forms of identifiers.
     */
    @Optional
    private IdToken groupIdToken;
    /**
     * ID_ Token. Language2. Language_ Code
     * urn:x-oca:ocpp:uid:1:569375
     * Second preferred user interface language of identifier user. Don’t use when language1 is omitted, has to be different from language1. Contains a language code as defined in &lt;&lt;ref-RFC5646,[RFC5646]&gt;&gt;.
     */
    @Optional
    private String language2;
    /**
     * Message_ Content
     * urn:x-enexis:ecdm:uid:2:234490
     * Contains message details, for a message to be displayed on a Charging Station.
     */
    @Optional
    private MessageContent personalMessage;

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
     * ID_ Token. Status. Authorization_ Status
     * urn:x-oca:ocpp:uid:1:569372
     * Current status of the ID Token.
     * <p>
     * (Required)
     */
    public AuthorizationStatusEnum getStatus() {
        return status;
    }

    /**
     * ID_ Token. Status. Authorization_ Status
     * urn:x-oca:ocpp:uid:1:569372
     * Current status of the ID Token.
     * <p>
     * (Required)
     */
    public void setStatus(AuthorizationStatusEnum status) {
        this.status = status;
    }

    /**
     * ID_ Token. Expiry. Date_ Time
     * urn:x-oca:ocpp:uid:1:569373
     * Date and Time after which the token must be considered invalid.
     */
    public Date getCacheExpiryDateTime() {
        return cacheExpiryDateTime;
    }

    /**
     * ID_ Token. Expiry. Date_ Time
     * urn:x-oca:ocpp:uid:1:569373
     * Date and Time after which the token must be considered invalid.
     */
    public void setCacheExpiryDateTime(Date cacheExpiryDateTime) {
        this.cacheExpiryDateTime = cacheExpiryDateTime;
    }

    /**
     * Priority from a business point of view. Default priority is 0, The range is from -9 to 9. Higher values indicate a higher priority. The chargingPriority in &lt;&lt;transactioneventresponse,TransactionEventResponse&gt;&gt; overrules this one.
     */
    public Integer getChargingPriority() {
        return chargingPriority;
    }

    /**
     * Priority from a business point of view. Default priority is 0, The range is from -9 to 9. Higher values indicate a higher priority. The chargingPriority in &lt;&lt;transactioneventresponse,TransactionEventResponse&gt;&gt; overrules this one.
     */
    public void setChargingPriority(Integer chargingPriority) {
        this.chargingPriority = chargingPriority;
    }

    /**
     * ID_ Token. Language1. Language_ Code
     * urn:x-oca:ocpp:uid:1:569374
     * Preferred user interface language of identifier user. Contains a language code as defined in &lt;&lt;ref-RFC5646,[RFC5646]&gt;&gt;.
     */
    public String getLanguage1() {
        return language1;
    }

    /**
     * ID_ Token. Language1. Language_ Code
     * urn:x-oca:ocpp:uid:1:569374
     * Preferred user interface language of identifier user. Contains a language code as defined in &lt;&lt;ref-RFC5646,[RFC5646]&gt;&gt;.
     */
    public void setLanguage1(String language1) {
        this.language1 = language1;
    }

    /**
     * Only used when the IdToken is only valid for one or more specific EVSEs, not for the entire Charging Station.
     */
    public List<Integer> getEvseId() {
        return evseId;
    }

    /**
     * Only used when the IdToken is only valid for one or more specific EVSEs, not for the entire Charging Station.
     */
    public void setEvseId(List<Integer> evseId) {
        this.evseId = evseId;
    }

    /**
     * Contains a case insensitive identifier to use for the authorization and the type of authorization to support multiple forms of identifiers.
     */
    public IdToken getGroupIdToken() {
        return groupIdToken;
    }

    /**
     * Contains a case insensitive identifier to use for the authorization and the type of authorization to support multiple forms of identifiers.
     */
    public void setGroupIdToken(IdToken groupIdToken) {
        this.groupIdToken = groupIdToken;
    }

    /**
     * ID_ Token. Language2. Language_ Code
     * urn:x-oca:ocpp:uid:1:569375
     * Second preferred user interface language of identifier user. Don’t use when language1 is omitted, has to be different from language1. Contains a language code as defined in &lt;&lt;ref-RFC5646,[RFC5646]&gt;&gt;.
     */
    public String getLanguage2() {
        return language2;
    }

    /**
     * ID_ Token. Language2. Language_ Code
     * urn:x-oca:ocpp:uid:1:569375
     * Second preferred user interface language of identifier user. Don’t use when language1 is omitted, has to be different from language1. Contains a language code as defined in &lt;&lt;ref-RFC5646,[RFC5646]&gt;&gt;.
     */
    public void setLanguage2(String language2) {
        this.language2 = language2;
    }

    /**
     * Message_ Content
     * urn:x-enexis:ecdm:uid:2:234490
     * Contains message details, for a message to be displayed on a Charging Station.
     */
    public MessageContent getPersonalMessage() {
        return personalMessage;
    }

    /**
     * Message_ Content
     * urn:x-enexis:ecdm:uid:2:234490
     * Contains message details, for a message to be displayed on a Charging Station.
     */
    public void setPersonalMessage(MessageContent personalMessage) {
        this.personalMessage = personalMessage;
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
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof IdTokenInfo))
            return false;
        IdTokenInfo that = (IdTokenInfo) obj;
        return Objects.equals(customData, that.customData)
                && status == that.status
                && Objects.equals(cacheExpiryDateTime, that.cacheExpiryDateTime)
                && Objects.equals(chargingPriority, that.chargingPriority)
                && Objects.equals(language1, that.language1)
                && Objects.equals(evseId, that.evseId)
                && Objects.equals(groupIdToken, that.groupIdToken)
                && Objects.equals(language2, that.language2)
                && Objects.equals(personalMessage, that.personalMessage);
    }

    @Override
    public int hashCode() {
        int result = (status != null ? status.hashCode() : 0);
        result = 31 * result + (cacheExpiryDateTime != null ? cacheExpiryDateTime.hashCode() : 0);
        result = 31 * result + (chargingPriority != null ? chargingPriority.hashCode() : 0);
        result = 31 * result + (language1 != null ? language1.hashCode() : 0);
        result = 31 * result + (evseId != null ? evseId.hashCode() : 0);
        result = 31 * result + (groupIdToken != null ? groupIdToken.hashCode() : 0);
        result = 31 * result + (language2 != null ? language2.hashCode() : 0);
        result = 31 * result + (personalMessage != null ? personalMessage.hashCode() : 0);
        result = 31 * result + (customData != null ? customData.hashCode() : 0);
        return result;
    }
}
