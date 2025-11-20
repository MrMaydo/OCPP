package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * Element providing more information about the status.
 */
public class StatusInfo implements JsonInterface {

    /**
     * A predefined code for the reason why the status is returned in this response. The string is case-insensitive.
     * <p>
     * (Required)
     */
    @Required
    private String reasonCode;
    /**
     * Additional text to provide detailed information.
     */
    @Optional
    private String additionalInfo;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public StatusInfo() {
    }

    /**
     * @param additionalInfo Additional text to provide detailed information.
     *                       .
     * @param reasonCode     A predefined code for the reason why the status is returned in this response. The string is case-insensitive.
     *                       .
     */
    public StatusInfo(String reasonCode, String additionalInfo, CustomData customData) {
        super();
        this.reasonCode = reasonCode;
        this.additionalInfo = additionalInfo;
        this.customData = customData;
    }

    /**
     * A predefined code for the reason why the status is returned in this response. The string is case-insensitive.
     * <p>
     * (Required)
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * A predefined code for the reason why the status is returned in this response. The string is case-insensitive.
     * <p>
     * (Required)
     */
    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * Additional text to provide detailed information.
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Additional text to provide detailed information.
     */
    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
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
        json.addProperty("reasonCode", reasonCode);
        json.addProperty("additionalInfo", additionalInfo);
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
