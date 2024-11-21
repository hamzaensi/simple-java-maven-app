package com.mycompany.app;

import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.assertEquals;

class AdditionTest {
    @Test
    void testAdd() {
        // Create an instance of the Addition class
        Addition addition = new Addition();

        // Test the add method
        int result = addition.add(5, 3);

        // Verify the result
        assertEquals(8, result, "5 + 3 should equal 8");
    }

    @Test
    void testAddNegativeNumbers() {
        Addition addition = new Addition();

        // Test with negative numbers
        int result = addition.add(-5, -3);

        // Verify the result
        assertEquals(-8, result, "-5 + -3 should equal -8");
    }

    @Test
    void testAddWithZero() {
        Addition addition = new Addition();

        // Test adding zero
        int result = addition.add(0, 5);

        // Verify the result
        assertEquals(5, result, "0 + 5 should equal 5");
    }
}

