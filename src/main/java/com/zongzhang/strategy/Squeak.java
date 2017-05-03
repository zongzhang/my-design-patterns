package com.zongzhang.strategy;

/**
 * Created by zongzhang on 2017/5/4.
 */
public class Squeak implements QuackBehavior{
    public void quack() {
        System.out.println("squeak");
    }
}
