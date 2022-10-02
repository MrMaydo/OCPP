
package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.utils.JsonTools;

import javax.annotation.Generated;


/**
 * Wireless_ Communication_ Module
 * urn:x-oca:ocpp:uid:2:233306
 * Defines parameters required for initiating and maintaining wireless communication with other devices.
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class Modem implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * Wireless_ Communication_ Module. ICCID. CI20_ Text
     * urn:x-oca:ocpp:uid:1:569327
     * This contains the ICCID of the modem’s SIM card.
     * 
     * 
     */
    private String iccid;
    /**
     * Wireless_ Communication_ Module. IMSI. CI20_ Text
     * urn:x-oca:ocpp:uid:1:569328
     * This contains the IMSI of the modem’s SIM card.
     * 
     * 
     */
    private String imsi;

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
     * Wireless_ Communication_ Module. ICCID. CI20_ Text
     * urn:x-oca:ocpp:uid:1:569327
     * This contains the ICCID of the modem’s SIM card.
     * 
     * 
     */
    public String getIccid() {
        return iccid;
    }

    /**
     * Wireless_ Communication_ Module. ICCID. CI20_ Text
     * urn:x-oca:ocpp:uid:1:569327
     * This contains the ICCID of the modem’s SIM card.
     * 
     * 
     */
    public void setIccid(String iccid) {
        this.iccid = iccid;
    }

    /**
     * Wireless_ Communication_ Module. IMSI. CI20_ Text
     * urn:x-oca:ocpp:uid:1:569328
     * This contains the IMSI of the modem’s SIM card.
     * 
     * 
     */
    public String getImsi() {
        return imsi;
    }

    /**
     * Wireless_ Communication_ Module. IMSI. CI20_ Text
     * urn:x-oca:ocpp:uid:1:569328
     * This contains the IMSI of the modem’s SIM card.
     * 
     * 
     */
    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonElement toJsonObject(){
        JsonElement jsonObject= new Gson().toJsonTree(this);
        return jsonObject;
    }
}
