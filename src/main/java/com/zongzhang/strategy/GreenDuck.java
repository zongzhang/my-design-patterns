package com.zongzhang.strategy;

/**
 * Created by zongzhang on 2017/5/4.
 * greenduck
 */
public class GreenDuck extends Duck {
    public GreenDuck() {
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("GreenDuck");
    }


}
