
package maydo.ocpp.msgDef.Messages;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.CertificateActionEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.utils.JsonTools;

import javax.annotation.Generated;

public class Get15118EVCertificateRequest implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * Schema version currently used for the 15118 session between EV and Charging Station. Needed for parsing of the EXI stream by the CSMS.
     * 
     * 
     * (Required)
     * 
     */
    private String iso15118SchemaVersion;
    /**
     * Defines whether certificate needs to be installed or updated.
     * 
     * (Required)
     * 
     */
    private CertificateActionEnum action;
    /**
     * Raw CertificateInstallationReq request from EV, Base64 encoded.
     * 
     * (Required)
     * 
     */
    private String exiRequest;

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
     * Schema version currently used for the 15118 session between EV and Charging Station. Needed for parsing of the EXI stream by the CSMS.
     * 
     * 
     * (Required)
     * 
     */
    public String getIso15118SchemaVersion() {
        return iso15118SchemaVersion;
    }

    /**
     * Schema version currently used for the 15118 session between EV and Charging Station. Needed for parsing of the EXI stream by the CSMS.
     * 
     * 
     * (Required)
     * 
     */
    public void setIso15118SchemaVersion(String iso15118SchemaVersion) {
        this.iso15118SchemaVersion = iso15118SchemaVersion;
    }

    /**
     * Defines whether certificate needs to be installed or updated.
     * 
     * (Required)
     * 
     */
    public CertificateActionEnum getAction() {
        return action;
    }

    /**
     * Defines whether certificate needs to be installed or updated.
     * 
     * (Required)
     * 
     */
    public void setAction(CertificateActionEnum action) {
        this.action = action;
    }

    /**
     * Raw CertificateInstallationReq request from EV, Base64 encoded.
     * 
     * (Required)
     * 
     */
    public String getExiRequest() {
        return exiRequest;
    }

    /**
     * Raw CertificateInstallationReq request from EV, Base64 encoded.
     * 
     * (Required)
     * 
     */
    public void setExiRequest(String exiRequest) {
        this.exiRequest = exiRequest;
    }

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject(){
        return JsonTools.toJsonObject(this);
    }
}
