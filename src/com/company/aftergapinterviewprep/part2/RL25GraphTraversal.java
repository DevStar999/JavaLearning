package com.company.aftergapinterviewprep.part2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

@SuppressWarnings("DuplicatedCode")
public class RecentLearnings25 {
    /* Graphs - Traversal */

    // BFS -> Time = O(V + E), Auxiliary Space = O(V) [For the Queue] [Here, V = no. of vertices, E = no. of edges]
    public static void bfs(int v, List<List<Integer>> adj) {
        boolean[] visited = new boolean[v];
        List<Integer> bfsNodeOrder = new ArrayList<>(); // Order in which the nodes have been traversed over in the BFS
        Queue<Integer> q = new ArrayDeque<>();

        for (int i=0; i<v; i++) {
            if (!visited[i]) {
                visited[i] = true;
                q.add(i);
                while (q.size() > 0) {
                    int node = q.poll();
                    bfsNodeOrder.add(node);
                    for (Integer child : adj.get(node)) {
                        if (!visited[child]) {
                            visited[child] = true;
                            q.add(child);
                        }
                    }
                }
            }
        }

        System.out.println("The order of travel of nodes in BFS for the given graph is as follows - ");
        System.out.println(bfsNodeOrder);
    }

    // DFS -> Time = O(V + E), Auxiliary Space = O(V) [For the Stack] [Here, V = no. of vertices, E = no. of edges]
    public static void dfs(int v, List<List<Integer>> adj) {
        boolean[] visited = new boolean[v];
        List<Integer> dfsNodeOrder = new ArrayList<>(); // Order in which the nodes have been traversed over in the DFS
        Stack<Integer> st = new Stack<>();
        int connectedComponents = 0;

        for (int i=0; i<v; i++) {
            if (!visited[i]) {
                connectedComponents++;
                visited[i] = true;
                st.push(i);
                while (st.size() > 0) {
                    int node = st.pop();
                    dfsNodeOrder.add(node);
                    for (Integer child : adj.get(node)) {
                        if (!visited[child]) {
                            visited[child] = true;
                            st.push(child);
                        }
                    }
                }
            }
        }

        System.out.println("The order of travel of nodes in DFS for the given graph is as follows - ");
        System.out.println(dfsNodeOrder);
        System.out.println("The number of connected components in the given graph = " + connectedComponents);
    }

    public static void addEdge(List<List<Integer>> adj, int x, int y) {
        adj.get(x).add(y);
        adj.get(y).add(x);
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("/Users/development/Devwork/Java/IdeaProjects/JavaLearning/src/com/" +
                  "company/aftergapinterviewprep/graph_input.txt"));
        Scanner input = new Scanner(System.in);

        // (*) Taking the input of the graph as follows -
        int v = input.nextInt(), e = input.nextInt();
        List<List<Integer>> adj = new ArrayList<>();
        for (int i=0; i<v; i++) adj.add(new ArrayList<>());
        for (int i=0; i<e; i++) {
            int x = input.nextInt(), y = input.nextInt();
            addEdge(adj, x, y);
        }

        bfs(v, adj);
        dfs(v, adj);
    }
}
