package com.mycompany.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ArrayUtilsTest {
    @Test
    void testSumArray() {
        ArrayUtils utils = new ArrayUtils();

        // Test with a regular array
        int[] array = {1, 2, 3, 4, 5};
        int result = utils.sumArray(array);

        // Verify the result
        assertEquals(15, result, "The sum of {1, 2, 3, 4, 5} should be 15");
    }

    @Test
    void testSumArrayEmpty() {
        ArrayUtils utils = new ArrayUtils();

        // Test with an empty array
        int[] array = {};
        int result = utils.sumArray(array);

        // Verify the result
        assertEquals(0, result, "The sum of an empty array should be 0");
    }

    @Test
    void testSumArrayNegativeNumbers() {
        ArrayUtils utils = new ArrayUtils();

        // Test with negative numbers
        int[] array = {-1, -2, -3, -4};
        int result = utils.sumArray(array);

        // Verify the result
        assertEquals(-10, result, "The sum of {-1, -2, -3, -4} should be -10");
    }

    @Test
    void testSumArrayNull() {
        ArrayUtils utils = new ArrayUtils();

        // Test with a null array and expect an exception
        assertThrows(IllegalArgumentException.class, () -> utils.sumArray(null), 
            "Passing a null array should throw IllegalArgumentException");
    }
}
