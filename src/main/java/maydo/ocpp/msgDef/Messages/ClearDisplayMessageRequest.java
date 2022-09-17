
package maydo.ocpp.msgDef.Messages;

import maydo.ocpp.msgDef.DataTypes.CustomData;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class ClearDisplayMessageRequest {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * Id of the message that SHALL be removed from the Charging Station.
     * 
     * (Required)
     * 
     */
    private Integer id;

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
     * Id of the message that SHALL be removed from the Charging Station.
     * 
     * (Required)
     * 
     */
    public Integer getId() {
        return id;
    }

    /**
     * Id of the message that SHALL be removed from the Charging Station.
     * 
     * (Required)
     * 
     */
    public void setId(Integer id) {
        this.id = id;
    }

}
