package com.company.utility;

public class UtilityFunctionsSet1 {
    public static int getItself(int val, int dummy) {
        return val;
    }

    public static int gcd(int a, int b) {
        if (a > b) {
            a = getItself(b, b = a);
        }

        if (b % a == 0) {
            return a;
        } else {
            return gcd(a, b % a);
        }
    }

    public static void main(String[] args) {
        int i1 = 5, i2 = 10;
        System.out.println("Before swap : i1 = " + i1 + ", i2 = " + i2);

        /* Neat trick to Swap value between two variables is as follows */
        i1 = getItself(i2, i2=i1);
        System.out.println("Before swap : i1 = " + i1 + ", i2 = " + i2);

        int num1 = 5, num2 = 10;
        /* Getting the GCD of the above 2 numbers as follows */
        int gcdValue = gcd(num1, num2);
        System.out.println("gcdValue = " + gcdValue);
    }
}
