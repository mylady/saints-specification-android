package cn.com.saints.spec;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by MyLady on 16/2/15.
 */
public class DigitalLayout {

    @SerializedName("Width")
    private int width;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @SerializedName("Height")
    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @SerializedName("FullScreen")
    public boolean fullScreen;

    public boolean isFullScreen() {
        return fullScreen;
    }

    public void setFullScreen(boolean fullScreen) {
        this.fullScreen = fullScreen;
    }

    @SerializedName("BackgroundImage")
    private String backgroundImage;

    public String getBackgroundImage() {
        return backgroundImage;
    }

    public void setBackgroundImage(String backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

    @SerializedName("BackgroundAudio")
    private String backgroundAudio;

    public String getBackgroundAudio() {
        return backgroundAudio;
    }

    public void setBackgroundAudio(String backgroundAudio) {
        this.backgroundAudio = backgroundAudio;
    }

    @SerializedName("Areas")
    private ArrayList<DigitalLayoutArea> areas;

    public ArrayList<DigitalLayoutArea> getAreas() {
        return areas;
    }

    public void setAreas(ArrayList<DigitalLayoutArea> areas) {
        this.areas = areas;
    }
}
