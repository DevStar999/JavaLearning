package com.company.aftergapinterviewprep;

import java.io.FileNotFoundException;
import java.util.AbstractMap;
import java.util.Map;

@SuppressWarnings("DuplicateExpressions")
public class RecentLearnings21 {
    /* Miscellaneous Topics */

    /* (1) Fast Exponentiation */
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
        // (1) Example for Fast Exponentiation
        long mod = 1000000000 + 7; // The famous mod value = 10^9 + 7;
        long base = 5, index = 22;
        long value = fastExpo(base, index, mod);
        System.out.println("value = " + value);

        // (2) Alternative for Pair Class (We can use this if we are not allowed to use the "javafx.util.*" package)
        Map.Entry<Integer, Integer> pairAlternative = new AbstractMap.SimpleEntry<Integer, Integer>(23, 58);
        int firstVal = pairAlternative.getKey();
        int secondVal = pairAlternative.getValue();
        pairAlternative.setValue(45); // We do NOT get a setKey() method
    }
}
