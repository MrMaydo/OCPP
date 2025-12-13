package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

import static maydo.ocpp.config.Configuration.DATE_FORMAT;

/**
 * Generic class for the configuration of logging entries.
 */
public class LogParameters implements JsonInterface {

    /**
     * The URL of the location at the remote system where the log should be stored.
     */
    @Required
    private String remoteLocation;

    /**
     * This contains the date and time of the oldest logging information to include in the diagnostics.
     */
    @Optional
    private Date oldestTimestamp;

    /**
     * This contains the date and time of the latest logging information to include in the diagnostics.
     */
    @Optional
    private Date latestTimestamp;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public LogParameters() {
    }


    public String getRemoteLocation() {
        return remoteLocation;
    }


    public void setRemoteLocation(String remoteLocation) {
        this.remoteLocation = remoteLocation;
    }


    public Date getOldestTimestamp() {
        return oldestTimestamp;
    }


    public void setOldestTimestamp(Date oldestTimestamp) {
        this.oldestTimestamp = oldestTimestamp;
    }


    public Date getLatestTimestamp() {
        return latestTimestamp;
    }


    public void setLatestTimestamp(Date latestTimestamp) {
        this.latestTimestamp = latestTimestamp;
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
        json.addProperty("remoteLocation", remoteLocation);
        json.addProperty("oldestTimestamp", new SimpleDateFormat(DATE_FORMAT).format(oldestTimestamp));
        json.addProperty("latestTimestamp", new SimpleDateFormat(DATE_FORMAT).format(latestTimestamp));
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
        if (jsonObject.has("remoteLocation")) {
            setRemoteLocation(jsonObject.get("remoteLocation").getAsString());
        }

        if (jsonObject.has("oldestTimestamp")) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                setOldestTimestamp(dateFormat.parse(jsonObject.get("oldestTimestamp").getAsString()));
            } catch (ParseException e) {
                System.out.println("Invalid date format for oldestTimestamp" + e);
            }
        }

        if (jsonObject.has("latestTimestamp")) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                setLatestTimestamp(dateFormat.parse(jsonObject.get("latestTimestamp").getAsString()));
            } catch (ParseException e) {
                System.out.println("Invalid date format for latestTimestamp" + e);
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
        if (!(obj instanceof LogParameters))
            return false;
        LogParameters that = (LogParameters) obj;
        return Objects.equals(this.remoteLocation, that.remoteLocation)
                && Objects.equals(this.oldestTimestamp, that.oldestTimestamp)
                && Objects.equals(this.latestTimestamp, that.latestTimestamp)
                && Objects.equals(this.customData, that.customData);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.remoteLocation != null ? this.remoteLocation.hashCode() : 0);
        result = 31 * result + (this.oldestTimestamp != null ? this.oldestTimestamp.hashCode() : 0);
        result = 31 * result + (this.latestTimestamp != null ? this.latestTimestamp.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        return result;
    }
}
