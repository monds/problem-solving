package com.monds.ps.jfct.search;

public class Dfs {
    public static void dfs(int[][] graph, int v, boolean[] visited) {
        // 현재 노드를 방문 처리
        visited[v] = true;
        System.out.print(v + " ");
        // 현재 노드와 연결되어 있는 다른 노드를 재귀적으로 방문
        for (int i : graph[v]) {
            if (!visited[i]) dfs(graph, i, visited);
        }
    }

    public static void main(String[] args) {
        int[][] graph = {
            {},
            {2, 3, 8},
            {1, 7},
            {1, 4, 5},
            {3, 5},
            {3, 4},
            {7},
            {2, 6, 8},
            {1, 7}
        };

        boolean[] visited = new boolean[9];

        dfs(graph, 1, visited);
    }
}
