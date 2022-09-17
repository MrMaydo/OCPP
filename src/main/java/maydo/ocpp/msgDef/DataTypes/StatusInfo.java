
package maydo.ocpp.msgDef.DataTypes;

import javax.annotation.Generated;


/**
 * Element providing more information about the status.
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class StatusInfo {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * A predefined code for the reason why the status is returned in this response. The string is case-insensitive.
     * 
     * (Required)
     * 
     */
    private String reasonCode;
    /**
     * Additional text to provide detailed information.
     * 
     * 
     */
    private String additionalInfo;

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
     * A predefined code for the reason why the status is returned in this response. The string is case-insensitive.
     * 
     * (Required)
     * 
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * A predefined code for the reason why the status is returned in this response. The string is case-insensitive.
     * 
     * (Required)
     * 
     */
    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * Additional text to provide detailed information.
     * 
     * 
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Additional text to provide detailed information.
     * 
     * 
     */
    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

}
