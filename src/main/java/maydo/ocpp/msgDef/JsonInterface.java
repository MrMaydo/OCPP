package maydo.ocpp.msgDef;

import com.google.gson.JsonObject;

public interface JsonInterface {

    JsonObject toJsonObject();

    void fromString(String jsonString);

    void fromJsonObject(JsonObject jsonObject);
}
