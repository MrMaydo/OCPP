package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.utils.JsonTools;

import java.util.Objects;


/**
 * Wireless_ Communication_ Module
 * urn:x-oca:ocpp:uid:2:233306
 * Defines parameters required for initiating and maintaining wireless communication with other devices.
 */
public class Modem implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
    /**
     * Wireless_ Communication_ Module. ICCID. CI20_ Text
     * urn:x-oca:ocpp:uid:1:569327
     * This contains the ICCID of the modem’s SIM card.
     */
    @Optional
    private String iccid;
    /**
     * Wireless_ Communication_ Module. IMSI. CI20_ Text
     * urn:x-oca:ocpp:uid:1:569328
     * This contains the IMSI of the modem’s SIM card.
     */
    @Optional
    private String imsi;

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
     * Wireless_ Communication_ Module. ICCID. CI20_ Text
     * urn:x-oca:ocpp:uid:1:569327
     * This contains the ICCID of the modem’s SIM card.
     */
    public String getIccid() {
        return iccid;
    }

    /**
     * Wireless_ Communication_ Module. ICCID. CI20_ Text
     * urn:x-oca:ocpp:uid:1:569327
     * This contains the ICCID of the modem’s SIM card.
     */
    public void setIccid(String iccid) {
        this.iccid = iccid;
    }

    /**
     * Wireless_ Communication_ Module. IMSI. CI20_ Text
     * urn:x-oca:ocpp:uid:1:569328
     * This contains the IMSI of the modem’s SIM card.
     */
    public String getImsi() {
        return imsi;
    }

    /**
     * Wireless_ Communication_ Module. IMSI. CI20_ Text
     * urn:x-oca:ocpp:uid:1:569328
     * This contains the IMSI of the modem’s SIM card.
     */
    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject() {
        return JsonTools.toJsonObject(this);
    }

    @Override
    public void fromString(String jsonString) {
        JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
        fromJsonObject(jsonObject);
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        JsonTools.fromJsonObject(this, jsonObject);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Modem))
            return false;
        Modem that = (Modem) obj;
        return Objects.equals(customData, that.customData)
                && Objects.equals(iccid, that.iccid)
                && Objects.equals(imsi, that.imsi);
    }

    @Override
    public int hashCode() {
        int result = (iccid != null ? iccid.hashCode() : 0);
        result = 31 * result + (imsi != null ? imsi.hashCode() : 0);
        result = 31 * result + (customData != null ? customData.hashCode() : 0);
        return result;
    }
}
