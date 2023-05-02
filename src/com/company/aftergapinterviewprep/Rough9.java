package com.company.aftergapinterviewprep;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;

public class Rough9 {

    public static int largestRectangleArea(int[] arr) {
        int n = arr.length;
        int[] left = new int[n], right = new int[n];
        Arrays.fill(left, -1);
        Arrays.fill(right, -1);
        Stack<Integer> st = new Stack<Integer>();
        st.add(n-1);
        for (int i=n-2; i>=0; i--) {
            while (st.size() > 0 && arr[i] <= arr[st.peek()]) {
                st.pop();
            }
            if (st.size() == 0) {
                right[i] = -1;
            } else {
                right[i] = st.peek();
            }
            st.add(i);
        }
        st.clear();
        st.add(0);
        for (int i=1; i<=n-1; i++) {
            while (st.size() > 0 && arr[i] <= arr[st.peek()]) {
                st.pop();
            }
            if (st.size() == 0) {
                left[i] = -1;
            } else {
                left[i] = st.peek();
            }
            st.add(i);
        }
        // System.out.println(Arrays.toString(left));
        // System.out.println(Arrays.toString(right));

        int ans = 0;
        for (int i=0; i<n; i++) {
            int start, end;
            if (left[i] == -1) {
                start = 0;
            } else {
                start = left[i] + 1;
            }
            if (right[i] == -1) {
                end = n-1;
            } else {
                end = right[i] - 1;
            }
            int width = end - start + 1, height = arr[i];
            // System.out.println(width + " " + height);
            int prod = width * height;
            ans = Math.max(ans, prod);
        }
        return ans;
    }

    public static void main(String[] args) throws FileNotFoundException {
        // System.setIn(new FileInputStream(""));
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        // int ans = maxSubArray(arr);
        String str = "";
        str.toLowerCase();
        // System.out.println(ans);
    }
}
