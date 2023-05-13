package com.company.aftergapinterviewprep.part1;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;

public class RL15SortingPart2 {
    /* Sorting Algorithms - Part 2 */

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

    // (2) Quick Sort -> Time = O(n * log(n)) [Average Case]; Time = O(n ^ 2) [Worst Case], Space = O(1)
    // A few things to remember about Quick Sort are as follows -
    // (a) It is based on the Divide and Conquer Strategy
    // (b) It is recursive in nature
    // (c) It is NOT a stable sorting algorithm
    // (d) The randomized version of this algorithm almost always guarantees that the Time will be O(n * log(n))
    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int pivotIndex = start;
        for (int i=start; i<end; i++) {
            if (arr[i] <= pivot) {
                // Swap(arr[i], arr[pivotIndex])
                int temp = arr[i];
                arr[i] = arr[pivotIndex];
                arr[pivotIndex] = temp;
                pivotIndex++;
            }
        }
        // Swap(arr[end], arr[pivotIndex])
        int temp = arr[end];
        arr[end] = arr[pivotIndex];
        arr[pivotIndex] = temp;

        return pivotIndex;
    }

    public static int randomizedPartition(int[] arr, int start, int end) {
        Random random = new Random();
        int pivotIndex = random.nextInt(end - start + 1) + start;
        // Swap(arr[pivotIndex], arr[end])
        int temp = arr[pivotIndex];
        arr[pivotIndex] = arr[end];
        arr[end] = temp;
        return partition(arr, start, end);
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int pivotIndex = randomizedPartition(arr, start, end);
            quickSort(arr, start, pivotIndex-1);
            quickSort(arr, pivotIndex+1, end);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        // (1) For mergeSort Sort
        int arr1[] = {15, 29, 16, 21, 7, 2, 5, 4};
        mergeSort(arr1);
        System.out.println("After Merge Sort = " + Arrays.toString(arr1));

        // (2) For quickSort Sort
        int arr2[] = {15, 29, 16, 21, 7, 2, 5, 4};
        quickSort(arr2, 0, arr2.length-1);
        System.out.println("After Quick Sort = " + Arrays.toString(arr2));
    }
}
