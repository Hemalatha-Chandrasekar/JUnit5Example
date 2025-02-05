package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {
    Calculator calculator;
    // Initialize a fresh Calculator instance before each test
    @BeforeEach
    public void setup() {

        calculator = new Calculator();
    }
    @Test
    void add() {
        int result = calculator.add(2, 3);
        assertEquals(5, result, "The addition result should be 5");
    }
    @Test
    void subtract() {
        int result = calculator.subtract(5, 3);
        assertEquals(2, result, "The subtraction result should be 2");
    }

    @Test
   void multiply() {
        int result = calculator.multiply(4, 3);
        assertEquals(12, result, "The multiplication result should be 12");
    }

    @Test
    void divide() {
        double result = calculator.divide(6, 2);
        assertEquals(3.0, result, 0.001, "The division result should be 3.0");
        // Test division by zero
        assertThrows(ArithmeticException.class, () -> calculator.divide(1, 0), "Division by zero should throw an ArithmeticException");

    }

    @Test
    void factorial() {
        int result = calculator.factorial(5);
        assertEquals(120, result, "The factorial of 5 should be 120");
        // Test factorial of 0
        result = calculator.factorial(0);
        assertEquals(1, result, "The factorial of 0 should be 1");
        // Test factorial of negative number (should throw exception)
        assertThrows(IllegalArgumentException.class, () -> calculator.factorial(-1), "Factorial of negative numbers should throw an IllegalArgumentException");
    }
}