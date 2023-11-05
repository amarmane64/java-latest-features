package com.modernjava.records;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ProductTest {

    @Test
    void createProduct() {
        var product = new Product("iphone", new BigDecimal("999"), "ELECTRONICS");
        System.out.println(product);
        assertEquals("iphone", product.name());
        assertEquals("ELECTRONICS", product.type());
    }

    @Test
    void createProduct_InvalidName() {

        var exception = assertThrows(IllegalArgumentException.class,
                () -> new Product("", new BigDecimal("999"), "ELECTRONICS"));
        assertEquals("Name is not valid", exception.getMessage());
    }

    @Test
    void createProduct_InvalidCost() {

        var exception = assertThrows(IllegalArgumentException.class,
                () -> new Product("iphone", new BigDecimal("-100"), "ELECTRONICS"));
        assertEquals("Cost is not valid", exception.getMessage());
    }

    @Test
    void createProduct_WithCustomConstructor() {
        var product = new Product("iphone", new BigDecimal("999"));
        System.out.println(product);
        assertEquals("General", product.type());
    }

    @Test
    void createProduct_Comparision() {
        var product = new Product("iphone", new BigDecimal("999"), "ELECTRONICS");
        var product1 = new Product("iphone", new BigDecimal("999"), "ELECTRONICS");
        assertEquals(product, product1);
    }
}