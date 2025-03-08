package com.vafam.app.arrays;

public class SampleArray {

    /** Array Addtion */
    public int add(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
    
    // Subtract two Arrays
    public int subtract(int[] numbers) {
        int diff = 0;
        for (int i = 0; i < numbers.length; i++) {
            diff -= numbers[i];
        }
        return diff;
    }
}
