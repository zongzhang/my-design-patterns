package com.zongzhang.observer.usejava;

import java.util.Observable;
import java.util.Observer;

/**
 * @author zongzhang
 * @since 1.0
 * <p>
 * create on 2018/2/1
 */
public class TheOneDisplay implements Observer {
    private Observable observable;
    private String name;
    private float humidity;

    public TheOneDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.name = weatherData.getName();
            this.humidity = weatherData.getHumidity();
        }
    }

    @Override
    public String toString() {
        return "TheOneDisplay{" +
                "name='" + name + '\'' +
                ", humidity=" + humidity +
                '}';
    }
}
