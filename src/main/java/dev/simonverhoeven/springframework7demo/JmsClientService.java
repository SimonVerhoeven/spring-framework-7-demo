package dev.simonverhoeven.springframework7demo;

import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.jms.core.JmsClient;

import java.util.Optional;

@Service
public class JmsClientService {

    public void sendMessage(JmsClient jmsClient) {
        final var message = MessageBuilder
                .withPayload("demoPayload")
                .build();
        jmsClient.destination("demoQueue")
                .withTimeToLive(1_000L)
                .send(message);
    }

    public Optional<Message<?>> receiveMessage(JmsClient jmsClient) {
        return jmsClient
                .destination("demoQueue")
                .withReceiveTimeout(1_000L)
                .receive();
    }


}
