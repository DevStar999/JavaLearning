package com.company.rough;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rough11 {
    public static void main(String[] args) {
        /*
        long tempNumber = Long.MAX_VALUE; // Value = 2^62
        System.out.println("Long.MAX_VALUE = " + tempNumber);
        int powerOfTwo = 0;
        while (tempNumber != 1) {
            tempNumber = tempNumber/2;
            powerOfTwo++;
        }
        System.out.println("powerOfTwo = " + powerOfTwo);
        */

        List<Integer> l1 = new ArrayList(Arrays.asList(1, 2, 3));
        // List<Integer> l2 = (ArrayList<Integer>) l1.clone();
        l1.indexOf(2);
    }
}
