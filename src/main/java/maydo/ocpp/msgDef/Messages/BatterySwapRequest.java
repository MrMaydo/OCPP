package maydo.ocpp.msgDef.Messages;

import maydo.ocpp.msgDef.DataTypes.BatteryData;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.IdToken;
import maydo.ocpp.msgDef.Enumerations.BatterySwapEventEnum;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.List;
import java.util.Objects;

public class BatterySwapRequest {

    /**
     * 
     * (Required)
     */
    @Required
    private List<BatteryData> batteryData;
    /**
     * Battery in/out
     * 
     * (Required)
     */
    @Required
    private BatterySwapEventEnum eventType;
    /**
     * Contains a case insensitive identifier to use for the authorization and the type of authorization to support multiple forms of identifiers.
     * 
     * (Required)
     */
    @Required
    private IdToken idToken;
    /**
     * RequestId to correlate BatteryIn/Out events and optional RequestBatterySwapRequest.
     * 
     * 
     * 
     * (Required)
     */
    @Required
    private Integer requestId;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public BatterySwapRequest() {
    }

    /**
     * 
     * @param requestId
     *     RequestId to correlate BatteryIn/Out events and optional RequestBatterySwapRequest.
     *     
     *     
     *     .
     */
    public BatterySwapRequest(List<BatteryData> batteryData, BatterySwapEventEnum eventType, IdToken idToken, Integer requestId, CustomData customData) {
        super();
        this.batteryData = batteryData;
        this.eventType = eventType;
        this.idToken = idToken;
        this.requestId = requestId;
        this.customData = customData;
    }

    /**
     * 
     * (Required)
     */
    public List<BatteryData> getBatteryData() {
        return batteryData;
    }

    /**
     * 
     * (Required)
     */
    public void setBatteryData(List<BatteryData> batteryData) {
        this.batteryData = batteryData;
    }

    /**
     * Battery in/out
     * 
     * (Required)
     */
    public BatterySwapEventEnum getEventType() {
        return eventType;
    }

    /**
     * Battery in/out
     * 
     * (Required)
     */
    public void setEventType(BatterySwapEventEnum eventType) {
        this.eventType = eventType;
    }

    /**
     * Contains a case insensitive identifier to use for the authorization and the type of authorization to support multiple forms of identifiers.
     * 
     * (Required)
     */
    public IdToken getIdToken() {
        return idToken;
    }

    /**
     * Contains a case insensitive identifier to use for the authorization and the type of authorization to support multiple forms of identifiers.
     * 
     * (Required)
     */
    public void setIdToken(IdToken idToken) {
        this.idToken = idToken;
    }

    /**
     * RequestId to correlate BatteryIn/Out events and optional RequestBatterySwapRequest.
     * 
     * 
     * 
     * (Required)
     */
    public Integer getRequestId() {
        return requestId;
    }

    /**
     * RequestId to correlate BatteryIn/Out events and optional RequestBatterySwapRequest.
     * 
     * 
     * 
     * (Required)
     */
    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
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
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof BatterySwapRequest))
            return false;
        BatterySwapRequest that = (BatterySwapRequest) obj;
        return Objects.equals(this.idToken, that.idToken)
                && Objects.equals(this.customData, that.customData) 
                && Objects.equals(this.eventType, that.eventType) 
                && Objects.equals(this.batteryData, that.batteryData) 
                && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.idToken != null ? this.idToken.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.eventType != null ? this.eventType.hashCode() : 0);
        result = 31 * result + (this.batteryData != null ? this.batteryData.hashCode() : 0);
        result = 31 * result + (this.requestId != null ? this.requestId.hashCode() : 0);
        return result;
    }
}
