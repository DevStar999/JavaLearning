package com.company.recentlearnings.part2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

@SuppressWarnings("DuplicatedCode")
public class RL26GraphCycle {
    /* Graphs - Cycle Detection */

    public static void bfs(int v, List<List<Integer>> adj) {
        boolean[] visited = new boolean[v];
        int source = 0; // As per common convention we have taken '0' as the source node
        int[] dist = new int[v]; // To keep track of distance of each node from the source node
        Arrays.fill(dist, Integer.MAX_VALUE); dist[0] = 0; // Initialising the values of the 'dist' array
        int[] pred = new int[v]; // To keep track of the predecessor (parent) of each node
        pred[source] = -1; // Initialising the parent of source as -1

        // We want to calculate the distance of each node from source in 'dist' and the predecessor of each node when
        // traversing from the source in 'pred'. Here, we are assuming the whole graphs is just one connected component
        // Here, we are making the traversal using BFS
        Queue<Integer> q = new ArrayDeque<>();
        visited[source] = true;
        q.add(source);
        while (q.size() > 0) {
            int node = q.poll();
            for (Integer child : adj.get(node)) {
                if (!visited[child]) {
                    dist[child] = 1 + dist[node];
                    pred[child] = node;
                    visited[child] = true;
                    q.add(child);
                }
            }
        }

        System.out.println("The distance of each node from the source '0' is as follows - ");
        System.out.println(Arrays.toString(dist));
        System.out.println("The predecessor (parent) of each node when traversing from the source '0' is as follows - ");
        System.out.println(Arrays.toString(pred));
    }

    // The following method is for detecting a cycle in an undirected graph using BFS
    public static boolean isCycle(int v, List<List<Integer>> adj) {
        boolean[] visited = new boolean[v];
        Queue<Integer> q = new ArrayDeque<>();
        int[] parent = new int[v];
        boolean ans = false;

        for (int i=0; i<v; i++) {
            if (!visited[i]) {
                visited[i] = true;
                parent[i] = -1;
                q.add(i);
                while (q.size() > 0) {
                    int node = q.poll();
                    for (Integer child : adj.get(node)) {
                        if (!visited[child]) {
                            visited[child] = true;
                            parent[child] = node;
                            q.add(child);
                        } else {
                            if (parent[node] != child) {
                                ans = true;
                                break;
                            }
                        }
                    }
                }
                if (ans) break;
            }
        }

        return ans;
    }

    // The following method is for detecting a cycle in a directed graph using iterative DFS
    public boolean isCyclicForDirectedGraph(int v, List<List<Integer>> adj) {
        // The main difference is that, we need to keep track of the elements that are currently in the recursion stack
        // for the current connected component of the graph (or the current pass). For this, we use a set called 'pass'
        // to store these elements and remove them from this set as soon as all their neighbors are visited. Also, here
        // is the place where we check if there is a cycle in the graph by checking if the current neighbor is in the
        // set or not. If it is, then we have found a cycle
        boolean ans = false;
        boolean[] visited = new boolean[v];
        Stack<Integer> st = new Stack<>(); // Stack for implementing DFS
        Set<Integer> pass = new HashSet<>(); // Set to store the elements in the current pass
        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                st.push(i);
                visited[i] = true;
                pass.add(i);
                while (st.size() > 0) {
                    int top = st.peek();
                    int count = 0;
                    for (Integer child : adj.get(top)) {
                        if (!visited[child]) {
                            st.push(child);
                            visited[child] = true;
                            pass.add(child);
                            count++;
                            break;
                        } else { // This means that the 'child' vertex was visited
                            if (pass.contains(child)) {
                                ans = true;
                                break;
                            }
                        }
                    }
                    if (count == 0) {
                        st.pop();
                        pass.remove(top);
                    }
                }
                if (ans) break;
                pass.clear();
            }
        }
        return ans;
    }

    public static void addEdge(List<List<Integer>> adj, int x, int y) {
        adj.get(x).add(y);
        adj.get(y).add(x);
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("/Users/development/Devwork/Java/IdeaProjects/JavaLearning/src/com/" +
                "company/recentlearnings/graph_input2.txt"));
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
        boolean hasCycle = isCycle(v, adj);
        if (hasCycle) {
            System.out.println("The given graph has a cycle");
        } else {
            System.out.println("The given graph does NOT have a cycle");
        }

        // The code for detecting cycle in a directed graph is running correctly on GFG practise area -
        // https://practice.geeksforgeeks.org/problems/detect-cycle-in-a-directed-graph/1
    }
}
