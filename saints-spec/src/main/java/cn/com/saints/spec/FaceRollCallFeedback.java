package cn.com.saints.spec;

import com.google.gson.annotations.SerializedName;

/**
 * Created by MyLady on 07/12/2017.
 */

public class FaceRollCallFeedback {
    @SerializedName("PrisonerJsh")
    private String prisonerJsh;

    public String getPrisonerJsh() {
        return prisonerJsh;
    }

    public void setPrisonerJsh(String prisonerJsh) {
        this.prisonerJsh = prisonerJsh;
    }

    @SerializedName("PrisonerSnbh")
    private String prisonerSnbh;

    public String getPrisonerSnbh() {
        return prisonerSnbh;
    }

    public void setPrisonerSnbh(String prisonerSnbh) {
        this.prisonerSnbh = prisonerSnbh;
    }

    @SerializedName("PrisonerName")
    private String prisonerName;

    public String getPrisonerName() {
        return prisonerName;
    }

    public void setPrisonerName(String prisonerName) {
        this.prisonerName = prisonerName;
    }

    @SerializedName("PrisonerFacePath")
    public  String prisonerFacePath;

    public String getPrisonerFacePath() {
        return prisonerFacePath;
    }

    public void setPrisonerFacePath(String prisonerFacePath) {
        this.prisonerFacePath = prisonerFacePath;
    }

    @SerializedName("RollCallStatus")
    private int rollCallStatus;

    public int getRollCallStatus() {
        return rollCallStatus;
    }

    public void setRollCallStatus(int rollCallStatus) {
        this.rollCallStatus = rollCallStatus;
    }

    @SerializedName("RollCallResult")
    private int rollCallResult;

    public int getRollCallResult() {
        return rollCallResult;
    }

    public void setRollCallResult(int rollCallResult) {
        this.rollCallResult = rollCallResult;
    }
}
