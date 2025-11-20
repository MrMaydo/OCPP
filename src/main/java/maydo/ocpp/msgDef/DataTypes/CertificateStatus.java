package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.Enumerations.CertificateStatusEnum;
import maydo.ocpp.msgDef.Enumerations.CertificateStatusSourceEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

import static maydo.ocpp.config.Configuration.DATE_FORMAT;

public class CertificateStatus implements JsonInterface {

    /**
     * (Required)
     */
    @Required
    private CertificateHashData certificateHashData;
    /**
     * Source of status: OCSP, CRL
     * <p>
     * (Required)
     */
    @Required
    private CertificateStatusSourceEnum source;
    /**
     * Status of certificate: good, revoked or unknown.
     * <p>
     * (Required)
     */
    @Required
    private CertificateStatusEnum status;
    /**
     * (Required)
     */
    @Required
    private Date nextUpdate;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public CertificateStatus() {
    }

    public CertificateStatus(CertificateHashData certificateHashData, CertificateStatusSourceEnum source, CertificateStatusEnum status, Date nextUpdate, CustomData customData) {
        super();
        this.certificateHashData = certificateHashData;
        this.source = source;
        this.status = status;
        this.nextUpdate = nextUpdate;
        this.customData = customData;
    }

    /**
     * (Required)
     */
    public CertificateHashData getCertificateHashData() {
        return certificateHashData;
    }

    /**
     * (Required)
     */
    public void setCertificateHashData(CertificateHashData certificateHashData) {
        this.certificateHashData = certificateHashData;
    }

    /**
     * Source of status: OCSP, CRL
     * <p>
     * (Required)
     */
    public CertificateStatusSourceEnum getSource() {
        return source;
    }

    /**
     * Source of status: OCSP, CRL
     * <p>
     * (Required)
     */
    public void setSource(CertificateStatusSourceEnum source) {
        this.source = source;
    }

    /**
     * Status of certificate: good, revoked or unknown.
     * <p>
     * (Required)
     */
    public CertificateStatusEnum getStatus() {
        return status;
    }

    /**
     * Status of certificate: good, revoked or unknown.
     * <p>
     * (Required)
     */
    public void setStatus(CertificateStatusEnum status) {
        this.status = status;
    }

    /**
     * (Required)
     */
    public Date getNextUpdate() {
        return nextUpdate;
    }

    /**
     * (Required)
     */
    public void setNextUpdate(Date nextUpdate) {
        this.nextUpdate = nextUpdate;
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
        JsonObject json = new JsonObject();
        json.add("certificateHashData", certificateHashData.toJsonObject());
        json.addProperty("source", source.toString());
        json.addProperty("status", status.toString());
        json.addProperty("nextUpdate", new SimpleDateFormat(DATE_FORMAT).format(nextUpdate));
        json.add("customData", customData.toJsonObject());
        return json;
    }

    @Override
    public void fromString(String jsonString) {
        JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
        fromJsonObject(jsonObject);
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        if (jsonObject.has("certificateHashData")) {
            this.certificateHashData = new CertificateHashData();
            this.certificateHashData.fromJsonObject(jsonObject.getAsJsonObject("certificateHashData"));
        }

        if (jsonObject.has("source")) {
            this.source = CertificateStatusSourceEnum.valueOf(jsonObject.get("source").getAsString());
        }

        if (jsonObject.has("status")) {
            this.status = CertificateStatusEnum.valueOf(jsonObject.get("status").getAsString());
        }

        if (jsonObject.has("nextUpdate")) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                this.nextUpdate = dateFormat.parse(jsonObject.get("nextUpdate").getAsString());
            } catch (ParseException e) {
                System.out.println("Invalid date format for nextUpdate" + e);
            }
        }

        if (jsonObject.has("customData")) {
            this.customData = new CustomData();
            this.customData.fromJsonObject(jsonObject.getAsJsonObject("customData"));
        }

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof CertificateStatus))
            return false;
        CertificateStatus that = (CertificateStatus) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.certificateHashData, that.certificateHashData)
                && Objects.equals(this.source, that.source)
                && Objects.equals(this.status, that.status)
                && Objects.equals(this.nextUpdate, that.nextUpdate);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.certificateHashData != null ? this.certificateHashData.hashCode() : 0);
        result = 31 * result + (this.source != null ? this.source.hashCode() : 0);
        result = 31 * result + (this.status != null ? this.status.hashCode() : 0);
        result = 31 * result + (this.nextUpdate != null ? this.nextUpdate.hashCode() : 0);
        return result;
    }
}
