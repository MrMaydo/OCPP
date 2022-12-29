package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.Date;
import java.util.Objects;


/**
 * Log
 * urn:x-enexis:ecdm:uid:2:233373
 * Generic class for the configuration of logging entries.
 */
public class LogParameters implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
    /**
     * Log. Remote_ Location. URI
     * urn:x-enexis:ecdm:uid:1:569484
     * The URL of the location at the remote system where the log should be stored.
     * <p>
     * (Required)
     */
    @Required
    private String remoteLocation;
    /**
     * Log. Oldest_ Timestamp. Date_ Time
     * urn:x-enexis:ecdm:uid:1:569477
     * This contains the date and time of the oldest logging information to include in the diagnostics.
     */
    @Optional
    private Date oldestTimestamp;
    /**
     * Log. Latest_ Timestamp. Date_ Time
     * urn:x-enexis:ecdm:uid:1:569482
     * This contains the date and time of the latest logging information to include in the diagnostics.
     */
    @Optional
    private Date latestTimestamp;

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
     * Log. Remote_ Location. URI
     * urn:x-enexis:ecdm:uid:1:569484
     * The URL of the location at the remote system where the log should be stored.
     * <p>
     * (Required)
     */
    public String getRemoteLocation() {
        return remoteLocation;
    }

    /**
     * Log. Remote_ Location. URI
     * urn:x-enexis:ecdm:uid:1:569484
     * The URL of the location at the remote system where the log should be stored.
     * <p>
     * (Required)
     */
    public void setRemoteLocation(String remoteLocation) {
        this.remoteLocation = remoteLocation;
    }

    /**
     * Log. Oldest_ Timestamp. Date_ Time
     * urn:x-enexis:ecdm:uid:1:569477
     * This contains the date and time of the oldest logging information to include in the diagnostics.
     */
    public Date getOldestTimestamp() {
        return oldestTimestamp;
    }

    /**
     * Log. Oldest_ Timestamp. Date_ Time
     * urn:x-enexis:ecdm:uid:1:569477
     * This contains the date and time of the oldest logging information to include in the diagnostics.
     */
    public void setOldestTimestamp(Date oldestTimestamp) {
        this.oldestTimestamp = oldestTimestamp;
    }

    /**
     * Log. Latest_ Timestamp. Date_ Time
     * urn:x-enexis:ecdm:uid:1:569482
     * This contains the date and time of the latest logging information to include in the diagnostics.
     */
    public Date getLatestTimestamp() {
        return latestTimestamp;
    }

    /**
     * Log. Latest_ Timestamp. Date_ Time
     * urn:x-enexis:ecdm:uid:1:569482
     * This contains the date and time of the latest logging information to include in the diagnostics.
     */
    public void setLatestTimestamp(Date latestTimestamp) {
        this.latestTimestamp = latestTimestamp;
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
        if (!(obj instanceof LogParameters))
            return false;
        LogParameters that = (LogParameters) obj;
        return Objects.equals(customData, that.customData)
                && Objects.equals(remoteLocation, that.remoteLocation)
                && Objects.equals(oldestTimestamp, that.oldestTimestamp)
                && Objects.equals(latestTimestamp, that.latestTimestamp);
    }

    @Override
    public int hashCode() {
        int result = (remoteLocation != null ? remoteLocation.hashCode() : 0);
        result = 31 * result + (oldestTimestamp != null ? oldestTimestamp.hashCode() : 0);
        result = 31 * result + (latestTimestamp != null ? latestTimestamp.hashCode() : 0);
        result = 31 * result + (customData != null ? customData.hashCode() : 0);
        return result;
    }
}
