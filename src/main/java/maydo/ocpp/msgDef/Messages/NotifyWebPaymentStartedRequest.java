package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class NotifyWebPaymentStartedRequest implements JsonInterface {

    /**
     * EVSE id for which transaction is requested.
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private Integer evseId;
    /**
     * Timeout value in seconds after which no result of web payment process (e.g. QR code scanning) is to be expected anymore.
     * <p>
     * (Required)
     */
    @Required
    private Integer timeout;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public NotifyWebPaymentStartedRequest() {
    }

    /**
     * @param evseId  EVSE id for which transaction is requested.
     *                <p>
     *                .
     * @param timeout Timeout value in seconds after which no result of web payment process (e.g. QR code scanning) is to be expected anymore.
     *                .
     */
    public NotifyWebPaymentStartedRequest(Integer evseId, Integer timeout, CustomData customData) {
        super();
        this.evseId = evseId;
        this.timeout = timeout;
        this.customData = customData;
    }

    /**
     * EVSE id for which transaction is requested.
     * <p>
     * <p>
     * (Required)
     */
    public Integer getEvseId() {
        return evseId;
    }

    /**
     * EVSE id for which transaction is requested.
     * <p>
     * <p>
     * (Required)
     */
    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
    }

    /**
     * Timeout value in seconds after which no result of web payment process (e.g. QR code scanning) is to be expected anymore.
     * <p>
     * (Required)
     */
    public Integer getTimeout() {
        return timeout;
    }

    /**
     * Timeout value in seconds after which no result of web payment process (e.g. QR code scanning) is to be expected anymore.
     * <p>
     * (Required)
     */
    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
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
        return null;
    }

    @Override
    public void fromString(String jsonString) {
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof NotifyWebPaymentStartedRequest))
            return false;
        NotifyWebPaymentStartedRequest that = (NotifyWebPaymentStartedRequest) obj;
        return Objects.equals(this.evseId, that.evseId)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.timeout, that.timeout);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.evseId != null ? this.evseId.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.timeout != null ? this.timeout.hashCode() : 0);
        return result;
    }
}
