package com.virtualzoo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DuckTest {
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
    public void testEat() {
        Duck duck = new Duck();
        duck.eat();
        assertEquals("Duck is eating", outputStream.toString().trim());
    }

    @Test
    public void testFly() {
        Duck duck = new Duck();
        duck.fly();
        assertEquals("Duck is flying", outputStream.toString().trim());
    }
}
