package com.company.aftergapinterviewprep;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Rough7 {

    public static void main(String[] args) throws FileNotFoundException {
        int i1 = 5, i2 = 7;
        int verdict = Integer.compare(i1, i2);
        System.out.println("verdict = " + verdict);
        int[] arr = {2, 5, 7};
        int index = Arrays.binarySearch(arr, 6);
        index++;
        index = Math.abs(index);
        System.out.println("index = " + index);

    }
}
