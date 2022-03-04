package com.app.projectmanager.services;

@FunctionalInterface
public interface SendEmail {
    public void sendEmail(String to, String subject, String text);
}
