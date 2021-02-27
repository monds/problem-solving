package com.monds.ps.jfct.search;

public class EscapeMaze {
    private int n;
    private int m;
    private int[][] graph;
    private int min = Integer.MAX_VALUE;

    public int solution(int n, int m, int[][] graph) {
        this.n = n;
        this.m = m;
        this.graph = graph;

        bfs(0, 0, 1);

        return min;
    }

    public void bfs(int x, int y, int move) {
        if (x >= n || x < 0 || y >= m || y < 0) return;
        if (x == n - 1 && y == m - 1) {
            min = Math.min(move, min);
        } else if (graph[x][y] == 1) {
            graph[x][y] = 2;
            bfs(x - 1, y, move + 1);
            bfs(x + 1, y, move + 1);
            bfs(x, y + 1, move + 1);
            bfs(x, y - 1, move + 1);
        }
    }

}
