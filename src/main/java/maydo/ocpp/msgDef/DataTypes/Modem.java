package maydo.ocpp.msgDef.DataTypes;

import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;

import java.util.Objects;

/**
 * Defines parameters required for initiating and maintaining wireless communication with other devices.
 * 
 * 
 */
public class Modem implements JsonInterface {

    /**
     * This contains the ICCID of the modem’s SIM card.
     */
    @Optional
    private String iccid;
    /**
     * This contains the IMSI of the modem’s SIM card.
     */
    @Optional
    private String imsi;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public Modem() {
    }

    /**
     * 
     * @param iccid
     *     This contains the ICCID of the modem’s SIM card.
     *     .
     * @param imsi
     *     This contains the IMSI of the modem’s SIM card.
     *     .
     */
    public Modem(String iccid, String imsi, CustomData customData) {
        super();
        this.iccid = iccid;
        this.imsi = imsi;
        this.customData = customData;
    }

    /**
     * This contains the ICCID of the modem’s SIM card.
     */
    public String getIccid() {
        return iccid;
    }

    /**
     * This contains the ICCID of the modem’s SIM card.
     */
    public void setIccid(String iccid) {
        this.iccid = iccid;
    }

    /**
     * This contains the IMSI of the modem’s SIM card.
     */
    public String getImsi() {
        return imsi;
    }

    /**
     * This contains the IMSI of the modem’s SIM card.
     */
    public void setImsi(String imsi) {
        this.imsi = imsi;
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
        return null;
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
        if (!(obj instanceof Modem))
            return false;
        Modem that = (Modem) obj;
        return Objects.equals(this.iccid, that.iccid)
                && Objects.equals(this.customData, that.customData) 
                && Objects.equals(this.imsi, that.imsi);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.iccid != null ? this.iccid.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.imsi != null ? this.imsi.hashCode() : 0);
        return result;
    }
}
