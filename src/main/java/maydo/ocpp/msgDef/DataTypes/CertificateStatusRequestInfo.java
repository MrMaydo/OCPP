package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.Enumerations.CertificateStatusSourceEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Data necessary to request the revocation status of a certificate
 */
public class CertificateStatusRequestInfo implements JsonInterface {

    /**
     * Hash data of certificate.
     */
    @Required
    private CertificateHashData certificateHashData;

    /**
     * Source of status: OCSP, CRL
     */
    @Required
    private CertificateStatusSourceEnum source;

    /**
     * URL(s) of source.
     */
    @Required
    private List<String> urls;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public CertificateStatusRequestInfo() {
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


    public List<String> getUrls() {
        return urls;
    }


    public void setUrls(List<String> urls) {
        this.urls = urls;
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

        json.addProperty("source", getSource().toString());

        JsonArray urlsArray = new JsonArray();
        for (String item : getUrls()) {
            urlsArray.add(item);
        }
        json.add("urls", urlsArray);

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

        if (jsonObject.has("source")) {
            setSource(CertificateStatusSourceEnum.valueOf(jsonObject.get("source").getAsString()));
        }

        if (jsonObject.has("urls")) {
            setUrls(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("urls");
            for (JsonElement el : arr) {
                getUrls().add(el.getAsString());
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
        if (!(obj instanceof CertificateStatusRequestInfo))
            return false;
        CertificateStatusRequestInfo that = (CertificateStatusRequestInfo) obj;
        return Objects.equals(this.urls, that.urls)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.certificateHashData, that.certificateHashData)
                && Objects.equals(this.source, that.source);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getCertificateHashData(),
                getSource(),
                getUrls(),
                getCustomData()
        );
    }
}
