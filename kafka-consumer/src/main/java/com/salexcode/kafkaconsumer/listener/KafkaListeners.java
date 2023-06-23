package com.salexcode.kafkaconsumer.listener;

import com.salexcode.kafkaconsumer.entity.Foo;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "fooTopic",
            groupId = ""
    )
    void listener(Foo data) {
        System.out.println(data);
    }
}
