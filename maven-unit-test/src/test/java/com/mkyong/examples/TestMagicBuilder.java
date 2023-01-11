package com.mkyong.examples;

import org.junit.jupiter.api.Test;

import com.tkm.examples.MagicBuilder;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMagicBuilder {

    @Test
    public void testLucky() {
        assertEquals(7, MagicBuilder.getLucky());
    }

}
