package com.airtonloutrez.RabbitMq.Test.service;

import com.airtonloutrez.RabbitMq.Test.entity.MessageRabbitMQ;
import com.airtonloutrez.RabbitMq.Test.entity.MessageSender;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RabbitMqService {
    MessageSender messageSender;


    public void toSend(String text) {
        MessageRabbitMQ message = new MessageRabbitMQ(text);
        messageSender.send(message);
    }
}
