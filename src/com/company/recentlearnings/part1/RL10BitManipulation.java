package com.company.recentlearnings.part1;

import java.io.FileNotFoundException;

public class RL10BitManipulation {
    /* Bit Manipulation */
    // Resources -> (i) https://www.youtube.com/watch?v=Db8OmMfzwl8 (This is part 1 of 3, watch all 3 for all basics)
    // (ii) About 2 pages of handwritten notes in new book

    // Question for Practise -> https://www.interviewbit.com/coding-interview-questions/#topics[]=bit-manipulation
    // Account used was -> codegeek1998@gmail.com

    // Notes -> (1) For signed integers, 1st bit is signed bit and
    // if it is 0 -> Positive Number
    // if it is 1 -> Negative Number
    // (2) Any ith array (array of size 'n') element appears (i+1) * (n-i) times in total in all the sub-arrays of an array

    public static long reverse(long num) {
        String str = Long.toBinaryString(num);
        // System.out.println("str = " + str);
        str = String.format("%32s", str).replace(' ', '0');
        // System.out.println("str (32-bit) = " + str);
        String rev = (new StringBuilder(str)).reverse().toString();
        // System.out.println("rev = " + rev);
        return Long.parseLong(rev, 2);
    }

    public static void main(String[] args) throws FileNotFoundException {
        // (1) Convert any number (Integer or Long) to it's binary string
        String str1 = Long.toBinaryString(7L); // str1 = "111" (No leading zeros)
        String str2 = Integer.toBinaryString(14); // str2 = "1110" (Again, no leading zeros)
        System.out.println("str1 = " + str1 + ", str2 = " + str2); // str1 = 111, str2 = 1110

        // (2) Trick for padding a binary string with leading zeros so that size becomes 32
        String str3 = Integer.toBinaryString(18);
        str3 = String.format("%32s", str3).replace(' ', '0');
        System.out.println("str3 = " + str3); // str3 = 00000000000000000000000000010010

        // (3) Convert any binary string back to Integer or Long
        int base = 2; // Base of the number system. So, base = 2 means, Binary System
        int i1 = Integer.parseInt(str1, base);
        long l1 = Long.parseLong(str2, base);
        System.out.println("i1 = " + i1 + ", l1 = " + l1); // i1 = 7, l1 = 14

        // (4) Bitwise Operators
        int a = 3, b = 5;
        int andValue = a & b;
        int orValue = a | b;
        int xorValue = a ^ b;
        int aComplement = ~a;
        int shift = 2;
        int aRightShift = a>>shift;
        int aLeftShift = a<<shift;

        // (5) Tricks related to bit - Set 1
        // (5.a) Both of the following expressions are same & can be used for checking if number is even
        boolean exp1 = (a % 2 == 0), exp2 = ((a & 1) == 0);
        // (5.b) Check if the ith bit in a number is 0 or 1 i.e. Find ith bit in a number (ith bit from right)
        int i = 4;
        int num1 = 57; // 57 -> 111001
        int mask1 = 1<<i;
        if ((num1 & mask1) > 0) {
            System.out.println("i = " + i + " has set bit i.e. it has 1 in ith bit (from right)");
        } else {
            System.out.println("i = " + i + " is NOT set i.e. it has 0 in ith bit (from right)");
        }
        // (5.c) Set ith bit in a number i.e. set the bit to 1 if it is not already
        int num2 = 96; // 96 -> 110000
        int mask2 = 1<<i;
        int result2 = num2 | mask2; // Doing OR with mask
        System.out.println("result2 = " + result2); // 112 -> 111000
        // (5.d) Clear ith bit in a number i.e. set the bit to 0 if it is not already
        int num3 = 63; // 63 -> 111111
        int mask3 = ~(1<<i);
        int result3 = num3 & mask3;
        System.out.println("result3 = " + result3); // 47 -> 101111
        // (5.e) Find the number of bits required to change 'a' to 'b'
        int xorValue2 = a ^ b; // Take XOR of both numbers
        System.out.println("xorValue2 = " + xorValue2); // 1 -> 101111
        int ans = 0;
        while (xorValue2 > 0) { // Count the no. of set bits in the XOR value
            if (xorValue2 % 2 == 1) {
                ans++;
            }
            xorValue2 = xorValue2>>1;
        }
        System.out.println("ans = " + ans);
        // (5.f) Count the number of bits in a number
        int num4 = 1024;
        int result4 = ((int) (Math.log(num4) / Math.log(2))) + 1; // 1st way of finding answer
        int result5 = Integer.toBinaryString(num4).length(); // 2nd way to finding answer
        System.out.println("result4 = " + result4 + ", result5 = " + result5);
    }
}
