package com.zz.guanchazhe;

import java.io.File;

/**
 * @since 1.0
 */
public class EmailNotificationListener implements EventListener {
    private String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Email to " + email + ": Someone has performed " + eventType + " operation with the " +
                "following file: " + file.getName());
    }
}
