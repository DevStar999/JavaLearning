package com.company.aftergapinterviewprep.part1;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RL20PrimeSieve {
    /* Prime Sieve (Sieve of Eratosthenes) */
    // Resources -> https://www.youtube.com/watch?v=T8PaMnb0GPo&list=PLauivoElc3ggagradg8MfOZreCMmXMmJ-&index=73
    // Ep 59, 60, 63, 64.1, 64.2 an overview of these videos is good to cover the topic
    // Question Links -> (1) https://www.hackerearth.com/problem/algorithm/monk-and-divisor-conundrum-56e0eb99/
    // (2) https://leetcode.com/problems/count-primes/

    // Time = O(n * log(log(n))), Space = O(n)
    public static void basicImplementationOfPrimeSieve(int n) {
        int limit = n + 10;
        boolean[] isPrime = new boolean[limit+1]; // Will store if a number 'i' being prime is true or false
        Arrays.fill(isPrime, true);
        isPrime[0] = false; isPrime[1] = false;
        for (int i=2; i<=limit; i++) {
            if (isPrime[i]) {
                for (int j=2*i; j<=limit; j+=i) {
                    isPrime[j] = false;
                }
            }
        }
        // Now by this point, the array 'isPrime' for it's ith value is true if the ith number is a prime

        for (int i=0; i<=limit; i++) {
            System.out.println("i = " + i + ", isPrime = " + isPrime[i]);
        }
    }

    // IMPORTANT NOTE -> This is the preferred implementation of a Prime Sieve that we should use
    public static void optimizedImplementationOfPrimeSieve(int n) {
        int limit = n + 10;
        boolean[] isPrime = new boolean[limit+1]; // Will store if a number 'i' being prime is true or false
        Arrays.fill(isPrime, true);
        isPrime[0] = false; isPrime[1] = false;
        for (int i=2; i*i<=limit; i++) {
            if (isPrime[i]) {
                for (int j=i*i; j<=limit; j+=i) {
                    isPrime[j] = false;
                }
            }
        }
        // Now by this point, the array 'isPrime' for it's ith value is true if the ith number is a prime

        for (int i=0; i<=limit; i++) {
            System.out.println("i = " + i + ", isPrime = " + isPrime[i]);
        }
    }

    // IMPORTANT NOTE -> Notice, here we are using the basic implementation of Prime Sieve for calculating the
    // Lowest Prime and Highest Prime arrays
    public static void variationsOfPrimeSieve(int n) {
        int limit = n + 10;
        // Initialising the arrays as follows
        boolean[] isPrime = new boolean[limit+1]; // Will store if a number 'i' being prime is true or false
        // 'lp' is for storing the lowest prime of 'i' and 'hp' is for storing the highest prime of 'i'
        int[] lp = new int[limit+1], hp = new int[limit+1];
        // Filling the base values as follows
        Arrays.fill(isPrime, true);
        isPrime[0] = false; isPrime[1] = false;
        lp[0] = 0; lp[1] = 1;
        hp[0] = 0; hp[1] = 1;
        for (int i=2; i<=limit; i++) {
            if (isPrime[i]) {
                lp[i] = i; hp[i] = i;
                for (int j=2*i; j<=limit; j+=i) {
                    if (isPrime[j]) {
                        lp[j] = i;
                        isPrime[j] = false;
                    }
                    hp[j] = i;
                }
            }
        }

        // Printing the computed values as follows
        for (int i=0; i<=limit; i++) {
            System.out.println("i = " + i + ", isPrime = " + isPrime[i]);
            System.out.println("i = " + i + ", lowestPrime = " + lp[i]);
            System.out.println("i = " + i + ", highestPrime = " + hp[i] + "\n");
        }

        // Now, let's say we are given a number 'val' and we are asked to find it's prime factors
        // We can do this easily by using either lp[val] or hp[val]
        int val = 24;
        int orgVal = 24; // Using this variable as we are changing the value of 'val' to find it's prime factors
        List<Integer> primeFactors = new ArrayList<>();
        while (val > 1) {
            int primeFactor = lp[val];
            while (val % primeFactor == 0) {
                primeFactors.add(primeFactor);
                val = val / primeFactor;
            }
        }
        Collections.sort(primeFactors); // This is optional and we do this if we want our prime factors to be in a sorted manner
        System.out.println("The prime factors of number = " + orgVal + " are as follows - ");
        for (Integer element: primeFactors) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws FileNotFoundException {
        // basicImplementationOfPrimeSieve(100);
        optimizedImplementationOfPrimeSieve(100);
        variationsOfPrimeSieve(100);
    }
}
