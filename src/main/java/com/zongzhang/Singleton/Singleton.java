package com.zongzhang.Singleton;

/**
 * @author by zongzhang on 2017/5/8.
 */
public class Singleton {
    private static Singleton singleton = new Singleton();

    public static Singleton getInstence() {
        return singleton;
    }

    public void display() {
        System.out.println("ss");
    }
}
