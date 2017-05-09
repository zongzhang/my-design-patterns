package com.zongzhang.Singleton;

/**
 * @author by zongzhang on 2017/5/8.
 */
public class Singleton {
    // volatile 1.5以上
    private volatile static Singleton singleton = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstence() {
        return singleton;
    }

    public void display() {
        System.out.println("ss");
    }
}
