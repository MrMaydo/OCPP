
package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.utils.JsonTools;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.annotation.Generated;

import static maydo.ocpp.config.Configuration.DATE_FORMAT;


/**
 * Firmware
 * urn:x-enexis:ecdm:uid:2:233291
 * Represents a copy of the firmware that can be loaded/updated on the Charging Station.
 * 
 * 
 */
public class Firmware implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * Firmware. Location. URI
     * urn:x-enexis:ecdm:uid:1:569460
     * URI defining the origin of the firmware.
     * 
     * (Required)
     * 
     */
    private String location;
    /**
     * Firmware. Retrieve. Date_ Time
     * urn:x-enexis:ecdm:uid:1:569461
     * Date and time at which the firmware shall be retrieved.
     * 
     * (Required)
     * 
     */
    private Date retrieveDateTime;
    /**
     * Firmware. Install. Date_ Time
     * urn:x-enexis:ecdm:uid:1:569462
     * Date and time at which the firmware shall be installed.
     * 
     * 
     */
    private Date installDateTime;
    /**
     * Certificate with which the firmware was signed.
     * PEM encoded X.509 certificate.
     * 
     * 
     */
    private String signingCertificate;
    /**
     * Firmware. Signature. Signature
     * urn:x-enexis:ecdm:uid:1:569464
     * Base64 encoded firmware signature.
     * 
     * 
     */
    private String signature;

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
     * Firmware. Location. URI
     * urn:x-enexis:ecdm:uid:1:569460
     * URI defining the origin of the firmware.
     * 
     * (Required)
     * 
     */
    public String getLocation() {
        return location;
    }

    /**
     * Firmware. Location. URI
     * urn:x-enexis:ecdm:uid:1:569460
     * URI defining the origin of the firmware.
     * 
     * (Required)
     * 
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Firmware. Retrieve. Date_ Time
     * urn:x-enexis:ecdm:uid:1:569461
     * Date and time at which the firmware shall be retrieved.
     * 
     * (Required)
     * 
     */
    public Date getRetrieveDateTime() {
        return retrieveDateTime;
    }

    /**
     * Firmware. Retrieve. Date_ Time
     * urn:x-enexis:ecdm:uid:1:569461
     * Date and time at which the firmware shall be retrieved.
     * 
     * (Required)
     * 
     */
    public void setRetrieveDateTime(Date retrieveDateTime) {
        this.retrieveDateTime = retrieveDateTime;
    }

    /**
     * Firmware. Install. Date_ Time
     * urn:x-enexis:ecdm:uid:1:569462
     * Date and time at which the firmware shall be installed.
     * 
     * 
     */
    public Date getInstallDateTime() {
        return installDateTime;
    }

    /**
     * Firmware. Install. Date_ Time
     * urn:x-enexis:ecdm:uid:1:569462
     * Date and time at which the firmware shall be installed.
     * 
     * 
     */
    public void setInstallDateTime(Date installDateTime) {
        this.installDateTime = installDateTime;
    }

    /**
     * Certificate with which the firmware was signed.
     * PEM encoded X.509 certificate.
     * 
     * 
     */
    public String getSigningCertificate() {
        return signingCertificate;
    }

    /**
     * Certificate with which the firmware was signed.
     * PEM encoded X.509 certificate.
     * 
     * 
     */
    public void setSigningCertificate(String signingCertificate) {
        this.signingCertificate = signingCertificate;
    }

    /**
     * Firmware. Signature. Signature
     * urn:x-enexis:ecdm:uid:1:569464
     * Base64 encoded firmware signature.
     * 
     * 
     */
    public String getSignature() {
        return signature;
    }

    /**
     * Firmware. Signature. Signature
     * urn:x-enexis:ecdm:uid:1:569464
     * Base64 encoded firmware signature.
     * 
     * 
     */
    public void setSignature(String signature) {
        this.signature = signature;
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
