package com.company.aftergapinterviewprep;

import java.io.FileNotFoundException;

public class RecentLearnings15 {
    /* Binary Search  */
    // YouTube Playlist Link -> https://www.youtube.com/playlist?list=PL2_aWCzGMAwL3ldWlrii6YeLszojgH77j
    // The above playlist is a good resource to get started with binary search and do some commonly asked question of
    // binary search

    // This method takes a sorted array 'arr' and gives the index of the value 'target' if present and '-1' if absent
    public static int binarySearch(int[] arr, int target) {
        int ans = -1;
        int n = arr.length;
        int start = 0, end = n-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            System.out.println("start = " + start + ", mid = " + mid + ", end = " + end);
            if (arr[mid] == target) {
                ans = mid;
                break;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }

    // This method takes a sorted array 'arr' and gives the index of the first occurrence or the last occurrence of
    // the value 'target' if present based on the boolean flag 'firstOccurrence' and '-1' if absent
    public static int binarySearchFirstOccurrence(int[] arr, int target, boolean firstOccurrence) {
        int ans = -1;
        int n = arr.length;
        int start = 0, end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
                if (firstOccurrence) { // Here we find the first occurrence
                    end = mid - 1;
                } else { // Here we find the last occurrence
                    start = mid + 1;
                }
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) throws FileNotFoundException {
        // (1) Simple Binary Search
        int[] arr1 = {2, 4, 5, 7, 15, 16, 21, 29};
        int targetValue1 = 16;
        int targetValue1Index = binarySearch(arr1, targetValue1);
        if (targetValue1Index == -1) {
            System.out.println("The target value = " + targetValue1 + ", is not present in the arr1");
        } else {
            System.out.println("The target value = " + targetValue1 + ", is present at index = " + targetValue1Index);
        }

        // (2) Count Occurrences of given target value in a sorted array
        int[] arr2 = {2, 4, 5, 7, 7, 7, 7, 15, 15, 15, 18, 23};
        int targetValue2 = 15;
        int countOfOccurrences = binarySearchFirstOccurrence(arr2, targetValue2, true);
        if (countOfOccurrences == -1) {
            System.out.println("The target value = " + targetValue2 + ", is not present in the arr2");
        } else {
            int lastOccurrenceIndex = binarySearchFirstOccurrence(arr2, targetValue2, false);
            countOfOccurrences = lastOccurrenceIndex - countOfOccurrences + 1;
            System.out.println("The count of occurrences of the target value = " + targetValue2 + ", in arr2 is, count = "
                    + countOfOccurrences);
        }
    }
}
