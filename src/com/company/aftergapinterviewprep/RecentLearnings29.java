package com.company.aftergapinterviewprep;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class RecentLearnings29 {
    /* Backtracking */

    // (1) Basic method to return all subsets of a given string i.e. Power Set
    public static List<String> printAllSubsetsOfGivenString(String str) {
        List<String> ans = new ArrayList<>();
        int n = str.length();
        for (int i=0; i<n; i++) {
            List<String> temp = new ArrayList<>();
            if (i == 0) {
                temp.add(""); temp.add(String.valueOf(str.charAt(i)));
                ans.addAll(temp);
                continue;
            } else {
                for (int j=0; j<ans.size(); j++) {
                    String cur = ans.get(j);
                    String op1 = cur;
                    String op2 = cur + str.charAt(i);
                    temp.add(op1); temp.add(op2);
                }
                ans.clear();
                ans.addAll(temp);
            }
        }
        return ans;
    }

    // (2) Basic method to print all subsets of a given string i.e. Power Set with recursion
    public static void printAllSubsetsOfGivenStringRec(String str, int index, String cur, int n) {
        if (index == n) {
            System.out.println("cur = " + cur);
            return;
        }

        printAllSubsetsOfGivenStringRec(str, index+1, cur, n);
        printAllSubsetsOfGivenStringRec(str, index+1, cur + str.charAt(index), n);
    }

    public static void main(String[] args) throws FileNotFoundException {
        List<String> ans = printAllSubsetsOfGivenString("abc");
        System.out.println(ans);

        printAllSubsetsOfGivenStringRec("abc", 0, "", 3);
    }
}
