package com.virtualzoo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BatTest {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStream() {
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    public void restoreStream() {
        System.setOut(originalOut);
    }

    @Test
    public void testMove() {
        Bat bat = new Bat();
        bat.move();
        assertEquals("Bat is flying", outputStream.toString().trim());
    }

    @Test
    public void testEat() {
        Bat bat = new Bat();
        bat.eat();
        assertEquals("Bat is eating", outputStream.toString().trim());
    }
}
