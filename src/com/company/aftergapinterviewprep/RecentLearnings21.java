package com.company.aftergapinterviewprep;

import java.io.FileNotFoundException;

@SuppressWarnings("DuplicateExpressions")
public class RecentLearnings21 {
    /* Useful Function - Fast Exponentiation */

    public static long fastExpo(long base, long index, long mod) {
        if (index == 0L) return 1L;
        if (index == 1L) return (base % mod);
        if (index == 2L) return ((base % mod) * (base % mod)) % mod;

        long result = fastExpo(base, index/2, mod) % mod;
        if (index % 2 == 1) {
            long p1 = ((result % mod) * (result % mod)) % mod;
            return ((p1 % mod) * (base % mod)) % mod;
        }
        // This means (index % 2 == 0)
        return ((result % mod) * (result % mod)) % mod;
    }

    public static void main(String[] args) throws FileNotFoundException {
        long mod = 1000000000 + 7; // The famous mod value = 10^9 + 7;
        long base = 5, index = 22;
        long value = fastExpo(base, index, mod);
        System.out.println("value = " + value);
    }
}
