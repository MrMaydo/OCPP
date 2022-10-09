package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.utils.JsonTools;


/**
 * Element providing more information about the status.
 */
public class StatusInfo implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    private CustomData customData;
    /**
     * A predefined code for the reason why the status is returned in this response. The string is case-insensitive.
     * <p>
     * (Required)
     */
    private String reasonCode;
    /**
     * Additional text to provide detailed information.
     */
    private String additionalInfo;

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

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject() {
        return JsonTools.toJsonObject(this);
    }
}
