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

        if (getIccid() != null) {
            json.addProperty("iccid", getIccid());
        }
        if (getImsi() != null) {
            json.addProperty("imsi", getImsi());
        }
        if (getCustomData() != null) {
            json.add("customData", getCustomData().toJsonObject());
        }

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
            setIccid(jsonObject.get("iccid").getAsString());
        }

        if (jsonObject.has("imsi")) {
            setImsi(jsonObject.get("imsi").getAsString());
        }

        if (jsonObject.has("customData")) {
            setCustomData(new CustomData());
            getCustomData().fromJsonObject(jsonObject.getAsJsonObject("customData"));
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Modem))
            return false;
        Modem that = (Modem) obj;
        return Objects.equals(getIccid(), that.getIccid())
                && Objects.equals(getImsi(), that.getImsi())
                && Objects.equals(getCustomData(), that.getCustomData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getIccid(),
                getImsi(),
                getCustomData()
        );
    }
}
