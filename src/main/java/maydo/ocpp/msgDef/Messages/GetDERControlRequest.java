package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.DERControlEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 *
 */
public class GetDERControlRequest implements JsonInterface {

    /**
     * RequestId to be used in ReportDERControlRequest.
     */
    @Required
    private Integer requestId;

    /**
     * True: get a default DER control. False: get a scheduled control.
     */
    @Optional
    private Boolean isDefault;

    /**
     * Type of control settings to retrieve. Not used when controlId is provided.
     */
    @Optional
    private DERControlEnum controlType;

    /**
     * Id of setting to get. When omitted all settings for controlType are retrieved.
     */
    @Optional
    private String controlId;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public GetDERControlRequest() {
    }


    public Integer getRequestId() {
        return requestId;
    }


    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }


    public Boolean getIsDefault() {
        return isDefault;
    }


    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }


    public DERControlEnum getControlType() {
        return controlType;
    }


    public void setControlType(DERControlEnum controlType) {
        this.controlType = controlType;
    }


    public String getControlId() {
        return controlId;
    }


    public void setControlId(String controlId) {
        this.controlId = controlId;
    }


    public CustomData getCustomData() {
        return customData;
    }


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

        json.addProperty("requestId", getRequestId());

        if (getIsDefault() != null) {
            json.addProperty("isDefault", getIsDefault());
        }
        if (getControlType() != null) {
            json.addProperty("controlType", getControlType().toString());
        }
        if (getControlId() != null) {
            json.addProperty("controlId", getControlId());
        }
        if (getCustomData() != null) {
            json.add("customData", getCustomData().toJsonObject());
        }

        return json;
    }

    @Override
    public void fromString(String jsonString) {
        JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
        fromJsonObject(jsonObject);
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        if (jsonObject.has("requestId")) {
            setRequestId(jsonObject.get("requestId").getAsInt());
        }

        if (jsonObject.has("isDefault")) {
            setIsDefault(jsonObject.get("isDefault").getAsBoolean());
        }

        if (jsonObject.has("controlType")) {
            setControlType(DERControlEnum.valueOf(jsonObject.get("controlType").getAsString()));
        }

        if (jsonObject.has("controlId")) {
            setControlId(jsonObject.get("controlId").getAsString());
        }

        if (jsonObject.has("customData")) {
            setCustomData(new CustomData());
            getCustomData().fromJsonObject(jsonObject.getAsJsonObject("customData"));
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
        return Objects.hash(
                getRequestId(),
                getIsDefault(),
                getControlType(),
                getControlId(),
                getCustomData()
        );
    }
}
