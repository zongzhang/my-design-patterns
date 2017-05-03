package com.zongzhang.strategy;

/**
 * Created by zongzhang on 2017/5/4.
 * test
 */
public class TestS {
    public static void main(String[] args) {
        Duck green = new GreenDuck();
        green.perFormQuack();

        green.setPerFormQuack(new Squeak());
        green.perFormQuack();
    }
}
