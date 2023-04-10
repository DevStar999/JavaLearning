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

    // (4) Counting Sort -> Time = O(n), Space = O(max(arr[i])) or O(n), whichever is greater
    // Resource -> https://www.youtube.com/watch?v=imqr13aIBAY
    // A few points to remember about this algorithm are as follows ->
    // (a) It is assumed that the range of elements is very small
    // (b) It is a stable sorting algorithm i.e. the relative order of equal value elements is preserved in the sorted array
    // (c) This algorithm is not comparison-based, it uses hashing. Thus, it not an In-Place algorithm
    public static void countingSort(int[] arr) {
        int n = arr.length;
        // Step 1 - Finding the minimum and maximum values
        int minValue = Integer.MAX_VALUE, maxValue = Integer.MIN_VALUE;
        for (int i=0; i<n; i++) {
            minValue = Math.min(arr[i], minValue);
            maxValue = Math.max(arr[i], maxValue);
        }

        // Step 2 - Creating array of size range to store the count of numbers
        int range = maxValue - minValue + 1;
        int[] count = new int[range];
        Arrays.fill(count, 0);

        // Step 3 - Counting the numbers
        int indexDiff = minValue;
        for (int i=0; i<n; i++) {
            count[arr[i] - indexDiff]++;
        }

        // Step 4 - Getting their positions
        for (int i=1; i<range; i++) {
            count[i] = count[i] + count[i-1];
        }

        // Step 5 - Creating a temporary output sorted array
        int[] output = new int[n];
        for (int i=0; i<n; i++) {
            count[arr[i] - indexDiff]--; // Subtracting 1 to get the index at which the value is to be placed
            int outputIndex = count[arr[i] - indexDiff];
            output[outputIndex] = arr[i];
        }

        // Final Step - Copy the sorted 'output' array to the original array 'arr'
        for (int i=0; i<n; i++) {
            arr[i] = output[i];
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

        // (4) For Counting Sort
        int arr4[] = {1, 3, 3, 1, 0, 2, 5, 5, 2, 3, 2, 4};
        countingSort(arr4);
        System.out.println("After Counting Sort = " + Arrays.toString(arr4));
    }
}
