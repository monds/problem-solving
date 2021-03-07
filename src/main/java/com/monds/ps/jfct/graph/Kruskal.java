package com.monds.ps.jfct.graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Kruskal {

    private static class Node {
        private final int from;
        private final int to;
        private final int cost;

        public Node(int from, int to, int cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }
    }

    private static int findParent(int[] parent, int x) {
        if (parent[x] != x) {
            parent[x] = findParent(parent, parent[x]);
        }
        return parent[x];
    }

    private static void unionParent(int[] parent, int from, int to) {
        from = findParent(parent, from);
        to = findParent(parent, to);
        if (from < to) parent[to] = from;
        else parent[from] = to;
    }

    public static int solution(int v, int[][] edges) {
        // 부모 테이블 초기화
        int[] parent = new int[v + 1];
        for (int i = 1; i < v + 1; i++) {
            parent[i] = i;
        }

        // 노드 리스트 생성
        List<Node> nodes = new ArrayList<>();
        for (int[] edge : edges) {
            nodes.add(new Node(edge[0], edge[1], edge[2]));
        }

        // 간선(엣지) 비용 순으로 정렬
        nodes.sort(Comparator.comparingInt(o -> o.cost));

        int result = 0;
        for (Node node : nodes) {
            // 사이클 방지
            if (findParent(parent, node.from) != findParent(parent, node.to)) {
                unionParent(parent, node.from, node.to);
                result += node.cost;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] edges = {
            {1, 2, 29},
            {1, 5, 75},
            {2, 3, 35},
            {2, 6, 34},
            {3, 4, 7},
            {4, 6, 23},
            {4, 7, 13},
            {5, 6, 53},
            {6, 7, 25}
        };

        System.out.println(Kruskal.solution(7, edges));
    }
}
