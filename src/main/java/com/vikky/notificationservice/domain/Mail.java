package com.vikky.notificationservice.domain;


import lombok.Data;

@Data
public class Mail {

    private String recipient;
    private String subject;
    private String message;
}
