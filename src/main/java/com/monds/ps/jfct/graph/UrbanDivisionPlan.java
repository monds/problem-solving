package com.monds.ps.jfct.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class UrbanDivisionPlan {
    
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

        int max = 0;
        int sum = 0;
        for (Node node : nodes) {
            // 사이클 방지
            if (findParent(parent, node.from) != findParent(parent, node.to)) {
                unionParent(parent, node.from, node.to);
                max = Math.max(max, node.cost);
                sum += node.cost;
            }
        }

        return sum - max;
    }

    public static void main(String[] args) {
        int[][] input = {
            {1, 2, 3},
            {1, 3, 2},
            {3, 2, 1},
            {2, 5, 2},
            {3, 4, 4},
            {7, 3, 6},
            {5, 1, 5},
            {1, 6, 2},
            {6, 4, 1},
            {6, 5, 3},
            {4, 5, 3},
            {6, 7, 4}
        };

        System.out.println(solution(7, input));
    }
}
