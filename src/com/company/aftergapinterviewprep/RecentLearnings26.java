package com.company.aftergapinterviewprep;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

@SuppressWarnings("DuplicatedCode")
public class RecentLearnings26 {
    /* Graphs - Basics, Part 2 */

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

    public static void addEdge(List<List<Integer>> adj, int x, int y) {
        adj.get(x).add(y);
        adj.get(y).add(x);
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("/Users/development/Devwork/Java/IdeaProjects/JavaLearning/src/com/" +
                "company/aftergapinterviewprep/graph_input2.txt"));
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
    }
}
