package cn.com.saints.interfacespec;

/**
 * Created by MyLady on 18/01/2018.
 */

public class AirMonitorExtra {

    private float temperature;

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        temperature = temperature;
    }

    private float humidity;

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    private float hcho;

    public float getHcho() {
        return hcho;
    }

    public void setHcho(float hcho) {
        this.hcho = hcho;
    }

    private float co2;

    public float getCo2() {
        return co2;
    }

    public void setCo2(float co2) {
        this.co2 = co2;
    }

    private float pm25;

    public float getPm25() {
        return pm25;
    }

    public void setPm25(float pm25) {
        this.pm25 = pm25;
    }

    private float tvoc;

    public float getTvoc() {
        return tvoc;
    }

    public void setTvoc(float tvoc) {
        this.tvoc = tvoc;
    }
}
