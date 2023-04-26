package com.company.aftergapinterviewprep;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

class Edge {
    int node;
    int wt;
    public Edge(int node, int wt) {
        this.node = node;
        this.wt = wt;
    }
}

public class RecentLearnings28 {
    /* Graphs - Miscellaneous Topics */
    // Resources -> (1) https://www.youtube.com/watch?v=Zbbe9FYVnM4&list=PLUcsbZa0qzu1EhwPcQfbDfl9VitpSUgBp&index=7
    // (2) https://www.youtube.com/watch?v=kXiqvMykeJA&list=PLUcsbZa0qzu1EhwPcQfbDfl9VitpSUgBp&index=9
    // (3) https://www.youtube.com/watch?v=PzznKcMyu0Y, https://www.geeksforgeeks.org/prims-algorithm-using-priority_queue-stl/

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

    // (2) Prim's Algorithm for Minimum Spanning Tree (MST)
    // (i) Complexities for Algo - Using Heap or Binary Search Tree, Theory
    //     Time -> O(E * log(V)), Space -> O(V + E), Auxiliary Space -> O(V)
    // (ii) Complexities for Algo - Using Priority Queue, Actual Implementation
    //     Time -> O(E * log(V)), Space -> O(V + E), Auxiliary Space -> O(V + E)
    //     (Here, the Priority Queue can have at most E elements in it)
    // For Time, log(E) is same as log(V), since E <= V*V
    public static int primsAlgoForMST(List<List<Edge>> adj, int V, int E) {
        int totalMSTWeight = 0;
        boolean[] inMST = new boolean[V];
        Queue<Edge> pq = new PriorityQueue<> (new Comparator<Edge>() { // Min heap with min. wt as priority
            public int compare(Edge e1, Edge e2) {
                return Integer.compare(e1.wt, e2.wt);
            }
        });

        int src = 0;
        pq.add(new Edge(src, 0)); // Adding the source node with 0 weight to start the process
        while (pq.size() > 0) {
            Edge top = pq.poll();
            int u = top.node;
            if (inMST[u]) {
                continue;
            }

            inMST[u] = true;
            totalMSTWeight += top.wt;
            for (Edge neighbor: adj.get(u)) {
                int v = neighbor.node;
                int wt = neighbor.wt;
                if (!inMST[v]) {
                    pq.add(new Edge(v, wt));
                }
            }
        }

        return totalMSTWeight;
    }

    public static void main(String[] args) throws FileNotFoundException {
        // (1) The code for Topological Sorting using iterative DFS is running correctly on GFG practise area -
        // https://practice.geeksforgeeks.org/problems/topological-sort/1

        // (2) The code for Prim's Algorithm for MST is running correctly on GFG practise area -
        // https://practice.geeksforgeeks.org/problems/minimum-spanning-tree/1
    }
}
