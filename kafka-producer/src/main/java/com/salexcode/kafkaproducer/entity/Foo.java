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
public class Foo {

    private String bar;

    public Foo() {
    }

}
