package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;


/**
 * Element providing more information about the status.
 */
public class StatusInfo implements JsonInterface {

    /**
     * A predefined code for the reason why the status is returned in this response.
     * The string is case-insensitive.
     */
    @Required
    private String reasonCode;

    /**
     * Additional text to provide detailed information.
     */
    @Optional
    private String additionalInfo;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public StatusInfo() {
    }


    public String getReasonCode() {
        return reasonCode;
    }


    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }


    public String getAdditionalInfo() {
        return additionalInfo;
    }


    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
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

        json.addProperty("reasonCode", getReasonCode());

        if (getAdditionalInfo() != null) {
            json.addProperty("additionalInfo", getAdditionalInfo());
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
        if (jsonObject.has("reasonCode")) {
            setReasonCode(jsonObject.get("reasonCode").getAsString());
        }

        if (jsonObject.has("additionalInfo")) {
            setAdditionalInfo(jsonObject.get("additionalInfo").getAsString());
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
        if (!(obj instanceof StatusInfo))
            return false;
        StatusInfo that = (StatusInfo) obj;
        return Objects.equals(this.additionalInfo, that.additionalInfo)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.reasonCode, that.reasonCode);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.additionalInfo != null ? this.additionalInfo.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.reasonCode != null ? this.reasonCode.hashCode() : 0);
        return result;
    }
}
