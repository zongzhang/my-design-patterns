package com.zz.danli;

/**
 * @since 1.0
 */
public class Singleton {
    private static Singleton singleton;


    private Singleton() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
