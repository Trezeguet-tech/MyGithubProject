package com.mkyong.examples;

import org.junit.jupiter.api.Test;

import com.tkm.examples.MessageBuilder;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMessageBuilder {

    @Test
    public void testHelloWorld() {
        assertEquals("hello world", MessageBuilder.getHelloWorld());
    }

    @Test
    public void testNumber10() {
        assertEquals(31, MessageBuilder.getNumber10());
    }

}