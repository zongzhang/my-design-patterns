package com.zongzhang.observer;

/**
 * @author by zongzhang on 2017/5/7.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temp;
    private float humidity;
    private SubJect weatherData;

    /**
     * 注册主题时,使用
     *
     * @param weatherData
     */
    public CurrentConditionsDisplay(SubJect weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println( this.toString());
    }

    @Override
    public String toString() {
        return "CurrentConditionsDisplay{" +
                "temp=" + temp +
                ", humidity=" + humidity +
                '}';
    }
}
