package com.company.aftergapinterviewprep;

import java.io.FileNotFoundException;

public class RecentLearnings12 {

    public static void main(String[] args) throws FileNotFoundException {
        String str = Long.toBinaryString(5L); // 5 -> 101;
        str = String.format("%3s", str);
        String str2 = String.format("%03d", 4);
        System.out.println("str = " + str2);
    }
}
