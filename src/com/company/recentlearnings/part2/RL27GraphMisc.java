package com.company.recentlearnings.part2;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
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

public class RL27GraphMisc {
    /* Graphs - Miscellaneous Topics */
    // Resources -> (1) https://www.youtube.com/watch?v=Zbbe9FYVnM4&list=PLUcsbZa0qzu1EhwPcQfbDfl9VitpSUgBp&index=7
    // (2) https://www.youtube.com/watch?v=kXiqvMykeJA&list=PLUcsbZa0qzu1EhwPcQfbDfl9VitpSUgBp&index=9
    // (3) https://www.youtube.com/watch?v=PzznKcMyu0Y, https://www.geeksforgeeks.org/prims-algorithm-using-priority_queue-stl/
    // (4) https://www.youtube.com/watch?v=wjxCG6dOwcY&list=PLUcsbZa0qzu1EhwPcQfbDfl9VitpSUgBp&index=9

    // (1.a) Topological Sorting (Iterative) -> Time = O(V + E), Auxiliary Space = O(V)
    //                              [Here, V = no. of vertices, E = no. of edges]
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

    // (1.a) Topological Sorting (Recursive) -> Time = O(V + E), Auxiliary Space = O(V)
    //                                          [Here, V = no. of vertices, E = no. of edges]
    // The following 2 methods are to implement Topological Sorting in a recursive manner
    private static void topologicalSortingRecursive(int node, ArrayList<ArrayList<Integer>> adj,
                                                   boolean[] visited, Stack<Integer> ans) {
        visited[node] = true;

        for (Integer neighbour: adj.get(node)) {
            if (!visited[neighbour]) {
                topologicalSortingRecursive(neighbour, adj, visited, ans);
            }
        }

        ans.add(node);
    }

    public static List<Integer> topologicalSortingMain(int v, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[v];
        Stack<Integer> ans = new Stack<>();
        for (int i=0; i<v; i++) {
            if (!visited[i]) {
                topologicalSortingRecursive(i, adj, visited, ans);
            }
        }
        List<Integer> fans = new ArrayList<>();
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

    // (3) Dijkstra's Algorithm for Shortest Paths from Single Source to all other vertices
    // [Important Note -> -ve weight edges are NOT allowed i.e. the algorithm will NOT work correctly for -ve edges]
    // (i) Complexities for Algo - Using Heap or Binary Search Tree, Theory
    //     Time -> O(E * log(V)), Space -> O(V + E), Auxiliary Space -> O(V)
    // (ii) Complexities for Algo - Using Priority Queue, Actual Implementation
    //     Time -> O(E * log(V)), Space -> O(V + E), Auxiliary Space -> O(V + E)
    //     (Here, the Priority Queue can have at most E elements in it)
    // For Time, log(E) is same as log(V), since E <= V*V
    // Notes -> (i) This algo can handle non-negative weights only, it will produce incorrect results for negative
    //          weights
    //          (ii) It can handle graphs consisting of cycles but not negative weights
    //          (iii) It is good for shortest paths from a single source only
    //          (iv) The above points are true for both undirected and directed graphs
    //          (v) It is a Greedy Algorithm
    static int[] dijkstra(int V, List<List<List<Integer>>> adj, int src) {
        boolean[] visited = new boolean[V];
        int[] dist = new int[V]; // Output array carrying shortest distances from the given source
        int INF = 100000000;
        Arrays.fill(dist, INF);
        dist[src] = 0;
        Queue<Edge> pq = new PriorityQueue<> (new Comparator<Edge>() { // Min heap with min. wt as priority
            public int compare(Edge e1, Edge e2) {
                return Integer.compare(e1.wt, e2.wt);
            }
        });

        pq.add(new Edge(src, 0)); // Adding the source node with 0 distance to start the process
        while (pq.size() > 0) {
            Edge top = pq.poll();
            int u = top.node;
            if (visited[u]) {
                continue;
            }

            visited[u] = true;
            List<List<Integer>> neighbors = adj.get(u);
            for (List<Integer> neighbor: neighbors) {
                int v = neighbor.get(0);
                int wt = neighbor.get(1);
                if (!visited[v] && dist[v] > dist[u] + wt) {
                    dist[v] = dist[u] + wt;
                    pq.add(new Edge(v, dist[v]));
                }
            }
        }

        return dist;
    }

    // (4) Bellman Ford's Algorithm for Shortest Paths from Single Source to all other vertices
    // Time -> O(V * E), Space -> O(V + E) [Space is for the given edges in the graph and storing the distance array]
    // Notes -> (1) For Undirected Graphs -
    //              (a) It CANNOT handle -ve weight edges for Undirected Graphs
    //              (b) It CANNOT handle -ve weight cycles for Undirected Graphs
    //          (2) For Directed Graphs -
    //              (a) It CAN handle -ve weight edges for Directed Graphs
    //              (b) It CANNOT handle -ve weight cycles for Directed Graphs
    //          (3) It can help us to report the existence of a negative weight cycle
    //          (4) This algorithm is ideally meant for Directed Graphs. If we want this to work with Undirected Graphs,
    //              we first have to convert it to a Directed Graph and then use it. Thus, having a -ve weight edge in an
    //              undirected graph will lead to a negative cycle after converting it to directed graph. Thus, the
    //              algorithm does not work for negative weight edges for an undirected graph
    //          (5) It is based on a Dynamic Programming Approach
    static void bellmanFord(int v, List<List<Integer>> edges, int source) {
        boolean negCycle = false;
        int[] dist = new int[v]; // Output array carrying shortest distances from the given source
        int INF = 100000000;
        Arrays.fill(dist, INF);
        dist[source] = 0;

        // Computing the shortest path as follows
        for (int count=1; count<v; count++) { // Running the outer loop v-1 times, as the algorithm ensure to give answer
            // if we run the loop v-1 times and update the shortest distances
            for (int i=0; i<edges.size(); i++) {
                int src = edges.get(i).get(0);
                int dest = edges.get(i).get(1);
                int wt = edges.get(i).get(2);
                if (dist[src] + wt < dist[dest]) {
                    dist[dest] = dist[src] + wt;
                }
            }
        }

        // Checking if the graph contains negative weight cycle
        for (int i=0; i<edges.size(); i++) {
            int src = edges.get(i).get(0);
            int dest = edges.get(i).get(1);
            int wt = edges.get(i).get(2);
            if (dist[src] + wt < dist[dest]) {
                negCycle = true;
                break;
            }
        }

        if (negCycle) {
            System.out.println("The given graph contains negative weight cycle");
        } else {
            System.out.println("For the given graph, the shortest distances are as follows - ");
            for (int i=0; i<dist.length; i++) {
                System.out.println("source = " + source + ", vertex = " + i + ", dist = " + dist[i]);
            }
        }
    }

    // (5) Floyd Warshall's Algorithm for All-Pairs Shortest Paths
    // Time -> O(V ^ 3), Space -> O(V ^ 2) [Space is for storing the distances of every vertex to every other vertex]
    // Notes -> (1) (Same as Bellman Ford) For Undirected Graphs -
    //              (a) It CANNOT handle -ve weight edges for Undirected Graphs
    //              (b) It CANNOT handle -ve weight cycles for Undirected Graphs
    //          (2)  (Same as Bellman Ford) For Directed Graphs -
    //              (a) It CAN handle -ve weight edges for Directed Graphs
    //              (b) It CANNOT handle -ve weight cycles for Undirected Graphs
    //          (3) It does NOT help us to report the existence of a negative weight cycle. So, for this we can use
    //              the Bellman Ford Algorithm to detect the existence of a negative weight cycle.
    //          (4) (Same as Bellman Ford) This algorithm is ideally meant for Directed Graphs. If we want this to work
    //              with Undirected Graphs, we first have to convert it to a Directed Graph and then use it. Thus,
    //              having a -ve weight edge in an undirected graph will lead to a negative cycle after converting it to
    //              directed graph. Thus, the algorithm does not work for negative weight edges for an undirected graph
    //          (5) (Same as Bellman Ford) It is based on a Dynamic Programming Approach
    public void FloydWarshall(int[][] edgeWeights) {
        // A weighted directed graph is given of as a 2D matrix of size V * V, where V = no. of vertices in the graph
        // and each element at (i, j) in the matrix denotes the weight from 'i' to 'j'
        int v = edgeWeights.length; // The number of vertices in the graph
        int INF = 100000000;
        int[][] dist = new int[v][v]; // The output array having shortest distances from each vertex to every other vertex

        for (int i=0; i<v; i++) {
            for (int j=0; j<v; j++) {
                if (edgeWeights[i][j] == -1) { // If edge weight is '-1' it means that there is no edge from 'i' to 'j'
                    dist[i][j] = INF;
                } else {
                    dist[i][j] = edgeWeights[i][j];
                }
            }
        }

        for (int i=0; i<v; i++) dist[i][i] = 0; // Distance of vertex to itself is zero

        // The main code of the algorithm is as follows
        for (int k=0; k<v; k++) {
            for (int i=0; i<v; i++) {
                for (int j=0; j<v; j++) {
                    if (dist[i][j] > dist[i][k] + dist[k][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        // (1) The code for Topological Sorting using iterative DFS is running correctly on GFG practise area -
        // https://practice.geeksforgeeks.org/problems/topological-sort/1

        // (2) The code for Prim's Algorithm for MST is running correctly on GFG practise area -
        // https://practice.geeksforgeeks.org/problems/minimum-spanning-tree/1

        // (3) The code for Dijkstra's Algorithm for Shortest Paths is running correctly on GFG practise area -
        // https://practice.geeksforgeeks.org/problems/implementing-dijkstra-set-1-adjacency-matrix/1

        // (4) Example for Bellman Ford Algorithm
        int source = 0, vertices = 2;
        List<List<Integer>> edges = new ArrayList<>();
        edges.add(new ArrayList<>(Arrays.asList(0, 1, 9))); // 0 -> Source Vertex, 1 -> Destination Vertex, 9 -> Edge Weight
        bellmanFord(vertices, edges, source);

        // (5) The code for Floyd Warshall Algorithm for All Pairs Shortest Paths is running correctly on GFG practise area -
        // https://practice.geeksforgeeks.org/problems/implementing-floyd-warshall2042/1
    }
}
