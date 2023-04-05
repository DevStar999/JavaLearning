package com.company.rough;

public class Rough29 {
    public static long fact(long n) {
        if (n == 1L) {
            return 1L;
        } else {
            return n * fact(n-1);
        }
    }

    public static int gcd(int a, int b) {
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (b % a == 0) {
            return a;
        } else {
            return gcd(a, b % a);
        }
    }

    public static void main(String[] args) {
        long number = 4;
        long factorialOfNumber = fact(number);
        System.out.println("Factorial = " + factorialOfNumber);

        int a = 15, b = 10;
        System.out.println("GCD(" + a + ", " + b + ") = " + gcd(a, b));
    }
}
