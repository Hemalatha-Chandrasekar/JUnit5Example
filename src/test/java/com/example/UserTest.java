package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    public void testUserEquality() {
        Address address = new Address("123 Main St", "Springfield");
        User user1 = new User("John Doe", address);
        User user2 = new User("John Doe", address);
        assertEquals(user1, user2, "Users with the same name and address should be equal");
    }
}