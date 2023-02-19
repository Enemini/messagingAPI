package com.vikky.notificationservice.service;

import com.vikky.notificationservice.domain.Mail;

public interface SendMailService {
    void sendMail(Mail mail);
}
