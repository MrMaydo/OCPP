
package maydo.ocpp.msgDef.Messages;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.utils.JsonTools;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.annotation.Generated;

import static maydo.ocpp.config.Configuration.DATE_FORMAT;

public class SecurityEventNotificationRequest implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * Type of the security event. This value should be taken from the Security events list.
     * 
     * (Required)
     * 
     */
    private String type;
    /**
     * Date and time at which the event occurred.
     * 
     * (Required)
     * 
     */
    private Date timestamp;
    /**
     * Additional information about the occurred security event.
     * 
     * 
     */
    private String techInfo;

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    public CustomData getCustomData() {
        return customData;
    }

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    public void setCustomData(CustomData customData) {
        this.customData = customData;
    }

    /**
     * Type of the security event. This value should be taken from the Security events list.
     * 
     * (Required)
     * 
     */
    public String getType() {
        return type;
    }

    /**
     * Type of the security event. This value should be taken from the Security events list.
     * 
     * (Required)
     * 
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Date and time at which the event occurred.
     * 
     * (Required)
     * 
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
     * Date and time at which the event occurred.
     * 
     * (Required)
     * 
     */
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Additional information about the occurred security event.
     * 
     * 
     */
    public String getTechInfo() {
        return techInfo;
    }

    /**
     * Additional information about the occurred security event.
     * 
     * 
     */
    public void setTechInfo(String techInfo) {
        this.techInfo = techInfo;
    }

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject(){
        return JsonTools.toJsonObject(this);
    }
}
