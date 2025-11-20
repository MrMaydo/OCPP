package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

import static maydo.ocpp.config.Configuration.DATE_FORMAT;

public class HeartbeatResponse implements JsonInterface {

    /**
     * Contains the current time of the CSMS.
     * <p>
     * (Required)
     */
    @Required
    private Date currentTime;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public HeartbeatResponse() {
    }

    /**
     * @param currentTime Contains the current time of the CSMS.
     *                    .
     */
    public HeartbeatResponse(Date currentTime, CustomData customData) {
        super();
        this.currentTime = currentTime;
        this.customData = customData;
    }

    /**
     * Contains the current time of the CSMS.
     * <p>
     * (Required)
     */
    public Date getCurrentTime() {
        return currentTime;
    }

    /**
     * Contains the current time of the CSMS.
     * <p>
     * (Required)
     */
    public void setCurrentTime(Date currentTime) {
        this.currentTime = currentTime;
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
        json.addProperty("currentTime", new SimpleDateFormat(DATE_FORMAT).format(currentTime));
        json.add("customData", customData.toJsonObject());
        return json;
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
