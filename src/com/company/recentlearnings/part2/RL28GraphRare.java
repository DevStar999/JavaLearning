package com.company.recentlearnings.part2;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

@SuppressWarnings("DuplicatedCode")
public class RL28GraphRare {

    public static List<Integer> topologicalSorting(List<List<Integer>> adj, int v) {
        boolean[] visited = new boolean[v];
        Stack<Integer> st = new Stack<>();
        Stack<Integer> ans = new Stack<>();

        for (int i=0; i<v; i++) {
            if (!visited[i]) {
                visited[i] = true;
                st.add(i);
                while (st.size() > 0) {
                    int node = st.peek();
                    int count = 0;
                    for (Integer ngb: adj.get(node)) {
                        if (!visited[ngb]) {
                            visited[ngb] = true;
                            st.add(ngb);
                            count++;
                            break;
                        }
                    }
                    if (count == 0) {
                        ans.add(st.pop());
                    }
                }
            }
        }

        List<Integer> fans = new ArrayList<>();
        while (ans.size() > 0) {
            fans.add(ans.pop());
        }
        return fans;
    }

    // (1) Kosaraju's Algorithm for finding the Strongly Connected Components (SCCs)
    // Resource -> https://www.youtube.com/watch?v=ndfjV_yHpgQ
    // Time -> O(V + E), Space -> O(V + E) [Since, we would need this much space for the auxiliary transpose graph]
    // Notes -> (1) A strongly connected component is a connected component in a graph, where from any one vertex
    //              in the connected component, we can traverse to any other vertex in that connected component
    //          (2) This algorithm is for Directed graphs. However, we can convert an Undirected graph to a directed
    //              graph, by replacing the undirected edges with 2 directed edges in both directions and then use this
    //              algorithm. But, if we are asked a plain and simple question, "Is Kosaraju's algorithm used for
    //              Directed graphs only?", then we answer YES
    //          (3) The intuition behind why this works is as follows -
    //              [Resource - https://www.youtube.com/watch?v=R6uoSjZ2imo (3:40 to 9:00)]
    //              So, if we sort all the nodes based on their finishing time (finishing time of traversal, this is
    //              basically Topological Sorting), we can traverse the entire graph from any node in the 1st SCC, but
    //              not from any other SCC. But, now if we take the transpose of the graph and start traversal from the
    //              1st SCC, then we will not be able to enter any other SCC, so that's why we do the TopoSort, then
    //              take the transpose of the graph and then do DFS and mark out the SCCs
    public static List<List<Integer>> kosarajuSCC(int v, List<List<Integer>> adj) {
        // Step 1 - Get the Topological Ordering
        List<Integer> topoOrder = topologicalSorting(adj, v);

        // Step 2 - Get the transpose of the given graph
        List<List<Integer>> transpose = new ArrayList<>();
        for (int i=0; i<v; i++) transpose.add(new ArrayList<>());
        for (int i=0; i<v; i++) {
            int x = i;
            for (int j=0; j<adj.get(i).size(); j++) {
                int y = adj.get(i).get(j);
                transpose.get(y).add(x);
            }
        }

        // Step 3 - Find the SCCs (Simply putting the vertices in one connected component as 1 SCC)
        boolean[] visited = new boolean[v];
        Stack<Integer> st = new Stack<Integer>();
        List<List<Integer>> ans = new ArrayList<>();
        for (int i=0; i<topoOrder.size(); i++) {
            if (!visited[topoOrder.get(i)]) {
                ArrayList<Integer> scc = new ArrayList<>();
                visited[topoOrder.get(i)] = true;
                st.add(topoOrder.get(i));
                while (st.size() > 0) {
                    int node = st.peek();
                    int count = 0;
                    for (Integer nb: transpose.get(node)) {
                        if (!visited[nb]) {
                            visited[nb] = true;
                            st.add(nb);
                            count++;
                            break;
                        }
                    }
                    if (count == 0) {
                        scc.add(st.pop());
                    }
                }
                ans.add(scc);
            }
        }


        // Step 4 - Format the answer (Sorting the vertices in an SCC and the the SCCs too)
        for (int i=0; i<ans.size(); i++) {
            Collections.sort(ans.get(i));
        }
        Collections.sort(ans, new Comparator<List<Integer>>() {
            public int compare(List<Integer> arr1, List<Integer> arr2) {
                return Integer.compare(arr1.get(0), arr2.get(0));
            }
        });
        return ans;
    }

    public static void tarjanDFSBridges(int node, int parent, List<List<Integer>> adj, int[] disc, int[] low,
                                        boolean[] visited, int timer, List<List<Integer>> bridges) {
        visited[node] = true;
        disc[node] = low[node] = timer;
        timer++;

        for (Integer neighbour: adj.get(node)) {
            if (!visited[neighbour]) {
                tarjanDFSBridges(neighbour, node, adj, disc, low, visited, timer, bridges);
                // We do the following update, because the neighbour's low value may have been updated due to a
                // Back-Edge and thus we can potentially update the low value of the 'node' as well, as there may be
                // another path to reach 'node' which would allow us to update the low value of 'node' to a lower value
                low[node] = Math.min(low[node], low[neighbour]);

                // Checking if edge is bridge with the following condition
                if (low[neighbour] > disc[node]) {
                    // Why the above condition works ->
                    // (a) Case 1 (Interested) -> When condition is TRUE, this means that the only way of reaching to
                    // 'neighbour' is via 'node', thus, the low[neighbour] > disc[node]
                    // (b) Case 2 (Ignore) -> When condition is FALSE, this means the low[neighbour] was updated to a
                    // lower value via a Back-Edge and thus there was a different way to reach neighbour available as well
                    bridges.add(new ArrayList<>(Arrays.asList(node, neighbour)));
                }
            } else {
                // The neighbour is visited
                if (neighbour != parent) { // The neighbour is visited and also not a parent, then it is a Back-Edge
                    // This basically means that we had another path to reach 'node', taking which we could reach 'node'
                    // in a lesser time. So, we update low[node]
                    low[node] = Math.min(low[node], disc[neighbour]);
                }
            }
        }
    }

    // (2) Tarjan's Algorithm for finding the bridges in an undirected graph
    // Resource -> https://www.youtube.com/watch?v=ndfjV_yHpgQ
    // Time -> O(V + E), Space -> O(V)
    // Notes -> (1) Bridge (Def.) - Bridge is an edge in an undirected graph, on the removal of which, the number of
    //              connected components in a graph increases
    //          (2) Back Edge (Def.) - For a node, when it has a visited neighbour and that neighbour is not the parent
    //              of the node, then the edge between the node and the neighbour is called a Back Edge
    //          (3) Rest of the helpful notes are written in the code itself
    public static List<List<Integer>> findBridges(int v, List<List<Integer>> adj) {
        int[] disc = new int[v]; // An array to store the discovery time of a node
        Arrays.fill(disc, -1);
        int[] low = new int[v]; // Lowest time reachable from a node
        Arrays.fill(low, -1);
        boolean[] visited = new boolean[v];
        int timer = 0; // Use, this variable to keep track of the current time and update disc and low times
        List<List<Integer>> bridges = new ArrayList<>();

        for (int i=0; i<v; i++) {
            if (!visited[i]) {
                tarjanDFSBridges(i, -1, adj, disc, low, visited, timer, bridges);
            }
        }

        return bridges;
    }

    public static void tarjanDFSArticulationPoints(int node, int parent, List<List<Integer>> adj, int[] disc, int[] low,
                                                   boolean[] visited, int timer, Set<Integer> articulationPoints) {
        visited[node] = true;
        disc[node] = low[node] = timer;
        timer++;

        int children = 0;
        for (Integer neighbour: adj.get(node)) {
            if (!visited[neighbour]) {
                tarjanDFSArticulationPoints(neighbour, node, adj, disc, low, visited, timer, articulationPoints);
                // We do the following update, because the neighbour's low value may have been updated due to a
                // Back-Edge and thus we can potentially update the low value of the 'node' as well, as there may be
                // another path to reach 'node' which would allow us to update the low value of 'node' to a lower value
                low[node] = Math.min(low[node], low[neighbour]);
                // Since, we are interested in counting the number of children for the current node, we use an integer
                // 'children' for that, and increment it as follows
                children++;

                // Checking if 'node' is an Articulation Point with the following condition
                if (parent != -1 && low[neighbour] >= disc[node]) {
                    articulationPoints.add(node);
                }
            } else {
                // The neighbour is visited
                if (neighbour != parent) { // The neighbour is visited and also not a parent, then it is a Back-Edge
                    // This basically means that we had another path to reach 'node', taking which we could reach 'node'
                    // in a lesser time. So, we update low[node]
                    low[node] = Math.min(low[node], disc[neighbour]);
                }
            }
        }

        // When, children are more than 1, then if we remove this 'node', then the number of connected components will
        // increase and thus 'node' is an Articulation Point
        if (parent == -1 && children > 1) {
            articulationPoints.add(node);
        }
    }

    // (3) Tarjan's Algorithm to find the Articulation Points in an undirected graph
    // Time -> O(V + E), Space -> O(V)
    // Notes -> (1) Articulation Points (Def.) - Vertices in an undirected graph, on removal of which, the no. of
    //              connected components increases
    //          (2) Rest of the helpful notes are written in the code itself
    public static List<Integer> findArticulationPoints(int v, List<List<Integer>> adj) {
        int[] disc = new int[v]; // An array to store the discovery time of a node
        Arrays.fill(disc, -1);
        int[] low = new int[v]; // Lowest time reachable from a node
        Arrays.fill(low, -1);
        boolean[] visited = new boolean[v];
        int timer = 0; // Use, this variable to keep track of the current time and update disc and low times
        Set<Integer> articulationPoints = new HashSet<>(); // Using a set to avoid repetition of nodes

        for (int i=0; i<v; i++) {
            if (!visited[i]) {
                tarjanDFSArticulationPoints(i, -1, adj, disc, low, visited, timer, articulationPoints);
            }
        }

        return new ArrayList<>(articulationPoints);
    }

    // (4) Hypothetical Question -> Find the Bridges in a Directed Graph
    // Approach -> (1) Remember, the standard question is to find the bridges in an undirected graph using the Tarjan's
    //             algorithm as above
    //             (2) First share the definition of a bridge, i.e. an edge in a graph, on removal of which the no. of
    //             connected components in a graph increases
    //             (3) In a graph, there are 2 types of connected components ->
    //             (a) Weakly Connected Components (WCCs) (Often referred as just 'Connected Components' if mentioned
    //             for a directed graph) - (def.) is a subgraph of a directed graph in which al the vertices are
    //             connected by some path, regardless of the edge direction.
    //             (b) Strongly Connected Components (SCCs) - (def.) is a subgraph of a directed graph in which each
    //             node can be reachable from every other node in the subgraph or that connected component.
    //             (4) If after removing a bridge, we have to keep
    //             (i) WCCs -> Then convert the directed graph into it's corresponding undirected graph and find the
    //             bridges in the undirected graph (Standard question, use Tarjan's algo for this)
    //             (ii) SCCs -> This is a different question altogether, and more like a research level question.
    //             The solution approach here could be as follows (Brute Force) ->
    //             (a) Traverse over all the edges in the graph
    //             (b) Check if the removal of this edges increases the SCCs in the graph

    public static void main(String[] args) throws FileNotFoundException {
        // (1) Example for Kosaraju's Algorithm is as follows -
        int vertices = 5;
        List<List<Integer>> adj = new ArrayList<>() {{
            add(new ArrayList<>(Arrays.asList(2, 3)));
            add(new ArrayList<>(Arrays.asList(0)));
            add(new ArrayList<>(Arrays.asList(1)));
            add(new ArrayList<>(Arrays.asList(4)));
            add(new ArrayList<>(Arrays.asList()));
        }};

        List<List<Integer>> stronglyConnectedComponents = kosarajuSCC(vertices, adj);
        System.out.println("The SCCs are as follows -> ");
        for (List<Integer> element: stronglyConnectedComponents) {
            System.out.println(element);
        }

        // (2) The code for Tarjan's Algorithm to find the Bridges in an undirected graph is running correctly
        // on LeetCode - https://leetcode.com/problems/critical-connections-in-a-network/description/

        // (3) The code for Tarjan's Algorithm to find the Articulation Points in an undirected graph is running
        // correctly on GFG - https://practice.geeksforgeeks.org/problems/articulation-point-1/1
    }
}
