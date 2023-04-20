package com.company.aftergapinterviewprep;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecentLearnings24 {
    /* Graphs - Basics */

    public static void addEdge(List<List<Integer>> adj, int x, int y) {
        adj.get(x).add(y);
        adj.get(y).add(x);
    }

    public static void main(String[] args) throws FileNotFoundException {
        // System.setIn(new FileInputStream("/Users/development/Devwork/Java/IdeaProjects/JavaLearning/src/com/" +
        //          "company/aftergapinterviewprep/graph_input.txt"));
        Scanner input = new Scanner(System.in);

        // (1) Representing the graph using Adjacency List (Most preferred and commonly used way to represent a graph)
        int v = input.nextInt(), e = input.nextInt(); // v = vertices & e = edges in the graph
        List<List<Integer>> adj = new ArrayList<>();
        for (int i=0; i<v; i++) adj.add(new ArrayList<>()); // Initialising 'adj' with empty lists
        for (int i=0; i<e; i++) {
            int x = input.nextInt(), y = input.nextInt();
            addEdge(adj, x, y);
        }


        System.out.println("(1) The graph is represented as follows using an Adjacency List - ");
        for (int i=0; i<adj.size(); i++) {
            System.out.print(i + " -> ");
            for (int j=0; j<adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }

        // (2) Representing the graph using Adjacency Matrix (Less preferred and rarely used, since graphs given are
        // usually sparse. This can come in handy for dense graphs)
        // Using the above Adjacency Matrix as follows
        boolean[][] adjMatrix = new boolean[v][v];
        for (int i=0; i<adj.size(); i++) {
            for (int j=0; j<adj.get(i).size(); j++) {
                adjMatrix[i][adj.get(i).get(j)] = true;
            }
        }

        System.out.println("(2) The graph is represented as follows using an Adjacency Matrix - ");
        for (int i=0; i<v; i++) {
            for (int j=0; j<v; j++) {
                String print = "";
                if (adjMatrix[i][j]) print = "T";
                else print = "F";
                System.out.print(print + " ");
            }
            System.out.println();
        }
    }
}
