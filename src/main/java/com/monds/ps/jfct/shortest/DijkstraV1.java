package com.monds.ps.jfct.shortest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DijkstraV1 {

    private static class Node {
        private final int index;
        private final int distance;

        public Node(int index, int distance) {
            this.index = index;
            this.distance = distance;
        }
    }

    private int n;
    private List<List<Node>> graph;
    private boolean[] visited;
    private int[] distances;

    private DijkstraV1(int n, int m, int start, int[][] graph) {
        init(n, m, graph);
        dijkstra(start);
        printResult();
    }

    private void init(int n, int m, int[][] graph) {
        this.n = n;

        this.graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            this.graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            this.graph.get(graph[i][0]).add(new Node(graph[i][1], graph[i][2]));
        }

        // 방문 체크 배열
        visited = new boolean[n + 1];

        // 최단 거리 배열
        distances = new int[n + 1];
        Arrays.fill(distances, Integer.MAX_VALUE);
    }

    private void dijkstra(int start) {
        // 시작 노드 초기화
        distances[start] = 0;
        visited[start] = true;
        for (Node node : graph.get(start)) {
            distances[node.index] = node.distance;
        }
        // 시작 노드를 제외한 나머지 노드에 대해 반복
        for (int i = 0; i < n - 1; i++) {
            int now = getSmallestNode();
            visited[now] = true;
            // 현재 노드와 연결된 다른 노드를 확인
            for (Node node : graph.get(now)) {
                int cost = distances[now] + node.distance;
                // 현재 노드를 거쳐서 다른 노드로 이동하는 거리가 더 짧으 경우
                if (cost < distances[node.index]) distances[node.index] = cost;
            }
        }
    }

    // 방문하지 않은 노드 중에서, 가장 최단 거리가 짧은 노드 번호 반환
    private int getSmallestNode() {
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 1; i < n + 1; i++) {
            if (min > distances[i] && !visited[i]) {
                min = distances[i];
                index = i;
            }
        }
        return index;
    }

    private void printResult() {
        for (int i = 1; i < n + 1; i++) {
            System.out.println(distances[i] == Integer.MAX_VALUE ? "INFINITY" : distances[i]);
        }
    }

    public static void run(int n, int m, int start, int[][] graph) {
        new DijkstraV1(n, m, start, graph);
    }

    public static void main(String[] args) {
        int n = 6;
        int m = 11;
        int start = 1;
        int[][] graph = {
            {1, 2, 2},
            {1, 3, 5},
            {1, 4, 1},
            {2, 3, 3},
            {2, 4, 2},
            {3, 2, 3},
            {3, 6, 5},
            {4, 3, 3},
            {4, 5, 1},
            {5, 3, 1},
            {5, 6, 2},
        };

        DijkstraV1.run(n, m, start, graph);
    }
}
