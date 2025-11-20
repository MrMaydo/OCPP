package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.DERControlEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class GetDERControlRequest implements JsonInterface {

    /**
     * RequestId to be used in ReportDERControlRequest.
     * <p>
     * (Required)
     */
    @Required
    private Integer requestId;
    /**
     * True: get a default DER control. False: get a scheduled control.
     */
    @Optional
    private Boolean isDefault;
    /**
     * Type of control settings to retrieve. Not used when _controlId_ is provided.
     */
    @Optional
    private DERControlEnum controlType;
    /**
     * Id of setting to get. When omitted all settings for _controlType_ are retrieved.
     */
    @Optional
    private String controlId;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public GetDERControlRequest() {
    }

    /**
     * @param isDefault True: get a default DER control. False: get a scheduled control.
     *                  <p>
     *                  .
     * @param requestId RequestId to be used in ReportDERControlRequest.
     *                  .
     * @param controlId Id of setting to get. When omitted all settings for _controlType_ are retrieved.
     *                  <p>
     *                  .
     */
    public GetDERControlRequest(Integer requestId, Boolean isDefault, DERControlEnum controlType, String controlId, CustomData customData) {
        super();
        this.requestId = requestId;
        this.isDefault = isDefault;
        this.controlType = controlType;
        this.controlId = controlId;
        this.customData = customData;
    }

    /**
     * RequestId to be used in ReportDERControlRequest.
     * <p>
     * (Required)
     */
    public Integer getRequestId() {
        return requestId;
    }

    /**
     * RequestId to be used in ReportDERControlRequest.
     * <p>
     * (Required)
     */
    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    /**
     * True: get a default DER control. False: get a scheduled control.
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * True: get a default DER control. False: get a scheduled control.
     */
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * Type of control settings to retrieve. Not used when _controlId_ is provided.
     */
    public DERControlEnum getControlType() {
        return controlType;
    }

    /**
     * Type of control settings to retrieve. Not used when _controlId_ is provided.
     */
    public void setControlType(DERControlEnum controlType) {
        this.controlType = controlType;
    }

    /**
     * Id of setting to get. When omitted all settings for _controlType_ are retrieved.
     */
    public String getControlId() {
        return controlId;
    }

    /**
     * Id of setting to get. When omitted all settings for _controlType_ are retrieved.
     */
    public void setControlId(String controlId) {
        this.controlId = controlId;
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
        json.addProperty("requestId", requestId);
        json.addProperty("isDefault", isDefault);
        json.addProperty("controlType", controlType.toString());
        json.addProperty("controlId", controlId);
        json.add("customData", customData.toJsonObject());
        return json;
    }

    @Override
    public void fromString(String jsonString) {
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        if (jsonObject.has("requestId")) {
            this.requestId = jsonObject.get("requestId").getAsInt();
        }

        if (jsonObject.has("isDefault")) {
            this.isDefault = jsonObject.get("isDefault").getAsBoolean();
        }

        if (jsonObject.has("controlType")) {
            this.controlType = DERControlEnum.valueOf(jsonObject.get("controlType").getAsString());
        }

        if (jsonObject.has("controlId")) {
            this.controlId = jsonObject.get("controlId").getAsString();
        }

        if (jsonObject.has("customData")) {
            this.customData = new CustomData();
            this.customData.fromJsonObject(jsonObject.getAsJsonObject("customData"));
        }

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof GetDERControlRequest))
            return false;
        GetDERControlRequest that = (GetDERControlRequest) obj;
        return Objects.equals(this.isDefault, that.isDefault)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.controlId, that.controlId)
                && Objects.equals(this.controlType, that.controlType)
                && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.isDefault != null ? this.isDefault.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.controlId != null ? this.controlId.hashCode() : 0);
        result = 31 * result + (this.controlType != null ? this.controlType.hashCode() : 0);
        result = 31 * result + (this.requestId != null ? this.requestId.hashCode() : 0);
        return result;
    }
}
