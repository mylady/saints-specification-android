package cn.com.saints.spec;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by MyLady on 16/2/15.
 */
public class DigitalLayoutArea {

    @SerializedName("ContentType")
    private int contentType;

    public int getContentType() {
        return contentType;
    }

    public void setContentType(int contentType) {
        this.contentType = contentType;
    }

    @SerializedName("X")
    private int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @SerializedName("Y")
    private int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

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

    @SerializedName("Urls")
    private ArrayList<String> urls;

    public ArrayList<String> getUrls() {
        return urls;
    }

    public void setUrls(ArrayList<String> urls) {
        this.urls = urls;
    }

    @SerializedName("SwitchTime")
    private int switchTime;

    public int getSwitchTime() {
        return switchTime;
    }

    public void setSwitchTime(int switchTime) {
        this.switchTime = switchTime;
    }
}
