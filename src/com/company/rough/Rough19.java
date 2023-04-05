package com.company.rough;

import java.util.Random;

public class Rough19 {
    public static void newFunction(String str1, String str2, int... values) {

    }

    public static void main(String[] args) {
        Random random = new Random();
        int minValue = 3;
        int maxValue = 7;
        int randomNumber = random.nextInt(maxValue - minValue) + minValue; // Range -> [minValue, maxValue)
        // i.e. minValue is inclusive and maxValue is exclusive

        System.out.println("randomNumber = " + randomNumber);

        int[] arr = new int[3];
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();

        int grid[][] = new int[3][4];

        double dbValue = 3.794617916;
        long intValue = 4;
        System.out.println(String.format("%04d", intValue));
        System.out.println(String.format("%.3f", dbValue));
    }
}
