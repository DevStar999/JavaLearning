package com.company.aftergapinterviewprep;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class RecentLearnings15 {
    /* Sorting Algorithms - Part 1 */

    // (1) Merge Sort -> Time = O(n * log(n)), Space = O(n)
    // Resources -> https://www.geeksforgeeks.org/merge-sort/
    // A few things to remember about Merge Sort are as follows -
    // (a) It is based on the Divide and Conquer Strategy
    // (b) It is recursive in nature
    // (c) It is a Stable sorting algorithm i.e. is saves the relative order of the elements with same value as in the original array
    // (d) It is not an In-Place algorithm as it uses Auxiliary Space of O(n)
    public static void merge(int[] left, int[] right, int[] arr) {
        int i=0, j=0, k=0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            arr[k] = left[i];
            k++; i++;
        }
        while (j < right.length) {
            arr[k] = right[j];
            k++; j++;
        }
    }

    public static void mergeSort(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            return;
        }
        int mid = n/2;
        int[] left = new int[mid], right = new int[n-mid];
        for (int i=0; i<mid; i++) {
            left[i] = arr[i];
        }
        for (int i=mid; i<n; i++) {
            right[i-mid] = arr[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(left, right, arr);
    }

    public static void main(String[] args) throws FileNotFoundException {
        // (1) For mergeSort Sort
        int arr1[] = {15, 29, 16, 21, 7, 2, 5, 4};
        mergeSort(arr1);
        System.out.println("After Merge Sort = " + Arrays.toString(arr1));
    }
}
