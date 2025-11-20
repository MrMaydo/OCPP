package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.Enumerations.MessageFormatEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class MessageContent implements JsonInterface {

    /**
     * Format of the message.
     * <p>
     * (Required)
     */
    @Required
    private MessageFormatEnum format;
    /**
     * Message language identifier. Contains a language code as defined in &lt;&lt;ref-RFC5646,[RFC5646]&gt;&gt;.
     */
    @Optional
    private String language;
    /**
     * *(2.1)* Required. Message contents. +
     * Maximum length supported by Charging Station is given in OCPPCommCtrlr.FieldLength["MessageContentType.content"].
     * Maximum length defaults to 1024.
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private String content;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public MessageContent() {
    }

    /**
     * @param language Message language identifier. Contains a language code as defined in &lt;&lt;ref-RFC5646,[RFC5646]&gt;&gt;.
     *                 .
     * @param content  *(2.1)* Required. Message contents. +
     *                 Maximum length supported by Charging Station is given in OCPPCommCtrlr.FieldLength["MessageContentType.content"].
     *                 Maximum length defaults to 1024.
     *                 <p>
     *                 .
     */
    public MessageContent(MessageFormatEnum format, String language, String content, CustomData customData) {
        super();
        this.format = format;
        this.language = language;
        this.content = content;
        this.customData = customData;
    }

    /**
     * Format of the message.
     * <p>
     * (Required)
     */
    public MessageFormatEnum getFormat() {
        return format;
    }

    /**
     * Format of the message.
     * <p>
     * (Required)
     */
    public void setFormat(MessageFormatEnum format) {
        this.format = format;
    }

    /**
     * Message language identifier. Contains a language code as defined in &lt;&lt;ref-RFC5646,[RFC5646]&gt;&gt;.
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Message language identifier. Contains a language code as defined in &lt;&lt;ref-RFC5646,[RFC5646]&gt;&gt;.
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * *(2.1)* Required. Message contents. +
     * Maximum length supported by Charging Station is given in OCPPCommCtrlr.FieldLength["MessageContentType.content"].
     * Maximum length defaults to 1024.
     * <p>
     * <p>
     * (Required)
     */
    public String getContent() {
        return content;
    }

    /**
     * *(2.1)* Required. Message contents. +
     * Maximum length supported by Charging Station is given in OCPPCommCtrlr.FieldLength["MessageContentType.content"].
     * Maximum length defaults to 1024.
     * <p>
     * <p>
     * (Required)
     */
    public void setContent(String content) {
        this.content = content;
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
        json.addProperty("format", format.toString());
        json.addProperty("language", language);
        json.addProperty("content", content);
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
        if (jsonObject.has("format")) {
            this.format = MessageFormatEnum.valueOf(jsonObject.get("format").getAsString());
        }

        if (jsonObject.has("language")) {
            this.language = jsonObject.get("language").getAsString();
        }

        if (jsonObject.has("content")) {
            this.content = jsonObject.get("content").getAsString();
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
        if (!(obj instanceof MessageContent))
            return false;
        MessageContent that = (MessageContent) obj;
        return Objects.equals(this.format, that.format)
                && Objects.equals(this.language, that.language)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.content, that.content);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.format != null ? this.format.hashCode() : 0);
        result = 31 * result + (this.language != null ? this.language.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.content != null ? this.content.hashCode() : 0);
        return result;
    }
}
