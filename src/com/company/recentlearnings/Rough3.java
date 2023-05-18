package com.company.recentlearnings;

import java.io.FileNotFoundException;

public class Rough3 {

    public static int maxSubArray(int[] nums) {
        int max_so_far = 0, max_ending_here = Integer.MIN_VALUE + 1000000;
        int n = nums.length;
        for(int i=0; i<n; i++) {
            max_ending_here += nums[i];
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }

            System.out.println("max_so_far = " + max_so_far);
            System.out.println("max_ending_here = " + max_ending_here);
        }

        return max_so_far;
    }

    public static void main(String[] args) throws FileNotFoundException {
        // System.setIn(new FileInputStream(""));
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int ans = maxSubArray(arr);
        String str = "";
        str.toLowerCase();
        System.out.println(ans);

        byte b;
        short sh;
        int it;
        long lg;
        float fl;
        double db;
        char ch;
        boolean bn;
    }
}
