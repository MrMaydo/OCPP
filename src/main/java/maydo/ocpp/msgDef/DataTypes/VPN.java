package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.Enumerations.VPNEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * VPN Configuration settings
 */
public class VPN implements JsonInterface {

    /**
     * VPN Server Address
     */
    @Required
    private String server;

    /**
     * VPN User
     */
    @Required
    private String user;

    /**
     * VPN group.
     */
    @Optional
    private String group;

    /**
     * (2.1) VPN Password.
     */
    @Required
    private String password;

    /**
     * VPN shared secret.
     */
    @Required
    private String key;

    /**
     * Type of VPN
     */
    @Required
    private VPNEnum type;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public VPN() {
    }


    public String getServer() {
        return server;
    }


    public void setServer(String server) {
        this.server = server;
    }


    public String getUser() {
        return user;
    }


    public void setUser(String user) {
        this.user = user;
    }


    public String getGroup() {
        return group;
    }


    public void setGroup(String group) {
        this.group = group;
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }


    public String getKey() {
        return key;
    }


    public void setKey(String key) {
        this.key = key;
    }


    public VPNEnum getType() {
        return type;
    }


    public void setType(VPNEnum type) {
        this.type = type;
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

        json.addProperty("server", getServer());

        json.addProperty("user", getUser());

        if (getGroup() != null) {
            json.addProperty("group", getGroup());
        }
        json.addProperty("password", getPassword());

        json.addProperty("key", getKey());

        json.addProperty("type", getType().toString());

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
        if (jsonObject.has("server")) {
            setServer(jsonObject.get("server").getAsString());
        }

        if (jsonObject.has("user")) {
            setUser(jsonObject.get("user").getAsString());
        }

        if (jsonObject.has("group")) {
            setGroup(jsonObject.get("group").getAsString());
        }

        if (jsonObject.has("password")) {
            setPassword(jsonObject.get("password").getAsString());
        }

        if (jsonObject.has("key")) {
            setKey(jsonObject.get("key").getAsString());
        }

        if (jsonObject.has("type")) {
            setType(VPNEnum.valueOf(jsonObject.get("type").getAsString()));
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
        if (!(obj instanceof VPN))
            return false;
        VPN that = (VPN) obj;
        return Objects.equals(this.server, that.server)
                && Objects.equals(this.password, that.password)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.type, that.type)
                && Objects.equals(this.user, that.user)
                && Objects.equals(this.key, that.key)
                && Objects.equals(this.group, that.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getServer(),
                getUser(),
                getGroup(),
                getPassword(),
                getKey(),
                getType(),
                getCustomData()
        );
    }
}
