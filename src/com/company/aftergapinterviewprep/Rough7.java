package com.company.aftergapinterviewprep;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Rough7 {
    public static long pow(long base, long index) {
        long ans = 1L;
        for (int i=1; i<=index; i++) {
            ans *= base;
        }
        return ans;
    }

    public static void main(String[] args) throws FileNotFoundException {
        int left = 2147483646;
        int right = 2147483647;
        int[] arr = {5,2,6,1};
    }
}
