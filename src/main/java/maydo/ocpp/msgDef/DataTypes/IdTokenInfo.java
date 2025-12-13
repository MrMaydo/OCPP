package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.Enumerations.AuthorizationStatusEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import static maydo.ocpp.config.Configuration.DATE_FORMAT;

/**
 * Contains status information about an identifier.
 * It is advised to not stop charging for a token that expires during charging,
 * as ExpiryDate is only used for caching purposes. If ExpiryDate is not given, the status has no end date.
 */
public class IdTokenInfo implements JsonInterface {

    /**
     * Current status of the ID Token.
     */
    @Required
    private AuthorizationStatusEnum status;

    /**
     * Date and Time after which the token must be considered invalid.
     */
    @Optional
    private Date cacheExpiryDateTime;

    /**
     * Priority from a business point of view. Default priority is 0, The range is from -9 to 9.
     * Higher values indicate a higher priority. The chargingPriority in TransactionEventResponse overrules this one.
     */
    @Optional
    private Integer chargingPriority;

    /**
     * This contains the group identifier.
     */
    @Optional
    private IdToken groupIdToken;

    /**
     * Preferred user interface language of identifier user. Contains a language code as defined in [RFC5646].
     */
    @Optional
    private String language1;

    /**
     * Second preferred user interface language of identifier user. Don’t use when language1 is omitted,
     * has to be different from language1. Contains a language code as defined in [RFC5646].
     */
    @Optional
    private String language2;

    /**
     * Only used when the IdToken is only valid for one or more specific EVSEs, not for the entire Charging Station.
     */
    @Optional
    private List<Integer> evseId;

    /**
     * Personal message that can be shown to the EV Driver and can be used for tariff information, user greetings etc.
     */
    @Optional
    private MessageContent personalMessage;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public IdTokenInfo() {
    }


    public AuthorizationStatusEnum getStatus() {
        return status;
    }


    public void setStatus(AuthorizationStatusEnum status) {
        this.status = status;
    }


    public Date getCacheExpiryDateTime() {
        return cacheExpiryDateTime;
    }


    public void setCacheExpiryDateTime(Date cacheExpiryDateTime) {
        this.cacheExpiryDateTime = cacheExpiryDateTime;
    }


    public Integer getChargingPriority() {
        return chargingPriority;
    }


    public void setChargingPriority(Integer chargingPriority) {
        this.chargingPriority = chargingPriority;
    }


    public IdToken getGroupIdToken() {
        return groupIdToken;
    }


    public void setGroupIdToken(IdToken groupIdToken) {
        this.groupIdToken = groupIdToken;
    }


    public String getLanguage1() {
        return language1;
    }


    public void setLanguage1(String language1) {
        this.language1 = language1;
    }


    public String getLanguage2() {
        return language2;
    }


    public void setLanguage2(String language2) {
        this.language2 = language2;
    }


    public List<Integer> getEvseId() {
        return evseId;
    }


    public void setEvseId(List<Integer> evseId) {
        this.evseId = evseId;
    }


    public MessageContent getPersonalMessage() {
        return personalMessage;
    }


    public void setPersonalMessage(MessageContent personalMessage) {
        this.personalMessage = personalMessage;
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
        JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
        fromJsonObject(jsonObject);
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        if (jsonObject.has("status")) {
            setStatus(AuthorizationStatusEnum.valueOf(jsonObject.get("status").getAsString()));
        }

        if (jsonObject.has("cacheExpiryDateTime")) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                setCacheExpiryDateTime(dateFormat.parse(jsonObject.get("cacheExpiryDateTime").getAsString()));
            } catch (ParseException e) {
                System.out.println("Invalid date format for cacheExpiryDateTime" + e);
            }
        }

        if (jsonObject.has("chargingPriority")) {
            setChargingPriority(jsonObject.get("chargingPriority").getAsInt());
        }

        if (jsonObject.has("groupIdToken")) {
            setGroupIdToken(new IdToken());
            getGroupIdToken().fromJsonObject(jsonObject.getAsJsonObject("groupIdToken"));
        }

        if (jsonObject.has("language1")) {
            setLanguage1(jsonObject.get("language1").getAsString());
        }

        if (jsonObject.has("language2")) {
            setLanguage2(jsonObject.get("language2").getAsString());
        }

        if (jsonObject.has("evseId")) {
            setEvseId(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("evseId");
            for (JsonElement el : arr) {
                getEvseId().add(el.getAsInt());
            }
        }

        if (jsonObject.has("personalMessage")) {
            setPersonalMessage(new MessageContent());
            getPersonalMessage().fromJsonObject(jsonObject.getAsJsonObject("personalMessage"));
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
