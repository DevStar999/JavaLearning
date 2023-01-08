package com.company.rough;

public class Rough11 {
    public static void main(String[] args) {
        long tempNumber = Long.MAX_VALUE; // Value = 2^62
        System.out.println("Long.MAX_VALUE = " + tempNumber);
        int powerOfTwo = 0;
        while (tempNumber != 1) {
            tempNumber = tempNumber/2;
            powerOfTwo++;
        }
        System.out.println("powerOfTwo = " + powerOfTwo);
    }
}
