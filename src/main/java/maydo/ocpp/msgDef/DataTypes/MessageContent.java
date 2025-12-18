package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.Enumerations.MessageFormatEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * Contains message details, for a message to be displayed on a Charging Station.
 */
public class MessageContent implements JsonInterface {

    /**
     * (2.1) Required. Message contents. Maximum length supported by Charging Station is given
     * in OCPPCommCtrlr.FieldLength["MessageContentType.cont ent"].
     * Maximum length defaults to 1024.
     */
    @Required
    private String content;

    /**
     * Format of the message.
     */
    @Required
    private MessageFormatEnum format;

    /**
     * Message language identifier. Contains a language code as defined in [RFC5646].
     */
    @Optional
    private String language;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public MessageContent() {
    }


    public MessageFormatEnum getFormat() {
        return format;
    }


    public void setFormat(MessageFormatEnum format) {
        this.format = format;
    }


    public String getLanguage() {
        return language;
    }


    public void setLanguage(String language) {
        this.language = language;
    }


    public String getContent() {
        return content;
    }


    public void setContent(String content) {
        this.content = content;
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

        json.addProperty("content", getContent());

        json.addProperty("format", getFormat().toString());

        if (getLanguage() != null) {
            json.addProperty("language", getLanguage());
        }
        if (getCustomData() != null) {
            json.add("customData", getCustomData().toJsonObject());
        }

        return json;
    }

    @Override
    public void fromString(String jsonString) {
        JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
        fromJsonObject(jsonObject);
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        if (jsonObject.has("content")) {
            setContent(jsonObject.get("content").getAsString());
        }

        if (jsonObject.has("format")) {
            setFormat(MessageFormatEnum.valueOf(jsonObject.get("format").getAsString()));
        }

        if (jsonObject.has("language")) {
            setLanguage(jsonObject.get("language").getAsString());
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
        return Objects.hash(
                getContent(),
                getFormat(),
                getLanguage(),
                getCustomData()
        );
    }
}
