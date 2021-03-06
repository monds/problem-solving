package com.monds.ps.jfct.shortest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class DijkstraV2 {

    private static class Node implements Comparable<Node> {
        private final int index;
        private final int distance;

        public Node(int index, int distance) {
            this.index = index;
            this.distance = distance;
        }

        @Override
        public int compareTo(Node o) {
            if (o.distance == distance) return o.index > index ? 1 : -1;
            return o.distance < distance ? 1 : -1;
        }
    }

    private int n;
    private List<List<Node>> graph;
    private int[] distances;

    private DijkstraV2(int n, int m, int start, int[][] graph) {
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

        // 최단 거리 배열
        distances = new int[n + 1];
        Arrays.fill(distances, Integer.MAX_VALUE);
    }

    private void dijkstra(int start) {
        PriorityQueue<Node> queue = new PriorityQueue<>();

        // 시작 노드 초기화
        distances[start] = 0;
        queue.offer(new Node(start, 0));
        while (!queue.isEmpty()) {
            Node now = queue.poll();
            // 큐의 거리보다 작은 거리이면 패스한다.
            if (distances[now.index] < now.distance) continue;

            // 현재 노드와 연결된 다른 노드를 확인
            for (Node node : graph.get(now.index)) {
                int cost = distances[now.index] + node.distance;
                // 현재 노드를 거쳐서 다른 노드로 이동하는 거리가 더 짧으 경우
                if (cost < distances[node.index]) {
                    distances[node.index] = cost;
                    queue.offer(new Node(node.index, cost));
                }
            }
        }
    }

    private void printResult() {
        for (int i = 1; i < n + 1; i++) {
            System.out.println(distances[i] == Integer.MAX_VALUE ? "INFINITY" : distances[i]);
        }
    }

    public static void run(int n, int m, int start, int[][] graph) {
        new DijkstraV2(n, m, start, graph);
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

        DijkstraV2.run(n, m, start, graph);
    }
}
