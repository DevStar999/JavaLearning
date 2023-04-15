package com.company.aftergapinterviewprep;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class RecentLearnings18 {
    /* Dynamic Programming - Part 2, Standard DP Problems */

    // (1) Longest Increasing Subsequence (LIS) - Given an array find the length of the longest strictly increasing subsequence
    // in the array.
    // Time = O(n ^ 2), Space = O(n) [Where, n = length of the array]
    public static int lis(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Arrays.fill(ans, 1);
        int fans = 1;
        for (int i=1; i<n; i++) {
            for (int j=0; j<i; j++) {
                if (arr[j] < arr[i]) {
                    ans[i] = Math.max(ans[i], ans[j] + 1);
                    fans = Math.max(fans, ans[i]);
                }
            }
        }
        return fans;
    }

    // (2) Longest Palindromic Subsequence (LPS) - Given a string find the length of the longest palindromic subsequence
    // Time = O(n ^ 2), Space = O(n ^ 2) [Where, n = length of the array]
    // The solution to the problem came more intuitively with Memoization (Top - Down Approach)
    public static int lpsRec(String str, int start, int end, int[][] ans) {
        if (ans[start][end] == -1) {
            int n = end - start + 1;
            if (n == 1) {
                ans[start][end] = 1;
            } else if (n == 2) {
                if (str.charAt(start) == str.charAt(end)) {
                    ans[start][end] = 2;
                } else {
                    ans[start][end] = 1;
                }
            } else {
                if (str.charAt(start) == str.charAt(end)) {
                    ans[start][end] = 2 + lpsRec(str, start+1, end-1, ans);
                } else {
                    ans[start][end] = Math.max(lpsRec(str, start+1, end, ans), lpsRec(str, start, end-1, ans));
                }
            }
        }
        return ans[start][end];
    }

    public static int lps(String str) {
        int n = str.length();
        int[][] ans = new int[n][n];
        for (int i=0; i<n; i++) {
            Arrays.fill(ans[i], -1);
        }
        return lpsRec(str, 0, n-1, ans);
    }

    // (3) Longest Palindromic SubString (LPSt) - Given a string find the length of the longest palindromic substring
    // Time = O(n ^ 2), Space = O(1) [Where, n = length of the array]
    public static void extendPalindrome(String s, int start, int end, int[] ans, int n) {
        while (start >= 0 && end <n && s.charAt(start) == s.charAt(end)) {
            if ((end - start + 1) > ans[2]) {
                ans[2] = end - start + 1;
                ans[0] = start;
                ans[1] = end;
            }
            start--;
            end++;
        }
    }

    public static int lpst(String s) {
        int n = s.length();
        int[] ans = new int[3];
        ans[0] = 0; // start index
        ans[1] = 0; // end index
        ans[2] = 1; // max length
        if (n <= 1) {
            return ans[2];
        }

        for (int i=0; i<n; i++) {
            extendPalindrome(s, i, i, ans, n); // For odd length
            extendPalindrome(s, i, i+1, ans, n); // For even length
        }

        return ans[2];
    }

    // (4.a) Coin Change Problem (Min. no. of coins) - Given a list of coins having certain values 'coins' and a total
    // value 'sum'. Find the min. no. of coins to give change for the value 'sum' (Assume, we have an infinite supply of
    // each coin)
    // Time = O(n * sum), Space = O(sum) [Where, n = Total values for coins & sum = Total value for change in coins]
    public static int coinChangeMinCoins(int[] coins, int n, int sum) {
        Arrays.sort(coins);
        int[] ans = new int[sum+1];
        Arrays.fill(ans, -1);
        ans[0] = 0;
        for (int i=0; i<n; i++) {
            for (int j=1; j<=sum; j++) {
                if (j >= coins[i]) {
                    int cur = ans[j], back = ans[j-coins[i]];
                    if (cur == -1 && back == -1) {
                        ans[j] = -1;
                    } else if (cur != -1 && back == -1) {
                        ans[j] = cur;
                    } else if (cur == -1 && back != -1) {
                        ans[j] = back + 1;
                    } else {
                        ans[j] = Math.min(cur, back + 1);
                    }
                }
            }
        }
        return ans[sum];
    }

    // (4.b) Coin Change Problem (Total no. of ways) - Given a list of coins having certain values 'coins' and a total
    // value 'sum'. Find the total no. of ways to give change for the value 'sum' (Assume, we have an infinite supply of
    // each coin)
    // Time = O(n * sum), Space = O(sum) [Where, n = Total values for coins & sum = Total value for change in coins]
    public static long coinChangeTotalWays(int coins[], int n, int sum) {
        Arrays.sort(coins);
        long ans[] = new long[sum+1];
        Arrays.fill(ans, 0);
        ans[0] = 1;
        for (int i=0; i<n; i++) {
            for (int j=1; j<=sum; j++) {
                if (j >= coins[i]) {
                    long cur = ans[j], back = ans[j-coins[i]];
                    ans[j] = cur + back;
                }
            }
        }
        return ans[sum];
    }

    public static void main(String[] args) throws FileNotFoundException {
        // (1) Example for Longest Increasing Subsequence (LIS)
        int[] arr1 = {10, 9, 2, 5, 3, 7, 101, 18};
        int ans1 = lis(arr1);
        System.out.println("ans1 = " + ans1);

        // (2) Example for Longest Palindromic Subsequence (LPS)
        String str2 = "bbabcbcab";
        int ans2 = lps(str2);
        System.out.println("ans2 = " + ans2);

        // (3) Example for Longest Palindromic Substring (LPSt)
        String str3 = "babad";
        int ans3 = lpst(str3);
        System.out.println("ans3 = " + ans3);

        // (4.a) Example for Coin Change Problem (Min. no. of coins)
        int[] coins4a = {1, 9, 5};
        int sum4a = 11;
        int ans4a = coinChangeMinCoins(coins4a, coins4a.length, sum4a);
        System.out.println("ans4a = " + ans4a);

        // (4.b) Example for Coin Change Problem (Total no. of ways)
        int[] coins4b = {1, 2, 3};
        int sum4b = 4;
        long ans4b = coinChangeTotalWays(coins4b, coins4b.length, sum4b);
        System.out.println("ans4b = " + ans4b);
    }
}
