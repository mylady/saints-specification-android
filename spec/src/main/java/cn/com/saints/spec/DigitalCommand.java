package cn.com.saints.spec;

import com.google.gson.annotations.SerializedName;

/**
 * Created by MyLady on 16/1/27.
 */
public class DigitalCommand {

    @SerializedName("CommandType")
    private int commandType;

    public int getCommandType() {
        return commandType;
    }

    public void setCommandType(int commandType) {
        this.commandType = commandType;
    }

    @SerializedName("Layout")
    private DigitalLayout layout;

    public DigitalLayout getLayout() {
        return layout;
    }

    public void setLayout(DigitalLayout layout) {
        this.layout = layout;
    }

    @SerializedName("Marquee")
    private DigitalMarquee marquee;

    public DigitalMarquee getMarquee() {
        return marquee;
    }

    public void setMarquee(DigitalMarquee marquee) {
        this.marquee = marquee;
    }

    @SerializedName("Speech")
    private String speech;

    public String getSpeech() {
        return speech;
    }

    public void setSpeech(String speech) {
        this.speech = speech;
    }

    @SerializedName("ElapseTime")
    private int elapseTime;

    public int getElapseTime() {
        return elapseTime;
    }

    public void setElapseTime(int elapseTime) {
        this.elapseTime = elapseTime;
    }

    @SerializedName("Value")
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
