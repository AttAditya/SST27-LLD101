package com.example.notifications.decorators;

import com.example.notifications.Notifier;

public class SMSDecorator implements Notifier {
    private final Notifier notifier;
    private final String phoneNumber;

    public SMSDecorator(Notifier notifier, String phoneNumber) {
        this.notifier = notifier;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void notify(String text) {
        notifier.notify(text);
        System.out.println("[SMS -> " + phoneNumber + "]: " + text);
    }
}
