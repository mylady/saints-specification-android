package cn.com.saints.spec;

import com.google.gson.annotations.SerializedName;

/**
 * Created by MyLady on 07/12/2017.
 */

public class FaceRecognition {
    @SerializedName("CameraAddress")
    private String cameraAddress;

    public String getCameraAddress() {
        return cameraAddress;
    }

    public void setCameraAddress(String cameraAddress) {
        this.cameraAddress = cameraAddress;
    }

    @SerializedName("FaceImagePath")
    private String faceImagePath;

    public String getFaceImagePath() {
        return faceImagePath;
    }

    public void setFaceImagePath(String faceImagePath) {
        this.faceImagePath = faceImagePath;
    }

    @SerializedName("SceneImagePath")
    private String sceneImagePath;

    public String getSceneImagePath() {
        return sceneImagePath;
    }

    public void setSceneImagePath(String sceneImagePath) {
        this.sceneImagePath = sceneImagePath;
    }

    @SerializedName("FaceX")
    private int faceX;

    public int getFaceX() {
        return faceX;
    }

    public void setFaceX(int faceX) {
        this.faceX = faceX;
    }

    @SerializedName("FaceY")
    private int faceY;

    public int getFaceY() {
        return faceY;
    }

    public void setFaceY(int faceY) {
        this.faceY = faceY;
    }

    @SerializedName("FaceWidth")
    private int faceWidth;

    public int getFaceWidth() {
        return faceWidth;
    }

    public void setFaceWidth(int faceWidth) {
        this.faceWidth = faceWidth;
    }

    @SerializedName("FaceHeight")
    private int faceHeight;

    public int getFaceHeight() {
        return faceHeight;
    }

    public void setFaceHeight(int faceHeight) {
        this.faceHeight = faceHeight;
    }

    @SerializedName("IsHit")
    private boolean isHit;

    public boolean isHit() {
        return isHit;
    }

    public void setHit(boolean hit) {
        isHit = hit;
    }

    @SerializedName("HitImagePath")
    private String hitImagePath;

    public String getHitImagePath() {
        return hitImagePath;
    }

    public void setHitImagePath(String hitImagePath) {
        this.hitImagePath = hitImagePath;
    }

    @SerializedName("Similarity")
    private double similarity;

    public double getSimilarity() {
        return similarity;
    }

    public void setSimilarity(double similarity) {
        this.similarity = similarity;
    }

    @SerializedName("PersonId")
    private String personId;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    @SerializedName("PersonName")
    private String personName;

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }
}
