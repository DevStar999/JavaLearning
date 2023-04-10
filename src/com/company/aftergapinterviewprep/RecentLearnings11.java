package com.company.aftergapinterviewprep;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class RecentLearnings11 {
    /* Sorting Algorithms */
    // Resource -> youtube.com/playlist?list=PL2_aWCzGMAwKedT2KfDMB9YA5DgASZb3U

    // (1) Selection Sort -> Time = O(n^2), Space = O(1)
    // Here, we keep finding the min value in the range and keep placing it at the start while reducing the range from the start
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i=0; i<n; i++) {
            int minValue = Integer.MAX_VALUE;
            int index = -1;
            for (int j=i; j<n; j++) {
                if (arr[j] < minValue) {
                    minValue = arr[j];
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }

    // (2) Bubble Sort -> Time = O(n^2), Space = O(1)
    // Here, we keep pushing the highest value towards the end then reduce the range from the end
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i=n-1; i>=0; i--) {
            boolean flag = true;
            for (int j=0; j<i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
    }

    // (3) Insertion Sort -> Time = O(n^2), Space = O(1)
    // Here, we keep on taking an element and putting it in the appropriate place in the current increasing range
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i=1; i<n; i++) {
            int value = arr[i];
            int gap = i;
            while (gap > 0 && arr[gap-1] > value) {
                arr[gap] = arr[gap-1];
                gap--;
            }
            arr[gap] = value;
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        // (1) For Selection Sort
        int arr1[] = {15, 29, 16, 21, 7, 2, 5, 4};
        selectionSort(arr1);
        System.out.println("After Selection Sort = " + Arrays.toString(arr1));

        // (2) For Bubble Sort
        int arr2[] = {15, 29, 16, 21, 7, 2, 5, 4};
        bubbleSort(arr2);
        System.out.println("After Bubble Sort = " + Arrays.toString(arr2));

        // (3) For Insertion Sort
        int arr3[] = {15, 29, 16, 21, 7, 2, 5, 4};
        insertionSort(arr3);
        System.out.println("After Insertion Sort = " + Arrays.toString(arr3));
    }
}
