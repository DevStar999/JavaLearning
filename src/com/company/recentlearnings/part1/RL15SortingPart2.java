package com.company.recentlearnings.part1;

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
    public static void merge(int[] arr, int start, int mid, int end) {
        // Computing the sizes of the arrays as follows -
        int n1 = mid - start + 1;
        int n2 = end - (mid + 1) + 1;

        // Populating the sorted elements in the ranges (start, mid) & (mid + 1, end) in 'left' and 'right' resp.
        int[] left = new int[n1], right = new int[n2];
        for (int i=0; i<n1; i++) {
            left[i] = arr[start + i];
        }
        for (int i=0; i<n2; i++) {
            right[i] = arr[mid + 1 + i];
        }

        // Merging the 2 sorted arrays into 1 as follows
        int index1 = 0, index2 = 0, index = start;
        while (index1 < n1 && index2 < n2) {
            if (left[index1] <= right[index2]) {
                arr[index] = left[index1];
                index1++;
            } else {
                arr[index] = right[index2];
                index2++;
            }
            index++;
        }
        while (index1 < n1) { // If elements from 'right' were exhausted first
            arr[index] = left[index1];
            index++; index1++;
        }
        while (index2 < n2) { // If elements from 'left' were exhausted first
            arr[index] = right[index2];
            index++; index2++;
        }
    }

    public static void mergeSort(int[] arr, int start, int end) {
        if (start > end) return; // Invalid Range
        if (start == end) return; // Array of size 1 is already sorted

        int n = end - start + 1;
        int mid = start + (n/2) - 1;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        merge(arr, start, mid, end);
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
        mergeSort(arr1, 0, arr1.length - 1);
        System.out.println("After Merge Sort = " + Arrays.toString(arr1));

        // (2) For quickSort Sort
        int arr2[] = {15, 29, 16, 21, 7, 2, 5, 4};
        quickSort(arr2, 0, arr2.length-1);
        System.out.println("After Quick Sort = " + Arrays.toString(arr2));
    }
}
