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

/**
 * Revocation status of certificate
 */
public class CertificateStatus implements JsonInterface {

    /**
     * Hash data of the certificate.
     */
    @Required
    private CertificateHashData certificateHashData;

    /**
     * Status of certificate: good, revoked or unknown.
     */
    @Required
    private CertificateStatusEnum status;

    /**
     * Source of status: OCSP, CRL
     */
    @Required
    private CertificateStatusSourceEnum source;

    /**
     *
     */
    @Required
    private Date nextUpdate;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public CertificateStatus() {
    }


    public CertificateHashData getCertificateHashData() {
        return certificateHashData;
    }


    public void setCertificateHashData(CertificateHashData certificateHashData) {
        this.certificateHashData = certificateHashData;
    }


    public CertificateStatusSourceEnum getSource() {
        return source;
    }


    public void setSource(CertificateStatusSourceEnum source) {
        this.source = source;
    }


    public CertificateStatusEnum getStatus() {
        return status;
    }


    public void setStatus(CertificateStatusEnum status) {
        this.status = status;
    }


    public Date getNextUpdate() {
        return nextUpdate;
    }


    public void setNextUpdate(Date nextUpdate) {
        this.nextUpdate = nextUpdate;
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

        json.add("certificateHashData", getCertificateHashData().toJsonObject());

        json.addProperty("status", getStatus().toString());

        json.addProperty("source", getSource().toString());

        json.addProperty("nextUpdate", new SimpleDateFormat(DATE_FORMAT).format(getNextUpdate()));

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
        if (jsonObject.has("certificateHashData")) {
            setCertificateHashData(new CertificateHashData());
            getCertificateHashData().fromJsonObject(jsonObject.getAsJsonObject("certificateHashData"));
        }

        if (jsonObject.has("status")) {
            setStatus(CertificateStatusEnum.valueOf(jsonObject.get("status").getAsString()));
        }

        if (jsonObject.has("source")) {
            setSource(CertificateStatusSourceEnum.valueOf(jsonObject.get("source").getAsString()));
        }

        if (jsonObject.has("nextUpdate")) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                setNextUpdate(dateFormat.parse(jsonObject.get("nextUpdate").getAsString()));
            } catch (ParseException e) {
                System.out.println("Invalid date format for nextUpdate" + e);
            }
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
