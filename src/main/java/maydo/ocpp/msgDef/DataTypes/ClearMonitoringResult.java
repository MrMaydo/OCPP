
package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.Enumerations.ClearMonitoringStatusEnum;
import maydo.ocpp.msgDef.JsonInterface;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class ClearMonitoringResult implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * Result of the clear request for this monitor, identified by its Id.
     * 
     * 
     * (Required)
     * 
     */
    private ClearMonitoringStatusEnum status;
    /**
     * Id of the monitor of which a clear was requested.
     * 
     * 
     * (Required)
     * 
     */
    private Integer id;
    /**
     * Element providing more information about the status.
     * 
     * 
     */
    private StatusInfo statusInfo;

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
     * Result of the clear request for this monitor, identified by its Id.
     * 
     * 
     * (Required)
     * 
     */
    public ClearMonitoringStatusEnum getStatus() {
        return status;
    }

    /**
     * Result of the clear request for this monitor, identified by its Id.
     * 
     * 
     * (Required)
     * 
     */
    public void setStatus(ClearMonitoringStatusEnum status) {
        this.status = status;
    }

    /**
     * Id of the monitor of which a clear was requested.
     * 
     * 
     * (Required)
     * 
     */
    public Integer getId() {
        return id;
    }

    /**
     * Id of the monitor of which a clear was requested.
     * 
     * 
     * (Required)
     * 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Element providing more information about the status.
     * 
     * 
     */
    public StatusInfo getStatusInfo() {
        return statusInfo;
    }

    /**
     * Element providing more information about the status.
     * 
     * 
     */
    public void setStatusInfo(StatusInfo statusInfo) {
        this.statusInfo = statusInfo;
    }

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonElement toJsonObject(){
        JsonElement jsonObject= new Gson().toJsonTree(this);
        return jsonObject;
    }
}
