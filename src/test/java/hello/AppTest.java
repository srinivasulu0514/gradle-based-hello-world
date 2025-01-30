package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

import java.nio.charset.Charset;

public class AppTest {
    @Test
    public void testEncodingFailure() {
        String text = "Test with special char: ¥";
        byte[] asciiBytes = text.getBytes(Charset.forName("ASCII")); // Causes error
        String converted = new String(asciiBytes, Charset.forName("ASCII"));
        assertEquals("Test with special char: ¥", converted); // This will fail
    }
}
