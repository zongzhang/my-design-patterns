package com.zongzhang.observer.usejava;

/**
 * @author zongzhang
 * @since 1.0
 * <p>
 * create on 2018/2/1
 */
public class Station {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        TheOneDisplay theOneDisplay = new TheOneDisplay(weatherData);

        weatherData.setMeasurementsChanged("one",1.1f);

        System.out.println(theOneDisplay);
    }
}
