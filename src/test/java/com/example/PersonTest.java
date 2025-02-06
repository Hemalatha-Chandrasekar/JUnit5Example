package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    public void testPersonEquality() {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Alice", 30);
        assertEquals(person1, person2, "Persons with the same name and age should be equal");
    }
}