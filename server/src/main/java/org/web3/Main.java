package org.web3;

import java.util.ResourceBundle;

public class Main {
    public static void main(final String[] args) {
        final ResourceBundle messages = ResourceBundle.getBundle("localization.messages");
        System.out.println(messages.getString("app.title"));
    }
}
