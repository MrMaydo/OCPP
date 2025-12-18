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

/**
 * Sent by the Charging Station to the CSMS in case of a security event.
 */
public class SecurityEventNotificationRequest implements JsonInterface {

    /**
     * Type of the security event. This value should be taken from the Security events list.
     */
    @Required
    private String type;

    /**
     * Date and time at which the event occurred.
     */
    @Required
    private Date timestamp;

    /**
     * Additional information about the occurred security event.
     */
    @Optional
    private String techInfo;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public SecurityEventNotificationRequest() {
    }


    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }


    public Date getTimestamp() {
        return timestamp;
    }


    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }


    public String getTechInfo() {
        return techInfo;
    }


    public void setTechInfo(String techInfo) {
        this.techInfo = techInfo;
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

        json.addProperty("type", getType());

        json.addProperty("timestamp", new SimpleDateFormat(DATE_FORMAT).format(getTimestamp()));

        if (getTechInfo() != null) {
            json.addProperty("techInfo", getTechInfo());
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
        if (jsonObject.has("type")) {
            setType(jsonObject.get("type").getAsString());
        }

        if (jsonObject.has("timestamp")) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                setTimestamp(dateFormat.parse(jsonObject.get("timestamp").getAsString()));
            } catch (ParseException e) {
                System.out.println("Invalid date format for timestamp" + e);
            }
        }

        if (jsonObject.has("techInfo")) {
            setTechInfo(jsonObject.get("techInfo").getAsString());
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
        if (!(obj instanceof SecurityEventNotificationRequest))
            return false;
        SecurityEventNotificationRequest that = (SecurityEventNotificationRequest) obj;
        return Objects.equals(getType(), that.getType())
                && Objects.equals(getTimestamp(), that.getTimestamp())
                && Objects.equals(getTechInfo(), that.getTechInfo())
                && Objects.equals(getCustomData(), that.getCustomData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getType(),
                getTimestamp(),
                getTechInfo(),
                getCustomData()
        );
    }
}
