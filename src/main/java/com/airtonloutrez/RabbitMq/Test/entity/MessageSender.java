package com.airtonloutrez.RabbitMq.Test.entity;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {


    @Autowired
    RabbitTemplate rabbitTemplate;

    @Value("${rabbitmq.queue}")
    private String queue;
    public void send(MessageRabbitMQ text) {
        rabbitTemplate.convertAndSend(queue, text);
    }
}
