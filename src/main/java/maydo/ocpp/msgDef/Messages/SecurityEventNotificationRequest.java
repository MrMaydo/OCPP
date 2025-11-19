package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Date;
import java.util.Objects;

public class SecurityEventNotificationRequest implements JsonInterface {

    /**
     * Type of the security event. This value should be taken from the Security events list.
     * 
     * (Required)
     */
    @Required
    private String type;
    /**
     * Date and time at which the event occurred.
     * 
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
     * 
     * @param type
     *     Type of the security event. This value should be taken from the Security events list.
     *     .
     * @param techInfo
     *     Additional information about the occurred security event.
     *     .
     * @param timestamp
     *     Date and time at which the event occurred.
     *     .
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
     * 
     * (Required)
     */
    public String getType() {
        return type;
    }

    /**
     * Type of the security event. This value should be taken from the Security events list.
     * 
     * (Required)
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Date and time at which the event occurred.
     * 
     * (Required)
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
     * Date and time at which the event occurred.
     * 
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
        return null;
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
