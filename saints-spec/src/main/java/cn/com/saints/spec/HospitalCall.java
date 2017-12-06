package cn.com.saints.spec;

import com.google.gson.annotations.SerializedName;

/**
 * Created by MyLady on 07/12/2017.
 */

public class HospitalCall {
    @SerializedName("CallType")
    private int callType;

    public int getCallType() {
        return callType;
    }

    public void setCallType(int callType) {
        this.callType = callType;
    }

    @SerializedName("CallContent")
    private String callContent;

    public String getCallContent() {
        return callContent;
    }

    public void setCallContent(String callContent) {
        this.callContent = callContent;
    }
}
