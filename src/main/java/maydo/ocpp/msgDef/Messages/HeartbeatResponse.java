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
 * This contains the field definition of the HeartbeatResponse PDU sent by
 * the CSMS to the Charging Station in response to a HeartbeatRequest.
 */
public class HeartbeatResponse implements JsonInterface {

    /**
     * Contains the current time of the CSMS.
     */
    @Required
    private Date currentTime;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public HeartbeatResponse() {
    }


    public Date getCurrentTime() {
        return currentTime;
    }


    public void setCurrentTime(Date currentTime) {
        this.currentTime = currentTime;
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

        json.addProperty("currentTime", new SimpleDateFormat(DATE_FORMAT).format(getCurrentTime()));

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
        if (jsonObject.has("currentTime")) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                setCurrentTime(dateFormat.parse(jsonObject.get("currentTime").getAsString()));
            } catch (ParseException e) {
                System.out.println("Invalid date format for currentTime" + e);
            }
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
        if (!(obj instanceof HeartbeatResponse))
            return false;
        HeartbeatResponse that = (HeartbeatResponse) obj;
        return Objects.equals(this.currentTime, that.currentTime)
                && Objects.equals(this.customData, that.customData);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.currentTime != null ? this.currentTime.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        return result;
    }
}
