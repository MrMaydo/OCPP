package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;

import java.util.Objects;


/**
 * Defines parameters required for initiating and maintaining wireless communication with other devices.
 */
public class Modem implements JsonInterface {

    /**
     * This contains the ICCID of the modem’s SIM card.
     */
    @Optional
    private String iccid;

    /**
     * This contains the IMSI of the modem’s SIM card
     */
    @Optional
    private String imsi;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public Modem() {
    }


    public Modem(String iccid, String imsi, CustomData customData) {
        super();
        this.iccid = iccid;
        this.imsi = imsi;
        this.customData = customData;
    }


    public String getIccid() {
        return iccid;
    }


    public void setIccid(String iccid) {
        this.iccid = iccid;
    }


    public String getImsi() {
        return imsi;
    }


    public void setImsi(String imsi) {
        this.imsi = imsi;
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
        json.addProperty("iccid", iccid);
        json.addProperty("imsi", imsi);
        json.add("customData", customData.toJsonObject());
        return json;
    }

    @Override
    public void fromString(String jsonString) {
        JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
        fromJsonObject(jsonObject);
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        if (jsonObject.has("iccid")) {
            this.iccid = jsonObject.get("iccid").getAsString();
        }

        if (jsonObject.has("imsi")) {
            this.imsi = jsonObject.get("imsi").getAsString();
        }

        if (jsonObject.has("customData")) {
            this.customData = new CustomData();
            this.customData.fromJsonObject(jsonObject.getAsJsonObject("customData"));
        }

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
