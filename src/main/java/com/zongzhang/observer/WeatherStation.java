package com.zongzhang.observer;

/**
 * @author by zongzhang on 2017/5/7.
 */
public class WeatherStation {
    public static void main(String[] args) {
        //创建weatherData对象
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(23,3,2);
    }
}
