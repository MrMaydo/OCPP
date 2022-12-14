package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.Date;
import java.util.Objects;

public class SecurityEventNotificationRequest implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
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

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject() {
        return JsonTools.toJsonObject(this);
    }

    @Override
    public void fromString(String jsonString) {
        JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
        fromJsonObject(jsonObject);
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        JsonTools.fromJsonObject(this, jsonObject);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof SecurityEventNotificationRequest))
            return false;
        SecurityEventNotificationRequest that = (SecurityEventNotificationRequest) obj;
        return Objects.equals(customData, that.customData)
                && Objects.equals(type, that.type)
                && Objects.equals(timestamp, that.timestamp)
                && Objects.equals(techInfo, that.techInfo);
    }

    @Override
    public int hashCode() {
        int result = (type != null ? type.hashCode() : 0);
        result = 31 * result + (timestamp != null ? timestamp.hashCode() : 0);
        result = 31 * result + (techInfo != null ? techInfo.hashCode() : 0);
        result = 31 * result + (customData != null ? customData.hashCode() : 0);
        return result;
    }
}
