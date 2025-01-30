package com.example;

import java.io.UnsupportedEncodingException;

public class App {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String text = "Hello, World! ¥"; // Unicode character (:relaxed:) will cause an issue
        byte[] asciiBytes = text.getBytes("ASCII"); // Attempt to encode in ASCII
        System.out.println(new String(asciiBytes, "ASCII"));
    }
}
