package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
        @Test
        public void testProductEquality() {
            Product product1 = new Product("Laptop", 1500.00);
            Product product2 = new Product("Laptop", 1500.00);
            assertEquals(product1, product2, "Products with the same name and price should be equal");
        }
}