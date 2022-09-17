
package maydo.ocpp.msgDef.DataTypes;

import maydo.ocpp.msgDef.Enumerations.MessagePriorityEnum;
import maydo.ocpp.msgDef.Enumerations.MessageStateEnum;

import java.util.Date;
import javax.annotation.Generated;


/**
 * Message_ Info
 * urn:x-enexis:ecdm:uid:2:233264
 * Contains message details, for a message to be displayed on a Charging Station.
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class MessageInfo {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * A physical or logical component
     * 
     * 
     */
    private Component display;
    /**
     * Identified_ Object. MRID. Numeric_ Identifier
     * urn:x-enexis:ecdm:uid:1:569198
     * Master resource identifier, unique within an exchange context. It is defined within the OCPP context as a positive Integer value (greater or equal to zero).
     * 
     * (Required)
     * 
     */
    private Integer id;
    /**
     * Message_ Info. Priority. Message_ Priority_ Code
     * urn:x-enexis:ecdm:uid:1:569253
     * With what priority should this message be shown
     * 
     * (Required)
     * 
     */
    private MessagePriorityEnum priority;
    /**
     * Message_ Info. State. Message_ State_ Code
     * urn:x-enexis:ecdm:uid:1:569254
     * During what state should this message be shown. When omitted this message should be shown in any state of the Charging Station.
     * 
     * 
     */
    private MessageStateEnum state;
    /**
     * Message_ Info. Start. Date_ Time
     * urn:x-enexis:ecdm:uid:1:569256
     * From what date-time should this message be shown. If omitted: directly.
     * 
     * 
     */
    private Date startDateTime;
    /**
     * Message_ Info. End. Date_ Time
     * urn:x-enexis:ecdm:uid:1:569257
     * Until what date-time should this message be shown, after this date/time this message SHALL be removed.
     * 
     * 
     */
    private Date endDateTime;
    /**
     * During which transaction shall this message be shown.
     * Message SHALL be removed by the Charging Station after transaction has
     * ended.
     * 
     * 
     */
    private String transactionId;
    /**
     * Message_ Content
     * urn:x-enexis:ecdm:uid:2:234490
     * Contains message details, for a message to be displayed on a Charging Station.
     * 
     * 
     * (Required)
     * 
     */
    private MessageContent message;

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    public CustomData getCustomData() {
        return customData;
    }

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    public void setCustomData(CustomData customData) {
        this.customData = customData;
    }

    /**
     * A physical or logical component
     * 
     * 
     */
    public Component getDisplay() {
        return display;
    }

    /**
     * A physical or logical component
     * 
     * 
     */
    public void setDisplay(Component display) {
        this.display = display;
    }

    /**
     * Identified_ Object. MRID. Numeric_ Identifier
     * urn:x-enexis:ecdm:uid:1:569198
     * Master resource identifier, unique within an exchange context. It is defined within the OCPP context as a positive Integer value (greater or equal to zero).
     * 
     * (Required)
     * 
     */
    public Integer getId() {
        return id;
    }

    /**
     * Identified_ Object. MRID. Numeric_ Identifier
     * urn:x-enexis:ecdm:uid:1:569198
     * Master resource identifier, unique within an exchange context. It is defined within the OCPP context as a positive Integer value (greater or equal to zero).
     * 
     * (Required)
     * 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Message_ Info. Priority. Message_ Priority_ Code
     * urn:x-enexis:ecdm:uid:1:569253
     * With what priority should this message be shown
     * 
     * (Required)
     * 
     */
    public MessagePriorityEnum getPriority() {
        return priority;
    }

    /**
     * Message_ Info. Priority. Message_ Priority_ Code
     * urn:x-enexis:ecdm:uid:1:569253
     * With what priority should this message be shown
     * 
     * (Required)
     * 
     */
    public void setPriority(MessagePriorityEnum priority) {
        this.priority = priority;
    }

    /**
     * Message_ Info. State. Message_ State_ Code
     * urn:x-enexis:ecdm:uid:1:569254
     * During what state should this message be shown. When omitted this message should be shown in any state of the Charging Station.
     * 
     * 
     */
    public MessageStateEnum getState() {
        return state;
    }

    /**
     * Message_ Info. State. Message_ State_ Code
     * urn:x-enexis:ecdm:uid:1:569254
     * During what state should this message be shown. When omitted this message should be shown in any state of the Charging Station.
     * 
     * 
     */
    public void setState(MessageStateEnum state) {
        this.state = state;
    }

    /**
     * Message_ Info. Start. Date_ Time
     * urn:x-enexis:ecdm:uid:1:569256
     * From what date-time should this message be shown. If omitted: directly.
     * 
     * 
     */
    public Date getStartDateTime() {
        return startDateTime;
    }

    /**
     * Message_ Info. Start. Date_ Time
     * urn:x-enexis:ecdm:uid:1:569256
     * From what date-time should this message be shown. If omitted: directly.
     * 
     * 
     */
    public void setStartDateTime(Date startDateTime) {
        this.startDateTime = startDateTime;
    }

    /**
     * Message_ Info. End. Date_ Time
     * urn:x-enexis:ecdm:uid:1:569257
     * Until what date-time should this message be shown, after this date/time this message SHALL be removed.
     * 
     * 
     */
    public Date getEndDateTime() {
        return endDateTime;
    }

    /**
     * Message_ Info. End. Date_ Time
     * urn:x-enexis:ecdm:uid:1:569257
     * Until what date-time should this message be shown, after this date/time this message SHALL be removed.
     * 
     * 
     */
    public void setEndDateTime(Date endDateTime) {
        this.endDateTime = endDateTime;
    }

    /**
     * During which transaction shall this message be shown.
     * Message SHALL be removed by the Charging Station after transaction has
     * ended.
     * 
     * 
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * During which transaction shall this message be shown.
     * Message SHALL be removed by the Charging Station after transaction has
     * ended.
     * 
     * 
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * Message_ Content
     * urn:x-enexis:ecdm:uid:2:234490
     * Contains message details, for a message to be displayed on a Charging Station.
     * 
     * 
     * (Required)
     * 
     */
    public MessageContent getMessage() {
        return message;
    }

    /**
     * Message_ Content
     * urn:x-enexis:ecdm:uid:2:234490
     * Contains message details, for a message to be displayed on a Charging Station.
     * 
     * 
     * (Required)
     * 
     */
    public void setMessage(MessageContent message) {
        this.message = message;
    }

}
