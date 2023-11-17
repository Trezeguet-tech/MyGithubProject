package com.mkyong.examples;

import org.junit.jupiter.api.Test;

import com.tkm.examples.MessageBuilder;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestMessageBuilder {

    @Test
    public void testHelloWorld() {
        assertEquals("hello world", MessageBuilder.getHelloWorld());
    }

    @Test
    public void testNumber10() {
        assertEquals(30, MessageBuilder.getNumber10());
    }

    @TempDir
    File anotherTempDir;

    @Test
    void givenFieldWithTempDirectoryFile_whenWriteToFile_thenContentIsCorrect() throws IOException {
        assertTrue(this.anotherTempDir.isDirectory(), "Should be a directory ");

        File letters = new File(anotherTempDir, "letters.txt");
        List<String> lines = Arrays.asList("x", "y", "z");

        Files.write(letters.toPath(), lines);

        assertAll(
                () -> assertTrue(Files.exists(letters.toPath()), "File should exist"),
                () -> assertLinesMatch(lines, Files.readAllLines(letters.toPath())));
    }


}