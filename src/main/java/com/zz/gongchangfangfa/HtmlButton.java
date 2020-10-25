package com.zz.gongchangfangfa;

/**
 * @since 1.0
 */
public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("渲染html按钮");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("html点击");
    }
}
