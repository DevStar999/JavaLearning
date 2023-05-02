package com.company.aftergapinterviewprep;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;

public class Rough9 {

    public static void countingSort(int[] arr) {
        int n = arr.length;
        int minVal = Integer.MAX_VALUE, maxVal = Integer.MIN_VALUE;
        for (int i=0; i<n; i++) {
            minVal = Math.min(minVal, arr[i]);
            maxVal = Math.max(maxVal, arr[i]);
        }
        int range = maxVal - minVal + 1;
        int diff = minVal;
        int[] cnt = new int[range];
        for (int i=0; i<n; i++) {
            cnt[arr[i] - diff]++;
        }
        for (int i=range-1; i>0; i--) {
            cnt[i] = cnt[i-1];
        }
        cnt[0] = 0;
        for (int i=1; i<range; i++) {
            cnt[i] = cnt[i] + cnt[i-1];
        }
        int[] ans = new int[n];
        for (int i=0; i<n; i++) {
            int value = arr[i];
            int index = cnt[arr[i] - diff];
            cnt[arr[i] - diff]++;
            ans[index] = value;
        }
        for (int i=0; i<n; i++) {
            arr[i] = ans[i];
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        // System.setIn(new FileInputStream(""));
        int arr[] = {4, 3, 3, 1, 2, 2, 1, 3, 4, 1, 4};
        // int ans = maxSubArray(arr);
        String str = "";
        str.toLowerCase();
        // System.out.println(ans);
        countingSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
