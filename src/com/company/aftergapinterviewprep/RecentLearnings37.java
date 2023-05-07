package com.company.aftergapinterviewprep;

import java.io.FileNotFoundException;

class DisjointSet {
    int[] rep;
    int[] rank;

    DisjointSet(int n) {
        rep = new int[n];
        rank = new int[n];
        for (int i=0; i<n; i++) {
            rep[i] = i;
            rank[i] = 0;
        }
    }

    // Path Compression optimisation has been applied here
    public int find(int x) {
        if (rep[x] == x) return x;
        rep[x] = find(rep[x]);
        return rep[x];
    }

    // Union by Rank optimisation has been applied here
    public void union(int x, int y) {
        int xRep = find(x);
        int yRep = find(y);

        if (xRep == yRep) return;

        int xRank = rank[xRep], yRank = rank[yRep];
        if (xRank > yRank) {
            rep[yRep] = xRep;
        } else if (xRank < yRank) {
            rep[xRep] = yRep;
        } else {
            rep[yRep] = xRep;
            rank[xRep]++;
        }
    }

    public boolean inSameSet(int x, int y) {
        return (find(x) == find(y));
    }
}

@SuppressWarnings("DuplicatedCode")
public class RecentLearnings37 {
    /* Disjoint Set - Optimised Implementation Union by Rank and Path Compression */
    // (a) Union by Rank & (b) Path Compression are 2 optimisations for the Disjoint Set Data Structure

    public static void main(String[] args) throws FileNotFoundException {
        int n = 8;
        DisjointSet dsu = new DisjointSet(n);

        dsu.union(0, 1);
        dsu.union(2, 7);
        dsu.union(3, 6);
        System.out.println("Are 0 ans 2 in the same set = " + dsu.inSameSet(0, 2));
        dsu.union(0, 7);
        System.out.println("Are 0 ans 2 in the same set = " + dsu.inSameSet(0, 2));
    }
}
