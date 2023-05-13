package com.company.aftergapinterviewprep.part2;

import java.io.FileNotFoundException;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

class CustomObject {
    int val1, val2;
    String val3;
    public CustomObject(int val1, int val2, String val3) {
        this.val1 = val1;
        this.val2 = val2;
        this.val3 = val3;
    }
    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof CustomObject)) return false;
        CustomObject temp = (CustomObject) other;
        return (this.val1 == temp.val1 && this.val2 == temp.val2 && this.val3.equals(temp.val3));
    }
    @Override
    public int hashCode() {
        return Objects.hash(val1, val2, val3);
    }
}

@SuppressWarnings("DuplicateExpressions")
public class RL21Misc {
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

        // (3) Example on how to override the 'equals' and 'hashcode' methods for the custom class so that it can be
        // used correctly with 'Set' data structure
        Set<CustomObject> set = new HashSet<>();
        CustomObject customObject = new CustomObject(2, 3, "String Value");
        set.add(customObject);
        if (set.contains(customObject)) {
            System.out.println("Set related code works now");
        } else {
            System.out.println("Set related code is NOT working now");
        }
    }
}
