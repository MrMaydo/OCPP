package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 *
 */
public class EnterServiceGet implements JsonInterface {

    /**
     * Enter Service settings
     */
    @Required
    private EnterService enterService;

    /**
     * Id of setting
     */
    @Required
    private String id;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public EnterServiceGet() {
    }


    public EnterService getEnterService() {
        return enterService;
    }


    public void setEnterService(EnterService enterService) {
        this.enterService = enterService;
    }


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
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

        json.add("enterService", getEnterService().toJsonObject());

        json.addProperty("id", getId());

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
        if (jsonObject.has("enterService")) {
            setEnterService(new EnterService());
            getEnterService().fromJsonObject(jsonObject.getAsJsonObject("enterService"));
        }

        if (jsonObject.has("id")) {
            setId(jsonObject.get("id").getAsString());
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
        if (!(obj instanceof EnterServiceGet))
            return false;
        EnterServiceGet that = (EnterServiceGet) obj;
        return Objects.equals(this.enterService, that.enterService)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getEnterService(),
                getId(),
                getCustomData()
        );
    }
}
