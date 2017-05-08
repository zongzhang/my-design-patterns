package com.zongzhang.Singleton;

/**
 * @author by zongzhang on 2017/5/8.
 */
public class Ztest {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstence();
        singleton.display();
    }
}
