// Frequency counter for the roll of dice.
package com.company.phase2;

import java.util.Random;

public class FrequencyCounter {
    public static void main(String[] args) {
        Random dice = new Random();
        int freq[] = new int[7];

        for (int i = 1; i <= 1000; i++) {
            freq[1 + dice.nextInt(6)]++;
        }

        System.out.println("Face\tFrequency");
        for (int face = 1; face < freq.length; face++) {
            System.out.println(face + "\t" + freq[face]);
        }
    }
}
