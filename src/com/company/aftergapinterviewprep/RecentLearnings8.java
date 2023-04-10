package com.company.aftergapinterviewprep;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class RecentLearnings8 {
    /* Binary Search */
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

    // The following is the code to find the pivot index of sorted rotated array
    // The element at the pivot index is smaller than both of it's adjacent elements on left and right, this is the
    // property of the element at the pivot index.
    // This problem is also sometimes quoted as 'Find no. of rotations in a sorted array' where each rotation means
    // that one element from the end was removed and appended at the start of the array.
    // [Note - The O(log(n)) solution for this question only works if the elements are all unique]
    public static int pivotIndex(int[] arr) {
        int n = arr.length;
        int ans = 0;
        int start = 0, end = n-1;
        // In the following while loop we are using the equal to sign i.e. '=' along with '<' or '>' even when the
        // elements are unique because the pointers start, end, mid, next or prev may have the same value for a small
        // range and thus the elements will be equal
        while (start <= end) {
            // This means that the current range [start, end] is already sorted
            if (arr[start] <= arr[end]) {
                ans = start;
                break;
            }

            int mid = start + (end - start) / 2;
            int next = (mid + 1) % n;
            int prev = (mid -1 + n) % n;
            if (arr[mid] <= arr[prev] && arr[mid] <= arr[next]) {
                ans = mid;
                break;
            } else if (arr[start] <= arr[mid]) {
                start = mid + 1;
            } else if (arr[mid] <= arr[end]) {
                end = mid - 1;
            }
        }

        return ans;
    }

    // The following is the code to find the index of the given 'target' value in Rotated Sorted Array or return '-1'
    // [Note - The O(log(n)) solution for this question only works if the elements are all unique]
    public static int binarySearchInRotatedSortedArray(int[] nums, int target) {
        int n = nums.length;
        int pivot = pivotIndex(nums);
        int leftAns = -1, rightAns = -1;
        if (pivot == 0) {
            rightAns = Arrays.binarySearch(nums, 0, (n-1) + 1, target);
        } else {
            leftAns = Arrays.binarySearch(nums, 0, (pivot-1) + 1, target);
            rightAns = Arrays.binarySearch(nums, pivot, (n-1) + 1, target);
        }
        // In the above calls to Arrays.binarySearch() we have deliberately written the end index parameter with the
        // index + 1, since the end index is exclusive w.r.t. the range

        if (leftAns < 0 && rightAns < 0) {
            return -1;
        }
        return Math.max(leftAns, rightAns);
    }

    // The following code is for finding the Insert Position Index for given 'target' value in the given sorted array
    // This can be done in O(log(n)) time
    public static int searchInsertPosition(int[] nums, int target) {
        int n = nums.length;
        int saveMid = -1, result = -1;
        int start = 0, end = n-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            saveMid = mid;
            if (nums[mid] == target) {
                result = mid;
                break;
            } else if (nums[mid] > target) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }

        if (result == -1) {
            if (nums[saveMid] > target) result = saveMid;
            else result = saveMid + 1;
        }
        return result;
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

        // (3) Find the Pivot Index in the array
        int[] arr3 = {4, 5, 6, 7, 0, 1, 2};
        int pivot = pivotIndex(arr3);
        if (pivot == 0) {
            System.out.println("The pivot is 0 i.e. no rotations were made to this array");
        } else {
            System.out.println("The pivot index = " + pivot + " i.e. the array was rotated " + pivot + " times");
        }

        // (4) Find the 'target' value in a Rotated Sorted Array
        int[] arr4 = {4, 5, 6, 7, 0, 1, 2};
        int targetValue4 = 5;
        int targetValue4Index = binarySearchInRotatedSortedArray(arr4, targetValue4);
        if (targetValue4Index == -1) {
            System.out.println("The target value = " + targetValue4 + ", is not present in the arr4");
        } else {
            System.out.println("The target value = " + targetValue4 + ", is present at index = " + targetValue4Index);
        }

        // (5) Find the Insert Position Index for the given 'target' value in a given sorted array
        int[] arr5 = {1, 3, 5, 6};
        int targetValue5 = 7;
        int targetValue5Index = searchInsertPosition(arr5, targetValue5);
        System.out.println("The insert position index for target = " + targetValue5 + ", is index = " + targetValue5Index);
    }
}
