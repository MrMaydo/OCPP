package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.StatusInfo;
import maydo.ocpp.msgDef.Enumerations.GetDisplayMessagesStatusEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

public class GetDisplayMessagesResponse implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
    /**
     * Indicates if the Charging Station has Display Messages that match the request criteria in the &lt;&lt;getdisplaymessagesrequest,GetDisplayMessagesRequest&gt;&gt;
     * <p>
     * (Required)
     */
    @Required
    private GetDisplayMessagesStatusEnum status;
    /**
     * Element providing more information about the status.
     */
    @Optional
    private StatusInfo statusInfo;

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
     * Indicates if the Charging Station has Display Messages that match the request criteria in the &lt;&lt;getdisplaymessagesrequest,GetDisplayMessagesRequest&gt;&gt;
     * <p>
     * (Required)
     */
    public GetDisplayMessagesStatusEnum getStatus() {
        return status;
    }

    /**
     * Indicates if the Charging Station has Display Messages that match the request criteria in the &lt;&lt;getdisplaymessagesrequest,GetDisplayMessagesRequest&gt;&gt;
     * <p>
     * (Required)
     */
    public void setStatus(GetDisplayMessagesStatusEnum status) {
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

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject() {
        return JsonTools.toJsonObject(this);
    }
}
