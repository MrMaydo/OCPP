package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.Date;
import java.util.Objects;


/**
 * Firmware
 * urn:x-enexis:ecdm:uid:2:233291
 * Represents a copy of the firmware that can be loaded/updated on the Charging Station.
 */
public class Firmware implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
    /**
     * Firmware. Location. URI
     * urn:x-enexis:ecdm:uid:1:569460
     * URI defining the origin of the firmware.
     * <p>
     * (Required)
     */
    @Required
    private String location;
    /**
     * Firmware. Retrieve. Date_ Time
     * urn:x-enexis:ecdm:uid:1:569461
     * Date and time at which the firmware shall be retrieved.
     * <p>
     * (Required)
     */
    @Required
    private Date retrieveDateTime;
    /**
     * Firmware. Install. Date_ Time
     * urn:x-enexis:ecdm:uid:1:569462
     * Date and time at which the firmware shall be installed.
     */
    @Optional
    private Date installDateTime;
    /**
     * Certificate with which the firmware was signed.
     * PEM encoded X.509 certificate.
     */
    @Optional
    private String signingCertificate;
    /**
     * Firmware. Signature. Signature
     * urn:x-enexis:ecdm:uid:1:569464
     * Base64 encoded firmware signature.
     */
    @Optional
    private String signature;

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
     * Firmware. Location. URI
     * urn:x-enexis:ecdm:uid:1:569460
     * URI defining the origin of the firmware.
     * <p>
     * (Required)
     */
    public String getLocation() {
        return location;
    }

    /**
     * Firmware. Location. URI
     * urn:x-enexis:ecdm:uid:1:569460
     * URI defining the origin of the firmware.
     * <p>
     * (Required)
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Firmware. Retrieve. Date_ Time
     * urn:x-enexis:ecdm:uid:1:569461
     * Date and time at which the firmware shall be retrieved.
     * <p>
     * (Required)
     */
    public Date getRetrieveDateTime() {
        return retrieveDateTime;
    }

    /**
     * Firmware. Retrieve. Date_ Time
     * urn:x-enexis:ecdm:uid:1:569461
     * Date and time at which the firmware shall be retrieved.
     * <p>
     * (Required)
     */
    public void setRetrieveDateTime(Date retrieveDateTime) {
        this.retrieveDateTime = retrieveDateTime;
    }

    /**
     * Firmware. Install. Date_ Time
     * urn:x-enexis:ecdm:uid:1:569462
     * Date and time at which the firmware shall be installed.
     */
    public Date getInstallDateTime() {
        return installDateTime;
    }

    /**
     * Firmware. Install. Date_ Time
     * urn:x-enexis:ecdm:uid:1:569462
     * Date and time at which the firmware shall be installed.
     */
    public void setInstallDateTime(Date installDateTime) {
        this.installDateTime = installDateTime;
    }

    /**
     * Certificate with which the firmware was signed.
     * PEM encoded X.509 certificate.
     */
    public String getSigningCertificate() {
        return signingCertificate;
    }

    /**
     * Certificate with which the firmware was signed.
     * PEM encoded X.509 certificate.
     */
    public void setSigningCertificate(String signingCertificate) {
        this.signingCertificate = signingCertificate;
    }

    /**
     * Firmware. Signature. Signature
     * urn:x-enexis:ecdm:uid:1:569464
     * Base64 encoded firmware signature.
     */
    public String getSignature() {
        return signature;
    }

    /**
     * Firmware. Signature. Signature
     * urn:x-enexis:ecdm:uid:1:569464
     * Base64 encoded firmware signature.
     */
    public void setSignature(String signature) {
        this.signature = signature;
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
        if (!(obj instanceof Firmware))
            return false;
        Firmware that = (Firmware) obj;
        return Objects.equals(customData, that.customData)
                && Objects.equals(location, that.location)
                && Objects.equals(retrieveDateTime, that.retrieveDateTime)
                && Objects.equals(installDateTime, that.installDateTime)
                && Objects.equals(signingCertificate, that.signingCertificate)
                && Objects.equals(signature, that.signature);
    }

    @Override
    public int hashCode() {
        int result = (location != null ? location.hashCode() : 0);
        result = 31 * result + (retrieveDateTime != null ? retrieveDateTime.hashCode() : 0);
        result = 31 * result + (installDateTime != null ? installDateTime.hashCode() : 0);
        result = 31 * result + (signingCertificate != null ? signingCertificate.hashCode() : 0);
        result = 31 * result + (signature != null ? signature.hashCode() : 0);
        result = 31 * result + (customData != null ? customData.hashCode() : 0);
        return result;
    }
}
