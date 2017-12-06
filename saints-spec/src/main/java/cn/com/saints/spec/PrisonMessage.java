package cn.com.saints.spec;

import com.google.gson.annotations.SerializedName;

/**
 * Created by MyLady on 07/12/2017.
 */

public class PrisonMessage {

    @SerializedName("BusinessType")
    private int businessType;

    public int getBusinessType() {
        return businessType;
    }

    public void setBusinessType(int businessType) {
        this.businessType = businessType;
    }

    @SerializedName("Detail")
    public String detail;

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
