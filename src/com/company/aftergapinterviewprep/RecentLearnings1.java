package com.company.aftergapinterviewprep;

import javafx.util.Pair;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

// Custom comparator example for practise
class CustomComparator implements Comparator<Pair<Integer, Integer>> {
    public int compare(Pair<Integer, Integer> it1, Pair<Integer, Integer> it2) {
        if (it1.getKey().equals(it2.getKey())) {
            return it1.getValue().compareTo(it2.getValue());
        }
        return it1.getKey().compareTo(it2.getKey());
    }
}

public class RecentLearnings1 {
    // Kadane's Algorithm
    // Question Link -> https://leetcode.com/problems/maximum-subarray/

    // Question Link -> https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
    // Here, we have made use of the 'nextHigh' array, which can be considered a DP or pre-computational array
    public int maxProfit(int[] prices) {
        int ans = 0;
        int n = prices.length;
        int[] nextHigh = new int [n];

        for (int i=n-1; i>=0; i--) {
            if (i == n-1) {
                nextHigh[i] = prices[i];
            } else {
                nextHigh[i] = Math.max(prices[i+1], nextHigh[i+1]);
            }
        }

        for (int i=0; i<n; i++) {
            ans = Math.max(ans, nextHigh[i] - prices[i]);
        }

        return ans;
    }

    public static void main(String[] args) throws FileNotFoundException {
        //System.setIn(new FileInputStream("/Users/development/Devwork/Java/IdeaProjects/JavaLearning/src/com/" +
        //        "company/aftergapinterviewprep/input.txt"));

        /* Array Basics */
        int n1 = 7, i = 5;
        int[] arr = new int[n1]; // n = size of the array
        Integer[] arr1 = {1, 4, 2, 9}; // Initialise with elements

        Arrays.toString(arr); // To show an array as a string
        int n = arr.length; // Gives the length of the array
        int temp = arr[i]; // accessing the ith element in the array

        Arrays.sort(arr); // Sorting an array in ascending order
        // Sorting an array in descending order (Note that elements are of type 'Integer' and not the primitive 'int')
        Arrays.sort(arr1, Collections.reverseOrder());

        /* String Basics */
        // Refer the classes 'Strings1.java' and 'Strings2.java' in 'strings' package of this project
    }
}
