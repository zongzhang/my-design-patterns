package com.zz.danli;

/**
 * @since 1.0
 */
public class GoodSingleton {
    private static volatile GoodSingleton instance;

    private GoodSingleton() {
    }

    public static GoodSingleton goodSingleton() {
        //解决警告 某些虚拟机性能更好
        GoodSingleton result = instance;

        if (result != null) {
            return instance;
        }

        synchronized (GoodSingleton.class) {
            if (instance == null) {
                instance = new GoodSingleton();
            }
            return instance;
        }

    }
}
