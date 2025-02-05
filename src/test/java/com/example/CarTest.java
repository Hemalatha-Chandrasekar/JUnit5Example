package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

 @Test
    void testEquality() {
        Car car1 = new Car("Toyota", "Camry");
        Car car2 = new Car("Toyota", "Camry");
        assertEquals(car1, car2, "Cars with the same make and model should be equal");

    }
}