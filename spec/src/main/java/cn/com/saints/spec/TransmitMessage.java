package cn.com.saints.spec;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by MyLady on 16/1/27.
 */
public class TransmitMessage {

    public static final String RegisterEvent = "hello";
    public static final String JoinRoomEvent = "join_room";
    public static final String LeaveRoomEvent = "leave_room";
    public static final String MessageUpEvent = "message_up";
    public static final String MessageDownEvent = "message_down";

    public static final String DeviceEventRoom = "device_event";
    public static final String DeviceStatusRoom = "device_status";
    public static final String DeviceControlRoom = "device_control";
    public static final String MaintainRoom = "maintain";
    public static final String DigitalControlRoom = "digital_control";
    public static final String HospitalRoom = "hospital";

    @SerializedName("MessageId")
    private String messageId;

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    @SerializedName("MessageType")
    public int messageType;

    public int getMessageType() {
        return messageType;
    }

    public void setMessageType(int messageType) {
        this.messageType = messageType;
    }

    @SerializedName("MessageContent")
    public String messageContent;

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    @SerializedName("MessageTime")
    private Date messageTime;

    public Date getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(Date messageTime) {
        this.messageTime = messageTime;
    }

    @SerializedName("MessageReceiver")
    private ArrayList<String> messageReceiver;

    public ArrayList<String> getMessageReceiver() {
        return messageReceiver;
    }

    public void setMessageReceiver(ArrayList<String> messageReceiver) {
        this.messageReceiver = messageReceiver;
    }
}
