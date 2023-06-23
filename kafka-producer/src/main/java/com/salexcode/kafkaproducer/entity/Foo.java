package com.salexcode.kafkaproducer.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.kafka.common.serialization.Serializer;


@Getter
@Setter
@AllArgsConstructor
@ToString
public class Foo implements Serializer {

    private String bar;

    public Foo() {
    }

    @Override
    public byte[] serialize(String s, Object o) {
        return new byte[0];
    }
}
