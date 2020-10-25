package com.zz.gongchangfangfa;

/**
 * @since 1.0
 */
public class Application {

    public static void main(String[] args) {
        Dialog dialog;
        System.out.println(System.getProperty("os.name"));
        //if (System.getProperty("os.name").equals("Mac OS X")) {
        //    dialog = new WindowsDialog();
        //} else {
        //    dialog = new HtmlDialog();
        //}
        dialog = new HtmlDialog();

        dialog.renderWindow();
    }

}
