package maydo.ocpp.msgDef.Messages;

import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.StatusInfo;
import maydo.ocpp.msgDef.Enumerations.DERControlStatusEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.List;
import java.util.Objects;

public class SetDERControlResponse implements JsonInterface {

    /**
     * Result of operation.
     * 
     * 
     * (Required)
     */
    @Required
    private DERControlStatusEnum status;
    /**
     * Element providing more information about the status.
     */
    @Optional
    private StatusInfo statusInfo;
    /**
     * List of controlIds that are superseded as a result of setting this control.
     */
    @Optional
    private List<String> supersededIds;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public SetDERControlResponse() {
    }

    /**
     * 
     * @param supersededIds
     *     List of controlIds that are superseded as a result of setting this control.
     *     .
     */
    public SetDERControlResponse(DERControlStatusEnum status, StatusInfo statusInfo, List<String> supersededIds, CustomData customData) {
        super();
        this.status = status;
        this.statusInfo = statusInfo;
        this.supersededIds = supersededIds;
        this.customData = customData;
    }

    /**
     * Result of operation.
     * 
     * 
     * (Required)
     */
    public DERControlStatusEnum getStatus() {
        return status;
    }

    /**
     * Result of operation.
     * 
     * 
     * (Required)
     */
    public void setStatus(DERControlStatusEnum status) {
        this.status = status;
    }

    /**
     * Element providing more information about the status.
     */
    public StatusInfo getStatusInfo() {
        return statusInfo;
    }

    /**
     * Element providing more information about the status.
     */
    public void setStatusInfo(StatusInfo statusInfo) {
        this.statusInfo = statusInfo;
    }

    /**
     * List of controlIds that are superseded as a result of setting this control.
     */
    public List<String> getSupersededIds() {
        return supersededIds;
    }

    /**
     * List of controlIds that are superseded as a result of setting this control.
     */
    public void setSupersededIds(List<String> supersededIds) {
        this.supersededIds = supersededIds;
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
        if (!(obj instanceof SetDERControlResponse))
            return false;
        SetDERControlResponse that = (SetDERControlResponse) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.statusInfo, that.statusInfo) 
                && Objects.equals(this.supersededIds, that.supersededIds) 
                && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.statusInfo != null ? this.statusInfo.hashCode() : 0);
        result = 31 * result + (this.supersededIds != null ? this.supersededIds.hashCode() : 0);
        result = 31 * result + (this.status != null ? this.status.hashCode() : 0);
        return result;
    }
}
