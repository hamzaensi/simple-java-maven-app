package com.mycompany.app;

public class ArrayUtils {
    
    // Method to compute the sum of elements in an array
    public int sumArray(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}
