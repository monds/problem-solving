package com.monds.ps.jfct.shortest;

public class FloydWarshall {

    public static final int INF = (int) 1e9;

    public static void floydWarshall(int n, int[][] map) {
        // 2차원 배열 생성
        int[][] graph = new int[n + 1][n + 1];

        // 모든 값 초기화
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                graph[i][j] = i == j ? 0 : INF;
            }
        }

        // 간선 정보를 주어진 값으로 우선 초기화
        for (int[] ints : map) {
            graph[ints[0]][ints[1]] = ints[2];
        }

        // 플로이드 워셜 수행
        for (int k = 1; k < n + 1; k++) {
            for (int a = 1; a < n + 1; a++) {
                for (int b = 1; b < n + 1; b++) {
                    graph[a][b] = Math.min(graph[a][b], graph[a][k] + graph[k][b]);
                }
            }
        }

        // 수행된 결과를 출력
        for (int a = 1; a < n + 1; a++) {
            for (int b = 1; b < n + 1; b++) {
                System.out.print(graph[a][b] == INF ? "INFINITY " : graph[a][b] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int[][] map = {
            {1, 2, 4},
            {1, 4, 6},
            {2, 1, 3},
            {2, 3, 7},
            {3, 1, 5},
            {3, 4, 4},
            {4, 3, 2}
        };

        floydWarshall(4, map);
    }
}
