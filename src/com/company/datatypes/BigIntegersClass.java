package com.company.datatypes;

import java.math.BigInteger;

public class BigIntegersClass {
    public static void main(String[] args) {
        /** Most commonly used constructors for 'BigIntegers' class **/
        // (1) Initializing the 'BigInteger' variable with an 'int' by converting it into a String first.
        int val1 = 12;
        BigInteger num1 = new BigInteger(Integer.toString(val1));

        // (2) Initializing the 'BigInteger' variable with a String.
        BigInteger num2 = new BigInteger("4");

        // (3) Initializing the 'BigInteger' variable with in-built static constant fields(namely 0,1 & 10).
        BigInteger num3 = BigInteger.ZERO; // BigInteger.ONE or BigInteger.TEN is also valid.

        // (4) Initializing the 'BigInteger' variable using in-built method.
        BigInteger num4 = BigInteger.valueOf(56);

		/* (5) Initializing the 'BigInteger' variable with value(in String format) in a number system 
		 	with a specific radix(base) and then specifying the radix as the second parameter. This constructor
		 	will convert this value to the equivalent value in the decimal number system. 
		*/
        BigInteger num5 = new BigInteger("1000" /*Binary equivalent for 8*/, /*radix = 2 (i.e. Binary)*/ 2);

        /** Most commonly used methods for 'BigIntegers' class **/
        /* Set 1 */
        BigInteger sum = num1.add(num2);
        BigInteger diff = num1.subtract(num2);
        BigInteger product = num1.multiply(num2);
        BigInteger quotient = num1.divide(num2);

        /* Set 2 */
        // -1, 0 or 1 for num1 being less, equal or greater than num2 respectively.
        int verdict = num1.compareTo(num2);
        // Conversion methods.
        int it = num1.intValue();
        double db = num1.doubleValue();
        float ft = num1.floatValue();
        String str = num1.toString();
        // The following method return true if 'num1' is probably a prime or false when it is definitely composite.
        boolean primeOrNot = num1.isProbablePrime(1);

        /* Set 3 */
        BigInteger maxVal = num1.max(num2);
        BigInteger minVal = num1.min(num2);
        BigInteger modVal = num1.mod(num2); // modVal = num1 % num2
        BigInteger modInverse = num1.modInverse(num2); // modInverse = (num1^(-1)) % num2
        BigInteger modExpo = num1.modPow(num2, num3); // modExpo = (num1 ^ num2) % num3
        BigInteger negVal = num1.negate(); // negVal = (-1) * num1
        BigInteger expoVal = num1.pow(10 /*exponent in the form of an int*/); // expoVal = num1 ^ 10
    }
}
