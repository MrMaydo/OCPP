package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.PublishFirmwareStatusEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.List;
import java.util.Objects;

public class PublishFirmwareStatusNotificationRequest implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
    /**
     * This contains the progress status of the publishfirmware
     * installation.
     * <p>
     * (Required)
     */
    @Required
    private PublishFirmwareStatusEnum status;
    /**
     * Required if status is Published. Can be multiple URI’s, if the Local Controller supports e.g. HTTP, HTTPS, and FTP.
     */
    @Optional
    private List<String> location = null;
    /**
     * The request id that was
     * provided in the
     * PublishFirmwareRequest which
     * triggered this action.
     */
    private Integer requestId;

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
     * This contains the progress status of the publishfirmware
     * installation.
     * <p>
     * (Required)
     */
    public PublishFirmwareStatusEnum getStatus() {
        return status;
    }

    /**
     * This contains the progress status of the publishfirmware
     * installation.
     * <p>
     * (Required)
     */
    public void setStatus(PublishFirmwareStatusEnum status) {
        this.status = status;
    }

    /**
     * Required if status is Published. Can be multiple URI’s, if the Local Controller supports e.g. HTTP, HTTPS, and FTP.
     */
    public List<String> getLocation() {
        return location;
    }

    /**
     * Required if status is Published. Can be multiple URI’s, if the Local Controller supports e.g. HTTP, HTTPS, and FTP.
     */
    public void setLocation(List<String> location) {
        this.location = location;
    }

    /**
     * The request id that was
     * provided in the
     * PublishFirmwareRequest which
     * triggered this action.
     */
    public Integer getRequestId() {
        return requestId;
    }

    /**
     * The request id that was
     * provided in the
     * PublishFirmwareRequest which
     * triggered this action.
     */
    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
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
        if (!(obj instanceof PublishFirmwareStatusNotificationRequest))
            return false;
        PublishFirmwareStatusNotificationRequest that = (PublishFirmwareStatusNotificationRequest) obj;
        return Objects.equals(customData, that.customData)
                && status == that.status
                && Objects.equals(location, that.location)
                && Objects.equals(requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        int result = (status != null ? status.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (requestId != null ? requestId.hashCode() : 0);
        result = 31 * result + (customData != null ? customData.hashCode() : 0);
        return result;
    }
}
