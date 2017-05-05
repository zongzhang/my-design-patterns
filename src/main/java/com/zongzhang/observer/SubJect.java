package com.zongzhang.observer;

/**
 * Created by zongzhang on 2017/5/6.
 *  主题
 */
public interface SubJect {
    //注册观察者
    void registerObserver();
    //删除观察者
    void removeObserver();
    //通知观察者
    void notifyObserver();

}
