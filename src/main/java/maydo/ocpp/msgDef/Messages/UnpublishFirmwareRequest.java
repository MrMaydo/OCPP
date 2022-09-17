
package maydo.ocpp.msgDef.Messages;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class UnpublishFirmwareRequest {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * The MD5 checksum over the entire firmware file as a hexadecimal string of length 32. 
     * 
     * (Required)
     * 
     */
    private String checksum;

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
     * The MD5 checksum over the entire firmware file as a hexadecimal string of length 32. 
     * 
     * (Required)
     * 
     */
    public String getChecksum() {
        return checksum;
    }

    /**
     * The MD5 checksum over the entire firmware file as a hexadecimal string of length 32. 
     * 
     * (Required)
     * 
     */
    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

}