package com.vikky.notificationservice.service;


import com.vikky.notificationservice.domain.Mail;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor

public class SendMailServiceImpl implements SendMailService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public void sendMail(Mail mail) {

        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo(mail.getRecipient(), mail.getRecipient());

        msg.setSubject(mail.getSubject());
        msg.setText(mail.getMessage());
        System.out.printf(" 1 : " + msg.getSubject());
        System.out.printf(" 2 : " + msg.getText());
        System.out.printf(" 3 : " + msg.getTo());
        javaMailSender.send(msg);
    }


}
