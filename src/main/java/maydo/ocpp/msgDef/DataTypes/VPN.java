package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.Enumerations.VPNEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.Objects;


/**
 * VPN
 * urn:x-oca:ocpp:uid:2:233268
 * VPN Configuration settings
 */
public class VPN implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
    /**
     * VPN. Server. URI
     * urn:x-oca:ocpp:uid:1:569272
     * VPN Server Address
     * <p>
     * (Required)
     */
    @Required
    private String server;
    /**
     * VPN. User. User_ Name
     * urn:x-oca:ocpp:uid:1:569273
     * VPN User
     * <p>
     * (Required)
     */
    @Required
    private String user;
    /**
     * VPN. Group. Group_ Name
     * urn:x-oca:ocpp:uid:1:569274
     * VPN group.
     */
    @Optional
    private String group;
    /**
     * VPN. Password. Password
     * urn:x-oca:ocpp:uid:1:569275
     * VPN Password.
     * <p>
     * (Required)
     */
    @Required
    private String password;
    /**
     * VPN. Key. VPN_ Key
     * urn:x-oca:ocpp:uid:1:569276
     * VPN shared secret.
     * <p>
     * (Required)
     */
    @Required
    private String key;
    /**
     * VPN. Type. VPN_ Code
     * urn:x-oca:ocpp:uid:1:569277
     * Type of VPN
     * <p>
     * (Required)
     */
    @Required
    private VPNEnum type;

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
     * VPN. Server. URI
     * urn:x-oca:ocpp:uid:1:569272
     * VPN Server Address
     * <p>
     * (Required)
     */
    public String getServer() {
        return server;
    }

    /**
     * VPN. Server. URI
     * urn:x-oca:ocpp:uid:1:569272
     * VPN Server Address
     * <p>
     * (Required)
     */
    public void setServer(String server) {
        this.server = server;
    }

    /**
     * VPN. User. User_ Name
     * urn:x-oca:ocpp:uid:1:569273
     * VPN User
     * <p>
     * (Required)
     */
    public String getUser() {
        return user;
    }

    /**
     * VPN. User. User_ Name
     * urn:x-oca:ocpp:uid:1:569273
     * VPN User
     * <p>
     * (Required)
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * VPN. Group. Group_ Name
     * urn:x-oca:ocpp:uid:1:569274
     * VPN group.
     */
    public String getGroup() {
        return group;
    }

    /**
     * VPN. Group. Group_ Name
     * urn:x-oca:ocpp:uid:1:569274
     * VPN group.
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * VPN. Password. Password
     * urn:x-oca:ocpp:uid:1:569275
     * VPN Password.
     * <p>
     * (Required)
     */
    public String getPassword() {
        return password;
    }

    /**
     * VPN. Password. Password
     * urn:x-oca:ocpp:uid:1:569275
     * VPN Password.
     * <p>
     * (Required)
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * VPN. Key. VPN_ Key
     * urn:x-oca:ocpp:uid:1:569276
     * VPN shared secret.
     * <p>
     * (Required)
     */
    public String getKey() {
        return key;
    }

    /**
     * VPN. Key. VPN_ Key
     * urn:x-oca:ocpp:uid:1:569276
     * VPN shared secret.
     * <p>
     * (Required)
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * VPN. Type. VPN_ Code
     * urn:x-oca:ocpp:uid:1:569277
     * Type of VPN
     * <p>
     * (Required)
     */
    public VPNEnum getType() {
        return type;
    }

    /**
     * VPN. Type. VPN_ Code
     * urn:x-oca:ocpp:uid:1:569277
     * Type of VPN
     * <p>
     * (Required)
     */
    public void setType(VPNEnum type) {
        this.type = type;
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
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof VPN))
            return false;
        VPN that = (VPN) obj;
        return Objects.equals(customData, that.customData)
                && Objects.equals(server, that.server)
                && Objects.equals(user, that.user)
                && Objects.equals(group, that.group)
                && Objects.equals(password, that.password)
                && Objects.equals(key, that.key)
                && type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(customData, server, user, group, password, key, type);
    }
}
