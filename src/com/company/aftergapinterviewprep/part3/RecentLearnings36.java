package com.company.aftergapinterviewprep;

import java.io.FileNotFoundException;

class DisjointSetBasic {
    int[] rep;

    DisjointSetBasic(int n) {
        rep = new int[n];
        for (int i=0; i<n; i++) {
            rep[i] = i;
        }
    }

    public int find(int x) {
        if (rep[x] == x) return x;
        return find(rep[x]);
    }

    public void union(int x, int y) {
        int xRep = find(x);
        int yRep = find(y);
        if (xRep == yRep) return;
        rep[yRep] = xRep;
    }

    public boolean inSameSet(int x, int y) {
        return (find(x) == find(y));
    }
}

@SuppressWarnings("DuplicatedCode")
public class RecentLearnings36 {
    /* Disjoint Set - Basic Implementation */

    public static void main(String[] args) throws FileNotFoundException {
        int n = 8;
        DisjointSetBasic dsu = new DisjointSetBasic(n);

        dsu.union(0, 1);
        dsu.union(2, 7);
        dsu.union(3, 6);
        System.out.println("Are 0 ans 2 in the same set = " + dsu.inSameSet(0, 2));
        dsu.union(0, 7);
        System.out.println("Are 0 ans 2 in the same set = " + dsu.inSameSet(0, 2));
    }
}
