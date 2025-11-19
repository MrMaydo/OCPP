package maydo.ocpp.msgDef.DataTypes;

import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Date;
import java.util.Objects;

public class Firmware {

    /**
     * URI defining the origin of the firmware.
     * 
     * (Required)
     */
    @Required
    private String location;
    /**
     * Date and time at which the firmware shall be retrieved.
     * 
     * (Required)
     */
    @Required
    private Date retrieveDateTime;
    /**
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
     * Base64 encoded firmware signature.
     */
    @Optional
    private String signature;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public Firmware() {
    }

    /**
     * 
     * @param signingCertificate
     *     Certificate with which the firmware was signed.
     *     PEM encoded X.509 certificate.
     *     .
     * @param retrieveDateTime
     *     Date and time at which the firmware shall be retrieved.
     *     .
     * @param signature
     *     Base64 encoded firmware signature.
     *     .
     * @param location
     *     URI defining the origin of the firmware.
     *     .
     * @param installDateTime
     *     Date and time at which the firmware shall be installed.
     *     .
     */
    public Firmware(String location, Date retrieveDateTime, Date installDateTime, String signingCertificate, String signature, CustomData customData) {
        super();
        this.location = location;
        this.retrieveDateTime = retrieveDateTime;
        this.installDateTime = installDateTime;
        this.signingCertificate = signingCertificate;
        this.signature = signature;
        this.customData = customData;
    }

    /**
     * URI defining the origin of the firmware.
     * 
     * (Required)
     */
    public String getLocation() {
        return location;
    }

    /**
     * URI defining the origin of the firmware.
     * 
     * (Required)
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Date and time at which the firmware shall be retrieved.
     * 
     * (Required)
     */
    public Date getRetrieveDateTime() {
        return retrieveDateTime;
    }

    /**
     * Date and time at which the firmware shall be retrieved.
     * 
     * (Required)
     */
    public void setRetrieveDateTime(Date retrieveDateTime) {
        this.retrieveDateTime = retrieveDateTime;
    }

    /**
     * Date and time at which the firmware shall be installed.
     */
    public Date getInstallDateTime() {
        return installDateTime;
    }

    /**
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
     * Base64 encoded firmware signature.
     */
    public String getSignature() {
        return signature;
    }

    /**
     * Base64 encoded firmware signature.
     */
    public void setSignature(String signature) {
        this.signature = signature;
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
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Firmware))
            return false;
        Firmware that = (Firmware) obj;
        return Objects.equals(this.signingCertificate, that.signingCertificate)
                && Objects.equals(this.retrieveDateTime, that.retrieveDateTime) 
                && Objects.equals(this.signature, that.signature) 
                && Objects.equals(this.location, that.location) 
                && Objects.equals(this.customData, that.customData) 
                && Objects.equals(this.installDateTime, that.installDateTime);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.signingCertificate != null ? this.signingCertificate.hashCode() : 0);
        result = 31 * result + (this.retrieveDateTime != null ? this.retrieveDateTime.hashCode() : 0);
        result = 31 * result + (this.signature != null ? this.signature.hashCode() : 0);
        result = 31 * result + (this.location != null ? this.location.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.installDateTime != null ? this.installDateTime.hashCode() : 0);
        return result;
    }
}
