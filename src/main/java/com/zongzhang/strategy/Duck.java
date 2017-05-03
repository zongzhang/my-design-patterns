package com.zongzhang.strategy;

/**
 * Created by zongzhang on 2017/5/4.
 *
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void perFormFly(){
        flyBehavior.fly();
    }

    public void perFormQuack(){
        quackBehavior.quack();
    }

    public void display(){
        System.out.println("duck");
    }

    public void setPerFormQuack(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }
}
