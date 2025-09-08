package com.example.notifications;

import com.example.notifications.decorators.SMSDecorator;
import com.example.notifications.decorators.SlackDecorator;
import com.example.notifications.decorators.WhatsAppDecorator;

/**
 * Starter demo that uses only the existing Email notifier.
 * TODOs guide you to add decorators and compose them.
 */
public class Demo {
    public static void main(String[] args) {
        Notifier base = new EmailNotifier("user@example.com");

        // Baseline behavior (already works)
        base.notify("Baseline email only.");

        Notifier smsAndEmail = new SMSDecorator(base, "+91-99999-11111");
        smsAndEmail.notify("Build green ✅");

        Notifier waAndEmail = new WhatsAppDecorator(base, "+91-88888-22222");
        waAndEmail.notify("New login from Chrome on Windows.");

        Notifier slackAndEmail = new SlackDecorator(base, "deployments");
        slackAndEmail.notify("Deployment completed 🚀");

        // === YOUR TASKS ===
        // 1) Create a base decorator class: NotifierDecorator implements Notifier and wraps another Notifier.
        // 2) Create concrete decorators:
        //      - SmsDecorator (adds SMS send)
        //      - WhatsAppDecorator (adds WhatsApp send)
        //      - SlackDecorator (adds Slack send)
        // 3) Compose at runtime to achieve these combinations:
        //      a) Email + SMS
        //      b) Email + WhatsApp
        //      c) Email + Slack
        //      d) Email + WhatsApp + Slack
        //
        // Example (after you implement):
        // Notifier smsAndEmail = new SmsDecorator(base, "+91-99999-11111");
        // smsAndEmail.notify("Build green ✅");
        //
        // Notifier full = new SlackDecorator(new WhatsAppDecorator(base, "user_wa"), "deployments");
        // full.notify("Deployment completed 🚀");
    }
}
