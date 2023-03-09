package com.company.roughwork2048champs;

import com.company.regex.Regex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RoughWork21 {
    public static void main(String[] args) {
        // The file is now located in 'roughwork2048champs' directory
        // System.setIn(new FileInputStream("/Users/development/Desktop/fabricated_scores.txt"));

        Scanner input = new Scanner(System.in);

        List<String> ans = new ArrayList<>();
        int t = 242;
        while ((t--) > 0) {
            String lineInput = input.nextLine();
            String gpgsId = "lyricsdestination99@gmail.com";
            String regexPattern = "Sr. No. -> (\\d*)? -> " + gpgsId;
            ans.addAll(Regex2.giveAllMatchesOfGroup(regexPattern, lineInput, 1));
        }
        input.close();

        System.out.println("ans.size() = " + ans.size());
        System.out.println("(*) Game Modes Scores (14) ->");
        for (int index = 0; index < 14; index++) {
            if (index < 13) {
                System.out.print(ans.get(index) + "L, ");
            } else {
                System.out.print(ans.get(index) + "L\n");
            }
        }
        System.out.println("(*) Miscellaneous Scores (8) ->");
        for (int index = 14; index < ans.size(); index++) {
            if (index < ans.size() - 1) {
                System.out.print(ans.get(index) + "L, ");
            } else {
                System.out.print(ans.get(index) + "L\n");
            }
        }
    }
}
