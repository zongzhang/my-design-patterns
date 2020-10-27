package com.zz.chouxianggongchang;

/**
 * @since 1.0
 */
public class Demo {



    public static void main(String[] args) {
        //读取配置文件选择具体工厂
        //GUIFactory factory = new MacOSFactory();
        GUIFactory factory = new WindowsFactory();

        Application app = new Application(factory);

        app.paint();
    }
}
