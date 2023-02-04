package com.training.self.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class Producer {
    @Autowired
    KafkaTemplate<String, String> template;
    @Value(value = "${kafka.topic}")
    private String topic;

    public void sendMessage(String message) {
        template.send(topic, message);
    }
}
