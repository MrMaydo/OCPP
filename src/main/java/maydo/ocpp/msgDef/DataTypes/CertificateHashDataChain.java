package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.Enumerations.GetCertificateIdUseEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 */
public class CertificateHashDataChain implements JsonInterface {

    /**
     * Indicates the type of the requested certificate(s)
     */
    @Required
    private GetCertificateIdUseEnum certificateType;

    /**
     * Information to identify a certificate.
     */
    @Required
    private CertificateHashData certificateHashData;

    /**
     * Information to identify the child certificate(s).
     */
    @Optional
    private List<CertificateHashData> childCertificateHashData;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public CertificateHashDataChain() {
    }


    public CertificateHashData getCertificateHashData() {
        return certificateHashData;
    }


    public void setCertificateHashData(CertificateHashData certificateHashData) {
        this.certificateHashData = certificateHashData;
    }


    public GetCertificateIdUseEnum getCertificateType() {
        return certificateType;
    }


    public void setCertificateType(GetCertificateIdUseEnum certificateType) {
        this.certificateType = certificateType;
    }

    public List<CertificateHashData> getChildCertificateHashData() {
        return childCertificateHashData;
    }

    public void setChildCertificateHashData(List<CertificateHashData> childCertificateHashData) {
        this.childCertificateHashData = childCertificateHashData;
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

        json.addProperty("certificateType", getCertificateType().toString());

        json.add("certificateHashData", getCertificateHashData().toJsonObject());

        if (getChildCertificateHashData() != null) {
            JsonArray childCertificateHashDataArray = new JsonArray();
            for (CertificateHashData item : getChildCertificateHashData()) {
                childCertificateHashDataArray.add(item.toJsonObject());
            }
            json.add("childCertificateHashData", childCertificateHashDataArray);
        }
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
        if (jsonObject.has("certificateType")) {
            setCertificateType(GetCertificateIdUseEnum.valueOf(jsonObject.get("certificateType").getAsString()));
        }

        if (jsonObject.has("certificateHashData")) {
            setCertificateHashData(new CertificateHashData());
            getCertificateHashData().fromJsonObject(jsonObject.getAsJsonObject("certificateHashData"));
        }

        if (jsonObject.has("childCertificateHashData")) {
            setChildCertificateHashData(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("childCertificateHashData");
            for (JsonElement el : arr) {
                CertificateHashData item = new CertificateHashData();
                item.fromJsonObject(el.getAsJsonObject());
                getChildCertificateHashData().add(item);
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
        if (!(obj instanceof CertificateHashDataChain))
            return false;
        CertificateHashDataChain that = (CertificateHashDataChain) obj;
        return Objects.equals(this.childCertificateHashData, that.childCertificateHashData)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.certificateHashData, that.certificateHashData)
                && Objects.equals(this.certificateType, that.certificateType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getCertificateType(),
                getCertificateHashData(),
                getChildCertificateHashData(),
                getCustomData()
        );
    }
}
