package com.company.recentlearnings;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Rough19 {

    public static boolean checkEqual(int arr1[], int arr2[]) {
        if (arr1.length != arr2.length) return false;
        for (int i=0; i<arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> findAnagrams(String s, String p) {
        int n = s.length(), m = p.length();
        List<Integer> ans = new ArrayList();
        if (n < m) {
            return ans;
        }

        int freq[] = new int[26], window[] = new int[26];
        Arrays.fill(freq, 0);
        Arrays.fill(window, 0);
        for (int i=0; i<m; i++) {
            freq[p.charAt(i) - 'a']++;
        }

        int start = 0, end = m-1;
        for (int i=0; i<=end; i++) {
            window[s.charAt(i) - 'a']++;
        }
        if (checkEqual(window, freq)) {
            ans.add(0);
        }
        if (n == m) return ans;
        do {
            start++; end++;
            if (end >= n) break;
            window[s.charAt(start-1) - 'a']--;
            window[s.charAt(end) - 'a']++;
            if (checkEqual(window, freq)) {
                ans.add(start);
            }
        } while (end < n);

        return ans;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        // map.put(5, map.get(2)+1);
        // System.out.println(map.toString());
        List<Integer> ans = findAnagrams("cbaebabacd", "abc");
        System.out.println("ans = " + ans);
    }
}
