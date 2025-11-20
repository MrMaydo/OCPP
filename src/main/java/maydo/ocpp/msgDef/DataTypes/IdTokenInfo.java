package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.Enumerations.AuthorizationStatusEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import static maydo.ocpp.config.Configuration.DATE_FORMAT;

public class IdTokenInfo implements JsonInterface {

    /**
     * Current status of the ID Token.
     * <p>
     * (Required)
     */
    @Required
    private AuthorizationStatusEnum status;
    /**
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
     * Contains a case insensitive identifier to use for the authorization and the type of authorization to support multiple forms of identifiers.
     */
    @Optional
    private IdToken groupIdToken;
    /**
     * Preferred user interface language of identifier user. Contains a language code as defined in &lt;&lt;ref-RFC5646,[RFC5646]&gt;&gt;.
     */
    @Optional
    private String language1;
    /**
     * Second preferred user interface language of identifier user. Don’t use when language1 is omitted, has to be different from language1. Contains a language code as defined in &lt;&lt;ref-RFC5646,[RFC5646]&gt;&gt;.
     */
    @Optional
    private String language2;
    /**
     * Only used when the IdToken is only valid for one or more specific EVSEs, not for the entire Charging Station.
     */
    @Optional
    private List<Integer> evseId;
    /**
     * Contains message details, for a message to be displayed on a Charging Station.
     */
    @Optional
    private MessageContent personalMessage;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public IdTokenInfo() {
    }

    /**
     * @param evseId              Only used when the IdToken is only valid for one or more specific EVSEs, not for the entire Charging Station.
     *                            <p>
     *                            .
     * @param language2           Second preferred user interface language of identifier user. Don’t use when language1 is omitted, has to be different from language1. Contains a language code as defined in &lt;&lt;ref-RFC5646,[RFC5646]&gt;&gt;.
     *                            .
     * @param language1           Preferred user interface language of identifier user. Contains a language code as defined in &lt;&lt;ref-RFC5646,[RFC5646]&gt;&gt;.
     *                            <p>
     *                            .
     * @param cacheExpiryDateTime Date and Time after which the token must be considered invalid.
     *                            .
     * @param chargingPriority    Priority from a business point of view. Default priority is 0, The range is from -9 to 9. Higher values indicate a higher priority. The chargingPriority in &lt;&lt;transactioneventresponse,TransactionEventResponse&gt;&gt; overrules this one.
     *                            .
     */
    public IdTokenInfo(AuthorizationStatusEnum status, Date cacheExpiryDateTime, Integer chargingPriority, IdToken groupIdToken, String language1, String language2, List<Integer> evseId, MessageContent personalMessage, CustomData customData) {
        super();
        this.status = status;
        this.cacheExpiryDateTime = cacheExpiryDateTime;
        this.chargingPriority = chargingPriority;
        this.groupIdToken = groupIdToken;
        this.language1 = language1;
        this.language2 = language2;
        this.evseId = evseId;
        this.personalMessage = personalMessage;
        this.customData = customData;
    }

    /**
     * Current status of the ID Token.
     * <p>
     * (Required)
     */
    public AuthorizationStatusEnum getStatus() {
        return status;
    }

    /**
     * Current status of the ID Token.
     * <p>
     * (Required)
     */
    public void setStatus(AuthorizationStatusEnum status) {
        this.status = status;
    }

    /**
     * Date and Time after which the token must be considered invalid.
     */
    public Date getCacheExpiryDateTime() {
        return cacheExpiryDateTime;
    }

    /**
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
     * Preferred user interface language of identifier user. Contains a language code as defined in &lt;&lt;ref-RFC5646,[RFC5646]&gt;&gt;.
     */
    public String getLanguage1() {
        return language1;
    }

    /**
     * Preferred user interface language of identifier user. Contains a language code as defined in &lt;&lt;ref-RFC5646,[RFC5646]&gt;&gt;.
     */
    public void setLanguage1(String language1) {
        this.language1 = language1;
    }

    /**
     * Second preferred user interface language of identifier user. Don’t use when language1 is omitted, has to be different from language1. Contains a language code as defined in &lt;&lt;ref-RFC5646,[RFC5646]&gt;&gt;.
     */
    public String getLanguage2() {
        return language2;
    }

    /**
     * Second preferred user interface language of identifier user. Don’t use when language1 is omitted, has to be different from language1. Contains a language code as defined in &lt;&lt;ref-RFC5646,[RFC5646]&gt;&gt;.
     */
    public void setLanguage2(String language2) {
        this.language2 = language2;
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
     * Contains message details, for a message to be displayed on a Charging Station.
     */
    public MessageContent getPersonalMessage() {
        return personalMessage;
    }

    /**
     * Contains message details, for a message to be displayed on a Charging Station.
     */
    public void setPersonalMessage(MessageContent personalMessage) {
        this.personalMessage = personalMessage;
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
        json.addProperty("status", status.toString());
        json.addProperty("cacheExpiryDateTime", new SimpleDateFormat(DATE_FORMAT).format(cacheExpiryDateTime));
        json.addProperty("chargingPriority", chargingPriority);
        json.add("groupIdToken", groupIdToken.toJsonObject());
        json.addProperty("language1", language1);
        json.addProperty("language2", language2);
        json.add("personalMessage", personalMessage.toJsonObject());
        json.add("customData", customData.toJsonObject());
        return json;
    }

    @Override
    public void fromString(String jsonString) {
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof IdTokenInfo))
            return false;
        IdTokenInfo that = (IdTokenInfo) obj;
        return Objects.equals(this.evseId, that.evseId)
                && Objects.equals(this.language2, that.language2)
                && Objects.equals(this.language1, that.language1)
                && Objects.equals(this.cacheExpiryDateTime, that.cacheExpiryDateTime)
                && Objects.equals(this.chargingPriority, that.chargingPriority)
                && Objects.equals(this.personalMessage, that.personalMessage)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.groupIdToken, that.groupIdToken)
                && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.evseId != null ? this.evseId.hashCode() : 0);
        result = 31 * result + (this.language2 != null ? this.language2.hashCode() : 0);
        result = 31 * result + (this.language1 != null ? this.language1.hashCode() : 0);
        result = 31 * result + (this.cacheExpiryDateTime != null ? this.cacheExpiryDateTime.hashCode() : 0);
        result = 31 * result + (this.chargingPriority != null ? this.chargingPriority.hashCode() : 0);
        result = 31 * result + (this.personalMessage != null ? this.personalMessage.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.groupIdToken != null ? this.groupIdToken.hashCode() : 0);
        result = 31 * result + (this.status != null ? this.status.hashCode() : 0);
        return result;
    }
}
