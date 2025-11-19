package maydo.ocpp.msgDef.DataTypes;

import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Date;
import java.util.Objects;

public class LogParameters implements JsonInterface {

    /**
     * The URL of the location at the remote system where the log should be stored.
     * 
     * (Required)
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
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public LogParameters() {
    }

    /**
     * 
     * @param oldestTimestamp
     *     This contains the date and time of the oldest logging information to include in the diagnostics.
     *     .
     * @param latestTimestamp
     *     This contains the date and time of the latest logging information to include in the diagnostics.
     *     .
     * @param remoteLocation
     *     The URL of the location at the remote system where the log should be stored.
     *     .
     */
    public LogParameters(String remoteLocation, Date oldestTimestamp, Date latestTimestamp, CustomData customData) {
        super();
        this.remoteLocation = remoteLocation;
        this.oldestTimestamp = oldestTimestamp;
        this.latestTimestamp = latestTimestamp;
        this.customData = customData;
    }

    /**
     * The URL of the location at the remote system where the log should be stored.
     * 
     * (Required)
     */
    public String getRemoteLocation() {
        return remoteLocation;
    }

    /**
     * The URL of the location at the remote system where the log should be stored.
     * 
     * (Required)
     */
    public void setRemoteLocation(String remoteLocation) {
        this.remoteLocation = remoteLocation;
    }

    /**
     * This contains the date and time of the oldest logging information to include in the diagnostics.
     */
    public Date getOldestTimestamp() {
        return oldestTimestamp;
    }

    /**
     * This contains the date and time of the oldest logging information to include in the diagnostics.
     */
    public void setOldestTimestamp(Date oldestTimestamp) {
        this.oldestTimestamp = oldestTimestamp;
    }

    /**
     * This contains the date and time of the latest logging information to include in the diagnostics.
     */
    public Date getLatestTimestamp() {
        return latestTimestamp;
    }

    /**
     * This contains the date and time of the latest logging information to include in the diagnostics.
     */
    public void setLatestTimestamp(Date latestTimestamp) {
        this.latestTimestamp = latestTimestamp;
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
