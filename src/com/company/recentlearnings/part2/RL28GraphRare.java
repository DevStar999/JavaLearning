package com.company.recentlearnings.part2;

import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
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
    // Time -> O(V + E), Space -> O(V + E) [Since, we would need this much space for the auxiliary transpose graph]
    // Notes -> (1) A strongly connected component is a connected component in a graph, where from any one vertex
    //              in the connected component, we can traverse to any other vertex in that connected component
    //          (2) This algorithm is for Directed graphs. However, we can convert an Undirected graph to a directed
    //              graph, by replacing the undirected edges with 2 directed edges in both directions and then use this
    //              algorithm
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

    public static void main(String[] args) throws FileNotFoundException {
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
    }
}
