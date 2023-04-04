package com.company.strings;

public class Strings2 {
    public static boolean checkAlphaNumericForCharacter(char ch) {
        return ((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'));
    }

    public static boolean checkAlphaNumericForWholeString(String str) {
        for (int i=0; i<str.length(); i++) {
            if (!checkAlphaNumericForCharacter(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String words[] = {"dunk", "trunk", "durable", "steam"};

        for (String s : words) {
            if (s.startsWith("du")) {
                System.out.println(s + " starts with 'du'");
            }
            if (s.endsWith("unk")) {
                System.out.println(s + " ends with 'unk'");
            }
        }

        String str = "common_string_methods_common_string_methods";
		 /* The .indexOf() method returns the index of the first occurrence of the parameter string or character.
			If it is not present it returns -1.
		*/
        System.out.println(str.indexOf("omm"));
        System.out.println(str.indexOf('m', 3)); // Starts searching from index 3.

        String a = "Vinay ", b = "Nagalgaonkar";
        String tr = "    trimMeFromStartAndEnd      ";
        a = a.concat(b); // Explicit method returning the concatenation of 2 strings.
        System.out.println("a = " + a);
        System.out.println(b.replace('a', 'X')); // Returns a string where first char is replaced by the second.

        // The following method returns a string where each character of the English alphabet is in Upper-case.
        System.out.println("b(Uppercase) = " + b.toUpperCase());
        System.out.println("b(Lowercase) = " + b.toLowerCase()); // Same for Lower-case.
        System.out.println(tr = tr.trim()); // Returns a string where leading and trailing spaces are removed.

        // Trick to capitalize the first letter of the string and keep other characters of lower-case.
        String cap = "vInaY";
        cap = (cap.toUpperCase()).substring(0, 1) + (cap.toLowerCase()).substring(1);
        System.out.println("cap = " + cap);

        // Checking if string is completely AlphaNumeric or not
        String sampleString = "A man, a plan, a canal: Panama";
        if (checkAlphaNumericForWholeString(sampleString)) {
            System.out.println("Given string is completely alphaNumeric");
        } else {
            System.out.println("Given string is not completely alphaNumeric");
        }

        // Convert a char array back to a String
        char[] chArray = {'c', 'h', 'a', 'r', 'A', 'r', 'r', 'a', 'y'};
        String chString = String.valueOf(chArray);
        System.out.println("chString = " + chString);
    }
}
