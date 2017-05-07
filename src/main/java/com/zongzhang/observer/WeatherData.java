package com.zongzhang.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author by zongzhang on 2017/5/7.
 */
public class WeatherData implements SubJect {
    private List<Observer> observers;

    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer o : observers) {
            o.update(temp, humidity, pressure);
        }
    }

    /**
     * 数据变更时,通知观察者
     */
    public void measurementsChange() {
        notifyObserver();
    }

    /**
     * 测试方法,数据值入参
     *
     * @param temp
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChange();
    }

    //一些其他方法
}
