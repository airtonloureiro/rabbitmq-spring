package com.airtonloutrez.RabbitMq.Test;

import com.airtonloutrez.RabbitMq.Test.entity.MessageRabbitMQ;
import com.airtonloutrez.RabbitMq.Test.entity.MessageSender;
import com.airtonloutrez.RabbitMq.Test.service.RabbitMqService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Spy;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RabbitMqTestApplicationTests {

	@Autowired
	private RabbitMqService service;


	@Test
	void testSend() {
		String text = "Hello, world! Está funcionando";
		service.toSend(text);
	}

}
