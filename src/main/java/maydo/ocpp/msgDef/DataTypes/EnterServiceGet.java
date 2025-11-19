package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class EnterServiceGet implements JsonInterface {

    /**
     * 
     * (Required)
     */
    @Required
    private EnterService enterService;
    /**
     * Id of setting
     * 
     * 
     * (Required)
     */
    @Required
    private String id;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public EnterServiceGet() {
    }

    /**
     * 
     * @param id
     *     Id of setting
     *     
     *     .
     */
    public EnterServiceGet(EnterService enterService, String id, CustomData customData) {
        super();
        this.enterService = enterService;
        this.id = id;
        this.customData = customData;
    }

    /**
     * 
     * (Required)
     */
    public EnterService getEnterService() {
        return enterService;
    }

    /**
     * 
     * (Required)
     */
    public void setEnterService(EnterService enterService) {
        this.enterService = enterService;
    }

    /**
     * Id of setting
     * 
     * 
     * (Required)
     */
    public String getId() {
        return id;
    }

    /**
     * Id of setting
     * 
     * 
     * (Required)
     */
    public void setId(String id) {
        this.id = id;
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
        if (!(obj instanceof EnterServiceGet))
            return false;
        EnterServiceGet that = (EnterServiceGet) obj;
        return Objects.equals(this.enterService, that.enterService)
                && Objects.equals(this.customData, that.customData) 
                && Objects.equals(this.id, that.id);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.enterService != null ? this.enterService.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
        return result;
    }
}
