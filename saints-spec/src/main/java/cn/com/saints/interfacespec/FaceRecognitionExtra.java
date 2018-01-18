package cn.com.saints.interfacespec;

/**
 * Created by MyLady on 18/01/2018.
 */

public class FaceRecognitionExtra {

    private String sceneImagePath;

    public String getSceneImagePath() {
        return sceneImagePath;
    }

    public void setSceneImagePath(String sceneImagePath) {
        this.sceneImagePath = sceneImagePath;
    }

    private String sceneImage;

    public String getSceneImage() {
        return sceneImage;
    }

    public void setSceneImage(String sceneImage) {
        this.sceneImage = sceneImage;
    }

    private String personId;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    private String personName;

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    private double similarity;

    public double getSimilarity() {
        return similarity;
    }

    public void setSimilarity(double similarity) {
        this.similarity = similarity;
    }
}
