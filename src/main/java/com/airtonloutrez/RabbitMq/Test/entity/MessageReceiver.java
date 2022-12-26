package com.airtonloutrez.RabbitMq.Test.entity;

import lombok.extern.java.Log;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@Log
public class MessageReceiver {

    @RabbitListener(queues = "${rabbitmq.queue}")
    public void processMessage(MessageRabbitMQ message) {
        log.info("Mensagem Recebida: " + message.getText() );
    }
}
