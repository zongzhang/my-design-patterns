package com.zongzhang.observer.usejava;

import java.util.Observable;

/**
 * @author zongzhang
 * @since 1.0
 * <p>
 * create on 2018/2/1
 */
public class WeatherData extends Observable {
    private String name;
    private float humidity;

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurementsChanged(String name,float humidity) {
        this.name = name;
        this.humidity = humidity;
        measurementsChanged();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }
}
