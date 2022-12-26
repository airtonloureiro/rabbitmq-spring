package com.airtonloutrez.RabbitMq.Test.controller;

import com.airtonloutrez.RabbitMq.Test.service.RabbitMqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    private RabbitMqService service;

    @PostMapping("/send")
    public void sendMessage(@RequestBody String text) {
        service.toSend(text);
    }
}
