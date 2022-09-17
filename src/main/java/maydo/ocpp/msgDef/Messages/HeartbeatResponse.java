
package maydo.ocpp.msgDef.Messages;

import maydo.ocpp.msgDef.DataTypes.CustomData;

import java.util.Date;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class HeartbeatResponse {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * Contains the current time of the CSMS.
     * 
     * (Required)
     * 
     */
    private Date currentTime;

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
     * Contains the current time of the CSMS.
     * 
     * (Required)
     * 
     */
    public Date getCurrentTime() {
        return currentTime;
    }

    /**
     * Contains the current time of the CSMS.
     * 
     * (Required)
     * 
     */
    public void setCurrentTime(Date currentTime) {
        this.currentTime = currentTime;
    }

}
