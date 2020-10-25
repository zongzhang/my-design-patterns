package com.zz.gongchangfangfa;

/**
 * @since 1.0
 */
public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
