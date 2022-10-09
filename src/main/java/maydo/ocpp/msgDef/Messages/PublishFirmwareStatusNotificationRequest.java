
package maydo.ocpp.msgDef.Messages;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.PublishFirmwareStatusEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.utils.JsonTools;

import java.util.List;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class PublishFirmwareStatusNotificationRequest implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * This contains the progress status of the publishfirmware
     * installation.
     * 
     * (Required)
     * 
     */
    private PublishFirmwareStatusEnum status;
    /**
     * Required if status is Published. Can be multiple URI’s, if the Local Controller supports e.g. HTTP, HTTPS, and FTP.
     * 
     * 
     */
    private List<String> location = null;
    /**
     * The request id that was
     * provided in the
     * PublishFirmwareRequest which
     * triggered this action.
     * 
     * 
     */
    private Integer requestId;

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
     * This contains the progress status of the publishfirmware
     * installation.
     * 
     * (Required)
     * 
     */
    public PublishFirmwareStatusEnum getStatus() {
        return status;
    }

    /**
     * This contains the progress status of the publishfirmware
     * installation.
     * 
     * (Required)
     * 
     */
    public void setStatus(PublishFirmwareStatusEnum status) {
        this.status = status;
    }

    /**
     * Required if status is Published. Can be multiple URI’s, if the Local Controller supports e.g. HTTP, HTTPS, and FTP.
     * 
     * 
     */
    public List<String> getLocation() {
        return location;
    }

    /**
     * Required if status is Published. Can be multiple URI’s, if the Local Controller supports e.g. HTTP, HTTPS, and FTP.
     * 
     * 
     */
    public void setLocation(List<String> location) {
        this.location = location;
    }

    /**
     * The request id that was
     * provided in the
     * PublishFirmwareRequest which
     * triggered this action.
     * 
     * 
     */
    public Integer getRequestId() {
        return requestId;
    }

    /**
     * The request id that was
     * provided in the
     * PublishFirmwareRequest which
     * triggered this action.
     * 
     * 
     */
    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
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
