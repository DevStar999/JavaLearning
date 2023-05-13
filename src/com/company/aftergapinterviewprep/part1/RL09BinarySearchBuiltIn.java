package com.company.aftergapinterviewprep.part1;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RL09BinarySearchBuiltIn {
    /* Resources - (1) https://www.geeksforgeeks.org/arrays-binarysearch-java-examples-set-1/
       (2) https://www.geeksforgeeks.org/arrays-binarysearch-in-java-with-examples-set-2-search-in-subarray/
       (3) https://www.geeksforgeeks.org/collections-binarysearch-java-examples/
    */
    /*  Notes related to in-built 'binarySearch' method
        (1) This method is available for arrays as well as for collections using Arrays.binarySearch() and
        Collections.binarySearch()
        (2) There are certain important points to be kept in mind as follows -
            (a) If the input list is NOT sorted, the results are undefined
            (b) If there are duplicates, there is no guarantee which one will be found
            (c) If the 'key' element is not present in the array, method returns (-(insertion point) - 1)
            [key = element to be searched]
            (d) It guarantees that the return value will be >= 0 if and only if the key is found
            (e) The insertion point is similar to the ceiling of 'target' in a sorted array which is the index of the
            element that is just greater than the 'target' or equal to it
    */

    public static void main(String[] args) throws FileNotFoundException {
        // (1) Example of Arrays.binarySearch(int[] arr, int key)
        int[] arr1 = {2, 4, 5, 7, 15, 16, 21, 29};
        int targetValue1 = 31;
        int targetValue1Index = Arrays.binarySearch(arr1, targetValue1);
        System.out.println("targetValue1Index = " + targetValue1Index); // Ans = -9

        // (2) Example of Collections.binarySearch(List<Integer> list, Integer key)
        List<Integer> list2 = new ArrayList<>(Arrays.asList(2, 4, 5, 7, 7, 7, 15, 16, 21, 29));
        int targetValue2 = 7;
        int targetValue2Index = Collections.binarySearch(list2, targetValue2);
        System.out.println("targetValue2Index = " + targetValue2Index); // Ans = 4

        // (3) Example of Arrays.binarySearch(int[] arr, int fromIndex, int toIndex, int key)
        int[] arr3 = {2, 4, 5, 7, 15, 16, 21, 29};
        int targetValue3 = 15;
        int fromIndex3 = 1; // This index is inclusive
        int toIndex3 = 4; // This index is exclusive (So, the best way is to add 1 to it while calling method)
        int targetValue3Index = Arrays.binarySearch(arr3, fromIndex3, toIndex3 + 1, targetValue3);
        System.out.println("targetValue3Index = " + targetValue3Index); // Ans = 4

        // (4) Collections.binarySearch does NOT provide the method variant to pass a specific range using 'fromIndex'
        // to 'toIndex'

        // (5) Arrays.binarySearch(Integer[] arr, int fromIndex, int toIndex, Integer key, Comparator<Integer> c)
        // Note - Elements are sorted in descending order and thus we want to give a descending order Comparator
        Integer[] arr5 = {29, 21, 16, 15, 7, 5, 4, 2}; // Note - Elements are Class Objects of class 'Integer' for use in the Comparator
        Integer targetValue5 = 21;
        int fromIndex5 = 1;
        int toIndex5 = 4;
        int targetValue5Index = Arrays.binarySearch(arr5, fromIndex5, toIndex5 + 1, targetValue5, new Comparator<Integer>() {
            public int compare(Integer i1, Integer i2) {
                return (-1) * i1.compareTo(i2);
            }
        });
        System.out.println("targetValue5Index = " + targetValue5Index); // Ans = 1

        // (6) Collections.binarySearch(List<Integer> list,  Integer key, Comparator<Integer> c)
        // Note - Elements are sorted in descending order and thus we want to give a descending order Comparator
        List<Integer> list6 = new ArrayList<>(Arrays.asList(29, 21, 16, 15, 8, 7, 4, 2));
        Integer targetValue6 = 7;
        int targetValue6Index = Collections.binarySearch(list6, targetValue6, new Comparator<Integer>() {
            public int compare(Integer i1, Integer i2) {
                return (-1) * i1.compareTo(i2);
            }
        });
        System.out.println("targetValue6Index = " + targetValue6Index); // Ans = 5
    }
}
