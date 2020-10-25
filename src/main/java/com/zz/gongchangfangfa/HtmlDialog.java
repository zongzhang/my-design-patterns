package com.zz.gongchangfangfa;

/**
 * @since 1.0
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
