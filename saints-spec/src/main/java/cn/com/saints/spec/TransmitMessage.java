package cn.com.saints.spec;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by MyLady on 16/1/27.
 */
public class TransmitMessage {

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
