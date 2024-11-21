package com.mycompany.app;

public class Addition {

    // Method to add two numbers
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        
        Addition add = new Addition();

        System.out.println(add.add(5, 6));
    }
    
}
