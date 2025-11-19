package maydo.ocpp.msgDef.Messages;

import maydo.ocpp.msgDef.DataTypes.ConstantStreamData;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.annotations.Optional;

import java.util.List;
import java.util.Objects;

public class GetPeriodicEventStreamResponse {

    private List<ConstantStreamData> constantStreamData;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public GetPeriodicEventStreamResponse() {
    }

    public GetPeriodicEventStreamResponse(List<ConstantStreamData> constantStreamData, CustomData customData) {
        super();
        this.constantStreamData = constantStreamData;
        this.customData = customData;
    }

    public List<ConstantStreamData> getConstantStreamData() {
        return constantStreamData;
    }

    public void setConstantStreamData(List<ConstantStreamData> constantStreamData) {
        this.constantStreamData = constantStreamData;
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
        if (!(obj instanceof GetPeriodicEventStreamResponse))
            return false;
        GetPeriodicEventStreamResponse that = (GetPeriodicEventStreamResponse) obj;
        return Objects.equals(this.constantStreamData, that.constantStreamData)
                && Objects.equals(this.customData, that.customData);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.constantStreamData != null ? this.constantStreamData.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        return result;
    }
}
