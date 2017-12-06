package cn.com.saints.spec;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by MyLady on 07/12/2017.
 */

public class DeviceControlParam {
    @SerializedName("ControlCode")
    private int controlCode;

    public int getControlCode() {
        return controlCode;
    }

    public void setControlCode(int controlCode) {
        this.controlCode = controlCode;
    }

    @SerializedName("InterfaceCode")
    private int interfaceCode;

    public int getInterfaceCode() {
        return interfaceCode;
    }

    public void setInterfaceCode(int interfaceCode) {
        this.interfaceCode = interfaceCode;
    }

    @SerializedName("Receivers")
    private ArrayList<String> receivers;

    public ArrayList<String> getReceivers() {
        return receivers;
    }

    public void setReceivers(ArrayList<String> receivers) {
        this.receivers = receivers;
    }

    @SerializedName("Sender")
    private String sender;

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    @SerializedName("Parameters")
    private ArrayList<String> parameters;

    public ArrayList<String> getParameters() {
        return parameters;
    }

    public void setParameters(ArrayList<String> parameters) {
        this.parameters = parameters;
    }
}
