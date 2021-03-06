package com.monds.ps.jfct.shortest;

public class FutureCity {
    public static final int INF = (int) 1e9;

    public static int solution(int n, int m, int x, int k, int[][] map) {
        int[][] graph = new int[n + 1][n + 1];

        // 모든 값 초기화
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                graph[i][j] = i == j ? 0 : INF;
            }
        }

        // 간선 정보를 주어진 값으로 우선 초기화
        for (int[] ints : map) {
            graph[ints[0]][ints[1]] = 1;
            graph[ints[1]][ints[0]] = 1;
        }

        // 플로이드 워셜 수행
        for (int i = 1; i < n + 1; i++) {
            for (int a = 1; a < n + 1; a++) {
                for (int b = 1; b < n + 1; b++) {
                    graph[a][b] = Math.min(graph[a][b], graph[a][i] + graph[i][b]);
                }
            }
        }

        int result = graph[1][k] + graph[k][x];

        return result >= INF ? -1 : result;
    }
}
