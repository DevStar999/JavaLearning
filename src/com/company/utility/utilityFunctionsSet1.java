package com.company.utility;

import java.util.concurrent.TimeUnit;

public class utilityFunctionsSet1 {

    public static String convertMilliToTimerDisplay(long milliseconds) {
        long minutes = TimeUnit.MILLISECONDS.toMinutes(milliseconds)%60L; // If total minutes go over 60 minutes
        long seconds = TimeUnit.MILLISECONDS.toSeconds(milliseconds)%60L; // If total seconds go over 60 seconds
        return String.format("%02d:%02d", minutes, seconds);
    }

    public static void main(String[] args) {
        long milliSeconds = 2*60*1000 /*2 minutes*/ + 29100 /*29 seconds, 100 milliseconds*/ ;
        System.out.println(convertMilliToTimerDisplay(milliSeconds)); // Output - 02:29
    }

}
