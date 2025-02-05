package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {

    @Test
    void reverse() {
        StringManipulator manipulator = new StringManipulator();
        String result = manipulator.reverse("hello");
        assertEquals("olleh", result, "The reversed string should be 'olleh'");
    }
}