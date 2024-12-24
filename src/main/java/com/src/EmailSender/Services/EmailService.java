package com.src.EmailSender.Services;

import jakarta.mail.MessagingException;

import java.io.File;

public interface EmailService {

    void sendEmail(String[] to, String subject, String message);

    //send mail with html
    void sendEmailWithHtml(String[] to, String subject, String htmlContent) throws MessagingException;

    //send mail with file
    void sendEmailWithFile(String[] to, String subject, String htmlContent, File file);
}
