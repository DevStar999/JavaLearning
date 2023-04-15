package com.company.aftergapinterviewprep;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class RecentLearnings16 {
    /* Dynamic Programming - Basics */
    // Review the notes in the Notes app in the 'Interview Prep' folder
    // The are 2 methods to store the results in memory and solve the problems which can be solved using DP -
    // (a) Memoization (Top - Down Approach)
    // (b) Tabulation (Bottom - Up Approach)

    // (1.a) Solving the problem to find the nth Fibonacci number using Memoization (Top - Down Approach)
    public static int nthFibonacciUsingMemoization(int n, int[] dp) {
        if (dp[n] == -1) {
            if (n <= 1) {
                dp[n] = n;
            } else {
                dp[n] = nthFibonacciUsingMemoization(n-1, dp) + nthFibonacciUsingMemoization(n-2, dp);
            }
        }
        return dp[n];
    }

    public static int nthFibonacciUsingMemoizationMain(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1); // Initialising the dp table to a NIL value i.e. -1

        return nthFibonacciUsingMemoization(n, dp);
    }

    // (1.b) Solving the problem to find the nth Fibonacci number using Tabulation (Bottom - Up Approach)
    public static int nthFibonacciUsingTabulation(int n) {
        int[] dp = new int[n+1];
        dp[0] = 0; dp[1] = 1;
        for (int i=2; i<=n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }


    public static void main(String[] args) throws FileNotFoundException {
        int ans1 = nthFibonacciUsingMemoizationMain(6);
        System.out.println("ans1 = " + ans1); // ans1 = 8

        int ans2 = nthFibonacciUsingTabulation(6);
        System.out.println("ans2 = " + ans2); // ans2 = 8
    }
}
