package com.training.self.controller;

import com.training.self.kafka.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @Autowired
    Producer producer;
    @GetMapping("/hello")
    public void hello() {
        producer.sendMessage("It will be superr");
    }
}
