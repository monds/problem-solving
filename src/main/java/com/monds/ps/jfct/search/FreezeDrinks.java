package com.monds.ps.jfct.search;

public class FreezeDrinks {

    private int n;
    private int m;
    private int[][] graph;

    public int solution(int n, int m, int[][] graph) {
        this.n = n;
        this.m = m;
        this.graph = graph;

        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dfs(i, j)) {
                    result++;
                }
            }
        }

        return result;
    }

    private boolean dfs(int x, int y) {
        if (x >= n || x < 0 || y >= m || y < 0) return false;
        if (graph[x][y] == 0) {
            graph[x][y] = 1;
            dfs(x - 1, y);
            dfs(x + 1, y);
            dfs(x, y - 1);
            dfs(x, y + 1);
            return true;
        }
        return false;
    }
}
