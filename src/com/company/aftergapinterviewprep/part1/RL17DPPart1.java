package com.company.aftergapinterviewprep.part1;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class RL17DPPart1 {
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

    // (5.a) Subset Sum Problem - Given a set of values and a 'sum' value, determine if there is a subset of values
    // from the given values which forms the given sum.
    // Time = O(n * sum), Space = O(n * sum) [Where, n = number of items, sum = total sum value]
    public static boolean subsetSum(int n, int[] arr, int sum) {
        boolean[][] ans = new boolean[n+1][sum+1];
        // Base case
        for (int i=0; i<=n; i++) {
            ans[i][0] = true;
        }
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=sum; j++) {
                if (j >= arr[i-1]) {
                    ans[i][j] = ans[i-1][j] | ans[i-1][j-arr[i-1]];
                } else {
                    ans[i][j] = ans[i-1][j];
                }
            }
        }
        return ans[n][sum];
    }

    // (5.b) Subset Sum Problem - Given a set of values and a 'sum' value, determine if there is a subset of values
    // from the given values which forms the given sum and if there does exist at-least one subset, then report any one
    // subset or return an empty array
    // Time = O(n * sum), Space = O(n * sum) [Where, n = number of items, sum = total sum value]
    public static List<Integer> subsetSumReportSubset(int n, int[] arr, int sum) {
        boolean[][] ans = new boolean[n+1][sum+1];
        // Base case
        for (int i=0; i<=n; i++) {
            ans[i][0] = true;
        }
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=sum; j++) {
                if (j >= arr[i-1]) {
                    ans[i][j] = ans[i-1][j] | ans[i-1][j-arr[i-1]];
                } else {
                    ans[i][j] = ans[i-1][j];
                }
            }
        }

        List<Integer> ansSet = new ArrayList<>();
        int row = n, col = sum, curSum = sum;
        if (ans[row][col]) {
            while (curSum > 0 && row >= 0 && col >= 0) {
                if (ans[row-1][col]) {
                    row--;
                } else {
                    int val = arr[row-1];
                    ansSet.add(val);
                    col = col - val;
                    row--;
                    curSum -= val;
                }
            }
        }
        return ansSet;
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
        int w4a = 4, n4a = 3;
        int[] wt4a = {4, 5, 1}, val4a = {1, 2, 3};
        int ans4a = knapsack01(w4a, wt4a, val4a, n4a);
        System.out.println("The maximum value for 0/1 Knapsack Problem = " + ans4a);

        // (4.b) Example for 0/1 Knapsack Problem (With Duplicates)
        int w4b = 4, n4b = 3;
        int[] wt4b = {4, 5, 1}, val4b = {1, 2, 3};
        int ans4b = knapsackWithDuplicates(w4b, wt4b, val4b, n4b);
        System.out.println("The maximum value for Knapsack Problem with Duplicates = " + ans4b);

        // (5.a) Example for Subset Sum Problem
        int sum5a = 9, n5a = 6;
        int[] arr5a = {3, 34, 4, 12, 5, 2};
        boolean ans5a = subsetSum(n5a, arr5a, sum5a);
        System.out.println("For the Subset Sum Problem, ans5a = " + ans5a);

        // (5.b) Example for Subset Sum Problem (Report Subset)
        int sum5b = 9, n5b = 6;
        int[] arr5b = {3, 34, 4, 12, 5, 2};
        List<Integer> ans5b = subsetSumReportSubset(n5b, arr5b, sum5b);
        System.out.println("For the Subset Sum Problem, ans5b = " + ans5b);
    }
}
