package cn.com.saints.spec;

import com.google.gson.annotations.SerializedName;
import java.util.Date;

public class BioIdentifyMessage {

    @SerializedName("IdentifyType")
    private int identifyType;

    public int getIdentifyType() {
        return identifyType;
    }

    public void setIdentifyType(int identifyType) {
        this.identifyType = identifyType;
    }

    @SerializedName("IdentifyTime")
    private Date identifyTime;

    public Date getIdentifyTime() {
        return identifyTime;
    }

    public void setIdentifyTime(Date identifyTime) {
        this.identifyTime = identifyTime;
    }

    @SerializedName("IdentifyContent")
    private String identifyContent;

    public String getIdentifyContent() {
        return identifyContent;
    }

    public void setIdentifyContent(String identifyContent) {
        this.identifyContent = identifyContent;
    }
}
