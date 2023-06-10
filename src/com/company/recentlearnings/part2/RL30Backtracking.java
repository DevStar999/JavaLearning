package com.company.recentlearnings.part2;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("DuplicatedCode")
public class RL30Backtracking {
    /* Backtracking */
    // Resources -> (1) https://www.youtube.com/watch?v=MHXR4PCY8c0&list=PLUcsbZa0qzu3yNzzAxgvSgRobdUUJvz7p&index=11
    // (2) https://www.youtube.com/watch?v=Zq4upTEaQyM
    // (3) The pattern for solving backtracking questions is as follows ->
    //     (a) Write a recursive function declaration and give it's parameters the information regarding the
    //         (i) current state (ii) answer so far (iii) input etc.
    //     (b) Now in the recursive function, first check if we reached the end condition or gone beyond it.
    //         If gone beyond, then return empty handed. If reached exact end condition, collect the answer.
    //     (c) Then run all the options we can make to move to the next state. For each option do the following
    //          (i) Check if going there is safe (Use an if statement with a boolean checkSafe() function)
    //          (ii) If it is safe, then make changes to answer collected so far and input as required
    //          (iii) Make a recursive call to the current function and check if this call return true or not in if
    //          statement, if it does then, return true for the function.
    //          (iv) If it does not return true, then Backtrack by reverting the changes made
    // (4) Whenever, we have to make use of recursion using certain given condition OR it is asked in the question to
    //     print all combinations, all solutions etc., then we should think about a Backtracking solution for the given
    //     problem

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

    // (3) N-Queens Problem
    public static boolean inRange(int row, int rowStart, int rowEnd, int col, int colStart, int colEnd) {
        return (row >= rowStart && row <= rowEnd && col >= colStart && col <= colEnd);
    }

    public static boolean isSafe(int[][] board, int row, int col, int n) {
        // Vertical check
        for (int i=0; i<n; i++) {
            if (inRange(row - i, 0, n-1, col, 0, n-1)) { // Up
                if (board[row-i][col] == 1) return false;
            }
            if (inRange(row + i, 0, n-1, col, 0, n-1)) { // Down
                if (board[row+i][col] == 1) return false;
            }
        }
        // Horizontal check
        for (int i=0; i<n; i++) {
            if (inRange(row, 0, n-1, col - i, 0, n-1)) { // Left
                if (board[row][col-i] == 1) return false;
            }
            if (inRange(row, 0, n-1, col + i, 0, n-1)) { // Right
                if (board[row][col+i] == 1) return false;
            }
        }
        // Diagonal check
        for (int i=0; i<n; i++) {
            if (inRange(row - i, 0, n-1, col - i, 0, n-1)) { // Left - up
                if (board[row-i][col-i] == 1) return false;
            }
            if (inRange(row + i, 0, n-1, col - i, 0, n-1)) { // Left - down
                if (board[row+i][col-i] == 1) return false;
            }
            if (inRange(row - i, 0, n-1, col + i, 0, n-1)) { // Right - up
                if (board[row-i][col+i] == 1) return false;
            }
            if (inRange(row + i, 0, n-1, col + i, 0, n-1)) { // Right - down
                if (board[row+i][col+i] == 1) return false;
            }
        }
        return true;
    }

    public static boolean nQueens(int[][] board, int row, int n) {
        if (row == n) {
            for (int i=0; i<n; i++) {
                for (int j=0; j<n; j++) {
                    System.out.print(board[i][j] + " ");
                } System.out.println();
            }
            return true; // Returning true after finding just one solution
        }

        for (int i=0; i<n; i++) {
            if (isSafe(board, row, i, n)) {
                board[row][i] = 1;
                if (nQueens(board, row + 1, n)) {
                    return true;
                }
                board[row][i] = 0; // Backtracking happens here
            }
        }
        return false;
    }

    public static boolean nQueensPrintAllSubsets(int[][] board, int row, int n, List<int[][]> allSolutionBoards) {
        if (row == n) {
            // Copying the answer board to a new board to avoid deep copy bug
            int[][] newBoard = new int[n][n];
            for (int i=0; i<n; i++) {
                for (int j=0; j<n; j++) {
                    newBoard[i][j] = board[i][j];
                }
            }
            allSolutionBoards.add(newBoard);
            return false; // Returning false after finding one solution, so as to find the other ones as well
        }

        for (int i=0; i<n; i++) {
            if (isSafe(board, row, i, n)) {
                board[row][i] = 1;
                if (nQueensPrintAllSubsets(board, row + 1, n, allSolutionBoards)) {
                    return true;
                }
                board[row][i] = 0; // Backtracking happens here
            }
        }
        return false;
    }

    // We can short of observe a pattern in the 'Backtracking' questions, which are listed as follows -
    // (1) The question hints at printing one solution with certain conditions or all solutions which meet certain
    //     conditions.
    // (2) Backtracking is just recursion with certain conditions. While recursion, explores all the
    //     branches of a decision tree, Backtracking stops going down a branch if the given conditions are not being met
    //     on that branch.
    // (3) So, one thing is for sure that we have to write a recursive function for a Backtracking problem
    // (4) The structure of the recursive function is as follows -
    /*
        // The return type of the function should be boolean or void depending on if we have to find one solution or
        // many solutions respectively
        public boolean/void solve( // The list of parameters is as follows -
            (i) The input given in the question
            (ii) State parameters (variables with which we define a state in the decision tree) for e.g. curRow,
            curColumn, curIndex etc.
            (iii) Parameters with which we have collected/constructed the answer so far
            (iv) Parameters to collected the fully constructed solution
        ) {
            if () {
                // Since, this is a recursion, we have to write the base case. With the 'if' condition we check if we
                // have gone beyond the decision space or reached exactly the end of the decision space
                // (a) If gone beyond the decision space, then simply return
                // (b) If reached exactly at the end of the decision space, then collect the fully constructed solution
            }

            // Run all the options/choices we can make to move on to the next state
                // For each option -
                // (a) Check if moving onto that option is safe/valid (Use a boolean isSafe()/checkSafe() method)
                // (b) If it is safe, make the changes as per the question
                // (c) Then, call the recursive function to move onto the next state
                // (d) Backtrack the changes made in step (b)
        }
    */

    public static void main(String[] args) throws FileNotFoundException {
        // (1) Example for Power Set iterative
        List<String> ans = printAllSubsetsOfGivenString("abc");
        System.out.println(ans + "\n");

        // (2) Example for Power Set Recursive
        printAllSubsetsOfGivenStringRec("abc", 0, "", 3);
        System.out.println();

        // (3) Example for N-Queens
        int n = 4;
        int[][] board = new int[n][n];
        /*
        boolean verdict1 = nQueens(board, 0, n);
        if (verdict1) {
            System.out.println("One of the correct answers for the N-Queen problem was as above");
        } else {
            System.out.println("NO solution was possible for the given parameters for the N-Queen problem");
        }
        */
        List<int[][]> allSolutionBoards = new ArrayList<>();
        nQueensPrintAllSubsets(board, 0, n, allSolutionBoards);
        boolean verdict2 = (allSolutionBoards.size() > 0);
        if (verdict2) {
            System.out.println("All solution boards for the given N-Queen problem are as follows - ");
            for (int currentBoard = 0; currentBoard<allSolutionBoards.size(); currentBoard++) {
                for (int i=0; i<n; i++) {
                    for (int j=0; j<n; j++) {
                        System.out.print(allSolutionBoards.get(currentBoard)[i][j] + " ");
                    } System.out.println();
                } System.out.println();
            }
        } else {
            System.out.println("NO solution was possible for the given parameters for the N-Queen problem");
        }

        // (4) Rat in a Maze (Solved in GFG practise)
        // https://practice.geeksforgeeks.org/problems/rat-in-a-maze-problem/1

        // (5) Sudoku Solver (Solved in GFG practise)
        // https://practice.geeksforgeeks.org/problems/solve-the-sudoku-1587115621/1

        // (6) Permutations (Question on LeetCode)
        // https://leetcode.com/problems/permutations/

        // (7) Word Search (Question on LeetCode)
        // https://leetcode.com/problems/word-search/
    }
}
