package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

import static maydo.ocpp.config.Configuration.DATE_FORMAT;

public class SecurityEventNotificationRequest implements JsonInterface {

    /**
     * Type of the security event. This value should be taken from the Security events list.
     * <p>
     * (Required)
     */
    @Required
    private String type;
    /**
     * Date and time at which the event occurred.
     * <p>
     * (Required)
     */
    @Required
    private Date timestamp;
    /**
     * Additional information about the occurred security event.
     */
    @Optional
    private String techInfo;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public SecurityEventNotificationRequest() {
    }

    /**
     * @param type      Type of the security event. This value should be taken from the Security events list.
     *                  .
     * @param techInfo  Additional information about the occurred security event.
     *                  .
     * @param timestamp Date and time at which the event occurred.
     *                  .
     */
    public SecurityEventNotificationRequest(String type, Date timestamp, String techInfo, CustomData customData) {
        super();
        this.type = type;
        this.timestamp = timestamp;
        this.techInfo = techInfo;
        this.customData = customData;
    }

    /**
     * Type of the security event. This value should be taken from the Security events list.
     * <p>
     * (Required)
     */
    public String getType() {
        return type;
    }

    /**
     * Type of the security event. This value should be taken from the Security events list.
     * <p>
     * (Required)
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Date and time at which the event occurred.
     * <p>
     * (Required)
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
     * Date and time at which the event occurred.
     * <p>
     * (Required)
     */
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Additional information about the occurred security event.
     */
    public String getTechInfo() {
        return techInfo;
    }

    /**
     * Additional information about the occurred security event.
     */
    public void setTechInfo(String techInfo) {
        this.techInfo = techInfo;
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
        json.addProperty("type", type);
        json.addProperty("timestamp", new SimpleDateFormat(DATE_FORMAT).format(timestamp));
        json.addProperty("techInfo", techInfo);
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
        if (jsonObject.has("type")) {
            this.type = jsonObject.get("type").getAsString();
        }

        if (jsonObject.has("timestamp")) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                this.timestamp = dateFormat.parse(jsonObject.get("timestamp").getAsString());
            } catch (ParseException e) {
                System.out.println("Invalid date format for timestamp" + e);
            }
        }

        if (jsonObject.has("techInfo")) {
            this.techInfo = jsonObject.get("techInfo").getAsString();
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
        if (!(obj instanceof SecurityEventNotificationRequest))
            return false;
        SecurityEventNotificationRequest that = (SecurityEventNotificationRequest) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.type, that.type)
                && Objects.equals(this.techInfo, that.techInfo)
                && Objects.equals(this.timestamp, that.timestamp);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.type != null ? this.type.hashCode() : 0);
        result = 31 * result + (this.techInfo != null ? this.techInfo.hashCode() : 0);
        result = 31 * result + (this.timestamp != null ? this.timestamp.hashCode() : 0);
        return result;
    }
}
