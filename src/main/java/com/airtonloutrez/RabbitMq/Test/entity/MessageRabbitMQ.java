package com.airtonloutrez.RabbitMq.Test.entity;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class MessageRabbitMQ implements Serializable {

    private String text;

    public MessageRabbitMQ(){}

    public MessageRabbitMQ(String text) {
        this.text = text;
    }
}
