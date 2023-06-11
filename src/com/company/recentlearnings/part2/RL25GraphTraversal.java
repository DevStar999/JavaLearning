package com.company.recentlearnings.part2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

@SuppressWarnings("DuplicatedCode")
public class RL25GraphTraversal {
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

    // DFS (Iterative) -> Time = O(V + E), Auxiliary Space = O(V) [For the Stack]
    //                    [Here, V = no. of vertices, E = no. of edges]
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
                dfsNodeOrder.add(i);
                while (st.size() > 0) {
                    int node = st.peek();
                    int count = 0;
                    for (Integer child : adj.get(node)) {
                        if (!visited[child]) {
                            visited[child] = true;
                            st.push(child);
                            dfsNodeOrder.add(child);
                            count++;
                            break;
                        }
                    }
                    if (count == 0) {
                        st.pop();
                    }
                }
            }
        }

        System.out.println("The order of travel of nodes in DFS for the given graph is as follows - ");
        System.out.println(dfsNodeOrder);
        System.out.println("The number of connected components in the given graph = " + connectedComponents);
    }

    // DFS (Recursive) -> Time = O(V + E), Auxiliary Space = O(V) [For the recursion stack]
    //                    [Here, V = no. of vertices, E = no. of edges]
    private static void dfsRecursive(int node, boolean[] visited, List<List<Integer>> adj, List<Integer> dfsNodeOrder) {
        visited[node] = true;
        dfsNodeOrder.add(node);

        for (Integer neighbour: adj.get(node)) {
            if (!visited[neighbour]) {
                dfsRecursive(neighbour, visited, adj, dfsNodeOrder);
            }
        }
    }

    public static void dfsRecursiveMain(int v, List<List<Integer>> adj) {
        List<Integer> dfsNodeOrder = new ArrayList<>();
        boolean[] visited = new boolean[v];
        for (int i=0; i<v; i++) {
            if (!visited[i]) {
                dfsRecursive(i, visited, adj, dfsNodeOrder);
            }
        }

        System.out.println("The order of travel of nodes in DFS for the given graph is as follows - ");
        System.out.println(dfsNodeOrder);
    }

    public static void addEdge(List<List<Integer>> adj, int x, int y) {
        adj.get(x).add(y);
        adj.get(y).add(x);
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("/Users/development/Devwork/Java/IdeaProjects/JavaLearning/src/com/" +
                  "company/recentlearnings/graph_input.txt"));
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
        dfsRecursiveMain(v, adj);
    }
}
