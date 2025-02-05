package com.example;

public class StringManipulator {
    public String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}
