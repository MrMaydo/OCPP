
package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.Enumerations.VPNEnum;
import maydo.ocpp.msgDef.JsonInterface;

import javax.annotation.Generated;


/**
 * VPN
 * urn:x-oca:ocpp:uid:2:233268
 * VPN Configuration settings
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class VPN implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * VPN. Server. URI
     * urn:x-oca:ocpp:uid:1:569272
     * VPN Server Address
     * 
     * (Required)
     * 
     */
    private String server;
    /**
     * VPN. User. User_ Name
     * urn:x-oca:ocpp:uid:1:569273
     * VPN User
     * 
     * (Required)
     * 
     */
    private String user;
    /**
     * VPN. Group. Group_ Name
     * urn:x-oca:ocpp:uid:1:569274
     * VPN group.
     * 
     * 
     */
    private String group;
    /**
     * VPN. Password. Password
     * urn:x-oca:ocpp:uid:1:569275
     * VPN Password.
     * 
     * (Required)
     * 
     */
    private String password;
    /**
     * VPN. Key. VPN_ Key
     * urn:x-oca:ocpp:uid:1:569276
     * VPN shared secret.
     * 
     * (Required)
     * 
     */
    private String key;
    /**
     * VPN. Type. VPN_ Code
     * urn:x-oca:ocpp:uid:1:569277
     * Type of VPN
     * 
     * (Required)
     * 
     */
    private VPNEnum type;

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
     * VPN. Server. URI
     * urn:x-oca:ocpp:uid:1:569272
     * VPN Server Address
     * 
     * (Required)
     * 
     */
    public String getServer() {
        return server;
    }

    /**
     * VPN. Server. URI
     * urn:x-oca:ocpp:uid:1:569272
     * VPN Server Address
     * 
     * (Required)
     * 
     */
    public void setServer(String server) {
        this.server = server;
    }

    /**
     * VPN. User. User_ Name
     * urn:x-oca:ocpp:uid:1:569273
     * VPN User
     * 
     * (Required)
     * 
     */
    public String getUser() {
        return user;
    }

    /**
     * VPN. User. User_ Name
     * urn:x-oca:ocpp:uid:1:569273
     * VPN User
     * 
     * (Required)
     * 
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * VPN. Group. Group_ Name
     * urn:x-oca:ocpp:uid:1:569274
     * VPN group.
     * 
     * 
     */
    public String getGroup() {
        return group;
    }

    /**
     * VPN. Group. Group_ Name
     * urn:x-oca:ocpp:uid:1:569274
     * VPN group.
     * 
     * 
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * VPN. Password. Password
     * urn:x-oca:ocpp:uid:1:569275
     * VPN Password.
     * 
     * (Required)
     * 
     */
    public String getPassword() {
        return password;
    }

    /**
     * VPN. Password. Password
     * urn:x-oca:ocpp:uid:1:569275
     * VPN Password.
     * 
     * (Required)
     * 
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * VPN. Key. VPN_ Key
     * urn:x-oca:ocpp:uid:1:569276
     * VPN shared secret.
     * 
     * (Required)
     * 
     */
    public String getKey() {
        return key;
    }

    /**
     * VPN. Key. VPN_ Key
     * urn:x-oca:ocpp:uid:1:569276
     * VPN shared secret.
     * 
     * (Required)
     * 
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * VPN. Type. VPN_ Code
     * urn:x-oca:ocpp:uid:1:569277
     * Type of VPN
     * 
     * (Required)
     * 
     */
    public VPNEnum getType() {
        return type;
    }

    /**
     * VPN. Type. VPN_ Code
     * urn:x-oca:ocpp:uid:1:569277
     * Type of VPN
     * 
     * (Required)
     * 
     */
    public void setType(VPNEnum type) {
        this.type = type;
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
