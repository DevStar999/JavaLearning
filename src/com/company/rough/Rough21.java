package com.company.rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Rough21 {


    public static void main(String[] args) throws FileNotFoundException {
//        System.setIn(new FileInputStream("/Users/development/Devwork/Java/IdeaProjects/" +
//               "JavaLearning/src/com/company/rough/input.txt"));

        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int ans = 0;
        input.nextLine();
        while ((t--) > 0) {
            int num1 = input.nextInt(), num2 = input.nextInt(), num3 = input.nextInt();
            if (num1 + num2 + num3 >= 2) {
                ans ++;
            }
        }
        System.out.println(ans);
    }
}
