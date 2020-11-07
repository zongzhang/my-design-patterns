package com.zz.zhuangtai;

/**
 * @since 1.0
 */
public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
