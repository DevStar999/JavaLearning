package com.company.aftergapinterviewprep;

import java.io.FileNotFoundException;

public class RecentLearnings17 {
    /* Dynamic Programming - Part 1, Standard DP Problems */

    // (1) Longest Common Subsequence - Given 2 strings find the length of the longest common subsequence
    // Time = O(n * m), Space = O(n * m) [Where, n = length of the 1st string, m = length of the 2nd string]
    public static int lcs(String s1, String s2) {
        int n1 = s1.length(), n2 = s2.length();
        int[][] ans = new int[n1+1][n2+1];
        for (int i=0; i<=n1; i++) {
            for (int j=0; j<=n2; j++) {
                if (i==0 || j==0) {
                    ans[i][j] = 0;
                } else if (s1.charAt(i-1) == s2.charAt(j-1)) {
                    ans[i][j] = 1 + ans[i-1][j-1];
                } else {
                    ans[i][j] = Math.max(ans[i-1][j], ans[i][j-1]);
                }
            }
        }

        return ans[n1][n2];
    }

    // (2) Longest Common Substring - Given 2 strings find the length of the longest common substring
    // Time = O(n * m), Space = O(n * m) [Where, n = length of the 1st string, m = length of the 2nd string]
    public static int lcst(String s1, String s2) {
        int fans = 0;
        int n1 = s1.length(), n2 = s2.length();
        int[][] ans = new int[n1+1][n2+1];
        for (int i=0; i<=n1; i++) {
            for (int j=0; j<=n2; j++) {
                if (i==0 || j==0) {
                    ans[i][j] = 0;
                } else {
                    ans[i][j] = (s1.charAt(i-1) == s2.charAt(j-1)) ? 1 + ans[i-1][j-1] : 0;
                }
                fans = Math.max(fans, ans[i][j]);
            }
        }

        return fans;
    }

    // (3) Edit Distance - Given 2 strings 's' and 't' find the number of edits required to convert 's' into 't'
    // In each edit we can either (a) Add a character (b) Replace a character (c) Remove a character
    // Time = O(n * m), Space = O(n * m) [Where, n = length of the 1st string, m = length of the 2nd string]
    public static int editDistance(String s, String t) {
        int n1 = s.length(), n2 = t.length();
        int[][] ans = new int[n1+1][n2+1];
        for (int i=0; i<=n1; i++) {
            for (int j=0; j<=n2; j++) {
                if (i==0 && j==0) {
                    ans[i][j] = 0;
                } else if (i==0) {
                    ans[i][j] = j;
                } else if (j==0) {
                    ans[i][j] = i;
                } else {
                    if (s.charAt(i-1) == t.charAt(j-1)) {
                        ans[i][j] = ans[i-1][j-1];
                    } else {
                        ans[i][j] = Math.min(ans[i-1][j-1], Math.min(ans[i][j-1], ans[i-1][j])) + 1;
                    }
                }
            }
        }

        return ans[n1][n2];
    }

    // (4.a) 0/1 Knapsack Problem - Given a knapsack of 'n' items, where each item has a value 'val' and a weight 'wt'
    // and the maximum capacity of the knapsack which is 'w', find the maximum value that can be calculated by
    // storing the items in the knapsack. Each item can be used only once at most.
    // Time = O(n * w), Space = O(n * w) [Where, n = number of items, w = maximum weight capacity of the knapsack]
    public static int knapsack01(int w, int wt[], int val[], int n) {
        int[][] ans = new int[n+1][w+1];
        for (int i=0; i<=n; i++) {
            for (int j=0; j<=w; j++) {
                if (i == 0 || j == 0) {
                    ans[i][j] = 0;
                } else {
                    if (j >= wt[i-1]) {
                        ans[i][j] = Math.max(ans[i-1][j], ans[i-1][j - wt[i-1]] + val[i-1]);
                    } else {
                        ans[i][j] = ans[i-1][j];
                    }
                }
            }
        }

        return ans[n][w];
    }

    // (4.b) Knapsack Problem with Duplicates - Given a knapsack of 'n' items, where each item has a value 'val' and a
    // weight 'wt' and the maximum capacity of the knapsack which is 'w', find the maximum value that can be calculated
    // by storing the items in the knapsack. Each item can be used an unlimited number of times. [Note - This is
    // different from the 0/1 Knapsack problem slightly]
    // Time = O(n * w), Space = O(n * w) [Where, n = number of items, w = maximum weight capacity of the knapsack]
    public static int knapsackWithDuplicates(int w, int wt[], int val[], int n) {
        int[][] ans = new int[n+1][w+1];
        for (int i=0; i<=n; i++) {
            for (int j=0; j<=w; j++) {
                if (i == 0 || j == 0) {
                    ans[i][j] = 0;
                } else {
                    if (j >= wt[i-1]) {
                        ans[i][j] = Math.max(Math.max(ans[i-1][j], ans[i][j-wt[i-1]] + val[i-1]),
                                ans[i-1][j - wt[i-1]] + val[i-1]);
                    } else {
                        ans[i][j] = ans[i-1][j];
                    }
                }
            }
        }

        return ans[n][w];
    }

    public static void main(String[] args) throws FileNotFoundException {
        // (1) Example for LCS
        String str11 = "catde", str12 = "cxat";
        int ans1 = lcs(str11, str12);
        System.out.println("Length of the Longest Common Subsequence (LCS) of (" + str11 + ", " + str12 + ") = " + ans1);

        // (2) Example for LCSt
        String str21 = "catde", str22 = "cxat";
        int ans2 = lcst(str21, str22);
        System.out.println("Length of the Longest Common Substring (LCSt) of (" + str21 + ", " + str22 + ") = " + ans2);

        // (3) Example for Edit Distance
        String str31 = "catde", str32 = "cxat";
        int ans3 = editDistance(str31, str32);
        System.out.println("Edit Distance for (" + str31 + ", " + str32 + ") = " + ans3);

        // (4.a) Example for 0/1 Knapsack Problem
        int w4 = 4, n4 = 3;
        int[] wt4 = {4, 5, 1}, val4 = {1, 2, 3};
        int ans4 = knapsack01(w4, wt4, val4, n4);
        System.out.println("The maximum value for 0/1 Knapsack Problem = " + ans4);

        // (4.a) Example for 0/1 Knapsack Problem
        int w5 = 4, n5 = 3;
        int[] wt5 = {4, 5, 1}, val5 = {1, 2, 3};
        int ans5 = knapsackWithDuplicates(w5, wt5, val5, n5);
        System.out.println("The maximum value for Knapsack Problem with Duplicates = " + ans5);
    }
}
