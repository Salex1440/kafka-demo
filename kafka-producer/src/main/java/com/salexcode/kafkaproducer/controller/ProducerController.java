package com.salexcode.kafkaproducer.controller;

import com.salexcode.kafkaproducer.entity.Foo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    @Autowired
    private KafkaTemplate<String, Foo> kafkaTemplate;

    @PostMapping("/foo")
    public void foo(@RequestBody String bar) {
        kafkaTemplate.send("fooTopic", new Foo(bar));
    }
}
