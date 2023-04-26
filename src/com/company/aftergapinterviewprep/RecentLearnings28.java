package com.company.aftergapinterviewprep;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RecentLearnings28 {
    /* Graphs - Miscellaneous Topics */

    // (1) Topological Sorting -> Time = O(V + E), Auxiliary Space = O(V) [Here, V = no. of vertices, E = no. of edges]
    // A Topological Sorting is done for a Directed Acyclic Graph (DAG)
    // The following method does a Topological Sorting using an iterative DFS
    // The Time complexity is the same as that of a DFS and the Auxiliary Space is for the final ordering that is stored
    // in a stack and a stack that we usually use for an iterative DFS
    public static List<Integer> topologicalSorting(int v, List<List<Integer>> adj) {
        boolean[] visited = new boolean[v];
        Stack<Integer> st = new Stack<Integer>(); // Stack for implementing DFS
        Stack<Integer> ans = new Stack<Integer>(); // Stack for storing the ordering
        for (int i=0; i<v; i++) {
            if (!visited[i]) {
                st.push(i);
                visited[i] = true;
                while (st.size() > 0) {
                    int node = st.peek();
                    int count = 0;
                    for (Integer child: adj.get(node)) {
                        if (!visited[child]) {
                            st.push(child);
                            visited[child] = true;
                            count++;
                            break;
                        }
                    }
                    if (count == 0) {
                        ans.push(st.pop());
                    }
                }
            }
        }
        List<Integer> fans = new ArrayList<>(); // Final output of the Topological Sorting for the given graph
        while (ans.size() > 0) {
            fans.add(ans.pop());
        }
        return fans;
    }

    public static void main(String[] args) throws FileNotFoundException {
        // The code for Topological Sorting using iterative DFS is running correctly on GFG practise area -
        // https://practice.geeksforgeeks.org/problems/topological-sort/1
    }
}
