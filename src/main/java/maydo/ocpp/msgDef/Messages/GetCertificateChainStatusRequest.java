package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CertificateStatusRequestInfo;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 */
public class GetCertificateChainStatusRequest implements JsonInterface {

    /**
     * Certificate to check revocation status for.
     */
    @Required
    private List<CertificateStatusRequestInfo> certificateStatusRequests;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public GetCertificateChainStatusRequest() {
    }


    public List<CertificateStatusRequestInfo> getCertificateStatusRequests() {
        return certificateStatusRequests;
    }


    public void setCertificateStatusRequests(List<CertificateStatusRequestInfo> certificateStatusRequests) {
        this.certificateStatusRequests = certificateStatusRequests;
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

        JsonArray certificateStatusRequestsArray = new JsonArray();
        for (CertificateStatusRequestInfo item : getCertificateStatusRequests()) {
            certificateStatusRequestsArray.add(item.toJsonObject());
        }
        json.add("certificateStatusRequests", certificateStatusRequestsArray);

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
        if (jsonObject.has("certificateStatusRequests")) {
            setCertificateStatusRequests(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("certificateStatusRequests");
            for (JsonElement el : arr) {
                CertificateStatusRequestInfo item = new CertificateStatusRequestInfo();
                item.fromJsonObject(el.getAsJsonObject());
                getCertificateStatusRequests().add(item);
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
        if (!(obj instanceof GetCertificateChainStatusRequest))
            return false;
        GetCertificateChainStatusRequest that = (GetCertificateChainStatusRequest) obj;
        return Objects.equals(this.certificateStatusRequests, that.certificateStatusRequests)
                && Objects.equals(this.customData, that.customData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getCertificateStatusRequests(),
                getCustomData()
        );
    }
}
