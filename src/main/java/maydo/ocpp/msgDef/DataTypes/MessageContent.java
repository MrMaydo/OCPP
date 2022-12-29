package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.Enumerations.MessageFormatEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.Objects;


/**
 * Message_ Content
 * urn:x-enexis:ecdm:uid:2:234490
 * Contains message details, for a message to be displayed on a Charging Station.
 */
public class MessageContent implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
    /**
     * Message_ Content. Format. Message_ Format_ Code
     * urn:x-enexis:ecdm:uid:1:570848
     * Format of the message.
     * <p>
     * (Required)
     */
    @Required
    private MessageFormatEnum format;
    /**
     * Message_ Content. Language. Language_ Code
     * urn:x-enexis:ecdm:uid:1:570849
     * Message language identifier. Contains a language code as defined in &lt;&lt;ref-RFC5646,[RFC5646]&gt;&gt;.
     */
    @Optional
    private String language;
    /**
     * Message_ Content. Content. Message
     * urn:x-enexis:ecdm:uid:1:570852
     * Message contents.
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private String content;

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
     * Message_ Content. Format. Message_ Format_ Code
     * urn:x-enexis:ecdm:uid:1:570848
     * Format of the message.
     * <p>
     * (Required)
     */
    public MessageFormatEnum getFormat() {
        return format;
    }

    /**
     * Message_ Content. Format. Message_ Format_ Code
     * urn:x-enexis:ecdm:uid:1:570848
     * Format of the message.
     * <p>
     * (Required)
     */
    public void setFormat(MessageFormatEnum format) {
        this.format = format;
    }

    /**
     * Message_ Content. Language. Language_ Code
     * urn:x-enexis:ecdm:uid:1:570849
     * Message language identifier. Contains a language code as defined in &lt;&lt;ref-RFC5646,[RFC5646]&gt;&gt;.
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Message_ Content. Language. Language_ Code
     * urn:x-enexis:ecdm:uid:1:570849
     * Message language identifier. Contains a language code as defined in &lt;&lt;ref-RFC5646,[RFC5646]&gt;&gt;.
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * Message_ Content. Content. Message
     * urn:x-enexis:ecdm:uid:1:570852
     * Message contents.
     * <p>
     * <p>
     * (Required)
     */
    public String getContent() {
        return content;
    }

    /**
     * Message_ Content. Content. Message
     * urn:x-enexis:ecdm:uid:1:570852
     * Message contents.
     * <p>
     * <p>
     * (Required)
     */
    public void setContent(String content) {
        this.content = content;
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
        if (!(obj instanceof MessageContent))
            return false;
        MessageContent that = (MessageContent) obj;
        return Objects.equals(customData, that.customData)
                && format == that.format
                && Objects.equals(language, that.language)
                && Objects.equals(content, that.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customData, format, language, content);
    }
}
