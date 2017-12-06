package cn.com.saints.spec;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

/**
 * Created by MyLady on 07/12/2017.
 */

public class DeviceEventData {

    @SerializedName("ResourceCode")
    private int resourceCode;

    public int getResourceCode() {
        return resourceCode;
    }

    public void setResourceCode(int resourceCode) {
        this.resourceCode = resourceCode;
    }

    @SerializedName("Address")
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @SerializedName("EventType")
    private int eventType;

    public int getEventType() {
        return eventType;
    }

    public void setEventType(int eventType) {
        this.eventType = eventType;
    }

    @SerializedName("EventLevel")
    private int eventLevel;

    public int getEventLevel() {
        return eventLevel;
    }

    public void setEventLevel(int eventLevel) {
        this.eventLevel = eventLevel;
    }

    @SerializedName("EventCode")
    private int eventCode;

    public int getEventCode() {
        return eventCode;
    }

    public void setEventCode(int eventCode) {
        this.eventCode = eventCode;
    }

    @SerializedName("AlarmCode")
    private int alarmCode;

    public int getAlarmCode() {
        return alarmCode;
    }

    public void setAlarmCode(int alarmCode) {
        this.alarmCode = alarmCode;
    }

    @SerializedName("EventTime")
    private Date eventTime;

    public Date getEventTime() {
        return eventTime;
    }

    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }

    @SerializedName("EventDescription")
    private String eventDescription;

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    @SerializedName("EventExtra")
    private String eventExtra;

    public String getEventExtra() {
        return eventExtra;
    }

    public void setEventExtra(String eventExtra) {
        this.eventExtra = eventExtra;
    }
}
