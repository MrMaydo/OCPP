package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.Enumerations.VPNEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class VPN implements JsonInterface {

    /**
     * VPN Server Address
     * <p>
     * (Required)
     */
    @Required
    private String server;
    /**
     * VPN User
     * <p>
     * (Required)
     */
    @Required
    private String user;
    /**
     * VPN group.
     */
    @Optional
    private String group;
    /**
     * *(2.1)* VPN Password.
     * <p>
     * (Required)
     */
    @Required
    private String password;
    /**
     * VPN shared secret.
     * <p>
     * (Required)
     */
    @Required
    private String key;
    /**
     * Type of VPN
     * <p>
     * (Required)
     */
    @Required
    private VPNEnum type;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public VPN() {
    }

    /**
     * @param server   VPN Server Address
     *                 .
     * @param password *(2.1)* VPN Password.
     *                 .
     * @param user     VPN User
     *                 .
     * @param key      VPN shared secret.
     *                 .
     * @param group    VPN group.
     *                 .
     */
    public VPN(String server, String user, String group, String password, String key, VPNEnum type, CustomData customData) {
        super();
        this.server = server;
        this.user = user;
        this.group = group;
        this.password = password;
        this.key = key;
        this.type = type;
        this.customData = customData;
    }

    /**
     * VPN Server Address
     * <p>
     * (Required)
     */
    public String getServer() {
        return server;
    }

    /**
     * VPN Server Address
     * <p>
     * (Required)
     */
    public void setServer(String server) {
        this.server = server;
    }

    /**
     * VPN User
     * <p>
     * (Required)
     */
    public String getUser() {
        return user;
    }

    /**
     * VPN User
     * <p>
     * (Required)
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * VPN group.
     */
    public String getGroup() {
        return group;
    }

    /**
     * VPN group.
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * *(2.1)* VPN Password.
     * <p>
     * (Required)
     */
    public String getPassword() {
        return password;
    }

    /**
     * *(2.1)* VPN Password.
     * <p>
     * (Required)
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * VPN shared secret.
     * <p>
     * (Required)
     */
    public String getKey() {
        return key;
    }

    /**
     * VPN shared secret.
     * <p>
     * (Required)
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Type of VPN
     * <p>
     * (Required)
     */
    public VPNEnum getType() {
        return type;
    }

    /**
     * Type of VPN
     * <p>
     * (Required)
     */
    public void setType(VPNEnum type) {
        this.type = type;
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
        int result = 1;
        result = 31 * result + (this.server != null ? this.server.hashCode() : 0);
        result = 31 * result + (this.password != null ? this.password.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.type != null ? this.type.hashCode() : 0);
        result = 31 * result + (this.user != null ? this.user.hashCode() : 0);
        result = 31 * result + (this.key != null ? this.key.hashCode() : 0);
        result = 31 * result + (this.group != null ? this.group.hashCode() : 0);
        return result;
    }
}
