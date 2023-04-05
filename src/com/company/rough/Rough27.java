package com.company.rough;

public class Rough27 {
    public static void main(String[] args) {
        String str1 = "This is str1";
        String str2 = "This is str2";
        if (str1.equals(str2)) {
            System.out.println("The strings are not equal");
        } else {
            System.out.println("The string are equal");
        }
        int compareValue = str1.compareTo(str2);
        System.out.println("compareValue = " + compareValue);
        String sample1 = "Viray";
        System.out.println("sample1 (With Typo) = " + sample1);
        int i = 2;
        sample1 = sample1.substring(0, i) + "n" + sample1.substring(i+1, sample1.length());
        System.out.println("sample1 (With Typo) = " + sample1);

        sample1 = sample1.toLowerCase();
        System.out.println("sample1 (lowercase) = " + sample1);
        sample1 = sample1.toUpperCase();
        System.out.println("sample1 (uppercase) = " + sample1);
        String sample1Rev = (new StringBuilder(sample1)).reverse().toString();
        System.out.println("sample1Rev = " + sample1Rev);

        String str = "Sample String", tr = "  trimmingIsRequired  ";
        str.length();
        System.out.println(str.substring(0, 4));
        System.out.println(str.startsWith("Sample"));
        System.out.println(str.endsWith("String"));
        System.out.println(tr.trim());
        System.out.println(str.replace('S', '#'));
        System.out.println(str.indexOf('a'));

        Integer sampleValue = Integer.valueOf("19");
        String strNew = Integer.toString(sampleValue);
        Integer sampleInt = sampleValue.intValue();
        int smallInt = Integer.parseInt("12");
        System.out.println(smallInt);
    }
}
