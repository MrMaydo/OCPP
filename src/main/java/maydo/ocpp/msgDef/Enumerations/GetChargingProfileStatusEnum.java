package maydo.ocpp.msgDef.Enumerations;

import java.util.HashMap;
import java.util.Map;


/**
 * This indicates whether the Charging Station is able to process this request and will send &lt;&lt;reportchargingprofilesrequest, ReportChargingProfilesRequest&gt;&gt; messages.
 */
public enum GetChargingProfileStatusEnum {

    ACCEPTED("Accepted"),
    NO_PROFILES("NoProfiles");
    private final static Map<String, GetChargingProfileStatusEnum> CONSTANTS = new HashMap<String, GetChargingProfileStatusEnum>();

    static {
        for (GetChargingProfileStatusEnum c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private final String value;

    GetChargingProfileStatusEnum(String value) {
        this.value = value;
    }

    public static GetChargingProfileStatusEnum fromValue(String value) {
        GetChargingProfileStatusEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

}
